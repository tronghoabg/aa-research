package com.google.android.gms.car.control;

/* JADX INFO: loaded from: classes2.dex */
public class CarProperty extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.control.CarProperty> CREATOR = new defpackage.rih(9);
    public final int a;
    public final com.google.android.gms.car.control.CarAreaId b;

    public CarProperty(int i, com.google.android.gms.car.control.CarAreaId carAreaId) {
        this.a = i;
        this.b = carAreaId;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.car.control.CarProperty)) {
            return false;
        }
        com.google.android.gms.car.control.CarProperty carProperty = (com.google.android.gms.car.control.CarProperty) obj;
        return this.a == carProperty.a && this.b.equals(carProperty.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.a), this.b);
    }

    public final java.lang.String toString() {
        return "CarProperty{propertyId=" + this.a + ", areaId=" + java.lang.String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.a);
        defpackage.sqs.I(parcel, 2, this.b, i);
        defpackage.sqs.q(parcel, iP);
    }
}
