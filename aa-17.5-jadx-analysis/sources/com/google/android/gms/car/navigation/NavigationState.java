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
public final class NavigationState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NavigationState> CREATOR = new rrn(11);
    private final List a;
    private final List b;
    private final List c;

    public NavigationState(List list, List list2, List list3) {
        yfq yfqVarO;
        if (list == null) {
            int i = yfq.d;
            yfqVarO = yls.a;
        } else {
            yfqVarO = yfq.o(list);
        }
        this.a = yfqVarO;
        this.b = list2 == null ? yls.a : yfq.o(list2);
        this.c = list3 == null ? yls.a : yfq.o(list3);
    }

    public final yfq a() {
        return yfq.o(this.c);
    }

    public final yfq b() {
        return yfq.o(this.b);
    }

    public final yfq c() {
        return yfq.o(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            NavigationState navigationState = (NavigationState) obj;
            if (Objects.equals(this.a, navigationState.a) && Objects.equals(this.b, navigationState.b) && Objects.equals(this.c, navigationState.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        List list = this.c;
        List list2 = this.b;
        return "NavigationState{navigationSteps=" + String.valueOf(this.a) + ", destinations=" + String.valueOf(list2) + ", destinationDetails" + String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.J(parcel, 1, c());
        spu.H(parcel, 2, b());
        spu.J(parcel, 3, a());
        spu.m(parcel, iL);
    }
}
