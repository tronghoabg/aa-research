package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lbe extends android.graphics.drawable.Drawable {
    private final android.graphics.drawable.Drawable a;
    private final float b;
    private final android.graphics.Paint c;
    private java.lang.String d;

    public lbe(android.graphics.drawable.Drawable drawable, float f, float f2, int i) {
        this.a = drawable;
        this.b = f2;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.c = paint;
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setTextSize(f);
        paint.setColor(i);
        paint.setAntiAlias(true);
    }

    public final void a(java.lang.String str) {
        this.d = str;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        if (!isVisible() || bounds.isEmpty()) {
            return;
        }
        android.graphics.drawable.Drawable drawable = this.a;
        int iWidth = bounds.width() / 2;
        float f = this.b;
        float f2 = f / 2.0f;
        drawable.setBounds((int) (iWidth - f2), (int) ((bounds.height() / 2) - f2), (int) ((bounds.width() / 2) + f2), (int) ((bounds.height() / 2) + f2));
        drawable.draw(canvas);
        int iWidth2 = bounds.width() / 2;
        int iHeight = bounds.height() / 2;
        android.graphics.Paint paint = this.c;
        canvas.drawText(this.d, iWidth2, (int) (iHeight - ((paint.descent() + paint.ascent()) / 2.0f)), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
