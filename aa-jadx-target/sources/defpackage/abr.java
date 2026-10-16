package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abr implements defpackage.abo {
    public final defpackage.agn a;
    public defpackage.cfu b;
    public defpackage.dlz c;
    public final defpackage.bwx d = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.dly(0), defpackage.bxv.c);
    public defpackage.bys e;
    public final defpackage.aau f;

    public final class a<S> extends defpackage.cyc<defpackage.abt<S>> {
        private final defpackage.agi a;
        private final defpackage.bys b;
        private final defpackage.abr c;

        public a(defpackage.agi agiVar, defpackage.bys bysVar, defpackage.abr abrVar) {
            this.a = agiVar;
            this.b = bysVar;
            this.c = abrVar;
        }

        @Override // defpackage.cyc
        public final /* bridge */ /* synthetic */ defpackage.cge d() {
            return new defpackage.abt(this.a, this.b, this.c);
        }

        @Override // defpackage.cyc
        public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
            defpackage.abt abtVar = (defpackage.abt) cgeVar;
            abtVar.a = this.a;
            abtVar.b = this.b;
            abtVar.c = this.c;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof abr.a)) {
                return false;
            }
            abr.a aVar = (abr.a) obj;
            return defpackage.afga.f(aVar.a, this.a) && defpackage.afga.f(aVar.b, this.b);
        }

        public final int hashCode() {
            int iHashCode = this.c.hashCode() * 31;
            defpackage.agi agiVar = this.a;
            return ((iHashCode + (agiVar != null ? agiVar.hashCode() : 0)) * 31) + this.b.hashCode();
        }
    }

    public abr(defpackage.agn agnVar, defpackage.cfu cfuVar, defpackage.dlz dlzVar) {
        this.a = agnVar;
        this.b = cfuVar;
        this.c = dlzVar;
        long[] jArr = defpackage.aav.a;
        this.f = new defpackage.aau(6);
    }

    private final boolean i() {
        if (defpackage.a.X(4, 0)) {
            return true;
        }
        if (defpackage.a.X(4, 4) && this.c == defpackage.dlz.a) {
            return true;
        }
        return defpackage.a.X(4, 5) && this.c == defpackage.dlz.b;
    }

    private final boolean j() {
        if (defpackage.a.X(4, 1)) {
            return true;
        }
        if (defpackage.a.X(4, 4) && this.c == defpackage.dlz.b) {
            return true;
        }
        return defpackage.a.X(4, 5) && this.c == defpackage.dlz.a;
    }

    @Override // defpackage.abo
    public final defpackage.acw a(defpackage.afd afdVar, defpackage.affc affcVar) {
        if (i()) {
            return defpackage.acs.d(afdVar, new defpackage.abp(affcVar, this, 1));
        }
        if (j()) {
            return defpackage.acs.d(afdVar, new defpackage.abp(affcVar, this, 0));
        }
        int i = 2;
        if (defpackage.a.X(4, 2)) {
            return defpackage.acs.e(afdVar, new defpackage.abp(affcVar, this, i));
        }
        return defpackage.a.X(4, 3) ? defpackage.acs.e(afdVar, new defpackage.abp(affcVar, this, 3)) : defpackage.acw.a;
    }

    @Override // defpackage.abo
    public final defpackage.acx b(defpackage.afd afdVar, defpackage.affc affcVar) {
        int i = 4;
        byte[] bArr = null;
        if (i()) {
            return defpackage.acs.i(afdVar, new defpackage.abp(this, affcVar, i, bArr));
        }
        if (j()) {
            return defpackage.acs.i(afdVar, new defpackage.abp(this, affcVar, 5, bArr));
        }
        if (defpackage.a.X(4, 2)) {
            return defpackage.acs.j(afdVar, new defpackage.abp(this, affcVar, 6, bArr));
        }
        return defpackage.a.X(4, 3) ? defpackage.acs.j(afdVar, new defpackage.abp(this, affcVar, 7, bArr)) : defpackage.acx.a;
    }

    @Override // defpackage.abo
    public final void c(defpackage.acf acfVar, defpackage.adp adpVar) {
        acfVar.d = adpVar;
    }

    public final long d(long j, long j2) {
        return this.b.a(j, j2, defpackage.dlz.a);
    }

    public final long e() {
        defpackage.bys bysVar = this.e;
        return bysVar != null ? ((defpackage.dly) bysVar.a()).a : ((defpackage.dly) this.d.a()).a;
    }

    @Override // defpackage.agj
    public final java.lang.Object f() {
        return this.a.d().f();
    }

    @Override // defpackage.agj
    public final java.lang.Object g() {
        return this.a.d().g();
    }

    @Override // defpackage.agj
    public final /* synthetic */ boolean h(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.afw.s(this, obj, obj2);
    }
}
