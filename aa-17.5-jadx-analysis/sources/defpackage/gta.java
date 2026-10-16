package defpackage;

/* loaded from: classes2.dex */
public final class gta implements gmo {
    public final gtf a;
    public final gtl b;
    public final afdr c;

    public gta(gtf gtfVar, gtl gtlVar, afdr afdrVar) {
        this.a = gtfVar;
        this.b = gtlVar;
        this.c = afdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gta)) {
            return false;
        }
        gta gtaVar = (gta) obj;
        return affa.f(this.a, gtaVar.a) && affa.f(this.b, gtaVar.b) && affa.f(this.c, gtaVar.c);
    }

    public final int hashCode() {
        gtf gtfVar = this.a;
        int iHashCode = gtfVar == null ? 0 : gtfVar.hashCode();
        gtl gtlVar = this.b;
        int iHashCode2 = gtlVar == null ? 0 : gtlVar.hashCode();
        int i = iHashCode * 31;
        afdr afdrVar = this.c;
        return ((i + iHashCode2) * 31) + (afdrVar != null ? afdrVar.hashCode() : 0);
    }

    public final String toString() {
        return "RouteInternal(routeDestination=" + this.a + ", turnCard=" + this.b + ", cancel=" + this.c + ")";
    }

    public gta() {
        this(null, null, null);
    }
}
