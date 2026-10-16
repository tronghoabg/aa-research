package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DoubleState extends State<Double> {

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static Double getValue(DoubleState doubleState) {
            return Double.valueOf(CC.access$getValue$jd(doubleState));
        }
    }

    double getDoubleValue();

    @Override // androidx.compose.runtime.State
    Double getValue();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.DoubleState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Double $default$getValue(DoubleState doubleState) {
            return Double.valueOf(doubleState.getDoubleValue());
        }

        public static /* synthetic */ double access$getValue$jd(DoubleState doubleState) {
            return $default$getValue(doubleState).doubleValue();
        }
    }
}
