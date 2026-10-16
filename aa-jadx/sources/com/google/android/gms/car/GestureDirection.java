package com.google.android.gms.car;

/* JADX INFO: loaded from: classes2.dex */
public class GestureDirection extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.GestureDirection> CREATOR = new defpackage.qua(5);
    public static final com.google.android.gms.car.GestureDirection a = new com.google.android.gms.car.GestureDirection(0);
    public static final com.google.android.gms.car.GestureDirection b = new com.google.android.gms.car.GestureDirection(1);
    public static final com.google.android.gms.car.GestureDirection c = new com.google.android.gms.car.GestureDirection(2);
    public static final com.google.android.gms.car.GestureDirection d = new com.google.android.gms.car.GestureDirection(3);
    final int e;

    public GestureDirection(int i) {
        this.e = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.gms.car.GestureDirection) && this.e == ((com.google.android.gms.car.GestureDirection) obj).e;
    }

    public final int hashCode() {
        return this.e;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.e;
        if (i == 0) {
            str = "LEFT";
        } else if (i == 1) {
            str = "RIGHT";
        } else if (i != 2) {
            str = i != 3 ? "UNKNOWN" : "DOWN";
        } else {
            str = "UP";
        }
        return defpackage.a.bp(str, "GestureDirection{direction=", "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.e);
        defpackage.sqs.q(parcel, iP);
    }
}
