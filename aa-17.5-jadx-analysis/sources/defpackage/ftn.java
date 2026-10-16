package defpackage;

/* loaded from: classes2.dex */
public final class ftn {
    public static final ftn a;
    public final a b;
    public final a c;

    static {
        ftj ftjVar = ftj.a;
        a = new ftn(ftjVar, ftjVar);
    }

    public ftn(a aVar, a aVar2) {
        this.b = aVar;
        this.c = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftn)) {
            return false;
        }
        ftn ftnVar = (ftn) obj;
        return affa.f(this.b, ftnVar.b) && affa.f(this.c, ftnVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Size(width=" + this.b + ", height=" + this.c + ")";
    }
}
