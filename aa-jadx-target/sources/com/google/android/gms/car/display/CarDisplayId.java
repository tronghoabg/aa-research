package com.google.android.gms.car.display;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class CarDisplayId extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.display.CarDisplayId> CREATOR = new defpackage.rcy(4);
    public static final com.google.android.gms.car.display.CarDisplayId a = new com.google.android.gms.car.display.CarDisplayId(0);
    public final int b;

    public CarDisplayId(int i) {
        this.b = i;
    }

    public static boolean b(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        return a.equals(carDisplayId);
    }

    public final java.lang.String a() {
        return "DisplayId_" + this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.gms.car.display.CarDisplayId) && ((com.google.android.gms.car.display.CarDisplayId) obj).b == this.b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final java.lang.String toString() {
        return "CarDisplayId{displayId=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.b);
        defpackage.sqs.q(parcel, iP);
    }
}
