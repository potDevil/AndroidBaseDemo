package com.example.fuzhihuangcom.androidbasedemo.bean序列化示例;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fuzhihuang on 2017/7/14.
 * Parcelable序列化接口
 */

public class User2 implements Parcelable {
    public int userId;
    public String userName;
    public boolean isMale;

    public Book mBook;

    public User2(int userId, String userName, boolean isMale) {
        this.userId = userId;
        this.userName = userName;
        this.isMale = isMale;
    }

    private User2(Parcel in) {
        userId = in.readInt();
        userName = in.readString();
        isMale = in.readInt() == 1;
        mBook = in.readParcelable(Thread.currentThread().getContextClassLoader());
    }

    public static final Creator<User2> CREATOR = new Creator<User2>() {
        @Override
        public User2 createFromParcel(Parcel in) {
            return new User2(in);
        }

        @Override
        public User2[] newArray(int size) {
            return new User2[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(userId);
        out.writeString(userName);
        out.writeInt(isMale ? 1: 0);
        out.writeParcelable(mBook, 0);
    }
}
