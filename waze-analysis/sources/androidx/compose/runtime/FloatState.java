package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface FloatState extends State<Float> {

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static Float getValue(FloatState floatState) {
            return Float.valueOf(CC.access$getValue$jd(floatState));
        }
    }

    float getFloatValue();

    @Override // androidx.compose.runtime.State
    Float getValue();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.FloatState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Float $default$getValue(FloatState floatState) {
            return Float.valueOf(floatState.getFloatValue());
        }

        public static /* synthetic */ float access$getValue$jd(FloatState floatState) {
            return $default$getValue(floatState).floatValue();
        }
    }
}
