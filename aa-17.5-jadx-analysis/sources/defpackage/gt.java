package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class gt {
    ebu b;
    public boolean c;
    private Interpolator e;
    private long d = -1;
    private final ebv f = new gs(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((erb) arrayList.get(i)).t();
            }
            this.c = false;
        }
    }

    public final void b() {
        View view;
        if (this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            erb erbVar = (erb) arrayList.get(i);
            long j = this.d;
            if (j >= 0) {
                erbVar.v(j);
            }
            Interpolator interpolator = this.e;
            if (interpolator != null && (view = (View) ((WeakReference) erbVar.a).get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.b != null) {
                erbVar.w(this.f);
            }
            View view2 = (View) ((WeakReference) erbVar.a).get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.c = true;
    }

    public final void c() {
        if (this.c) {
            return;
        }
        this.d = 250L;
    }

    public final void d(Interpolator interpolator) {
        if (this.c) {
            return;
        }
        this.e = interpolator;
    }

    public final void e(ebu ebuVar) {
        if (this.c) {
            return;
        }
        this.b = ebuVar;
    }

    public final void f(erb erbVar) {
        if (this.c) {
            return;
        }
        this.a.add(erbVar);
    }
}
