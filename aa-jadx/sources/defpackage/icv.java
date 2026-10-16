package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class icv extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {
    public final defpackage.icu a;
    public boolean b;
    public int c;
    private boolean e;
    private boolean f;
    private boolean h;
    private android.graphics.Paint i;
    private android.graphics.Rect j;
    private boolean g = true;
    public final int d = -1;

    public icv(defpackage.icu icuVar) {
        this.a = icuVar;
    }

    private final android.graphics.Paint c() {
        android.graphics.Paint paint = this.i;
        if (paint != null) {
            return paint;
        }
        android.graphics.Paint paint2 = new android.graphics.Paint(2);
        this.i = paint2;
        return paint2;
    }

    private final android.graphics.Rect d() {
        android.graphics.Rect rect = this.j;
        if (rect != null) {
            return rect;
        }
        android.graphics.Rect rect2 = new android.graphics.Rect();
        this.j = rect2;
        return rect2;
    }

    private final void e() {
        defpackage.fyh.f(!this.b, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        defpackage.ida idaVar = this.a.a;
        if (idaVar.a() == 1) {
            invalidateSelf();
            return;
        }
        if (this.e) {
            return;
        }
        this.e = true;
        if (idaVar.f) {
            throw new java.lang.IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        java.util.List list = idaVar.b;
        if (list.contains(this)) {
            throw new java.lang.IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = list.isEmpty();
        list.add(this);
        if (zIsEmpty && !idaVar.d) {
            idaVar.d = true;
            idaVar.f = false;
            idaVar.b();
        }
        invalidateSelf();
    }

    private final void f() {
        this.e = false;
        defpackage.ida idaVar = this.a.a;
        java.util.List list = idaVar.b;
        list.remove(this);
        if (list.isEmpty()) {
            idaVar.f();
        }
    }

    public final android.graphics.Bitmap a() {
        return this.a.a.h;
    }

    public final java.nio.ByteBuffer b() {
        return ((defpackage.hto) this.a.a.a).a.asReadOnlyBuffer();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        if (this.b) {
            return;
        }
        if (this.h) {
            android.view.Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.h = false;
        }
        defpackage.ida idaVar = this.a.a;
        defpackage.icz iczVar = idaVar.e;
        canvas.drawBitmap(iczVar != null ? iczVar.b : idaVar.h, (android.graphics.Rect) null, d(), c());
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.a.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        c().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        c().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        defpackage.fyh.f(!this.b, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.g = z;
        if (!z) {
            f();
        } else if (this.f) {
            e();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f = true;
        this.c = 0;
        if (this.g) {
            e();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f = false;
        f();
    }
}
