package com.google.android.gms.analytics.internal;

/* JADX INFO: loaded from: classes2.dex */
public class Command implements android.os.Parcelable {

    @java.lang.Deprecated
    public static final android.os.Parcelable.Creator<com.google.android.gms.analytics.internal.Command> CREATOR = new defpackage.qnp();
    public java.lang.String a;
    public java.lang.String b;
    private java.lang.String c;

    @java.lang.Deprecated
    public Command(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.c = parcel.readString();
        this.b = parcel.readString();
    }

    @Override // android.os.Parcelable
    @java.lang.Deprecated
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    @java.lang.Deprecated
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.c);
        parcel.writeString(this.b);
    }

    @java.lang.Deprecated
    public Command() {
    }
}
