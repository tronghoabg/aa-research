package defpackage;

/* loaded from: classes.dex */
public final class dhq extends dhe {
    public final String c;
    public final die d;
    public final int e;

    public dhq(String str, die dieVar, int i, dic dicVar) {
        super(1, dir.b, dicVar);
        this.c = str;
        this.d = dieVar;
        this.e = i;
    }

    @Override // defpackage.dhr
    public final int b() {
        return this.e;
    }

    @Override // defpackage.dhr
    public final die c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhq)) {
            return false;
        }
        dhq dhqVar = (dhq) obj;
        return affa.f(this.c, dhqVar.c) && affa.f(this.d, dhqVar.d) && this.e == dhqVar.e && affa.f(this.b, dhqVar.b);
    }

    public final int hashCode() {
        return (((((this.c.hashCode() * 31) + this.d.o) * 31) + this.e) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Font(familyName=\"" + ("DeviceFontFamilyName(name=" + this.c + ")") + "\", weight=" + this.d + ", style=" + dhx.a(this.e) + ")";
    }
}
