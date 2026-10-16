package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class advd implements admv {
    private final /* synthetic */ int a;

    public advd(int i) {
        this.a = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.String str) {
        if (this.a != 0) {
            return str;
        }
        defpackage.ysr.aY(str.length() > 0, "empty timeout");
        defpackage.ysr.aY(str.length() <= 9, "bad timeout format");
        long j = java.lang.Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.HOURS.toNanos(j));
        }
        if (cCharAt == 'M') {
            return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MINUTES.toNanos(j));
        }
        if (cCharAt == 'S') {
            return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.SECONDS.toNanos(j));
        }
        if (cCharAt == 'u') {
            return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MICROSECONDS.toNanos(j));
        }
        if (cCharAt == 'm') {
            return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j));
        }
        if (cCharAt == 'n') {
            return java.lang.Long.valueOf(j);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid timeout unit: %s", java.lang.Character.valueOf(cCharAt)));
    }

    public final /* synthetic */ java.lang.String b(java.lang.Object obj) {
        if (this.a != 0) {
            return (java.lang.String) obj;
        }
        long jMax = java.lang.Math.max(1L, ((java.lang.Long) obj).longValue());
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
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
