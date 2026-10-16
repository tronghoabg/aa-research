package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class bg {

    /* renamed from: a, reason: collision with root package name */
    private static final kotlinx.coroutines.e.ak f51755a = new kotlinx.coroutines.e.ak("REMOVED_TASK");

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.coroutines.e.ak f51756b = new kotlinx.coroutines.e.ak("CLOSED_EMPTY");

    public static final long a(long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        if (j2 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j2 * 1000000;
    }
}
