package com.google.android.projection.gearhead.system;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import defpackage.acxa;
import defpackage.bgl$$ExternalSyntheticApiModelOutline0;
import defpackage.kgx;
import defpackage.kqq;
import defpackage.qio;
import defpackage.qrn;
import defpackage.qrv;
import defpackage.rbb;
import defpackage.rpz;
import defpackage.rrb;
import defpackage.rrc;
import defpackage.ryf;
import defpackage.ryg;
import defpackage.wer;
import defpackage.woy;
import defpackage.wxj;
import defpackage.xxh;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import j$.util.Optional;
import java.util.List;

/* loaded from: classes.dex */
public class RecoveryLifecycleService extends rbb {
    public static final yph g = yph.c("GH.RecoveryLifecycle");
    public final ryg h = new kqq("watchdog");
    public int i = -1;
    private int j;
    private long k;

    @Override // defpackage.rbb
    public final void e() {
        wer.c();
        yph yphVar = g;
        ((ype) ((ype) yphVar.f()).ai((char) 10255)).u("onProjectionLost()");
        if (Build.VERSION.SDK_INT >= 30) {
            ActivityManager activityManager = (ActivityManager) getSystemService("activity");
            activityManager.getClass();
            List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(getPackageName(), this.j, 1);
            int reason = historicalProcessExitReasons.isEmpty() ? 0 : bgl$$ExternalSyntheticApiModelOutline0.m(historicalProcessExitReasons.get(0)).getReason();
            ((ype) yphVar.l().ai(10256)).w("processExitReason: %d", reason);
            rpz rpzVarA = rpz.a(this);
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.LIFECYCLE_SERVICE, yzy.oU);
            rrbVarH.r = xxh.h(Integer.valueOf(reason));
            rpzVarA.c(rrbVarH.l());
        }
        ryf ryfVar = ryf.e;
        Optional.ofNullable(qrv.A(ryfVar.name())).ifPresentOrElse(new qio(this, 16), new wxj(ryfVar, 13));
    }

    @Override // defpackage.rbb
    public final void f() {
        ((ype) g.l().ai((char) 10257)).u("onProjectionReady");
        this.h.c(this, this.k);
    }

    @Override // defpackage.rbb
    public final boolean i() {
        if (acxa.aP()) {
            return this.d == null && !this.e;
        }
        return true;
    }

    @Override // defpackage.rbb
    public final void j(qrn qrnVar, Bundle bundle, kgx kgxVar) {
        wer.c();
        yph yphVar = g;
        ((ype) ((ype) yphVar.f()).ai((char) 10253)).u("onPreflightStart");
        bundle.setClassLoader(getClassLoader());
        woy.aa(bundle.containsKey("connection_type"), "Missing connection-type");
        woy.aa(bundle.containsKey("car_process_pid"), "Missing car process PID");
        woy.aa(bundle.containsKey("creation_millis"), "Missing creation millis");
        this.i = bundle.getInt("connection_type");
        this.j = bundle.getInt("car_process_pid");
        this.k = bundle.getLong("creation_millis");
        ((ype) yphVar.l().ai(10254)).B("Preflight start, connectionType: %d, carProcessPid: %d", this.i, this.j);
        kgxVar.f(true);
    }
}
