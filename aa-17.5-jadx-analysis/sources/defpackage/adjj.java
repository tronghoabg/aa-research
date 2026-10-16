package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes3.dex */
public final class adjj extends adjq implements Closeable {
    public final adjr a;
    public ScheduledFuture b;
    private final adjq h;
    private ArrayList i;
    private adjk j;
    private Throwable k;
    private boolean l;

    public adjj(adjq adjqVar) {
        super(adjqVar, adjqVar.f);
        this.a = adjqVar.b();
        this.h = new adjq(this, this.f);
    }

    @Override // defpackage.adjq
    public final adjq a() {
        return this.h.a();
    }

    @Override // defpackage.adjq
    public final adjr b() {
        return this.a;
    }

    @Override // defpackage.adjq
    public final Throwable c() {
        if (i()) {
            return this.k;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j(null);
    }

    @Override // defpackage.adjq
    public final void d(adjk adjkVar, Executor executor) {
        e(new adjm(executor, adjkVar, this));
    }

    public final void e(adjm adjmVar) {
        synchronized (this) {
            if (i()) {
                adjmVar.a();
            } else {
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList();
                    this.i = arrayList2;
                    arrayList2.add(adjmVar);
                    adjj adjjVar = this.e;
                    if (adjjVar != null) {
                        this.j = new adyr(this, 1);
                        adjjVar.e(new adjm(adjl.a, this.j, this));
                    }
                } else {
                    arrayList.add(adjmVar);
                }
            }
        }
    }

    @Override // defpackage.adjq
    public final void f(adjq adjqVar) {
        this.h.f(adjqVar);
    }

    @Override // defpackage.adjq
    public final void g(adjk adjkVar) {
        h(adjkVar, this);
    }

    public final void h(adjk adjkVar, adjq adjqVar) {
        synchronized (this) {
            ArrayList arrayList = this.i;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    adjm adjmVar = (adjm) this.i.get(size);
                    if (adjmVar.a == adjkVar && adjmVar.b == adjqVar) {
                        this.i.remove(size);
                        break;
                    }
                }
                if (this.i.isEmpty()) {
                    adjj adjjVar = this.e;
                    if (adjjVar != null) {
                        adjjVar.h(this.j, adjjVar);
                    }
                    this.j = null;
                    this.i = null;
                }
            }
        }
    }

    @Override // defpackage.adjq
    public final boolean i() {
        synchronized (this) {
            if (this.l) {
                return true;
            }
            if (!super.i()) {
                return false;
            }
            j(super.c());
            return true;
        }
    }

    public final void j(Throwable th) {
        int i;
        boolean z;
        ScheduledFuture scheduledFuture;
        synchronized (this) {
            if (this.l) {
                z = false;
                scheduledFuture = null;
            } else {
                z = true;
                this.l = true;
                scheduledFuture = this.b;
                if (scheduledFuture != null) {
                    this.b = null;
                } else {
                    scheduledFuture = null;
                }
                this.k = th;
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (z) {
            synchronized (this) {
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    return;
                }
                adjk adjkVar = this.j;
                this.j = null;
                this.i = null;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    adjm adjmVar = (adjm) arrayList.get(i2);
                    if (adjmVar.b == this) {
                        adjmVar.a();
                    }
                }
                int size2 = arrayList.size();
                for (i = 0; i < size2; i++) {
                    adjm adjmVar2 = (adjm) arrayList.get(i);
                    if (adjmVar2.b != this) {
                        adjmVar2.a();
                    }
                }
                adjj adjjVar = this.e;
                if (adjjVar != null) {
                    adjjVar.h(adjkVar, adjjVar);
                }
            }
        }
    }

    public adjj(adjq adjqVar, adjr adjrVar) {
        super(adjqVar, adjqVar.f);
        this.a = adjrVar;
        this.h = new adjq(this, this.f);
    }
}
