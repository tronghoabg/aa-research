package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aoz implements defpackage.aol {
    public final defpackage.aoj a;
    public defpackage.are c;
    public defpackage.ca d;
    private defpackage.aov e;
    private defpackage.aoy f;
    private defpackage.aox g;
    private defpackage.aow h;
    private defpackage.sr j;
    public long b = 0;
    private long i = 9205357640488583168L;

    public aoz(defpackage.aoj aojVar) {
        this.a = aojVar;
    }

    static /* synthetic */ void j(defpackage.aoz aozVar, cpu cpuVar, long j, long j2, int i) {
        defpackage.aox aoxVar = aozVar.g;
        if (aoxVar == null) {
            aoxVar = new defpackage.aox();
            aozVar.g = aoxVar;
        }
        aoxVar.c = cpuVar;
        aoxVar.d = j;
        defpackage.are areVar = aozVar.c;
        if (areVar == null) {
            aozVar.c = new defpackage.are(aozVar.a.d, 0L);
        } else {
            if ((i & 4) != 0) {
                j2 = 0;
            }
            areVar.a = aozVar.a.d;
            areVar.b = j2;
        }
        aoxVar.e = false;
        aozVar.d = aoxVar;
    }

    public final defpackage.aov a() {
        defpackage.aov aovVar = this.e;
        if (aovVar != null) {
            return aovVar;
        }
        defpackage.aov aovVar2 = new defpackage.aov(null);
        this.e = aovVar2;
        return aovVar2;
    }

    public final void b() {
        defpackage.aov aovVarA = a();
        aovVarA.e = 3;
        aovVarA.c = false;
        aovVarA.d = false;
        this.d = aovVarA;
    }

    public final void c(cpu cpuVar, long j, defpackage.are areVar) {
        defpackage.aow aowVar = this.h;
        if (aowVar == null) {
            aowVar = new defpackage.aow();
            this.h = aowVar;
        }
        aowVar.c = cpuVar;
        aowVar.d = j;
        areVar.b = 0L;
        this.d = aowVar;
    }

    @Override // defpackage.akc
    public final java.lang.String d() {
        defpackage.ca caVar = this.d;
        if (caVar instanceof defpackage.aov) {
            return ((defpackage.aov) caVar).d ? "waiting" : "idle";
        }
        if ((caVar instanceof defpackage.aox) || (caVar instanceof defpackage.aow)) {
            return "waiting";
        }
        return caVar instanceof defpackage.aoy ? "recognized" : "idle";
    }

    public final void e(long j) {
        defpackage.aoy aoyVar = this.f;
        if (aoyVar == null) {
            aoyVar = new defpackage.aoy();
            this.f = aoyVar;
        }
        aoyVar.c = j;
        this.d = aoyVar;
    }

    public final void f() {
        b();
        if (this.a.h) {
            g();
        }
        this.j = null;
    }

    public final void g() {
        this.a.K(defpackage.ant.c);
    }

    public final void h(cpu cpuVar, defpackage.cpt cptVar, long j) {
        defpackage.aoj aojVar = this.a;
        long jK = defpackage.csc.g(defpackage.cjv.p(aojVar)).k(0L);
        long j2 = this.i;
        if (j2 != 9205357640488583168L && jK != j2) {
            this.b = defpackage.a.ah(this.b, defpackage.acmj.r(jK, j2));
        }
        this.i = jK;
        defpackage.apn apnVar = aojVar.d;
        apnVar.getClass();
        if (java.lang.Math.abs(defpackage.aon.a(j, apnVar)) > 2.0f) {
            defpackage.sr srVarK = k();
            defpackage.apn apnVar2 = aojVar.d;
            long j3 = this.b;
            srVarK.d(cpuVar.b, defpackage.a.ah(defpackage.ca.aG(cpuVar, apnVar2, cptVar), j3));
            aojVar.K(new defpackage.anu(j, true));
        }
    }

    public final void i(cpu cpuVar, cpu cpuVar2, defpackage.cpt cptVar, long j) {
        if (this.j == null) {
            this.j = new defpackage.sr((byte[]) null);
        }
        this.b = 0L;
        defpackage.sr srVarK = k();
        defpackage.aoj aojVar = this.a;
        defpackage.apn apnVar = aojVar.d;
        long j2 = this.b;
        srVarK.d(cpuVar.b, defpackage.a.ah(defpackage.ca.aG(cpuVar, apnVar, cptVar), j2));
        long jR = defpackage.acmj.r(defpackage.ca.aG(cpuVar2, aojVar.d, cptVar), j);
        if (((java.lang.Boolean) aojVar.e.invoke(new defpackage.crl(1))).booleanValue()) {
            this.i = defpackage.csc.g(defpackage.cjv.p(aojVar)).k(0L);
            aojVar.K(new defpackage.anv(jR));
        }
    }

    public final defpackage.sr k() {
        defpackage.sr srVar = this.j;
        if (srVar != null) {
            return srVar;
        }
        throw new java.lang.IllegalArgumentException("Velocity Tracker not initialized.");
    }

    @Override // defpackage.aol
    public final defpackage.apn n() {
        return this.a.d;
    }
}
