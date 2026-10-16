package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yv extends android.graphics.drawable.Drawable {
    public float a;
    public float b;
    public android.content.res.ColorStateList e;
    private final android.graphics.RectF g;
    private final android.graphics.Rect h;
    private android.graphics.PorterDuffColorFilter i;
    private android.content.res.ColorStateList j;
    public boolean c = false;
    public boolean d = true;
    private android.graphics.PorterDuff.Mode k = android.graphics.PorterDuff.Mode.SRC_IN;
    private final android.graphics.Paint f = new android.graphics.Paint(5);

    public yv(android.content.res.ColorStateList colorStateList, float f) {
        this.a = f;
        a(colorStateList);
        this.g = new android.graphics.RectF();
        this.h = new android.graphics.Rect();
    }

    private final android.graphics.PorterDuffColorFilter c(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void a(android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(0);
        }
        this.e = colorStateList;
        this.f.setColor(colorStateList.getColorForState(getState(), this.e.getDefaultColor()));
    }

    public final void b(android.graphics.Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        android.graphics.RectF rectF = this.g;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        android.graphics.Rect rect2 = this.h;
        rect2.set(rect);
        if (this.c) {
            rect2.inset((int) java.lang.Math.ceil(yw.a(this.b, this.a, this.d)), (int) java.lang.Math.ceil(yw.b(this.b, this.a, this.d)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.f;
        boolean z = false;
        if (this.i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.i);
            z = true;
        }
        android.graphics.RectF rectF = this.g;
        float f = this.a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline outline) {
        outline.setRoundRect(this.h, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        android.content.res.ColorStateList colorStateList = this.j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        android.content.res.ColorStateList colorStateList2 = this.e;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        android.graphics.PorterDuff.Mode mode;
        android.content.res.ColorStateList colorStateList = this.e;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        android.graphics.Paint paint = this.f;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        android.content.res.ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z;
        }
        this.i = c(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = c(colorStateList, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.k = mode;
        this.i = c(this.j, mode);
        invalidateSelf();
    }
}
