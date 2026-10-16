package androidx.room.concurrent;

import h.e;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ExclusiveLock {
    public static final Companion Companion = new Companion(null);
    private static final Map<String, ReentrantLock> threadLocksMap = new LinkedHashMap();
    private final FileLock fileLock;
    private final ReentrantLock threadLock;

    public ExclusiveLock(String str, boolean z) {
        x.f(str, "filename");
        Companion companion = Companion;
        this.threadLock = companion.getThreadLock(str);
        this.fileLock = z ? companion.getFileLock(str) : null;
    }

    public final <T> T withLock(a<? extends T> aVar, l lVar) {
        boolean z;
        x.f(aVar, "onLocked");
        x.f(lVar, "onLockError");
        this.threadLock.lock();
        try {
            FileLock fileLock = this.fileLock;
            if (fileLock != null) {
                fileLock.lock();
            }
        } catch (Throwable th) {
            th = th;
            z = false;
        }
        try {
            try {
                return aVar.invoke();
            } finally {
                FileLock fileLock2 = this.fileLock;
                if (fileLock2 != null) {
                    fileLock2.unlock();
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = true;
            try {
                if (z) {
                    throw th;
                }
                lVar.invoke(th);
                throw new e();
            } finally {
                this.threadLock.unlock();
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final FileLock getFileLock(String str) {
            return new FileLock(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ReentrantLock getThreadLock(String str) {
            ReentrantLock reentrantLock;
            synchronized (this) {
                Map map = ExclusiveLock.threadLocksMap;
                Object reentrantLock2 = map.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    map.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            }
            return reentrantLock;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
