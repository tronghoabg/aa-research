package com.google.android.gms.car.lifecycle;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class CarActivityRegionLayoutConfig extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig> CREATOR = new defpackage.rcy(9);
    public final android.content.Intent a;
    public final android.content.Intent b;
    public final com.google.android.gms.car.display.CarRegionId c;
    public final com.google.android.gms.car.CarActivityLayoutParams d;
    public final com.google.android.gms.car.display.CarRegionGroup e;
    private final java.util.List f;

    public CarActivityRegionLayoutConfig(android.content.Intent intent, android.content.Intent intent2, com.google.android.gms.car.display.CarRegionId carRegionId, com.google.android.gms.car.CarActivityLayoutParams carActivityLayoutParams, com.google.android.gms.car.display.CarRegionGroup carRegionGroup, java.util.List list) {
        this.a = intent;
        this.b = intent2;
        this.c = carRegionId;
        this.d = carActivityLayoutParams;
        this.e = carRegionGroup;
        this.f = list;
    }

    public final defpackage.ygw a() {
        return defpackage.ygw.o(this.f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig)) {
            return false;
        }
        com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig carActivityRegionLayoutConfig = (com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) obj;
        return this.a.filterEquals(carActivityRegionLayoutConfig.a) && this.b.filterEquals(carActivityRegionLayoutConfig.b) && j$.util.Objects.equals(this.c, carActivityRegionLayoutConfig.c) && j$.util.Objects.equals(this.d, carActivityRegionLayoutConfig.d) && j$.util.Objects.equals(this.e, carActivityRegionLayoutConfig.e) && j$.util.Objects.equals(this.f, carActivityRegionLayoutConfig.f);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final java.lang.String toString() {
        java.util.List list = this.f;
        com.google.android.gms.car.display.CarRegionGroup carRegionGroup = this.e;
        com.google.android.gms.car.display.CarRegionId carRegionId = this.c;
        android.content.Intent intent = this.b;
        android.content.Intent intent2 = this.a;
        return "CarActivityRegionLayoutConfig{carActivityLayoutParams=" + java.lang.String.valueOf(this.d) + ", initialIntent=" + java.lang.String.valueOf(intent2) + ", fallbackIntent=" + java.lang.String.valueOf(intent) + ", carRegionId=" + java.lang.String.valueOf(carRegionId) + ", carRegionGroup=" + java.lang.String.valueOf(carRegionGroup) + ", clientsToPreWarm=" + java.lang.String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 1, this.a, i);
        defpackage.sqs.I(parcel, 2, this.b, i);
        defpackage.sqs.I(parcel, 3, this.c, i);
        defpackage.sqs.I(parcel, 4, this.d, i);
        defpackage.sqs.I(parcel, 5, this.e, i);
        defpackage.sqs.N(parcel, 6, a());
        defpackage.sqs.q(parcel, iP);
    }
}
