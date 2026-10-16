package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cjm implements defpackage.ckc {
    public android.graphics.Canvas a = defpackage.cjn.a;
    private android.graphics.Rect b;
    private android.graphics.Rect c;

    @Override // defpackage.ckc
    public final void a(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? android.graphics.Region.Op.DIFFERENCE : android.graphics.Region.Op.INTERSECT);
    }

    @Override // defpackage.ckc
    public final void b(float[] fArr) {
        if (defpackage.cjv.e(fArr)) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        defpackage.bzo.q(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.ckc
    public final void c() {
        defpackage.ckn.g(this.a, false);
    }

    @Override // defpackage.ckc
    public final void d() {
        defpackage.ckn.g(this.a, true);
    }

    @Override // defpackage.ckc
    public final void e() {
        this.a.restore();
    }

    @Override // defpackage.ckc
    public final void f(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.ckc
    public final void g() {
        this.a.save();
    }

    @Override // defpackage.ckc
    public final void h(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.ckc
    public final void i(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.ckc
    public final void j(long j, float f, defpackage.cjs cjsVar) {
        this.a.drawCircle(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j)), f, defpackage.bzo.p(cjsVar));
    }

    @Override // defpackage.ckc
    public final void k(long j, long j2, defpackage.cjs cjsVar) {
        int i = (int) (4294967295L & j);
        this.a.drawLine(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)), defpackage.bzo.p(cjsVar));
    }

    @Override // defpackage.ckc
    public final void l(float f, float f2, float f3, float f4, defpackage.cjs cjsVar) {
        this.a.drawRect(f, f2, f3, f4, defpackage.bzo.p(cjsVar));
    }

    @Override // defpackage.ckc
    public final void m(float f, float f2, float f3, float f4, float f5, float f6, defpackage.cjs cjsVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, defpackage.bzo.p(cjsVar));
    }

    @Override // defpackage.ckc
    public final void n(defpackage.cjj cjjVar, defpackage.cjs cjsVar) {
        this.a.saveLayer(cjjVar.b, cjjVar.c, cjjVar.d, cjjVar.e, defpackage.bzo.p(cjsVar), 31);
    }

    @Override // defpackage.ckc
    public final void o(float f, float f2, float f3, float f4, float f5, float f6, defpackage.cjs cjsVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, defpackage.bzo.p(cjsVar));
    }

    @Override // defpackage.ckc
    public final void p(defpackage.cju cjuVar, defpackage.cjs cjsVar) {
        boolean z = cjuVar instanceof defpackage.cju;
        android.graphics.Canvas canvas = this.a;
        if (!z) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(cjuVar.a, defpackage.bzo.p(cjsVar));
    }

    @Override // defpackage.ckc
    public final void q(defpackage.cju cjuVar) {
        this.a.clipPath(cjuVar.a, android.graphics.Region.Op.INTERSECT);
    }

    @Override // defpackage.ckc
    public final /* synthetic */ void r(defpackage.cjj cjjVar) {
        defpackage.ckn.h(this, cjjVar);
    }

    @Override // defpackage.ckc
    public final void s(defpackage.cjr cjrVar, long j, defpackage.cjs cjsVar) {
        this.a.drawBitmap(defpackage.bzo.s(cjrVar), java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j)), defpackage.bzo.p(cjsVar));
    }

    @Override // defpackage.ckc
    public final void t(defpackage.cjr cjrVar, long j, long j2, long j3, defpackage.cjs cjsVar) {
        if (this.b == null) {
            this.b = new android.graphics.Rect();
            this.c = new android.graphics.Rect();
        }
        android.graphics.Canvas canvas = this.a;
        android.graphics.Bitmap bitmapS = defpackage.bzo.s(cjrVar);
        android.graphics.Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        android.graphics.Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapS, rect, rect2, defpackage.bzo.p(cjsVar));
    }
}
