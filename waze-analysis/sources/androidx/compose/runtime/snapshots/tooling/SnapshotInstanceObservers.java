package androidx.compose.runtime.snapshots.tooling;

import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SnapshotInstanceObservers {
    public static final int $stable = 0;
    private final l<Object, ab> readObserver;
    private final l<Object, ab> writeObserver;

    public /* synthetic */ SnapshotInstanceObservers(l lVar, l lVar2, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : lVar, (i2 & 2) != 0 ? null : lVar2);
    }

    public final l<Object, ab> getReadObserver() {
        return this.readObserver;
    }

    public final l<Object, ab> getWriteObserver() {
        return this.writeObserver;
    }

    public SnapshotInstanceObservers(l<Object, ab> lVar, l<Object, ab> lVar2) {
        this.readObserver = lVar;
        this.writeObserver = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotInstanceObservers() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
