package androidx.compose.foundation.lazy.layout;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CachedItem {
    private Object key;
    private int mainAxisSize;
    public static final NoKey NoKey = new NoKey(null);
    public static final int $stable = 8;

    public CachedItem(Object obj, int i2) {
        this.key = obj;
        this.mainAxisSize = i2;
    }

    public final Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final void setKey(Object obj) {
        this.key = obj;
    }

    public final void setMainAxisSize(int i2) {
        this.mainAxisSize = i2;
    }

    public String toString() {
        return "CachedItem(key=" + this.key + ", mainAxisSize=" + this.mainAxisSize + ')';
    }

    /* compiled from: WazeSource */
    public final class NoKey {
        private NoKey() {
        }

        public /* synthetic */ NoKey(o oVar) {
            this();
        }
    }
}
