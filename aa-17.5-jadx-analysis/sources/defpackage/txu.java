package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.android.apps.gmm.systems.accounts.GmmAccount;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
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
public final class txu implements SharedPreferences.OnSharedPreferenceChangeListener, uiu, tnn, tyx, uiv {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/impl/PhoenixGoogleMap");
    private static final ygr ap = ygr.r(tns.TRAFFIC, tns.TRANSIT, tns.BICYCLING, tns.THREE_DIMENSIONAL);
    private static final abgl aq = abgl.GMM_VECTOR_BASE;
    public ufs A;
    public final Object B;
    public txr C;
    public final xyc D;
    public txr E;
    public ufs F;
    public final Object G;
    public ufs H;
    public vae I;
    public final txl J;
    public boolean K;
    public final AtomicBoolean L;
    public final tzt M;
    public final Context N;
    public final aezk O;
    public final aezk P;
    public final tzd Q;
    public final twm R;
    public final ukz S;
    public final aezk T;
    public boolean U;
    public final ums V;
    public volatile tnm W;
    public final ufz X;
    public uga Y;
    public final psj Z;
    private final txp aA;
    private volatile roc aB;
    private final erb aC;
    public final uaj aa;
    public final plq ab;
    public final uvg ac;
    public final usy ad;
    public final qrx ae;
    public final qrx af;
    public final nzj ag;
    public gjt ah;
    public final gjv ai;
    public ajmd aj;
    public final gjv ak;
    public final gjv al;
    public final gms am;
    public final gjv an;
    public final ykd ao;
    private final uod au;
    private final uxh av;
    private boolean ax;
    private final AtomicBoolean ay;
    private final aezk az;
    public String b;
    public boolean d;
    public final umn f;
    public final ucf g;
    public uts i;
    public final uft j;
    public final Resources k;
    public final uiw l;
    public final pyh m;
    public final upr n;
    public final Executor o;
    public final zgt p;
    public GmmAccount q;
    public final tvm r;
    public final txj s;
    public final txe t;
    public final typ u;
    public final twq v;
    public final ulc w;
    public boolean c = true;
    public boolean e = false;
    private final AtomicBoolean ar = new AtomicBoolean(false);
    private final AtomicBoolean as = new AtomicBoolean(false);
    private final Set at = new HashSet();
    public final List h = new ArrayList();
    public final Map x = new HashMap();
    public final Map y = new EnumMap(tns.class);
    public final Map z = new EnumMap(abgl.class);
    private final Map aw = new EnumMap(abgl.class);

    /* JADX WARN: Multi-variable type inference failed */
    public txu(String str, twq twqVar, gjv gjvVar, uvg uvgVar, tzt tztVar, usy usyVar, umn umnVar, Context context, aezk aezkVar, aezk aezkVar2, aezk aezkVar3, aezk aezkVar4, ums umsVar, ufz ufzVar, twm twmVar, txl txlVar, ucf ucfVar, uft uftVar, gjv gjvVar2, typ typVar, txe txeVar, txj txjVar, tvm tvmVar, ucm ucmVar, pkx pkxVar, erb erbVar, psj psjVar, qrx qrxVar, uiw uiwVar, pyh pyhVar, upr uprVar, gms gmsVar, Executor executor, zgt zgtVar, uod uodVar, ukz ukzVar, ulc ulcVar, gjv gjvVar3, ajmd ajmdVar, ufs ufsVar, uaj uajVar, boolean z, nzj nzjVar, plq plqVar) {
        Object obj = new Object();
        this.B = obj;
        this.ax = false;
        this.G = new Object();
        this.ay = new AtomicBoolean(false);
        new AtomicBoolean(false);
        this.L = new AtomicBoolean(false);
        this.U = false;
        this.ao = new ykd(this, null);
        this.b = str;
        this.aC = erbVar;
        this.ab = plqVar;
        this.Z = psjVar;
        this.af = qrxVar;
        this.l = uiwVar;
        this.m = pyhVar;
        this.n = uprVar;
        this.o = executor;
        this.p = zgtVar;
        this.au = uodVar;
        this.S = ukzVar;
        this.ai = gjvVar;
        this.ac = uvgVar;
        this.M = tztVar;
        this.ad = usyVar;
        this.f = umnVar;
        this.N = context;
        this.am = gmsVar;
        this.k = context.getResources();
        this.aB = new roc();
        this.O = aezkVar2;
        this.az = aezkVar3;
        this.P = aezkVar4;
        this.v = twqVar;
        this.u = typVar;
        this.t = txeVar;
        this.s = txjVar;
        this.r = tvmVar;
        this.V = umsVar;
        this.X = ufzVar;
        this.R = twmVar;
        this.j = uftVar;
        this.an = gjvVar2;
        this.g = ucfVar;
        this.J = txlVar;
        this.av = uxh.a;
        this.aj = ajmdVar;
        this.d = false;
        this.ag = nzjVar;
        this.T = aezkVar;
        this.aa = uajVar;
        this.D = wub.L(new qfe(uajVar, 9));
        synchronized (obj) {
            uly ulyVarA = I().a(z);
            txq txqVar = new txq();
            txqVar.c(-1);
            if (uajVar != null && uajVar.j()) {
                ulyVarA = ulyVarA.a();
            }
            txqVar.b(ulyVarA);
            txr txrVarA = txqVar.a();
            this.C = txrVarA;
            this.ax = z;
            this.E = new txq(txrVarA).a();
            this.aA = txp.LEGACY_AMBIENT;
        }
        this.w = ulcVar;
        this.al = gjvVar3;
        this.H = ufsVar;
        txlVar.e(ufsVar);
        qrx qrxVar2 = new qrx(pkxVar, zgtVar, uodVar);
        this.ae = qrxVar2;
        this.Q = new tzd(qrxVar2);
        yno it = nzjVar.d().iterator();
        while (it.hasNext()) {
            abgl abglVar = (abgl) it.next();
            if (E(abglVar)) {
                synchronized (this.z) {
                    ufs ufsVarO = o(abglVar);
                    if (ufsVarO != null) {
                        this.z.put(abglVar, ufsVarO);
                        this.aw.put(abglVar, ufsVarO.c);
                        txlVar.e(ufsVarO);
                    }
                }
            }
        }
        ucmVar.e = ucfVar;
        this.t.e = ucmVar;
        ((txn) txlVar).x.e(new tvv(txlVar, 13));
        this.ak = new gjv(this.at, (char[]) null);
        y(false);
        uiwVar.c(this);
        uiwVar.d();
    }

    private final ulx I() {
        if (this.e) {
            boolean z = this.U;
            boolean z2 = this.d;
            if (!z) {
                return z2 ? ulx.l : ulx.c;
            }
            txp txpVar = this.aA;
            return z2 ? txpVar.d : txpVar.c;
        }
        Map map = this.y;
        if (map.containsKey(tns.AIR_QUALITY_HEATMAP)) {
            return ulx.F;
        }
        boolean zContainsKey = map.containsKey(tns.BICYCLING);
        boolean z3 = this.d;
        return zContainsKey ? z3 ? ulx.r : ulx.b : z3 ? ulx.w : !map.containsKey(tns.TRANSIT) ? map.containsKey(tns.THREE_DIMENSIONAL) ? ulx.b : ulx.b : ulx.A;
    }

    private final boolean J() {
        uaj uajVar = this.aa;
        return uajVar != null && uajVar.j();
    }

    private final void K(txr txrVar, wnq wnqVar) {
        yfq yfqVarO;
        yfq yfqVarO2;
        vaq.d();
        wnq wnqVarQ = this.u.q();
        boolean z = (wnqVarQ != null && wnqVarQ.d == txrVar.a() && wnqVarQ.a == txrVar.b) ? false : true;
        if (!txrVar.equals(this.C) || z) {
            boolean zC = txrVar.a.c(this.C.a);
            this.C = txrVar;
            ukr ukrVarA = a();
            aezk aezkVar = this.P;
            Object objA = aezkVar.a();
            String str = this.b;
            abgl abglVar = aq;
            ukr ukrVarB = ukrVarA.b(((qsb) objA).l(str, abglVar), ((qsb) aezkVar.a()).m(this.b, this.C.a().L), this.C.a.e);
            boolean zEquals = ukrVarB.equals(this.H.d);
            if (!zC || !zEquals) {
                ufs ufsVarC = this.j.c(abglVar, ukrVarB, this.C.a, false);
                synchronized (this.G) {
                    ((txn) this.J).o(this.H, ufsVarC);
                    this.H = ufsVarC;
                }
            }
            txl txlVar = this.J;
            txlVar.g(this.C.a);
            ujk ujkVarA = this.C.a();
            synchronized (((txn) txlVar).c) {
                ArrayList arrayList = ((txn) txlVar).e;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ufs ufsVar = (ufs) arrayList.get(i);
                    ufsVar.E.b(ujkVarA);
                    ufsVar.H();
                }
            }
            typ typVar = this.u;
            typVar.i.set(new wnq(wnqVar));
            List list = typVar.j;
            synchronized (list) {
                yfqVarO = yfq.o(list);
            }
            int size2 = yfqVarO.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((tqu) yfqVarO.get(i2)).gq(((ujk) wnqVar.d).L, wnqVar.a);
            }
            this.au.d(this.C.b);
            twq twqVar = this.v;
            synchronized (twqVar) {
                twqVar.c = true;
                List list2 = twqVar.d;
                yfqVarO2 = yfq.o(list2);
                list2.clear();
            }
            if (yfqVarO2 != null) {
                int size3 = yfqVarO2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((Runnable) yfqVarO2.get(i3)).run();
                }
            }
            this.g.j();
        }
    }

    public final boolean A() {
        uaj uajVar = this.aa;
        return uajVar != null && uajVar.d();
    }

    public final boolean B() {
        uaj uajVar = this.aa;
        return uajVar != null && uajVar.k();
    }

    public final boolean C() {
        boolean z;
        synchronized (this.B) {
            z = false;
            if (!i(tns.SATELLITE) && !i(tns.TERRAIN) && this.C.a.d != ulx.a) {
                z = true;
            }
        }
        return z;
    }

    public final boolean D() {
        uaj uajVar = this.aa;
        return uajVar != null && ((Boolean) uajVar.d.gu()).booleanValue();
    }

    public final boolean E(abgl abglVar) {
        if (abglVar == abgl.GMM_BASEMAP_PHOTOS) {
            this.L.get();
        }
        nzj nzjVar = this.ag;
        if (!nzjVar.f(abglVar)) {
            return false;
        }
        txs txsVar = (txs) ((yfy) nzjVar.c).get(abglVar);
        if (txsVar == null) {
            ((ynz) a.a(uys.a).ai(9195)).y("Asking if a pipe that is not configured with pipes properties is enabled: %s", abglVar);
            return false;
        }
        int iOrdinal = txsVar.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return false;
        }
        throw new RuntimeException(null, null);
    }

    public final void F() {
        if (this.K) {
            this.g.D();
        }
    }

    public final boolean G(abgl abglVar) {
        return GmmAccount.SignedOut.b && this.ag.e(abglVar);
    }

    @Override // defpackage.uiv
    public final void H(wnq wnqVar) {
        y(true);
        if (wnqVar == null) {
            return;
        }
        Object obj = this.B;
        Object obj2 = wnqVar.d;
        int i = wnqVar.a;
        synchronized (obj) {
            txr txrVar = this.E;
            if (txrVar != null && obj2 == txrVar.a()) {
                txq txqVar = new txq(this.E);
                txqVar.c(i);
                K(txqVar.a(), wnqVar);
                this.E = null;
            } else if (obj2 == this.C.a()) {
                txq txqVar2 = new txq(this.C);
                txqVar2.c(i);
                K(txqVar2.a(), wnqVar);
            }
        }
    }

    @Override // defpackage.tnn
    public final ukr a() {
        return this.J.d();
    }

    @Override // defpackage.tnn
    public final void c(uda udaVar, uda udaVar2) {
        if (!this.K) {
            if (udaVar2 != null) {
                this.h.remove(udaVar2);
            }
            if (udaVar != null) {
                this.h.add(udaVar);
                return;
            }
            return;
        }
        if (udaVar2 == null) {
            udaVar2 = null;
        } else {
            if (udaVar != null) {
                this.g.u(udaVar2, udaVar);
                return;
            }
            udaVar = null;
        }
        if (udaVar2 != null) {
            this.g.r(udaVar2);
        } else if (udaVar != null) {
            this.g.h(udaVar);
        }
    }

    @Override // defpackage.tnn
    public final synchronized void d(String str) {
        if (Objects.equals(this.b, str)) {
            return;
        }
        this.b = str;
        u();
    }

    @Override // defpackage.tnn
    public final synchronized void e(Integer num) {
        txl txlVar = this.J;
        ((txn) txlVar).s = num;
        Integer num2 = ((txn) txlVar).s;
        if (num2 != null) {
            ((txn) txlVar).k(num2.intValue());
        }
    }

    @Override // defpackage.tnn
    public final void f(tns tnsVar, boolean z) {
        ufs ufuVar;
        boolean z2;
        s();
        if (z) {
            if (!i(tnsVar)) {
                switch (tnsVar) {
                    case TRAFFIC:
                        uft uftVar = this.j;
                        ukr ukrVarA = a();
                        long millis = TimeUnit.SECONDS.toMillis(((tre) this.O.a()).a);
                        uly ulyVarP = p();
                        tox toxVar = uftVar.l;
                        if (toxVar == null) {
                            throw new IllegalArgumentException("TrafficTileLayerId cannot be null when we create a traffic overlay.");
                        }
                        uvg uvgVar = uftVar.v;
                        ackk ackkVar = uftVar.a;
                        uiw uiwVar = uftVar.b;
                        usy usyVar = uftVar.w;
                        uor uorVarA = uftVar.e.a(toxVar, ukrVarA, true);
                        ums umsVar = uftVar.c;
                        ugq ugqVar = uftVar.d;
                        tmb tmbVar = uftVar.f;
                        ppo ppoVar = uftVar.g;
                        ScheduledExecutorService scheduledExecutorService = uftVar.h;
                        Executor executor = uftVar.i;
                        ttw ttwVar = uftVar.j;
                        aezk aezkVar = uftVar.n;
                        tpa tpaVar = uftVar.m;
                        boolean zBooleanValue = ((Boolean) uftVar.o.gu()).booleanValue();
                        ackk ackkVar2 = uftVar.p;
                        boolean z3 = uftVar.q;
                        uaj uajVar = uftVar.t;
                        plq plqVar = uftVar.u;
                        ufuVar = new ufu(uvgVar, usyVar, toxVar, ukrVarA, uorVarA, new ugy(uvgVar, ackkVar, uiwVar, toxVar, ukrVarA, uorVarA, true, 2, false, null, ugqVar, tmbVar, executor, tpaVar, ulyVarP, null, plqVar.c(), ((tre) aezkVar.a()).a()), umsVar, ugqVar, tmbVar, scheduledExecutorService, ttwVar, new rjr(ppoVar, tmbVar), 2, true, millis, aezkVar, tpaVar, zBooleanValue, ackkVar2, z3, uajVar, plqVar);
                        break;
                    case BICYCLING:
                    case TRANSIT:
                        ufuVar = this.j.c(tnsVar.a(z()), a(), p(), false);
                        break;
                    case SATELLITE:
                    case TERRAIN:
                        r();
                        uft uftVar2 = this.j;
                        if (J()) {
                            synchronized (this.B) {
                                z2 = this.ax;
                            }
                        } else {
                            z2 = z();
                        }
                        ufuVar = uftVar2.e(tnsVar.a(z2), a());
                        break;
                    case STREETVIEW:
                    case THREE_DIMENSIONAL:
                    case COVID19:
                    case AIR_QUALITY:
                    case WILDFIRES:
                        synchronized (this.B) {
                            ufuVar = this.j.c(tnsVar.a(z()), a(), this.C.a, false);
                        }
                        break;
                    case AIR_QUALITY_HEATMAP:
                        synchronized (this.B) {
                            ufuVar = this.j.c(tnsVar.a(z()), a(), this.C.a, true);
                        }
                        break;
                    default:
                        throw new IllegalArgumentException(a.bW(tnsVar, "Layer ", " is not a layer we can enable."));
                }
                this.J.e(ufuVar);
                this.y.put(tnsVar, ufuVar);
            }
        } else if (i(tnsVar)) {
            Map map = this.y;
            if (map.containsKey(tnsVar)) {
                this.J.f((ufs) map.get(tnsVar));
                map.remove(tnsVar);
            }
        }
        tnsVar.equals(tns.THREE_DIMENSIONAL);
        if (ap.contains(tnsVar) && C()) {
            g();
        }
    }

    @Override // defpackage.tnn
    public final void g() {
        s();
        r();
        F();
        synchronized (this.B) {
            txr txrVar = this.E;
            if (txrVar == null) {
                txrVar = this.C;
            }
            txq txqVar = new txq(txrVar);
            txqVar.b(I().a(txrVar.a.c));
            x(txqVar.a());
        }
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        printWriter.println(str.concat("GoogleMap:"));
        String str2 = ((abgi) this.az.a()).g;
        StringBuilder sb = new StringBuilder();
        String strConcat = str.concat("  ");
        sb.append(strConcat);
        sb.append("PaintParameterResponse.paintServerBaseUrl ");
        sb.append(str2);
        printWriter.println(sb.toString());
        synchronized (this.B) {
            printWriter.println(strConcat + "DrawMode: " + String.valueOf(this.C.a));
            printWriter.println(strConcat + "Legend: " + this.C.a().toString());
            txr txrVar = this.E;
            if (txrVar != null) {
                printWriter.println(strConcat + "PendingDrawMode: " + String.valueOf(txrVar.a));
                printWriter.println(strConcat + "PendingLegend: " + txrVar.a().name());
            }
        }
        this.V.gt(strConcat, printWriter);
        txl txlVar = this.J;
        printWriter.println(strConcat.concat("OverlayManagerImpl:"));
        synchronized (((txn) txlVar).c) {
            Iterator it = ((txn) txlVar).e.iterator();
            while (it.hasNext()) {
                ((ufs) it.next()).gt(a.bK(strConcat, "  "), printWriter);
            }
        }
        uvg uvgVar = this.ac;
        printWriter.println(strConcat.concat("EntityRenderer:"));
        int iIdentityHashCode = System.identityHashCode(uvgVar.r);
        StringBuilder sb2 = new StringBuilder();
        String strConcat2 = strConcat.concat("  ");
        sb2.append(strConcat2);
        sb2.append("glStateToken: ");
        sb2.append(iIdentityHashCode);
        printWriter.println(sb2.toString());
        printWriter.println(strConcat2 + "Entity counts by bin: " + ((String) Collection.EL.stream(uvgVar.j).map(new uzr(1 == true ? 1 : 0)).collect(Collectors.joining(", ", "[", "]"))));
        printWriter.println(strConcat2.concat("EntityQueueBuffer:"));
        utk utkVar = uvgVar.I;
        printWriter.println(strConcat2 + " pendingEntities size:" + utkVar.a.size());
        printWriter.println(strConcat2 + " entityAddCount:" + utkVar.b.get());
        printWriter.println(strConcat2 + " entityRemoveCount:" + utkVar.c.get());
        umn umnVar = this.f;
        printWriter.println(strConcat.concat("GmmRenderTarget:"));
        tsl tslVar = umnVar.w;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strConcat);
        sb3.append("  frameRateRegulator present: ");
        sb3.append(tslVar != null);
        printWriter.println(sb3.toString());
        tsl tslVar2 = umnVar.w;
        if (tslVar2 != null) {
            tslVar2.gt(strConcat.concat("  "), printWriter);
        }
        uts utsVar = umnVar.g;
        if (utsVar != null) {
            utsVar.b(strConcat.concat("  "), printWriter);
        }
        tun tunVar = umnVar.s;
        if (tunVar != null) {
            long j = tunVar.b;
            long j2 = tunVar.c;
            long j3 = tunVar.d;
            StringBuilder sb4 = new StringBuilder();
            String strConcat3 = strConcat.concat("  ");
            sb4.append(strConcat3);
            sb4.append("FrameStats-");
            int i = tunVar.h;
            sb4.append(tmo.r(i));
            sb4.append(": totalFrameCount=");
            sb4.append(j);
            sb4.append(" totalFramesOverBudget=");
            sb4.append(j2);
            sb4.append(" totalFramesOverBudgetDaveys=");
            sb4.append(j3);
            printWriter.println(sb4.toString());
            printWriter.println(strConcat3 + "FrameStatsAnimation-" + tmo.r(i) + ": totalFrameCount=" + tunVar.e + " totalFramesOverBudget=" + tunVar.f + " totalFramesOverBudgetDaveys=" + tunVar.g);
        }
        this.l.gt(strConcat, printWriter);
        uft uftVar = this.j;
        printWriter.println(strConcat.concat("TileOverlayFactory:"));
        uftVar.d.gt(strConcat.concat("  "), printWriter);
        this.g.gt(strConcat, printWriter);
    }

    @Override // defpackage.tnn
    public final void h() {
        f(tns.SATELLITE, true);
        F();
        synchronized (this.B) {
            txr txrVar = this.E;
            if (txrVar == null) {
                txrVar = this.C;
            }
            txq txqVar = new txq(txrVar);
            if (this.e) {
                this.O.a();
            }
            txqVar.b(ulx.x.a(txrVar.a.c));
            x(txqVar.a());
        }
    }

    @Override // defpackage.tnn
    public final boolean i(tns tnsVar) {
        s();
        return this.y.containsKey(tnsVar);
    }

    @Override // defpackage.tnn
    public final synchronized void j() {
        xul xulVarO = ysi.o();
        try {
            vaq.d();
            if (this.ay.compareAndSet(false, true)) {
                this.V.m();
                txl txlVar = this.J;
                if (((Boolean) ((txn) txlVar).j.gu()).booleanValue() && !((umn) ((txn) txlVar).t).k) {
                    ((txn) txlVar).i(false);
                }
                List<ufj> list = ((txn) txlVar).c;
                synchronized (list) {
                    for (ufj ufjVar : list) {
                        if (ufjVar instanceof ufs) {
                            ufs ufsVar = (ufs) ufjVar;
                            usy usyVar = ((txn) txlVar).y;
                            ttv ttvVar = ufsVar.q;
                            if (ttvVar != null) {
                                ufsVar.F.execute(new rdz(ufsVar, usyVar, ttvVar, 12));
                            }
                        }
                    }
                }
            }
            xulVarO.close();
        } finally {
        }
    }

    @Override // defpackage.tnr
    public final tqv k() {
        return this.u;
    }

    @Override // defpackage.tnr
    public final tvm l() {
        return this.r;
    }

    @Override // defpackage.tnr
    public final txe m() {
        return this.t;
    }

    @Override // defpackage.tnr
    public final txj n() {
        return this.s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ufs o(abgl abglVar) throws Throwable {
        tox toxVarT;
        abgl abglVar2 = abglVar;
        nzj nzjVar = this.ag;
        if (((yfy) nzjVar.b).containsKey(abglVar2)) {
            if (this.q == null) {
                this.q = pmp.a;
            }
            if (G(abglVar)) {
                toxVarT = this.an.t(abglVar2, this.q.c);
            } else {
                if (!nzjVar.e(abglVar2)) {
                    return null;
                }
                toxVarT = this.an.t(abglVar2, "");
            }
        } else {
            toxVarT = this.an.t(abglVar2, "");
        }
        tox toxVar = toxVarT;
        txl txlVar = this.J;
        Object obj = this.B;
        ukr ukrVarD = txlVar.d();
        synchronized (obj) {
            try {
                try {
                    abgl abglVar3 = abgl.EVCS;
                    uft uftVar = this.j;
                    if (abglVar2 != abglVar3) {
                        return uftVar.a(toxVar, ukrVarD, this.C.a, false);
                    }
                    uly ulyVar = this.C.a;
                    uvg uvgVar = uftVar.v;
                    ackk ackkVar = uftVar.a;
                    uiw uiwVar = uftVar.b;
                    usy usyVar = uftVar.w;
                    uor uorVarA = uftVar.e.a(toxVar, ukrVarD, true);
                    ums umsVar = uftVar.c;
                    ugq ugqVar = uftVar.d;
                    tmb tmbVar = uftVar.f;
                    ppo ppoVar = uftVar.g;
                    ScheduledExecutorService scheduledExecutorService = uftVar.h;
                    Executor executor = uftVar.i;
                    ttw ttwVar = uftVar.j;
                    aezk aezkVar = uftVar.n;
                    tpa tpaVar = uftVar.m;
                    boolean zBooleanValue = ((Boolean) uftVar.o.gu()).booleanValue();
                    ackk ackkVar2 = uftVar.p;
                    boolean z = uftVar.q;
                    uaj uajVar = uftVar.t;
                    plq plqVar = uftVar.u;
                    try {
                        return new ufi(uvgVar, usyVar, toxVar, ukrVarD, uorVarA, new ugy(uvgVar, ackkVar, uiwVar, toxVar, ukrVarD, uorVarA, false, 8, false, null, ugqVar, tmbVar, executor, tpaVar, ulyVar, null, plqVar.c(), ((tre) aezkVar.a()).a()), umsVar, ugqVar, tmbVar, scheduledExecutorService, ttwVar, new rjr(ppoVar, tmbVar), 8, true, aezkVar, tpaVar, zBooleanValue, ackkVar2, z, uajVar, plqVar);
                    } catch (Throwable th) {
                        th = th;
                        abglVar2 = obj;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    abglVar2 = obj;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        s();
        this.ar.get();
    }

    public final uly p() {
        uly ulyVar;
        s();
        synchronized (this.B) {
            ulyVar = this.C.a;
        }
        return ulyVar;
    }

    public final abgx q() {
        abgx abgxVar;
        synchronized (this.B) {
            abgxVar = this.C.a().L;
        }
        return abgxVar;
    }

    public final void r() {
        Map map = this.y;
        tns tnsVar = tns.SATELLITE;
        if (map.containsKey(tnsVar)) {
            this.J.f((ufj) map.get(tnsVar));
            map.remove(tnsVar);
        }
        tns tnsVar2 = tns.TERRAIN;
        if (map.containsKey(tnsVar2)) {
            this.J.f((ufj) map.get(tnsVar2));
            map.remove(tnsVar2);
        }
    }

    public final void s() {
        uxh uxhVar = this.av;
        if (uxhVar != null) {
            woy.aa(Thread.currentThread() == uxhVar.b, uxhVar.c);
        }
    }

    @Override // defpackage.uiu
    public final void t(int i) {
        synchronized (this.B) {
            txr txrVar = this.E;
            if (txrVar == null) {
                txrVar = this.C;
            }
            txq txqVar = new txq(txrVar);
            txqVar.c(i);
            x(txqVar.a());
        }
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        synchronized (this.B) {
            xxgVarAo.b("baseMapType", aq);
            xxgVarAo.b("drawingConfig", this.C);
        }
        return xxgVarAo.toString();
    }

    public final void u() {
        if (this.K) {
            txl txlVar = this.J;
            aezk aezkVar = this.P;
            if (txlVar.h(((qsb) aezkVar.a()).o(this.b), ((qsb) aezkVar.a()).m(this.b, q()))) {
                this.o.execute(new tvv(this, 15));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txu.v():void");
    }

    public final void w(ufj ufjVar) {
        if (this.K) {
            this.J.f(ufjVar);
        }
    }

    public final void x(txr txrVar) {
        if (J()) {
            txq txqVar = new txq(txrVar);
            txqVar.b(txrVar.a.a());
            txrVar = txqVar.a();
        }
        Object obj = this.B;
        ujk ujkVarA = txrVar.a();
        synchronized (obj) {
            this.E = txrVar;
            int i = txrVar.b;
            txr txrVar2 = this.C;
            if (txrVar2.b == -1 || !txrVar.equals(txrVar2)) {
                if (this.c) {
                    yob yobVar = a;
                    ((ynz) ((ynz) yobVar.f()).ai(9191)).D("requestDrawingConfig for epoch %s legend %s", i, ujkVarA);
                    if (this.l.k(i, ujkVarA, this.b, this)) {
                        return;
                    }
                    ((ynz) ((ynz) yobVar.f()).ai(9192)).D("requestLegend unsuccessful for epoch %s legend %s", i, ujkVarA);
                }
            }
        }
    }

    public final void y(boolean z) {
        ((ynz) ((ynz) a.f()).ai((char) 9193)).y("Network fetching: %b", Boolean.valueOf(z));
        txl txlVar = this.J;
        synchronized (((txn) txlVar).c) {
            ((txn) txlVar).w = z;
            Iterator it = ((txn) txlVar).e.iterator();
            while (it.hasNext()) {
                ufs ufsVar = (ufs) it.next();
                if (((txn) txlVar).v.v(ufsVar.b)) {
                    ufsVar.C(z);
                }
            }
        }
        if (this.as.compareAndSet(z, !z)) {
            if (z) {
            } else {
                this.aB = new roc();
            }
        }
    }

    final boolean z() {
        boolean z;
        s();
        synchronized (this.B) {
            z = this.C.a.c;
        }
        return z;
    }
}
