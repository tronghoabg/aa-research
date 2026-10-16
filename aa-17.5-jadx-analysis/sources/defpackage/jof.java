package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class jof implements Runnable {
    final /* synthetic */ rwm a;
    final /* synthetic */ joi b;

    public jof(joi joiVar, rwm rwmVar) {
        this.a = rwmVar;
        this.b = joiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18, types: [ilc, java.lang.Object, jes, jev, jew] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        jfg jfgVar;
        String str2;
        String str3;
        String str4;
        int i;
        try {
            ype ypeVar = (ype) ((ype) joi.a.f()).ai(2447);
            joi joiVar = this.b;
            ypeVar.x("Service start completed for %d", joiVar.c);
            ols.K(joiVar.b, "com.google.android.gms.car.GEARHEAD_ENDPOINTS", rrx.b.ordinal(), null);
            this.a.f(true);
            jot jotVar = joiVar.x;
            jotVar.c.d.post(new jgw(jotVar, 8, null));
            ima imaVar = joiVar.f;
            ilb.d();
            yph yphVar = ima.b;
            ((ype) yphVar.l().ai((char) 305)).u("completeStartup, car service ready");
            iuc iucVar = imaVar.u;
            ile ileVar = iucVar.E;
            if (ileVar != null) {
                CarInfoInternal carInfoInternal = iucVar.r;
                Context context = imaVar.F;
                ileVar.g.c();
                if (!ileVar.c) {
                    throw new IllegalStateException("CarNotConnected");
                }
                if (ileVar.b == null) {
                    ((ype) ((ype) ile.a.h()).ai((char) 273)).u("Tried to send a wifi credentials request before the end point was ready.");
                } else {
                    ileVar.e = context;
                    ileVar.f = carInfoInternal;
                    ((ype) ile.a.l().ai((char) 272)).u("Sending wifi credentials request");
                    jcf jcfVar = ileVar.b;
                    ypf ypfVar = jcf.a;
                    ypfVar.l().ai(1865).u("sendWifiCredentialsRequest");
                    if (jcfVar.b) {
                        jcfVar.k(32769, xpj.a);
                    } else {
                        ypfVar.f().ai(1866).u("sendWifiCredentialsRequest on closed channel");
                    }
                }
            }
            ikz ikzVar = imaVar.l;
            imaVar.az(ikzVar);
            SharedPreferences.Editor editorEdit = ikzVar.c.edit();
            editorEdit.putInt("car_connection_count", 0);
            editorEdit.apply();
            synchronized (imaVar.q) {
                if (!imaVar.br()) {
                    ((ype) yphVar.l().ai(392)).u("car disconnected while service discovery");
                } else if (!imaVar.s) {
                    imaVar.ad = new rki(imaVar.W(), iucVar.n);
                    imaVar.ae = new rjz(imaVar.W());
                    imaVar.y = new iuq(imaVar.W());
                    if (imaVar.z != null) {
                        imaVar.y.b(imaVar.z.booleanValue());
                    }
                    iucVar.v.e();
                    imc imcVar = new imc();
                    imaVar.C.set(imcVar);
                    ntn ntnVar = new ntn();
                    imaVar.B.set(ntnVar);
                    Context context2 = imaVar.k;
                    acur acurVar = acur.a;
                    rps rpsVar = new rps(context2, acurVar.gu().f(), true);
                    if (acurVar.gu().f()) {
                        imaVar.D.set(rpsVar);
                    }
                    ynp ynpVarListIterator = ((yfq) imaVar.W().values()).listIterator(0);
                    while (ynpVarListIterator.hasNext()) {
                        iuu iuuVar = (iuu) ynpVarListIterator.next();
                        ?? r10 = iuuVar.g;
                        iva ivaVar = iuuVar.o;
                        ikb ikbVar = iuuVar.q;
                        CarDisplayId carDisplayId = iuuVar.j;
                        imc imcVar2 = imcVar;
                        ynp ynpVar = ynpVarListIterator;
                        ntn ntnVar2 = ntnVar;
                        Context context3 = context2;
                        iuuVar.p = new ina(iuuVar, context3, r10, r10, ((ima) r10).l, r10, ivaVar, ikbVar, ((ima) r10).E, ivaVar.e(), new jbk(r10, carDisplayId, 1, null), carDisplayId, ((ima) r10).O, imcVar2, ((ima) r10).X, iuuVar.n, ntnVar2);
                        xop xopVar = iuuVar.t;
                        if (xopVar != null) {
                            iuuVar.c(xopVar);
                        }
                        context2 = context3;
                        imcVar = imcVar2;
                        ntnVar = ntnVar2;
                        ynpVarListIterator = ynpVar;
                    }
                    imc imcVar3 = imcVar;
                    Context context4 = context2;
                    inf infVar = Build.VERSION.SDK_INT >= 35 ? ioq.F : null;
                    inf infVar2 = ipb.G;
                    inf infVar3 = ioj.E;
                    boolean z = iucVar.p != 0 && ActivityManager.isUserAMonkey();
                    iqw iqwVar = imaVar.w;
                    irb irbVar = iucVar.y;
                    jfg jfgVar2 = imaVar.O;
                    ixu ixuVar = (ixu) imaVar.S.gu();
                    ixs ixsVar = imaVar.E;
                    int i2 = 0;
                    int i3 = 6;
                    iob iobVar = new iob(imaVar, context4, jfgVar2, imaVar, imaVar, ixuVar, ikzVar, imaVar, imaVar, ixsVar, new kpf(imaVar, 1), infVar, infVar2, infVar3, z, imaVar, imcVar3, rpsVar, iqwVar, irbVar);
                    imaVar.A.set(iobVar);
                    ixsVar.c(iobVar);
                    iuu iuuVarP = imaVar.p();
                    iuuVarP.getClass();
                    yfq yfqVarH = iuuVarP.o.h();
                    int i4 = iucVar.p;
                    ((jfh) jfgVar2).g = null;
                    List listK = jfh.k(yfqVarH);
                    PackageManager packageManager = ((jfh) jfgVar2).e.getApplicationContext().getPackageManager();
                    abnp abnpVarN = yxs.a.n();
                    try {
                        str = packageManager.getPackageInfo(RemoteApiConstants.NOW_PACKAGE, 0).versionName;
                    } catch (PackageManager.NameNotFoundException unused) {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    abnpVarN.t();
                    yxs yxsVar = (yxs) abnpVarN.b;
                    yxsVar.b |= 1;
                    yxsVar.c = str;
                    ikw ikwVar = ((jfh) jfgVar2).c;
                    PackageManager packageManager2 = ikwVar.b.getPackageManager();
                    String[] strArr = ikw.a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i3) {
                            jfgVar = jfgVar2;
                            str2 = "";
                            break;
                        }
                        str2 = strArr[i5];
                        try {
                            packageManager2.getPackageInfo(str2, i2);
                            jfgVar = jfgVar2;
                            try {
                            } catch (PackageManager.NameNotFoundException unused2) {
                                continue;
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            jfgVar = jfgVar2;
                        }
                        if (((ixu) ikwVar.c.gu()).p(str2, qpi.f)) {
                            break;
                        }
                        i5++;
                        jfgVar2 = jfgVar;
                        i2 = 0;
                        i3 = 6;
                    }
                    try {
                        str3 = packageManager.getPackageInfo(str2, 0).versionName;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    abnpVarN.t();
                    yxs yxsVar2 = (yxs) abnpVarN.b;
                    yxsVar2.b |= 2;
                    yxsVar2.d = str3;
                    try {
                        str4 = packageManager.getPackageInfo(ilb.c(((jfh) jfgVar).e.getApplicationContext()), 0).versionName;
                    } catch (PackageManager.NameNotFoundException unused5) {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    abnpVarN.t();
                    yxs yxsVar3 = (yxs) abnpVarN.b;
                    yxsVar3.b |= 8;
                    yxsVar3.e = str4;
                    yxs yxsVar4 = (yxs) abnpVarN.q();
                    yxt yxtVar = yxt.a;
                    abnp abnpVarN2 = yxtVar.n();
                    abnpVarN2.t();
                    yxt yxtVar2 = (yxt) abnpVarN2.b;
                    yxsVar4.getClass();
                    yxtVar2.c = yxsVar4;
                    yxtVar2.b |= 1;
                    abnpVarN2.t();
                    yxt yxtVar3 = (yxt) abnpVarN2.b;
                    yxtVar3.b |= 4;
                    yxtVar3.e = i4;
                    abnpVarN2.O(listK);
                    yxt yxtVar4 = (yxt) abnpVarN2.q();
                    yxb yxbVar = yxb.a;
                    abnp abnpVarN3 = yxbVar.n();
                    abnpVarN3.t();
                    yxb yxbVar2 = (yxb) abnpVarN3.b;
                    yxtVar4.getClass();
                    yxbVar2.e = yxtVar4;
                    yxbVar2.b |= 1;
                    yxc yxcVar = yxc.DEVICE_CONNECTED;
                    yfq yfqVar = yls.a;
                    ((jfh) jfgVar).m(abnpVarN3, yxcVar, yfqVar);
                    ynp ynpVarListIterator2 = ((yfq) iucVar.K.values()).listIterator(0);
                    while (ynpVarListIterator2.hasNext()) {
                        iuu iuuVar2 = (iuu) ynpVarListIterator2.next();
                        if (!iuuVar2.e()) {
                            yfq yfqVarH2 = iuuVar2.o.h();
                            jfg jfgVar3 = imaVar.O;
                            CarUiInfo carUiInfo = iuuVar2.q.m;
                            int i6 = iuuVar2.j.b;
                            xjc xjcVar = iuuVar2.k;
                            List listK2 = jfh.k(yfqVarH2);
                            abnp abnpVarN4 = yxtVar.n();
                            abnpVarN4.t();
                            yxt yxtVar5 = (yxt) abnpVarN4.b;
                            ynp ynpVar2 = ynpVarListIterator2;
                            yxtVar5.b |= 16;
                            yxtVar5.h = i6;
                            int i7 = xjcVar.d;
                            abnpVarN4.t();
                            yxt yxtVar6 = (yxt) abnpVarN4.b;
                            yxtVar6.b |= 32;
                            yxtVar6.i = i7;
                            abnpVarN4.O(listK2);
                            if (carUiInfo != null) {
                                yxr yxrVarJ = jfh.j(carUiInfo);
                                abnpVarN4.t();
                                yxt yxtVar7 = (yxt) abnpVarN4.b;
                                yxrVarJ.getClass();
                                yxtVar7.g = yxrVarJ;
                                yxtVar7.b |= 8;
                            }
                            abnp abnpVarN5 = yxbVar.n();
                            abnpVarN5.t();
                            yxb yxbVar3 = (yxb) abnpVarN5.b;
                            yxt yxtVar8 = (yxt) abnpVarN4.q();
                            yxtVar8.getClass();
                            yxbVar3.e = yxtVar8;
                            yxbVar3.b |= 1;
                            ((jfh) jfgVar3).m(abnpVarN5, yxc.CONNECT_SECONDARY_DISPLAY, yfqVar);
                            ynpVarListIterator2 = ynpVar2;
                        }
                    }
                    imaVar.N = SystemClock.elapsedRealtime();
                    ynp ynpVarListIterator3 = ((yfq) iucVar.K.values()).listIterator(0);
                    while (ynpVarListIterator3.hasNext()) {
                        iuu iuuVar3 = (iuu) ynpVarListIterator3.next();
                        iva ivaVar2 = iuuVar3.o;
                        if (imaVar.V == null) {
                            imaVar.V = Executors.newScheduledThreadPool(1);
                        }
                        ivaVar2.s(imaVar.V);
                        iuw iuwVarA = iuuVar3.o.a();
                        if (iuwVarA != null) {
                            iuuVar3.p.t(iuwVarA, UUID.fromString(iuuVar3.r.g().g));
                        }
                        if (acoh.a.gu().e() && iuuVar3.e()) {
                            ((ixu) imaVar.S.gu()).l(iuuVar3.o.f());
                        }
                    }
                    if (imaVar.bm()) {
                        ((ype) ima.b.l().ai(390)).u("Projection started and all WindowManagers are configured. Starting projection lifecycle service.");
                        imaVar.ba();
                    } else {
                        ((ype) ima.b.l().ai(388)).u("Projection started but not all WindowManagers are configured. Projection lifecycle service will be started when all WindowManagers are configured.");
                    }
                    imaVar.s = true;
                    if (ecw.i() && imaVar.t.getAndSet(false)) {
                        ((ype) ((ype) ima.b.f()).ai(389)).u("Applying pending day/night mode update.");
                        imaVar.aG();
                    }
                }
            }
            jqm jqmVar = joiVar.j;
            if (jqmVar != null) {
                if (!jqmVar.b.compareAndSet(false, true)) {
                    ((ype) ((ype) jqm.a.h()).ai((char) 2649)).u("Latency monitor already started.");
                    return;
                }
                int i8 = jqmVar.f;
                if (i8 > 0 && (i = jqmVar.e) > 0 && i8 >= i) {
                    ((ype) jqm.a.l().ai(2648)).u("Starting...");
                    joc jocVar = jqmVar.g;
                    synchronized (((job) jocVar).g) {
                        ((job) jocVar).k = false;
                    }
                    Handler handler = jqmVar.d;
                    handler.post(new joo(jqmVar, 5, null));
                    handler.postDelayed(new joo(jqmVar, 6, null), jqmVar.f);
                    return;
                }
                ((ype) ((ype) jqm.a.g()).ai(2647)).B("Invalid latency monitor parameters, probe: %d, report: %d", jqmVar.e, i8);
            }
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) joi.a.h()).p(e)).ai((char) 2448)).u("RemoteException in ::onServicesStarted");
            this.b.b();
        }
    }
}
