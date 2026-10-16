package androidx.compose.runtime;

import h.l.r;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PrimitiveSnapshotStateKt {
    public static final float getValue(FloatState floatState, Object obj, r<?> rVar) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.getValue(floatState, obj, rVar);
    }

    public static final MutableFloatState mutableFloatStateOf(float f2) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.mutableFloatStateOf(f2);
    }

    public static final void setValue(MutableFloatState mutableFloatState, Object obj, r<?> rVar, float f2) {
        PrimitiveSnapshotStateKt__SnapshotFloatStateKt.setValue(mutableFloatState, obj, rVar, f2);
    }
}
