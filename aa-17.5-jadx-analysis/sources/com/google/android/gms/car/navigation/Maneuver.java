package com.google.android.gms.car.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rrn;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class Maneuver extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Maneuver> CREATOR = new rrn(9);
    public final int a;
    public final int b;
    public final int c;

    public Maneuver(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Maneuver maneuver = (Maneuver) obj;
            if (this.a == maneuver.a && this.b == maneuver.b && this.c == maneuver.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return "Maneuver{type=" + this.a + ", roundAboutExitNumber=" + this.b + ", roundAboutExitAngle=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.r(parcel, 2, this.b);
        spu.r(parcel, 3, this.c);
        spu.m(parcel, iL);
    }
}
