package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ger {
    private static final long[] a;
    private static final String[] b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        TimeUnit timeUnit4 = TimeUnit.SECONDS;
        a = new long[]{86400000, 3600000, 60000, 1000, 1};
        b = new String[]{"d", "h", "m", "s", "ms"};
    }

    public static String a(long j) {
        StringBuilder sb = new StringBuilder();
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
