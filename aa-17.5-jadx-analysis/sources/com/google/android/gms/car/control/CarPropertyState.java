package com.google.android.gms.car.control;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class CarPropertyState<T> extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarPropertyState> CREATOR = new rhl(11);
    public final CarProperty a;
    public final CarPropertyValue b;
    public final int c;

    public CarPropertyState(CarProperty carProperty, CarPropertyValue carPropertyValue, int i) {
        this.a = carProperty;
        this.b = carPropertyValue;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarPropertyState)) {
            return false;
        }
        CarPropertyState carPropertyState = (CarPropertyState) obj;
        return this.a.equals(carPropertyState.a) && this.b.equals(carPropertyState.b) && this.c == carPropertyState.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }

    public final String toString() {
        CarPropertyValue carPropertyValue = this.b;
        return "CarPropertyState{property= " + String.valueOf(this.a) + ", value=" + String.valueOf(carPropertyValue) + ", status=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(spu.j(this.a));
        parcel.writeString(spu.j(this.b));
        parcel.writeInt(this.c);
    }
}
