package defpackage;

/* loaded from: classes3.dex */
public final class ucr {
    public final uim a;
    public final toq b;

    public ucr(uim uimVar, toq toqVar) {
        this.a = uimVar;
        this.b = toqVar;
    }

    public final boolean a() {
        return this.b != null;
    }

    public final boolean b() {
        return this.a != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ucr) {
            ucr ucrVar = (ucr) obj;
            uim uimVar = this.a;
            if (uimVar != null ? uimVar.equals(ucrVar.a) : ucrVar.a == null) {
                toq toqVar = this.b;
                if (toqVar != null ? toqVar.equals(ucrVar.b) : ucrVar.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        uim uimVar = this.a;
        int iHashCode = uimVar == null ? 0 : uimVar.hashCode();
        toq toqVar = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (toqVar != null ? toqVar.hashCode() : 0);
    }

    public final String toString() {
        toq toqVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(toqVar) + "}";
    }

    public ucr() {
        throw null;
    }
}
