package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class CarPhoneStatus extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.CarPhoneStatus> CREATOR = new defpackage.qpf(19);
    public com.google.android.gms.car.CarPhoneStatus.CarCall[] a;
    public int b;

    public static class CarCall extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.car.CarPhoneStatus.CarCall> CREATOR = new defpackage.qpf(18);
        public int a;
        public int b;
        public java.lang.String c;
        public java.lang.String d;
        public java.lang.String e;
        public byte[] f;

        public CarCall(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr) {
            this.a = i;
            this.c = str;
            this.b = i2;
            this.d = str2;
            this.e = str3;
            this.f = bArr;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            int iP = defpackage.sqs.p(parcel, 20293);
            defpackage.sqs.v(parcel, 1, this.a);
            defpackage.sqs.v(parcel, 2, this.b);
            defpackage.sqs.J(parcel, 3, this.c);
            defpackage.sqs.J(parcel, 4, this.d);
            defpackage.sqs.J(parcel, 5, this.e);
            defpackage.sqs.z(parcel, 6, this.f);
            defpackage.sqs.q(parcel, iP);
        }
    }

    public CarPhoneStatus(com.google.android.gms.car.CarPhoneStatus.CarCall[] carCallArr, int i) {
        this.a = carCallArr;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.M(parcel, 1, this.a, i);
        defpackage.sqs.v(parcel, 2, this.b);
        defpackage.sqs.q(parcel, iP);
    }

    public CarPhoneStatus() {
    }
}
