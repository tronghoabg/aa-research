package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class laz extends Drawable {
    private final Drawable a;
    private final float b;
    private final Paint c;
    private String d;

    public laz(Drawable drawable, float f, float f2, int i) {
        this.a = drawable;
        this.b = f2;
        Paint paint = new Paint();
        this.c = paint;
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(f);
        paint.setColor(i);
        paint.setAntiAlias(true);
    }

    public final void a(String str) {
        this.d = str;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!isVisible() || bounds.isEmpty()) {
            return;
        }
        Drawable drawable = this.a;
        int iWidth = bounds.width() / 2;
        float f = this.b;
        float f2 = f / 2.0f;
        drawable.setBounds((int) (iWidth - f2), (int) ((bounds.height() / 2) - f2), (int) ((bounds.width() / 2) + f2), (int) ((bounds.height() / 2) + f2));
        drawable.draw(canvas);
        int iWidth2 = bounds.width() / 2;
        int iHeight = bounds.height() / 2;
        canvas.drawText(this.d, iWidth2, (int) (iHeight - ((r2.descent() + r2.ascent()) / 2.0f)), this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
