package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vxz extends defpackage.vxx implements defpackage.vsw, defpackage.vxo {
    public final defpackage.vsu a;
    final j$.util.concurrent.ConcurrentHashMap b = new j$.util.concurrent.ConcurrentHashMap();
    public final defpackage.aclm c;
    public final defpackage.aclm d;
    public final defpackage.xzi e;
    public final defpackage.afak f;
    private final java.util.concurrent.Executor g;

    public vxz(defpackage.wde wdeVar, java.util.concurrent.Executor executor, defpackage.aclm aclmVar, defpackage.aclm aclmVar2, defpackage.afak afakVar, defpackage.afak afakVar2, defpackage.row rowVar) {
        this.a = wdeVar.d(defpackage.zgt.INSTANCE, aclmVar, afakVar);
        this.g = executor;
        this.c = aclmVar;
        this.d = aclmVar2;
        this.f = afakVar2;
        this.e = defpackage.ysr.aQ(new defpackage.jbr(rowVar, aclmVar, 9, null));
    }

    private final synchronized void f(defpackage.vxw vxwVar, java.lang.String str) {
        if (defpackage.vxw.d(vxwVar)) {
            defpackage.zhs zhsVar = defpackage.zho.a;
            return;
        }
        defpackage.vsu vsuVar = this.a;
        defpackage.vzf vzfVarE = vsuVar.e(str);
        int iD = vsuVar.d();
        if (vzfVarE.f()) {
            defpackage.zhs zhsVar2 = defpackage.zho.a;
            return;
        }
        vxwVar.c();
        vxwVar.b = 1;
        if (!defpackage.vxw.d(vxwVar) && !defpackage.ysr.bw(str)) {
            h(str, vzfVarE, iD, vxwVar);
            return;
        }
        new defpackage.zif(new java.lang.IllegalArgumentException("Can't record an event that was never started or has been stopped already"));
    }

    private final synchronized void g(java.lang.String str, java.lang.String str2, int i) {
        defpackage.vxw vxwVar = (defpackage.vxw) this.b.remove(str);
        if (defpackage.vxw.d(vxwVar)) {
            defpackage.zhs zhsVar = defpackage.zho.a;
            return;
        }
        defpackage.vsu vsuVar = this.a;
        defpackage.vzf vzfVarE = vsuVar.e(str);
        int iD = vsuVar.d();
        if (vzfVarE.f()) {
            defpackage.zhs zhsVar2 = defpackage.zho.a;
            return;
        }
        vxwVar.c();
        vxwVar.b = i;
        vxwVar.a();
        vxwVar.b();
        if (true != defpackage.ysr.bw(str2)) {
            str = str2;
        }
        h(str, vzfVarE, iD, vxwVar);
    }

    private final void h(final java.lang.String str, final defpackage.vzf vzfVar, final int i, final defpackage.vxw vxwVar) {
        this.g.execute(new defpackage.zim(new defpackage.zgm() { // from class: vxy
            @Override // defpackage.zgm
            public final defpackage.zhs a() {
                defpackage.vxz vxzVar = this.a;
                if (!((defpackage.vyv) vxzVar.e.fF()).a()) {
                    ((defpackage.ype) ((defpackage.ype) vmf.a.e()).ai((char) 9905)).u("TimerMetric not recorded, metric was rejected by sampling configuration.");
                    return defpackage.zho.a;
                }
                defpackage.vzf vzfVar2 = vzfVar;
                defpackage.vxw vxwVar2 = vxwVar;
                defpackage.xyn xynVar = ((defpackage.vxv) vxzVar.c.a()).b;
                defpackage.vsp vspVarA = defpackage.vsq.a();
                int i2 = 1;
                vspVarA.d(true);
                vspVarA.d = vzfVar2;
                defpackage.xyn xynVar2 = (defpackage.xyn) vxzVar.d.a();
                defpackage.abor aborVarN = ajht.a.n();
                boolean zBooleanValue = ((java.lang.Boolean) xynVar2.a(new defpackage.kpo(10)).d(java.lang.Boolean.FALSE)).booleanValue();
                defpackage.abor aborVarN2 = ajhu.a.n();
                long jB = zBooleanValue ? vxwVar2.b() : vxwVar2.a();
                aborVarN2.t();
                ajhu ajhuVar = aborVarN2.b;
                ajhuVar.b |= 1;
                ajhuVar.c = jB;
                int i3 = vxwVar2.b;
                if (i3 != 0) {
                    int i4 = i3 - 1;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            i2 = i4 != 2 ? 4 : 3;
                        } else {
                            i2 = 2;
                        }
                    }
                    aborVarN2.t();
                    ajhu ajhuVar2 = aborVarN2.b;
                    ajhuVar2.d = i2 - 1;
                    ajhuVar2.b = 2 | ajhuVar2.b;
                }
                java.lang.String str2 = str;
                ajhu ajhuVarQ = aborVarN2.q();
                aborVarN.t();
                ajht ajhtVar = aborVarN.b;
                ajhuVarQ.getClass();
                ajhtVar.g = ajhuVarQ;
                ajhtVar.b |= 16;
                vspVarA.g((ajht) aborVarN.q());
                vspVarA.a = str2;
                vspVarA.b = null;
                if (((java.lang.Boolean) vxzVar.f.a()).booleanValue()) {
                    vspVarA.h = i;
                }
                return vxzVar.a.a(vspVarA.a());
            }
        }));
    }

    @Override // defpackage.vxo
    public final void a(defpackage.vlu vluVar, long j, long j2) {
        defpackage.vxw vxwVar = new defpackage.vxw(j, j2);
        defpackage.vsu vsuVar = this.a;
        java.lang.String str = vluVar.a;
        defpackage.vzf vzfVarE = vsuVar.e(str);
        int iD = vsuVar.d();
        if (vzfVarE.f()) {
            defpackage.zhs zhsVar = defpackage.zho.a;
        } else {
            h(str, vzfVarE, iD, vxwVar);
        }
    }

    @Override // defpackage.vxx
    public final defpackage.vxw b() {
        return this.a.c() ? new defpackage.vxw() : defpackage.vxw.a;
    }

    @Override // defpackage.vxx
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void c(defpackage.vlu vluVar) {
        if (!this.a.c()) {
            defpackage.vxw vxwVar = defpackage.vxw.a;
            return;
        }
        this.b.put(vluVar.a, new defpackage.vxw());
    }

    @Override // defpackage.vxx
    public final void d(defpackage.vlu vluVar, defpackage.vlu vluVar2, int i) {
        g(vluVar.a, vluVar2 == null ? null : vluVar2.a, i);
    }

    @Override // defpackage.vxx
    public final void e(defpackage.vxw vxwVar, defpackage.vlu vluVar) {
        f(vxwVar, vluVar.a);
    }

    @Override // defpackage.vsw
    public final /* synthetic */ void k() {
    }
}
