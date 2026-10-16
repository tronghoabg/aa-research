package androidx.compose.runtime;

import h.l.r;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotDoubleStateKt__SnapshotDoubleStateKt {
    public static final double getValue(DoubleState doubleState, Object obj, r<?> rVar) {
        return doubleState.getDoubleValue();
    }

    public static final MutableDoubleState mutableDoubleStateOf(double d2) {
        return SnapshotDoubleState_androidKt.createSnapshotMutableDoubleState(d2);
    }

    public static final void setValue(MutableDoubleState mutableDoubleState, Object obj, r<?> rVar, double d2) {
        mutableDoubleState.setDoubleValue(d2);
    }
}
