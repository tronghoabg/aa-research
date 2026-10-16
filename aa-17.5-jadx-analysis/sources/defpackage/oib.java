package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.auto.components.telemetry.TelemetryEvent;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class oib {
    private static final yph d = yph.c("GH.Telemetry");
    public final mkg b;
    public final Executor c;
    private mka e;
    private final Context h;
    private final jri i;
    private final boolean k;
    public final Object a = new Object();
    private final List f = new ArrayList();
    private final Handler j = new Handler(Looper.getMainLooper());
    private final Runnable g = new nwg(this, 4);

    public oib(Context context, Executor executor, jri jriVar, mkf mkfVar, boolean z) {
        this.h = context;
        this.c = executor;
        this.i = jriVar;
        this.b = mkfVar.a(context, new oia(this));
        this.k = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[Catch: all -> 0x0070, DONT_GENERATE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0013, B:10:0x0024, B:13:0x0029, B:24:0x0067, B:25:0x006c, B:16:0x0033, B:17:0x0037, B:19:0x003d, B:27:0x006e, B:23:0x004c, B:9:0x0017), top: B:32:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013 A[Catch: all -> 0x0070, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0013, B:10:0x0024, B:13:0x0029, B:24:0x0067, B:25:0x006c, B:16:0x0033, B:17:0x0037, B:19:0x003d, B:27:0x006e, B:23:0x004c, B:9:0x0017), top: B:32:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017 A[Catch: all -> 0x0070, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0013, B:10:0x0024, B:13:0x0029, B:24:0x0067, B:25:0x006c, B:16:0x0033, B:17:0x0037, B:19:0x003d, B:27:0x006e, B:23:0x004c, B:9:0x0017), top: B:32:0x0005, inners: #1 }] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean c(com.google.android.apps.auto.components.telemetry.TelemetryEvent r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            if (r5 == 0) goto La
            java.util.List r1 = r4.f     // Catch: java.lang.Throwable -> L70
            r1.add(r5)     // Catch: java.lang.Throwable -> L70
        La:
            mkg r5 = r4.b     // Catch: java.lang.Throwable -> L70
            r1 = r5
            qjt r1 = (defpackage.qjt) r1     // Catch: java.lang.Throwable -> L70
            boolean r1 = r1.b     // Catch: java.lang.Throwable -> L70
            if (r1 != 0) goto L17
            r5.a()     // Catch: java.lang.Throwable -> L70
            goto L24
        L17:
            android.os.Handler r5 = r4.j     // Catch: java.lang.Throwable -> L70
            java.lang.Runnable r1 = r4.g     // Catch: java.lang.Throwable -> L70
            r5.removeCallbacks(r1)     // Catch: java.lang.Throwable -> L70
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            r5.postDelayed(r1, r2)     // Catch: java.lang.Throwable -> L70
        L24:
            mka r5 = r4.e     // Catch: java.lang.Throwable -> L70
            r1 = 0
            if (r5 == 0) goto L6e
            java.util.List r5 = r4.f     // Catch: android.os.RemoteException -> L4b java.lang.Throwable -> L70
            r5.size()     // Catch: android.os.RemoteException -> L4b java.lang.Throwable -> L70
            boolean r2 = r4.k     // Catch: android.os.RemoteException -> L4b java.lang.Throwable -> L70
            if (r2 == 0) goto L33
            goto L67
        L33:
            java.util.Iterator r5 = r5.iterator()     // Catch: android.os.RemoteException -> L4b java.lang.Throwable -> L70
        L37:
            boolean r2 = r5.hasNext()     // Catch: android.os.RemoteException -> L4b java.lang.Throwable -> L70
            if (r2 == 0) goto L49
            java.lang.Object r2 = r5.next()     // Catch: android.os.RemoteException -> L4b java.lang.Throwable -> L70
            com.google.android.apps.auto.components.telemetry.TelemetryEvent r2 = (com.google.android.apps.auto.components.telemetry.TelemetryEvent) r2     // Catch: android.os.RemoteException -> L4b java.lang.Throwable -> L70
            mka r3 = r4.e     // Catch: android.os.RemoteException -> L4b java.lang.Throwable -> L70
            r3.e(r2)     // Catch: android.os.RemoteException -> L4b java.lang.Throwable -> L70
            goto L37
        L49:
            r1 = 1
            goto L67
        L4b:
            r5 = move-exception
            yph r2 = defpackage.oib.d     // Catch: java.lang.Throwable -> L70
            yop r2 = r2.g()     // Catch: java.lang.Throwable -> L70
            ype r2 = (defpackage.ype) r2     // Catch: java.lang.Throwable -> L70
            yop r5 = r2.p(r5)     // Catch: java.lang.Throwable -> L70
            ype r5 = (defpackage.ype) r5     // Catch: java.lang.Throwable -> L70
            r2 = 5950(0x173e, float:8.338E-42)
            yop r5 = r5.ai(r2)     // Catch: java.lang.Throwable -> L70
            ype r5 = (defpackage.ype) r5     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = "Failed to log. Will drop events on the floor."
            r5.u(r2)     // Catch: java.lang.Throwable -> L70
        L67:
            java.util.List r4 = r4.f     // Catch: java.lang.Throwable -> L70
            r4.clear()     // Catch: java.lang.Throwable -> L70
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
            return r1
        L6e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
            return r1
        L70:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oib.c(com.google.android.apps.auto.components.telemetry.TelemetryEvent):boolean");
    }

    public final void a(mka mkaVar) {
        synchronized (this.a) {
            this.e = mkaVar;
            if (mkaVar == null) {
                return;
            }
            c(null);
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean b(TelemetryEvent telemetryEvent) throws PackageManager.NameNotFoundException {
        ComponentName componentNameUnflattenFromString;
        yxc yxcVar;
        yxc yxcVar2;
        ljy ljyVar;
        abnp abnpVarK = telemetryEvent.b.K();
        jri jriVar = this.i;
        jri jriVar2 = jri.b;
        if (jriVar == jriVar2 && (ljyVar = (ljy) mki.a.j(ljy.class)) != null) {
            boolean zK = ljyVar.k();
            abnpVarK.t();
            yxb yxbVar = (yxb) abnpVarK.b;
            yxbVar.b |= 33554432;
            yxbVar.z = zK;
        }
        if (jriVar == jriVar2) {
            abnpVarK.t();
            yxb yxbVar2 = (yxb) abnpVarK.b;
            yxbVar2.b |= 67108864;
            yxbVar2.A = 1;
        } else {
            abnpVarK.t();
            yxb yxbVar3 = (yxb) abnpVarK.b;
            yxbVar3.b |= 67108864;
            yxbVar3.A = 0;
        }
        mki mkiVar = mki.a;
        lzj lzjVar = mkiVar == null ? null : (lzj) mkiVar.j(lzj.class);
        if (lzjVar != null) {
            boolean z = lzjVar.e().c().a == 1;
            abnpVarK.t();
            yxb yxbVar4 = (yxb) abnpVarK.b;
            yxbVar4.c |= 16384;
            yxbVar4.N = z;
        }
        if (jri.a() && ((yxcVar = telemetryEvent.a) == (yxcVar2 = yxc.UI) || yxcVar == yxc.NON_UI)) {
            yph yphVar = mpd.a;
            mqc mqcVarF = ((mpd) mki.a.i(mpd.class)).f();
            if (mqcVarF != null) {
                if (telemetryEvent.a == yxcVar2) {
                    zab zabVar = ((yxb) abnpVarK.b).o;
                    if (zabVar == null) {
                        zabVar = zab.a;
                    }
                    abnp abnpVarK2 = zabVar.K();
                    String string = mqcVarF.a().toString();
                    abnpVarK2.t();
                    zab zabVar2 = (zab) abnpVarK2.b;
                    string.getClass();
                    zabVar2.b |= 4194304;
                    zabVar2.B = string;
                    zab zabVar3 = (zab) abnpVarK2.q();
                    abnpVarK.t();
                    yxb yxbVar5 = (yxb) abnpVarK.b;
                    zabVar3.getClass();
                    yxbVar5.o = zabVar3;
                    yxbVar5.b |= 4096;
                } else {
                    yyz yyzVar = ((yxb) abnpVarK.b).p;
                    if (yyzVar == null) {
                        yyzVar = yyz.a;
                    }
                    abnp abnpVarK3 = yyzVar.K();
                    String string2 = mqcVarF.a().toString();
                    abnpVarK3.t();
                    yyz yyzVar2 = (yyz) abnpVarK3.b;
                    string2.getClass();
                    yyzVar2.b |= 524288;
                    yyzVar2.r = string2;
                    yyz yyzVar3 = (yyz) abnpVarK3.q();
                    abnpVarK.t();
                    yxb yxbVar6 = (yxb) abnpVarK.b;
                    yyzVar3.getClass();
                    yxbVar6.p = yyzVar3;
                    yxbVar6.b |= 8192;
                }
            }
        }
        if (telemetryEvent.a == yxc.UI) {
            zab zabVar4 = telemetryEvent.b.o;
            if (zabVar4 == null) {
                zabVar4 = zab.a;
            }
            if ((zabVar4.b & 16384) != 0 && (zabVar4.c & 2) == 0 && (componentNameUnflattenFromString = ComponentName.unflattenFromString(zabVar4.r)) != null) {
                try {
                    PackageInfo packageInfo = this.h.getPackageManager().getPackageInfo(componentNameUnflattenFromString.getPackageName(), 0);
                    zab zabVar5 = ((yxb) abnpVarK.b).o;
                    if (zabVar5 == null) {
                        zabVar5 = zab.a;
                    }
                    abnp abnpVarK4 = zabVar5.K();
                    long j = packageInfo.versionCode;
                    abnpVarK4.t();
                    zab zabVar6 = (zab) abnpVarK4.b;
                    zabVar6.c |= 2;
                    zabVar6.I = j;
                    zab zabVar7 = (zab) abnpVarK4.q();
                    abnpVarK.t();
                    yxb yxbVar7 = (yxb) abnpVarK.b;
                    zabVar7.getClass();
                    yxbVar7.o = zabVar7;
                    yxbVar7.b |= 4096;
                } catch (PackageManager.NameNotFoundException unused) {
                    ((ype) d.l().ai((char) 5949)).y("Package info not found for %s", componentNameUnflattenFromString);
                }
            }
        }
        telemetryEvent.b = (yxb) abnpVarK.q();
        return c(telemetryEvent);
    }
}
