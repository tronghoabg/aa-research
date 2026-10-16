package com.google.android.gms.car.control;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public final class CarControl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarControl> CREATOR = new rhl(5);
    public final CarPropertyControl a;
    public final CarAction b;
    public final CarControlGroup c;
    public final boolean d;
    public final List e;
    public final int f;

    public CarControl(CarPropertyControl carPropertyControl, CarAction carAction, CarControlGroup carControlGroup, boolean z, List list, int i) {
        this.a = carPropertyControl;
        this.b = carAction;
        this.c = carControlGroup;
        this.d = z;
        this.e = list;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarControl) {
            CarControl carControl = (CarControl) obj;
            if (Objects.equals(this.a, carControl.a) && Objects.equals(this.b, carControl.b) && Objects.equals(this.c, carControl.c) && this.d == carControl.d && Objects.equals(this.e, carControl.e) && this.f == carControl.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Boolean.valueOf(this.d), this.e, Integer.valueOf(this.f));
    }

    public final String toString() {
        List list = this.e;
        CarControlGroup carControlGroup = this.c;
        CarAction carAction = this.b;
        return "CarControl{propertyControl=" + String.valueOf(this.a) + ", actionControl=" + String.valueOf(carAction) + ", controlGroup=" + String.valueOf(carControlGroup) + ", enabled=" + this.d + ", metadata=" + String.valueOf(list) + ", sideAffinity=" + this.f + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, this.a, i);
        spu.E(parcel, 2, this.b, i);
        spu.E(parcel, 3, this.c, i);
        spu.n(parcel, 4, this.d);
        spu.A(parcel, 5, this.e);
        spu.r(parcel, 6, this.f);
        spu.m(parcel, iL);
    }
}
