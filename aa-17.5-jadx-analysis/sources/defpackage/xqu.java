package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class xqu {
    public static final float[] a = xsz.e(10000.0f);
    public final Float b;
    public final Float c;
    public final float[] d;
    public final float e;
    public final float f;
    public final float[] g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final float k;
    public final float l;
    public final float m;
    private final Float n;
    private final Float o;
    private final float p;

    public /* synthetic */ xqu(Float f, Float f2, float[] fArr, float f3, float f4, float[] fArr2, boolean z, boolean z2, boolean z3, float f5, int i) {
        fArr = (i & 16) != 0 ? xsz.e(32.0f) : fArr;
        f3 = (i & 32) != 0 ? 0.5f : f3;
        f4 = (i & 64) != 0 ? 0.5f : f4;
        fArr2 = (i & 128) != 0 ? xta.g(BitmapDescriptorFactory.HUE_RED) : fArr2;
        int i2 = i & 8;
        int i3 = i & 4;
        f2 = i2 != 0 ? null : f2;
        f = i3 != 0 ? null : f;
        fArr.getClass();
        fArr2.getClass();
        this.n = null;
        this.o = null;
        this.b = f;
        this.c = f2;
        this.d = fArr;
        this.e = f3;
        this.f = f4;
        this.g = fArr2;
        this.p = BitmapDescriptorFactory.HUE_RED;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = f5;
        this.l = Math.max(xsz.c(fArr) + xsz.a(fArr), xsz.d(fArr) + xsz.b(fArr));
        this.m = Math.max(xsz.c(fArr) + xsz.d(fArr), xsz.a(fArr) + xsz.b(fArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqu)) {
            return false;
        }
        xqu xquVar = (xqu) obj;
        Float f = xquVar.n;
        if (!affa.f(null, null)) {
            return false;
        }
        Float f2 = xquVar.o;
        if (!affa.f(null, null) || !affa.f(this.b, xquVar.b) || !affa.f(this.c, xquVar.c) || !affa.f(this.d, xquVar.d) || Float.compare(this.e, xquVar.e) != 0 || Float.compare(this.f, xquVar.f) != 0 || !affa.f(this.g, xquVar.g)) {
            return false;
        }
        float f3 = xquVar.p;
        return Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && this.h == xquVar.h && this.i == xquVar.i && this.j == xquVar.j && Float.compare(this.k, xquVar.k) == 0;
    }

    public final int hashCode() {
        Float f = this.b;
        int iHashCode = f == null ? 0 : f.hashCode();
        Float f2 = this.c;
        return (((((((((((((((((((iHashCode * 31) + (f2 != null ? f2.hashCode() : 0)) * 31) + Arrays.hashCode(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Arrays.hashCode(this.g)) * 31) + Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) * 31) + a.f(this.h)) * 31) + a.f(this.i)) * 31) + a.f(this.j)) * 31) + Float.floatToIntBits(this.k);
    }

    public final String toString() {
        return "LayoutConfig(centerX=null, centerY=null, height=" + this.b + ", width=" + this.c + ", cornerRadii=" + ("CornerRadii(values=" + Arrays.toString(this.d) + ")") + ", anchorPercentX=" + this.e + ", anchorPercentY=" + this.f + ", margins=" + ("Margins(values=" + Arrays.toString(this.g) + ")") + ", padding=0.0, updateHeightForBounds=" + this.h + ", updateWidthForBounds=" + this.i + ", limitRadiiByBounds=" + this.j + ", spread=" + this.k + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ xqu() {
        float[] fArrE = xsz.e(32.0f);
        float[] fArrG = xta.g(BitmapDescriptorFactory.HUE_RED);
        float f = 0.5f;
        this(null, null, fArrE, f, f, fArrG, true, true, true, (xta.b(fArrG) + xta.f(fArrG)) / 4.0f, 3);
    }
}
