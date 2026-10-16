package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wsl<S extends defpackage.wsm> extends android.widget.ProgressBar {
    public final defpackage.wsm a;
    public int b;
    public final int c;
    public boolean d;
    public final int e;
    public boolean f;
    public final java.lang.Runnable g;
    public final java.lang.Runnable h;
    private final boolean i;
    private final defpackage.fhn j;
    private final defpackage.fhn k;

    protected wsl(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(defpackage.wyk.a(context, attributeSet, i, com.google.android.projection.gearhead.R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.d = false;
        this.e = 4;
        this.g = new defpackage.wdg(this, 15, null);
        this.h = new defpackage.wdg(this, 16, null);
        this.j = new defpackage.wsj(this);
        this.k = new defpackage.wsk(this);
        android.content.Context context2 = getContext();
        this.a = a(context2, attributeSet);
        android.content.res.TypedArray typedArrayA = defpackage.wro.a(context2, attributeSet, defpackage.wtt.a, i, i2, new int[0]);
        typedArrayA.getInt(7, -1);
        this.c = java.lang.Math.min(typedArrayA.getInt(5, -1), 1000);
        typedArrayA.recycle();
        this.i = true;
    }

    private final defpackage.wth j() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().a;
        }
        if (getProgressDrawable() != null) {
            return getProgressDrawable().a;
        }
        return null;
    }

    public abstract defpackage.wsm a(android.content.Context context, android.util.AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.wta getProgressDrawable() {
        return (defpackage.wta) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.wtj getIndeterminateDrawable() {
        return (defpackage.wtj) super.getIndeterminateDrawable();
    }

    protected final void d(boolean z) {
        if (this.i) {
            ((defpackage.wte) getCurrentDrawable()).l(g(), false, z);
        }
    }

    public final void e() {
        if (this.c > 0) {
            android.os.SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public final void f(int i) {
        defpackage.wsm wsmVar = this.a;
        if (wsmVar.f != i) {
            wsmVar.f = i;
            invalidate();
        }
    }

    final boolean g() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        android.view.View view = this;
        while (view.getVisibility() == 0) {
            java.lang.Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof android.view.View)) {
                return true;
            }
            view = (android.view.View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public final android.graphics.drawable.Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public final int[] h() {
        return this.a.e;
    }

    public void i(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.d = true;
            if (!getIndeterminateDrawable().isVisible() || defpackage.wpu.j(getContext().getContentResolver()) == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                this.j.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().b.d();
            }
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b.c(this.j);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().h(this.k);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().h(this.k);
        }
        if (g()) {
            e();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.h);
        removeCallbacks(this.g);
        ((defpackage.wte) getCurrentDrawable()).l(false, false, false);
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().n(this.k);
            getIndeterminateDrawable().b.g();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().n(this.k);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(android.graphics.Canvas canvas) {
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        j().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        defpackage.wth wthVarJ = j();
        if (wthVarJ == null) {
            return;
        }
        setMeasuredDimension(wthVarJ.b() < 0 ? getDefaultSize(getSuggestedMinimumWidth(), i) : wthVarJ.b() + getPaddingLeft() + getPaddingRight(), wthVarJ.a() < 0 ? getDefaultSize(getSuggestedMinimumHeight(), i2) : wthVarJ.a() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        d(i == 0);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        d(false);
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        android.graphics.drawable.Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable != null) {
            ((defpackage.wte) currentDrawable).l(false, false, false);
        }
        super.setIndeterminate(z);
        android.graphics.drawable.Drawable currentDrawable2 = getCurrentDrawable();
        if (currentDrawable2 != null) {
            ((defpackage.wte) currentDrawable2).l(g(), false, false);
        }
        if ((currentDrawable2 instanceof defpackage.wtj) && g()) {
            ((defpackage.wtj) currentDrawable2).b.f();
        }
        this.d = false;
    }

    @Override // android.widget.ProgressBar
    public final void setIndeterminateDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof defpackage.wtj) {
            ((defpackage.wte) drawable).l(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.f) {
                throw new java.lang.IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            super.setIndeterminateDrawable(drawable);
        }
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        i(i);
    }

    @Override // android.widget.ProgressBar
    public final void setProgressDrawable(android.graphics.drawable.Drawable drawable) {
        if (!(drawable instanceof defpackage.wta)) {
            if (this.f) {
                throw new java.lang.IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            defpackage.wta wtaVar = (defpackage.wta) drawable;
            wtaVar.l(false, false, false);
            super.setProgressDrawable(wtaVar);
            wtaVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }
}
