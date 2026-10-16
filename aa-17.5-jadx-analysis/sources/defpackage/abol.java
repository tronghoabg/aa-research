package defpackage;

/* loaded from: classes.dex */
final class abol {
    public volatile abms a;
    protected volatile abow b;
    private final abow c;
    private final abnj d;
    private volatile boolean e;

    public abol(abow abowVar) {
        if (abowVar == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        this.b = abowVar;
        this.c = abowVar.s();
        this.d = abnj.a;
        this.a = null;
        this.e = false;
    }

    final int a() {
        int iD = this.a != null ? this.a.d() : this.b.m();
        return ((352 - (Integer.numberOfLeadingZeros(iD) * 9)) >>> 6) + iD;
    }

    final abow b() {
        try {
            return this.b;
        } catch (abon unused) {
            int i = abnj.b;
            return this.c;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abol)) {
            return b().equals(obj);
        }
        abol abolVar = (abol) obj;
        if (this.a == null || abolVar.a == null || this.d != abolVar.d || !this.a.equals(abolVar.a)) {
            return b().equals(abolVar.b());
        }
        return true;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return b().toString();
    }
}
