package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gex {
    private static final long[] a;
    private static final java.lang.String[] b;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.HOURS;
        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.MINUTES;
        java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.SECONDS;
        a = new long[]{86400000, 3600000, 60000, 1000, 1};
        b = new java.lang.String[]{"d", "h", "m", "s", "ms"};
    }

    public static java.lang.String a(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (j < 0) {
            return "-";
        }
        if (j == 0) {
            return "0ms";
        }
        boolean z = true;
        int i = 0;
        while (true) {
            long[] jArr = a;
            int length = jArr.length;
            if (i >= 5) {
                return sb.toString();
            }
            long j2 = (i > 0 ? j % jArr[i - 1] : j) / jArr[i];
            if (j2 > 0) {
                if (!z) {
                    sb.append(":");
                }
                sb.append(j2);
                sb.append(b[i]);
                z = false;
            }
            i++;
        }
    }
}
