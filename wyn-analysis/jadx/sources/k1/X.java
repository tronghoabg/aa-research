package k1;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f38790a;

    public X(View view) {
        this.f38790a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.f38790a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.f38790a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j8) {
        View view = (View) this.f38790a.get();
        if (view != null) {
            view.animate().setDuration(j8);
        }
    }

    public final void d(Y y10) {
        View view = (View) this.f38790a.get();
        if (view != null) {
            if (y10 != null) {
                view.animate().setListener(new D9.c(1, y10, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.f38790a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
