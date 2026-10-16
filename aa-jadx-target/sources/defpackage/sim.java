package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sim {
    public final defpackage.sil a;
    protected boolean b;
    public java.util.ArrayList c;
    public java.util.ArrayList d;
    public java.util.ArrayList e;
    public java.util.ArrayList f;
    public java.util.Set g;
    public java.lang.String h;
    public java.lang.String i;
    public final sit j;
    public final defpackage.zhs k;
    public boolean l;
    public final defpackage.abpy m;
    public defpackage.tns n;
    public int o;
    public final defpackage.abot p;

    public sim(defpackage.sip sipVar, defpackage.abpy abpyVar) {
        defpackage.abot abotVar = (defpackage.abot) defpackage.acbo.a.n();
        this.p = abotVar;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.l = false;
        this.a = sipVar;
        this.i = sipVar.h;
        this.h = sipVar.e;
        defpackage.sir sirVar = sipVar.f.getApplicationContext() instanceof defpackage.sir ? (defpackage.sir) sipVar.f.getApplicationContext() : (defpackage.sir) defpackage.sis.a.get();
        sit sitVarA = sirVar != null ? sirVar.a() : null;
        if (sitVarA == null) {
            this.j = null;
        } else {
            int i = sitVarA.a;
            if (i == 2 || i == 3) {
                this.j = sitVarA;
            } else {
                android.util.Log.e("AbstractLogEventBuilder", "The provided ProductIdOrigin " + java.lang.Integer.toString(i - 1) + " is not one of the process-level expected values: 1 or 2");
                this.j = null;
            }
        }
        this.k = sirVar != null ? sirVar.b() : null;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        abotVar.t();
        defpackage.acbo acboVar = (defpackage.acbo) abotVar.b;
        acboVar.b |= 1;
        acboVar.c = jCurrentTimeMillis;
        long j = ((defpackage.acbo) abotVar.b).c;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long offset = ((long) java.util.TimeZone.getDefault().getOffset(j)) / 1000;
        abotVar.t();
        defpackage.acbo acboVar2 = (defpackage.acbo) abotVar.b;
        acboVar2.b |= 131072;
        acboVar2.g = offset;
        if (!defpackage.tnx.e(sipVar.f)) {
            abotVar.t();
            defpackage.acbo acboVar3 = (defpackage.acbo) abotVar.b;
            acboVar3.b |= 8388608;
            acboVar3.h = true;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (jElapsedRealtime != 0) {
            abotVar.t();
            defpackage.acbo acboVar4 = (defpackage.acbo) abotVar.b;
            acboVar4.b |= 2;
            acboVar4.d = jElapsedRealtime;
        }
        this.m = abpyVar;
    }

    public final void a(sit sitVar) {
        defpackage.abot abotVar = this.p;
        defpackage.acbp acbpVar = ((defpackage.acbo) abotVar.b).l;
        if (acbpVar == null) {
            acbpVar = defpackage.acbp.a;
        }
        defpackage.abot abotVar2 = (defpackage.abot) acbpVar.K();
        int i = sitVar.a;
        abotVar2.t();
        defpackage.acbp acbpVar2 = (defpackage.acbp) abotVar2.b;
        acbpVar2.d = i - 1;
        acbpVar2.b |= 2;
        abvh abvhVar = acbpVar2.c;
        if (abvhVar == null) {
            abvhVar = abvh.a;
        }
        defpackage.abor aborVarK = abvhVar.K();
        abvg abvgVar = aborVarK.b.c;
        if (abvgVar == null) {
            abvgVar = abvg.a;
        }
        defpackage.abor aborVarK2 = abvgVar.K();
        aborVarK2.t();
        abvg abvgVar2 = aborVarK2.b;
        abvgVar2.b |= 1;
        abvgVar2.c = 79508299;
        aborVarK.t();
        abvh abvhVar2 = aborVarK.b;
        abvg abvgVarQ = aborVarK2.q();
        abvgVarQ.getClass();
        abvhVar2.c = abvgVarQ;
        abvhVar2.b |= 1;
        abotVar2.t();
        defpackage.acbp acbpVar3 = (defpackage.acbp) abotVar2.b;
        abvh abvhVarQ = aborVarK.q();
        abvhVarQ.getClass();
        acbpVar3.c = abvhVarQ;
        acbpVar3.b |= 1;
        defpackage.acbp acbpVar4 = (defpackage.acbp) abotVar2.q();
        abotVar.t();
        defpackage.acbo acboVar = (defpackage.acbo) abotVar.b;
        acbpVar4.getClass();
        acboVar.l = acbpVar4;
        acboVar.b |= 268435456;
    }

    public final defpackage.swx b() {
        if (this.b) {
            throw new java.lang.IllegalStateException("do not reuse LogEventBuilder");
        }
        this.b = true;
        defpackage.sip sipVar = (defpackage.sip) this.a;
        defpackage.siq siqVar = sipVar.g;
        sin sinVar = sipVar.p;
        return sinVar != null ? defpackage.sjw.d(this, new phr(siqVar, sinVar, 4, (byte[]) null)) : defpackage.sjw.d(this, new defpackage.kpl(siqVar, 6));
    }

    @java.lang.Deprecated
    public final void c(defpackage.tns tnsVar) {
        if (defpackage.addk.a.fF().a(((defpackage.sip) this.a).f)) {
            return;
        }
        this.n = tnsVar;
    }

    public final int d() {
        int i = this.o;
        return i != 0 ? i : this.a.k;
    }

    public final void e(int[] iArr) {
        if (this.a.c()) {
            throw new java.lang.IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
        }
        if (iArr == null || (iArr.length) == 0) {
            return;
        }
        if (this.e == null) {
            this.e = new java.util.ArrayList();
        }
        for (int i : iArr) {
            this.e.add(java.lang.Integer.valueOf(i));
        }
    }

    public final void f(java.lang.String str) {
        if (this.a.c()) {
            throw new java.lang.IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
        }
        java.util.ArrayList arrayList = this.d;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.d = arrayList;
        }
        arrayList.add(str);
    }

    public final void g(int i) {
        defpackage.abot abotVar = this.p;
        abotVar.t();
        defpackage.acbo acboVar = (defpackage.acbo) abotVar.b;
        defpackage.acbo acboVar2 = defpackage.acbo.a;
        acboVar.b |= 32;
        acboVar.e = i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AbstractLogEventBuilderuploadAccount: ");
        sb.append(this.h);
        sb.append(", logSourceName: ");
        sb.append(this.i);
        sb.append(", qosTier: ");
        sb.append(d() - 1);
        sb.append(", veMessage: null, testCodes: ");
        java.util.ArrayList arrayList = this.c;
        sb.append(arrayList != null ? defpackage.sil.a(arrayList) : null);
        sb.append(", mendelPackages: ");
        java.util.ArrayList arrayList2 = this.d;
        sb.append(arrayList2 != null ? defpackage.sil.a(arrayList2) : null);
        sb.append(", experimentIds: ");
        java.util.ArrayList arrayList3 = this.e;
        sb.append(arrayList3 != null ? defpackage.sil.a(arrayList3) : null);
        sb.append(", experimentTokens: ");
        java.util.ArrayList arrayList4 = this.f;
        sb.append(arrayList4 != null ? defpackage.sil.a(arrayList4) : null);
        sb.append(", addPhenotype: true]");
        return sb.toString();
    }
}
