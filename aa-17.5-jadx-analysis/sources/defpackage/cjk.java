package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* loaded from: classes.dex */
public final class cjk {
    public Paint a;
    public int b;
    public Shader c;
    public cjw d;

    public cjk() {
        this(new Paint(7));
    }

    public final float a() {
        return this.a.getAlpha() / 255.0f;
    }

    public final float b() {
        return this.a.getStrokeMiter();
    }

    public final float c() {
        return this.a.getStrokeWidth();
    }

    public final int d() {
        return !this.a.isFilterBitmap() ? 0 : 1;
    }

    public final int e() {
        int i;
        Paint.Cap strokeCap = this.a.getStrokeCap();
        if (strokeCap == null || (i = cjl.a[strokeCap.ordinal()]) == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int f() {
        int i;
        Paint.Join strokeJoin = this.a.getStrokeJoin();
        if (strokeJoin == null || (i = cjl.b[strokeJoin.ordinal()]) == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final long g() {
        return Build.VERSION.SDK_INT >= 29 ? clb.a.a(this.a) : r2.getColor() << 32;
    }

    public final void h(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    public final void i(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        Paint paint = this.a;
        if (Build.VERSION.SDK_INT >= 29) {
            clb.a.b(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(byx.z(i)));
        }
    }

    public final void j(long j) {
        Paint paint = this.a;
        if (Build.VERSION.SDK_INT >= 29) {
            clb.a.c(paint, j);
        } else {
            float[] fArr = clj.a;
            paint.setColor((int) (cjv.e(j, clj.e) >>> 32));
        }
    }

    public final void k(cjw cjwVar) {
        this.d = cjwVar;
        this.a.setColorFilter(cjwVar != null ? cjwVar.b : null);
    }

    public final void l(int i) {
        this.a.setFilterBitmap(1 == i);
    }

    public final void m(Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    public final void n(int i) {
        this.a.setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : Paint.Cap.BUTT);
    }

    public final void o(int i) {
        this.a.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : Paint.Join.ROUND);
    }

    public final void p(float f) {
        this.a.setStrokeMiter(f);
    }

    public final void q(float f) {
        this.a.setStrokeWidth(f);
    }

    public final void r(int i) {
        this.a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public cjk(Paint paint) {
        this.a = paint;
        this.b = 3;
    }
}
