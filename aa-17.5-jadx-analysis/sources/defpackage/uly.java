package defpackage;

/* loaded from: classes3.dex */
public final class uly {
    public final uxb a;
    public final ujk b;
    public final boolean c;
    public final ulx d;
    public final int e;

    public uly(int i, uxb uxbVar, ujk ujkVar, boolean z, ulx ulxVar) {
        this.e = i;
        uxbVar.getClass();
        this.a = uxbVar;
        this.b = ujkVar;
        this.c = z;
        this.d = ulxVar;
    }

    public final uly a() {
        return this.d != null ? new uly(this.e, this.a, this.b, this.c, null) : this;
    }

    public final uly b(boolean z) {
        ulx ulxVar = this.d;
        return ulxVar != null ? ulxVar.a(z) : new uly(this.e, this.a, this.b, z, null);
    }

    public final boolean c(uly ulyVar) {
        return this.b.equals(ulyVar.b) && this.e == ulyVar.e && this.a.equals(ulyVar.a) && this.d == ulyVar.d;
    }

    public final boolean equals(Object obj) {
        ulx ulxVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uly) {
            uly ulyVar = (uly) obj;
            if (this.e == ulyVar.e && this.a.equals(ulyVar.a) && this.b.equals(ulyVar.b) && this.c == ulyVar.c && ((ulxVar = this.d) != null ? ulxVar.equals(ulyVar.d) : ulyVar.d == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.e ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
        ulx ulxVar = this.d;
        return (((true != this.c ? 1237 : 1231) ^ (iHashCode * 1000003)) * 1000003) ^ (ulxVar == null ? 0 : ulxVar.hashCode());
    }

    public final String toString() {
        ulx ulxVar = this.d;
        return ulxVar != null ? ulxVar.name() : "CUSTOM_DRAW_MODE";
    }

    public uly() {
        throw null;
    }
}
