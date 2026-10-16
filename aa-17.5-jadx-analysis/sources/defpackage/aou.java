package defpackage;

/* loaded from: classes.dex */
public final class aou implements aog {
    public final aoe a;
    public aqz c;
    public ca d;
    private aoq e;
    private aot f;
    private aos g;
    private aor h;
    private sm j;
    public long b = 0;
    private long i = 9205357640488583168L;

    public aou(aoe aoeVar) {
        this.a = aoeVar;
    }

    static /* synthetic */ void j(aou aouVar, cpl cplVar, long j, long j2, int i) {
        aos aosVar = aouVar.g;
        if (aosVar == null) {
            aosVar = new aos();
            aouVar.g = aosVar;
        }
        aosVar.c = cplVar;
        aosVar.d = j;
        aqz aqzVar = aouVar.c;
        if (aqzVar == null) {
            aouVar.c = new aqz(aouVar.a.d, 0L);
        } else {
            if ((i & 4) != 0) {
                j2 = 0;
            }
            aqzVar.a = aouVar.a.d;
            aqzVar.b = j2;
        }
        aosVar.e = false;
        aouVar.d = aosVar;
    }

    public final aoq a() {
        aoq aoqVar = this.e;
        if (aoqVar != null) {
            return aoqVar;
        }
        aoq aoqVar2 = new aoq(null);
        this.e = aoqVar2;
        return aoqVar2;
    }

    public final void b() {
        aoq aoqVarA = a();
        aoqVarA.e = 3;
        aoqVarA.c = false;
        aoqVarA.d = false;
        this.d = aoqVarA;
    }

    public final void c(cpl cplVar, long j, aqz aqzVar) {
        aor aorVar = this.h;
        if (aorVar == null) {
            aorVar = new aor();
            this.h = aorVar;
        }
        aorVar.c = cplVar;
        aorVar.d = j;
        aqzVar.b = 0L;
        this.d = aorVar;
    }

    @Override // defpackage.ajx
    public final String d() {
        ca caVar = this.d;
        return caVar instanceof aoq ? ((aoq) caVar).d ? "waiting" : "idle" : ((caVar instanceof aos) || (caVar instanceof aor)) ? "waiting" : caVar instanceof aot ? "recognized" : "idle";
    }

    public final void e(long j) {
        aot aotVar = this.f;
        if (aotVar == null) {
            aotVar = new aot();
            this.f = aotVar;
        }
        aotVar.c = j;
        this.d = aotVar;
    }

    public final void f() {
        b();
        if (this.a.h) {
            g();
        }
        this.j = null;
    }

    public final void g() {
        this.a.K(ano.c);
    }

    public final void h(cpl cplVar, cpk cpkVar, long j) {
        aoe aoeVar = this.a;
        long jK = crt.j(bzi.o(aoeVar)).k(0L);
        long j2 = this.i;
        if (j2 != 9205357640488583168L && jK != j2) {
            this.b = a.ai(this.b, aclh.y(jK, j2));
        }
        this.i = jK;
        api apiVar = aoeVar.d;
        apiVar.getClass();
        if (Math.abs(aoi.a(j, apiVar)) > 2.0f) {
            sm smVarK = k();
            api apiVar2 = aoeVar.d;
            long j3 = this.b;
            smVarK.d(cplVar.b, a.ai(ca.aG(cplVar, apiVar2, cpkVar), j3));
            aoeVar.K(new anp(j, true));
        }
    }

    public final void i(cpl cplVar, cpl cplVar2, cpk cpkVar, long j) {
        if (this.j == null) {
            this.j = new sm((byte[]) null);
        }
        this.b = 0L;
        sm smVarK = k();
        aoe aoeVar = this.a;
        api apiVar = aoeVar.d;
        long j2 = this.b;
        smVarK.d(cplVar.b, a.ai(ca.aG(cplVar, apiVar, cpkVar), j2));
        long jY = aclh.y(ca.aG(cplVar2, aoeVar.d, cpkVar), j);
        if (((Boolean) aoeVar.e.invoke(new crc(1))).booleanValue()) {
            this.i = crt.j(bzi.o(aoeVar)).k(0L);
            aoeVar.K(new anq(jY));
        }
    }

    public final sm k() {
        sm smVar = this.j;
        if (smVar != null) {
            return smVar;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    @Override // defpackage.aog
    public final api n() {
        return this.a.d;
    }
}
