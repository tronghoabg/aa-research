package androidx.compose.runtime.internal;

import androidx.collection.MutableObjectList;
import androidx.compose.runtime.CancellationHandle;
import androidx.compose.runtime.OneShotCancellationHandle;
import androidx.compose.runtime.internal.AwaiterQueue.Awaiter;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.ao;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AwaiterQueue<A extends Awaiter> {
    public static final int $stable = 8;
    private MutableObjectList<A> awaiters;
    private Throwable failureCause;
    private final Object lock = new Object();
    private final AtomicInt pendingAwaitersCountUnlocked = AtomicAwaitersCount.m7563constructorimpl();
    private MutableObjectList<A> spareList;

    /* compiled from: WazeSource */
    public abstract class Awaiter {
        public static final int $stable = 0;

        public abstract void cancel();

        public abstract void resumeWithException(Throwable th);
    }

    public AwaiterQueue() {
        int i2 = 0;
        int i3 = 1;
        o oVar = null;
        this.awaiters = new MutableObjectList<>(i2, i3, oVar);
        this.spareList = new MutableObjectList<>(i2, i3, oVar);
    }

    static final ab addAwaiter$lambda$1(Awaiter awaiter, AwaiterQueue awaiterQueue, ao aoVar) {
        int i2;
        awaiter.cancel();
        AtomicInt atomicInt = awaiterQueue.pendingAwaitersCountUnlocked;
        int i3 = aoVar.f48103a;
        do {
            i2 = atomicInt.get();
        } while (!atomicInt.compareAndSet(i2, ((i2 >>> 27) & 15) == i3 ? i2 - 1 : i2));
        return ab.f48028a;
    }

    public final CancellationHandle addAwaiter(final A a2, a<ab> aVar) {
        int i2;
        int i3;
        final ao aoVar = new ao();
        aoVar.f48103a = -1;
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th != null) {
                a2.resumeWithException(th);
                return CancellationHandle.Companion.getEmpty$runtime();
            }
            AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
            do {
                i2 = atomicInt.get();
                i3 = i2 + 1;
            } while (!atomicInt.compareAndSet(i2, i3));
            int i4 = 134217727 & i3;
            aoVar.f48103a = (i3 >>> 27) & 15;
            this.awaiters.add(a2);
            if (i4 == 1 && aVar != null) {
                try {
                    aVar.invoke();
                } catch (Throwable th2) {
                    fail(th2);
                }
            }
            return new OneShotCancellationHandle(new a() { // from class: androidx.compose.runtime.internal.AwaiterQueue$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return AwaiterQueue.addAwaiter$lambda$1(a2, this, aoVar);
                }
            });
        }
    }

    public final void fail(Throwable th) {
        int i2;
        synchronized (this.lock) {
            if (this.failureCause == null) {
                this.failureCause = th;
                MutableObjectList<A> mutableObjectList = this.awaiters;
                Object[] objArr = mutableObjectList.content;
                int i3 = mutableObjectList._size;
                for (int i4 = 0; i4 < i3; i4++) {
                    ((Awaiter) objArr[i4]).resumeWithException(th);
                }
                this.awaiters.clear();
                AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
                do {
                    i2 = atomicInt.get();
                } while (!atomicInt.compareAndSet(i2, AtomicAwaitersCount.m7574packimpl(atomicInt, ((i2 >>> 27) & 15) + 1, 0)));
            }
        }
    }

    public final void flushAndDispatchAwaiters(l<? super A, ab> lVar) {
        int i2;
        int i3;
        synchronized (this.lock) {
            MutableObjectList<A> mutableObjectList = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = mutableObjectList;
            AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
            do {
                i2 = atomicInt.get();
            } while (!atomicInt.compareAndSet(i2, AtomicAwaitersCount.m7574packimpl(atomicInt, ((i2 >>> 27) & 15) + 1, 0)));
            int size = mutableObjectList.getSize();
            for (i3 = 0; i3 < size; i3++) {
                lVar.invoke(mutableObjectList.get(i3));
            }
            mutableObjectList.clear();
        }
    }

    public final boolean getHasAwaiters() {
        return (this.pendingAwaitersCountUnlocked.get() & 134217727) > 0;
    }
}
