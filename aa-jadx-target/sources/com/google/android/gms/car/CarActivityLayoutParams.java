package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class CarActivityLayoutParams extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.CarActivityLayoutParams> CREATOR = new defpackage.ea(10);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final android.graphics.Rect f;
    public final com.google.android.gms.car.ProjectionWindowDecorationParams g;
    public final com.google.android.gms.car.animation.ProjectionWindowAnimationParams h;
    public final com.google.android.gms.car.animation.ProjectionWindowAnimationParams i;
    public final int j;
    public final int k;
    public final android.graphics.Rect l;
    private final java.util.List m;

    public CarActivityLayoutParams(int i, int i2, int i3, int i4, int i5, android.graphics.Rect rect, java.util.List list, com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams2, int i6, int i7, android.graphics.Rect rect2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = rect;
        this.m = list;
        this.g = projectionWindowDecorationParams;
        this.h = projectionWindowAnimationParams;
        this.i = projectionWindowAnimationParams2;
        this.j = i6;
        this.k = i7;
        this.l = rect2;
    }

    public final defpackage.ygw a() {
        return defpackage.ygw.o(this.m);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.car.CarActivityLayoutParams) {
            com.google.android.gms.car.CarActivityLayoutParams carActivityLayoutParams = (com.google.android.gms.car.CarActivityLayoutParams) obj;
            if (this.a == carActivityLayoutParams.a && this.b == carActivityLayoutParams.b && this.c == carActivityLayoutParams.c && this.d == carActivityLayoutParams.d && this.e == carActivityLayoutParams.e && this.j == carActivityLayoutParams.j && this.k == carActivityLayoutParams.k && j$.util.Objects.equals(this.f, carActivityLayoutParams.f) && j$.util.Objects.equals(this.m, carActivityLayoutParams.m) && j$.util.Objects.equals(this.g, carActivityLayoutParams.g) && j$.util.Objects.equals(this.h, carActivityLayoutParams.h) && j$.util.Objects.equals(this.i, carActivityLayoutParams.i) && j$.util.Objects.equals(this.l, carActivityLayoutParams.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.e), this.f, this.m, this.g, this.h, this.i, java.lang.Integer.valueOf(this.j), java.lang.Integer.valueOf(this.k), this.l});
    }

    public final java.lang.String toString() {
        android.graphics.Rect rect = this.l;
        com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams = this.i;
        com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams2 = this.h;
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams = this.g;
        java.util.List list = this.m;
        return "CarActivityLayoutParams{width=" + this.a + ", height=" + this.b + ", leftMargin=" + this.c + ", topMargin=" + this.d + ", z=" + this.e + ", systemInsets=" + java.lang.String.valueOf(this.f) + ", regionsCastingInsets=" + java.lang.String.valueOf(list) + ", decoration=" + java.lang.String.valueOf(projectionWindowDecorationParams) + ", enterFromEmptyAnimation=" + java.lang.String.valueOf(projectionWindowAnimationParams2) + ", exitToEmptyAnimation=" + java.lang.String.valueOf(projectionWindowAnimationParams) + ", insetSideHint=" + this.j + ", insetBehavior=" + this.k + ", extraInsets=" + java.lang.String.valueOf(rect) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
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
        defpackage.sqs.I(parcel, 6, this.f, i);
        defpackage.sqs.N(parcel, 7, a());
        defpackage.sqs.I(parcel, 8, this.g, i);
        defpackage.sqs.I(parcel, 9, this.h, i);
        defpackage.sqs.I(parcel, 10, this.i, i);
        parcel.writeInt(262155);
        parcel.writeInt(this.j);
        parcel.writeInt(262156);
        parcel.writeInt(this.k);
        defpackage.sqs.I(parcel, 13, this.l, i);
        defpackage.sqs.q(parcel, iP);
    }
}
