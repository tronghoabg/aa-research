package defpackage;

/* loaded from: classes2.dex */
public final class fwq implements fxo {
    public final gcq a;
    public final gcq b;
    public final boolean c;
    public final hjw d;
    public final afdr e;
    public final afdr f;
    public final afdr g;
    private final afdr h;
    private final boolean i;

    static {
        hjw hjwVar = hjw.a;
    }

    public fwq(gcq gcqVar, gcq gcqVar2, hjw hjwVar, afdr afdrVar, afdr afdrVar2, afdr afdrVar3) {
        this.a = gcqVar;
        this.b = gcqVar2;
        this.h = null;
        this.c = true;
        this.d = hjwVar;
        this.i = false;
        this.e = afdrVar;
        this.f = afdrVar2;
        this.g = afdrVar3;
    }

    @Override // defpackage.fxo
    public final gcq a() {
        return this.a;
    }

    @Override // defpackage.fxo
    public final afdr b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwq)) {
            return false;
        }
        fwq fwqVar = (fwq) obj;
        if (!affa.f(this.a, fwqVar.a) || !affa.f(this.b, fwqVar.b)) {
            return false;
        }
        afdr afdrVar = fwqVar.h;
        if (!affa.f(null, null)) {
            return false;
        }
        boolean z = fwqVar.c;
        if (!affa.f(this.d, fwqVar.d)) {
            return false;
        }
        boolean z2 = fwqVar.i;
        return affa.f(this.e, fwqVar.e) && affa.f(this.f, fwqVar.f) && affa.f(this.g, fwqVar.g);
    }

    public final int hashCode() {
        gcq gcqVar = this.a;
        int iHashCode = gcqVar == null ? 0 : gcqVar.hashCode();
        gcq gcqVar2 = this.b;
        int iHashCode2 = gcqVar2 == null ? 0 : gcqVar2.hashCode();
        int i = iHashCode * 31;
        hjw hjwVar = this.d;
        int iF = (((((((i + iHashCode2) * 961) + a.f(true)) * 31) + (hjwVar == null ? 0 : hjwVar.hashCode())) * 31) + a.f(false)) * 31;
        afdr afdrVar = this.e;
        int iHashCode3 = (iF + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31;
        afdr afdrVar2 = this.f;
        int iHashCode4 = (iHashCode3 + (afdrVar2 == null ? 0 : afdrVar2.hashCode())) * 31;
        afdr afdrVar3 = this.g;
        return iHashCode4 + (afdrVar3 != null ? afdrVar3.hashCode() : 0);
    }

    public final String toString() {
        return "ApphostKeypadButtonUiModel(label=" + this.a + ", secondaryLabel=" + this.b + ", onClick=null, enabled=true, backgroundColor=" + this.d + ", isPrimary=false, onKeyDown=" + this.e + ", onKeyUp=" + this.f + ", onKeyLongPress=" + this.g + ")";
    }

    public fwq() {
        this(null, null, null, null, null, null);
    }
}
