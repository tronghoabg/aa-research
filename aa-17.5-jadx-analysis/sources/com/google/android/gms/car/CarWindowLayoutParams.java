package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rah;
import defpackage.spu;
import defpackage.yfq;
import java.util.List;

/* loaded from: classes.dex */
public class CarWindowLayoutParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarWindowLayoutParams> CREATOR = new rah();
    public final int A;
    public final BlackHoleParams B;
    public final float C;
    public final Rect D;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final ProjectionWindowAnimationParams j;
    public final ProjectionWindowAnimationParams k;
    public final int l;
    public final boolean m;
    public final int n;
    public final int o;
    public final int p;
    public final Rect q;
    public final Bundle r;
    public final CarRegionId s;
    public final List t;
    public final ProjectionWindowDecorationParams u;
    public final ProjectionWindowAnimationParams v;
    public final ProjectionWindowAnimationParams w;
    public final String x;
    public final int y;
    public final int z;

    public CarWindowLayoutParams(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, ProjectionWindowAnimationParams projectionWindowAnimationParams, ProjectionWindowAnimationParams projectionWindowAnimationParams2, int i10, boolean z, int i11, int i12, int i13, Rect rect, Bundle bundle, CarRegionId carRegionId, List list, ProjectionWindowDecorationParams projectionWindowDecorationParams, ProjectionWindowAnimationParams projectionWindowAnimationParams3, ProjectionWindowAnimationParams projectionWindowAnimationParams4, String str, int i14, int i15, int i16, BlackHoleParams blackHoleParams, float f, Rect rect2) {
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

    public final Rect a() {
        return new Rect(this.D);
    }

    public final yfq b() {
        return yfq.o(this.t);
    }

    public final String toString() {
        Rect rect = this.D;
        BlackHoleParams blackHoleParams = this.B;
        ProjectionWindowAnimationParams projectionWindowAnimationParams = this.w;
        ProjectionWindowAnimationParams projectionWindowAnimationParams2 = this.v;
        ProjectionWindowDecorationParams projectionWindowDecorationParams = this.u;
        List list = this.t;
        CarRegionId carRegionId = this.s;
        Rect rect2 = this.q;
        ProjectionWindowAnimationParams projectionWindowAnimationParams3 = this.k;
        String strValueOf = String.valueOf(this.j);
        String strValueOf2 = String.valueOf(projectionWindowAnimationParams3);
        String strValueOf3 = String.valueOf(rect2);
        String strValueOf4 = String.valueOf(carRegionId);
        String strValueOf5 = String.valueOf(list);
        String strValueOf6 = String.valueOf(projectionWindowDecorationParams);
        String strValueOf7 = String.valueOf(projectionWindowAnimationParams2);
        String strValueOf8 = String.valueOf(projectionWindowAnimationParams);
        String strValueOf9 = String.valueOf(blackHoleParams);
        String strValueOf10 = String.valueOf(rect);
        StringBuilder sb = new StringBuilder("CarWindowLayoutParams{versionCode=");
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
        String str = this.x;
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
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
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
        spu.E(parcel, 9, this.j, i);
        spu.E(parcel, 10, this.k, i);
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
        spu.E(parcel, 16, this.q, i);
        Bundle bundle = this.r;
        if (bundle != null) {
            int iL2 = spu.l(parcel, 17);
            parcel.writeBundle(bundle);
            spu.m(parcel, iL2);
        }
        spu.E(parcel, 18, this.s, i);
        spu.J(parcel, 19, b());
        spu.E(parcel, 20, this.u, i);
        spu.E(parcel, 21, this.v, i);
        spu.E(parcel, 22, this.w, i);
        String str = this.x;
        if (str != null) {
            int iL3 = spu.l(parcel, 23);
            parcel.writeString(str);
            spu.m(parcel, iL3);
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
        spu.E(parcel, 27, this.B, i);
        float f = this.C;
        parcel.writeInt(262172);
        parcel.writeFloat(f);
        Rect rectA = a();
        int iL4 = spu.l(parcel, 29);
        rectA.writeToParcel(parcel, i);
        spu.m(parcel, iL4);
        int i5 = this.a;
        parcel.writeInt(263144);
        parcel.writeInt(i5);
        spu.m(parcel, iL);
    }
}
