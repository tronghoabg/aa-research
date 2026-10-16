package defpackage;

import android.content.res.Resources;
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

/* loaded from: classes2.dex */
public class dvr extends Drawable {
    final Bitmap a;
    public final BitmapShader c;
    public float d;
    private int f;
    private final int k;
    private final int l;
    private final int g = 119;
    public final Paint b = new Paint(3);
    private final Matrix h = new Matrix();
    final Rect e = new Rect();
    private final RectF i = new RectF();
    private boolean j = true;

    public dvr(Resources resources, Bitmap bitmap) {
        BitmapShader bitmapShader;
        this.f = 160;
        if (resources != null) {
            this.f = resources.getDisplayMetrics().densityDpi;
        }
        this.a = bitmap;
        if (bitmap != null) {
            this.k = bitmap.getScaledWidth(this.f);
            this.l = bitmap.getScaledHeight(this.f);
            bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        } else {
            this.l = -1;
            this.k = -1;
            bitmapShader = null;
        }
        this.c = bitmapShader;
    }

    public static boolean c(float f) {
        return f > 0.05f;
    }

    public void a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw null;
    }

    final void b() {
        if (this.j) {
            int i = this.g;
            int i2 = this.k;
            int i3 = this.l;
            Rect bounds = getBounds();
            Rect rect = this.e;
            a(i, i2, i3, bounds, rect);
            RectF rectF = this.i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.c;
            if (bitmapShader != null) {
                Matrix matrix = this.h;
                matrix.setTranslate(rectF.left, rectF.top);
                Bitmap bitmap = this.a;
                matrix.preScale(rectF.width() / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.b.setShader(bitmapShader);
            }
            this.j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return;
        }
        b();
        Paint paint = this.b;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.e, paint);
            return;
        }
        RectF rectF = this.i;
        float f = this.d;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        return (this.g != 119 || (bitmap = this.a) == null || bitmap.hasAlpha() || this.b.getAlpha() < 255 || c(this.d)) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.b;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.b.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.b.setFilterBitmap(z);
        invalidateSelf();
    }
}
