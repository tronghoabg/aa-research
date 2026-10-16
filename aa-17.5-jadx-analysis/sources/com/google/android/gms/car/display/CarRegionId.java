package com.google.android.gms.car.display;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rcd;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class CarRegionId extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarRegionId> CREATOR = new rcd(7);
    public static final CarRegionId a;
    public static final CarRegionId b;
    public static final CarRegionId c;
    public static final CarRegionId d;
    public static final CarRegionId e;
    public static final CarRegionId f;
    public final int g;
    public final CarDisplayId h;

    static {
        CarDisplayId carDisplayId = CarDisplayId.a;
        a = new CarRegionId(0, carDisplayId);
        b = new CarRegionId(1, carDisplayId);
        c = new CarRegionId(5, carDisplayId);
        d = new CarRegionId(4, carDisplayId);
        e = new CarRegionId(7, carDisplayId);
        f = new CarRegionId(8, carDisplayId);
    }

    public CarRegionId(int i, CarDisplayId carDisplayId) {
        this.g = i;
        this.h = carDisplayId;
    }

    public final boolean a() {
        return this.g == 0;
    }

    public final boolean b() {
        return a() && CarDisplayId.b(this.h);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CarRegionId)) {
            return false;
        }
        CarRegionId carRegionId = (CarRegionId) obj;
        return this.h.equals(carRegionId.h) && carRegionId.g == this.g;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.g), this.h);
    }

    public final String toString() {
        return "CarRegionId{regionId=" + this.g + " carDisplayId=" + String.valueOf(this.h) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.g);
        spu.E(parcel, 2, this.h, i);
        spu.m(parcel, iL);
    }
}
