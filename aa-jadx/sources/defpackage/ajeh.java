package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ajeh extends defpackage.ajcy {
    public static final defpackage.ajeh a = new defpackage.ajeh();
    private static final java.util.concurrent.locks.ReentrantReadWriteLock b = new java.util.concurrent.locks.ReentrantReadWriteLock();
    private static final java.util.WeakHashMap c = new java.util.WeakHashMap();

    @Override // defpackage.ajcy
    public final defpackage.affc a(java.lang.Class cls) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = b;
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            defpackage.affc affcVar = (defpackage.affc) c.get(cls);
            lock.unlock();
            if (affcVar != null) {
                return affcVar;
            }
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                java.util.WeakHashMap weakHashMap = c;
                defpackage.affc affcVar2 = (defpackage.affc) weakHashMap.get(cls);
                if (affcVar2 != null) {
                    while (i < readHoldCount) {
                        lock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                    return affcVar2;
                }
                defpackage.affc affcVarB = defpackage.ajdi.b(cls);
                weakHashMap.put(cls, affcVarB);
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                return affcVarB;
            } catch (java.lang.Throwable th) {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
