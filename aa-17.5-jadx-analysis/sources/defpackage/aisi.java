package defpackage;

/* loaded from: classes3.dex */
public final class aisi {
    public final String a;
    private final afha b;

    public aisi(String str, afha afhaVar) {
        afhaVar.getClass();
        this.a = str;
        this.b = afhaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aisi)) {
            return false;
        }
        aisi aisiVar = (aisi) obj;
        return affa.f(this.a, aisiVar.a) && affa.f(this.b, aisiVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ")";
    }
}
