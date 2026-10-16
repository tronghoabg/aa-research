package com.google.android.apps.auto.carservice.service.impl;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.carsetup.setup.UsbConnectionHelper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.acqa;
import defpackage.ebe;
import defpackage.ima;
import defpackage.ina;
import defpackage.iuu;
import defpackage.iya;
import defpackage.jbp;
import defpackage.jgw;
import defpackage.jkk;
import defpackage.jnh;
import defpackage.jnw;
import defpackage.joi;
import defpackage.jos;
import defpackage.jou;
import defpackage.jqj;
import defpackage.jqk;
import defpackage.qei;
import defpackage.sgk;
import defpackage.tez;
import defpackage.woy;
import defpackage.wub;
import defpackage.xgr;
import defpackage.xob;
import defpackage.yfq;
import defpackage.yfy;
import defpackage.ynp;
import defpackage.ype;
import defpackage.yph;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class GearheadCarStartupService extends Service {
    private static final yph b = yph.c("GH.CAR");
    HandlerThread a;
    private jqk c;
    private sgk d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str;
        String str2;
        String str3;
        jqk jqkVar = this.c;
        if (jqkVar != null) {
            jqj jqjVarA = jqkVar.a();
            boolean zC = acqa.c();
            if (strArr != null && strArr.length > 0 && Objects.equals(strArr[0], "screenshot")) {
                if (!zC) {
                    printWriter.println("Screenshot dump not allowed on this build.");
                    return;
                }
                printWriter.println("Triggering screenshot dump...");
                ima imaVar = jqjVarA.f;
                if (imaVar == null) {
                    printWriter.println("carServiceBinder is null cannot trigger screenshot dump.");
                    return;
                }
                yfy yfyVarW = imaVar.W();
                if (yfyVarW.isEmpty()) {
                    ((ype) ((ype) ima.b.f()).ai((char) 394)).u("No displays available to take screenshot");
                    return;
                }
                ynp ynpVarListIterator = ((yfq) yfyVarW.values()).listIterator(0);
                while (ynpVarListIterator.hasNext()) {
                    iuu iuuVar = (iuu) ynpVarListIterator.next();
                    jkk jkkVar = iuuVar.p;
                    if (jkkVar != null) {
                        ((ina) jkkVar).x(false, true);
                    } else {
                        ((ype) ((ype) ima.b.h()).ai((char) 393)).y("WindowManager is null for display %s", iuuVar);
                    }
                }
                return;
            }
            if (acqa.c()) {
                printWriter.println("Dumping BuildConfig flags for the CAR process");
                ebe.p(printWriter);
            }
            jou jouVar = (jou) jqjVarA.e;
            jos josVar = jouVar.h;
            jnh jnhVar = josVar == null ? null : josVar.a;
            if (jnhVar != null) {
                printWriter.printf("CarConnectionSessionManager - active session", new Object[0]);
                printWriter.printf("CarGalMonitor status - %s", jouVar.i == null ? "unset" : "set");
                joi joiVar = (joi) jnhVar;
                xob xobVar = joiVar.r;
                if (xobVar != null) {
                    Long lValueOf = Long.valueOf(joiVar.c);
                    Integer numValueOf = Integer.valueOf(joiVar.t.size());
                    if ((xobVar.b & 16384) != 0) {
                        xgr xgrVar = xobVar.q;
                        if (xgrVar == null) {
                            xgrVar = xgr.a;
                        }
                        str = xgrVar.c;
                    } else {
                        str = xobVar.d;
                    }
                    if ((xobVar.b & 16384) != 0) {
                        xgr xgrVar2 = xobVar.q;
                        if (xgrVar2 == null) {
                            xgrVar2 = xgr.a;
                        }
                        str2 = xgrVar2.d;
                    } else {
                        str2 = xobVar.e;
                    }
                    if ((xobVar.b & 16384) != 0) {
                        xgr xgrVar3 = xobVar.q;
                        if (xgrVar3 == null) {
                            xgrVar3 = xgr.a;
                        }
                        str3 = xgrVar3.e;
                    } else {
                        str3 = xobVar.f;
                    }
                    printWriter.printf("ProtocolManager available, session(%d), services(%d), make(%s), model(%s), year(%s)", lValueOf, numValueOf, str, str2, str3);
                } else {
                    printWriter.printf("ProtocolManager available, session(%d), services(%d), make(%s), model(%s), year(%s)", Long.valueOf(joiVar.c), Integer.valueOf(joiVar.t.size()), "<null>", "<null>", "<null>");
                }
                jbp jbpVar = joiVar.l;
                jbpVar.getClass();
                jbpVar.c(printWriter);
            } else {
                printWriter.printf("CarConnectionSessionManager - no active session", new Object[0]);
            }
            jqjVarA.f.au(printWriter);
            printWriter.println("Dumping logs for the CAR process");
            tez.c(printWriter);
        }
    }

    @Override // android.app.Service
    @ResultIgnorabilityUnspecified
    public final IBinder onBind(Intent intent) {
        ((ype) ((ype) b.f()).ai((char) 2596)).u("GearheadCarStartupService.onBind");
        return this.c;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jqk jqkVar = this.c;
        if (jqkVar != null) {
            jqj jqjVarA = jqkVar.a();
            woy.aa(jqjVarA.l, "not initialized");
            ima imaVar = jqjVarA.f;
            if (imaVar.bs() && jqj.q(jqjVarA.g) && !jqj.q(configuration)) {
                ((ype) ((ype) jqj.a.f()).ai((char) 2625)).u("Car mode exited [GearheadCarStartupService]");
                return;
            }
            Configuration configuration2 = jqjVarA.g;
            int iUpdateFrom = configuration2.updateFrom(configuration) & (((configuration2.uiMode ^ configuration.uiMode) & (-16)) != 0 ? -1 : -513);
            if (iUpdateFrom != 0 && ((-536874369) & iUpdateFrom) == 0) {
                ((ype) jqj.a.l().ai(2624)).K("Ignored config change %s, %d", configuration, iUpdateFrom);
                return;
            }
            Configuration configuration3 = new Configuration(configuration);
            configuration3.uiMode &= -16;
            configuration3.uiMode |= 3;
            imaVar.aE(configuration3, iUpdateFrom);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((ype) ((ype) b.f()).ai((char) 2597)).u("onCreate");
        UsbConnectionHelper.TrackedParcelFileDescriptor.c(this);
        this.d = UsbConnectionHelper.TrackedParcelFileDescriptor.d(this);
        jnw jnwVar = new jnw(this);
        HandlerThread handlerThread = new HandlerThread("CarService");
        this.a = handlerThread;
        handlerThread.start();
        this.c = new jqk(this, wub.L(new qei(this, jnwVar, new Handler(this.a.getLooper()), 1)));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ((ype) ((ype) b.f()).ai((char) 2599)).u("onDestroy");
        jqk jqkVar = this.c;
        if (jqkVar != null) {
            synchronized (jqkVar) {
                if (jqkVar.a) {
                    jqj jqjVarA = jqkVar.a();
                    ((ype) ((ype) jqj.a.f()).ai((char) 2633)).u("tearDown()");
                    woy.aa(Looper.myLooper() == Looper.getMainLooper(), "not on main thread");
                    iya.v();
                    jqjVarA.c.post(new jgw(jqjVarA, 12, null));
                    jqjVarA.k.a();
                    jqjVarA.j.d();
                    jqjVarA.i.d();
                } else {
                    jqkVar.b = true;
                }
            }
        }
        HandlerThread handlerThread = this.a;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        sgk sgkVar = this.d;
        if (sgkVar != null) {
            sgkVar.a();
        }
    }
}
