package androidx.room.concurrent;

import h.g.a.a;
import h.g.b.x;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ReentrantLockKt {
    public static final <T> T withLock(ReentrantLock reentrantLock, a<? extends T> aVar) {
        x.f(reentrantLock, "<this>");
        x.f(aVar, "block");
        reentrantLock.lock();
        try {
            return aVar.invoke();
        } finally {
            reentrantLock.unlock();
        }
    }
}
