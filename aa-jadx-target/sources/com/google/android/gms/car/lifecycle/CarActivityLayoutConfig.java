package com.google.android.gms.car.lifecycle;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class CarActivityLayoutConfig extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.lifecycle.CarActivityLayoutConfig> CREATOR = new defpackage.rcy(8);
    public final java.util.List a;

    public CarActivityLayoutConfig(java.util.List list) {
        this.a = list;
    }

    public final defpackage.ygw a() {
        return defpackage.ygw.o(this.a);
    }

    public final java.lang.String toString() {
        return "CarActivityLayoutConfig{carDisplayLayoutConfigs=" + java.lang.String.valueOf(this.a) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.N(parcel, 1, a());
        defpackage.sqs.q(parcel, iP);
    }
}
