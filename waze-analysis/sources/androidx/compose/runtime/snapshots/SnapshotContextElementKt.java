package androidx.compose.runtime.snapshots;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapshotContextElementKt {
    public static final SnapshotContextElement asContextElement(Snapshot snapshot) {
        return new SnapshotContextElementImpl(snapshot);
    }
}
