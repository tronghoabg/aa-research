package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class cje implements cju {
    public Canvas a = cjf.a;
    private Rect b;
    private Rect c;

    @Override // defpackage.cju
    public final void a(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.cju
    public final void b(float[] fArr) {
        if (czz.X(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        cjn.d(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.cju
    public final void c() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ckf.b(this.a, false);
    }

    @Override // defpackage.cju
    public final void d() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ckf.b(this.a, true);
    }

    @Override // defpackage.cju
    public final void e() {
        this.a.restore();
    }

    @Override // defpackage.cju
    public final void f(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.cju
    public final void g() {
        this.a.save();
    }

    @Override // defpackage.cju
    public final void h(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.cju
    public final void i(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.cju
    public final void j(long j, float f, cjk cjkVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), f, cjn.c(cjkVar));
    }

    @Override // defpackage.cju
    public final void k(long j, long j2, cjk cjkVar) {
        int i = (int) (4294967295L & j);
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), cjn.c(cjkVar));
    }

    @Override // defpackage.cju
    public final void l(float f, float f2, float f3, float f4, cjk cjkVar) {
        this.a.drawRect(f, f2, f3, f4, cjn.c(cjkVar));
    }

    @Override // defpackage.cju
    public final void m(float f, float f2, float f3, float f4, float f5, float f6, cjk cjkVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, cjn.c(cjkVar));
    }

    @Override // defpackage.cju
    public final void n(cjb cjbVar, cjk cjkVar) {
        this.a.saveLayer(cjbVar.b, cjbVar.c, cjbVar.d, cjbVar.e, cjn.c(cjkVar), 31);
    }

    @Override // defpackage.cju
    public final void o(float f, float f2, float f3, float f4, float f5, float f6, cjk cjkVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, cjn.c(cjkVar));
    }

    @Override // defpackage.cju
    public final void p(cjm cjmVar, cjk cjkVar) {
        boolean z = cjmVar instanceof cjm;
        Canvas canvas = this.a;
        if (!z) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(cjmVar.a, cjn.c(cjkVar));
    }

    @Override // defpackage.cju
    public final void q(cjm cjmVar) {
        this.a.clipPath(cjmVar.a, Region.Op.INTERSECT);
    }

    @Override // defpackage.cju
    public final /* synthetic */ void r(cjb cjbVar) {
        re.g(this, cjbVar);
    }

    @Override // defpackage.cju
    public final void s(cjj cjjVar, long j, cjk cjkVar) {
        this.a.drawBitmap(byx.u(cjjVar), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), cjn.c(cjkVar));
    }

    @Override // defpackage.cju
    public final void t(cjj cjjVar, long j, long j2, long j3, cjk cjkVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapU = byx.u(cjjVar);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapU, rect, rect2, cjn.c(cjkVar));
    }
}
