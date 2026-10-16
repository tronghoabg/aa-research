package com.google.android.gms.car.lifecycle;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class CarDisplayLayoutConfig extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig> CREATOR = new defpackage.rcy(10);
    public final com.google.android.gms.car.display.CarDisplayId a;
    public final java.lang.String b;
    private final java.util.List c;
    private final java.util.List d;

    public CarDisplayLayoutConfig(com.google.android.gms.car.display.CarDisplayId carDisplayId, java.util.List list, java.lang.String str, java.util.List list2) {
        this.a = carDisplayId;
        this.c = list;
        this.b = str;
        this.d = list2;
    }

    public final defpackage.ygw a() {
        return defpackage.ygw.o(this.c);
    }

    public final defpackage.ygw b() {
        return defpackage.ygw.o(this.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig)) {
            return false;
        }
        com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig carDisplayLayoutConfig = (com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig) obj;
        return j$.util.Objects.equals(this.a, carDisplayLayoutConfig.a) && j$.util.Objects.equals(this.c, carDisplayLayoutConfig.c) && j$.util.Objects.equals(this.b, carDisplayLayoutConfig.b) && j$.util.Objects.equals(this.d, carDisplayLayoutConfig.d);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.c, this.b, this.d});
    }

    public final java.lang.String toString() {
        java.util.List list = this.c;
        java.util.List list2 = this.d;
        return "CarDisplayLayoutConfig{carDisplayId=" + java.lang.String.valueOf(this.a) + ", criticalCarRegions=" + java.lang.String.valueOf(list2) + ", carActivityRegionConfigs=" + java.lang.String.valueOf(list) + ", carDisplayConfigurationId=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 1, this.a, i);
        defpackage.sqs.N(parcel, 2, a());
        java.lang.String str = this.b;
        if (str != null) {
            int iP2 = defpackage.sqs.p(parcel, 3);
            parcel.writeString(str);
            defpackage.sqs.q(parcel, iP2);
        }
        defpackage.sqs.N(parcel, 4, b());
        defpackage.sqs.q(parcel, iP);
    }
}
