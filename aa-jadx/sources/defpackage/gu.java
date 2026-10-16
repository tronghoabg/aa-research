package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gu {
    defpackage.ecb b;
    public boolean c;
    private android.view.animation.Interpolator e;
    private long d = -1;
    private final defpackage.ecc f = new defpackage.gt(this);
    public final java.util.ArrayList a = new java.util.ArrayList();

    public final void a() {
        if (this.c) {
            java.util.ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.erh) arrayList.get(i)).D();
            }
            this.c = false;
        }
    }

    public final void b() {
        android.view.View view;
        if (this.c) {
            return;
        }
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.erh erhVar = (defpackage.erh) arrayList.get(i);
            long j = this.d;
            if (j >= 0) {
                erhVar.F(j);
            }
            android.view.animation.Interpolator interpolator = this.e;
            if (interpolator != null && (view = (android.view.View) ((java.lang.ref.WeakReference) erhVar.a).get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.b != null) {
                erhVar.G(this.f);
            }
            android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) erhVar.a).get();
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

    public final void d(android.view.animation.Interpolator interpolator) {
        if (this.c) {
            return;
        }
        this.e = interpolator;
    }

    public final void e(defpackage.ecb ecbVar) {
        if (this.c) {
            return;
        }
        this.b = ecbVar;
    }

    public final void f(defpackage.erh erhVar) {
        if (this.c) {
            return;
        }
        this.a.add(erhVar);
    }
}
