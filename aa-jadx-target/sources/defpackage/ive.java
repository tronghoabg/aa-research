package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ive {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final int k;
    public final float l;
    public final android.util.Size m;
    public final android.graphics.Rect n;
    public final android.graphics.Rect o;
    public final java.util.List p;
    public final com.google.android.gms.car.display.CarDisplayUiFeatures q;
    public final com.google.android.gms.car.display.CarDisplayBlendedUiConfig r;

    public /* synthetic */ ive(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, int i10, float f2, android.util.Size size, android.graphics.Rect rect, android.graphics.Rect rect2, java.util.List list, com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeatures, com.google.android.gms.car.display.CarDisplayBlendedUiConfig carDisplayBlendedUiConfig, int i11) {
        android.util.Size size2 = (i11 & 4096) != 0 ? new android.util.Size(0, 0) : size;
        android.graphics.Rect rect3 = (i11 & 8192) != 0 ? new android.graphics.Rect() : rect;
        android.graphics.Rect rect4 = (i11 & 16384) != 0 ? new android.graphics.Rect() : rect2;
        java.util.List list2 = (32768 & i11) != 0 ? defpackage.afce.a : list;
        com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeatures2 = (65536 & i11) != 0 ? new com.google.android.gms.car.display.CarDisplayUiFeatures(0, 0) : carDisplayUiFeatures;
        int i12 = i11 & 1024;
        int i13 = i11 & 512;
        int i14 = i11 & 256;
        int i15 = i11 & 128;
        int i16 = i11 & 64;
        int i17 = i11 & 32;
        int i18 = i11 & 16;
        int i19 = i11 & 8;
        int i20 = i11 & 4;
        int i21 = i11 & 2;
        int i22 = i11 & 1;
        float f3 = (i11 & 2048) != 0 ? 0.0f : f2;
        int i23 = i12 != 0 ? 0 : i10;
        float f4 = i13 != 0 ? 0.0f : f;
        int i24 = i14 != 0 ? 0 : i9;
        int i25 = i15 != 0 ? 0 : i8;
        int i26 = i16 != 0 ? 0 : i7;
        int i27 = i17 != 0 ? 0 : i6;
        int i28 = i18 != 0 ? 0 : i5;
        int i29 = i19 != 0 ? 0 : i4;
        com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeatures3 = carDisplayUiFeatures2;
        int i30 = i20 != 0 ? 0 : i3;
        java.util.List list3 = list2;
        int i31 = i21 != 0 ? 0 : i2;
        android.graphics.Rect rect5 = rect4;
        int i32 = 1 == i22 ? 0 : i;
        com.google.android.gms.car.display.CarDisplayBlendedUiConfig carDisplayBlendedUiConfig2 = (i11 & 131072) != 0 ? null : carDisplayBlendedUiConfig;
        size2.getClass();
        rect3.getClass();
        rect5.getClass();
        list3.getClass();
        carDisplayUiFeatures3.getClass();
        this.a = i32;
        this.b = i31;
        this.c = i30;
        this.d = i29;
        this.e = i28;
        this.f = i27;
        this.g = i26;
        this.h = i25;
        this.i = i24;
        this.j = f4;
        this.k = i23;
        this.l = f3;
        this.m = size2;
        this.n = rect3;
        this.o = rect5;
        this.p = list3;
        this.q = carDisplayUiFeatures3;
        this.r = carDisplayBlendedUiConfig2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ive)) {
            return false;
        }
        defpackage.ive iveVar = (defpackage.ive) obj;
        return this.a == iveVar.a && this.b == iveVar.b && this.c == iveVar.c && this.d == iveVar.d && this.e == iveVar.e && this.f == iveVar.f && this.g == iveVar.g && this.h == iveVar.h && this.i == iveVar.i && java.lang.Float.compare(this.j, iveVar.j) == 0 && this.k == iveVar.k && java.lang.Float.compare(this.l, iveVar.l) == 0 && defpackage.afga.f(this.m, iveVar.m) && defpackage.afga.f(this.n, iveVar.n) && defpackage.afga.f(this.o, iveVar.o) && defpackage.afga.f(this.p, iveVar.p) && defpackage.afga.f(this.q, iveVar.q) && defpackage.afga.f(this.r, iveVar.r);
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((((((((((((((((((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + java.lang.Float.floatToIntBits(this.j)) * 31) + this.k) * 31) + java.lang.Float.floatToIntBits(this.l)) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode();
        com.google.android.gms.car.display.CarDisplayBlendedUiConfig carDisplayBlendedUiConfig = this.r;
        return (iFloatToIntBits * 31) + (carDisplayBlendedUiConfig == null ? 0 : carDisplayBlendedUiConfig.hashCode());
    }

    public final java.lang.String toString() {
        return "DisplayParams(selectedIndex=" + this.a + ", codecWidth=" + this.b + ", codecHeight=" + this.c + ", fps=" + this.d + ", dispWidth=" + this.e + ", dispHeight=" + this.f + ", dispLeft=" + this.g + ", dispTop=" + this.h + ", dpi=" + this.i + ", pixelAspectRatio=" + this.j + ", decoderAdditionalDepth=" + this.k + ", scaledPixelAspectRatio=" + this.l + ", scaledDimensions=" + this.m + ", stableInsets=" + this.n + ", contentInsets=" + this.o + ", cutouts=" + this.p + ", carDisplayUiFeatures=" + this.q + ", blendedUiConfig=" + this.r + ")";
    }

    public ive() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0.0f, null, null, null, null, null, null, 262143);
    }
}
