package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class lz {
    public defpackage.izq a = null;
    private final java.util.ArrayList b = new java.util.ArrayList();

    public static void i(defpackage.mr mrVar) {
        int i = mrVar.j;
        if (!mrVar.t() && (i & 4) == 0) {
            int i2 = mrVar.d;
            mrVar.a();
        }
    }

    public static final defpackage.euf n(defpackage.mr mrVar) {
        defpackage.euf eufVar = new defpackage.euf(null);
        eufVar.f(mrVar);
        return eufVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    public final void a(defpackage.mr mrVar) {
        defpackage.izq izqVar = this.a;
        if (izqVar != null) {
            boolean z = true;
            mrVar.n(true);
            if (mrVar.h != null && mrVar.i == null) {
                mrVar.h = null;
            }
            mrVar.i = null;
            if ((mrVar.j & 16) != 0) {
                return;
            }
            android.view.View view = mrVar.a;
            android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) izqVar.a;
            recyclerView.ae();
            defpackage.kf kfVar = recyclerView.h;
            int i = kfVar.c;
            if (i != 1) {
                if (i == 2) {
                    throw new java.lang.IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    kfVar.c = 2;
                    defpackage.izq izqVar2 = kfVar.e;
                    int iX = izqVar2.x(view);
                    if (iX == -1) {
                        kfVar.l(view);
                        kfVar.c = 0;
                    } else {
                        defpackage.ke keVar = kfVar.a;
                        if (keVar.f(iX)) {
                            keVar.g(iX);
                            kfVar.l(view);
                            izqVar2.A(iX);
                            kfVar.c = 0;
                        } else {
                            kfVar.c = 0;
                        }
                    }
                    if (z) {
                        defpackage.mr mrVarK = android.support.v7.widget.RecyclerView.k(view);
                        defpackage.mh mhVar = recyclerView.e;
                        mhVar.l(mrVarK);
                        mhVar.j(mrVarK);
                    }
                    recyclerView.af(!z);
                    if (z && mrVar.x()) {
                        ((android.support.v7.widget.RecyclerView) izqVar.a).removeDetachedView(mrVar.a, false);
                        return;
                    }
                } catch (java.lang.Throwable th) {
                    kfVar.c = 0;
                    throw th;
                }
            }
            if (kfVar.d != view) {
                throw new java.lang.IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z = false;
            if (z) {
                defpackage.mr mrVarK2 = android.support.v7.widget.RecyclerView.k(view);
                defpackage.mh mhVar2 = recyclerView.e;
                mhVar2.l(mrVarK2);
                mhVar2.j(mrVarK2);
            }
            recyclerView.af(!z);
            if (z) {
            }
        }
    }

    public final void b() {
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ajnd) arrayList.get(i)).k();
        }
        arrayList.clear();
    }

    public abstract void c(defpackage.mr mrVar);

    public abstract void d();

    public abstract void e();

    public boolean f(defpackage.mr mrVar) {
        throw null;
    }

    public boolean g(defpackage.mr mrVar, java.util.List list) {
        throw null;
    }

    public abstract boolean h();

    public abstract boolean j(defpackage.mr mrVar, defpackage.euf eufVar, defpackage.euf eufVar2);

    public abstract boolean k(defpackage.mr mrVar, defpackage.mr mrVar2, defpackage.euf eufVar, defpackage.euf eufVar2);

    public abstract boolean l(defpackage.mr mrVar, defpackage.euf eufVar, defpackage.euf eufVar2);

    public abstract boolean m(defpackage.mr mrVar, defpackage.euf eufVar, defpackage.euf eufVar2);

    public final boolean o(ajnd ajndVar) {
        boolean zH = h();
        if (ajndVar != null) {
            if (!zH) {
                ajndVar.k();
                return zH;
            }
            this.b.add(ajndVar);
        }
        return zH;
    }
}
