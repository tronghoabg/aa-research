package defpackage;

/* loaded from: classes2.dex */
public final class gvy implements hju {
    public final gfg a;
    public final gfg b;
    public final gfk c;
    public final fwi d;

    public gvy(gfg gfgVar, gfg gfgVar2, gfk gfkVar, fwi fwiVar) {
        this.a = gfgVar;
        this.b = gfgVar2;
        this.c = gfkVar;
        this.d = fwiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvy)) {
            return false;
        }
        gvy gvyVar = (gvy) obj;
        return affa.f(this.a, gvyVar.a) && affa.f(this.b, gvyVar.b) && affa.f(this.c, gvyVar.c) && affa.f(this.d, gvyVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "PaymentItemUiModel(title=" + this.a + ", subtitle=" + this.b + ", image=" + this.c + ", action=" + this.d + ")";
    }
}
