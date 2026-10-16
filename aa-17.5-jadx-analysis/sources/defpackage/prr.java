package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class prr implements Executor {
    private final Executor a;
    private final boolean b;
    private List c = new ArrayList();
    private volatile boolean d;

    public prr(Executor executor, boolean z, boolean z2) {
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
                        yfq yfqVarO = yfq.o(this.c);
                        this.c.clear();
                        ynp ynpVarListIterator = yfqVarO.listIterator(0);
                        while (ynpVarListIterator.hasNext()) {
                            this.a.execute((Runnable) ynpVarListIterator.next());
                        }
                    }
                    this.d = false;
                }
                return;
            }
            return;
        }
        int i = yfq.d;
        List list = yls.a;
        ArrayList arrayList = new ArrayList(0);
        synchronized (this) {
            if (this.d) {
                this.d = false;
                list = this.c;
                this.c = arrayList;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.execute((Runnable) it.next());
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
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
