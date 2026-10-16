package k1;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: k1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC3132t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f38872a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f38873b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f38874c;

    public ViewTreeObserverOnPreDrawListenerC3132t(View view, Runnable runnable) {
        this.f38872a = view;
        this.f38873b = view.getViewTreeObserver();
        this.f38874c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC3132t viewTreeObserverOnPreDrawListenerC3132t = new ViewTreeObserverOnPreDrawListenerC3132t(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC3132t);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC3132t);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f38873b.isAlive();
        View view = this.f38872a;
        if (zIsAlive) {
            this.f38873b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f38874c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f38873b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f38873b.isAlive();
        View view2 = this.f38872a;
        if (zIsAlive) {
            this.f38873b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
