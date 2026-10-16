package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.qte;
import defpackage.spu;

/* loaded from: classes2.dex */
public class GestureDirection extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GestureDirection> CREATOR = new qte(5);
    public static final GestureDirection a = new GestureDirection(0);
    public static final GestureDirection b = new GestureDirection(1);
    public static final GestureDirection c = new GestureDirection(2);
    public static final GestureDirection d = new GestureDirection(3);
    final int e;

    public GestureDirection(int i) {
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GestureDirection) && this.e == ((GestureDirection) obj).e;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        int i = this.e;
        return a.bq(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "DOWN" : "UP" : "RIGHT" : "LEFT", "GestureDirection{direction=", "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.e);
        spu.m(parcel, iL);
    }
}
