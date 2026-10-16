package defpackage;

/* JADX INFO: loaded from: classes3.dex */
class yvu extends defpackage.yvw {
    final int a;
    final j$.time.Duration b;
    final double c;

    public yvu(j$.time.Duration duration, int i) {
        defpackage.ysr.bf(i > 0, "%s (%s) must be > 0", "numAttempts", i);
        this.a = i;
        defpackage.zft.c(duration);
        this.b = duration;
        defpackage.ysr.bg(true, "%s (%s) must be > 0", "multiplier", java.lang.Double.valueOf(2.0d));
        this.c = 2.0d;
    }

    @Override // defpackage.yvw
    public final boolean a(int i) {
        defpackage.ysr.bf(i >= 0, "%s (%s) must be >= 0", "tries", i);
        return i < this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.yvu) {
            defpackage.yvu yvuVar = (defpackage.yvu) obj;
            if (this.b.equals(yvuVar.b)) {
                double d = yvuVar.c;
                if (this.a == yvuVar.a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.a), this.b, java.lang.Double.valueOf(2.0d));
    }
}
