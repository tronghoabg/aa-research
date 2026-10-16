package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class ckd extends cxt<ckw> {
    private final float a;
    private final float b;
    private final float c;
    private final float g;
    private final float j;
    private final float k;
    private final long l;
    private final ckv m;
    private final boolean n;
    private final long p;
    private final long q;
    private final int r;
    private final ckg u;
    private final float d = BitmapDescriptorFactory.HUE_RED;
    private final float f = BitmapDescriptorFactory.HUE_RED;
    private final float h = BitmapDescriptorFactory.HUE_RED;
    private final float i = BitmapDescriptorFactory.HUE_RED;
    private final ckr o = null;
    private final int s = 3;
    private final cjw t = null;

    public ckd(float f, float f2, float f3, float f4, float f5, float f6, long j, ckv ckvVar, boolean z, long j2, long j3, int i, ckg ckgVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.g = f4;
        this.j = f5;
        this.k = f6;
        this.l = j;
        this.m = ckvVar;
        this.n = z;
        this.p = j2;
        this.q = j3;
        this.r = i;
        this.u = ckgVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new ckw(this.a, this.b, this.c, this.g, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.u);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ckw ckwVar = (ckw) cfxVar;
        ckwVar.a = this.a;
        ckwVar.b = this.b;
        ckwVar.c = this.c;
        ckwVar.d = this.g;
        ckwVar.e = this.j;
        ckwVar.f = this.k;
        ckwVar.g = this.l;
        ckwVar.h = this.m;
        ckwVar.i = this.n;
        ckwVar.j = this.p;
        ckwVar.k = this.q;
        ckwVar.l = this.r;
        ckwVar.m = 3;
        ckwVar.n = this.u;
        cjn.v(ckwVar, ckwVar.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckd)) {
            return false;
        }
        ckd ckdVar = (ckd) obj;
        if (Float.compare(this.a, ckdVar.a) != 0 || Float.compare(this.b, ckdVar.b) != 0 || Float.compare(this.c, ckdVar.c) != 0) {
            return false;
        }
        float f = ckdVar.d;
        if (Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) != 0) {
            return false;
        }
        float f2 = ckdVar.f;
        if (Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) != 0 || Float.compare(this.g, ckdVar.g) != 0) {
            return false;
        }
        float f3 = ckdVar.h;
        if (Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) != 0) {
            return false;
        }
        float f4 = ckdVar.i;
        if (Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) != 0 || Float.compare(this.j, ckdVar.j) != 0 || Float.compare(this.k, ckdVar.k) != 0 || this.l != ckdVar.l || !affa.f(this.m, ckdVar.m) || this.n != ckdVar.n) {
            return false;
        }
        ckr ckrVar = ckdVar.o;
        if (this.p == ckdVar.p && this.q == ckdVar.q && this.r == ckdVar.r) {
            int i = ckdVar.s;
            cjw cjwVar = ckdVar.t;
            return affa.f(this.u, ckdVar.u);
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((((((((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) * 31) + Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) * 31) + Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k);
        long j = this.l;
        int iHashCode = (((iFloatToIntBits * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.m.hashCode();
        boolean z = this.n;
        int iHashCode2 = this.u.hashCode();
        int i = true != z ? 1237 : 1231;
        long j2 = this.p;
        long j3 = this.q;
        return (((((((((((iHashCode * 31) + i) * 961) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + this.r) * 31) + 3) * 961) + iHashCode2;
    }

    public final String toString() {
        int i = this.r;
        long j = this.q;
        long j2 = this.p;
        return "GraphicsLayerElement(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha=" + this.c + ", translationX=0.0, translationY=0.0, shadowElevation=" + this.g + ", rotationX=0.0, rotationY=0.0, rotationZ=" + this.j + ", cameraDistance=" + this.k + ", transformOrigin=" + cla.a(this.l) + ", shape=" + this.m + ", clip=" + this.n + ", renderEffect=null, ambientShadowColor=" + cjv.g(j2) + ", spotShadowColor=" + cjv.g(j) + ", compositingStrategy=" + cka.a(i) + ", blendMode=" + cjo.a(3) + ", colorFilter=null, outsets=" + this.u + ")";
    }
}
