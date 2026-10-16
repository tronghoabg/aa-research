package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.wrp;

/* loaded from: classes3.dex */
public abstract class wro<S extends wrp> extends ProgressBar {
    public final wrp a;
    public int b;
    public final int c;
    public boolean d;
    public final int e;
    public boolean f;
    public final Runnable g;
    public final Runnable h;
    private final boolean i;
    private final fhh j;
    private final fhh k;

    protected wro(Context context, AttributeSet attributeSet, int i, int i2) {
        super(wxp.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.d = false;
        this.e = 4;
        this.g = new wil(this, 6, null);
        this.h = new wil(this, 7, null);
        this.j = new wrm(this);
        this.k = new wrn(this);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        TypedArray typedArrayA = wqr.a(context2, attributeSet, wsw.a, i, i2, new int[0]);
        typedArrayA.getInt(7, -1);
        this.c = Math.min(typedArrayA.getInt(5, -1), 1000);
        typedArrayA.recycle();
        this.i = true;
    }

    private final wsk j() {
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

    public abstract wrp a(Context context, AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final wsd getProgressDrawable() {
        return (wsd) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final wsm getIndeterminateDrawable() {
        return (wsm) super.getIndeterminateDrawable();
    }

    protected final void d(boolean z) {
        if (this.i) {
            ((wsh) getCurrentDrawable()).l(g(), false, z);
        }
    }

    public final void e() {
        if (this.c > 0) {
            SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public final void f(int i) {
        wrp wrpVar = this.a;
        if (wrpVar.f != i) {
            wrpVar.f = i;
            invalidate();
        }
    }

    final boolean g() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public final Drawable getCurrentDrawable() {
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
            if (!getIndeterminateDrawable().isVisible() || wpq.e(getContext().getContentResolver()) == BitmapDescriptorFactory.HUE_RED) {
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
        ((wsh) getCurrentDrawable()).l(false, false, false);
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
    protected final synchronized void onDraw(Canvas canvas) {
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
        wsk wskVarJ = j();
        if (wskVarJ == null) {
            return;
        }
        setMeasuredDimension(wskVarJ.b() < 0 ? getDefaultSize(getSuggestedMinimumWidth(), i) : wskVarJ.b() + getPaddingLeft() + getPaddingRight(), wskVarJ.a() < 0 ? getDefaultSize(getSuggestedMinimumHeight(), i2) : wskVarJ.a() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
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
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable != null) {
            ((wsh) currentDrawable).l(false, false, false);
        }
        super.setIndeterminate(z);
        Drawable currentDrawable2 = getCurrentDrawable();
        if (currentDrawable2 != null) {
            ((wsh) currentDrawable2).l(g(), false, false);
        }
        if ((currentDrawable2 instanceof wsm) && g()) {
            ((wsm) currentDrawable2).b.f();
        }
        this.d = false;
    }

    @Override // android.widget.ProgressBar
    public final void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof wsm) {
            ((wsh) drawable).l(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.f) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
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
    public final void setProgressDrawable(Drawable drawable) {
        if (!(drawable instanceof wsd)) {
            if (this.f) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            wsd wsdVar = (wsd) drawable;
            wsdVar.l(false, false, false);
            super.setProgressDrawable(wsdVar);
            wsdVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }
}
