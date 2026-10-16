package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class psn implements java.util.concurrent.Executor {
    private final java.util.concurrent.Executor a;
    private final boolean b;
    private java.util.List c = new java.util.ArrayList();
    private volatile boolean d;

    public psn(java.util.concurrent.Executor executor, boolean z, boolean z2) {
        this.a = executor;
        this.d = z;
        this.b = z2;
    }

    public final void a() {
        synchronized (this) {
            this.d = true;
        }
    }

    public final void b() {
        if (!this.b) {
            if (this.d) {
                synchronized (this) {
                    while (!this.c.isEmpty()) {
                        defpackage.ygw ygwVarO = defpackage.ygw.o(this.c);
                        this.c.clear();
                        defpackage.you youVarListIterator = ygwVarO.listIterator(0);
                        while (youVarListIterator.hasNext()) {
                            this.a.execute((java.lang.Runnable) youVarListIterator.next());
                        }
                    }
                    this.d = false;
                }
                return;
            }
            return;
        }
        int i = defpackage.ygw.d;
        java.util.List list = defpackage.ymx.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        synchronized (this) {
            if (this.d) {
                this.d = false;
                list = this.c;
                this.c = arrayList;
            }
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.execute((java.lang.Runnable) it.next());
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (!this.d) {
            this.a.execute(runnable);
            return;
        }
        synchronized (this) {
            if (this.d) {
                this.c.add(runnable);
            } else {
                this.a.execute(runnable);
            }
        }
    }
}
