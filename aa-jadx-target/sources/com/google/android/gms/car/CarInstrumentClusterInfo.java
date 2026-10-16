package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class CarInstrumentClusterInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.CarInstrumentClusterInfo> CREATOR = new defpackage.ea(12);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public CarInstrumentClusterInfo(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.a);
        defpackage.sqs.v(parcel, 2, this.b);
        defpackage.sqs.v(parcel, 3, this.c);
        defpackage.sqs.v(parcel, 4, this.d);
        defpackage.sqs.v(parcel, 5, this.e);
        defpackage.sqs.q(parcel, iP);
    }
}
