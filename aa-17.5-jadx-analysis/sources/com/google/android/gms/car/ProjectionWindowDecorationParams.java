package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ea;
import defpackage.spu;
import defpackage.yfq;
import defpackage.yls;
import j$.util.Objects;

/* loaded from: classes.dex */
public class ProjectionWindowDecorationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProjectionWindowDecorationParams> CREATOR = new ea(20);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final DropShadowParams k;
    public ProjectionWindowDragParams l;

    public ProjectionWindowDecorationParams(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, int i8, DropShadowParams dropShadowParams, ProjectionWindowDragParams projectionWindowDragParams) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = z;
        this.i = z2;
        this.j = i8;
        this.k = dropShadowParams;
        this.l = projectionWindowDragParams;
    }

    public static ProjectionWindowDecorationParams a() {
        int i = yfq.d;
        yfq yfqVar = yls.a;
        return new ProjectionWindowDecorationParams(0, 0, 0, 0, 1, 0, 1, false, false, 0, null, new ProjectionWindowDragParams(0, yfqVar, null, yfqVar, yfqVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectionWindowDecorationParams)) {
            return false;
        }
        ProjectionWindowDecorationParams projectionWindowDecorationParams = (ProjectionWindowDecorationParams) obj;
        return this.a == projectionWindowDecorationParams.a && this.b == projectionWindowDecorationParams.b && this.c == projectionWindowDecorationParams.c && this.d == projectionWindowDecorationParams.d && this.e == projectionWindowDecorationParams.e && this.f == projectionWindowDecorationParams.f && this.g == projectionWindowDecorationParams.g && this.h == projectionWindowDecorationParams.h && this.i == projectionWindowDecorationParams.i && Objects.equals(this.l, projectionWindowDecorationParams.l) && this.j == projectionWindowDecorationParams.j && Objects.equals(this.k, projectionWindowDecorationParams.k);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), this.l, Integer.valueOf(this.j), this.k);
    }

    public final String toString() {
        return "ProjectionWindowDecorationParams{outlineLeft=" + this.a + ", outlineTop=" + this.b + ", outlineRight=" + this.c + ", outlineBottom=" + this.d + ", corners=" + this.e + ", cornerRadius=" + this.f + ", antiAliasingType=" + this.g + ", showOutlinesOnlyWhenInset=" + this.h + ", showRoundedCornersOnlyWhenInset=" + this.i + ", projectionWindowDragParams=" + String.valueOf(this.l) + ", borderWidth=" + this.j + ", dropShadowParams=" + String.valueOf(this.k) + "}";
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
        parcel.writeInt(262150);
        parcel.writeInt(this.f);
        parcel.writeInt(262151);
        parcel.writeInt(this.g);
        parcel.writeInt(262152);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(262153);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(262154);
        parcel.writeInt(this.j);
        spu.E(parcel, 11, this.k, i);
        spu.E(parcel, 12, this.l, i);
        spu.m(parcel, iL);
    }
}
