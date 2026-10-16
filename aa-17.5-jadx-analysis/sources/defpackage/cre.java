package defpackage;

/* loaded from: classes2.dex */
public final class cre extends cxt<crf> {
    private final cqr a;
    private final boolean b = false;
    private final cwj c;

    public cre(cqr cqrVar, cwj cwjVar) {
        this.a = cqrVar;
        this.c = cwjVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new crf(this.a, this.c);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        crf crfVar = (crf) cfxVar;
        crfVar.f(this.a);
        crfVar.a = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cre)) {
            return false;
        }
        cre creVar = (cre) obj;
        if (!affa.f(this.a, creVar.a)) {
            return false;
        }
        boolean z = creVar.b;
        return affa.f(this.c, creVar.c);
    }

    public final int hashCode() {
        cqr cqrVar = this.a;
        return (((((cqb) cqrVar).a * 31) + 1237) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false, touchBoundsExpansion=" + this.c + ")";
    }
}
