package com.example.rona.kumatraining7;

import android.os.Parcelable;
import android.os.Parcel;

public class  Bear implements Parcelable {
    private String name;
    private String alamat;
    private String pesanan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPesanan() {
        return pesanan;
    }

    public void setPesanan(String pesanan) {
        this.pesanan = pesanan;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.alamat);
        dest.writeString(this.pesanan);
    }

    public Bear() {
    }

    protected Bear(Parcel in) {
        this.name = in.readString();
        this.alamat = in.readString();
        this.pesanan = in.readString();
    }

    public static final Parcelable.Creator<Bear> CREATOR = new Parcelable.Creator<Bear>() {
        @Override
        public Bear createFromParcel(Parcel source) {
            return new Bear(source);
        }

        @Override
        public Bear[] newArray(int size) {
            return new Bear[size];
        }
    };
}
