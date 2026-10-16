package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.hardware.SensorManager;
import android.util.DisplayMetrics;
import android.util.Log;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class tyb extends tno {
    public static final /* synthetic */ int A = 0;
    private static final yob B = yob.c("com/google/android/libraries/geo/mapcore/internal/impl/PhoenixGoogleMapActivityEnvironment");
    private final aezk C;
    private final aezk D;
    private final aezk E;
    private final String G;
    private final Integer H;
    private final pkx I;
    private final tmb J;
    private final ppo K;
    private final qay L;
    private final ugq M;
    private final ums N;
    private final tzt O;
    private final zgt P;
    private final Executor Q;
    private final Executor R;
    private final ttw S;
    private final uod T;
    private final tox U;
    private final ukz V;
    private final ackk W;
    private final xyc X;
    private final boolean Y;
    public final aezk a;
    private final psj af;
    private final plq ag;
    private final uqi ah;
    private final rjs aj;
    private final rjs ak;
    private final std al;
    private final gjv am;
    private final ajmd an;
    private final gms ao;
    public final aezk b;
    public final Context c;
    public final Context d;
    public final uiw e;
    public final pyh f;
    public final ackk g;
    public final ackk h;
    public final ackk i;
    public final tnv j;
    public final upr k;
    public final Resources l;
    public final zgt m;
    public final ackk n;
    public final xyc o;
    public final xyc p;
    public final tsy q;
    public final tsv r;
    public final tpa s;
    public final ackk u;
    public final uaj v;
    public final qrx w;
    public final gjv x;
    public final gjv y;
    public final erb z;
    private final Map F = new EnumMap(yfy.m(abfi.WORLD_ENCODING_LAT_LNG_E7, new tom(), abfi.WORLD_ENCODING_LAT_LNG_DOUBLE, new tol(), abfi.SCREEN_SPACE_FLOAT, new tov()));
    private final xyc Z = wub.L(new lwc(this, 5));
    private final xyc aa = wub.L(new lwc(this, 6));
    private final xyc ab = wub.L(new lwc(this, 7));
    public final xyc t = wub.L(new lwc(this, 8));
    private volatile tnn ac = null;
    private ufz ad = null;
    private uga ai = null;
    private final ackk ae = new psr(new lwc(this, 9));

    static {
        SensorManager.getAltitude(1.0f, 1.0f);
    }

    public tyb(String str, Integer num, Resources resources, uiw uiwVar, tnv tnvVar, Context context, tzt tztVar, abgl abglVar, ackk ackkVar, gjv gjvVar, ackk ackkVar2, ackk ackkVar3, ums umsVar, Context context2, pkx pkxVar, erb erbVar, zwm zwmVar, tsn tsnVar, gjv gjvVar2, tmb tmbVar, ppo ppoVar, std stdVar, qrx qrxVar, psj psjVar, qay qayVar, ugq ugqVar, pyh pyhVar, upr uprVar, rjs rjsVar, gms gmsVar, zgt zgtVar, zgt zgtVar2, Executor executor, Executor executor2, zgt zgtVar3, uod uodVar, ttw ttwVar, ukz ukzVar, rjs rjsVar2, xyc xycVar, ajmd ajmdVar, uqi uqiVar, tpa tpaVar, ackk ackkVar4, uaj uajVar, ackk ackkVar5, boolean z, plq plqVar) {
        vaq.d();
        this.G = str;
        this.H = num;
        this.c = context2;
        this.I = pkxVar;
        this.z = erbVar;
        this.a = new qed(10);
        this.b = new oya(zwmVar, 14);
        oya oyaVar = new oya(zwmVar, 15);
        this.C = oyaVar;
        this.D = new oya(tsnVar, 16);
        this.E = new oya(zwmVar, 17);
        this.y = gjvVar2;
        this.J = tmbVar;
        this.K = ppoVar;
        this.al = stdVar;
        this.w = qrxVar;
        this.af = psjVar;
        this.L = qayVar;
        this.M = ugqVar;
        this.k = uprVar;
        this.ak = rjsVar;
        this.f = pyhVar;
        this.ao = gmsVar;
        this.P = zgtVar;
        this.m = zgtVar2;
        this.Q = executor;
        this.R = executor2;
        this.am = new gjv(zgtVar3);
        this.T = uodVar;
        this.S = ttwVar;
        this.V = ukzVar;
        this.aj = rjsVar2;
        this.X = xycVar;
        oyaVar.a();
        this.l = resources;
        this.j = tnvVar;
        this.h = ackkVar;
        this.e = uiwVar;
        this.d = context;
        this.O = tztVar;
        this.U = new gjv((tpd) tpaVar).s(abglVar);
        this.x = gjvVar;
        this.i = ackkVar2;
        this.g = ackkVar3;
        this.N = umsVar;
        this.an = ajmdVar;
        this.ah = uqiVar;
        vaq.d();
        tsy tsyVar = new tsy(resources.getDisplayMetrics(), new tqy(null).a);
        this.q = tsyVar;
        this.r = new tsv(tsyVar);
        this.s = tpaVar;
        this.Y = z;
        this.n = ackkVar4;
        this.v = uajVar;
        this.u = new psr(new txz(zwmVar, pyhVar, ppoVar, tmbVar));
        this.o = wub.L(new txv(0));
        this.p = wub.L(new txv(2));
        this.W = ackkVar5;
        this.ag = plqVar;
    }

    private final synchronized tnn m() {
        usy usyVarH;
        txe txeVar;
        zgt zgtVar;
        gjv gjvVar;
        uvg uvgVar;
        String str;
        typ typVar;
        upr uprVar;
        Resources resources;
        ucf uckVar;
        gjv gjvVar2;
        ucm ucmVar;
        pkx pkxVar;
        boolean z;
        ucf ucfVar;
        gjv gjvVar3;
        uiw uiwVar;
        uod uodVar;
        tzt tztVar;
        ums umsVar;
        ukz ukzVar;
        erb erbVar;
        boolean z2;
        aezk aezkVar;
        uft uftVar;
        uaj uajVar;
        plq plqVar;
        gjv gjvVar4;
        aezk aezkVar2;
        ufs ufsVarC;
        umn umnVar;
        txn txnVar;
        qrx qrxVar;
        txj txjVar;
        typ typVar2;
        Context context;
        tvm tvmVar;
        twm twmVar;
        zgt zgtVar2;
        twq twqVar;
        aezk aezkVar3;
        aezk aezkVar4;
        ufz ufzVar;
        psj psjVar;
        pyh pyhVar;
        gms gmsVar;
        ulc ulcVar;
        ajmd ajmdVar;
        rjr rjrVar;
        boolean z3;
        usyVarH = h();
        ykd ykdVar = new ykd(this, null);
        typ typVarI = i();
        twy twyVar = new twy(typVarI);
        Resources resources2 = this.l;
        float f = resources2.getDisplayMetrics().density;
        aezk aezkVar5 = this.C;
        aezkVar5.a();
        zgtVar = this.m;
        upr uprVar2 = this.k;
        twt twtVar = new twt(zgtVar, uprVar2, twyVar);
        Map map = this.F;
        gjvVar = this.x;
        txeVar = new txe(typVarI, ykdVar, map, twtVar, gjvVar);
        uvgVar = (uvg) this.h.a();
        str = this.G;
        uvgVar.F = str;
        uwg uwgVar = uvgVar.m;
        float f2 = resources2.getDisplayMetrics().density;
        aezkVar5.a();
        ufw ufwVar = new ufw(uwgVar, f2, new Paint(), new Paint());
        rjs rjsVar = this.ak;
        ues uesVar = new ues(uwgVar, uprVar2, rjsVar, f2);
        pkx pkxVar2 = this.I;
        ucm ucmVar2 = new ucm(pkxVar2, resources2, ufwVar, uesVar, txeVar, twyVar);
        boolean z4 = this.Y;
        gjv gjvVar5 = this.y;
        if (gjvVar5.r()) {
            ((ynz) ((ynz) B.f()).ai((char) 9197)).u("Map using shared labeler");
            gjv gjvVar6 = this.am;
            zgt zgtVar3 = this.P;
            erb erbVar2 = this.z;
            uaj uajVar2 = this.v;
            uel uelVar = new uel(gjvVar6.q(), zgtVar3, str, uajVar2);
            uiw uiwVar2 = this.e;
            oya oyaVar = new oya(this, 18);
            ppo ppoVar = this.K;
            tmb tmbVar = this.J;
            rjr rjrVar2 = new rjr(ppoVar, tmbVar);
            aezkVar5.a();
            aezkVar5.a();
            aezkVar5.a();
            if (uajVar2 == null || !uajVar2.b()) {
                rjrVar = rjrVar2;
                z3 = false;
            } else {
                rjrVar = rjrVar2;
                z3 = true;
            }
            ucy ucyVar = new ucy(z3, erbVar2, tmbVar);
            qsb qsbVar = txeVar.l;
            qsb qsbVar2 = txeVar.m;
            this.f.p(pyk.Z);
            uckVar = new uec(uelVar, aezkVar5, uiwVar2, uprVar2, rjsVar, typVarI, twyVar, oyaVar, rjrVar, ucyVar, qsbVar, qsbVar2, ucmVar2, resources2, uajVar2);
            uprVar = uprVar2;
            typVar = typVarI;
            resources = resources2;
            gjvVar2 = gjvVar5;
            pkxVar = pkxVar2;
            ucmVar = ucmVar2;
            z = z4;
        } else {
            typVar = typVarI;
            uprVar = uprVar2;
            resources = resources2;
            ((ynz) ((ynz) B.f()).ai((char) 9196)).u("Map using legacy labeler");
            tzt tztVar2 = this.O;
            qsb qsbVar3 = txeVar.l;
            qsb qsbVar4 = txeVar.m;
            erb erbVar3 = this.z;
            gjv gjvVar7 = this.am;
            zgt zgtVar4 = this.P;
            zgt zgtVarQ = gjvVar7.q();
            oya oyaVar2 = new oya(this, 19);
            ppo ppoVar2 = this.K;
            tmb tmbVar2 = this.J;
            rjr rjrVar3 = new rjr(ppoVar2, tmbVar2);
            gjvVar2 = gjvVar5;
            this.f.p(pyk.Z);
            uckVar = new uck(tztVar2, qsbVar3, qsbVar4, ucmVar2, pkxVar2, erbVar3, aezkVar5, zgtVarQ, zgtVar4, twyVar, oyaVar2, rjrVar3, z4, this.v, tmbVar2);
            ucmVar = ucmVar2;
            pkxVar = pkxVar2;
            z = z4;
        }
        ucfVar = uckVar;
        uqi uqiVar = this.ah;
        gjvVar3 = new gjv(ucfVar, (char[]) null);
        ackk ackkVar = this.ae;
        uiwVar = this.e;
        tox toxVar = this.U;
        uodVar = this.T;
        tztVar = this.O;
        umsVar = this.N;
        ugq ugqVar = this.M;
        tmb tmbVar3 = this.J;
        ppo ppoVar3 = this.K;
        Executor executor = this.Q;
        ttw ttwVar = this.S;
        ukzVar = this.V;
        erbVar = this.z;
        z2 = z;
        tnv tnvVar = this.j;
        aezkVar = this.b;
        tpa tpaVar = this.s;
        xyc xycVar = this.o;
        ackk ackkVar2 = this.u;
        boolean zR = gjvVar2.r();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        uajVar = this.v;
        plqVar = this.ag;
        uftVar = new uft(uvgVar, ackkVar, uiwVar, usyVarH, toxVar, uodVar, tztVar, umsVar, ugqVar, tmbVar3, ppoVar3, zgtVar, executor, ttwVar, ukzVar, erbVar, txeVar, aezkVar, tpaVar, xycVar, ackkVar2, zR, displayMetrics, uajVar, plqVar);
        gjvVar4 = new gjv((tpd) tpaVar);
        aezkVar2 = this.E;
        ulx ulxVar = ulx.b;
        Object objA = aezkVar2.a();
        abgl abglVar = abgl.GMM_VECTOR_BASE;
        ufsVarC = uftVar.c(abglVar, ukr.a.b(((qsb) objA).l(str, abglVar), ((qsb) aezkVar2.a()).m(str, ulxVar.a(z2).b.L), ulxVar.a(z2).e), ulxVar.a(z2), false);
        umnVar = (umn) this.i.a();
        Resources resources3 = resources;
        txnVar = new txn(resources3, usyVarH, umnVar, uvgVar, ucfVar, this.X, uodVar, tpaVar, z2, gjvVar2.r(), wub.L(new qfe(this, 10)), this.H, uajVar);
        txg txgVar = new txg(uftVar, uodVar, txnVar);
        qrxVar = this.w;
        typVar2 = typVar;
        txjVar = new txj(uvgVar, typVar2, map, gjvVar, qrxVar, this.c, uajVar);
        context = this.d;
        tvmVar = new tvm(typVar2, txjVar, map, uvgVar, gjvVar, usyVarH, qrxVar, context, xycVar, wub.L(new txv(3)));
        twp twpVar = new twp();
        float f3 = resources3.getDisplayMetrics().density;
        Executor executor2 = this.R;
        zgtVar2 = this.P;
        twmVar = new twm(usyVarH, f3, uvgVar, twpVar, executor2, zgtVar2, uqiVar);
        twqVar = new twq(this, uvgVar, twpVar, tvmVar, txjVar, typVar2, txgVar);
        ufz ufzVar2 = new ufz(context, usyVarH, this.r, this.al, qrxVar);
        this.ad = ufzVar2;
        ufzVar2.d.e.b = new tya(usyVarH, txnVar);
        aezkVar3 = this.a;
        aezkVar4 = this.D;
        ufzVar = this.ad;
        ufzVar.getClass();
        psjVar = this.af;
        pyhVar = this.f;
        gmsVar = this.ao;
        ulcVar = new ulc(txeVar);
        ajmdVar = this.an;
        tmo tmoVar = tnvVar.f;
        return new txu(str, twqVar, gjvVar, uvgVar, tztVar, usyVarH, umnVar, context, aezkVar3, aezkVar, aezkVar4, aezkVar2, umsVar, ufzVar, twmVar, txnVar, ucfVar, uftVar, gjvVar4, typVar2, txeVar, txjVar, tvmVar, ucmVar, pkxVar, erbVar, psjVar, qrxVar, uiwVar, pyhVar, uprVar, gmsVar, zgtVar2, zgtVar, uodVar, ukzVar, ulcVar, gjvVar3, ajmdVar, ufsVarC, uajVar, z2, new nzj(aezkVar3), plqVar);
    }

    @Override // defpackage.tno
    public final qay a() {
        return this.L;
    }

    @Override // defpackage.tno
    public final tnn b() {
        tnn tnnVar;
        vaq.d();
        tnn tnnVar2 = this.ac;
        if (tnnVar2 != null) {
            return tnnVar2;
        }
        if (!a.Z() || !pyn.a(this.c, pyo.LOG_GOOGLE_MAP_DEPENDENCY_DURING_STARTUP)) {
            synchronized (this) {
                if (this.ac != null) {
                    return this.ac;
                }
                this.ac = m();
                return this.ac;
            }
        }
        long jA = this.J.a();
        vky vkyVar = new vky("GoogleMap.blockedOnMainThread");
        fdi.b();
        synchronized (this) {
            if (this.ac == null) {
                this.ac = m();
            }
            tnnVar = this.ac;
        }
        long jA2 = this.J.a() - jA;
        if (Log.isLoggable("PhoenixGoogleMap", 4)) {
            Log.i("PhoenixGoogleMap", String.format("%s for %s ms.", vkyVar, Long.valueOf(jA2)), new Throwable());
        }
        ((ynz) ((ynz) ((ynz) B.g()).q(ypd.FULL)).ai(9199)).y("GoogleMapBlocked on main thread for %s ms.", new vps(jA2));
        tnnVar.getClass();
        return tnnVar;
    }

    @Override // defpackage.tno
    public final uiw c() {
        return this.e;
    }

    @Override // defpackage.tno
    public final uts d() {
        vaq.d();
        return (uts) this.Z.gu();
    }

    @Override // defpackage.tno
    public final synchronized ackk e() {
        return this.ae;
    }

    @Override // defpackage.tno
    public final ackk f() {
        return this.u;
    }

    @Override // defpackage.tno
    public final uga g() {
        vaq.d();
        return k();
    }

    @Override // defpackage.tno
    public final usy h() {
        vaq.d();
        return (usy) this.aa.gu();
    }

    public final typ i() {
        vaq.d();
        return (typ) this.ab.gu();
    }

    public final synchronized twq j() {
        twq twqVar;
        twqVar = ((txu) b()).v;
        twqVar.getClass();
        return twqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[Catch: all -> 0x00b1, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0013, B:13:0x001c, B:15:0x0033, B:17:0x003c, B:20:0x0045, B:22:0x004c, B:24:0x0052, B:27:0x005c, B:29:0x0067, B:32:0x006f, B:43:0x0091, B:45:0x0099, B:44:0x0094, B:34:0x0078, B:36:0x007e, B:40:0x008a, B:39:0x0084, B:41:0x008d, B:26:0x0056), top: B:51:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091 A[Catch: all -> 0x00b1, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0013, B:13:0x001c, B:15:0x0033, B:17:0x003c, B:20:0x0045, B:22:0x004c, B:24:0x0052, B:27:0x005c, B:29:0x0067, B:32:0x006f, B:43:0x0091, B:45:0x0099, B:44:0x0094, B:34:0x0078, B:36:0x007e, B:40:0x008a, B:39:0x0084, B:41:0x008d, B:26:0x0056), top: B:51:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094 A[Catch: all -> 0x00b1, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0013, B:13:0x001c, B:15:0x0033, B:17:0x003c, B:20:0x0045, B:22:0x004c, B:24:0x0052, B:27:0x005c, B:29:0x0067, B:32:0x006f, B:43:0x0091, B:45:0x0099, B:44:0x0094, B:34:0x0078, B:36:0x007e, B:40:0x008a, B:39:0x0084, B:41:0x008d, B:26:0x0056), top: B:51:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.uga k() {
        /*
            r11 = this;
            monitor-enter(r11)
            uga r0 = r11.ai     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L7
            monitor-exit(r11)
            return r0
        L7:
            r11.b()     // Catch: java.lang.Throwable -> Lb1
            uts r2 = r11.d()     // Catch: java.lang.Throwable -> Lb1
            rjs r0 = r11.aj     // Catch: java.lang.Throwable -> Lb1
            r8 = 0
            if (r0 == 0) goto L19
            tuy r1 = r0.a()     // Catch: java.lang.Throwable -> Lb1
            if (r1 != 0) goto L1a
        L19:
            r1 = r8
        L1a:
            if (r1 != 0) goto L32
            android.content.res.Resources r1 = r11.l     // Catch: java.lang.Throwable -> Lb1
            tmb r3 = r11.J     // Catch: java.lang.Throwable -> Lb1
            psj r4 = r11.af     // Catch: java.lang.Throwable -> Lb1
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch: java.lang.Throwable -> Lb1
            ugb r5 = new ugb     // Catch: java.lang.Throwable -> Lb1
            ufz r6 = r11.l()     // Catch: java.lang.Throwable -> Lb1
            float r1 = r1.density     // Catch: java.lang.Throwable -> Lb1
            r5.<init>(r3, r4, r6, r1)     // Catch: java.lang.Throwable -> Lb1
            goto L33
        L32:
            r5 = r1
        L33:
            usy r3 = r11.h()     // Catch: java.lang.Throwable -> Lb1
            uaj r1 = r11.v     // Catch: java.lang.Throwable -> Lb1
            r9 = 0
            if (r1 == 0) goto L42
            boolean r4 = r1.h()     // Catch: java.lang.Throwable -> Lb1
            r10 = r4
            goto L43
        L42:
            r10 = r9
        L43:
            if (r1 == 0) goto L4b
            boolean r1 = r1.i()     // Catch: java.lang.Throwable -> Lb1
            r7 = r1
            goto L4c
        L4b:
            r7 = r9
        L4c:
            ums r1 = r11.N     // Catch: java.lang.Throwable -> Lb1
            boolean r4 = r1 instanceof defpackage.umu     // Catch: java.lang.Throwable -> Lb1
            if (r4 == 0) goto L56
            umu r1 = (defpackage.umu) r1     // Catch: java.lang.Throwable -> Lb1
        L54:
            r6 = r1
            goto L5c
        L56:
            txx r1 = new txx     // Catch: java.lang.Throwable -> Lb1
            r1.<init>()     // Catch: java.lang.Throwable -> Lb1
            goto L54
        L5c:
            uga r1 = new uga     // Catch: java.lang.Throwable -> Lb1
            twq r4 = r11.j()     // Catch: java.lang.Throwable -> Lb1
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L76
            tuy r4 = r0.a()     // Catch: java.lang.Throwable -> Lb1
            if (r4 != 0) goto L76
            if (r10 != 0) goto L78
            ufz r4 = r11.l()     // Catch: java.lang.Throwable -> Lb1
            r3.g = r4     // Catch: java.lang.Throwable -> Lb1
            goto L8f
        L76:
            if (r10 == 0) goto L8d
        L78:
            tnv r4 = r11.j     // Catch: java.lang.Throwable -> Lb1
            boolean r4 = r4.b     // Catch: java.lang.Throwable -> Lb1
            if (r4 == 0) goto L8d
            ackk r4 = r11.W     // Catch: java.lang.Throwable -> Lb1
            if (r4 != 0) goto L84
            r4 = r8
            goto L8a
        L84:
            java.lang.Object r4 = r4.a()     // Catch: java.lang.Throwable -> Lb1
            uqo r4 = (defpackage.uqo) r4     // Catch: java.lang.Throwable -> Lb1
        L8a:
            r3.g = r4     // Catch: java.lang.Throwable -> Lb1
            goto L8f
        L8d:
            r3.g = r8     // Catch: java.lang.Throwable -> Lb1
        L8f:
            if (r0 == 0) goto L94
            java.lang.Object r0 = r0.b     // Catch: java.lang.Throwable -> Lb1
            goto L99
        L94:
            tmo r0 = new tmo     // Catch: java.lang.Throwable -> Lb1
            r0.<init>(r8, r8)     // Catch: java.lang.Throwable -> Lb1
        L99:
            tmo r0 = (defpackage.tmo) r0     // Catch: java.lang.Throwable -> Lb1
            r1.b = r0     // Catch: java.lang.Throwable -> Lb1
            txw r0 = new txw     // Catch: java.lang.Throwable -> Lb1
            r0.<init>(r1, r9)     // Catch: java.lang.Throwable -> Lb1
            r5.o(r0)     // Catch: java.lang.Throwable -> Lb1
            ykd r0 = new ykd     // Catch: java.lang.Throwable -> Lb1
            r0.<init>(r1, r8)     // Catch: java.lang.Throwable -> Lb1
            r2.o(r0)     // Catch: java.lang.Throwable -> Lb1
            r11.ai = r1     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r11)
            return r1
        Lb1:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lb1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyb.k():uga");
    }

    public final synchronized ufz l() {
        ufz ufzVar;
        b();
        ufzVar = this.ad;
        ufzVar.getClass();
        return ufzVar;
    }
}
