package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface MutableLongState extends LongState, MutableState<Long> {

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static Long getValue(MutableLongState mutableLongState) {
            return Long.valueOf(CC.access$getValue$jd(mutableLongState));
        }

        @Deprecated
        public static void setValue(MutableLongState mutableLongState, long j2) {
            mutableLongState.setLongValue(j2);
        }
    }

    @Override // androidx.compose.runtime.LongState
    long getLongValue();

    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    Long getValue();

    void setLongValue(long j2);

    void setValue(long j2);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.MutableLongState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Long $default$getValue(MutableLongState mutableLongState) {
            return Long.valueOf(mutableLongState.getLongValue());
        }

        public static /* synthetic */ long access$getValue$jd(MutableLongState mutableLongState) {
            return $default$getValue(mutableLongState).longValue();
        }
    }
}
