package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotMutableState;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapshotState_androidKt {
    public static final <T> SnapshotMutableState<T> createSnapshotMutableState(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return new ParcelableSnapshotMutableState(t, snapshotMutationPolicy);
    }
}
