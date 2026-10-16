package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vba {
    public final java.lang.ThreadLocal b = new defpackage.vay();
    public final java.util.concurrent.locks.ReadWriteLock c = new java.util.concurrent.locks.ReentrantReadWriteLock();
    public final java.util.Map d = new java.util.LinkedHashMap();
    public final java.lang.ThreadLocal e = new defpackage.vaz();

    public final int a() {
        this.c.readLock().lock();
        try {
            return this.d.size();
        } finally {
            this.c.readLock().unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract defpackage.zhs b();

    protected void i() {
        throw null;
    }

    protected void j() {
        throw null;
    }

    public final void o(defpackage.vbc vbcVar, java.util.concurrent.Executor executor) {
        vbcVar.getClass();
        executor.getClass();
        java.util.concurrent.locks.ReadWriteLock readWriteLock = this.c;
        readWriteLock.writeLock().lock();
        try {
            java.util.Map map = this.d;
            if (map.containsKey(vbcVar)) {
                throw new java.lang.IllegalArgumentException("Observer already added");
            }
            map.put(vbcVar, new defpackage.vbd(vbcVar, executor));
            readWriteLock.writeLock().unlock();
            j();
        } catch (java.lang.Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    public final void p(boolean z) {
        this.e.set(java.lang.Boolean.valueOf(z));
    }
}
