package com.waze.view.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import com.waze.t;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends c {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f44983a;

    public d(int i2) {
        Paint paint = new Paint();
        this.f44983a = paint;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, t.b().getDisplayMetrics().heightPixels, i2, i2, Shader.TileMode.CLAMP));
    }

    public final void c() {
        b(200L);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float level = getLevel();
        Rect bounds = getBounds();
        float fMax = Math.max(bounds.width(), bounds.height());
        float f2 = level / 10000.0f;
        Paint paint = this.f44983a;
        if (f2 < 1.0f) {
            canvas.drawCircle(0.0f, 0.0f, f2 * fMax, paint);
        } else {
            canvas.drawRect(bounds, paint);
        }
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
