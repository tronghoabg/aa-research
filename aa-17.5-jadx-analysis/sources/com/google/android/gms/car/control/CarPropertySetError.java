package com.google.android.gms.car.control;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class CarPropertySetError extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarPropertySetError> CREATOR = new rhl(10);
    public final int a;

    public CarPropertySetError(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CarPropertySetError) && this.a == ((CarPropertySetError) obj).a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a));
    }

    public final String toString() {
        return "CarPropertySetError{, error=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.m(parcel, iL);
    }
}
