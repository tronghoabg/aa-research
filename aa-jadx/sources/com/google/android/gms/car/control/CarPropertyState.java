package com.google.android.gms.car.control;

/* JADX INFO: loaded from: classes2.dex */
public final class CarPropertyState<T> extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.control.CarPropertyState> CREATOR = new defpackage.rih(11);
    public final com.google.android.gms.car.control.CarProperty a;
    public final com.google.android.gms.car.control.CarPropertyValue b;
    public final int c;

    public CarPropertyState(com.google.android.gms.car.control.CarProperty carProperty, com.google.android.gms.car.control.CarPropertyValue carPropertyValue, int i) {
        this.a = carProperty;
        this.b = carPropertyValue;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.car.control.CarPropertyState)) {
            return false;
        }
        com.google.android.gms.car.control.CarPropertyState carPropertyState = (com.google.android.gms.car.control.CarPropertyState) obj;
        return this.a.equals(carPropertyState.a) && this.b.equals(carPropertyState.b) && this.c == carPropertyState.c;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b, java.lang.Integer.valueOf(this.c));
    }

    public final java.lang.String toString() {
        com.google.android.gms.car.control.CarPropertyValue carPropertyValue = this.b;
        return "CarPropertyState{property= " + java.lang.String.valueOf(this.a) + ", value=" + java.lang.String.valueOf(carPropertyValue) + ", status=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(defpackage.sqs.n(this.a));
        parcel.writeString(defpackage.sqs.n(this.b));
        parcel.writeInt(this.c);
    }
}
