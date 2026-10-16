package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class cjm {
    public final Path a;
    public Matrix b;
    private RectF c;
    private float[] d;

    public /* synthetic */ cjm(byte[] bArr) {
        this(new Path());
    }

    public final int a() {
        return this.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    public final cjb b() {
        RectF rectF = this.c;
        if (rectF == null) {
            rectF = new RectF();
            this.c = rectF;
        }
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new cjb(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    public final void d(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void e(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    public final void f(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    public final void g(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    public final void h(float f, float f2) {
        this.a.rLineTo(f, f2);
    }

    public final void i(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    public final void j() {
        this.a.reset();
    }

    public final void k() {
        this.a.rewind();
    }

    public final void l(int i) {
        this.a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void m(long j) {
        Matrix matrix = this.b;
        if (matrix == null) {
            this.b = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.b;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Path path = this.a;
        Matrix matrix3 = this.b;
        matrix3.getClass();
        path.transform(matrix3);
    }

    public final void n(cjm cjmVar, cjm cjmVar2, int i) {
        this.a.op(cjmVar.a, cjmVar2.a, i == 0 ? Path.Op.DIFFERENCE : Path.Op.INTERSECT);
    }

    public final void o(cjm cjmVar) {
        this.a.addPath(cjmVar.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public final void p(cjb cjbVar) {
        float f = cjbVar.b;
        if (Float.isNaN(f) || Float.isNaN(cjbVar.c) || Float.isNaN(cjbVar.d) || Float.isNaN(cjbVar.e)) {
            cjn.a("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = this.c;
        if (rectF == null) {
            rectF = new RectF();
            this.c = rectF;
        }
        rectF.getClass();
        rectF.set(f, cjbVar.c, cjbVar.d, cjbVar.e);
        Path path = this.a;
        RectF rectF2 = this.c;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public final void q(cjc cjcVar) {
        RectF rectF = this.c;
        if (rectF == null) {
            rectF = new RectF();
            this.c = rectF;
        }
        rectF.getClass();
        rectF.set(cjcVar.a, cjcVar.b, cjcVar.c, cjcVar.d);
        float[] fArr = this.d;
        if (fArr == null) {
            fArr = new float[8];
            this.d = fArr;
        }
        fArr.getClass();
        long j = cjcVar.e;
        fArr[0] = Float.intBitsToFloat((int) (j >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j & 4294967295L));
        long j2 = cjcVar.f;
        fArr[2] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long j3 = cjcVar.g;
        fArr[4] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long j4 = cjcVar.h;
        fArr[6] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        Path path = this.a;
        RectF rectF2 = this.c;
        rectF2.getClass();
        float[] fArr2 = this.d;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public cjm(Path path) {
        this.a = path;
    }

    public cjm() {
        this((byte[]) null);
    }
}
