package androidx.compose.runtime.snapshots.tooling;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface SnapshotObserver {
    void onApplied(Snapshot snapshot, Set<? extends Object> set);

    void onCreated(Snapshot snapshot, Snapshot snapshot2, SnapshotInstanceObservers snapshotInstanceObservers);

    SnapshotInstanceObservers onPreCreate(Snapshot snapshot, boolean z);

    void onPreDispose(Snapshot snapshot);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.snapshots.tooling.SnapshotObserver$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static SnapshotInstanceObservers $default$onPreCreate(SnapshotObserver snapshotObserver, Snapshot snapshot, boolean z) {
            return null;
        }

        public static void $default$onPreDispose(SnapshotObserver snapshotObserver, Snapshot snapshot) {
        }

        public static void $default$onApplied(SnapshotObserver snapshotObserver, Snapshot snapshot, Set set) {
        }

        public static void $default$onCreated(SnapshotObserver snapshotObserver, Snapshot snapshot, Snapshot snapshot2, SnapshotInstanceObservers snapshotInstanceObservers) {
        }
    }
}
