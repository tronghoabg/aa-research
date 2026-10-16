package androidx.compose.runtime;

import h.l.r;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class PrimitiveSnapshotStateKt__SnapshotFloatStateKt {
    public static final float getValue(FloatState floatState, Object obj, r<?> rVar) {
        return floatState.getFloatValue();
    }

    public static final MutableFloatState mutableFloatStateOf(float f2) {
        return SnapshotFloatState_androidKt.createSnapshotMutableFloatState(f2);
    }

    public static final void setValue(MutableFloatState mutableFloatState, Object obj, r<?> rVar, float f2) {
        mutableFloatState.setFloatValue(f2);
    }
}
