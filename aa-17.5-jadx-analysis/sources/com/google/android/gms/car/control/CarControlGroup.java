package com.google.android.gms.car.control;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rhl;
import defpackage.spu;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public final class CarControlGroup extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarControlGroup> CREATOR = new rhl(6);
    public final int a;
    public final List b;

    public CarControlGroup(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarControlGroup)) {
            return false;
        }
        CarControlGroup carControlGroup = (CarControlGroup) obj;
        return this.a == carControlGroup.a && this.b.equals(carControlGroup.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "CarControlGroup{groupId=" + this.a + "carControls=" + String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.J(parcel, 2, this.b);
        spu.m(parcel, iL);
    }
}
