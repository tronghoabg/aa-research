package com.google.android.gms.car;

/* JADX INFO: loaded from: classes.dex */
public class CarWindowManagerLayoutParams extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.CarWindowManagerLayoutParams> CREATOR = new defpackage.ea(15);
    public int a;

    public CarWindowManagerLayoutParams(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((com.google.android.gms.car.CarWindowManagerLayoutParams) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "CarWindowManagerLayoutParams{windowLayoutFlags=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.a);
        defpackage.sqs.q(parcel, iP);
    }

    public CarWindowManagerLayoutParams() {
    }
}
