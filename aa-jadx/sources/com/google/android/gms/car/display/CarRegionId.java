package com.google.android.gms.car.display;

/* JADX INFO: loaded from: classes.dex */
public final class CarRegionId extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.display.CarRegionId> CREATOR = new defpackage.rcy(7);
    public static final com.google.android.gms.car.display.CarRegionId a;
    public static final com.google.android.gms.car.display.CarRegionId b;
    public static final com.google.android.gms.car.display.CarRegionId c;
    public static final com.google.android.gms.car.display.CarRegionId d;
    public static final com.google.android.gms.car.display.CarRegionId e;
    public static final com.google.android.gms.car.display.CarRegionId f;
    public final int g;
    public final com.google.android.gms.car.display.CarDisplayId h;

    static {
        com.google.android.gms.car.display.CarDisplayId carDisplayId = com.google.android.gms.car.display.CarDisplayId.a;
        a = new com.google.android.gms.car.display.CarRegionId(0, carDisplayId);
        b = new com.google.android.gms.car.display.CarRegionId(1, carDisplayId);
        c = new com.google.android.gms.car.display.CarRegionId(5, carDisplayId);
        d = new com.google.android.gms.car.display.CarRegionId(4, carDisplayId);
        e = new com.google.android.gms.car.display.CarRegionId(7, carDisplayId);
        f = new com.google.android.gms.car.display.CarRegionId(8, carDisplayId);
    }

    public CarRegionId(int i, com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        this.g = i;
        this.h = carDisplayId;
    }

    public final boolean a() {
        return this.g == 0;
    }

    public final boolean b() {
        return a() && com.google.android.gms.car.display.CarDisplayId.b(this.h);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.car.display.CarRegionId)) {
            return false;
        }
        com.google.android.gms.car.display.CarRegionId carRegionId = (com.google.android.gms.car.display.CarRegionId) obj;
        return this.h.equals(carRegionId.h) && carRegionId.g == this.g;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.g), this.h);
    }

    public final java.lang.String toString() {
        return "CarRegionId{regionId=" + this.g + " carDisplayId=" + java.lang.String.valueOf(this.h) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.g);
        defpackage.sqs.I(parcel, 2, this.h, i);
        defpackage.sqs.q(parcel, iP);
    }
}
