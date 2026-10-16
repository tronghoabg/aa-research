package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aqj extends defpackage.amf implements defpackage.cpz {
    public final defpackage.aqp i;
    public final defpackage.cjc j;
    private final defpackage.aqf k;
    private final defpackage.anj l;
    private final defpackage.anm m;

    public aqj(defpackage.aqk aqkVar, defpackage.aiz aizVar, defpackage.aor aorVar, defpackage.apn apnVar, boolean z, boolean z2, defpackage.ask askVar, defpackage.and andVar) {
        super(z, askVar, apnVar);
        defpackage.anm anmVar = new defpackage.anm(new defpackage.kwv(new defpackage.adr(defpackage.amh.c), (char[]) null));
        this.m = anmVar;
        defpackage.aqp aqpVar = new defpackage.aqp(aqkVar, aizVar, aorVar == null ? anmVar : aorVar, apnVar, z2, ((defpackage.amf) this).c, this, new defpackage.aln(this, 9));
        this.i = aqpVar;
        defpackage.aqf aqfVar = new defpackage.aqf(aqpVar, z);
        this.k = aqfVar;
        defpackage.cjc cjcVar = new defpackage.cjc(2, false, null, 10);
        W(cjcVar);
        this.j = cjcVar;
        defpackage.anj anjVar = new defpackage.anj(apnVar, aqpVar, z2, andVar, new defpackage.aln(this, 10));
        W(anjVar);
        this.l = anjVar;
        defpackage.tu tuVar = ((defpackage.amf) this).c;
        defpackage.afer aferVar = defpackage.cqj.a;
        W(new defpackage.cqi(aqfVar, tuVar));
        W(new defpackage.bcj(anjVar));
    }

    @Override // defpackage.cpz
    public final boolean A(android.view.KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.f || ((defpackage.tn.i(keyEvent) != defpackage.tn.e(93) && defpackage.tn.i(keyEvent) != defpackage.tn.e(92)) || defpackage.tn.h(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean zK = this.i.k();
        defpackage.anj anjVar = this.l;
        if (zK) {
            float fD = (int) (anjVar.d() & 4294967295L);
            if (defpackage.tn.i(keyEvent) != defpackage.tn.e(92)) {
                fD = -fD;
            }
            jFloatToRawIntBits = ((long) java.lang.Float.floatToRawIntBits(fD)) & 4294967295L;
        } else {
            float fD2 = (int) (anjVar.d() >> 32);
            if (defpackage.tn.i(keyEvent) != defpackage.tn.e(92)) {
                fD2 = -fD2;
            }
            jFloatToRawIntBits = ((long) java.lang.Float.floatToRawIntBits(fD2)) << 32;
        }
        ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.aqi(this, jFloatToRawIntBits, (defpackage.afdk) null, 1, (byte[]) null), 3);
        return true;
    }

    @Override // defpackage.cpz
    public final boolean B(android.view.KeyEvent keyEvent) {
        return false;
    }

    public final void L(defpackage.aqk aqkVar, defpackage.apn apnVar, defpackage.aiz aizVar, boolean z, boolean z2, defpackage.aor aorVar, defpackage.ask askVar, defpackage.and andVar) {
        boolean z3;
        if (this.f != z) {
            this.k.a = z;
            ((defpackage.amf) this).a = null;
            ((defpackage.amf) this).b = null;
            defpackage.cjv.r(this).J();
        }
        defpackage.aor aorVar2 = aorVar == null ? this.m : aorVar;
        defpackage.aqp aqpVar = this.i;
        defpackage.tu tuVar = ((defpackage.amf) this).c;
        boolean z4 = true;
        if (defpackage.afga.f(aqpVar.a, aqkVar)) {
            z3 = false;
        } else {
            aqpVar.a = aqkVar;
            z3 = true;
        }
        aqpVar.j = aizVar;
        if (aqpVar.c != apnVar) {
            aqpVar.c = apnVar;
            z3 = true;
        }
        if (aqpVar.d != z2) {
            aqpVar.d = z2;
        } else {
            z4 = z3;
        }
        aqpVar.b = aorVar2;
        aqpVar.k = tuVar;
        defpackage.anj anjVar = this.l;
        anjVar.a = apnVar;
        anjVar.c = z2;
        anjVar.d = andVar;
        G(defpackage.amh.a, z, askVar, aqpVar.k() ? defpackage.apn.a : defpackage.apn.b, z4);
    }

    @Override // defpackage.aoj
    public final java.lang.Object dm(defpackage.affg affgVar, defpackage.afdk afdkVar) {
        defpackage.aqp aqpVar = this.i;
        java.lang.Object objI = aqpVar.i(defpackage.akv.b, new defpackage.amx(affgVar, aqpVar, (defpackage.afdk) null, 3), afdkVar);
        return objI == defpackage.afdr.a ? objI : defpackage.afbk.a;
    }

    @Override // defpackage.aoj
    public final void dn(defpackage.anw anwVar) {
        if (this.A) {
            ahoc.d(((defpackage.amf) this).c.f(), (defpackage.afdo) null, 0, new defpackage.ais(anwVar, this, (defpackage.afdk) null, 11), 3);
        }
    }

    @Override // defpackage.amf
    protected final defpackage.apj f() {
        defpackage.kwv kwvVar = new defpackage.kwv(android.view.ViewConfiguration.get(defpackage.ua.g(this).getContext()), (char[]) null);
        defpackage.aqg aqgVar = new defpackage.aqg(this, 1, (byte[]) null);
        defpackage.dlo dloVar = defpackage.cjv.r(this).r;
        defpackage.aqp aqpVar = this.i;
        return new defpackage.aph(new defpackage.apm(new defpackage.aln(aqpVar, 8)), aqpVar, kwvVar, aqgVar, dloVar, new defpackage.act(aqpVar, 15));
    }

    @Override // defpackage.amf
    protected final defpackage.apj h() {
        defpackage.aqg aqgVar = new defpackage.aqg(this, 0);
        defpackage.dlo dloVar = defpackage.cjv.r(this).r;
        defpackage.aqp aqpVar = this.i;
        return new defpackage.ari(new defpackage.apm(new defpackage.aln(aqpVar, 12)), aqpVar, aqgVar, dloVar, new defpackage.act(aqpVar, 18));
    }

    @Override // defpackage.amf
    protected final java.lang.Object i(long j, defpackage.afdk afdkVar) {
        return defpackage.aqd.a(this.i, j, afdkVar);
    }

    @Override // defpackage.amf
    public final /* synthetic */ defpackage.aqp l() {
        return this.i;
    }

    @Override // defpackage.amf
    protected final defpackage.anm m() {
        return this.m;
    }
}
