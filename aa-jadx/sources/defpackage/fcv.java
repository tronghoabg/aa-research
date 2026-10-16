package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fcv extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {
    private static final android.view.animation.Interpolator e = new android.view.animation.LinearInterpolator();
    private static final android.view.animation.Interpolator f = new defpackage.epc();
    private static final int[] g = {-16777216};
    public final defpackage.fcu a;
    public final android.content.res.Resources b;
    public float c;
    public boolean d;
    private float h;
    private final android.animation.Animator i;

    public fcv(android.content.Context context) {
        defpackage.ebl.q(context);
        this.b = context.getResources();
        defpackage.fcu fcuVar = new defpackage.fcu();
        this.a = fcuVar;
        fcuVar.i = g;
        fcuVar.g();
        fcuVar.d(2.5f);
        invalidateSelf();
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new defpackage.oda(this, fcuVar, 1));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(e);
        valueAnimatorOfFloat.addListener(new defpackage.mzz(this, fcuVar, 1));
        this.i = valueAnimatorOfFloat;
    }

    public static final void e(float f2, defpackage.fcu fcuVar) {
        if (f2 <= 0.75f) {
            fcuVar.t = fcuVar.a();
            return;
        }
        int iA = fcuVar.a();
        int[] iArr = fcuVar.i;
        fcuVar.f();
        int i = iArr[0];
        int i2 = iA >> 24;
        int i3 = iA >> 16;
        int i4 = iA >> 8;
        int i5 = iA & 255;
        float f3 = (f2 - 0.75f) / 0.25f;
        int i6 = i4 & 255;
        int i7 = i3 & 255;
        int i8 = i7 + ((int) ((((i >> 16) & 255) - i7) * f3));
        int i9 = i2 & 255;
        fcuVar.t = ((i9 + ((int) (f3 * (((i >> 24) & 255) - i9)))) << 24) | (i8 << 16) | ((i6 + ((int) ((((i >> 8) & 255) - i6) * f3))) << 8) | (i5 + ((int) (((i & 255) - i5) * f3)));
    }

    public final void a(float f2, defpackage.fcu fcuVar, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.d) {
            e(f2, fcuVar);
            double dFloor = java.lang.Math.floor(fcuVar.l / 0.8f) + 1.0d;
            float f3 = fcuVar.j;
            float f4 = fcuVar.k;
            fcuVar.e = f3 + ((((-0.01f) + f4) - f3) * f2);
            fcuVar.f = f4;
            float f5 = fcuVar.l;
            fcuVar.g = f5 + ((((float) dFloor) - f5) * f2);
            return;
        }
        if (f2 != 1.0f || z) {
            float f6 = fcuVar.l;
            if (f2 < 0.5f) {
                interpolation = fcuVar.j;
                interpolation2 = (f.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f7 = fcuVar.j + 0.79f;
                interpolation = f7 - (((1.0f - f.getInterpolation(((-0.5f) + f2) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f7;
            }
            float f8 = f6 + (0.20999998f * f2);
            float f9 = f2 + this.c;
            fcuVar.e = interpolation;
            fcuVar.f = interpolation2;
            fcuVar.g = f8;
            this.h = f9 * 216.0f;
        }
    }

    public final void b(boolean z) {
        this.a.c(z);
        invalidateSelf();
    }

    public final void c(float f2) {
        defpackage.fcu fcuVar = this.a;
        if (f2 != fcuVar.o) {
            fcuVar.o = f2;
        }
        invalidateSelf();
    }

    public final void d(float f2) {
        defpackage.fcu fcuVar = this.a;
        fcuVar.e = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        fcuVar.f = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        defpackage.fcu fcuVar = this.a;
        float f2 = fcuVar.p;
        float fMin = (fcuVar.h / 2.0f) + f2;
        if (f2 <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            fMin = (java.lang.Math.min(bounds.width(), bounds.height()) / 2.0f) - java.lang.Math.max((fcuVar.q * fcuVar.o) / 2.0f, fcuVar.h / 2.0f);
        }
        android.graphics.RectF rectF = fcuVar.a;
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f3 = fcuVar.e;
        float f4 = fcuVar.g;
        float f5 = f3 + f4;
        float f6 = fcuVar.f + f4;
        android.graphics.Paint paint = fcuVar.b;
        paint.setColor(fcuVar.t);
        paint.setAlpha(fcuVar.s);
        float f7 = fcuVar.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, fcuVar.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        float f9 = f5 * 360.0f;
        float f10 = (f6 * 360.0f) - f9;
        canvas.drawArc(rectF, f9, f10, false, paint);
        if (fcuVar.m) {
            android.graphics.Path path = fcuVar.n;
            if (path == null) {
                fcuVar.n = new android.graphics.Path();
                fcuVar.n.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = java.lang.Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f11 = (fcuVar.q * fcuVar.o) / 2.0f;
            fcuVar.n.moveTo(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            fcuVar.n.lineTo(fcuVar.q * fcuVar.o, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            android.graphics.Path path2 = fcuVar.n;
            float f12 = fcuVar.q;
            float f13 = fcuVar.o;
            path2.lineTo((f12 * f13) / 2.0f, fcuVar.r * f13);
            fcuVar.n.offset((fMin2 + rectF.centerX()) - f11, rectF.centerY() + (fcuVar.h / 2.0f));
            fcuVar.n.close();
            android.graphics.Paint paint2 = fcuVar.c;
            paint2.setColor(fcuVar.t);
            paint2.setAlpha(fcuVar.s);
            canvas.save();
            canvas.rotate(f9 + f10, rectF.centerX(), rectF.centerY());
            canvas.drawPath(fcuVar.n, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.i.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.s = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        android.animation.Animator animator = this.i;
        animator.cancel();
        defpackage.fcu fcuVar = this.a;
        fcuVar.e();
        if (fcuVar.f != fcuVar.e) {
            this.d = true;
            animator.setDuration(666L);
            animator.start();
        } else {
            fcuVar.g();
            fcuVar.b();
            animator.setDuration(1332L);
            animator.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.cancel();
        this.h = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        defpackage.fcu fcuVar = this.a;
        fcuVar.c(false);
        fcuVar.g();
        fcuVar.b();
        invalidateSelf();
    }
}
