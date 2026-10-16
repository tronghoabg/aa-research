package defpackage;

/* loaded from: classes.dex */
public final class bij extends cxt<bik> {
    private final bim a;
    private final bed b;
    private final blr c;

    public bij(bim bimVar, bed bedVar, blr blrVar) {
        this.a = bimVar;
        this.b = bedVar;
        this.c = blrVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bik(this.a, this.b, this.c);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        bik bikVar = (bik) cfxVar;
        if (bikVar.A) {
            bikVar.a.f();
            bikVar.a.l(bikVar);
        }
        bikVar.a = this.a;
        if (bikVar.A) {
            bikVar.a.k(bikVar);
        }
        bikVar.b = this.b;
        bikVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bij)) {
            return false;
        }
        bij bijVar = (bij) obj;
        return affa.f(this.a, bijVar.a) && affa.f(this.b, bijVar.b) && affa.f(this.c, bijVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ")";
    }
}
