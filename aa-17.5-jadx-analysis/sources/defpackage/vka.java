package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class vka extends Drawable {
    private static final LinearInterpolator c = new LinearInterpolator();
    public boolean a;
    public float b;
    private final ValueAnimator d;
    private final ValueAnimator e;
    private float f;
    private final int i;
    private final Paint j;
    private final int k;
    private final vjs m;
    private final vjv n;
    private final RectF g = new RectF();
    private final Rect h = new Rect();
    private int o = 255;
    private final float l = -1.0f;

    public vka(int i, int i2) {
        this.k = i;
        this.i = i2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alphaFraction", BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat.setDuration(750L);
        LinearInterpolator linearInterpolator = c;
        objectAnimatorOfFloat.setInterpolator(linearInterpolator);
        this.d = objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "alphaFraction", 1.0f, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat2.addListener(new vjz(this));
        objectAnimatorOfFloat2.setDuration(750L);
        objectAnimatorOfFloat2.setInterpolator(linearInterpolator);
        this.e = objectAnimatorOfFloat2;
        Paint paint = new Paint();
        this.j = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        this.a = false;
        this.b = getLevel() / 10000;
        vjs vjsVar = new vjs();
        this.m = vjsVar;
        vjsVar.c(getLevel() / 10000.0d);
        vjsVar.b(this.b);
        vjsVar.l = true;
        vjsVar.e(new vjy(this));
        this.n = new vjv(vjsVar);
        setVisible(false, false);
    }

    public final void a() {
        this.m.c(getLevel() / 10000.0d);
        vjv vjvVar = this.n;
        if (vjvVar.e) {
            if (vjvVar.f) {
                vjvVar.f = false;
                vjq.c().b(vjvVar.g);
            }
            vjvVar.e = false;
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2.isStarted()) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        if (getBounds().isEmpty() || !isVisible()) {
            return;
        }
        if (this.l == -1.0f) {
            bounds = getBounds();
        } else {
            Rect bounds2 = getBounds();
            int iCenterX = bounds2.centerX();
            int iCenterY = bounds2.centerY();
            Rect rect = this.h;
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
        Paint paint = this.j;
        paint.setStrokeWidth(f3);
        RectF rectF = this.g;
        rectF.set(bounds);
        float f4 = f2 - (f3 / 2.0f);
        rectF.inset(f4, f4);
        float fWidth = rectF.width() / 2.0f;
        float f5 = this.b * 360.0f;
        paint.setColor(this.i);
        int i2 = (int) (this.o * f);
        paint.setAlpha((int) (i2 * 0.2f));
        canvas.drawOval(rectF, paint);
        paint.setAlpha(i2);
        float fMax = Math.max(f5, (float) (((fWidth - f3) * 3.141592653589793d) / (f3 * 180.0f)));
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
        this.m.b(i / 10000.0d);
        vjv vjvVar = this.n;
        if (!vjvVar.e) {
            vjvVar.e = true;
            vjvVar.d = -1L;
            vjvVar.a();
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
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @ResultIgnorabilityUnspecified
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
            ValueAnimator valueAnimator = this.d;
            if (valueAnimator.isRunning()) {
                this.e.setCurrentPlayTime(750 - valueAnimator.getCurrentPlayTime());
                valueAnimator.cancel();
            }
            this.e.start();
            return z3;
        }
        super.setVisible(true, z2);
        ValueAnimator valueAnimator2 = this.e;
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
