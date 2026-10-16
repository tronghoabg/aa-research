package com.google.android.gms.car.display;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rcd;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class CarRegionGroup extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarRegionGroup> CREATOR = new rcd(6);
    public final int a;
    public final CarDisplayId b;
    public final CarRegionId c;

    public CarRegionGroup(int i, CarDisplayId carDisplayId, CarRegionId carRegionId) {
        this.a = i;
        this.b = carDisplayId;
        this.c = carRegionId;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CarRegionGroup)) {
            return false;
        }
        CarRegionGroup carRegionGroup = (CarRegionGroup) obj;
        return this.b.equals(carRegionGroup.b) && this.c.equals(carRegionGroup.c) && carRegionGroup.a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c);
    }

    public final String toString() {
        CarRegionId carRegionId = this.c;
        return "CarRegionGroup{groupId=" + this.a + ", carDisplayId=" + String.valueOf(this.b) + ", primaryRegionOfGroup=" + String.valueOf(carRegionId) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.a);
        spu.E(parcel, 2, this.b, i);
        spu.E(parcel, 3, this.c, i);
        spu.m(parcel, iL);
    }
}
