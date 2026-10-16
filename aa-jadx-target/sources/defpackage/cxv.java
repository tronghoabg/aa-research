package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class cxv extends defpackage.cxu implements defpackage.ctx {
    private java.util.Map f;
    public final defpackage.cyl g;
    public long h = 0;
    public final defpackage.ctw p = new defpackage.ctw(this);
    public final defpackage.aal q;
    private defpackage.ctz r;

    public cxv(defpackage.cyl cylVar) {
        this.g = cylVar;
        defpackage.aal aalVar = defpackage.aam.a;
        this.q = new defpackage.aal(6);
    }

    public final void B(long j) {
        if (this.h != j) {
            this.h = j;
            defpackage.cxw cxwVar = L().w.p;
            if (cxwVar != null) {
                cxwVar.t();
            }
            W(this.g);
        }
        if (this.m) {
            return;
        }
        R(K());
    }

    public final void C(defpackage.ctz ctzVar) {
        java.util.Map map;
        if (ctzVar != null) {
            z((((long) ctzVar.c()) << 32) | (((long) ctzVar.b()) & 4294967295L));
        } else {
            z(0L);
        }
        if (!defpackage.afga.f(this.r, ctzVar) && ctzVar != null && ((((map = this.f) != null && !map.isEmpty()) || !ctzVar.f().isEmpty()) && !defpackage.afga.f(ctzVar.f(), this.f))) {
            ((defpackage.cxw) u()).p.e();
            java.util.Map linkedHashMap = this.f;
            if (linkedHashMap == null) {
                linkedHashMap = new java.util.LinkedHashMap();
                this.f = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(ctzVar.f());
        }
        this.r = ctzVar;
    }

    public final long D(defpackage.cxv cxvVar) {
        long jD = 0;
        while (!defpackage.afga.f(this, cxvVar)) {
            boolean z = this.k;
            jD = defpackage.dlw.d(jD, this.h);
            defpackage.cyl cylVar = this.g.x;
            cylVar.getClass();
            this = cylVar.C();
            this.getClass();
        }
        return jD;
    }

    @Override // defpackage.cxu
    public final long I() {
        return this.h;
    }

    @Override // defpackage.cxu
    public final defpackage.ctc J() {
        return this.p;
    }

    @Override // defpackage.cxu
    public final defpackage.ctz K() {
        defpackage.ctz ctzVar = this.r;
        if (ctzVar != null) {
            return ctzVar;
        }
        defpackage.csc.a("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new defpackage.afap();
    }

    @Override // defpackage.cxu, defpackage.cya
    public final defpackage.cxl L() {
        return this.g.t;
    }

    @Override // defpackage.cxu
    public final defpackage.cxu N() {
        defpackage.cyl cylVar = this.g.w;
        if (cylVar != null) {
            return cylVar.C();
        }
        return null;
    }

    @Override // defpackage.cxu
    public final defpackage.cxu O() {
        defpackage.cyl cylVar = this.g.x;
        if (cylVar != null) {
            return cylVar.C();
        }
        return null;
    }

    @Override // defpackage.cxu
    public final void S() {
        dD(this.h, 0.0f, null);
    }

    @Override // defpackage.cxu
    public final boolean V() {
        return this.r != null;
    }

    @Override // defpackage.dlo
    public final float a() {
        return this.g.a();
    }

    @Override // defpackage.dlu
    public final float b() {
        return this.g.b();
    }

    public int c(int i) {
        throw null;
    }

    public int d(int i) {
        throw null;
    }

    @Override // defpackage.cux
    public final void dD(long j, float f, defpackage.affc affcVar) {
        B(j);
        if (this.l) {
            return;
        }
        s();
    }

    @Override // defpackage.cxu, defpackage.csz
    public final boolean dU() {
        return true;
    }

    public int e(int i) {
        throw null;
    }

    public int f(int i) {
        throw null;
    }

    @Override // defpackage.cux, defpackage.csy
    public final java.lang.Object g() {
        return this.g.g();
    }

    @Override // defpackage.csz
    public final defpackage.dlz p() {
        return this.g.p();
    }

    protected void s() {
        K().h();
    }

    public final long t() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    public final defpackage.cwf u() {
        defpackage.cxw cxwVar = this.g.t.w.p;
        cxwVar.getClass();
        return cxwVar;
    }
}
