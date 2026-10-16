package defpackage;

/* loaded from: classes2.dex */
public final class cqo extends cxt<cqp> {
    private final cqr a;
    private final boolean b = false;

    public cqo(cqr cqrVar) {
        this.a = cqrVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new cqp(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((cqp) cfxVar).f(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqo)) {
            return false;
        }
        cqo cqoVar = (cqo) obj;
        if (!affa.f(this.a, cqoVar.a)) {
            return false;
        }
        boolean z = cqoVar.b;
        return true;
    }

    public final int hashCode() {
        return (((cqb) this.a).a * 31) + 1237;
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
