package defpackage;

/* loaded from: classes2.dex */
public final class gdc extends fwi {
    public final String a;
    public final afdr b;
    public final afdr c;
    public final afdr d;
    public final gfa e;
    private final boolean f;
    private final gfa g;

    public gdc(String str, afdr afdrVar, afdr afdrVar2, afdr afdrVar3, gfa gfaVar) {
        str.getClass();
        afdrVar.getClass();
        afdrVar2.getClass();
        afdrVar3.getClass();
        this.a = str;
        this.b = afdrVar;
        this.c = afdrVar2;
        this.d = afdrVar3;
        this.e = gfaVar;
        this.f = true;
        this.g = gey.b(str);
    }

    @Override // defpackage.fwi
    public final fwe a() {
        return null;
    }

    @Override // defpackage.fwi
    public final gfa b() {
        return this.g;
    }

    @Override // defpackage.fwi
    public final afdr c() {
        return null;
    }

    @Override // defpackage.fwi
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdc)) {
            return false;
        }
        gdc gdcVar = (gdc) obj;
        if (!affa.f(this.a, gdcVar.a) || !affa.f(this.b, gdcVar.b) || !affa.f(this.c, gdcVar.c) || !affa.f(this.d, gdcVar.d) || !affa.f(this.e, gdcVar.e)) {
            return false;
        }
        boolean z = gdcVar.f;
        return true;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        gfa gfaVar = this.e;
        return (((iHashCode * 31) + (gfaVar == null ? 0 : gfaVar.hashCode())) * 31) + 1231;
    }

    public final String toString() {
        return "KeypadButtonUiModel(primaryText=" + this.a + ", onKeyDown=" + this.b + ", onKeyUp=" + this.c + ", onKeyLongPress=" + this.d + ", secondaryText=" + this.e + ", enabled=true)";
    }
}
