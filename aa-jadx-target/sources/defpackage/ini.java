package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ini {
    public final double a;
    public final double b;
    public double c = 1.0d;
    public j$.time.Instant d;

    public ini(int i) {
        double d = i;
        this.b = defpackage.acpm.a.fF().d() ? 0.5d + d : d;
        this.a = d / 1000.0d;
        this.d = j$.time.Instant.now();
    }
}
