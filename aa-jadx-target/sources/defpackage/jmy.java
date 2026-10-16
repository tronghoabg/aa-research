package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jmy implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jmy(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, rxf] */
    /* JADX WARN: Type inference failed for: r15v41, types: [java.lang.Object, jnp] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, rxr] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((com.google.android.apps.auto.carservice.frx.phonescreen.PhonescreenFrxActivity) this.a).D();
                return;
            case 1:
                pcs pcsVar = (pcs) this.a;
                pcsVar.g.post(pcsVar.h);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.yqj) ((defpackage.yqj) defpackage.joq.a.f()).ai((char) 2478)).u("Teardown protocol manager");
                defpackage.joq joqVar = (defpackage.joq) this.a;
                java.util.Iterator it = joqVar.g.iterator();
                while (it.hasNext()) {
                    try {
                        ((defpackage.rxr) it.next()).j();
                    } catch (android.os.RemoteException e) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.joq.a.h()).p(e)).ai((char) 2502)).u("Can't callback to startup service client.");
                    }
                }
                joqVar.b();
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.joq) this.a).b();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Object obj = this.a;
                defpackage.jpc jpcVar = (defpackage.jpc) obj;
                if (!jpcVar.j) {
                    ((defpackage.yqj) defpackage.jpc.a.l().ai((char) 2526)).u("Not starting virtual device Activity manager, disconnected from CDM.");
                    return;
                }
                defpackage.yqm yqmVar = defpackage.jpc.a;
                ((defpackage.yqj) yqmVar.l().ai((char) 2525)).u("Checking for virtual device to start Activity manager");
                j$.util.Optional optional = jpcVar.g;
                jgh jghVar = new jgh(obj, 3);
                if (true != optional.isPresent()) {
                    return;
                }
                java.lang.Object obj2 = optional.get();
                java.lang.Object obj3 = jghVar.a;
                defpackage.jmp jmpVarF = ((defpackage.jmq) ((defpackage.xzi) obj2).fF()).f(defpackage.ebm.n());
                ((defpackage.yqj) yqmVar.l().ai((char) 2527)).y("Virtual device obtained: %s", jmpVarF);
                defpackage.jpc jpcVar2 = (defpackage.jpc) obj3;
                ipw ipwVar = jpcVar2.k;
                ipwVar.getClass();
                if (ipwVar.e != null) {
                    ((defpackage.yqj) ((defpackage.yqj) ipw.a.f()).ai((char) 1001)).u("Already started");
                } else {
                    wtg wtgVar = (wtg) a$.ExternalSyntheticApiModelOutline2.m(ipwVar.c, jmpVarF);
                    wtgVar.getClass();
                    ipwVar.e = wtgVar;
                    android.content.Context context = ipwVar.b;
                    android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.apps.auto.carservice.car.activity.virtualdevice.CarVirtualDeviceActivity.class);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBinder("extra_car_analytics_binder", new ipv(ipwVar.d));
                    intent.putExtra("extra_car_analytics_binder_bundle", bundle);
                    android.app.ActivityOptions activityOptionsMakeBasic = android.app.ActivityOptions.makeBasic();
                    a$.ExternalSyntheticApiModelOutline1.m(activityOptionsMakeBasic, wtgVar.h().getDisplayId());
                    intent.addFlags(276856832);
                    context.startActivity(intent, activityOptionsMakeBasic.toBundle());
                    ((defpackage.yqj) ipw.a.l().ai((char) 1000)).w("Activity started on display: %d", wtgVar.h().getDisplayId());
                }
                jpcVar2.c.O.e(defpackage.zbe.CAR_SERVICE, defpackage.zbd.MV);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ipw ipwVar2 = ((defpackage.jpc) this.a).k;
                if (ipwVar2 == null) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.jpc.a.h()).ai((char) 2528)).u("Virtual device Activity manager is null");
                    return;
                }
                wtg wtgVar2 = ipwVar2.e;
                if (wtgVar2 != null) {
                    ((defpackage.ipo) wtgVar2.c).g();
                    java.lang.Object obj4 = wtgVar2.b;
                    if (obj4 != null) {
                        ((android.view.Surface) obj4).release();
                    }
                    wtgVar2.b = null;
                    java.lang.Object obj5 = wtgVar2.a;
                    if (obj5 != null) {
                        ((android.graphics.SurfaceTexture) obj5).release();
                    }
                    wtgVar2.a = null;
                }
                ipwVar2.e = null;
                ((defpackage.yqj) ipw.a.l().ai((char) 1002)).u("Stopped");
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yqm yqmVar2 = defpackage.jpc.a;
                java.lang.Object obj6 = this.a;
                try {
                    obj6.getClass();
                    ((defpackage.joz) obj6).b.g(1001, 0, "Teardown existing session due to new connection.");
                    return;
                } catch (android.os.RemoteException e2) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.jpc.a.h()).p(e2)).ai((char) 2524)).u("Can't callback to startup service client");
                    return;
                }
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                this.a.b();
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                try {
                    ?? r3 = this.a;
                    int i = defpackage.ygw.d;
                    r3.h(false, defpackage.ymx.a, 0, 0, defpackage.xpc.a.h());
                    return;
                } catch (android.os.RemoteException e3) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.jpc.a.h()).p(e3)).ai((char) 2509)).u("RemoteException in ::resumeServices");
                    return;
                }
            case 9:
                try {
                    this.a.e(false);
                    return;
                } catch (android.os.RemoteException e4) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.jpc.a.h()).p(e4)).ai((char) 2514)).u("Unexpected RemoteException when making callback.");
                    return;
                }
            case 10:
                defpackage.jpb jpbVar = (defpackage.jpb) this.a;
                long j = jpbVar.a;
                defpackage.jpc jpcVar3 = jpbVar.c;
                if (jpcVar3.k(j)) {
                    jpcVar3.g(jpbVar.b, j);
                    return;
                }
                return;
            case 11:
                ((jld) this.a).f();
                return;
            case 12:
                ((jld) this.a).f();
                return;
            case 13:
                java.lang.Object obj7 = this.a;
                jqn jqnVar = (jqn) obj7;
                if (jqnVar.b.get()) {
                    jqnVar.d.postDelayed(new defpackage.jmy(obj7, 13), jqnVar.e);
                    long jB = defpackage.xxd.a.b();
                    synchronized (jqnVar.c) {
                        java.util.ArrayDeque arrayDeque = ((jqn) obj7).i;
                        if (arrayDeque.size() >= 10) {
                            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) jqn.a.h()).l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(2648)).B("Too many pending ping requests in flight: %d, max: %d", arrayDeque.size(), 10);
                            return;
                        }
                        defpackage.jaa jaaVar = ((jqn) obj7).k;
                        if (jaaVar == null) {
                            ((defpackage.yqj) jqn.a.l().ai(2647)).u("Can't send ping request, end point is not ready yet.");
                            return;
                        } else {
                            arrayDeque.offer(java.lang.Long.valueOf(jB));
                            jaaVar.d(jB, false);
                            return;
                        }
                    }
                }
                return;
            case 14:
                java.lang.Object obj8 = this.a;
                jqn jqnVar2 = (jqn) obj8;
                if (jqnVar2.b.get()) {
                    jqnVar2.d.postDelayed(new defpackage.jmy(obj8, 14), jqnVar2.f);
                    synchronized (jqnVar2.c) {
                        jqm jqmVar = ((jqn) obj8).j;
                        java.util.List list = jqmVar.a;
                        if (list.isEmpty()) {
                            ((defpackage.yqj) ((defpackage.yqj) jqn.a.f()).ai(2646)).w("No latency stats to print, ping requests in flight: %d", ((jqn) obj8).i.size());
                            return;
                        }
                        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
                        ((defpackage.yqj) jqn.a.l().ai(2638)).U("Max latency: %dms; all (%d): %s (measured from %d to %d, %dms ago)", java.lang.Integer.valueOf(jqmVar.b), java.lang.Integer.valueOf(list.size()), new defpackage.xyj(" ").b(list), java.lang.Long.valueOf(jqmVar.c), java.lang.Long.valueOf(jqmVar.d), java.lang.Long.valueOf((defpackage.xxd.a.b() / 1000000) - jqmVar.d));
                        jqmVar.c = 0L;
                        jqmVar.d = 0L;
                        jqmVar.b = 0;
                        list.clear();
                        return;
                    }
                }
                return;
            case 15:
                defpackage.yqj yqjVar = (defpackage.yqj) defpackage.jrf.a.l().ai(2658);
                java.lang.Object obj9 = this.a;
                jre jreVar = (jre) obj9;
                yqjVar.y("Timed out waiting for insight for %s", jreVar.a);
                defpackage.eqp eqpVar = (defpackage.eqp) obj9;
                if (eqpVar.e() == null) {
                    int i2 = defpackage.ygw.d;
                    eqpVar.m(defpackage.ymx.a);
                }
                jreVar.a();
                return;
            case 16:
                jsc jscVar = (jsc) this.a;
                gfa gfaVar = (gfa) jscVar.i.get();
                if (gfaVar == null) {
                    ((defpackage.yqj) jsc.a.l().ai((char) 2714)).u("Template Context has been cleared when changing minimized mode");
                    return;
                }
                gso gsoVarL = gfaVar.l(gso.class);
                gsoVarL.getClass();
                boolean zC = gsoVarL.c();
                if (zC == jscVar.h) {
                    ((defpackage.yqj) jsc.a.l().ai((char) 2713)).u("Minimized state did not change, not updating ui");
                    return;
                } else {
                    jscVar.h = zC;
                    jscVar.f();
                    return;
                }
            case 17:
                ((jsc) this.a).f();
                return;
            case 18:
                juk jukVar = (juk) this.a;
                jukVar.a.f.c();
                jukVar.h.setFocusable(false);
                return;
            case 19:
                jwq jwqVar = (jwq) this.a;
                defpackage.ler.b().n(jwqVar.e);
                defpackage.ler.b().l(jwqVar.f);
                return;
            default:
                ((hlj) this.a).ej();
                return;
        }
    }

    public jmy(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
