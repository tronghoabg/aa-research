package defpackage;

/* loaded from: classes.dex */
public final class ckw extends cfx implements cwu, cyu {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public long g;
    public ckv h;
    public boolean i;
    public long j;
    public long k;
    public int l;
    public ckg n;
    public int m = 3;
    public final afec o = new cep(this, 4);

    public ckw(float f, float f2, float f3, float f4, float f5, float f6, long j, ckv ckvVar, boolean z, long j2, long j3, int i, ckg ckgVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = j;
        this.h = ckvVar;
        this.i = z;
        this.j = j2;
        this.k = j3;
        this.l = i;
        this.n = ckgVar;
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        cuo cuoVarV = ctoVar.v(j);
        return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new bee(cuoVarV, this, 17));
    }

    @Override // defpackage.cyu
    public final void g(dec decVar) {
        if (this.i) {
            decVar.a(ddx.T, this.h);
        }
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int h(csq csqVar, csp cspVar, int i) {
        return ty.d(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int i(csq csqVar, csp cspVar, int i) {
        return ty.e(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int j(csq csqVar, csp cspVar, int i) {
        return ty.f(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int k(csq csqVar, csp cspVar, int i) {
        return ty.g(new cwt(this), csqVar, cspVar, i);
    }

    public final String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha = " + this.c + ", translationX=0.0, translationY=0.0, shadowElevation=" + this.d + ", rotationX=0.0, rotationY=0.0, rotationZ=" + this.e + ", cameraDistance=" + this.f + ", transformOrigin=" + cla.a(this.g) + ", shape=" + this.h + ", clip=" + this.i + ", renderEffect=null, ambientShadowColor=" + cjv.g(this.j) + ", spotShadowColor=" + cjv.g(this.k) + ", compositingStrategy=" + cka.a(this.l) + ", blendMode=" + cjo.a(this.m) + ", colorFilter=nulloutsets=" + this.n + ")";
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.cyu
    public final boolean z() {
        return false;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ void D() {
    }
}
