package com.waze.sharedui.views;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class i extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    protected float f39239a;

    /* renamed from: b, reason: collision with root package name */
    protected float f39240b;

    /* renamed from: c, reason: collision with root package name */
    protected float f39241c;

    /* renamed from: d, reason: collision with root package name */
    final RectF f39242d;

    /* renamed from: e, reason: collision with root package name */
    private final BitmapShader f39243e;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f39244f;

    /* renamed from: g, reason: collision with root package name */
    private final int f39245g;

    /* renamed from: h, reason: collision with root package name */
    private final int f39246h;

    /* renamed from: i, reason: collision with root package name */
    private final int f39247i;

    public i(Bitmap bitmap, int i2) {
        RectF rectF = new RectF();
        this.f39242d = rectF;
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        this.f39243e = bitmapShader;
        Paint paint = new Paint();
        this.f39244f = paint;
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        this.f39245g = i2;
        int width = bitmap != null ? bitmap.getWidth() : 0;
        this.f39246h = width;
        int height = bitmap != null ? bitmap.getHeight() : 0;
        this.f39247i = height;
        rectF.set(0.0f, 0.0f, width, height);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawCircle(this.f39239a, this.f39240b, this.f39241c, this.f39244f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        float fWidth;
        float fHeight;
        super.onBoundsChange(rect);
        this.f39239a = rect.width() / 2.0f;
        float fHeight2 = rect.height() / 2.0f;
        this.f39240b = fHeight2;
        float fMin = Math.min(this.f39239a, fHeight2);
        float f2 = this.f39245g;
        this.f39241c = fMin - f2;
        BitmapShader bitmapShader = this.f39243e;
        if (bitmapShader != null) {
            RectF rectF = new RectF();
            rectF.set(rect);
            rectF.inset(f2, f2);
            Matrix matrix = new Matrix();
            matrix.reset();
            float f3 = this.f39246h;
            float fHeight3 = rectF.height() * f3;
            float fWidth2 = rectF.width();
            float f4 = this.f39247i;
            float f5 = fWidth2 * f4;
            float f6 = 0.0f;
            if (fHeight3 > f5) {
                fWidth = rectF.height() / f4;
                float fWidth3 = (rectF.width() - (f3 * fWidth)) * 0.5f;
                fHeight = 0.0f;
                f6 = fWidth3;
            } else {
                fWidth = rectF.width() / f3;
                fHeight = (rectF.height() - (f4 * fWidth)) * 0.5f;
            }
            matrix.setScale(fWidth, fWidth);
            matrix.postTranslate(((int) (f6 + 0.5f)) + r1, ((int) (fHeight + 0.5f)) + r1);
            bitmapShader.setLocalMatrix(matrix);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f39244f.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f39244f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public i(int i2, int i3) {
        RectF rectF = new RectF();
        this.f39242d = rectF;
        this.f39243e = null;
        Paint paint = new Paint();
        this.f39244f = paint;
        paint.setAntiAlias(true);
        paint.setColor(i2);
        this.f39245g = i3;
        this.f39246h = 0;
        this.f39247i = 0;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
