package defpackage;

/* loaded from: classes2.dex */
public final class fwy implements fxo {
    public static final int a;
    public final gcq b;
    public final gbg c;
    public final afdr d;
    public final boolean e;
    public final hjw f;
    public final boolean g;
    public final hjw h;

    static {
        hjw hjwVar = hjw.a;
        a = 8;
    }

    public fwy(gcq gcqVar, gbg gbgVar, afdr afdrVar, boolean z, hjw hjwVar, boolean z2, hjw hjwVar2) {
        this.b = gcqVar;
        this.c = gbgVar;
        this.d = afdrVar;
        this.e = z;
        this.f = hjwVar;
        this.g = z2;
        this.h = hjwVar2;
    }

    public static /* synthetic */ fwy c(fwy fwyVar, afdr afdrVar, hjw hjwVar, boolean z, hjw hjwVar2, int i) {
        gcq gcqVar = (i & 1) != 0 ? fwyVar.b : null;
        gbg gbgVar = (i & 2) != 0 ? fwyVar.c : null;
        if ((i & 4) != 0) {
            afdrVar = fwyVar.d;
        }
        afdr afdrVar2 = afdrVar;
        boolean z2 = (i & 8) != 0 ? fwyVar.e : false;
        if ((i & 16) != 0) {
            hjwVar = fwyVar.f;
        }
        hjw hjwVar3 = hjwVar;
        if ((i & 32) != 0) {
            z = fwyVar.g;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            hjwVar2 = fwyVar.h;
        }
        return new fwy(gcqVar, gbgVar, afdrVar2, z2, hjwVar3, z3, hjwVar2);
    }

    @Override // defpackage.fxo
    public final gcq a() {
        return this.b;
    }

    @Override // defpackage.fxo
    public final afdr b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwy)) {
            return false;
        }
        fwy fwyVar = (fwy) obj;
        return affa.f(this.b, fwyVar.b) && affa.f(this.c, fwyVar.c) && affa.f(this.d, fwyVar.d) && this.e == fwyVar.e && affa.f(this.f, fwyVar.f) && this.g == fwyVar.g && affa.f(this.h, fwyVar.h);
    }

    public final int hashCode() {
        gcq gcqVar = this.b;
        int iHashCode = gcqVar == null ? 0 : gcqVar.hashCode();
        gbg gbgVar = this.c;
        int iHashCode2 = gbgVar == null ? 0 : gbgVar.hashCode();
        int i = iHashCode * 31;
        afdr afdrVar = this.d;
        int iHashCode3 = (((((i + iHashCode2) * 31) + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31) + a.f(this.e)) * 31;
        hjw hjwVar = this.f;
        int iHashCode4 = (((iHashCode3 + (hjwVar == null ? 0 : hjwVar.hashCode())) * 31) + a.f(this.g)) * 31;
        hjw hjwVar2 = this.h;
        return iHashCode4 + (hjwVar2 != null ? hjwVar2.hashCode() : 0);
    }

    public final String toString() {
        return "CarActionButtonUiModel(label=" + this.b + ", icon=" + this.c + ", onClick=" + this.d + ", enabled=" + this.e + ", backgroundColor=" + this.f + ", isPrimary=" + this.g + ", customContentColor=" + this.h + ")";
    }

    public fwy() {
        this(null, null, null, true, null, false, null);
    }
}
