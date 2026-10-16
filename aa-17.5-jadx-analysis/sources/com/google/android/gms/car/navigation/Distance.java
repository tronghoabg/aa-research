package com.google.android.gms.car.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rrn;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class Distance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Distance> CREATOR = new rrn(5);
    public final int a;
    public final String b;
    public final int c;
    public final long d;

    public Distance(int i, String str, int i2, long j) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Distance distance = (Distance) obj;
            if (this.a == distance.a && this.c == distance.c && this.d == distance.d && Objects.equals(this.b, distance.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, Integer.valueOf(this.c), Long.valueOf(this.d));
    }

    public final String toString() {
        return "Distance{meters=" + this.a + ", displayValue='" + this.b + "', displayUnit=" + this.c + ", displayDistanceMillis=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.F(parcel, 2, this.b);
        spu.r(parcel, 3, this.c);
        spu.s(parcel, 4, this.d);
        spu.m(parcel, iL);
    }
}
