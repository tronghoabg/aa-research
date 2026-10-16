package defpackage;

/* loaded from: classes.dex */
public final class bic extends cxt<bid> {
    private final djy a;
    private final djv b;
    private final bed c;
    private final boolean f;
    private final djn h;
    private final blr i;
    private final dje j;
    private final cil k;
    private final boolean d = false;
    private final boolean g = false;

    public bic(djy djyVar, djv djvVar, bed bedVar, boolean z, djn djnVar, blr blrVar, dje djeVar, cil cilVar) {
        this.a = djyVar;
        this.b = djvVar;
        this.c = bedVar;
        this.f = z;
        this.h = djnVar;
        this.i = blrVar;
        this.j = djeVar;
        this.k = cilVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bid(this.a, this.b, this.c, this.f, this.h, this.i, this.j, this.k);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        bid bidVar = (bid) cfxVar;
        boolean z = bidVar.d;
        dje djeVar = bidVar.g;
        blr blrVar = bidVar.f;
        bidVar.a = this.a;
        djv djvVar = this.b;
        bidVar.b = djvVar;
        bidVar.c = this.c;
        boolean z2 = this.f;
        bidVar.d = z2;
        bidVar.e = this.h;
        blr blrVar2 = this.i;
        bidVar.f = blrVar2;
        dje djeVar2 = this.j;
        bidVar.g = djeVar2;
        bidVar.h = this.k;
        if (z2 != z || !affa.f(djeVar2, djeVar) || !dfv.i(djvVar.b)) {
            bzi.q(bidVar).J();
        }
        if (affa.f(blrVar2, blrVar)) {
            return;
        }
        blrVar2.f = new beg(bidVar, 14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bic)) {
            return false;
        }
        bic bicVar = (bic) obj;
        if (!affa.f(this.a, bicVar.a) || !affa.f(this.b, bicVar.b) || !affa.f(this.c, bicVar.c)) {
            return false;
        }
        boolean z = bicVar.d;
        if (this.f != bicVar.f) {
            return false;
        }
        boolean z2 = bicVar.g;
        return affa.f(this.h, bicVar.h) && affa.f(this.i, bicVar.i) && affa.f(this.j, bicVar.j) && affa.f(this.k, bicVar.k);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        djn djnVar = this.h;
        return (((((((((((((iHashCode * 31) + a.f(false)) * 31) + a.f(this.f)) * 31) + a.f(false)) * 31) + djnVar.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=false, enabled=" + this.f + ", isPassword=false, offsetMapping=" + this.h + ", manager=" + this.i + ", imeOptions=" + this.j + ", focusRequester=" + this.k + ")";
    }
}
