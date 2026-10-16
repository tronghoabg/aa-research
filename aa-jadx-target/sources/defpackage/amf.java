package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class amf extends defpackage.aoj implements defpackage.czc {
    public defpackage.affg a;
    public defpackage.affg b;
    public final defpackage.tu c;
    private defpackage.apj i;
    private defpackage.apj j;

    public amf(boolean z, defpackage.ask askVar, defpackage.apn apnVar) {
        super(defpackage.amh.a, z, askVar, apnVar);
        this.c = new defpackage.tu();
    }

    private final void A() {
        if (this.A) {
            defpackage.dlo dloVar = defpackage.cjv.r(this).r;
            m().b = new defpackage.kwv(new defpackage.adr(dloVar), (char[]) null);
        }
    }

    @Override // defpackage.cge
    public final void dz() {
        defpackage.apj apjVar = this.i;
        if (apjVar != null) {
            apjVar.d = defpackage.cjv.r(this).r;
        }
        defpackage.apj apjVar2 = this.j;
        if (apjVar2 != null) {
            apjVar2.d = defpackage.cjv.r(this).r;
        }
        A();
    }

    protected abstract defpackage.apj f();

    @Override // defpackage.czc
    public final void g(defpackage.dek dekVar) {
        if (this.f && (this.a == null || this.b == null)) {
            this.a = new defpackage.amc(this, 0);
            this.b = new defpackage.ame(this, null);
        }
        defpackage.affg affgVar = this.a;
        if (affgVar != null) {
            dekVar.a(defpackage.ddy.d, new defpackage.ddn(null, affgVar));
        }
        defpackage.affg affgVar2 = this.b;
        if (affgVar2 != null) {
            dekVar.a(defpackage.ddy.e, affgVar2);
        }
    }

    protected abstract defpackage.apj h();

    protected abstract java.lang.Object i(long j, defpackage.afdk afdkVar);

    @Override // defpackage.aoj
    public final boolean k() {
        defpackage.aqp aqpVarL = l();
        if (aqpVarL.a.i()) {
            return true;
        }
        defpackage.aiz aizVar = aqpVarL.j;
        return aizVar != null && aizVar.j();
    }

    protected abstract defpackage.aqp l();

    protected abstract defpackage.anm m();

    @Override // defpackage.aoj, defpackage.cge
    /* JADX INFO: renamed from: p */
    public final void t() {
        o();
        defpackage.apj apjVar = this.i;
        if (apjVar != null) {
            apjVar.d = defpackage.cjv.r(this).r;
        }
        defpackage.apj apjVar2 = this.j;
        if (apjVar2 != null) {
            apjVar2.d = defpackage.cjv.r(this).r;
        }
        o();
        A();
    }

    @Override // defpackage.aoj, defpackage.cza
    public final void s(defpackage.cqu cquVar, defpackage.cqv cqvVar, long j) {
        int i;
        java.util.List list = cquVar.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((java.lang.Boolean) this.e.invoke(new defpackage.crl(((defpackage.crd) list.get(i2)).i))).booleanValue()) {
                super.s(cquVar, cqvVar, j);
                break;
            }
        }
        if (this.f) {
            F();
            defpackage.cqv cqvVar2 = defpackage.cqv.a;
            if (cqvVar == cqvVar2 && cquVar.e == 6) {
                defpackage.apj apjVarF = this.i;
                if (apjVarF == null) {
                    apjVarF = f();
                    this.i = apjVarF;
                }
                if (apjVarF != null) {
                    aiuw aiuwVarN = N();
                    defpackage.aph aphVar = (defpackage.aph) apjVarF;
                    if (aphVar.b == null) {
                        aphVar.b = ahoc.d(aiuwVarN, (defpackage.afdo) null, 0, new defpackage.btv(aphVar, (defpackage.afdk) null, 1), 3);
                    }
                }
            }
            defpackage.apj apjVar = this.i;
            if (apjVar != null) {
                apjVar.o(cquVar, cqvVar);
            }
            if (cqvVar == cqvVar2 && ((i = cquVar.e) == 10 || i == 11 || i == 12)) {
                defpackage.apj apjVarH = this.j;
                if (apjVarH == null) {
                    apjVarH = h();
                    this.j = apjVarH;
                }
                if (apjVarH != null) {
                    aiuw aiuwVarN2 = N();
                    defpackage.ari ariVar = (defpackage.ari) apjVarH;
                    if (ariVar.b == null) {
                        ariVar.b = ahoc.d(aiuwVarN2, (defpackage.afdo) null, 0, new defpackage.efp(ariVar, (defpackage.afdk) null, 1), 3);
                    }
                }
            }
            defpackage.apj apjVar2 = this.j;
            if (apjVar2 != null) {
                apjVar2.o(cquVar, cqvVar);
            }
        }
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.czc
    public final /* synthetic */ void D() {
    }

    @Override // defpackage.aoj
    public final void j(long j) {
    }
}
