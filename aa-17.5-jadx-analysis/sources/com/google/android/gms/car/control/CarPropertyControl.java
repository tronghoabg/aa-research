package com.google.android.gms.car.control;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class CarPropertyControl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarPropertyControl> CREATOR = new rhl(8);
    public final CarProperty a;
    public final CarAction b;
    public final CarProperty c;

    public CarPropertyControl(CarProperty carProperty, CarAction carAction, CarProperty carProperty2) {
        this.a = carProperty;
        this.b = carAction;
        this.c = carProperty2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarPropertyControl) {
            CarPropertyControl carPropertyControl = (CarPropertyControl) obj;
            if (Objects.equals(this.a, carPropertyControl.a) && Objects.equals(this.b, carPropertyControl.b) && Objects.equals(this.c, carPropertyControl.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        CarProperty carProperty = this.c;
        CarAction carAction = this.b;
        return "CarPropertyControl{property=" + String.valueOf(this.a) + ", associatedAction=" + String.valueOf(carAction) + ", associatedProperty=" + String.valueOf(carProperty) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, this.a, i);
        spu.E(parcel, 2, this.b, i);
        spu.E(parcel, 3, this.c, i);
        spu.m(parcel, iL);
    }
}
