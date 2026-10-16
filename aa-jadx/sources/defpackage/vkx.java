package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vkx extends android.graphics.drawable.Drawable {
    private static final android.view.animation.LinearInterpolator c = new android.view.animation.LinearInterpolator();
    public boolean a;
    public float b;
    private final android.animation.ValueAnimator d;
    private final android.animation.ValueAnimator e;
    private float f;
    private final int i;
    private final android.graphics.Paint j;
    private final int k;
    private final defpackage.vkp m;
    private final defpackage.vks n;
    private final android.graphics.RectF g = new android.graphics.RectF();
    private final android.graphics.Rect h = new android.graphics.Rect();
    private int o = 255;
    private final float l = -1.0f;

    public vkx(int i, int i2) {
        this.k = i;
        this.i = i2;
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, "alphaFraction", com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat.setDuration(750L);
        android.view.animation.LinearInterpolator linearInterpolator = c;
        objectAnimatorOfFloat.setInterpolator(linearInterpolator);
        this.d = objectAnimatorOfFloat;
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, "alphaFraction", 1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat2.addListener(new defpackage.vkw(this));
        objectAnimatorOfFloat2.setDuration(750L);
        objectAnimatorOfFloat2.setInterpolator(linearInterpolator);
        this.e = objectAnimatorOfFloat2;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.j = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        this.a = false;
        this.b = getLevel() / 10000;
        defpackage.vkp vkpVar = new defpackage.vkp();
        this.m = vkpVar;
        vkpVar.c(((double) getLevel()) / 10000.0d);
        vkpVar.b(this.b);
        vkpVar.l = true;
        vkpVar.e(new defpackage.vkv(this));
        this.n = new defpackage.vks(vkpVar);
        setVisible(false, false);
    }

    public final void a() {
        this.m.c(((double) getLevel()) / 10000.0d);
        defpackage.vks vksVar = this.n;
        if (vksVar.e) {
            if (vksVar.f) {
                vksVar.f = false;
                defpackage.vkn.c().b(vksVar.g);
            }
            vksVar.e = false;
        }
        android.animation.ValueAnimator valueAnimator = this.d;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2.isStarted()) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds;
        if (getBounds().isEmpty() || !isVisible()) {
            return;
        }
        if (this.l == -1.0f) {
            bounds = getBounds();
        } else {
            android.graphics.Rect bounds2 = getBounds();
            int iCenterX = bounds2.centerX();
            int iCenterY = bounds2.centerY();
            android.graphics.Rect rect = this.h;
            rect.left = iCenterX - (getIntrinsicWidth() / 2);
            rect.right = iCenterX + (getIntrinsicWidth() / 2);
            rect.top = iCenterY - (getIntrinsicHeight() / 2);
            rect.bottom = iCenterY + (getIntrinsicHeight() / 2);
            bounds = rect;
        }
        int i = this.k;
        float f = this.f;
        float f2 = i;
        float f3 = f2 * f;
        float f4 = this.o * f;
        android.graphics.Paint paint = this.j;
        paint.setStrokeWidth(f3);
        android.graphics.RectF rectF = this.g;
        rectF.set(bounds);
        float f5 = f2 - (f3 / 2.0f);
        rectF.inset(f5, f5);
        float fWidth = rectF.width() / 2.0f;
        float f6 = this.b * 360.0f;
        paint.setColor(this.i);
        int i2 = (int) f4;
        paint.setAlpha((int) (i2 * 0.2f));
        canvas.drawOval(rectF, paint);
        paint.setAlpha(i2);
        float fMax = java.lang.Math.max(f6, (float) ((((double) (fWidth - f3)) * 3.141592653589793d) / ((double) (f3 * 180.0f))));
        if (fMax >= 5.0f) {
            canvas.drawArc(rectF, -90.0f, fMax, false, paint);
        }
    }

    public float getAlphaFraction() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        float f = this.l;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.l;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        this.m.b(((double) i) / 10000.0d);
        defpackage.vks vksVar = this.n;
        if (!vksVar.e) {
            vksVar.e = true;
            vksVar.d = -1L;
            vksVar.a();
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.o) {
            this.o = i;
            invalidateSelf();
        }
    }

    public void setAlphaFraction(float f) {
        this.f = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.a;
        if (!z3 && !z2) {
            return false;
        }
        this.a = z;
        if (!z) {
            if (!z3) {
                a();
                return z3;
            }
            android.animation.ValueAnimator valueAnimator = this.d;
            if (valueAnimator.isRunning()) {
                this.e.setCurrentPlayTime(750 - valueAnimator.getCurrentPlayTime());
                valueAnimator.cancel();
            }
            this.e.start();
            return z3;
        }
        super.setVisible(true, z2);
        android.animation.ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2.isRunning()) {
            this.d.setCurrentPlayTime(750 - valueAnimator2.getCurrentPlayTime());
            valueAnimator2.cancel();
        }
        if (!z2) {
            this.d.start();
            return z3;
        }
        a();
        this.d.start();
        return z3;
    }
}
