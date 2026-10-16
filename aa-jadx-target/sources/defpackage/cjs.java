package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cjs {
    public android.graphics.Paint a;
    public int b;
    public android.graphics.Shader c;
    public defpackage.cke d;

    public cjs() {
        this(new android.graphics.Paint(7));
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
        android.graphics.Paint.Cap strokeCap = this.a.getStrokeCap();
        if (strokeCap == null || (i = defpackage.cjt.a[strokeCap.ordinal()]) == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int f() {
        int i;
        android.graphics.Paint.Join strokeJoin = this.a.getStrokeJoin();
        if (strokeJoin == null || (i = defpackage.cjt.b[strokeJoin.ordinal()]) == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final long g() {
        android.graphics.Paint paint = this.a;
        return android.os.Build.VERSION.SDK_INT >= 29 ? defpackage.clj.a.a(paint) : ((long) paint.getColor()) << 32;
    }

    public final void h(float f) {
        this.a.setAlpha((int) java.lang.Math.rint(f * 255.0f));
    }

    public final void i(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        android.graphics.Paint paint = this.a;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            defpackage.clj.a.b(paint, i);
        } else {
            paint.setXfermode(new android.graphics.PorterDuffXfermode(defpackage.bzo.x(i)));
        }
    }

    public final void j(long j) {
        android.graphics.Paint paint = this.a;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            defpackage.clj.a.c(paint, j);
        } else {
            float[] fArr = defpackage.clr.a;
            paint.setColor((int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32));
        }
    }

    public final void k(defpackage.cke ckeVar) {
        this.d = ckeVar;
        this.a.setColorFilter(ckeVar != null ? ckeVar.b : null);
    }

    public final void l(int i) {
        this.a.setFilterBitmap(1 == i);
    }

    public final void m(android.graphics.Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    public final void n(int i) {
        android.graphics.Paint.Cap cap;
        android.graphics.Paint paint = this.a;
        if (i == 2) {
            cap = android.graphics.Paint.Cap.SQUARE;
        } else {
            cap = i == 1 ? android.graphics.Paint.Cap.ROUND : android.graphics.Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public final void o(int i) {
        android.graphics.Paint.Join join;
        android.graphics.Paint paint = this.a;
        if (i == 0) {
            join = android.graphics.Paint.Join.MITER;
        } else {
            join = i == 2 ? android.graphics.Paint.Join.BEVEL : android.graphics.Paint.Join.ROUND;
        }
        paint.setStrokeJoin(join);
    }

    public final void p(float f) {
        this.a.setStrokeMiter(f);
    }

    public final void q(float f) {
        this.a.setStrokeWidth(f);
    }

    public final void r(int i) {
        this.a.setStyle(i == 1 ? android.graphics.Paint.Style.STROKE : android.graphics.Paint.Style.FILL);
    }

    public cjs(android.graphics.Paint paint) {
        this.a = paint;
        this.b = 3;
    }
}
