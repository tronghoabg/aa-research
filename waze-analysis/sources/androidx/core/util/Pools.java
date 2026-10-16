package androidx.core.util;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Pools {

    /* compiled from: WazeSource */
    public interface Pool<T> {
        T acquire();

        boolean release(T t);
    }

    /* compiled from: WazeSource */
    public class SimplePool<T> implements Pool<T> {
        private final Object[] pool;
        private int poolSize;

        public SimplePool(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.pool = new Object[i2];
        }

        private final boolean isInPool(T t) {
            int i2 = this.poolSize;
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.pool[i3] == t) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            int i2 = this.poolSize;
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            T t = (T) this.pool[i3];
            x.d(t, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.pool[i3] = null;
            this.poolSize--;
            return t;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(T t) {
            x.f(t, "instance");
            if (isInPool(t)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i2 = this.poolSize;
            Object[] objArr = this.pool;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = t;
            this.poolSize = i2 + 1;
            return true;
        }
    }

    /* compiled from: WazeSource */
    public class SynchronizedPool<T> extends SimplePool<T> {
        private final Object lock;

        public SynchronizedPool(int i2) {
            super(i2);
            this.lock = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
            T t;
            synchronized (this.lock) {
                t = (T) super.acquire();
            }
            return t;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(T t) {
            boolean zRelease;
            x.f(t, "instance");
            synchronized (this.lock) {
                zRelease = super.release(t);
            }
            return zRelease;
        }
    }

    private Pools() {
    }
}
