package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.projection.gearhead.R;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
final class ffa extends ViewGroup implements few {
    ViewGroup a;
    View b;
    final View c;
    int d;
    public Matrix e;
    private final ViewTreeObserver.OnPreDrawListener f;

    public ffa(View view) {
        super(view.getContext());
        this.f = new fez(this, 0);
        this.c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    static ffa b(View view) {
        return (ffa) view.getTag(R.id.ghost_view);
    }

    static void c(View view, View view2) {
        fgu.c(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    @Override // defpackage.few
    public final void a(ViewGroup viewGroup, View view) {
        this.a = viewGroup;
        this.b = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.c;
        view.setTag(R.id.ghost_view, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.f);
        fgu.e(view, 4);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        View view = this.c;
        view.getViewTreeObserver().removeOnPreDrawListener(this.f);
        fgu.e(view, 0);
        view.setTag(R.id.ghost_view, null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        dat.j(canvas, true);
        canvas.setMatrix(this.e);
        View view = this.c;
        fgu.e(view, 0);
        view.invalidate();
        fgu.e(view, 4);
        drawChild(canvas, view, getDrawingTime());
        dat.j(canvas, false);
    }

    @Override // android.view.View, defpackage.few
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.c;
        if (b(view) == this) {
            fgu.e(view, i == 0 ? 4 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
