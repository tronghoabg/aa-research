package defpackage;

/* loaded from: classes2.dex */
public final class gpa extends hjt {
    public final hju a;
    public final goz b;
    public final hga c;
    public final boolean d;
    public final gbg e;
    public final afdr f;
    public final gva g;
    public final hgc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpa(hju hjuVar, goz gozVar, hga hgaVar, boolean z, gbg gbgVar, afdr afdrVar, gva gvaVar, hgc hgcVar) {
        super(true, false);
        hjuVar.getClass();
        hgcVar.getClass();
        this.a = hjuVar;
        this.b = gozVar;
        this.c = hgaVar;
        this.d = z;
        this.e = gbgVar;
        this.f = afdrVar;
        this.g = gvaVar;
        this.h = hgcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpa)) {
            return false;
        }
        gpa gpaVar = (gpa) obj;
        return affa.f(this.a, gpaVar.a) && affa.f(this.b, gpaVar.b) && affa.f(this.c, gpaVar.c) && this.d == gpaVar.d && affa.f(this.e, gpaVar.e) && affa.f(this.f, gpaVar.f) && affa.f(this.g, gpaVar.g) && this.h == gpaVar.h;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.f(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        gva gvaVar = this.g;
        return (((iHashCode * 31) + (gvaVar == null ? 0 : gvaVar.hashCode())) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "MapWithContentTemplateUiModel(content=" + this.a + ", mapActions=" + this.b + ", surfaceCallbacks=" + this.c + ", isMinimized=" + this.d + ", minimizedScreenIcon=" + this.e + ", buttonOnClick=" + this.f + ", turncard=" + this.g + ", panModeState=" + this.h + ")";
    }
}
