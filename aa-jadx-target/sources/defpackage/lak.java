package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lak {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.AgsaAudioDiagnostics");
    public rfz b;
    public final defpackage.rfo c;
    public final defpackage.rgh d;
    public final defpackage.abor e = defpackage.oun.a.n();
    public final defpackage.mku f = new defpackage.mku(new defpackage.lag(0 == true ? 1 : 0), new defpackage.lah());
    private final defpackage.yfd g = new defpackage.yfd(16);

    /* JADX WARN: Multi-variable type inference failed */
    public lak() {
        defpackage.vuj vujVar = new defpackage.vuj((byte[]) null);
        vujVar.b = new defpackage.rfx() { // from class: lai
            @Override // defpackage.rfx
            public final void a(defpackage.oup oupVar) {
                ((defpackage.yqj) defpackage.lak.a.l().ai((char) 3683)).y("Audio streaming session ended, got diagnostics: %s", qsp.B(oupVar));
                defpackage.lak lakVar = this.a;
                synchronized (lakVar) {
                    defpackage.abor aborVar = lakVar.e;
                    aborVar.t();
                    defpackage.oun ounVar = (defpackage.oun) aborVar.b;
                    defpackage.oun ounVar2 = defpackage.oun.a;
                    oupVar.getClass();
                    defpackage.abpj abpjVar = ounVar.b;
                    if (!abpjVar.c()) {
                        ounVar.b = defpackage.abox.I(abpjVar);
                    }
                    ounVar.b.add(oupVar);
                    lakVar.f.q(oupVar);
                }
            }
        };
        vujVar.a = 512;
        defpackage.ysr.bk(vujVar.b != null, "delegateListener is required");
        this.c = new defpackage.rfo(vujVar);
        defpackage.rgf rgfVar = new defpackage.rgf();
        rgfVar.a = 256;
        rgfVar.b = 64;
        rgfVar.c = new defpackage.rfy() { // from class: laj
            @Override // defpackage.rfy
            public final void a(ouy ouyVar) {
                defpackage.yqm yqmVar = defpackage.lak.a;
                defpackage.sag sagVarN = defpackage.sag.n();
                qsp.o(sagVarN, ouyVar);
                ((defpackage.yqj) yqmVar.l().ai((char) 3684)).y("Microphone recording session ended, got diagnostics: %s", sagVarN.toString());
                defpackage.lak lakVar = this.a;
                synchronized (lakVar) {
                    defpackage.abor aborVar = lakVar.e;
                    aborVar.t();
                    defpackage.oun ounVar = (defpackage.oun) aborVar.b;
                    defpackage.oun ounVar2 = defpackage.oun.a;
                    ouyVar.getClass();
                    defpackage.abpj abpjVar = ounVar.c;
                    if (!abpjVar.c()) {
                        ounVar.c = defpackage.abox.I(abpjVar);
                    }
                    ounVar.c.add(ouyVar);
                }
            }
        };
        defpackage.ysr.bk(rgfVar.c != null, "delegateListener is required");
        this.d = new defpackage.rgh(rgfVar);
    }

    public final synchronized defpackage.oun a() {
        defpackage.abor aborVar = this.e;
        if (((defpackage.oun) aborVar.b).b.size() == 0 && ((defpackage.oun) aborVar.b).c.size() == 0) {
            return null;
        }
        return (defpackage.oun) aborVar.q();
    }

    public final synchronized defpackage.ygw b() {
        return defpackage.ygw.o(this.g);
    }

    public final synchronized void c() {
        defpackage.wfp.c();
        rfz rfzVar = this.b;
        if (rfzVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3685)).u("diagnosticsManager unavailable, skipping audio diagnostics logging");
            return;
        }
        this.b = null;
        defpackage.rfo rfoVar = this.c;
        rfzVar.f(rfoVar);
        defpackage.rgh rghVar = this.d;
        rfzVar.g(rghVar);
        rfoVar.b();
        rghVar.b();
        defpackage.abor aborVar = this.e;
        defpackage.oun ounVar = (defpackage.oun) aborVar.q();
        if (aborVar.a.T()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        aborVar.b = aborVar.p();
        this.g.add(ounVar);
    }
}
