package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface MutableIntState extends IntState, MutableState<Integer> {

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static Integer getValue(MutableIntState mutableIntState) {
            return Integer.valueOf(CC.access$getValue$jd(mutableIntState));
        }

        @Deprecated
        public static void setValue(MutableIntState mutableIntState, int i2) {
            mutableIntState.setIntValue(i2);
        }
    }

    @Override // androidx.compose.runtime.IntState
    int getIntValue();

    @Override // androidx.compose.runtime.IntState, androidx.compose.runtime.State
    Integer getValue();

    void setIntValue(int i2);

    void setValue(int i2);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.MutableIntState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Integer $default$getValue(MutableIntState mutableIntState) {
            return Integer.valueOf(mutableIntState.getIntValue());
        }

        public static /* synthetic */ int access$getValue$jd(MutableIntState mutableIntState) {
            return $default$getValue(mutableIntState).intValue();
        }
    }
}
