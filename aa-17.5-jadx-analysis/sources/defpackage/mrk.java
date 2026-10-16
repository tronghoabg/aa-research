package defpackage;

import android.R;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class mrk extends Drawable {
    public String a;
    private final Rect b = new Rect();
    private final char[] c = new char[1];
    private final Paint d;
    private final int e;
    private final int f;

    public mrk(Resources resources) {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint.setTypeface(Typeface.create("google-sans-medium", 0));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        this.e = resources.getColor(R.color.black);
        this.f = resources.getColor(R.color.white);
    }

    public final Bitmap a(int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect bounds = getBounds();
        setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        draw(canvas);
        setBounds(bounds);
        return bitmapCreateBitmap;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!isVisible() || bounds.isEmpty()) {
            return;
        }
        Paint paint = this.d;
        paint.setColor(this.f);
        Rect bounds2 = getBounds();
        int iMin = Math.min(bounds2.width(), bounds2.height());
        canvas.drawPath(lfr.b().a(iMin), paint);
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        char[] cArr = this.c;
        char cCharAt = this.a.charAt(0);
        cArr[0] = cCharAt;
        if (Character.isLetter(cCharAt)) {
            cArr[0] = Character.toUpperCase(cArr[0]);
        }
        paint.setTextSize(iMin * 0.5f);
        paint.getTextBounds(cArr, 0, 1, this.b);
        paint.setColor(this.e);
        canvas.drawText(cArr, 0, 1, bounds2.centerX(), bounds2.centerY() + (r1.height() / 2), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
