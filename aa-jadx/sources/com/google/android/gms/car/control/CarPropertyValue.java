package com.google.android.gms.car.control;

/* JADX INFO: loaded from: classes2.dex */
public class CarPropertyValue<T> extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.control.CarPropertyValue<?>> CREATOR = new defpackage.rih(12);
    public final java.lang.Object a;

    public CarPropertyValue(java.lang.Object obj) {
        boolean z = true;
        if (!(obj instanceof java.lang.Integer) && !(obj instanceof java.lang.Boolean) && !(obj instanceof java.lang.Float) && !(obj instanceof java.lang.Float[]) && !(obj instanceof java.lang.Integer[]) && !(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Long[]) && !(obj instanceof java.lang.String) && obj != null) {
            z = false;
        }
        defpackage.ysr.bc(z, "value is of an unsupported type: %s", obj == null ? "null" : obj.getClass());
        this.a = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.Object obj2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.car.control.CarPropertyValue)) {
            return false;
        }
        com.google.android.gms.car.control.CarPropertyValue carPropertyValue = (com.google.android.gms.car.control.CarPropertyValue) obj;
        java.lang.Object obj3 = this.a;
        return (obj3 == null || (obj2 = carPropertyValue.a) == null || !obj3.getClass().isArray() || !obj2.getClass().isArray()) ? j$.util.Objects.equals(obj3, carPropertyValue.a) : java.util.Arrays.equals((java.lang.Object[]) obj3, (java.lang.Object[]) obj2);
    }

    public final int hashCode() {
        return j$.util.Objects.hashCode(this.a);
    }

    public final java.lang.String toString() {
        return "CarPropertyValue{value=" + java.lang.String.valueOf(this.a) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeValue(this.a);
    }
}
