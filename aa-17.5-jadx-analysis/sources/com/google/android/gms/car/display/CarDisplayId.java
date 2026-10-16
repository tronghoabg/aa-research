package com.google.android.gms.car.display;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rcd;
import defpackage.spu;

/* loaded from: classes.dex */
public final class CarDisplayId extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarDisplayId> CREATOR = new rcd(4);
    public static final CarDisplayId a = new CarDisplayId(0);
    public final int b;

    public CarDisplayId(int i) {
        this.b = i;
    }

    public static boolean b(CarDisplayId carDisplayId) {
        return a.equals(carDisplayId);
    }

    public final String a() {
        return "DisplayId_" + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CarDisplayId) && ((CarDisplayId) obj).b == this.b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return "CarDisplayId{displayId=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.b);
        spu.m(parcel, iL);
    }
}
