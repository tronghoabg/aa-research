package com.google.android.gms.car.display;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class CarRegionGroup extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.display.CarRegionGroup> CREATOR = new defpackage.rcy(6);
    public final int a;
    public final com.google.android.gms.car.display.CarDisplayId b;
    public final com.google.android.gms.car.display.CarRegionId c;

    public CarRegionGroup(int i, com.google.android.gms.car.display.CarDisplayId carDisplayId, com.google.android.gms.car.display.CarRegionId carRegionId) {
        this.a = i;
        this.b = carDisplayId;
        this.c = carRegionId;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.car.display.CarRegionGroup)) {
            return false;
        }
        com.google.android.gms.car.display.CarRegionGroup carRegionGroup = (com.google.android.gms.car.display.CarRegionGroup) obj;
        return this.b.equals(carRegionGroup.b) && this.c.equals(carRegionGroup.c) && carRegionGroup.a == this.a;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), this.b, this.c});
    }

    public final java.lang.String toString() {
        com.google.android.gms.car.display.CarRegionId carRegionId = this.c;
        return "CarRegionGroup{groupId=" + this.a + ", carDisplayId=" + java.lang.String.valueOf(this.b) + ", primaryRegionOfGroup=" + java.lang.String.valueOf(carRegionId) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.a);
        defpackage.sqs.I(parcel, 2, this.b, i);
        defpackage.sqs.I(parcel, 3, this.c, i);
        defpackage.sqs.q(parcel, iP);
    }
}
