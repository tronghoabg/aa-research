package com.google.android.gms.carsetup;

/* JADX INFO: loaded from: classes.dex */
public class BinderParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.carsetup.BinderParcel> CREATOR = new defpackage.rcy(11);
    public final android.os.IBinder a;

    public BinderParcel(android.os.IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a);
    }
}
