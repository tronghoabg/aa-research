package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class adud implements adlu {
    private final /* synthetic */ int a;

    public adud(int i) {
        this.a = i;
    }

    @Override // defpackage.adlu
    public final /* synthetic */ Object a(String str) throws NumberFormatException {
        if (this.a != 0) {
            return str;
        }
        woy.O(str.length() > 0, "empty timeout");
        woy.O(str.length() <= 9, "bad timeout format");
        long j = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j);
        }
        throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
    }

    @Override // defpackage.adlu
    public final /* synthetic */ String b(Object obj) {
        if (this.a != 0) {
            return (String) obj;
        }
        long jMax = Math.max(1L, ((Long) obj).longValue());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (jMax < 100000000) {
            return jMax + "n";
        }
        if (jMax < 100000000000L) {
            return (jMax / 1000) + "u";
        }
        if (jMax < 100000000000000L) {
            return (jMax / 1000000) + "m";
        }
        if (jMax < 100000000000000000L) {
            return (jMax / 1000000000) + "S";
        }
        if (jMax < 6000000000000000000L) {
            return (jMax / 60000000000L) + "M";
        }
        return (jMax / 3600000000000L) + "H";
    }
}
