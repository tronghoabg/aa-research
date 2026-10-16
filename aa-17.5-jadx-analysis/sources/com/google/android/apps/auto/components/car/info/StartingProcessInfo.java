package com.google.android.apps.auto.components.car.info;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarInfo;
import defpackage.khy;

/* loaded from: classes.dex */
public class StartingProcessInfo implements Parcelable {
    public static final Parcelable.Creator<StartingProcessInfo> CREATOR = new khy(2);
    public final IBinder a;
    public final CarInfo b;
    public final String c;
    public final String d;
    public final String e;

    public StartingProcessInfo(Parcel parcel) {
        this.a = parcel.readStrongBinder();
        this.b = (CarInfo) parcel.readParcelable(CarInfo.class.getClassLoader());
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public StartingProcessInfo(IBinder iBinder, CarInfo carInfo, String str, String str2, String str3) {
        this.a = iBinder;
        this.b = carInfo;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }
}
