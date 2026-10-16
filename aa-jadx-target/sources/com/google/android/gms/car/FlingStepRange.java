package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class FlingStepRange extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.FlingStepRange> CREATOR = new defpackage.ea(18);
    public final int a;
    public final int b;

    public FlingStepRange(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.car.FlingStepRange) {
            com.google.android.gms.car.FlingStepRange flingStepRange = (com.google.android.gms.car.FlingStepRange) obj;
            if (this.a == flingStepRange.a && this.b == flingStepRange.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b)});
    }

    public final java.lang.String toString() {
        return "FlingStepRange{minStep=" + this.a + ", maxStep=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.a);
        parcel.writeInt(262146);
        parcel.writeInt(this.b);
        defpackage.sqs.q(parcel, iP);
    }
}
