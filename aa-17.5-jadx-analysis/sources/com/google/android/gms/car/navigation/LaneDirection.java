package com.google.android.gms.car.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rrn;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class LaneDirection extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LaneDirection> CREATOR = new rrn(8);
    public final int a;
    public final boolean b;

    public LaneDirection(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LaneDirection laneDirection = (LaneDirection) obj;
            if (this.a == laneDirection.a && this.b == laneDirection.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Boolean.valueOf(this.b));
    }

    public final String toString() {
        return "LaneDirection{laneShape=" + this.a + ", isHighlighted=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.n(parcel, 2, this.b);
        spu.m(parcel, iL);
    }
}
