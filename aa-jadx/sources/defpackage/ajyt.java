package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class ajyt extends defpackage.ajyp {
    public final org.apache.commons.logging.Log c = org.apache.commons.logging.LogFactory.getLog(getClass());
    public final java.util.concurrent.locks.Lock d;
    protected final defpackage.ajud e;
    protected final java.util.Set f;
    protected final java.util.Queue g;
    protected final java.util.Queue h;
    protected final java.util.Map i;
    protected volatile boolean j;
    protected volatile int k;
    protected volatile int l;
    protected final defpackage.ajyh m;

    public ajyt(defpackage.ajyh ajyhVar, defpackage.ajud ajudVar, int i) {
        defpackage.aguw.e(ajyhVar, "Connection operator");
        this.d = this.a;
        this.f = this.b;
        this.m = ajyhVar;
        this.e = ajudVar;
        this.k = i;
        this.g = new java.util.LinkedList();
        this.h = new java.util.LinkedList();
        this.i = new java.util.HashMap();
    }

    public final void a(defpackage.ajyq ajyqVar) {
        try {
            ajyqVar.e.close();
        } catch (java.io.IOException e) {
            this.c.debug("I/O error closing connection", e);
        }
    }

    public final void b(defpackage.ajyq ajyqVar, boolean z, long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.ajyx ajyxVar;
        java.lang.String str;
        defpackage.ajug ajugVar = ajyqVar.a;
        org.apache.commons.logging.Log log = this.c;
        if (log.isDebugEnabled()) {
            log.debug("Releasing connection [" + java.lang.String.valueOf(ajugVar) + "][" + java.lang.String.valueOf(ajyqVar.b) + "]");
        }
        java.util.concurrent.locks.Lock lock = this.d;
        lock.lock();
        try {
            if (this.j) {
                a(ajyqVar);
                lock.unlock();
                return;
            }
            this.f.remove(ajyqVar);
            defpackage.ajyu ajyuVarD = d(ajugVar);
            if (!z || ajyuVarD.a() < 0) {
                a(ajyqVar);
                ajyuVarD.b();
                this.l--;
            } else {
                if (log.isDebugEnabled()) {
                    if (j > 0) {
                        str = "for " + j + " " + java.lang.String.valueOf(timeUnit);
                    } else {
                        str = "indefinitely";
                    }
                    log.debug("Pooling connection [" + java.lang.String.valueOf(ajugVar) + "][" + java.lang.String.valueOf(ajyqVar.b) + "]; keep alive " + str);
                }
                int i = ajyuVarD.g;
                if (i <= 0) {
                    throw new java.lang.IllegalStateException("No entry created for this pool. ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajyuVarD.b))));
                }
                java.util.LinkedList linkedList = ajyuVarD.e;
                if (i <= linkedList.size()) {
                    throw new java.lang.IllegalStateException("No entry allocated from this pool. ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajyuVarD.b))));
                }
                linkedList.add(ajyqVar);
                ajyqVar.f = java.lang.Math.min(Long.MAX_VALUE, j > 0 ? java.lang.System.currentTimeMillis() + timeUnit.toMillis(j) : Long.MAX_VALUE);
                this.g.add(ajyqVar);
            }
            lock.lock();
            try {
                java.util.Queue queue = ajyuVarD.f;
                if (queue.isEmpty()) {
                    java.util.Queue queue2 = this.h;
                    if (queue2.isEmpty()) {
                        if (log.isDebugEnabled()) {
                            log.debug("Notifying no-one, there are no waiting threads");
                        }
                        ajyxVar = null;
                    } else {
                        if (log.isDebugEnabled()) {
                            log.debug("Notifying thread waiting on any pool");
                        }
                        ajyxVar = (defpackage.ajyx) queue2.remove();
                    }
                } else {
                    if (log.isDebugEnabled()) {
                        log.debug(defpackage.a.bU(ajyuVarD.b, "Notifying thread waiting on pool [", "]"));
                    }
                    ajyxVar = (defpackage.ajyx) queue.peek();
                }
                if (ajyxVar != null) {
                    ajyxVar.b();
                }
                this.d.unlock();
            } finally {
                this.d.unlock();
            }
        } catch (java.lang.Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    protected final defpackage.ajyq c(defpackage.ajyu ajyuVar, defpackage.ajyh ajyhVar) {
        org.apache.commons.logging.Log log = this.c;
        if (log.isDebugEnabled()) {
            log.debug("Creating new connection [" + java.lang.String.valueOf(ajyuVar.b) + "]");
        }
        defpackage.ajug ajugVar = ajyuVar.b;
        defpackage.ajyq ajyqVar = new defpackage.ajyq(ajyhVar, ajugVar);
        this.d.lock();
        try {
            defpackage.aguw.a(ajugVar.equals(ajyqVar.a), "Entry not planned for this pool");
            ajyuVar.g++;
            this.l++;
            this.f.add(ajyqVar);
            return ajyqVar;
        } finally {
            this.d.unlock();
        }
    }

    protected final defpackage.ajyu d(defpackage.ajug ajugVar) {
        this.d.lock();
        try {
            java.util.Map map = this.i;
            defpackage.ajyu ajyuVar = (defpackage.ajyu) map.get(ajugVar);
            if (ajyuVar == null) {
                ajyuVar = new defpackage.ajyu(ajugVar, this.e);
                map.put(ajugVar, ajyuVar);
            }
            return ajyuVar;
        } finally {
            this.d.unlock();
        }
    }
}
