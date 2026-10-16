package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yvt extends defpackage.yvu {
    public yvt(j$.time.Duration duration, int i) {
        super(duration, i);
    }

    public final java.lang.String toString() {
        defpackage.xym xymVar = new defpackage.xym("exponentialBackoff");
        xymVar.g("firstDelayMs", this.b.toMillis());
        xymVar.d("multiplier", 2.0d);
        xymVar.f("tries", this.a);
        return xymVar.toString();
    }
}
