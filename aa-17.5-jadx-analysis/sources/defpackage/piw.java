package defpackage;

/* loaded from: classes2.dex */
public final class piw {
    public final int a;
    private final trv b;
    private final toi c;

    public piw(trv trvVar, int i, toi toiVar) {
        this.b = trvVar;
        this.a = i;
        this.c = toiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof piw) {
            piw piwVar = (piw) obj;
            if (this.b.equals(piwVar.b) && this.a == piwVar.a && this.c.equals(piwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iIdentityHashCode = System.identityHashCode(this.b) ^ 1000003;
        toi toiVar = this.c;
        return (((this.a ^ (iIdentityHashCode * 1000003)) * 1000003) ^ toiVar.hashCode()) * 1000003;
    }

    public final String toString() {
        toi toiVar = this.c;
        return "{" + this.b.toString() + ", " + tss.d(this.a) + ", " + toiVar.toString() + ", null}";
    }

    public piw() {
        throw null;
    }
}
