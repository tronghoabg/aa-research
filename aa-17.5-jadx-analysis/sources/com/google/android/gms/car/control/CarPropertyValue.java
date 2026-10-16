package com.google.android.gms.car.control;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.woy;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class CarPropertyValue<T> extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarPropertyValue<?>> CREATOR = new rhl(12);
    public final Object a;

    public CarPropertyValue(Object obj) {
        boolean z = true;
        if (!(obj instanceof Integer) && !(obj instanceof Boolean) && !(obj instanceof Float) && !(obj instanceof Float[]) && !(obj instanceof Integer[]) && !(obj instanceof Long) && !(obj instanceof Long[]) && !(obj instanceof String) && obj != null) {
            z = false;
        }
        woy.S(z, "value is of an unsupported type: %s", obj == null ? "null" : obj.getClass());
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarPropertyValue)) {
            return false;
        }
        CarPropertyValue carPropertyValue = (CarPropertyValue) obj;
        Object obj3 = this.a;
        return (obj3 == null || (obj2 = carPropertyValue.a) == null || !obj3.getClass().isArray() || !obj2.getClass().isArray()) ? Objects.equals(obj3, carPropertyValue.a) : Arrays.equals((Object[]) obj3, (Object[]) obj2);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return "CarPropertyValue{value=" + String.valueOf(this.a) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
    }
}
