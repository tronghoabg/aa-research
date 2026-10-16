package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ado extends defpackage.adc {
    public defpackage.aej a;
    public defpackage.cfu b;
    public defpackage.affg c;
    private boolean f;
    private long d = -9223372034707292160L;
    private long e = defpackage.dln.d(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    private final defpackage.bwx g = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);

    public ado(defpackage.aej aejVar, defpackage.cfu cfuVar, defpackage.affg affgVar) {
        this.a = aejVar;
        this.b = cfuVar;
        this.c = affgVar;
    }

    public final void a(defpackage.adm admVar) {
        this.g.b(admVar);
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(final defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        defpackage.cux cuxVarV;
        defpackage.ado adoVar;
        defpackage.adm admVar;
        long jE;
        defpackage.adm admVar2;
        if (cubVar.dU()) {
            this.e = j;
            this.f = true;
            cuxVarV = ctxVar.v(j);
        } else {
            cuxVarV = ctxVar.v(this.f ? this.e : j);
        }
        final defpackage.cux cuxVar = cuxVarV;
        char c = ' ';
        long j2 = 4294967295L;
        final long j3 = (((long) cuxVar.b) & 4294967295L) | (((long) cuxVar.a) << 32);
        if (cubVar.dU()) {
            this.d = j3;
            adoVar = this;
            jE = j3;
            c = ' ';
            j2 = 4294967295L;
        } else {
            long j4 = this.d;
            if (j4 == -9223372034707292160L) {
                j4 = j3;
            }
            defpackage.adm admVar3 = (defpackage.adm) this.g.a();
            if (admVar3 != null) {
                defpackage.aeb aebVar = admVar3.a;
                boolean z = (j4 == ((defpackage.dly) aebVar.d()).a || aebVar.j()) ? false : true;
                if (j4 != ((defpackage.dly) aebVar.c()).a || z) {
                    admVar3.b = ((defpackage.dly) aebVar.d()).a;
                    admVar2 = admVar3;
                    adoVar = this;
                    ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.adn(admVar2, j4, adoVar, null), 3);
                } else {
                    adoVar = this;
                    admVar2 = admVar3;
                }
                admVar = admVar2;
            } else {
                long j5 = j4;
                adoVar = this;
                admVar = new defpackage.adm(new defpackage.aeb(new defpackage.dly(j5), defpackage.agt.h, new defpackage.dly(4294967297L), "Animatable"), j5);
            }
            adoVar.a(admVar);
            jE = defpackage.dln.e(j, ((defpackage.dly) admVar.a.d()).a);
        }
        final int i = (int) (jE >> c);
        final int i2 = (int) (jE & j2);
        final defpackage.ado adoVar2 = adoVar;
        return cubVar.dS(i, i2, defpackage.afcf.a, new defpackage.affc() { // from class: adl
            @Override // defpackage.affc
            public final java.lang.Object invoke(java.lang.Object obj) {
                ((defpackage.cuw) obj).s(cuxVar, this.a.b.a(j3, (((long) i) << 32) | (((long) i2) & 4294967295L), cubVar.p()), 0.0f);
                return defpackage.afbk.a;
            }
        });
    }

    @Override // defpackage.cge
    public final void du() {
        a(null);
    }

    @Override // defpackage.cge
    public final void dz() {
        this.d = -9223372034707292160L;
        this.f = false;
    }
}
