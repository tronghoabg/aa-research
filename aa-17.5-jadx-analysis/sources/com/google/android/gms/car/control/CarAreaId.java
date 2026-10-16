package com.google.android.gms.car.control;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abof;
import defpackage.rhl;
import defpackage.rib;
import defpackage.ric;
import defpackage.spu;
import defpackage.xgj;
import j$.util.Collection;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class CarAreaId extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarAreaId> CREATOR = new rhl(4);
    public final int a;
    public final int b;

    public CarAreaId(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static CarAreaId a(xgj xgjVar) {
        int i = 1;
        int i2 = 0;
        if ((xgjVar.g & 1) != 0) {
            return new CarAreaId(0, 0);
        }
        int i3 = 3;
        if (xgjVar.i.size() > 0) {
            return new CarAreaId(((Integer) Collection.EL.stream(new abof(xgjVar.i, xgj.a)).map(new ric(i)).reduce(0, new rib(i2))).intValue(), 3);
        }
        int i4 = 2;
        if (xgjVar.j.size() > 0) {
            return new CarAreaId(((Integer) Collection.EL.stream(new abof(xgjVar.j, xgj.b)).map(new ric(i2)).reduce(0, new rib(i2))).intValue(), 2);
        }
        if (xgjVar.l.size() > 0) {
            return new CarAreaId(((Integer) Collection.EL.stream(new abof(xgjVar.l, xgj.d)).map(new ric(i4)).reduce(0, new rib(i2))).intValue(), 6);
        }
        int i5 = 4;
        if (xgjVar.k.size() > 0) {
            return new CarAreaId(((Integer) Collection.EL.stream(new abof(xgjVar.k, xgj.c)).map(new ric(i3)).reduce(0, new rib(i2))).intValue(), 4);
        }
        if (xgjVar.m.size() > 0) {
            return new CarAreaId(((Integer) Collection.EL.stream(new abof(xgjVar.m, xgj.e)).map(new ric(i5)).reduce(0, new rib(i2))).intValue(), 5);
        }
        throw new IllegalArgumentException("Unexpected car property area type");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarAreaId)) {
            return false;
        }
        CarAreaId carAreaId = (CarAreaId) obj;
        return this.a == carAreaId.a && this.b == carAreaId.b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        return "CarAreaId{areaId=" + this.a + ", areaType=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.r(parcel, 2, this.b);
        spu.m(parcel, iL);
    }
}
