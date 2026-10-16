package android.support.v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private Object f668a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f669b;

    public abstract Menu a();

    public abstract MenuInflater b();

    public abstract View c();

    public abstract CharSequence d();

    public abstract CharSequence e();

    public abstract void f();

    public abstract void g();

    public abstract void h(View view);

    public abstract void i(int i2);

    public abstract void j(CharSequence charSequence);

    public abstract void k(int i2);

    public abstract void l(CharSequence charSequence);

    public void m(boolean z) {
        this.f669b = z;
    }

    public boolean o() {
        throw null;
    }

    public final Object p() {
        return this.f668a;
    }

    public final void q(Object obj) {
        this.f668a = obj;
    }

    public final boolean r() {
        return this.f669b;
    }
}
