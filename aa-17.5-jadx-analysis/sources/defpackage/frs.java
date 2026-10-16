package defpackage;

/* loaded from: classes2.dex */
public final class frs extends a {
    public final fqv a;
    public final String b;
    public final int c;

    public frs(fqv fqvVar, String str, int i) {
        super(null);
        this.a = fqvVar;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frs)) {
            return false;
        }
        frs frsVar = (frs) obj;
        return affa.f(this.a, frsVar.a) && affa.f(this.b, frsVar.b) && this.c == frsVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.c;
    }
}
