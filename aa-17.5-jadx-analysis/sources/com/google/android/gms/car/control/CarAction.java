package com.google.android.gms.car.control;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;

/* loaded from: classes2.dex */
public class CarAction extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarAction> CREATOR = new rhl(2);
    public final int a;

    public CarAction(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CarAction) && this.a == ((CarAction) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "CarAction{actionId=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.m(parcel, iL);
    }
}
