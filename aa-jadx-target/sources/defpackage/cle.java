package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cle extends defpackage.cge implements defpackage.cxe, defpackage.czc {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public long g;
    public defpackage.cld h;
    public boolean i;
    public long j;
    public long k;
    public int l;
    public defpackage.cko n;
    public int m = 3;
    public final defpackage.affc o = new defpackage.chq(this, 3);

    public cle(float f, float f2, float f3, float f4, float f5, float f6, long j, defpackage.cld cldVar, boolean z, long j2, long j3, int i, defpackage.cko ckoVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = j;
        this.h = cldVar;
        this.i = z;
        this.j = j2;
        this.k = j3;
        this.l = i;
        this.n = ckoVar;
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        defpackage.cux cuxVarV = ctxVar.v(j);
        return cubVar.dS(cuxVarV.a, cuxVarV.b, defpackage.afcf.a, new defpackage.beh(cuxVarV, this, 17));
    }

    @Override // defpackage.czc
    public final void g(defpackage.dek dekVar) {
        if (this.i) {
            dekVar.a(defpackage.def.U, this.h);
        }
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.c(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.d(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.e(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.f(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    public final java.lang.String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha = " + this.c + ", translationX=0.0, translationY=0.0, shadowElevation=" + this.d + ", rotationX=0.0, rotationY=0.0, rotationZ=" + this.e + ", cameraDistance=" + this.f + ", transformOrigin=" + defpackage.cli.a(this.g) + ", shape=" + this.h + ", clip=" + this.i + ", renderEffect=null, ambientShadowColor=" + defpackage.ckd.g(this.j) + ", spotShadowColor=" + defpackage.ckd.g(this.k) + ", compositingStrategy=" + defpackage.cki.a(this.l) + ", blendMode=" + defpackage.cjw.a(this.m) + ", colorFilter=nulloutsets=" + this.n + ")";
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.czc
    public final boolean z() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ void D() {
    }
}
