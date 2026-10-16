package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wpy extends android.graphics.drawable.Drawable {
    public final android.graphics.Paint a;
    public float b;
    public int c;
    public int d;
    public int e;
    public int f;
    public defpackage.wvi h;
    private int o;
    private android.content.res.ColorStateList p;
    private final defpackage.wvk i = defpackage.wvj.a;
    private final android.graphics.Path j = new android.graphics.Path();
    private final android.graphics.Rect k = new android.graphics.Rect();
    private final android.graphics.RectF l = new android.graphics.RectF();
    private final android.graphics.RectF m = new android.graphics.RectF();
    private final defpackage.wpx n = new defpackage.wpx(this);
    public boolean g = true;

    public wpy(defpackage.wvi wviVar) {
        this.h = wviVar;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.a = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    protected final android.graphics.RectF a() {
        android.graphics.RectF rectF = this.m;
        rectF.set(getBounds());
        return rectF;
    }

    public final void b(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.o = colorStateList.getColorForState(getState(), this.o);
        }
        this.p = colorStateList;
        this.g = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        if (this.g) {
            android.graphics.Paint paint = this.a;
            android.graphics.Rect rect = this.k;
            copyBounds(rect);
            float fHeight = this.b / rect.height();
            paint.setShader(new android.graphics.LinearGradient(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, rect.top, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, rect.bottom, new int[]{defpackage.dvk.d(this.c, this.o), defpackage.dvk.d(this.d, this.o), defpackage.dvk.d(defpackage.dvk.e(this.d, 0), this.o), defpackage.dvk.d(defpackage.dvk.e(this.f, 0), this.o), defpackage.dvk.d(this.f, this.o), defpackage.dvk.d(this.e, this.o)}, new float[]{com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
            this.g = false;
        }
        android.graphics.Paint paint2 = this.a;
        float strokeWidth = paint2.getStrokeWidth() / 2.0f;
        android.graphics.Rect rect2 = this.k;
        copyBounds(rect2);
        android.graphics.RectF rectF = this.l;
        rectF.set(rect2);
        float fMin = java.lang.Math.min(this.h.b.a(a()), rectF.width() / 2.0f);
        if (this.h.h(a())) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.b > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline outline) {
        if (this.h.h(a())) {
            outline.setRoundRect(getBounds(), this.h.b.a(a()));
            return;
        }
        android.graphics.Rect rect = this.k;
        copyBounds(rect);
        android.graphics.RectF rectF = this.l;
        rectF.set(rect);
        defpackage.wvk wvkVar = this.i;
        defpackage.wvi wviVar = this.h;
        android.graphics.Path path = this.j;
        wvkVar.c(wviVar, null, 1.0f, rectF, null, path);
        defpackage.wpv.e(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect rect) {
        if (!this.h.h(a())) {
            return true;
        }
        int iRound = java.lang.Math.round(this.b);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        android.content.res.ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) {
        this.g = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState;
        android.content.res.ColorStateList colorStateList = this.p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.o)) != this.o) {
            this.g = true;
            this.o = colorForState;
        }
        if (this.g) {
            invalidateSelf();
        }
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
