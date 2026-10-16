package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ckl extends defpackage.cyc<defpackage.cle> {
    private final float a;
    private final float b;
    private final float c;
    private final float g;
    private final float j;
    private final float k;
    private final long l;
    private final defpackage.cld m;
    private final boolean n;
    private final long p;
    private final long q;
    private final int r;
    private final defpackage.cko u;
    private final float d = 0.0f;
    private final float f = 0.0f;
    private final float h = 0.0f;
    private final float i = 0.0f;
    private final defpackage.ckz o = null;
    private final int s = 3;
    private final defpackage.cke t = null;

    public ckl(float f, float f2, float f3, float f4, float f5, float f6, long j, defpackage.cld cldVar, boolean z, long j2, long j3, int i, defpackage.cko ckoVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.g = f4;
        this.j = f5;
        this.k = f6;
        this.l = j;
        this.m = cldVar;
        this.n = z;
        this.p = j2;
        this.q = j3;
        this.r = i;
        this.u = ckoVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.cle(this.a, this.b, this.c, this.g, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.u);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.cle cleVar = (defpackage.cle) cgeVar;
        cleVar.a = this.a;
        cleVar.b = this.b;
        cleVar.c = this.c;
        cleVar.d = this.g;
        cleVar.e = this.j;
        cleVar.f = this.k;
        cleVar.g = this.l;
        cleVar.h = this.m;
        cleVar.i = this.n;
        cleVar.j = this.p;
        cleVar.k = this.q;
        cleVar.l = this.r;
        cleVar.m = 3;
        cleVar.n = this.u;
        defpackage.dai.F(cleVar, cleVar.o);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ckl)) {
            return false;
        }
        defpackage.ckl cklVar = (defpackage.ckl) obj;
        if (java.lang.Float.compare(this.a, cklVar.a) != 0 || java.lang.Float.compare(this.b, cklVar.b) != 0 || java.lang.Float.compare(this.c, cklVar.c) != 0) {
            return false;
        }
        float f = cklVar.d;
        float f2 = cklVar.f;
        if (java.lang.Float.compare(this.g, cklVar.g) != 0) {
            return false;
        }
        float f3 = cklVar.h;
        float f4 = cklVar.i;
        if (java.lang.Float.compare(this.j, cklVar.j) != 0 || java.lang.Float.compare(this.k, cklVar.k) != 0 || this.l != cklVar.l || !defpackage.afga.f(this.m, cklVar.m) || this.n != cklVar.n) {
            return false;
        }
        defpackage.ckz ckzVar = cklVar.o;
        if (this.p == cklVar.p && this.q == cklVar.q && this.r == cklVar.r) {
            int i = cklVar.s;
            defpackage.cke ckeVar = cklVar.t;
            return defpackage.afga.f(this.u, cklVar.u);
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 29791) + java.lang.Float.floatToIntBits(this.g)) * 29791) + java.lang.Float.floatToIntBits(this.j)) * 31) + java.lang.Float.floatToIntBits(this.k);
        long j = this.l;
        int iHashCode = (((iFloatToIntBits * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.m.hashCode();
        boolean z = this.n;
        int iHashCode2 = this.u.hashCode();
        int i = true != z ? 1237 : 1231;
        long j2 = this.p;
        long j3 = this.q;
        return (((((((((((iHashCode * 31) + i) * 961) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + this.r) * 31) + 3) * 961) + iHashCode2;
    }

    public final java.lang.String toString() {
        int i = this.r;
        long j = this.q;
        long j2 = this.p;
        return "GraphicsLayerElement(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha=" + this.c + ", translationX=0.0, translationY=0.0, shadowElevation=" + this.g + ", rotationX=0.0, rotationY=0.0, rotationZ=" + this.j + ", cameraDistance=" + this.k + ", transformOrigin=" + defpackage.cli.a(this.l) + ", shape=" + this.m + ", clip=" + this.n + ", renderEffect=null, ambientShadowColor=" + defpackage.ckd.g(j2) + ", spotShadowColor=" + defpackage.ckd.g(j) + ", compositingStrategy=" + defpackage.cki.a(i) + ", blendMode=" + defpackage.cjw.a(3) + ", colorFilter=null, outsets=" + this.u + ")";
    }
}
