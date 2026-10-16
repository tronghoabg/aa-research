package com.google.android.gms.car.control;

/* JADX INFO: loaded from: classes2.dex */
public final class CarControlGroup extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.control.CarControlGroup> CREATOR = new defpackage.rih(6);
    public final int a;
    public final java.util.List b;

    public CarControlGroup(int i, java.util.List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.car.control.CarControlGroup)) {
            return false;
        }
        com.google.android.gms.car.control.CarControlGroup carControlGroup = (com.google.android.gms.car.control.CarControlGroup) obj;
        return this.a == carControlGroup.a && this.b.equals(carControlGroup.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.a), this.b);
    }

    public final java.lang.String toString() {
        return "CarControlGroup{groupId=" + this.a + "carControls=" + java.lang.String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.a);
        defpackage.sqs.N(parcel, 2, this.b);
        defpackage.sqs.q(parcel, iP);
    }
}
