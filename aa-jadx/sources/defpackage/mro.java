package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mro extends android.graphics.drawable.Drawable {
    public java.lang.String a;
    private final android.graphics.Rect b = new android.graphics.Rect();
    private final char[] c = new char[1];
    private final android.graphics.Paint d;
    private final int e;
    private final int f;

    public mro(android.content.res.Resources resources) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.d = paint;
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint.setTypeface(android.graphics.Typeface.create("google-sans-medium", 0));
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setAntiAlias(true);
        this.e = resources.getColor(android.R.color.black);
        this.f = resources.getColor(android.R.color.white);
    }

    public final android.graphics.Bitmap a(int i) {
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Rect bounds = getBounds();
        setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        draw(canvas);
        setBounds(bounds);
        return bitmapCreateBitmap;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        if (!isVisible() || bounds.isEmpty()) {
            return;
        }
        android.graphics.Paint paint = this.d;
        paint.setColor(this.f);
        android.graphics.Rect bounds2 = getBounds();
        int iMin = java.lang.Math.min(bounds2.width(), bounds2.height());
        canvas.drawPath(defpackage.lfx.b().a(iMin), paint);
        if (android.text.TextUtils.isEmpty(this.a)) {
            return;
        }
        char[] cArr = this.c;
        char cCharAt = this.a.charAt(0);
        cArr[0] = cCharAt;
        if (java.lang.Character.isLetter(cCharAt)) {
            cArr[0] = java.lang.Character.toUpperCase(cArr[0]);
        }
        paint.setTextSize(iMin * 0.5f);
        android.graphics.Rect rect = this.b;
        paint.getTextBounds(cArr, 0, 1, rect);
        paint.setColor(this.e);
        canvas.drawText(cArr, 0, 1, bounds2.centerX(), bounds2.centerY() + (rect.height() / 2), paint);
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
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
