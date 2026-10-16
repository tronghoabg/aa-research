package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class fco extends Drawable implements Animatable {
    private static final Interpolator e = new LinearInterpolator();
    private static final Interpolator f = new eow();
    private static final int[] g = {-16777216};
    public final fcn a;
    public final Resources b;
    public float c;
    public boolean d;
    private float h;
    private final Animator i;

    public fco(Context context) {
        ebe.m(context);
        this.b = context.getResources();
        fcn fcnVar = new fcn();
        this.a = fcnVar;
        fcnVar.i = g;
        fcnVar.g();
        fcnVar.d(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ocf(this, fcnVar, 1));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(e);
        valueAnimatorOfFloat.addListener(new mzk(this, fcnVar, 1));
        this.i = valueAnimatorOfFloat;
    }

    public static final void e(float f2, fcn fcnVar) {
        if (f2 <= 0.75f) {
            fcnVar.t = fcnVar.a();
            return;
        }
        int iA = fcnVar.a();
        int[] iArr = fcnVar.i;
        fcnVar.f();
        int i = iArr[0];
        int i2 = iA >> 24;
        int i3 = iA >> 16;
        int i4 = iA >> 8;
        int i5 = i >> 16;
        int i6 = i >> 8;
        float f3 = (f2 - 0.75f) / 0.25f;
        int i7 = (i4 & 255) + ((int) (((i6 & 255) - r4) * f3));
        int i8 = (i3 & 255) + ((int) (((i5 & 255) - r3) * f3));
        int i9 = i2 & 255;
        fcnVar.t = ((i9 + ((int) (f3 * (((i >> 24) & 255) - i9)))) << 24) | (i8 << 16) | (i7 << 8) | ((iA & 255) + ((int) (((i & 255) - r0) * f3)));
    }

    public final void a(float f2, fcn fcnVar, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.d) {
            e(f2, fcnVar);
            double dFloor = Math.floor(fcnVar.l / 0.8f) + 1.0d;
            float f3 = fcnVar.j;
            float f4 = fcnVar.k;
            fcnVar.e = f3 + ((((-0.01f) + f4) - f3) * f2);
            fcnVar.f = f4;
            float f5 = fcnVar.l;
            fcnVar.g = f5 + ((((float) dFloor) - f5) * f2);
            return;
        }
        if (f2 != 1.0f || z) {
            float f6 = fcnVar.l;
            if (f2 < 0.5f) {
                interpolation = fcnVar.j;
                interpolation2 = (f.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f7 = fcnVar.j + 0.79f;
                interpolation = f7 - (((1.0f - f.getInterpolation(((-0.5f) + f2) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f7;
            }
            float f8 = f6 + (0.20999998f * f2);
            float f9 = f2 + this.c;
            fcnVar.e = interpolation;
            fcnVar.f = interpolation2;
            fcnVar.g = f8;
            this.h = f9 * 216.0f;
        }
    }

    public final void b(boolean z) {
        this.a.c(z);
        invalidateSelf();
    }

    public final void c(float f2) {
        fcn fcnVar = this.a;
        if (f2 != fcnVar.o) {
            fcnVar.o = f2;
        }
        invalidateSelf();
    }

    public final void d(float f2) {
        fcn fcnVar = this.a;
        fcnVar.e = BitmapDescriptorFactory.HUE_RED;
        fcnVar.f = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        fcn fcnVar = this.a;
        float f2 = fcnVar.p;
        float fMin = (fcnVar.h / 2.0f) + f2;
        if (f2 <= BitmapDescriptorFactory.HUE_RED) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((fcnVar.q * fcnVar.o) / 2.0f, fcnVar.h / 2.0f);
        }
        RectF rectF = fcnVar.a;
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f3 = fcnVar.e;
        float f4 = fcnVar.g;
        float f5 = f3 + f4;
        float f6 = fcnVar.f + f4;
        Paint paint = fcnVar.b;
        paint.setColor(fcnVar.t);
        paint.setAlpha(fcnVar.s);
        float f7 = fcnVar.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, fcnVar.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        float f9 = f5 * 360.0f;
        float f10 = (f6 * 360.0f) - f9;
        canvas.drawArc(rectF, f9, f10, false, paint);
        if (fcnVar.m) {
            Path path = fcnVar.n;
            if (path == null) {
                fcnVar.n = new Path();
                fcnVar.n.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f11 = (fcnVar.q * fcnVar.o) / 2.0f;
            fcnVar.n.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            fcnVar.n.lineTo(fcnVar.q * fcnVar.o, BitmapDescriptorFactory.HUE_RED);
            Path path2 = fcnVar.n;
            float f12 = fcnVar.q;
            float f13 = fcnVar.o;
            path2.lineTo((f12 * f13) / 2.0f, fcnVar.r * f13);
            fcnVar.n.offset((fMin2 + rectF.centerX()) - f11, rectF.centerY() + (fcnVar.h / 2.0f));
            fcnVar.n.close();
            Paint paint2 = fcnVar.c;
            paint2.setColor(fcnVar.t);
            paint2.setAlpha(fcnVar.s);
            canvas.save();
            canvas.rotate(f9 + f10, rectF.centerX(), rectF.centerY());
            canvas.drawPath(fcnVar.n, paint2);
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
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Animator animator = this.i;
        animator.cancel();
        fcn fcnVar = this.a;
        fcnVar.e();
        if (fcnVar.f != fcnVar.e) {
            this.d = true;
            animator.setDuration(666L);
            animator.start();
        } else {
            fcnVar.g();
            fcnVar.b();
            animator.setDuration(1332L);
            animator.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.cancel();
        this.h = BitmapDescriptorFactory.HUE_RED;
        fcn fcnVar = this.a;
        fcnVar.c(false);
        fcnVar.g();
        fcnVar.b();
        invalidateSelf();
    }
}
