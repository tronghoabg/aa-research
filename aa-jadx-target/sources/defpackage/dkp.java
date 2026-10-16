package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dkp extends android.text.TextPaint {
    public int a;
    private defpackage.dlc b;
    private defpackage.clc c;
    private defpackage.ckd d;
    private defpackage.cka e;
    private defpackage.bys f;
    private defpackage.cjl g;
    private defpackage.cjs h;
    private defpackage.dai i;

    public dkp(float f) {
        super(1);
        this.density = f;
        this.b = defpackage.dlc.a;
        this.a = 3;
        this.c = defpackage.clc.a;
    }

    private final void g() {
        this.f = null;
        this.e = null;
        this.g = null;
        setShader(null);
    }

    private final defpackage.cjs h() {
        defpackage.cjs cjsVar = this.h;
        if (cjsVar != null) {
            return cjsVar;
        }
        defpackage.cjs cjsVar2 = new defpackage.cjs(this);
        this.h = cjsVar2;
        return cjsVar2;
    }

    public final void a(int i) {
        if (i == this.a) {
            return;
        }
        h().i(i);
        this.a = i;
    }

    public final void b(defpackage.cka ckaVar, long j, float f) {
        g();
    }

    public final void c(long j) {
        defpackage.ckd ckdVar = this.d;
        if ((ckdVar != null && ckdVar.a == j) || j == 16) {
            return;
        }
        this.d = new defpackage.ckd(j);
        float[] fArr = defpackage.clr.a;
        setColor((int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32));
        g();
    }

    public final void d(defpackage.clc clcVar) {
        if (clcVar == null || defpackage.afga.f(this.c, clcVar)) {
            return;
        }
        this.c = clcVar;
        if (defpackage.afga.f(clcVar, defpackage.clc.a)) {
            clearShadowLayer();
            return;
        }
        defpackage.clc clcVar2 = this.c;
        float f = clcVar2.d;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (clcVar2.c >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (this.c.c & 4294967295L));
        long j = this.c.b;
        float[] fArr = defpackage.clr.a;
        setShadowLayer(f, fIntBitsToFloat, fIntBitsToFloat2, (int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32));
    }

    public final void e(defpackage.dlc dlcVar) {
        if (dlcVar == null || defpackage.afga.f(this.b, dlcVar)) {
            return;
        }
        this.b = dlcVar;
        setUnderlineText(dlcVar.a(defpackage.dlc.b));
        setStrikeThruText(this.b.a(defpackage.dlc.c));
    }

    public final void f(defpackage.dai daiVar) {
        if (daiVar == null || defpackage.afga.f(this.i, daiVar)) {
            return;
        }
        this.i = daiVar;
        if (!defpackage.afga.f(daiVar, defpackage.cmn.a)) {
            throw new defpackage.afas();
        }
        setStyle(android.graphics.Paint.Style.FILL);
    }
}
