package com.google.android.gms.car.control;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class CarAreaIdConfig<T> extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarAreaIdConfig<?>> CREATOR = new rhl(3);
    public final CarAreaId a;
    public final Object b;
    public final Object c;

    public CarAreaIdConfig(CarAreaId carAreaId, Object obj, Object obj2) {
        this.a = carAreaId;
        this.b = obj;
        this.c = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarAreaIdConfig)) {
            return false;
        }
        CarAreaIdConfig carAreaIdConfig = (CarAreaIdConfig) obj;
        return this.a.equals(carAreaIdConfig.a) && Objects.equals(this.b, carAreaIdConfig.b) && Objects.equals(this.c, carAreaIdConfig.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        Object obj = this.c;
        Object obj2 = this.b;
        return "CarAreaIdConfig{areaId=" + String.valueOf(this.a) + ", minValue=" + String.valueOf(obj2) + ", maxValue=" + String.valueOf(obj) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(spu.j(this.a));
        parcel.writeValue(this.b);
        parcel.writeValue(this.c);
    }
}
