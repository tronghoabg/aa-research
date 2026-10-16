package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ea;
import defpackage.spu;
import defpackage.yfq;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes.dex */
public class CarActivityLayoutParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarActivityLayoutParams> CREATOR = new ea(10);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Rect f;
    public final ProjectionWindowDecorationParams g;
    public final ProjectionWindowAnimationParams h;
    public final ProjectionWindowAnimationParams i;
    public final int j;
    public final int k;
    private final List l;

    public CarActivityLayoutParams(int i, int i2, int i3, int i4, int i5, Rect rect, List list, ProjectionWindowDecorationParams projectionWindowDecorationParams, ProjectionWindowAnimationParams projectionWindowAnimationParams, ProjectionWindowAnimationParams projectionWindowAnimationParams2, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = rect;
        this.l = list;
        this.g = projectionWindowDecorationParams;
        this.h = projectionWindowAnimationParams;
        this.i = projectionWindowAnimationParams2;
        this.j = i6;
        this.k = i7;
    }

    public final yfq a() {
        return yfq.o(this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarActivityLayoutParams)) {
            return false;
        }
        CarActivityLayoutParams carActivityLayoutParams = (CarActivityLayoutParams) obj;
        return this.a == carActivityLayoutParams.a && this.b == carActivityLayoutParams.b && this.c == carActivityLayoutParams.c && this.d == carActivityLayoutParams.d && this.e == carActivityLayoutParams.e && this.j == carActivityLayoutParams.j && this.k == carActivityLayoutParams.k && Objects.equals(this.f, carActivityLayoutParams.f) && Objects.equals(this.l, carActivityLayoutParams.l) && Objects.equals(this.g, carActivityLayoutParams.g) && Objects.equals(this.h, carActivityLayoutParams.h) && Objects.equals(this.i, carActivityLayoutParams.i);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), this.f, this.l, this.g, this.h, this.i, Integer.valueOf(this.j), Integer.valueOf(this.k));
    }

    public final String toString() {
        ProjectionWindowAnimationParams projectionWindowAnimationParams = this.i;
        ProjectionWindowAnimationParams projectionWindowAnimationParams2 = this.h;
        ProjectionWindowDecorationParams projectionWindowDecorationParams = this.g;
        List list = this.l;
        return "CarActivityLayoutParams{width=" + this.a + ", height=" + this.b + ", leftMargin=" + this.c + ", topMargin=" + this.d + ", z=" + this.e + ", initialInsets=" + String.valueOf(this.f) + ", regionsCastingInsets=" + String.valueOf(list) + ", decoration=" + String.valueOf(projectionWindowDecorationParams) + ", enterFromEmptyAnimation=" + String.valueOf(projectionWindowAnimationParams2) + ", exitToEmptyAnimation=" + String.valueOf(projectionWindowAnimationParams) + ", insetSideHint=" + this.j + ", insetBehavior=" + this.k + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.a);
        parcel.writeInt(262146);
        parcel.writeInt(this.b);
        parcel.writeInt(262147);
        parcel.writeInt(this.c);
        parcel.writeInt(262148);
        parcel.writeInt(this.d);
        parcel.writeInt(262149);
        parcel.writeInt(this.e);
        spu.E(parcel, 6, this.f, i);
        spu.J(parcel, 7, a());
        spu.E(parcel, 8, this.g, i);
        spu.E(parcel, 9, this.h, i);
        spu.E(parcel, 10, this.i, i);
        parcel.writeInt(262155);
        parcel.writeInt(this.j);
        parcel.writeInt(262156);
        parcel.writeInt(this.k);
        spu.m(parcel, iL);
    }
}
