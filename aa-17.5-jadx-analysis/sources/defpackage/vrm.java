package defpackage;

/* loaded from: classes3.dex */
public final class vrm {
    public final ajeu a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final String f;
    public final ajey g;
    public final Integer h;
    public final int i;

    public vrm(ajeu ajeuVar, Long l, Long l2, Long l3, Long l4, int i, String str, ajey ajeyVar, Integer num) {
        this.a = ajeuVar;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.i = i;
        this.f = str;
        this.g = ajeyVar;
        this.h = num;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.f);
    }
}
