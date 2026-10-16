package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ProjectionWindowDecorationParams extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.ProjectionWindowDecorationParams> CREATOR = new defpackage.ea(20);
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
    public final com.google.android.gms.car.DropShadowParams k;
    public com.google.android.gms.car.ProjectionWindowDragParams l;

    public ProjectionWindowDecorationParams(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, int i8, com.google.android.gms.car.DropShadowParams dropShadowParams, com.google.android.gms.car.ProjectionWindowDragParams projectionWindowDragParams) {
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

    public static com.google.android.gms.car.ProjectionWindowDecorationParams a() {
        int i = defpackage.ygw.d;
        defpackage.ygw ygwVar = defpackage.ymx.a;
        return new com.google.android.gms.car.ProjectionWindowDecorationParams(0, 0, 0, 0, 1, 0, 1, false, false, 0, null, new com.google.android.gms.car.ProjectionWindowDragParams(0, ygwVar, null, ygwVar, ygwVar));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.car.ProjectionWindowDecorationParams)) {
            return false;
        }
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams = (com.google.android.gms.car.ProjectionWindowDecorationParams) obj;
        return this.a == projectionWindowDecorationParams.a && this.b == projectionWindowDecorationParams.b && this.c == projectionWindowDecorationParams.c && this.d == projectionWindowDecorationParams.d && this.e == projectionWindowDecorationParams.e && this.f == projectionWindowDecorationParams.f && this.g == projectionWindowDecorationParams.g && this.h == projectionWindowDecorationParams.h && this.i == projectionWindowDecorationParams.i && j$.util.Objects.equals(this.l, projectionWindowDecorationParams.l) && this.j == projectionWindowDecorationParams.j && j$.util.Objects.equals(this.k, projectionWindowDecorationParams.k);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.e), java.lang.Integer.valueOf(this.f), java.lang.Integer.valueOf(this.g), java.lang.Boolean.valueOf(this.h), java.lang.Boolean.valueOf(this.i), this.l, java.lang.Integer.valueOf(this.j), this.k});
    }

    public final java.lang.String toString() {
        return "ProjectionWindowDecorationParams{outlineLeft=" + this.a + ", outlineTop=" + this.b + ", outlineRight=" + this.c + ", outlineBottom=" + this.d + ", corners=" + this.e + ", cornerRadius=" + this.f + ", antiAliasingType=" + this.g + ", showOutlinesOnlyWhenInset=" + this.h + ", showRoundedCornersOnlyWhenInset=" + this.i + ", projectionWindowDragParams=" + java.lang.String.valueOf(this.l) + ", borderWidth=" + this.j + ", dropShadowParams=" + java.lang.String.valueOf(this.k) + "}";
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
        defpackage.sqs.I(parcel, 11, this.k, i);
        defpackage.sqs.I(parcel, 12, this.l, i);
        defpackage.sqs.q(parcel, iP);
    }
}
