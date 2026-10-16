package androidx.compose.runtime;

import h.l.r;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotIntStateKt__SnapshotIntStateKt {
    public static final int getValue(IntState intState, Object obj, r<?> rVar) {
        return intState.getIntValue();
    }

    public static final MutableIntState mutableIntStateOf(int i2) {
        return SnapshotIntState_androidKt.createSnapshotMutableIntState(i2);
    }

    public static final void setValue(MutableIntState mutableIntState, Object obj, r<?> rVar, int i2) {
        mutableIntState.setIntValue(i2);
    }
}
