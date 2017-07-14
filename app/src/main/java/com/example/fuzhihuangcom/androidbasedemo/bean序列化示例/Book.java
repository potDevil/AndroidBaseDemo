package com.example.fuzhihuangcom.androidbasedemo.bean序列化示例;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fuzhihuang on 2017/7/14.
 */

public class Book implements Parcelable {
    private int price;
    private int count;

    protected Book(Parcel in) {
        price = in.readInt();
        count = in.readInt();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(price);
        dest.writeInt(count);
    }
}
