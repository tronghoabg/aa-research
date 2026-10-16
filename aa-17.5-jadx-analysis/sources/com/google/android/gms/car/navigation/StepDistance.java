package com.google.android.gms.car.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rrn;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class StepDistance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StepDistance> CREATOR = new rrn(14);
    public final Distance a;
    public final long b;

    public StepDistance(Distance distance, long j) {
        this.a = distance;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StepDistance stepDistance = (StepDistance) obj;
            if (this.b == stepDistance.b && Objects.equals(this.a, stepDistance.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.b));
    }

    public final String toString() {
        return "StepDistance{distance=" + String.valueOf(this.a) + ", timeToStepSeconds=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, this.a, i);
        spu.s(parcel, 2, this.b);
        spu.m(parcel, iL);
    }
}
