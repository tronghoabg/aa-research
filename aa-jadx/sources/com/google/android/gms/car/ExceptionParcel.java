package com.google.android.gms.car;

/* JADX INFO: loaded from: classes2.dex */
public class ExceptionParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.ExceptionParcel> CREATOR = new defpackage.qua(3);
    public final java.lang.Throwable a;

    public ExceptionParcel(java.lang.Throwable th) {
        this.a = th;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
    }
}
