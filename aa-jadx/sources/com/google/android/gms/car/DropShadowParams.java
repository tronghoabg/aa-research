package com.google.android.gms.car;

/* JADX INFO: loaded from: classes.dex */
public class DropShadowParams extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.DropShadowParams> CREATOR = new defpackage.qua(2);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public DropShadowParams(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.car.DropShadowParams) {
            com.google.android.gms.car.DropShadowParams dropShadowParams = (com.google.android.gms.car.DropShadowParams) obj;
            if (this.a == dropShadowParams.a && this.b == dropShadowParams.b && this.c == dropShadowParams.c && this.d == dropShadowParams.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d));
    }

    public final java.lang.String toString() {
        return "DropShadowParams{xOffset=" + this.a + ", yOffset=" + this.b + ", radius=" + this.c + ", color=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.a);
        defpackage.sqs.v(parcel, 2, this.b);
        defpackage.sqs.v(parcel, 3, this.c);
        defpackage.sqs.v(parcel, 4, this.d);
        defpackage.sqs.q(parcel, iP);
    }
}
