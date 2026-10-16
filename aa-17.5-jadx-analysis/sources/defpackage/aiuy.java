package defpackage;

/* loaded from: classes2.dex */
public final class aiuy {
    public static final ajcz a = new ajcz("REMOVED_TASK");
    public static final ajcz b = new ajcz("CLOSED_EMPTY");

    public static final long a(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }
}
