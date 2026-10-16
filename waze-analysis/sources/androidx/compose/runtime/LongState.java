package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LongState extends State<Long> {

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static Long getValue(LongState longState) {
            return Long.valueOf(CC.access$getValue$jd(longState));
        }
    }

    long getLongValue();

    @Override // androidx.compose.runtime.State
    Long getValue();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.LongState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Long $default$getValue(LongState longState) {
            return Long.valueOf(longState.getLongValue());
        }

        public static /* synthetic */ long access$getValue$jd(LongState longState) {
            return $default$getValue(longState).longValue();
        }
    }
}
