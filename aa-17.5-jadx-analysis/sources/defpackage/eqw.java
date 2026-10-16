package defpackage;

/* loaded from: classes.dex */
final class eqw implements epy {
    final /* synthetic */ epr a;
    final /* synthetic */ affv b;
    final /* synthetic */ aitx c;
    final /* synthetic */ epr d;
    final /* synthetic */ aitf e;
    final /* synthetic */ afeg f;
    final /* synthetic */ ajdz g;

    public eqw(epr eprVar, affv affvVar, aitx aitxVar, epr eprVar2, aitf aitfVar, ajdz ajdzVar, afeg afegVar) {
        this.a = eprVar;
        this.b = affvVar;
        this.c = aitxVar;
        this.d = eprVar2;
        this.e = aitfVar;
        this.g = ajdzVar;
        this.f = afegVar;
    }

    @Override // defpackage.epy
    public final void a(eqa eqaVar, epr eprVar) {
        if (eprVar == this.a) {
            this.b.a = ahnc.d(this.c, null, 0, new eqv(this.g, this.f, null), 3);
            return;
        }
        if (eprVar == this.d) {
            affv affvVar = this.b;
            aivh aivhVar = (aivh) affvVar.a;
            if (aivhVar != null) {
                aivhVar.s(null);
            }
            affvVar.a = null;
        }
        if (eprVar == epr.ON_DESTROY) {
            this.e.w(afak.a);
        }
    }
}
