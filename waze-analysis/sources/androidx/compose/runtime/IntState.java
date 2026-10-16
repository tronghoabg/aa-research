package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface IntState extends State<Integer> {

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static Integer getValue(IntState intState) {
            return Integer.valueOf(CC.access$getValue$jd(intState));
        }
    }

    int getIntValue();

    @Override // androidx.compose.runtime.State
    Integer getValue();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.IntState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Integer $default$getValue(IntState intState) {
            return Integer.valueOf(intState.getIntValue());
        }

        public static /* synthetic */ int access$getValue$jd(IntState intState) {
            return $default$getValue(intState).intValue();
        }
    }
}
