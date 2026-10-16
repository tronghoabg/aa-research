package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cju {
    public final android.graphics.Path a;
    public android.graphics.Matrix b;
    private android.graphics.RectF c;
    private float[] d;

    public /* synthetic */ cju(byte[] bArr) {
        this(new android.graphics.Path());
    }

    public final int a() {
        return this.a.getFillType() == android.graphics.Path.FillType.EVEN_ODD ? 1 : 0;
    }

    public final defpackage.cjj b() {
        android.graphics.RectF rectF = this.c;
        if (rectF == null) {
            rectF = new android.graphics.RectF();
            this.c = rectF;
        }
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new defpackage.cjj(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void c() {
        this.a.close();
    }

    public final void d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void f(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    public final void g(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    public final void h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    public final void i(float f, float f2) {
        this.a.rLineTo(f, f2);
    }

    public final void j(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    public final void k() {
        this.a.reset();
    }

    public final void l() {
        this.a.rewind();
    }

    public final void m(int i) {
        this.a.setFillType(i == 1 ? android.graphics.Path.FillType.EVEN_ODD : android.graphics.Path.FillType.WINDING);
    }

    public final void n(long j) {
        android.graphics.Matrix matrix = this.b;
        if (matrix == null) {
            this.b = new android.graphics.Matrix();
        } else {
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.b;
        matrix2.getClass();
        matrix2.setTranslate(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        android.graphics.Path path = this.a;
        android.graphics.Matrix matrix3 = this.b;
        matrix3.getClass();
        path.transform(matrix3);
    }

    public final void o(defpackage.cju cjuVar, defpackage.cju cjuVar2, int i) {
        this.a.op(cjuVar.a, cjuVar2.a, i == 0 ? android.graphics.Path.Op.DIFFERENCE : android.graphics.Path.Op.INTERSECT);
    }

    public final void p(defpackage.cju cjuVar) {
        this.a.addPath(cjuVar.a, 0.0f, 0.0f);
    }

    public final void q(defpackage.cjj cjjVar) {
        float f = cjjVar.b;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(cjjVar.c) || java.lang.Float.isNaN(cjjVar.d) || java.lang.Float.isNaN(cjjVar.e)) {
            defpackage.cjv.a("Invalid rectangle, make sure no value is NaN");
        }
        android.graphics.RectF rectF = this.c;
        if (rectF == null) {
            rectF = new android.graphics.RectF();
            this.c = rectF;
        }
        rectF.getClass();
        rectF.set(f, cjjVar.c, cjjVar.d, cjjVar.e);
        android.graphics.Path path = this.a;
        android.graphics.RectF rectF2 = this.c;
        rectF2.getClass();
        path.addRect(rectF2, android.graphics.Path.Direction.CCW);
    }

    public final void r(defpackage.cjk cjkVar) {
        android.graphics.RectF rectF = this.c;
        if (rectF == null) {
            rectF = new android.graphics.RectF();
            this.c = rectF;
        }
        rectF.getClass();
        rectF.set(cjkVar.a, cjkVar.b, cjkVar.c, cjkVar.d);
        float[] fArr = this.d;
        if (fArr == null) {
            fArr = new float[8];
            this.d = fArr;
        }
        fArr.getClass();
        long j = cjkVar.e;
        fArr[0] = java.lang.Float.intBitsToFloat((int) (j >> 32));
        fArr[1] = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        long j2 = cjkVar.f;
        fArr[2] = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        fArr[3] = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        long j3 = cjkVar.g;
        fArr[4] = java.lang.Float.intBitsToFloat((int) (j3 >> 32));
        fArr[5] = java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L));
        long j4 = cjkVar.h;
        fArr[6] = java.lang.Float.intBitsToFloat((int) (j4 >> 32));
        fArr[7] = java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L));
        android.graphics.Path path = this.a;
        android.graphics.RectF rectF2 = this.c;
        rectF2.getClass();
        float[] fArr2 = this.d;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, android.graphics.Path.Direction.CCW);
    }

    public cju(android.graphics.Path path) {
        this.a = path;
    }

    public cju() {
        this((byte[]) null);
    }
}
