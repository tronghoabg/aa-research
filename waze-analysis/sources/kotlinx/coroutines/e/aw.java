package kotlinx.coroutines.e;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aw extends h {

    /* renamed from: a, reason: collision with root package name */
    public static final aw f51886a = new aw();

    /* renamed from: b, reason: collision with root package name */
    private static final ReentrantReadWriteLock f51887b = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    private static final WeakHashMap f51888c = new WeakHashMap();

    @Override // kotlinx.coroutines.e.h
    public final h.g.a.l a(Class cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = f51887b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            h.g.a.l lVar = (h.g.a.l) f51888c.get(cls);
            if (lVar != null) {
                return lVar;
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i2 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i3 = 0; i3 < readHoldCount; i3++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap weakHashMap = f51888c;
                h.g.a.l lVar2 = (h.g.a.l) weakHashMap.get(cls);
                if (lVar2 != null) {
                    return lVar2;
                }
                h.g.a.l lVarD = r.d(cls);
                weakHashMap.put(cls, lVarD);
                while (i2 < readHoldCount) {
                    lock2.lock();
                    i2++;
                }
                writeLock.unlock();
                return lVarD;
            } finally {
                while (i2 < readHoldCount) {
                    lock2.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }
}
