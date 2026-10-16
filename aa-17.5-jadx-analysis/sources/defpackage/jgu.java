package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.view.Surface;
import com.google.android.apps.auto.carservice.car.activity.virtualdevice.CarVirtualDeviceActivity;
import com.google.android.apps.auto.carservice.frx.phonescreen.PhonescreenFrxActivity;
import j$.util.Optional;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class jgu implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jgu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v78, types: [java.lang.Object, jnh] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, jgt] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.b) {
            case 0:
                jgy jgyVar = (jgy) this.a;
                if (jgyVar.r) {
                    ((ype) jgy.a.l().ai((char) 2085)).y("%s.hideTransient()", jgyVar.b);
                    jgyVar.x(jgyVar.v());
                    jgyVar.r = false;
                    break;
                }
                break;
            case 1:
                ((jgy) this.a).A();
                break;
            case 2:
                jgy jgyVar2 = (jgy) this.a;
                ((ype) jgy.a.l().ai((char) 2125)).y("%s.requestFocus", jgyVar2.b);
                jgyVar2.d.Z(jgyVar2.h);
                break;
            case 3:
                if (acpf.m()) {
                    ?? r6 = this.a;
                    jgy jgyVar3 = (jgy) r6;
                    if (!jgyVar3.q) {
                        if (jgyVar3.t == null) {
                            jgyVar3.t = new jgu((Object) r6, i);
                        }
                        if (!jgyVar3.l) {
                            ((ype) jgy.a.l().ai((char) 2132)).y("%s already transiently showing, resetting timer.", jgyVar3.b);
                            Handler handler = jgyVar3.s;
                            handler.removeCallbacks(jgyVar3.t);
                            handler.postDelayed(jgyVar3.t, acpf.c());
                            break;
                        } else {
                            ((ype) jgy.a.l().ai((char) 2131)).y("%s.showTransient()", jgyVar3.b);
                            jgyVar3.l = false;
                            jgyVar3.h.getClass();
                            jgyVar3.r = true;
                            jgyVar3.B(jgyVar3.g);
                            if (jgyVar3.d.aj(r6, jgyVar3.p)) {
                                jgyVar3.m = true;
                                jgyVar3.n = true;
                                jgyVar3.o = null;
                            }
                            Handler handler2 = jgyVar3.s;
                            handler2.removeCallbacks(jgyVar3.t);
                            handler2.postDelayed(jgyVar3.t, acpf.c());
                            break;
                        }
                    } else {
                        ((ype) jgy.a.l().ai((char) 2133)).y("%s.showTransient() ignored because it is held open", jgyVar3.b);
                        break;
                    }
                }
                break;
            case 4:
                ((jgy) this.a).A();
                break;
            case 5:
                ((jko) this.a).d();
                break;
            case 6:
                jkv jkvVar = (jkv) this.a;
                jkvVar.c.removeCallbacksAndMessages(null);
                jkvVar.d.shutdownNow();
                break;
            case 7:
                Object obj = this.a;
                jln jlnVar = (jln) obj;
                jlm jlmVar = jlnVar.j;
                if (jlmVar.a) {
                    rwv rwvVar = jlmVar.f;
                    if (rwvVar != null) {
                        try {
                            rwvVar.m(((jln) obj).c);
                        } catch (RemoteException e) {
                            ((ype) ((ype) ((ype) jln.a.f()).p(e)).ai(2315)).y("Couldn't stop %s, but it could be fine.", jlnVar.j.e);
                        }
                    }
                    jlnVar.b.unbindService(jlnVar.i);
                    jlnVar.j.a = false;
                    break;
                }
                break;
            case 8:
                ((jln) this.a).h();
                break;
            case 9:
                jln jlnVar2 = (jln) this.a;
                jlnVar2.h.a(null, jlnVar2.d);
                break;
            case 10:
                jln jlnVar3 = (jln) this.a;
                jlm jlmVar2 = jlnVar3.j;
                jlmVar2.a();
                jlmVar2.b.addAll(jlnVar3.f);
                jlnVar3.h();
                break;
            case 11:
                jln jlnVar4 = (jln) this.a;
                jlm jlmVar3 = jlnVar4.j;
                if (jlmVar3.a) {
                    jlnVar4.b.unbindService(jlnVar4.i);
                    jlmVar3.a();
                    break;
                }
                break;
            case 12:
                pbu pbuVar = (pbu) this.a;
                if (pbuVar.b) {
                    ((kny) pbuVar.r.e).d(yxi.WIRELESS_WIFI_STARTUP_MANAGER_ON_CAR_SERVICE_STARTED);
                } else {
                    ols.M(pbuVar.c, yxi.STARTUP_MANAGER_ON_CAR_SERVICE_STARTED);
                }
                pbuVar.g.post(pbuVar.h);
                break;
            case 13:
                pbu pbuVar2 = (pbu) this.a;
                pbuVar2.g.post(pbuVar2.h);
                break;
            case 14:
                ((PhonescreenFrxActivity) this.a).D();
                break;
            case 15:
                ((ype) ((ype) joi.a.f()).ai((char) 2477)).u("Teardown protocol manager");
                joi joiVar = (joi) this.a;
                Iterator it = joiVar.g.iterator();
                while (it.hasNext()) {
                    try {
                        ((rwy) it.next()).j();
                    } catch (RemoteException e2) {
                        ((ype) ((ype) ((ype) joi.a.h()).p(e2)).ai((char) 2501)).u("Can't callback to startup service client.");
                    }
                }
                joiVar.b();
                break;
            case 16:
                ((joi) this.a).b();
                break;
            case 17:
                Object obj2 = this.a;
                jou jouVar = (jou) obj2;
                if (!jouVar.j) {
                    ((ype) jou.a.l().ai((char) 2525)).u("Not starting virtual device Activity manager, disconnected from CDM.");
                    break;
                } else {
                    yph yphVar = jou.a;
                    ((ype) yphVar.l().ai((char) 2524)).u("Checking for virtual device to start Activity manager");
                    Optional optional = jouVar.g;
                    jfz jfzVar = new jfz(obj2, 2);
                    if (true == optional.isPresent()) {
                        Object obj3 = optional.get();
                        Object obj4 = jfzVar.a;
                        jmi jmiVarF = ((jmj) ((xyc) obj3).gu()).f(dlz.D());
                        ((ype) yphVar.l().ai((char) 2526)).y("Virtual device obtained: %s", jmiVarF);
                        jou jouVar2 = (jou) obj4;
                        ipp ippVar = jouVar2.k;
                        ippVar.getClass();
                        if (ippVar.e != null) {
                            ((ype) ((ype) ipp.a.f()).ai((char) 1001)).u("Already started");
                        } else {
                            wsj wsjVar = (wsj) ippVar.c.apply(jmiVarF);
                            wsjVar.getClass();
                            ippVar.e = wsjVar;
                            Context context = ippVar.b;
                            Intent intent = new Intent(context, (Class<?>) CarVirtualDeviceActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putBinder("extra_car_analytics_binder", new ipo(ippVar.d));
                            intent.putExtra("extra_car_analytics_binder_bundle", bundle);
                            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                            activityOptionsMakeBasic.setLaunchDisplayId(wsjVar.h().getDisplayId());
                            intent.addFlags(276856832);
                            context.startActivity(intent, activityOptionsMakeBasic.toBundle());
                            ((ype) ipp.a.l().ai((char) 1000)).w("Activity started on display: %d", wsjVar.h().getDisplayId());
                        }
                        jouVar2.c.O.e(yzz.CAR_SERVICE, yzy.MR);
                        break;
                    }
                }
                break;
            case 18:
                ipp ippVar2 = ((jou) this.a).k;
                if (ippVar2 != null) {
                    wsj wsjVar2 = ippVar2.e;
                    if (wsjVar2 != null) {
                        ((iph) wsjVar2.c).g();
                        Object obj5 = wsjVar2.b;
                        if (obj5 != null) {
                            ((Surface) obj5).release();
                        }
                        wsjVar2.b = null;
                        Object obj6 = wsjVar2.a;
                        if (obj6 != null) {
                            ((SurfaceTexture) obj6).release();
                        }
                        wsjVar2.a = null;
                    }
                    ippVar2.e = null;
                    ((ype) ipp.a.l().ai((char) 1002)).u("Stopped");
                    break;
                } else {
                    ((ype) ((ype) jou.a.h()).ai((char) 2527)).u("Virtual device Activity manager is null");
                    break;
                }
            case 19:
                yph yphVar2 = jou.a;
                Object obj7 = this.a;
                try {
                    obj7.getClass();
                    ((jos) obj7).b.g(1001, 0, "Teardown existing session due to new connection.");
                    break;
                } catch (RemoteException e3) {
                    ((ype) ((ype) ((ype) jou.a.h()).p(e3)).ai((char) 2523)).u("Can't callback to startup service client");
                    return;
                }
            default:
                this.a.b();
                break;
        }
    }

    public jgu(jnh jnhVar, int i) {
        this.b = i;
        this.a = jnhVar;
    }
}
