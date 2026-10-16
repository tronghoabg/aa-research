package com.google.android.apps.auto.components.car.info;

/* JADX INFO: loaded from: classes.dex */
public class StartingProcessInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.components.car.info.StartingProcessInfo> CREATOR = new defpackage.kid(2);
    public final android.os.IBinder a;
    public final com.google.android.gms.car.CarInfo b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;

    public StartingProcessInfo(android.os.Parcel parcel) {
        this.a = parcel.readStrongBinder();
        this.b = (com.google.android.gms.car.CarInfo) parcel.readParcelable(com.google.android.gms.car.CarInfo.class.getClassLoader());
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public StartingProcessInfo(android.os.IBinder iBinder, com.google.android.gms.car.CarInfo carInfo, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = iBinder;
        this.b = carInfo;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }
}
