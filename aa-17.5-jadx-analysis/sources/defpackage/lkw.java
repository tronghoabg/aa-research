package defpackage;

/* loaded from: classes2.dex */
public final class lkw {
    public final lmc a;
    public final boolean b;

    public lkw(lmc lmcVar, boolean z) {
        this.a = lmcVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkw)) {
            return false;
        }
        lkw lkwVar = (lkw) obj;
        return affa.f(this.a, lkwVar.a) && this.b == lkwVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.f(this.b);
    }

    public final String toString() {
        return "Key(description=" + this.a + ", playable=" + this.b + ")";
    }
}
