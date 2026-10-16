package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.RemoteException;
import com.google.android.apps.auto.sdk.nav.state.CarInstrumentClusterConfig;
import com.google.android.apps.auto.sdk.nav.state.TurnEvent;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.io.PrintWriter;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class lzp implements lzj, lzs, mnd {
    public static final yph a = yph.c("GH.NavClientManager");
    public Context c;
    public lzt d;
    public CarInstrumentClusterConfig e;
    public final eqj g;
    public rog h;
    public final lws i;
    private final lhg j;
    private final eqm l;
    private final eqj m;
    private final ydx n;
    private final ajmd o;
    private final ajmd p;
    public boolean b = false;
    private final lzr k = new lzr();
    public final eqm f = new eqm();

    public lzp(lws lwsVar, lhg lhgVar) {
        eqm eqmVar = new eqm(null);
        this.l = eqmVar;
        int i = yfq.d;
        yfq yfqVar = yls.a;
        afco afcoVar = tby.a;
        this.g = new eqm(yfqVar);
        this.m = eqy.c(eqmVar, new mcm(this, 1));
        this.n = new ydx(15);
        this.p = new ajmd(this, null);
        this.o = new ajmd(this, null);
        this.i = lwsVar;
        this.j = lhgVar;
    }

    private static void p(yzy yzyVar) {
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.NAVIGATION_CLIENT_MANAGER, yzyVar).l());
    }

    @Override // defpackage.lzj
    public final eqj a() {
        return this.f;
    }

    @Override // defpackage.lzj
    public final eqj b() {
        return this.m;
    }

    @Override // defpackage.lhg
    public final void c() {
        wer.c();
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 4527)).u("start()");
        woy.N(!this.b);
        this.b = true;
        this.c = mki.a.c;
        this.j.c();
        if (kio.b().r()) {
            ((ype) yphVar.l().ai((char) 4511)).u("asyncLoadInstrumentClusterConfig");
            try {
                mki.a.f();
                rog rogVarE = oni.e(kio.b().e());
                this.h = rogVarE;
                if (rogVarE != null) {
                    rogVarE.a();
                    ((ype) yphVar.l().ai(4515)).u("Registering for nav status listener");
                    rog rogVar = this.h;
                    ajmd ajmdVar = this.o;
                    if (rogVar.h == null) {
                        rogVar.h = new qxl(rogVar);
                        try {
                            rogVar.a.t(rogVar.h);
                        } catch (RemoteException e) {
                            olm.h(e);
                        } catch (IllegalStateException e2) {
                            olm.f(e2);
                        }
                    }
                    rogVar.i = ajmdVar;
                } else {
                    ((ype) ((ype) yphVar.g()).ai(4512)).u("Unable to get CarNavigationStatusManager to retrieve HU config");
                    l();
                }
            } catch (qrz e3) {
                ((ype) ((ype) ((ype) a.h()).p(e3)).ai((char) 4513)).u("Error while getting HU navigation status configuration");
                l();
            } catch (qsa unused) {
                l();
            }
        } else {
            l();
        }
        mnc.a().b(mnb.o, this);
    }

    @Override // defpackage.lhg
    public final void d() {
        wer.c();
        if (this.b || !acur.n()) {
            woy.N(this.b);
            m();
            mnc.a().d(mnb.o);
            this.b = false;
            this.c = null;
            this.j.d();
        }
    }

    @Override // defpackage.lzj
    public final lzh e() {
        return this.k.a();
    }

    @Override // defpackage.lzj
    public final CarInstrumentClusterConfig f() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lzj
    public final void g(ComponentName componentName) {
        wer.c();
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 4524)).y("maybeConnectToNavComponent(%s)", componentName);
        k(componentName);
        if (this.d == null) {
            ((ype) ((ype) yphVar.f()).ai((char) 4525)).y("No corresponding nav client source for nav package: %s", componentName.getPackageName());
            return;
        }
        if (acxa.aM() || !this.d.a()) {
            return;
        }
        ((ype) yphVar.l().ai((char) 4529)).y("storeDefaultIfChanging(%s)", componentName);
        lha lhaVarA = lgv.a();
        mpz mpzVar = mpz.b;
        ComponentName componentNameA = lhaVarA.a(mpzVar);
        if (componentNameA == null || !componentNameA.getPackageName().equals(componentName.getPackageName())) {
            Stream streamFilter = Collection.EL.stream(lem.a().b(kio.b().e(), nyj.a())).filter(new lye(3));
            int i = yfq.d;
            Collector collector = ycm.a;
            yfq yfqVar = (yfq) streamFilter.collect(collector);
            if (yfqVar.size() > 1) {
                yfq yfqVar2 = (yfq) Collection.EL.stream(yfqVar).map(new lyd(6)).filter(new lou(componentName, 10)).collect(collector);
                if (yfqVar2.isEmpty()) {
                    return;
                }
                lgv.a().f(mpzVar, (ComponentName) yfqVar2.get(0));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        yfq yfqVarO;
        if (this.e == null) {
            printWriter.println("No Cluster config.");
        } else {
            printWriter.printf("Cluster Config: ", new Object[0]);
            printWriter.printf("Image Size: %dx%d ", Integer.valueOf(this.e.b), Integer.valueOf(this.e.c));
            printWriter.printf("Depth: %d\n", Integer.valueOf(this.e.d));
        }
        if (i()) {
            lzh lzhVarE = e();
            printWriter.printf("Client: %s\n", lzhVarE.a());
            printWriter.printf("Navigation Status: %d\n", Integer.valueOf(lzhVarE.c().a));
            TurnEvent turnEventD = lzhVarE.d();
            printWriter.printf("Turn Event: Type=%d, Side=%d, Angle=%d, Number=%d, Unit=%d", Integer.valueOf(turnEventD.a), Integer.valueOf(turnEventD.c), Integer.valueOf(turnEventD.d), Integer.valueOf(turnEventD.e), Integer.valueOf(turnEventD.j));
            printWriter.printf(", Road: %s, Seconds=%d, Distance=%d m, Display=%d", turnEventD.q, Integer.valueOf(turnEventD.h), Integer.valueOf(turnEventD.g), Integer.valueOf(turnEventD.i));
            printWriter.printf("\nManeuver: Type=%d\n", Integer.valueOf(turnEventD.k));
        } else {
            printWriter.println("Not connected to any client.");
            printWriter.printf("Last connection: %s\n", this.d);
        }
        synchronized (this) {
            yfqVarO = yfq.o(this.n);
        }
        if (yfqVarO.isEmpty()) {
            return;
        }
        mnf mnfVarL = mnk.l();
        mng mngVarA = mnh.a();
        mngVarA.a = "Component";
        mngVarA.b();
        mngVarA.c('|');
        mngVarA.d(true);
        mnfVarL.b(mngVarA.a());
        mng mngVarA2 = mnh.a();
        mngVarA2.a = "Action";
        mngVarA2.b();
        mngVarA2.c('|');
        mngVarA2.d(true);
        mnfVarL.b(mngVarA2.a());
        mng mngVarA3 = mnh.a();
        mngVarA3.a = "Time";
        mngVarA3.b();
        mngVarA3.c('|');
        mngVarA3.d(true);
        mnfVarL.b(mngVarA3.a());
        int size = yfqVarO.size();
        for (int i = 0; i < size; i++) {
            lzo lzoVar = (lzo) yfqVarO.get(i);
            mnfVarL.c(lzoVar.a, lzoVar.b, lzoVar.c);
        }
        mnfVarL.a().m(printWriter);
    }

    @Override // defpackage.lzj
    public final boolean i() {
        return this.k.c();
    }

    public final synchronized void j(lzo lzoVar) {
        this.n.add(lzoVar);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, lzs] */
    final void k(ComponentName componentName) {
        ComponentName componentName2;
        lzw lzwVar;
        ComponentName componentName3;
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 4516)).y("connectToComponent(%s)", componentName);
        j(lzo.a(componentName, "Starting connection attempt"));
        String packageName = componentName.getPackageName();
        yfq yfqVar = map.a;
        Iterator<ResolveInfo> it = mki.a.c.getPackageManager().queryIntentServices(new Intent("android.intent.action.MAIN").addCategory("com.google.android.car.category.NAVIGATION_PROVIDER"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                componentName2 = null;
                break;
            }
            ResolveInfo next = it.next();
            if (next.serviceInfo.packageName.equals(packageName)) {
                componentName2 = new ComponentName(next.serviceInfo.packageName, next.serviceInfo.name);
                break;
            }
        }
        if (componentName2 == null) {
            componentName3 = componentName;
            lzwVar = null;
        } else {
            ?? r10 = this.p.a;
            lzp lzpVar = (lzp) r10;
            componentName3 = componentName;
            lzwVar = new lzw(lzpVar.c, lzpVar.i, componentName3, componentName2, r10);
        }
        lzt lztVar = this.d;
        if (lztVar != null && lzwVar != null) {
            if (Objects.equals(((lzw) lztVar).b, lzwVar.b)) {
                ((ype) ((ype) yphVar.f()).ai((char) 4519)).y("Trying to connect to same nav component. Ignoring: %s", componentName3.getShortClassName());
                j(lzo.a(componentName3, "Already connected, nothing to do"));
                return;
            }
        }
        m();
        if (lzwVar == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 4518)).y("No Navigation Client Source for %s", componentName3);
            p(yzy.pz);
            j(lzo.a(componentName3, "No NavigationClientSource"));
        } else if (!lzwVar.a()) {
            ((ype) ((ype) yphVar.g()).ai((char) 4517)).y("Failed binding to component: %s", componentName3);
            p(yzy.pA);
            j(lzo.a(componentName3, "Unable to bind"));
        } else {
            eqm eqmVar = this.f;
            ajnt ajntVar = new ajnt((char[]) null);
            ajntVar.k(lzwVar.b);
            ajntVar.a = 2;
            eqmVar.m(ajntVar.j());
            this.d = lzwVar;
        }
    }

    public final void l() {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 4520)).u("NavigationClientManagerImpl connectToDefaultNavClientSource");
        ComponentName componentNameA = map.a(kio.b().e(), true);
        if (componentNameA != null) {
            k(componentNameA);
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 4521)).u("No navigation component to connect to.");
            p(yzy.py);
        }
    }

    final void m() {
        wer.c();
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 4522)).u("disconnectFromCurrentNavProvider()");
        lzt lztVar = this.d;
        if (lztVar == null) {
            ((ype) yphVar.l().ai((char) 4523)).u("Trying to unbind a null connection. Ignoring");
            return;
        }
        o(null);
        lzt lztVar2 = this.d;
        synchronized (((lzw) lztVar2).d) {
            ((lzw) lztVar2).c(((lzw) lztVar2).e);
        }
        ComponentName componentName = ((lzw) lztVar).b;
        this.d = null;
        eqm eqmVar = this.f;
        ajnt ajntVar = new ajnt((char[]) null);
        ajntVar.k(componentName);
        ajntVar.a = 1;
        eqmVar.m(ajntVar.j());
        if (acye.c()) {
            mab.c().d();
        } else {
            mlq.e().h(yzr.NAV_NOTIFICATION_HERO);
            mlq.e().h(yzr.NAV_NOTIFICATION_NORMAL);
        }
    }

    @Override // defpackage.lzs
    public final void n(ComponentName componentName, String str) {
        wer.c();
        j(lzo.a(componentName, str));
    }

    public final void o(lzh lzhVar) {
        ((ype) ((ype) a.f()).ai((char) 4526)).y("setNavigationClient(%s)", lzhVar);
        this.k.b(lzhVar);
        this.l.m(lzhVar);
    }
}
