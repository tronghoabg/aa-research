package androidx.compose.runtime;

import h.ab;
import h.g.a.a;
import h.g.b.x;
import kotlinx.coroutines.a.ag;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapshotFlowManager {
    public static final int $stable = 8;
    private SnapshotFlowManagerImpl managerImpl = new SingleSubscriptionSnapshotFlowManager();

    public final void dispose() {
        SnapshotFlowManagerImpl snapshotFlowManagerImpl = this.managerImpl;
        if (snapshotFlowManagerImpl == null) {
            PreconditionsKt.throwIllegalStateException("Called dispose on a manager that has been disposed of");
        }
        snapshotFlowManagerImpl.dispose$runtime();
        this.managerImpl = null;
    }

    public final void reportSnapshotFlowCancellation$runtime(ag<? super ab> agVar) {
        SnapshotFlowManagerImpl snapshotFlowManagerImpl = this.managerImpl;
        if (snapshotFlowManagerImpl != null) {
            snapshotFlowManagerImpl.reportSnapshotFlowCancellation$runtime(agVar);
        }
    }

    public final <T> T runAndWatch$runtime(ag<? super ab> agVar, a<? extends T> aVar) {
        SingleSubscriptionSnapshotFlowManager singleSubscriptionSnapshotFlowManager;
        ag<ab> subscribedChannel;
        if (this.managerImpl == null) {
            PreconditionsKt.throwIllegalStateException("Called runAndWatch on a manager that has been disposed of");
        }
        SnapshotFlowManagerImpl snapshotFlowManagerImpl = this.managerImpl;
        if ((snapshotFlowManagerImpl instanceof SingleSubscriptionSnapshotFlowManager) && (subscribedChannel = (singleSubscriptionSnapshotFlowManager = (SingleSubscriptionSnapshotFlowManager) snapshotFlowManagerImpl).getSubscribedChannel()) != null && !x.n(subscribedChannel, agVar)) {
            this.managerImpl = singleSubscriptionSnapshotFlowManager.promote();
        }
        SnapshotFlowManagerImpl snapshotFlowManagerImpl2 = this.managerImpl;
        x.c(snapshotFlowManagerImpl2);
        return (T) snapshotFlowManagerImpl2.runAndWatch$runtime(agVar, aVar);
    }
}
