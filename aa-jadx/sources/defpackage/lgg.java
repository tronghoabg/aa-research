package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lgg extends android.graphics.drawable.Drawable {
    private final android.graphics.drawable.Drawable a;
    private float b;
    private float c;

    public lgg(android.graphics.drawable.Drawable drawable, float f) {
        this.b = 1.0f;
        this.c = 1.0f;
        this.a = drawable;
        float intrinsicHeight = drawable.getIntrinsicHeight();
        float intrinsicWidth = drawable.getIntrinsicWidth();
        this.b = f;
        this.c = f;
        if (intrinsicHeight > intrinsicWidth && intrinsicWidth > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            this.b = f * (intrinsicWidth / intrinsicHeight);
        } else {
            if (intrinsicWidth <= intrinsicHeight || intrinsicHeight <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            this.c = f * (intrinsicHeight / intrinsicWidth);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        int iSave = canvas.save();
        canvas.scale(this.b, this.c, getBounds().exactCenterX(), getBounds().exactCenterY());
        this.a.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) {
        this.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) {
    }
}
