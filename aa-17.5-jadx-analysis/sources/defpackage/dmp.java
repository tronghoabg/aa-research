package defpackage;

/* loaded from: classes2.dex */
public final class dmp extends cwe implements cyg, cwc {
    public azp a;
    private final ciu b;

    public dmp() {
        ciu ciuVar = new ciu(0, true, new ezb((Object) this, 1, (byte[]) null), 9);
        W(ciuVar);
        this.b = ciuVar;
    }

    public final azp b() {
        affv affvVar = new affv();
        cjn.p(this, new bsh(affvVar, this, 11));
        return (azp) affvVar.a;
    }

    @Override // defpackage.cyg
    public final void r() {
        ciu ciuVar = this.b;
        azp azpVarB = b();
        if (ciuVar.g().b()) {
            azp azpVar = this.a;
            if (azpVar != null) {
                azpVar.a();
            }
            if (azpVarB != null) {
                azpVarB.d();
            } else {
                azpVarB = null;
            }
            this.a = azpVarB;
        }
    }
}
