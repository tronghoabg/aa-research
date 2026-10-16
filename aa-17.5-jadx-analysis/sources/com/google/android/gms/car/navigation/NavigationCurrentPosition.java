package com.google.android.gms.car.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rrn;
import defpackage.spu;
import defpackage.yfq;
import defpackage.yls;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public final class NavigationCurrentPosition extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NavigationCurrentPosition> CREATOR = new rrn(10);
    public final StepDistance a;
    public final String b;
    private final List c;

    public NavigationCurrentPosition(StepDistance stepDistance, List list, String str) {
        yfq yfqVarO;
        this.a = stepDistance;
        if (list == null) {
            int i = yfq.d;
            yfqVarO = yls.a;
        } else {
            yfqVarO = yfq.o(list);
        }
        this.c = yfqVarO;
        this.b = str;
    }

    public final yfq a() {
        return yfq.o(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            NavigationCurrentPosition navigationCurrentPosition = (NavigationCurrentPosition) obj;
            if (Objects.equals(this.a, navigationCurrentPosition.a) && Objects.equals(this.c, navigationCurrentPosition.c) && Objects.equals(this.b, navigationCurrentPosition.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.c, this.b);
    }

    public final String toString() {
        List list = this.c;
        return "NavigationCurrentPosition{stepDistance=" + String.valueOf(this.a) + ", destinationDistances=" + String.valueOf(list) + ", currentRoad='" + this.b + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, this.a, i);
        spu.J(parcel, 2, a());
        spu.F(parcel, 3, this.b);
        spu.m(parcel, iL);
    }
}
