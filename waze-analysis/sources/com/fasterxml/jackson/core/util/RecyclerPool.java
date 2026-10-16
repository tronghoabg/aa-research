package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.RecyclerPool.WithPool;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface RecyclerPool<P extends WithPool<P>> extends Serializable {

    /* compiled from: WazeSource */
    public abstract class NonRecyclingPoolBase<P extends WithPool<P>> implements RecyclerPool<P> {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public P acquireAndLinkPooled() {
            return (P) acquirePooled();
        }

        public abstract P acquirePooled();
    }

    /* compiled from: WazeSource */
    public abstract class ThreadLocalPoolBase<P extends WithPool<P>> implements RecyclerPool<P> {
        private static final long serialVersionUID = 1;

        protected ThreadLocalPoolBase() {
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public P acquireAndLinkPooled() {
            return (P) acquirePooled();
        }

        public abstract P acquirePooled();
    }

    /* compiled from: WazeSource */
    public interface WithPool<P extends WithPool<P>> {
    }

    P acquireAndLinkPooled();
}
