package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class tnq implements tpm, uyl {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/MapContainer");
    public final gjv A;
    public final erb B;
    private final uet C;
    private final ackk D;
    private boolean E;
    private final ajlp H;
    public final tmb b;
    public final ppo c;
    public final ugq d;
    public final aezk e;
    public final ackk f;
    public final tpa g;
    public final ackk h;
    public final ackk i;
    public final ackk j;
    public final ackk k;
    public final tnv q;
    public final ums r;
    public final ScheduledExecutorService s;
    public final Executor t;
    public final DisplayMetrics u;
    public final tzt v;
    public final uaj w;
    public final plq x;
    public final adoi y;
    public final gjv z;
    public final zhc l = new zhc();
    final List m = new ArrayList();
    boolean n = false;
    public volatile boolean o = false;
    public boolean p = false;
    private Set F = new HashSet();
    private final Object G = new Object();

    public tnq(ackk ackkVar, tnv tnvVar, ackk ackkVar2, ackk ackkVar3, tzt tztVar, uet uetVar, ackk ackkVar4, gjv gjvVar, ackk ackkVar5, ums umsVar, erb erbVar, tmb tmbVar, ppo ppoVar, ajlp ajlpVar, ugq ugqVar, ScheduledExecutorService scheduledExecutorService, Executor executor, aezk aezkVar, ackk ackkVar6, tpa tpaVar, adoi adoiVar, DisplayMetrics displayMetrics, uaj uajVar, plq plqVar) {
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        this.h = ackkVar;
        this.q = tnvVar;
        this.i = ackkVar2;
        this.j = ackkVar3;
        this.v = tztVar;
        this.k = ackkVar4;
        this.z = gjvVar;
        this.B = erbVar;
        this.b = tmbVar;
        this.c = ppoVar;
        this.d = ugqVar;
        this.C = uetVar;
        this.D = ackkVar5;
        this.r = umsVar;
        this.s = scheduledExecutorService;
        this.t = executor;
        this.H = ajlpVar;
        this.e = aezkVar;
        this.f = ackkVar6;
        this.g = tpaVar;
        this.A = new gjv((tpd) tpaVar);
        this.y = adoiVar;
        this.u = displayMetrics;
        this.w = uajVar;
        this.x = plqVar;
    }

    @ResultIgnorabilityUnspecified
    public final View a() {
        return ((tno) this.h.a()).d().a();
    }

    @ResultIgnorabilityUnspecified
    public final tnn c() {
        return ((tno) this.h.a()).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0292 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object, tnn, uiv] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object, java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d() {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnq.d():void");
    }

    public final void e() {
        txu txuVar = (txu) c();
        ((prr) txuVar.am.a).b();
        tzd tzdVar = txuVar.Q;
        synchronized (tzdVar) {
            tzdVar.d = true;
        }
        txl txlVar = txuVar.J;
        synchronized (((txn) txlVar).c) {
            ((txn) txlVar).q = true;
            Iterator it = ((txn) txlVar).e.iterator();
            while (it.hasNext()) {
                ((ufs) it.next()).x();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences$OnSharedPreferenceChangeListener, tnn, uiu] */
    public final void f() {
        ygr ygrVarN;
        if (this.l.isDone()) {
            ?? C = c();
            try {
                if (((txu) C).I != null) {
                    plq plqVar = ((txu) C).ab;
                    if (plqVar.a().g(((txu) C).I)) {
                        plqVar.a().f(((txu) C).I);
                    }
                }
            } catch (RuntimeException e) {
                ((ynz) ((ynz) txu.a.a(uys.a).p(e)).ai((char) 9187)).u("Failed to remove legal country observer");
            }
            txu txuVar = (txu) C;
            txuVar.Z.e(txuVar.ao);
            qrx qrxVar = txuVar.af;
            qrxVar.e(txuVar.r);
            qrxVar.e(txuVar.s);
            ulc ulcVar = txuVar.w;
            txe txeVar = ulcVar.f;
            tqg tqgVar = ulcVar.d.b;
            txc txcVar = txeVar.c;
            synchronized (txcVar) {
                Set set = txcVar.g;
                if (set.contains(tqgVar)) {
                    set.remove(tqgVar);
                } else if (txcVar.e != null) {
                    Set set2 = txcVar.f;
                    if (set2.contains(tqgVar)) {
                        txcVar.e.p(tqgVar);
                        set2.remove(tqgVar);
                    }
                }
            }
            ulcVar.e = true;
            txuVar.M.e();
            uiw uiwVar = txuVar.l;
            uiwVar.i(C);
            uiwVar.e();
            txuVar.m.e(C);
            uts utsVar = txuVar.i;
            if (utsVar != null) {
                utsVar.d();
            }
            txl txlVar = txuVar.J;
            synchronized (((txn) txlVar).c) {
                ((txn) txlVar).j();
            }
            txuVar.ai.p();
            txe txeVar2 = txuVar.t;
            txeVar2.b.g(txeVar2.g);
            txc txcVar2 = txeVar2.c;
            synchronized (txcVar2) {
                Set set3 = txcVar2.d;
                ygrVarN = ygr.n(set3);
                set3.clear();
            }
            yno it = ygrVarN.iterator();
            while (it.hasNext()) {
                synchronized (((gms) it.next()).a) {
                }
            }
            txuVar.g.k();
            twm twmVar = txuVar.R;
            psb.UI_THREAD.h();
            Runnable runnable = twmVar.f;
            if (runnable != null) {
                twmVar.l.j(runnable);
                twmVar.f = null;
            }
            twmVar.h.a = true;
            uvg uvgVar = txuVar.ac;
            ThreadLocal threadLocal = uvr.i;
            if (threadLocal.get() != uvr.b) {
                ((ynz) ((ynz) uvr.j.h()).ai((char) 9689)).y("Shutting down renderer while it's not idle - phase is %s", threadLocal.get());
            }
            threadLocal.set(uvr.a);
            synchronized (uvgVar) {
                int i = yfq.d;
                uvgVar.e = yls.a;
            }
            utk utkVar = uvgVar.I;
            while (true) {
                uvj uvjVarA = utkVar.a();
                if (uvjVarA == null) {
                    break;
                } else {
                    uvjVarA.b();
                }
            }
            umn umnVar = txuVar.f;
            typ typVar = txuVar.u;
            umnVar.e(typVar);
            umnVar.e(txuVar.s);
            umnVar.e(txuVar.r);
            umnVar.d(true);
            txuVar.K = false;
            synchronized (txuVar.B) {
                synchronized (typVar.f) {
                    typVar.e.d();
                }
            }
        }
        List list = this.m;
        synchronized (list) {
            list.clear();
        }
    }

    public final void g() {
        tnn tnnVarC = c();
        vaq.d();
        ((txu) tnnVarC).p.execute(new tvv(tnnVarC, 14));
        try {
            ((txu) tnnVarC).S.b();
        } catch (RuntimeException e) {
            ((ynz) ((ynz) txu.a.a(uys.a).p(e)).ai(9190)).u("Failure in zoomTableManager.onParametersChanged");
        }
        try {
            ((txu) tnnVarC).l.h();
        } catch (RuntimeException e2) {
            ((ynz) ((ynz) txu.a.a(uys.a).p(e2)).ai(9189)).u("Failure in globalStyleTables.onParametersChanged");
        }
        try {
            ((txu) tnnVarC).n.e();
        } catch (RuntimeException e3) {
            ((ynz) ((ynz) txu.a.a(uys.a).p(e3)).ai(9188)).u("Failure in resourceManager.onParametersChanged");
        }
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }

    public final void h() {
        qay qayVar;
        woy.Z(!this.E);
        this.E = true;
        d();
        tnn tnnVarC = c();
        vaq.d();
        ((txu) tnnVarC).c = true;
        umn umnVar = ((txu) tnnVarC).f;
        tsl tslVar = umnVar.w;
        tslVar.getClass();
        tslVar.c(false);
        uts utsVar = umnVar.g;
        utsVar.getClass();
        utsVar.e();
        tun tunVar = umnVar.s;
        if (tunVar != null && (qayVar = umnVar.h) != null) {
            qayVar.a(tunVar);
        }
        ncp ncpVar = umnVar.y;
        if (ncpVar != null) {
            List list = ((qau) ncpVar.b).k;
            synchronized (list) {
                if (!list.contains(ncpVar)) {
                    list.add(ncpVar);
                }
            }
        }
        synchronized (((txu) tnnVarC).B) {
            txr txrVar = ((txu) tnnVarC).E;
            if (txrVar != null) {
                ((txu) tnnVarC).x(txrVar);
            } else {
                ((txu) tnnVarC).x(((txu) tnnVarC).C);
            }
        }
        txu txuVar = (txu) tnnVarC;
        txuVar.Y.getClass();
        txl txlVar = txuVar.J;
        txn txnVar = (txn) txlVar;
        synchronized (txnVar.c) {
            Iterator it = ((txn) txlVar).e.iterator();
            while (it.hasNext()) {
                ((ufs) it.next()).e.o(true);
            }
        }
        ucf ucfVar = txuVar.g;
        ucfVar.E(txuVar.ac, txuVar.ad);
        ucfVar.v();
        twm twmVar = txuVar.R;
        psb.UI_THREAD.h();
        twmVar.h.a(twmVar);
        if (txuVar.K) {
            aezk aezkVar = txuVar.P;
            txlVar.h(((qsb) aezkVar.a()).o(txuVar.b), ((qsb) aezkVar.a()).m(txuVar.b, txuVar.q()));
            txuVar.v();
        }
        uzz uzzVar = txnVar.f.a;
        txt txtVar = new txt();
        tvv tvvVar = new tvv(tnnVarC, 16);
        txtVar.b(new saq(tnnVarC, new sbj(tnnVarC, tvvVar, 20), uzzVar, txtVar, 3, (byte[]) null));
        zfq zfqVar = zfq.a;
        uzzVar.d(txtVar, zfqVar);
        if (txuVar.A()) {
            if (!txnVar.l()) {
                throw new UnsupportedOperationException();
            }
            uzz uzzVar2 = txnVar.h.a;
            txt txtVar2 = new txt();
            txtVar2.b(new saq(tnnVarC, tvvVar, uzzVar2, txtVar2, 4, (byte[]) null));
            uzzVar2.d(txtVar2, zfqVar);
        }
        zgt zgtVar = txuVar.p;
        uiw uiwVar = txuVar.l;
        uiwVar.getClass();
        zgtVar.schedule(new tvv(uiwVar, 17), 10L, TimeUnit.SECONDS);
        uaj uajVar = this.w;
        if (uajVar != null) {
            uajVar.m();
            ajlp ajlpVar = this.H;
            synchronized (ajlpVar) {
                ajlpVar.a++;
            }
            ajlpVar.l();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void i() {
        qay qayVar;
        erb erbVar;
        woy.Z(this.E);
        r().o();
        if (this.w != null) {
            ajlp ajlpVar = this.H;
            synchronized (ajlpVar) {
                woy.Z(ajlpVar.a > 0);
                ajlpVar.a--;
            }
            ajlpVar.l();
        }
        txu txuVar = (txu) c();
        txuVar.Y.getClass();
        uvg uvgVar = txuVar.ac;
        txuVar.l.f();
        txl txlVar = txuVar.J;
        synchronized (((txn) txlVar).c) {
            Iterator it = ((txn) txlVar).e.iterator();
            while (it.hasNext()) {
                ufs ufsVar = (ufs) it.next();
                ufsVar.e.o(false);
                if (ufsVar.b.equals(abgl.GMM_VECTOR_BASE) && (erbVar = ufsVar.T) != null) {
                    long j = ufsVar.o;
                    if (j >= 0 && ufsVar.p - j >= 5000) {
                    }
                }
                ufsVar.t = 0L;
            }
        }
        umn umnVar = txuVar.f;
        uts utsVar = umnVar.g;
        utsVar.getClass();
        utsVar.f();
        tsl tslVar = umnVar.w;
        tslVar.getClass();
        tslVar.c(true);
        tun tunVar = umnVar.s;
        if (tunVar != null && (qayVar = umnVar.h) != null) {
            qayVar.j.remove(tunVar);
        }
        umnVar.v.c(new tuh(true));
        ncp ncpVar = umnVar.y;
        if (ncpVar != null) {
            List list = ((qau) ncpVar.b).k;
            synchronized (list) {
                list.remove(ncpVar);
            }
            ncpVar.a.execute(new shd(ncpVar, 14));
        }
        txuVar.c = false;
        this.E = false;
    }

    public final void j(String str) {
        List list = this.m;
        synchronized (list) {
            if (!this.n) {
                list.add(new sbj(this, str, 14));
                return;
            }
            txu txuVar = (txu) c();
            ufj ufjVar = (ufj) txuVar.x.remove(str);
            if (ufjVar != null) {
                txuVar.w(ufjVar);
            }
        }
    }

    public final void k(uda udaVar, uda udaVar2) {
        List list = this.m;
        synchronized (list) {
            if (this.n) {
                c().c(udaVar, udaVar2);
            } else {
                list.add(new rdz(this, udaVar, udaVar2, 6, (byte[]) null));
            }
        }
    }

    @Override // defpackage.tpm
    public final void l(boolean z) {
        throw null;
    }

    public final void m(boolean z) {
        tnn tnnVarC = c();
        vaq.d();
        ((txu) tnnVarC).s();
        synchronized (((txu) tnnVarC).B) {
            txr txrVar = ((txu) tnnVarC).E;
            if (txrVar == null) {
                txrVar = ((txu) tnnVarC).C;
            }
            uly ulyVar = txrVar.a;
            if (z == ulyVar.c) {
                return;
            }
            txq txqVar = new txq(txrVar);
            txqVar.b(ulyVar.b(z));
            ((txu) tnnVarC).x(txqVar.a());
            if (!((txu) tnnVarC).C()) {
                tns tnsVar = tns.TERRAIN;
                if (((txu) tnnVarC).i(tnsVar)) {
                    ufs ufsVarE = ((txu) tnnVarC).j.e(z ? abgl.GMM_TERRAIN_DARK : abgl.GMM_TERRAIN, ((txu) tnnVarC).a());
                    txl txlVar = ((txu) tnnVarC).J;
                    Map map = ((txu) tnnVarC).y;
                    ufs ufsVar = (ufs) map.get(tnsVar);
                    ufsVar.getClass();
                    ((txn) txlVar).o(ufsVar, ufsVarE);
                    map.put(tnsVar, ufsVarE);
                }
            }
        }
    }

    public final void n(tns tnsVar, boolean z) {
        c().f(tnsVar, z);
    }

    public final void o() {
        tnn tnnVarC = c();
        txu txuVar = (txu) tnnVarC;
        txuVar.s();
        txuVar.r();
        txuVar.F();
        synchronized (txuVar.B) {
            txr txrVar = ((txu) tnnVarC).E;
            if (txrVar == null) {
                txrVar = ((txu) tnnVarC).C;
            }
            txq txqVar = new txq(txrVar);
            txqVar.b(ulx.a.a(txrVar.a.c));
            ((txu) tnnVarC).x(txqVar.a());
        }
    }

    public final void p() {
        c().g();
    }

    public final void q(String str, ufj ufjVar) {
        List list = this.m;
        synchronized (list) {
            if (!this.n) {
                list.add(new rdz((Object) this, str, (Object) ufjVar, 5));
                return;
            }
            txu txuVar = (txu) c();
            Map map = txuVar.x;
            ufj ufjVar2 = (ufj) map.get(str);
            map.put(str, ufjVar);
            if (ufjVar2 != null) {
                txuVar.w(ufjVar2);
            }
            if (txuVar.K) {
                txuVar.J.e(ufjVar);
            }
        }
    }

    public final usy r() {
        return ((tno) this.h.a()).h();
    }
}
