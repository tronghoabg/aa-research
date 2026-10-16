package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adup {
    private final java.util.Random a = new java.util.Random();
    private final long b;
    private final long c;
    private long d;

    public adup() {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        this.b = 1000000000L;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
        this.c = 120000000000L;
        this.d = 1000000000L;
    }

    public final long a() {
        long j = this.d;
        double d = j;
        this.d = java.lang.Math.min((long) (1.6d * d), this.c);
        double d2 = 0.2d * d;
        double d3 = d * (-0.2d);
        defpackage.ysr.aX(d2 >= d3);
        return j + ((long) ((this.a.nextDouble() * (d2 - d3)) + d3));
    }
}
