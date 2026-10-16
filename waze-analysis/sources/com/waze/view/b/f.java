package com.waze.view.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f44996a;

    /* renamed from: b, reason: collision with root package name */
    private final float f44997b;

    /* renamed from: c, reason: collision with root package name */
    private final float f44998c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f44999d;

    public f(View view, int i2, float f2, int i3, float f3, boolean z) {
        view.setLayerType(1, null);
        Paint paint = new Paint();
        this.f44996a = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i2);
        paint.setShadowLayer(f3 / 2.0f, 0.0f, f3 / 4.0f, i3);
        this.f44997b = f2;
        this.f44998c = f3;
        this.f44999d = z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = new RectF(getBounds());
        rectF.top -= this.f44999d ? this.f44997b : 0.0f;
        float f2 = rectF.bottom;
        float f3 = this.f44998c;
        rectF.bottom = f2 - f3;
        rectF.left += f3;
        rectF.right -= f3;
        float f4 = this.f44997b;
        canvas.drawRoundRect(rectF, f4, f4, this.f44996a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f44996a.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f44996a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
