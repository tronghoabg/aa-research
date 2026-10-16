package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.RecyclerPool;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class JsonRecyclerPools {

    /* compiled from: WazeSource */
    public class NonRecyclingPool extends RecyclerPool.NonRecyclingPoolBase<BufferRecycler> {
        protected static final NonRecyclingPool GLOBAL = new NonRecyclingPool();
        private static final long serialVersionUID = 1;

        protected NonRecyclingPool() {
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool.NonRecyclingPoolBase
        public BufferRecycler acquirePooled() {
            return new BufferRecycler();
        }

        protected Object readResolve() {
            return GLOBAL;
        }
    }

    /* compiled from: WazeSource */
    public class ThreadLocalPool extends RecyclerPool.ThreadLocalPoolBase<BufferRecycler> {
        protected static final ThreadLocalPool GLOBAL = new ThreadLocalPool();
        private static final long serialVersionUID = 1;

        private ThreadLocalPool() {
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool.ThreadLocalPoolBase
        public BufferRecycler acquirePooled() {
            return BufferRecyclers.getBufferRecycler();
        }

        protected Object readResolve() {
            return GLOBAL;
        }
    }

    public static RecyclerPool<BufferRecycler> defaultPool() {
        return threadLocalPool();
    }

    public static RecyclerPool<BufferRecycler> nonRecyclingPool() {
        return NonRecyclingPool.GLOBAL;
    }

    public static RecyclerPool<BufferRecycler> threadLocalPool() {
        return ThreadLocalPool.GLOBAL;
    }
}
