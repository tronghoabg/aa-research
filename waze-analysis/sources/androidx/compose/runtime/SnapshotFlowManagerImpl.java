package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import kotlinx.coroutines.a.ag;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class SnapshotFlowManagerImpl {
    public static final int $stable = 8;
    private final Object lock = new Object();

    public abstract void clearWatchSet$runtime(ag<? super ab> agVar);

    public abstract void commitSubscriptionChanges$runtime();

    public abstract void dispose$runtime();

    protected final Object getLock() {
        return this.lock;
    }

    public abstract l<Object, ab> readObserverFor$runtime(ag<? super ab> agVar);

    public abstract void reportSnapshotFlowCancellation$runtime(ag<? super ab> agVar);

    public final <T> T runAndWatch$runtime(ag<? super ab> agVar, a<? extends T> aVar) {
        Snapshot snapshotTakeSnapshot = Snapshot.Companion.takeSnapshot(readObserverFor$runtime(agVar));
        clearWatchSet$runtime(agVar);
        try {
            Snapshot snapshotMakeCurrent = snapshotTakeSnapshot.makeCurrent();
            try {
                T tInvoke = aVar.invoke();
                snapshotTakeSnapshot.dispose();
                commitSubscriptionChanges$runtime();
                return tInvoke;
            } finally {
                snapshotTakeSnapshot.restoreCurrent(snapshotMakeCurrent);
            }
        } catch (Throwable th) {
            snapshotTakeSnapshot.dispose();
            throw th;
        }
    }

    public abstract void watch$runtime(ag<? super ab> agVar, Object obj);
}
