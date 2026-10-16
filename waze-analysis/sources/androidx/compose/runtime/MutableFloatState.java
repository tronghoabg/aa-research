package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface MutableFloatState extends FloatState, MutableState<Float> {

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static Float getValue(MutableFloatState mutableFloatState) {
            return Float.valueOf(CC.access$getValue$jd(mutableFloatState));
        }

        @Deprecated
        public static void setValue(MutableFloatState mutableFloatState, float f2) {
            mutableFloatState.setFloatValue(f2);
        }
    }

    @Override // androidx.compose.runtime.FloatState
    float getFloatValue();

    @Override // androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    Float getValue();

    void setFloatValue(float f2);

    void setValue(float f2);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.MutableFloatState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Float $default$getValue(MutableFloatState mutableFloatState) {
            return Float.valueOf(mutableFloatState.getFloatValue());
        }

        public static /* synthetic */ float access$getValue$jd(MutableFloatState mutableFloatState) {
            return $default$getValue(mutableFloatState).floatValue();
        }
    }
}
