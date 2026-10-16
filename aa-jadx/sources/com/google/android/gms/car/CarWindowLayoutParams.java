package com.google.android.gms.car;

/* JADX INFO: loaded from: classes.dex */
public class CarWindowLayoutParams extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.CarWindowLayoutParams> CREATOR = new defpackage.rbd();
    public final int A;
    public final com.google.android.gms.car.BlackHoleParams B;
    public final float C;
    public final android.graphics.Rect D;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final com.google.android.gms.car.animation.ProjectionWindowAnimationParams j;
    public final com.google.android.gms.car.animation.ProjectionWindowAnimationParams k;
    public final int l;
    public final boolean m;
    public final int n;
    public final int o;
    public final int p;
    public final android.graphics.Rect q;
    public final android.os.Bundle r;
    public final com.google.android.gms.car.display.CarRegionId s;
    public final java.util.List t;
    public final com.google.android.gms.car.ProjectionWindowDecorationParams u;
    public final com.google.android.gms.car.animation.ProjectionWindowAnimationParams v;
    public final com.google.android.gms.car.animation.ProjectionWindowAnimationParams w;
    public final java.lang.String x;
    public final int y;
    public final int z;

    public CarWindowLayoutParams(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams2, int i10, boolean z, int i11, int i12, int i13, android.graphics.Rect rect, android.os.Bundle bundle, com.google.android.gms.car.display.CarRegionId carRegionId, java.util.List list, com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams3, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams4, java.lang.String str, int i14, int i15, int i16, com.google.android.gms.car.BlackHoleParams blackHoleParams, float f, android.graphics.Rect rect2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = projectionWindowAnimationParams;
        this.k = projectionWindowAnimationParams2;
        this.l = i10;
        this.m = z;
        this.n = i11;
        this.o = i12;
        this.p = i13;
        this.q = rect;
        this.r = bundle;
        this.s = carRegionId;
        this.t = list;
        this.z = i15;
        this.u = projectionWindowDecorationParams;
        this.v = projectionWindowAnimationParams3;
        this.w = projectionWindowAnimationParams4;
        this.x = str;
        this.y = i14;
        this.A = i16;
        this.B = blackHoleParams;
        this.C = f;
        this.D = rect2;
    }

    public final android.graphics.Rect a() {
        return new android.graphics.Rect(this.D);
    }

    public final defpackage.ygw b() {
        return defpackage.ygw.o(this.t);
    }

    public final java.lang.String toString() {
        android.graphics.Rect rect = this.D;
        com.google.android.gms.car.BlackHoleParams blackHoleParams = this.B;
        com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams = this.w;
        com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams2 = this.v;
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams = this.u;
        java.util.List list = this.t;
        com.google.android.gms.car.display.CarRegionId carRegionId = this.s;
        android.graphics.Rect rect2 = this.q;
        com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams3 = this.k;
        java.lang.String strValueOf = java.lang.String.valueOf(this.j);
        java.lang.String strValueOf2 = java.lang.String.valueOf(projectionWindowAnimationParams3);
        java.lang.String strValueOf3 = java.lang.String.valueOf(rect2);
        java.lang.String strValueOf4 = java.lang.String.valueOf(carRegionId);
        java.lang.String strValueOf5 = java.lang.String.valueOf(list);
        java.lang.String strValueOf6 = java.lang.String.valueOf(projectionWindowDecorationParams);
        java.lang.String strValueOf7 = java.lang.String.valueOf(projectionWindowAnimationParams2);
        java.lang.String strValueOf8 = java.lang.String.valueOf(projectionWindowAnimationParams);
        java.lang.String strValueOf9 = java.lang.String.valueOf(blackHoleParams);
        java.lang.String strValueOf10 = java.lang.String.valueOf(rect);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CarWindowLayoutParams{versionCode=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", leftMargin=");
        sb.append(this.d);
        sb.append(", topMargin=");
        sb.append(this.e);
        sb.append(", rightMargin=");
        sb.append(this.f);
        sb.append(", bottomMargin=");
        sb.append(this.g);
        sb.append(", gravity=");
        sb.append(this.h);
        sb.append(", z=");
        sb.append(this.i);
        sb.append(", inAnimRes=");
        sb.append(strValueOf);
        sb.append(", outAnimRes=");
        sb.append(strValueOf2);
        sb.append(", shadowType=");
        sb.append(this.l);
        sb.append(", alpha=");
        sb.append(this.m);
        sb.append(", focusFlags=");
        sb.append(this.n);
        sb.append(", themeRes=");
        sb.append(this.o);
        sb.append(", shadowHeightDp=");
        sb.append(this.p);
        sb.append(", insets=");
        sb.append(strValueOf3);
        sb.append(", carRegionId=");
        sb.append(strValueOf4);
        sb.append(", regionsCastingInsets=");
        sb.append(strValueOf5);
        sb.append(", decoration=");
        sb.append(strValueOf6);
        float f = this.C;
        int i = this.A;
        int i2 = this.z;
        java.lang.String str = this.x;
        sb.append(", enterFromEmptyAnimation=");
        sb.append(strValueOf7);
        sb.append(", exitToEmptyAnimation=");
        sb.append(strValueOf8);
        sb.append(", carDisplayConfigurationId=");
        sb.append(str);
        sb.append(", insetSideHint=");
        sb.append(i2);
        sb.append(", insetBehavior=");
        sb.append(i);
        sb.append(", blackHoleParams=");
        sb.append(strValueOf9);
        sb.append(", scaleFactor=");
        sb.append(f);
        sb.append(", insetOverdraw=");
        sb.append(strValueOf10);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.b);
        parcel.writeInt(262146);
        parcel.writeInt(this.c);
        parcel.writeInt(262147);
        parcel.writeInt(this.d);
        parcel.writeInt(262148);
        parcel.writeInt(this.e);
        parcel.writeInt(262149);
        parcel.writeInt(this.f);
        parcel.writeInt(262150);
        parcel.writeInt(this.g);
        parcel.writeInt(262151);
        parcel.writeInt(this.h);
        parcel.writeInt(262152);
        parcel.writeInt(this.i);
        defpackage.sqs.I(parcel, 9, this.j, i);
        defpackage.sqs.I(parcel, 10, this.k, i);
        parcel.writeInt(262155);
        parcel.writeInt(this.l);
        parcel.writeInt(262156);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(262157);
        parcel.writeInt(this.n);
        parcel.writeInt(262158);
        parcel.writeInt(this.o);
        parcel.writeInt(262159);
        parcel.writeInt(this.p);
        defpackage.sqs.I(parcel, 16, this.q, i);
        android.os.Bundle bundle = this.r;
        if (bundle != null) {
            int iP2 = defpackage.sqs.p(parcel, 17);
            parcel.writeBundle(bundle);
            defpackage.sqs.q(parcel, iP2);
        }
        defpackage.sqs.I(parcel, 18, this.s, i);
        defpackage.sqs.N(parcel, 19, b());
        defpackage.sqs.I(parcel, 20, this.u, i);
        defpackage.sqs.I(parcel, 21, this.v, i);
        defpackage.sqs.I(parcel, 22, this.w, i);
        java.lang.String str = this.x;
        if (str != null) {
            int iP3 = defpackage.sqs.p(parcel, 23);
            parcel.writeString(str);
            defpackage.sqs.q(parcel, iP3);
        }
        int i2 = this.y;
        parcel.writeInt(262168);
        parcel.writeInt(i2);
        int i3 = this.z;
        parcel.writeInt(262169);
        parcel.writeInt(i3);
        int i4 = this.A;
        parcel.writeInt(262170);
        parcel.writeInt(i4);
        defpackage.sqs.I(parcel, 27, this.B, i);
        float f = this.C;
        parcel.writeInt(262172);
        parcel.writeFloat(f);
        android.graphics.Rect rectA = a();
        int iP4 = defpackage.sqs.p(parcel, 29);
        rectA.writeToParcel(parcel, i);
        defpackage.sqs.q(parcel, iP4);
        int i5 = this.a;
        parcel.writeInt(263144);
        parcel.writeInt(i5);
        defpackage.sqs.q(parcel, iP);
    }
}
