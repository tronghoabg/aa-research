package com.google.android.gms.car.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rrn;
import defpackage.spu;
import defpackage.yfq;
import defpackage.yls;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class NavigationStep extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NavigationStep> CREATOR = new rrn(12);
    public final Maneuver a;
    public final String b;
    public final byte[] c;
    private final List d;
    private final List e;

    public NavigationStep(Maneuver maneuver, String str, List list, List list2, byte[] bArr) {
        yfq yfqVarO;
        this.a = maneuver;
        this.b = str;
        if (list == null) {
            int i = yfq.d;
            yfqVarO = yls.a;
        } else {
            yfqVarO = yfq.o(list);
        }
        this.d = yfqVarO;
        this.e = list2 == null ? yls.a : yfq.o(list2);
        this.c = bArr;
    }

    public final yfq a() {
        return yfq.o(this.e);
    }

    public final yfq b() {
        return yfq.o(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            NavigationStep navigationStep = (NavigationStep) obj;
            if (Objects.equals(this.a, navigationStep.a) && Objects.equals(this.b, navigationStep.b) && Objects.equals(this.d, navigationStep.d) && Objects.equals(this.e, navigationStep.e) && Arrays.equals(this.c, navigationStep.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a, this.b, this.d, this.e) * 31) + Arrays.hashCode(this.c);
    }

    public final String toString() {
        List list = this.e;
        List list2 = this.d;
        return "NavigationStep{maneuver=" + String.valueOf(this.a) + ", roadName='" + this.b + "', lanes=" + String.valueOf(list2) + ", cueAlternateTexts=" + String.valueOf(list) + ", turnImage=" + Arrays.toString(this.c) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, this.a, i);
        spu.F(parcel, 2, this.b);
        spu.J(parcel, 3, b());
        spu.H(parcel, 4, a());
        spu.v(parcel, 5, this.c);
        spu.m(parcel, iL);
    }
}
