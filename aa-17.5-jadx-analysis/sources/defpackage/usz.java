package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class usz {
    public final ttn a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final double n;
    public final double o;
    public final double p;
    public final float q;
    public final float r;
    public final float s;
    public final float t;
    public final tpj u;
    public final float[] v;
    public final float[] w;
    public final float[] x;
    public final float[] y;

    public usz() {
        this(ttn.a, 0, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, 0, 0.0d, 0.0d, 0.0d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new tpj(new too[]{new too(), new too(), new too(), new too()}), new float[16], new float[16], new float[16], new float[16]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof usz) {
            usz uszVar = (usz) obj;
            if (this.a.equals(uszVar.a) && this.b == uszVar.b && this.c == uszVar.c && this.d == uszVar.d && this.e == uszVar.e && this.f == uszVar.f && this.g == uszVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g));
    }

    public usz(ttn ttnVar, int i, int i2, float f, float f2, float f3, float f4, int i3, int i4, int i5, int i6, int i7, int i8, double d, double d2, double d3, float f5, float f6, float f7, float f8, tpj tpjVar, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        this.a = ttnVar;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = i8;
        this.n = d;
        this.o = d2;
        this.p = d3;
        this.q = f5;
        this.r = f6;
        this.s = f7;
        this.t = f8;
        this.u = tpjVar;
        this.w = fArr2;
        this.v = fArr;
        this.x = fArr3;
        this.y = fArr4;
    }
}
