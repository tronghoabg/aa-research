package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajjw {
    public final defpackage.ajjx a;
    public final java.lang.String b;
    public boolean c;
    public defpackage.ajju d;
    public final java.util.List e = new java.util.ArrayList();
    public boolean f;

    public ajjw(defpackage.ajjx ajjxVar, java.lang.String str) {
        this.a = ajjxVar;
        this.b = str;
    }

    public final void a() {
        java.util.TimeZone timeZone = defpackage.ajjs.a;
        defpackage.ajjx ajjxVar = this.a;
        synchronized (ajjxVar) {
            if (c()) {
                ajjxVar.d(this);
            }
        }
    }

    public final void b() {
        java.util.TimeZone timeZone = defpackage.ajjs.a;
        defpackage.ajjx ajjxVar = this.a;
        synchronized (ajjxVar) {
            this.c = true;
            if (c()) {
                ajjxVar.d(this);
            }
        }
    }

    public final boolean c() {
        if (this.d != null) {
            this.f = true;
        }
        java.util.List list = this.e;
        int size = list.size() - 1;
        boolean z = false;
        while (size >= 0) {
            defpackage.ajjx ajjxVar = this.a;
            defpackage.ajju ajjuVar = (defpackage.ajju) list.get(size);
            java.util.logging.Logger logger = ajjxVar.b;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                defpackage.ainb.b(logger, ajjuVar, this, "canceled");
            }
            list.remove(size);
            size--;
            z = true;
        }
        return z;
    }

    public final boolean d(defpackage.ajju ajjuVar, long j, boolean z) {
        ajjuVar.getClass();
        defpackage.ajjw ajjwVar = ajjuVar.b;
        if (ajjwVar != this) {
            if (ajjwVar != null) {
                throw new java.lang.IllegalStateException("task is in multiple queues");
            }
            ajjuVar.b = this;
        }
        defpackage.ajjx ajjxVar = this.a;
        long jNanoTime = java.lang.System.nanoTime();
        long j2 = jNanoTime + j;
        java.util.List list = this.e;
        int iIndexOf = list.indexOf(ajjuVar);
        if (iIndexOf != -1) {
            if (ajjuVar.c <= j2) {
                java.util.logging.Logger logger = ajjxVar.b;
                if (logger.isLoggable(java.util.logging.Level.FINE)) {
                    defpackage.ainb.b(logger, ajjuVar, this, "already scheduled");
                }
                return false;
            }
            list.remove(iIndexOf);
        }
        ajjuVar.c = j2;
        java.util.logging.Logger logger2 = ajjxVar.b;
        if (logger2.isLoggable(java.util.logging.Level.FINE)) {
            long j3 = j2 - jNanoTime;
            defpackage.ainb.b(logger2, ajjuVar, this, z ? "run again after ".concat(defpackage.ainb.a(j3)) : "scheduled after ".concat(defpackage.ainb.a(j3)));
        }
        java.util.Iterator it = list.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((defpackage.ajju) it.next()).c - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = list.size();
        }
        list.add(size, ajjuVar);
        return size == 0;
    }

    public final void e(java.lang.String str, defpackage.afer aferVar) {
        str.getClass();
        aferVar.getClass();
        f(new defpackage.ajjv(str, aferVar));
    }

    public final void f(defpackage.ajju ajjuVar) {
        ajjuVar.getClass();
        defpackage.ajjx ajjxVar = this.a;
        synchronized (ajjxVar) {
            if (this.c) {
                java.util.logging.Logger logger = ajjxVar.b;
                if (logger.isLoggable(java.util.logging.Level.FINE)) {
                    defpackage.ainb.b(logger, ajjuVar, this, "schedule canceled (queue is shutdown)");
                }
            } else if (d(ajjuVar, 0L, false)) {
                ajjxVar.d(this);
            }
        }
    }

    public final java.lang.String toString() {
        return this.b;
    }
}
