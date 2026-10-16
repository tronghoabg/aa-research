package defpackage;

/* loaded from: classes2.dex */
public final class dbd {
    public static final dbd a = new dbd(0, 0);
    public final long b;
    private final long c;

    public dbd(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbd)) {
            return false;
        }
        dbd dbdVar = (dbd) obj;
        return a.j(this.b, dbdVar.b) && a.j(this.c, dbdVar.c);
    }

    public final int hashCode() {
        return (a.g(this.b) * 31) + a.g(this.c);
    }
}
