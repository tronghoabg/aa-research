package com.google.android.gms.car.control;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class CarProperty extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarProperty> CREATOR = new rhl(9);
    public final int a;
    public final CarAreaId b;

    public CarProperty(int i, CarAreaId carAreaId) {
        this.a = i;
        this.b = carAreaId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarProperty)) {
            return false;
        }
        CarProperty carProperty = (CarProperty) obj;
        return this.a == carProperty.a && this.b.equals(carProperty.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "CarProperty{propertyId=" + this.a + ", areaId=" + String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.E(parcel, 2, this.b, i);
        spu.m(parcel, iL);
    }
}
