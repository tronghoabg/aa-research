package com.google.android.projection.gearhead.system;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class RecoveryLifecycleService extends defpackage.rbw {
    public static final defpackage.yqm g = defpackage.yqm.c("GH.RecoveryLifecycle");
    public final defpackage.rzb h = new defpackage.kqx("watchdog");
    public int i = -1;
    private int j;
    private long k;

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.rbw
    public final void e() throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = g;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 10283)).u("onProjectionLost()");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) getSystemService("activity");
            activityManager.getClass();
            java.util.List listM = bgp$.ExternalSyntheticApiModelOutline0.m(activityManager, getPackageName(), this.j, 1);
            int iM = listM.isEmpty() ? 0 : bgp$.ExternalSyntheticApiModelOutline0.m(bgp$.ExternalSyntheticApiModelOutline0.m(listM.get(0)));
            ((defpackage.yqj) yqmVar.l().ai(10284)).w("processExitReason: %d", iM);
            defpackage.rqt rqtVarA = defpackage.rqt.a(this);
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.LIFECYCLE_SERVICE, defpackage.zbd.oU);
            rrvVarH.r = defpackage.xyn.h(java.lang.Integer.valueOf(iM));
            rqtVarA.c(rrvVarH.l());
        }
        rza rzaVar = rza.e;
        j$.util.Optional.ofNullable(defpackage.rox.i(rzaVar.name())).ifPresentOrElse(new defpackage.pmt(this, 15), new xgr(rzaVar, 0));
    }

    @Override // defpackage.rbw
    public final void f() {
        ((defpackage.yqj) g.l().ai((char) 10285)).u("onProjectionReady");
        this.h.c(this, this.k);
    }

    @Override // defpackage.rbw
    public final boolean i() {
        if (defpackage.acyc.aS()) {
            return this.d == null && !this.e;
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.rbw
    public final void j(defpackage.qsh qshVar, android.os.Bundle bundle, defpackage.ntl ntlVar) throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = g;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 10281)).u("onPreflightStart");
        bundle.setClassLoader(getClassLoader());
        defpackage.ysr.bk(bundle.containsKey("connection_type"), "Missing connection-type");
        defpackage.ysr.bk(bundle.containsKey("car_process_pid"), "Missing car process PID");
        defpackage.ysr.bk(bundle.containsKey("creation_millis"), "Missing creation millis");
        this.i = bundle.getInt("connection_type");
        this.j = bundle.getInt("car_process_pid");
        this.k = bundle.getLong("creation_millis");
        ((defpackage.yqj) yqmVar.l().ai(10282)).B("Preflight start, connectionType: %d, carProcessPid: %d", this.i, this.j);
        ntlVar.c(true);
    }
}
