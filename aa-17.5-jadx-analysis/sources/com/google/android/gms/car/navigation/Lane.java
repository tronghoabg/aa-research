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
public final class Lane extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Lane> CREATOR = new rrn(7);
    private final List a;

    public Lane(List list) {
        yfq yfqVarO;
        if (list == null) {
            int i = yfq.d;
            yfqVarO = yls.a;
        } else {
            yfqVarO = yfq.o(list);
        }
        this.a = yfqVarO;
    }

    public final yfq a() {
        return yfq.o(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((Lane) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return "Lane{laneDirections=" + String.valueOf(this.a) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.J(parcel, 1, a());
        spu.m(parcel, iL);
    }
}
