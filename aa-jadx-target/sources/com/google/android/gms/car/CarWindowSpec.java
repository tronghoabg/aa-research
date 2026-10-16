package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class CarWindowSpec extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.CarWindowSpec> CREATOR = new defpackage.ea(16);
    public final java.lang.String a;
    public final java.lang.String b;
    public final com.google.android.gms.car.CarWindowLayoutParams c;
    public final int d;

    public CarWindowSpec(java.lang.String str, java.lang.String str2, com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams, int i) {
        this.a = str;
        this.b = str2;
        this.c = carWindowLayoutParams;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        java.lang.String str = this.a;
        if (str != null) {
            int iP2 = defpackage.sqs.p(parcel, 1);
            parcel.writeString(str);
            defpackage.sqs.q(parcel, iP2);
        }
        java.lang.String str2 = this.b;
        if (str2 != null) {
            int iP3 = defpackage.sqs.p(parcel, 2);
            parcel.writeString(str2);
            defpackage.sqs.q(parcel, iP3);
        }
        defpackage.sqs.I(parcel, 3, this.c, i);
        int i2 = this.d;
        parcel.writeInt(262148);
        parcel.writeInt(i2);
        defpackage.sqs.q(parcel, iP);
    }
}
