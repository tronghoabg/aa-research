package androidx.compose.runtime;

import h.l.r;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotLongStateKt__SnapshotLongStateKt {
    public static final long getValue(LongState longState, Object obj, r<?> rVar) {
        return longState.getLongValue();
    }

    public static final MutableLongState mutableLongStateOf(long j2) {
        return SnapshotLongState_androidKt.createSnapshotMutableLongState(j2);
    }

    public static final void setValue(MutableLongState mutableLongState, Object obj, r<?> rVar, long j2) {
        mutableLongState.setLongValue(j2);
    }
}
