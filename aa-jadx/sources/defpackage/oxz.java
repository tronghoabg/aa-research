package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oxz extends android.graphics.drawable.Drawable {
    private final int a;
    private final int b;
    private final android.graphics.Paint c;
    private final android.graphics.Paint d;
    private final android.animation.ValueAnimator e;
    private boolean f;
    private int g;
    private int h;
    private android.graphics.Outline i;

    public oxz(android.content.Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.gearhead_sdk_fab_focused_growth);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.gearhead_sdk_fab_focused_stroke_width);
        int integer = context.getResources().getInteger(com.google.android.projection.gearhead.R.integer.gearhead_sdk_fab_animation_duration);
        this.c = new android.graphics.Paint(1);
        this.d = new android.graphics.Paint(1);
        if (dimensionPixelSize < 0) {
            throw new java.lang.IllegalArgumentException("Fab growth must be >= 0.");
        }
        if (dimensionPixelSize > dimensionPixelSize2) {
            throw new java.lang.IllegalArgumentException("Fab growth must be <= strokeWidth.");
        }
        this.a = dimensionPixelSize;
        this.b = dimensionPixelSize2;
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(integer);
        this.e = duration;
        duration.setInterpolator(new android.view.animation.DecelerateInterpolator());
        duration.addUpdateListener(new defpackage.nv(this, 9));
    }

    private final void c() {
        int iWidth = getBounds().width() / 2;
        int iHeight = getBounds().height() / 2;
        android.graphics.Outline outline = this.i;
        if (outline != null) {
            int i = this.h;
            outline.setRoundRect(iWidth - i, iHeight - i, iWidth + i, iHeight + i, i);
        }
    }

    public final void a() {
        int iMin = java.lang.Math.min(getBounds().width(), getBounds().height()) / 2;
        int i = this.b;
        float animatedFraction = this.e.getAnimatedFraction();
        float f = iMin - i;
        this.h = (int) ((i * animatedFraction) + f);
        this.g = (int) (f + (this.a * animatedFraction));
        c();
        invalidateSelf();
    }

    public final void b(int i) {
        this.c.setColor(i);
        float[] fArr = new float[3];
        android.graphics.Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.9f;
        this.d.setColor(android.graphics.Color.HSVToColor(fArr));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        float fWidth = getBounds().width() / 2;
        float fHeight = getBounds().height() / 2;
        canvas.drawCircle(fWidth, fHeight, this.h, this.d);
        canvas.drawCircle(fWidth, fHeight, this.g, this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline outline) {
        this.i = outline;
        c();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) {
        a();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        boolean z = false;
        for (int i : iArr) {
            z |= true ^ (i != 16842919);
        }
        boolean z2 = this.f;
        if (z) {
            if (!z2) {
                this.e.start();
                this.f = true;
                return zOnStateChange;
            }
        } else if (z2) {
            this.e.reverse();
            this.f = false;
        }
        return zOnStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }
}
