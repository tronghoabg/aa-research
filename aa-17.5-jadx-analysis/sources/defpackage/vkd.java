package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class vkd extends Drawable implements Animatable {
    private static final LinearInterpolator h = new LinearInterpolator();
    public final AnimatorSet a;
    public final ValueAnimator b;
    public float c;
    public float d;
    public int e;
    public final int[] f;
    private final ValueAnimator k;
    private final ValueAnimator l;
    private final ValueAnimator m;
    private final ValueAnimator n;
    private final ValueAnimator o;
    private final ArrayList p;
    private float q;
    private float r;
    private float s;
    private final Paint t;
    private int u;
    private final int v;
    private long x;
    private long y;
    private final RectF i = new RectF();
    private final Rect j = new Rect();
    private final float w = -1.0f;
    public boolean g = false;

    public vkd(int i, int[] iArr) {
        this.v = i;
        this.f = iArr;
        ArrayList arrayList = new ArrayList();
        this.p = arrayList;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "detentFraction", BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat.setDuration(1332L);
        LinearInterpolator linearInterpolator = h;
        objectAnimatorOfFloat.setInterpolator(linearInterpolator);
        this.k = objectAnimatorOfFloat;
        arrayList.add(objectAnimatorOfFloat);
        int i2 = iArr[0];
        d();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "currentColor", i2, iArr[0]);
        objectAnimatorOfInt.setEvaluator(tte.a);
        objectAnimatorOfInt.setStartDelay(999L);
        objectAnimatorOfInt.setDuration(333L);
        objectAnimatorOfInt.setInterpolator(linearInterpolator);
        this.e = iArr[0];
        this.b = objectAnimatorOfInt;
        arrayList.add(objectAnimatorOfInt);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "headFraction", BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat2.setDuration(666L);
        Interpolator interpolator = vjr.a;
        objectAnimatorOfFloat2.setInterpolator(interpolator);
        this.l = objectAnimatorOfFloat2;
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "tailFraction", BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat3.setStartDelay(666L);
        objectAnimatorOfFloat3.setDuration(666L);
        objectAnimatorOfFloat3.setInterpolator(interpolator);
        this.m = objectAnimatorOfFloat3;
        arrayList.add(objectAnimatorOfFloat3);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, "alphaFraction", BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat4.addListener(new vkb(this));
        objectAnimatorOfFloat4.setDuration(750L);
        objectAnimatorOfFloat4.setInterpolator(linearInterpolator);
        this.n = objectAnimatorOfFloat4;
        arrayList.add(objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this, "alphaFraction", 1.0f, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat5.addListener(new vkc(this));
        objectAnimatorOfFloat5.setDuration(750L);
        objectAnimatorOfFloat5.setInterpolator(linearInterpolator);
        this.o = objectAnimatorOfFloat5;
        arrayList.add(objectAnimatorOfFloat5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfInt);
        boolean z = vke.a;
        boolean z2 = vke.b;
        animatorSet.addListener(new vjm(animatorSet, new upk(this, 3)));
        this.a = animatorSet;
        Paint paint = new Paint();
        this.t = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        this.u = 255;
        setVisible(false, false);
        a();
    }

    public final void a() {
        super.setVisible(this.g, false);
        AnimatorSet animatorSet = this.a;
        if (animatorSet.isStarted()) {
            animatorSet.cancel();
        }
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator.isStarted()) {
                animator.cancel();
            }
        }
        b();
        this.r = BitmapDescriptorFactory.HUE_RED;
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.q = BitmapDescriptorFactory.HUE_RED;
        this.c = BitmapDescriptorFactory.HUE_RED;
        int[] iArr = this.f;
        int i2 = iArr[0];
        this.e = i2;
        ValueAnimator valueAnimator = this.b;
        d();
        valueAnimator.setIntValues(i2, iArr[0]);
        this.s = BitmapDescriptorFactory.HUE_RED;
        invalidateSelf();
    }

    public final void b() {
        this.b.setStartDelay(999L);
        this.m.setStartDelay(666L);
    }

    public final void d() {
        int length = this.f.length;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        if (getBounds().isEmpty()) {
            return;
        }
        if (isVisible() || this.o.isRunning()) {
            if (this.w == -1.0f) {
                bounds = getBounds();
            } else {
                Rect bounds2 = getBounds();
                int iCenterX = bounds2.centerX();
                int iCenterY = bounds2.centerY();
                Rect rect = this.j;
                rect.left = iCenterX - (getIntrinsicWidth() / 2);
                rect.right = iCenterX + (getIntrinsicWidth() / 2);
                rect.top = iCenterY - (getIntrinsicHeight() / 2);
                rect.bottom = iCenterY + (getIntrinsicHeight() / 2);
                bounds = rect;
            }
            int i = this.v;
            float f = this.s;
            float f2 = i;
            float f3 = f2 * f;
            Paint paint = this.t;
            paint.setColor(this.e);
            paint.setAlpha((int) (this.u * f));
            paint.setStrokeWidth(f3);
            RectF rectF = this.i;
            rectF.set(bounds);
            float f4 = f2 - (f3 / 2.0f);
            rectF.inset(f4, f4);
            float fWidth = rectF.width() / 2.0f;
            canvas.drawArc(rectF, (r0 + (this.c + (this.q * 286.0f))) - 90.0f, Math.max(Math.abs((this.r * 290.0f) - (this.d * 290.0f)), (float) (((fWidth - f3) * 3.141592653589793d) / (f3 * 180.0f))), false, paint);
        }
    }

    public float getAlphaFraction() {
        return this.s;
    }

    public int getCurrentColor() {
        return this.e;
    }

    public float getDetentFraction() {
        return this.q;
    }

    public float getHeadFraction() {
        return this.r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        float f = this.w;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.w;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public float getTailFraction() {
        return this.d;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.a.isRunning() || this.n.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.u) {
            this.u = i;
            invalidateSelf();
        }
    }

    public void setAlphaFraction(float f) {
        this.s = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.t.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setCurrentColor(int i) {
        this.e = i;
        invalidateSelf();
    }

    public void setDetentFraction(float f) {
        this.q = f;
        invalidateSelf();
    }

    public void setHeadFraction(float f) {
        this.r = f;
        invalidateSelf();
    }

    public void setTailFraction(float f) {
        this.d = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @ResultIgnorabilityUnspecified
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.g;
        if (!z3 && !z2) {
            return false;
        }
        this.g = z;
        if (!z) {
            if (!z3) {
                a();
                return z3;
            }
            ValueAnimator valueAnimator = this.n;
            if (valueAnimator.isRunning()) {
                this.o.setCurrentPlayTime(750 - valueAnimator.getCurrentPlayTime());
                valueAnimator.cancel();
            }
            this.o.start();
            return z3;
        }
        super.setVisible(true, z2);
        ValueAnimator valueAnimator2 = this.o;
        if (valueAnimator2.isRunning()) {
            this.n.setCurrentPlayTime(750 - valueAnimator2.getCurrentPlayTime());
            valueAnimator2.cancel();
        }
        if (z2) {
            a();
            ValueAnimator valueAnimator3 = this.n;
            valueAnimator3.setStartDelay(0L);
            valueAnimator3.start();
            this.x = 0L;
        } else {
            long jMax = Math.max(0L, this.x - (SystemClock.elapsedRealtime() - this.y));
            this.x = jMax;
            ValueAnimator valueAnimator4 = this.n;
            valueAnimator4.setStartDelay(jMax);
            valueAnimator4.start();
        }
        this.y = SystemClock.elapsedRealtime();
        return z3;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        setVisible(true, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        setVisible(false, true);
    }
}
