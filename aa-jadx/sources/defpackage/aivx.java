package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aivx {
    public static final defpackage.ajdz a = new defpackage.ajdz("REMOVED_TASK");
    public static final defpackage.ajdz b = new defpackage.ajdz("CLOSED_EMPTY");

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
