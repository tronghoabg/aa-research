package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vla extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {
    private static final android.view.animation.LinearInterpolator h = new android.view.animation.LinearInterpolator();
    public final android.animation.AnimatorSet a;
    public final android.animation.ValueAnimator b;
    public float c;
    public float d;
    public int e;
    public final int[] f;
    private final android.animation.ValueAnimator k;
    private final android.animation.ValueAnimator l;
    private final android.animation.ValueAnimator m;
    private final android.animation.ValueAnimator n;
    private final android.animation.ValueAnimator o;
    private final java.util.ArrayList p;
    private float q;
    private float r;
    private float s;
    private final android.graphics.Paint t;
    private int u;
    private final int v;
    private long x;
    private long y;
    private final android.graphics.RectF i = new android.graphics.RectF();
    private final android.graphics.Rect j = new android.graphics.Rect();
    private final float w = -1.0f;
    public boolean g = false;

    public vla(int i, int[] iArr) {
        this.v = i;
        this.f = iArr;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.p = arrayList;
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, "detentFraction", com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat.setDuration(1332L);
        android.view.animation.LinearInterpolator linearInterpolator = h;
        objectAnimatorOfFloat.setInterpolator(linearInterpolator);
        this.k = objectAnimatorOfFloat;
        arrayList.add(objectAnimatorOfFloat);
        int i2 = iArr[0];
        d();
        android.animation.ObjectAnimator objectAnimatorOfInt = android.animation.ObjectAnimator.ofInt(this, "currentColor", i2, iArr[0]);
        objectAnimatorOfInt.setEvaluator(defpackage.tua.a);
        objectAnimatorOfInt.setStartDelay(999L);
        objectAnimatorOfInt.setDuration(333L);
        objectAnimatorOfInt.setInterpolator(linearInterpolator);
        this.e = iArr[0];
        this.b = objectAnimatorOfInt;
        arrayList.add(objectAnimatorOfInt);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, "headFraction", com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat2.setDuration(666L);
        android.view.animation.Interpolator interpolator = defpackage.vko.a;
        objectAnimatorOfFloat2.setInterpolator(interpolator);
        this.l = objectAnimatorOfFloat2;
        arrayList.add(objectAnimatorOfFloat2);
        android.animation.ObjectAnimator objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat(this, "tailFraction", com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat3.setStartDelay(666L);
        objectAnimatorOfFloat3.setDuration(666L);
        objectAnimatorOfFloat3.setInterpolator(interpolator);
        this.m = objectAnimatorOfFloat3;
        arrayList.add(objectAnimatorOfFloat3);
        android.animation.ObjectAnimator objectAnimatorOfFloat4 = android.animation.ObjectAnimator.ofFloat(this, "alphaFraction", com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat4.addListener(new defpackage.vky(this));
        objectAnimatorOfFloat4.setDuration(750L);
        objectAnimatorOfFloat4.setInterpolator(linearInterpolator);
        this.n = objectAnimatorOfFloat4;
        arrayList.add(objectAnimatorOfFloat4);
        android.animation.ObjectAnimator objectAnimatorOfFloat5 = android.animation.ObjectAnimator.ofFloat(this, "alphaFraction", 1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat5.addListener(new defpackage.vkz(this));
        objectAnimatorOfFloat5.setDuration(750L);
        objectAnimatorOfFloat5.setInterpolator(linearInterpolator);
        this.o = objectAnimatorOfFloat5;
        arrayList.add(objectAnimatorOfFloat5);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfInt);
        boolean z = defpackage.vlb.a;
        boolean z2 = defpackage.vlb.b;
        animatorSet.addListener(new defpackage.vkj(animatorSet, new defpackage.unh(this, 11)));
        this.a = animatorSet;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.t = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        this.u = 255;
        setVisible(false, false);
        a();
    }

    public final void a() {
        super.setVisible(this.g, false);
        android.animation.AnimatorSet animatorSet = this.a;
        if (animatorSet.isStarted()) {
            animatorSet.cancel();
        }
        java.util.ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            android.animation.Animator animator = (android.animation.Animator) arrayList.get(i);
            if (animator.isStarted()) {
                animator.cancel();
            }
        }
        b();
        this.r = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.d = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.q = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        int[] iArr = this.f;
        int i2 = iArr[0];
        this.e = i2;
        android.animation.ValueAnimator valueAnimator = this.b;
        d();
        valueAnimator.setIntValues(i2, iArr[0]);
        this.s = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
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
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds;
        if (getBounds().isEmpty()) {
            return;
        }
        if (isVisible() || this.o.isRunning()) {
            if (this.w == -1.0f) {
                bounds = getBounds();
            } else {
                android.graphics.Rect bounds2 = getBounds();
                int iCenterX = bounds2.centerX();
                int iCenterY = bounds2.centerY();
                android.graphics.Rect rect = this.j;
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
            float f4 = this.u * f;
            android.graphics.Paint paint = this.t;
            paint.setColor(this.e);
            paint.setAlpha((int) f4);
            paint.setStrokeWidth(f3);
            android.graphics.RectF rectF = this.i;
            rectF.set(bounds);
            float f5 = f2 - (f3 / 2.0f);
            rectF.inset(f5, f5);
            float fWidth = rectF.width() / 2.0f;
            float f6 = this.d * 290.0f;
            canvas.drawArc(rectF, (f6 + (this.c + (this.q * 286.0f))) - 90.0f, java.lang.Math.max(java.lang.Math.abs((this.r * 290.0f) - f6), (float) ((((double) (fWidth - f3)) * 3.141592653589793d) / ((double) (f3 * 180.0f)))), false, paint);
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
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
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
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
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
            android.animation.ValueAnimator valueAnimator = this.n;
            if (valueAnimator.isRunning()) {
                this.o.setCurrentPlayTime(750 - valueAnimator.getCurrentPlayTime());
                valueAnimator.cancel();
            }
            this.o.start();
            return z3;
        }
        super.setVisible(true, z2);
        android.animation.ValueAnimator valueAnimator2 = this.o;
        if (valueAnimator2.isRunning()) {
            this.n.setCurrentPlayTime(750 - valueAnimator2.getCurrentPlayTime());
            valueAnimator2.cancel();
        }
        if (z2) {
            a();
            android.animation.ValueAnimator valueAnimator3 = this.n;
            valueAnimator3.setStartDelay(0L);
            valueAnimator3.start();
            this.x = 0L;
        } else {
            long jMax = java.lang.Math.max(0L, this.x - (android.os.SystemClock.elapsedRealtime() - this.y));
            this.x = jMax;
            android.animation.ValueAnimator valueAnimator4 = this.n;
            valueAnimator4.setStartDelay(jMax);
            valueAnimator4.start();
        }
        this.y = android.os.SystemClock.elapsedRealtime();
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
