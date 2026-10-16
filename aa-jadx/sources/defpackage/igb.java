package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class igb {
    public static final /* synthetic */ int a = 0;
    private static final double b = 1.0E-6d;

    public static double a(long j) {
        return (android.os.SystemClock.elapsedRealtimeNanos() - j) * b;
    }
}
