package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajxc implements java.io.Serializable, defpackage.ajrw {
    private static final long serialVersionUID = -7581093305228232025L;
    private final java.util.TreeSet a = new java.util.TreeSet(new defpackage.ajvk());
    private transient java.util.concurrent.locks.ReadWriteLock b = new java.util.concurrent.locks.ReentrantReadWriteLock();

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        this.b = new java.util.concurrent.locks.ReentrantReadWriteLock();
    }

    @Override // defpackage.ajrw
    public final java.util.List a() {
        this.b.readLock().lock();
        try {
            return new java.util.ArrayList(this.a);
        } finally {
            this.b.readLock().unlock();
        }
    }

    @Override // defpackage.ajrw
    public final void b(defpackage.ajvi ajviVar) {
        if (ajviVar != null) {
            this.b.writeLock().lock();
            try {
                java.util.TreeSet treeSet = this.a;
                treeSet.remove(ajviVar);
                if (!ajviVar.g(new java.util.Date())) {
                    treeSet.add(ajviVar);
                }
            } finally {
                this.b.writeLock().unlock();
            }
        }
    }

    @Override // defpackage.ajrw
    public final void c(java.util.Date date) {
        this.b.writeLock().lock();
        try {
            java.util.Iterator it = this.a.iterator();
            while (it.hasNext()) {
                if (((defpackage.ajvi) it.next()).g(date)) {
                    it.remove();
                }
            }
            this.b.writeLock().unlock();
        } catch (java.lang.Throwable th) {
            this.b.writeLock().unlock();
            throw th;
        }
    }

    public final java.lang.String toString() {
        this.b.readLock().lock();
        try {
            return this.a.toString();
        } finally {
            this.b.readLock().unlock();
        }
    }
}
