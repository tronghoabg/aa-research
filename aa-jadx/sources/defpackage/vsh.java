package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vsh {
    public final defpackage.ajft a;
    public final java.lang.Long b;
    public final java.lang.Long c;
    public final java.lang.Long d;
    public final java.lang.Long e;
    public final java.lang.String f;
    public final defpackage.ajfx g;
    public final java.lang.Integer h;
    public final int i;

    public vsh(defpackage.ajft ajftVar, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, int i, java.lang.String str, defpackage.ajfx ajfxVar, java.lang.Integer num) {
        this.a = ajftVar;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.i = i;
        this.f = str;
        this.g = ajfxVar;
        this.h = num;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.f);
    }
}
