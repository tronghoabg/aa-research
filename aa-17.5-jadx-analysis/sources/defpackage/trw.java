package defpackage;

/* loaded from: classes3.dex */
public final class trw {
    public final yfq a;
    public final toi b;
    public final int c;

    public trw(yfq yfqVar, int i, toi toiVar) {
        yfqVar.getClass();
        this.a = yfqVar;
        this.c = i;
        this.b = toiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof trw) {
            trw trwVar = (trw) obj;
            if (yrm.W(this.a, trwVar.a) && this.c == trwVar.c && this.b.equals(trwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        toi toiVar = this.b;
        return ((this.c ^ (iHashCode * 1000003)) * 1000003) ^ toiVar.hashCode();
    }

    public final String toString() {
        toi toiVar = this.b;
        return "{" + this.a.toString() + ", " + tss.d(this.c) + ", " + toiVar.toString() + "}";
    }

    public trw() {
        throw null;
    }
}
