package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ea;
import defpackage.spu;

/* loaded from: classes.dex */
public class CarWindowManagerLayoutParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarWindowManagerLayoutParams> CREATOR = new ea(15);
    public int a;

    public CarWindowManagerLayoutParams(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((CarWindowManagerLayoutParams) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "CarWindowManagerLayoutParams{windowLayoutFlags=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.m(parcel, iL);
    }

    public CarWindowManagerLayoutParams() {
    }
}
