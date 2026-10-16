package com.google.android.gms.car.control;

/* JADX INFO: loaded from: classes2.dex */
public class CarAction extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.control.CarAction> CREATOR = new defpackage.rih(2);
    public final int a;

    public CarAction(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.gms.car.control.CarAction) && this.a == ((com.google.android.gms.car.control.CarAction) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "CarAction{actionId=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.a);
        defpackage.sqs.q(parcel, iP);
    }
}
