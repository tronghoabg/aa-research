package com.waze.view.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.Log;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.waze.ui.z.as;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends c {

    /* renamed from: a, reason: collision with root package name */
    private static final Interpolator f44984a = new DecelerateInterpolator(1.2f);

    /* renamed from: b, reason: collision with root package name */
    private static final Interpolator f44985b = new DecelerateInterpolator(0.85f);

    /* renamed from: c, reason: collision with root package name */
    private float f44986c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private final float f44987d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f44988e = null;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f44989f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f44990g;

    /* renamed from: h, reason: collision with root package name */
    private final Path f44991h;

    /* renamed from: i, reason: collision with root package name */
    private float f44992i;

    /* renamed from: j, reason: collision with root package name */
    private float f44993j;

    /* renamed from: k, reason: collision with root package name */
    private float f44994k;

    /* renamed from: l, reason: collision with root package name */
    private float f44995l;
    private float m;

    static {
        new AccelerateInterpolator();
        new AnticipateInterpolator(0.95f);
    }

    public e() {
        Paint paint = new Paint(1);
        this.f44989f = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f44990g = new Paint(1);
        this.f44991h = new Path();
    }

    private static float g(float f2, float f3, float f4) {
        float f5 = f4 - f3;
        if (f5 > 0.0f) {
            return Math.min(Math.max((f2 - f3) / f5, 0.0f), 1.0f);
        }
        Log.w("ReportButtonDrawable", "Request to generate ratio with invalid duration - delay = " + f5);
        return 0.0f;
    }

    private final void h() {
        float f2 = this.f44986c / 2.0f;
        float f3 = this.f44987d / 2.0f;
        float f4 = f2 - f3;
        this.f44994k = f4;
        this.f44992i = f4 - f3;
        getBounds();
    }

    public final void c(int i2) {
        this.f44989f.setColor(i2);
    }

    public final void d(float f2) {
        this.f44986c = f2;
        if (f2 < 0.0f) {
            this.f44986c = as.f(86);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float level = getLevel();
        if (this.f44994k == 0.0f) {
            h();
        }
        float f2 = level / 10000.0f;
        if (f2 <= 0.5f) {
            float f3 = f2 / 0.5f;
            float fG = g(f3, 0.1f, 0.85f);
            float fG2 = g(f3, 0.0f, 0.95f);
            float fG3 = g(f3, 0.2f, 0.8f);
            Interpolator interpolator = f44984a;
            this.f44993j = interpolator.getInterpolation(fG) * this.f44992i * 1.04f;
            this.f44995l = interpolator.getInterpolation(fG2) * this.f44994k * 1.08f;
            this.m = this.f44988e == null ? 0.0f : r1.getHeight() - ((f44985b.getInterpolation(fG3) * this.f44988e.getHeight()) * 1.05f);
        } else {
            float f4 = this.f44992i;
            Interpolator interpolator2 = com.waze.view.anim.d.f44973a;
            float f5 = 1.0f - ((f2 - 0.5f) / 0.5f);
            this.f44993j = f4 + (interpolator2.getInterpolation(f5) * this.f44992i * 0.03999996f);
            this.f44995l = this.f44994k + (interpolator2.getInterpolation(f5) * this.f44994k * 0.08000004f);
            this.m = interpolator2.getInterpolation(f5) * (-(this.f44988e != null ? r1.getHeight() : 0)) * 0.05f;
        }
        Rect bounds = getBounds();
        float f6 = this.f44995l;
        float f7 = this.f44993j;
        float f8 = f6 + f7;
        if (f7 > 0.0f) {
            canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.f44993j, this.f44989f);
            if (this.f44988e != null) {
                int iCenterX = bounds.centerX() - (this.f44988e.getWidth() / 2);
                int iCenterY = bounds.centerY() - (this.f44988e.getHeight() / 2);
                Path path = this.f44991h;
                path.reset();
                path.addCircle(bounds.centerX(), bounds.centerY(), f8 / 2.0f, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.drawBitmap(this.f44988e, iCenterX, iCenterY + this.m, this.f44990g);
                canvas.restore();
            }
        }
    }

    public final void e(Bitmap bitmap) {
        this.f44988e = bitmap;
    }

    public final void f() {
        if (this.f44988e == null) {
            return;
        }
        h();
        b(600L);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
