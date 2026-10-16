package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface MutableDoubleState extends DoubleState, MutableState<Double> {

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static Double getValue(MutableDoubleState mutableDoubleState) {
            return Double.valueOf(CC.access$getValue$jd(mutableDoubleState));
        }

        @Deprecated
        public static void setValue(MutableDoubleState mutableDoubleState, double d2) {
            mutableDoubleState.setDoubleValue(d2);
        }
    }

    @Override // androidx.compose.runtime.DoubleState
    double getDoubleValue();

    @Override // androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    Double getValue();

    void setDoubleValue(double d2);

    void setValue(double d2);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.MutableDoubleState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Double $default$getValue(MutableDoubleState mutableDoubleState) {
            return Double.valueOf(mutableDoubleState.getDoubleValue());
        }

        public static /* synthetic */ double access$getValue$jd(MutableDoubleState mutableDoubleState) {
            return $default$getValue(mutableDoubleState).doubleValue();
        }
    }
}
