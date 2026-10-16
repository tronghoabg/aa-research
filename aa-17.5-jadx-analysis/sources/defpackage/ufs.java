package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class ufs extends ufj implements ueo, uyl {
    private static final yob V = yob.c("com/google/android/libraries/geo/mapcore/internal/legacy/internal/overlay/TileOverlay");
    final ufr B;
    public final ums D;
    public final ufq E;
    public final ScheduledExecutorService F;
    protected final ugq G;
    public final uor H;
    protected final aezk I;
    protected final tpa J;
    protected final boolean L;
    protected final ackk M;
    public final boolean N;
    protected final plq O;
    protected final uaj P;
    public final uvg Q;
    protected final usy R;
    protected final rjr S;
    public final erb T;
    public volatile ykd U;
    private final boolean W;
    private final xxh X;
    final int a;
    private final boolean aa;
    private int ab;
    private ttn aj;
    private List aq;
    private volatile ucf as;
    private final ufq at;
    private final ujx au;
    private volatile boolean av;
    private boolean aw;
    private final urg az;
    public final abgl b;
    public final tox c;
    public final ukr d;
    public final ugy e;
    protected final int l;
    protected boolean m;
    protected final tmb n;
    public long o;
    public long p;
    public ttv q;
    public volatile boolean r;
    public volatile boolean s;
    public final boolean u;
    protected final ttx z;
    public final List f = new ArrayList();
    private final Set Y = new aeug(null);
    public final List g = new ArrayList();
    public boolean h = false;
    public zdh i = zdh.a;
    private aepx Z = aeqa.a;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public boolean k = false;
    private boolean ac = false;
    private final AtomicBoolean ad = new AtomicBoolean(false);
    private boolean ae = false;
    private boolean af = false;
    private int ag = 0;
    private final too ah = new too();
    private final float[] ai = new float[3];
    public long t = 0;
    private boolean ak = false;
    public volatile boolean v = false;
    public volatile boolean w = false;
    public volatile boolean x = false;
    private volatile boolean al = false;
    public volatile boolean y = false;
    private boolean am = false;
    public boolean A = true;
    private volatile boolean an = false;
    public final List C = new ArrayList();
    private final Set ao = new HashSet();
    private final vaa ap = new vaa(false);
    private final Set ar = new HashSet();
    public boolean K = false;
    private List ax = new ArrayList();
    private List ay = new ArrayList();

    protected ufs(uvg uvgVar, usy usyVar, tox toxVar, ukr ukrVar, uor uorVar, ugy ugyVar, ums umsVar, ugq ugqVar, tmb tmbVar, ScheduledExecutorService scheduledExecutorService, rjr rjrVar, ttx ttxVar, ujx ujxVar, erb erbVar, int i, boolean z, int i2, boolean z2, boolean z3, aezk aezkVar, tpa tpaVar, boolean z4, ackk ackkVar, boolean z5, boolean z6, xxh xxhVar, uaj uajVar, plq plqVar) {
        uvgVar.getClass();
        this.Q = uvgVar;
        this.R = usyVar;
        this.c = toxVar;
        this.b = toxVar.c;
        this.d = ukrVar;
        this.H = uorVar;
        this.e = ugyVar;
        this.D = umsVar;
        this.G = ugqVar;
        this.n = tmbVar;
        this.F = scheduledExecutorService;
        this.S = rjrVar;
        this.z = ttxVar;
        this.au = ujxVar;
        this.T = erbVar;
        this.l = i;
        this.aa = z;
        this.a = i2;
        this.W = z2;
        this.u = z3;
        this.I = aezkVar;
        this.J = tpaVar;
        this.B = new ufr(new ueh(this, 8));
        this.L = z4;
        this.M = ackkVar;
        this.N = z5;
        this.m = z6;
        this.X = xxhVar;
        this.P = uajVar;
        this.O = plqVar;
        this.ab = 0;
        this.o = tmbVar.a();
        this.p = tmbVar.a();
        ujk ujkVarF = ugyVar.f();
        this.E = new ufq(ujkVarF);
        this.at = new ufq(ujkVarF);
        urg urgVar = new urg(this, ugyVar, (char[]) null);
        this.az = urgVar;
        woy.Z(ugyVar.l == null);
        ugyVar.l = this;
        uorVar.k(urgVar);
    }

    private static void M(Collection collection) {
        aeuf aeufVar = new aeuf((aeug) collection);
        while (aeufVar.hasNext()) {
            ((uii) aeufVar.next()).t();
        }
        collection.clear();
    }

    private static void N(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((uii) list.get(i)).t();
        }
        list.clear();
    }

    private static void O(List list, List list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((uii) list.get(i)).q();
        }
        list2.addAll(list);
    }

    private final void P(uii uiiVar, Set set) {
        if (set.add(uiiVar)) {
            this.ag++;
            uiiVar.q();
            if (this.f.contains(uiiVar)) {
                return;
            }
            uiiVar.u(this.K);
        }
    }

    private final synchronized void Q() {
        if (this.v && this.m) {
            this.m = false;
            this.r = true;
            this.Q.k();
        }
    }

    private final void R() {
        ucf ucfVar = this.as;
        if (ucfVar != null) {
            if (this.N) {
                ucfVar.w(new txo(this, ucfVar, 18));
            } else {
                ucfVar.m(this);
            }
        }
    }

    private final void S(boolean z) {
        this.v = z;
        this.D.r();
        this.ap.c(Boolean.valueOf(J()));
    }

    private final synchronized void T(usy usyVar, boolean z) {
        Set set = this.ar;
        set.clear();
        r(set);
        if (this.A && this.q != null) {
            int i = 0;
            if (this.am && !this.m) {
                i = true != z ? 8 : 4;
            }
            int i2 = i;
            ugy ugyVar = this.e;
            too tooVarL = usyVar.l();
            List list = this.C;
            tot totVar = usyVar.n().c.a;
            ugyVar.u(tooVarL, list, set, new tpk(new tot(too.i(totVar.a), too.i(totVar.b))), i2, false, false, uqw.c());
            if (this.b == abgl.GMM_VECTOR_BASE) {
                ums umsVar = this.D;
                if (umsVar instanceof umu) {
                    umu umuVar = (umu) umsVar;
                    uaj uajVar = this.P;
                    if ((uajVar == null || !uajVar.c()) && this.ac && !this.ad.get()) {
                        umuVar.t();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized boolean U(defpackage.usy r9, java.util.Set r10) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r10.isEmpty()     // Catch: java.lang.Throwable -> L76
            defpackage.woy.Z(r0)     // Catch: java.lang.Throwable -> L76
            too r4 = r8.ah     // Catch: java.lang.Throwable -> L76
            r9.s(r4)     // Catch: java.lang.Throwable -> L76
            uvg r9 = r8.Q     // Catch: java.lang.Throwable -> L76
            tmb r0 = r8.n     // Catch: java.lang.Throwable -> L76
            long r5 = r0.a()     // Catch: java.lang.Throwable -> L76
            ugq r0 = r8.G     // Catch: java.lang.Throwable -> L76
            java.lang.Runnable r0 = r0.d     // Catch: java.lang.Throwable -> L76
            r9.l(r0)     // Catch: java.lang.Throwable -> L76
            java.util.List r2 = r8.aq     // Catch: java.lang.Throwable -> L76
            r9 = 1
            r0 = 0
            if (r2 == 0) goto L5a
            boolean r1 = r2.isEmpty()     // Catch: java.lang.Throwable -> L76
            if (r1 != 0) goto L5a
            java.util.List r1 = r8.C     // Catch: java.lang.Throwable -> L76
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L5a
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L76
            ukp r1 = (defpackage.ukp) r1     // Catch: java.lang.Throwable -> L76
            int r1 = r1.a     // Catch: java.lang.Throwable -> L76
            java.lang.Object r3 = r2.get(r0)     // Catch: java.lang.Throwable -> L76
            ukp r3 = (defpackage.ukp) r3     // Catch: java.lang.Throwable -> L76
            int r3 = r3.a     // Catch: java.lang.Throwable -> L76
            int r3 = r3 + (-2)
            if (r1 < r3) goto L5a
            r3 = 0
            r1 = r8
            r7 = r10
            r1.q(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L7b
            int r8 = r1.ab     // Catch: java.lang.Throwable -> L7b
            int r10 = r2.size()     // Catch: java.lang.Throwable -> L7b
            if (r8 != r10) goto L54
            r8 = r9
            goto L55
        L54:
            r8 = r0
        L55:
            r1.S(r8)     // Catch: java.lang.Throwable -> L7b
            r8 = r9
            goto L5d
        L5a:
            r1 = r8
            r7 = r10
            r8 = r0
        L5d:
            java.util.List r2 = r1.C     // Catch: java.lang.Throwable -> L7b
            int r3 = r1.l     // Catch: java.lang.Throwable -> L7b
            boolean r10 = r1.q(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L7b
            if (r8 != 0) goto L74
            int r8 = r1.ab     // Catch: java.lang.Throwable -> L7b
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L7b
            if (r8 != r2) goto L70
            goto L71
        L70:
            r9 = r0
        L71:
            r1.S(r9)     // Catch: java.lang.Throwable -> L7b
        L74:
            monitor-exit(r1)
            return r10
        L76:
            r0 = move-exception
            r1 = r8
        L78:
            r8 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7b
            throw r8
        L7b:
            r0 = move-exception
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufs.U(usy, java.util.Set):boolean");
    }

    private final synchronized boolean V(usy usyVar, int i, int i2) {
        float[] fArr = this.ai;
        usyVar.A(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        if (((f * f) / (i * i)) + ((f2 * f2) / (i2 * i2)) < 9.0d) {
            if (Math.abs(fArr[2]) < 4.0d) {
                return true;
            }
        }
        return false;
    }

    private final synchronized void W(usy usyVar, zwj zwjVar) {
        this.ak = true;
        Object obj = zwjVar.b;
        usy usyVar2 = new usy((ttn) obj, usyVar.k(), usyVar.j(), usyVar.f());
        ArrayList arrayList = new ArrayList();
        ttv ttvVar = this.q;
        if (ttvVar != null) {
            ttvVar.a(usyVar2, arrayList);
        }
        if (this.A && this.q != null) {
            int i = 0;
            if (this.am && !this.m) {
                i = 8;
            }
            ugy ugyVar = this.e;
            too tooVarL = usyVar2.l();
            tpk tpkVar = usyVar2.n().c;
            abnp abnpVarN = abad.a.n();
            abnpVarN.t();
            abad abadVar = (abad) abnpVarN.b;
            abadVar.c = 4;
            abadVar.b = 1 | abadVar.b;
            ugyVar.u(tooVarL, arrayList, null, tpkVar, i, true, false, (abad) abnpVarN.q());
        }
        this.aq = arrayList;
        this.aj = (ttn) obj;
    }

    public final void A(aepx aepxVar) {
        if (this.al && this.b == abgl.GMM_VECTOR_BASE) {
            this.D.i();
        }
        if (!this.N || aepxVar == null) {
            return;
        }
        this.Z = aepxVar;
        E();
    }

    public final void B(String str, ygr ygrVar) {
        this.e.n(str, ygrVar);
    }

    public final void C(boolean z) {
        this.e.k = z;
        if (z) {
            w();
        }
    }

    public final synchronized void D(tqa tqaVar) {
        if (this.e.v(tqaVar)) {
            w();
        }
    }

    public final void E() {
        boolean z = false;
        int i = 0;
        while (true) {
            zdh zdhVar = this.i;
            if (i >= zdhVar.b) {
                z = true;
                break;
            } else if (!this.Z.e(zdhVar.a(i))) {
                break;
            } else {
                i++;
            }
        }
        this.j.set(z);
    }

    public final void F() {
        this.E.a();
        H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec A[Catch: all -> 0x0455, TryCatch #3 {, blocks: (B:26:0x006e, B:27:0x0078, B:29:0x007e, B:31:0x008a, B:33:0x0098, B:35:0x00ae, B:37:0x00bd, B:41:0x00cd, B:43:0x00d3, B:47:0x00e7, B:49:0x00ec, B:52:0x00f4, B:54:0x00f9, B:56:0x0101, B:57:0x0124, B:59:0x012d, B:60:0x0134, B:62:0x013c, B:63:0x0143, B:71:0x0160, B:75:0x016d, B:77:0x0173, B:79:0x0177, B:80:0x017f, B:83:0x0185, B:86:0x018b, B:89:0x0191, B:91:0x019f, B:93:0x01a9, B:119:0x023c, B:98:0x01bc, B:100:0x01c0, B:102:0x01c7, B:105:0x01d1, B:111:0x01e9, B:113:0x020a, B:115:0x0212, B:116:0x021a, B:118:0x0223, B:120:0x0248, B:74:0x0167, B:68:0x0150, B:69:0x0156, B:44:0x00da, B:122:0x0254), top: B:273:0x006e, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4 A[Catch: all -> 0x0455, TryCatch #3 {, blocks: (B:26:0x006e, B:27:0x0078, B:29:0x007e, B:31:0x008a, B:33:0x0098, B:35:0x00ae, B:37:0x00bd, B:41:0x00cd, B:43:0x00d3, B:47:0x00e7, B:49:0x00ec, B:52:0x00f4, B:54:0x00f9, B:56:0x0101, B:57:0x0124, B:59:0x012d, B:60:0x0134, B:62:0x013c, B:63:0x0143, B:71:0x0160, B:75:0x016d, B:77:0x0173, B:79:0x0177, B:80:0x017f, B:83:0x0185, B:86:0x018b, B:89:0x0191, B:91:0x019f, B:93:0x01a9, B:119:0x023c, B:98:0x01bc, B:100:0x01c0, B:102:0x01c7, B:105:0x01d1, B:111:0x01e9, B:113:0x020a, B:115:0x0212, B:116:0x021a, B:118:0x0223, B:120:0x0248, B:74:0x0167, B:68:0x0150, B:69:0x0156, B:44:0x00da, B:122:0x0254), top: B:273:0x006e, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167 A[Catch: all -> 0x0455, TryCatch #3 {, blocks: (B:26:0x006e, B:27:0x0078, B:29:0x007e, B:31:0x008a, B:33:0x0098, B:35:0x00ae, B:37:0x00bd, B:41:0x00cd, B:43:0x00d3, B:47:0x00e7, B:49:0x00ec, B:52:0x00f4, B:54:0x00f9, B:56:0x0101, B:57:0x0124, B:59:0x012d, B:60:0x0134, B:62:0x013c, B:63:0x0143, B:71:0x0160, B:75:0x016d, B:77:0x0173, B:79:0x0177, B:80:0x017f, B:83:0x0185, B:86:0x018b, B:89:0x0191, B:91:0x019f, B:93:0x01a9, B:119:0x023c, B:98:0x01bc, B:100:0x01c0, B:102:0x01c7, B:105:0x01d1, B:111:0x01e9, B:113:0x020a, B:115:0x0212, B:116:0x021a, B:118:0x0223, B:120:0x0248, B:74:0x0167, B:68:0x0150, B:69:0x0156, B:44:0x00da, B:122:0x0254), top: B:273:0x006e, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173 A[Catch: all -> 0x0455, TryCatch #3 {, blocks: (B:26:0x006e, B:27:0x0078, B:29:0x007e, B:31:0x008a, B:33:0x0098, B:35:0x00ae, B:37:0x00bd, B:41:0x00cd, B:43:0x00d3, B:47:0x00e7, B:49:0x00ec, B:52:0x00f4, B:54:0x00f9, B:56:0x0101, B:57:0x0124, B:59:0x012d, B:60:0x0134, B:62:0x013c, B:63:0x0143, B:71:0x0160, B:75:0x016d, B:77:0x0173, B:79:0x0177, B:80:0x017f, B:83:0x0185, B:86:0x018b, B:89:0x0191, B:91:0x019f, B:93:0x01a9, B:119:0x023c, B:98:0x01bc, B:100:0x01c0, B:102:0x01c7, B:105:0x01d1, B:111:0x01e9, B:113:0x020a, B:115:0x0212, B:116:0x021a, B:118:0x0223, B:120:0x0248, B:74:0x0167, B:68:0x0150, B:69:0x0156, B:44:0x00da, B:122:0x0254), top: B:273:0x006e, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019f A[Catch: all -> 0x0455, TryCatch #3 {, blocks: (B:26:0x006e, B:27:0x0078, B:29:0x007e, B:31:0x008a, B:33:0x0098, B:35:0x00ae, B:37:0x00bd, B:41:0x00cd, B:43:0x00d3, B:47:0x00e7, B:49:0x00ec, B:52:0x00f4, B:54:0x00f9, B:56:0x0101, B:57:0x0124, B:59:0x012d, B:60:0x0134, B:62:0x013c, B:63:0x0143, B:71:0x0160, B:75:0x016d, B:77:0x0173, B:79:0x0177, B:80:0x017f, B:83:0x0185, B:86:0x018b, B:89:0x0191, B:91:0x019f, B:93:0x01a9, B:119:0x023c, B:98:0x01bc, B:100:0x01c0, B:102:0x01c7, B:105:0x01d1, B:111:0x01e9, B:113:0x020a, B:115:0x0212, B:116:0x021a, B:118:0x0223, B:120:0x0248, B:74:0x0167, B:68:0x0150, B:69:0x0156, B:44:0x00da, B:122:0x0254), top: B:273:0x006e, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b2  */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, ppo] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, tmb] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [int] */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.Object, ufs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void G() {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufs.G():void");
    }

    public final void H() {
        if (this.an) {
            this.Q.k();
        }
    }

    public final boolean I() {
        uaj uajVar = this.P;
        return uajVar != null && uajVar.d();
    }

    public final boolean J() {
        return this.v && this.aw;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected synchronized void K(defpackage.usy r17, java.util.Set r18) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufs.K(usy, java.util.Set):void");
    }

    public final void L(aacq aacqVar) {
        if (this.b == abgl.MAPS_API_DDS_1P) {
            this.e.y(aacqVar);
            w();
        }
    }

    @Override // defpackage.ufj, defpackage.uda
    public final abgl a() {
        return this.b;
    }

    @Override // defpackage.ufj, defpackage.uda
    public final void c(ucf ucfVar) {
        ucfVar.B(this);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.ufj, defpackage.uda
    public final void e(rfe rfeVar) {
        int i;
        if (this.u) {
            if (I()) {
                synchronized (this.g) {
                    ?? r1 = rfeVar.g;
                    Set set = this.ao;
                    r1.addAll(set);
                    set.clear();
                }
            }
            if (!this.N) {
                List<uih> list = this.g;
                synchronized (list) {
                    for (uih uihVar : list) {
                        if (uihVar != null && (uihVar.A() || !this.x)) {
                            if (uihVar instanceof uda) {
                                ((uda) uihVar).e(rfeVar);
                            }
                        }
                    }
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            List list2 = this.g;
            synchronized (list2) {
                O(list2, arrayList);
                this.h = false;
                this.k = true;
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                uih uihVar2 = (uih) arrayList.get(i);
                if (uihVar2 != null && ((uihVar2.A() || !this.x) && (uihVar2 instanceof uda))) {
                    ((uda) uihVar2).e(rfeVar);
                }
            }
            N(arrayList);
        }
    }

    @Override // defpackage.ueo
    public final boolean f() {
        return (this.y || this.v) ? false : true;
    }

    public ufs g(ukr ukrVar, uor uorVar) {
        return new ufs(this.Q, this.R, this.c, ukrVar, uorVar, this.e.c(ukrVar, uorVar), this.D, this.G, this.n, this.F, this.S, this.z, this.au, this.T, this.l, this.aa, this.a, this.W, this.u, this.I, this.J, this.L, this.M, this.N, this.m, this.X, this.P, this.O);
    }

    @Override // defpackage.ufj, defpackage.uda
    public final void gr(ucf ucfVar) {
        this.as = ucfVar;
        ucfVar.A(this);
    }

    public final void gs(uii uiiVar) {
        if (this.an) {
            if (!this.x) {
                List list = this.g;
                synchronized (list) {
                    uiiVar.q();
                    list.add(uiiVar);
                    this.h = true;
                }
                R();
            }
            this.Q.k();
        }
    }

    @Override // defpackage.uyl
    public final synchronized void gt(String str, PrintWriter printWriter) {
        uhb uhbVar;
        printWriter.println(str.concat("TileOverlay"));
        abgl abglVar = this.b;
        String strName = abglVar.name();
        StringBuilder sb = new StringBuilder();
        String strConcat = str.concat("  ");
        sb.append(strConcat);
        sb.append("paintTileType: ");
        sb.append(strName);
        printWriter.println(sb.toString());
        printWriter.println(strConcat + "fetcher: " + this.e.toString());
        printWriter.println(strConcat + "baseLevelCoords " + this.C.size());
        List list = this.aq;
        if (list != null) {
            printWriter.println(strConcat + "targetBaseLevelCoords " + list.size());
        }
        List<uii> list2 = this.f;
        printWriter.println(strConcat + "currentTiles " + list2.size());
        int iJ = 0;
        long jMax = 0L;
        int i = 0;
        for (uii uiiVar : list2) {
            i += uiiVar.i();
            iJ += uiiVar.j();
            jMax = Math.max(jMax, uiiVar.k());
        }
        printWriter.println(strConcat + "maxTilePrepTime " + jMax);
        printWriter.println(strConcat + "glDataSize " + i);
        printWriter.println(strConcat + "javaAndNativeDataSize " + iJ);
        if (abglVar == abgl.GMM_VECTOR_BASE) {
            HashMap map = new HashMap();
            for (uii uiiVar2 : list2) {
                String str2 = "epoch " + uiiVar2.h();
                if (uiiVar2 instanceof uht) {
                    str2 = str2 + " source " + ((uht) uiiVar2).f.name();
                }
                int iIntValue = 1;
                if (map.containsKey(str2)) {
                    iIntValue = 1 + ((Integer) map.get(str2)).intValue();
                }
                map.put(str2, Integer.valueOf(iIntValue));
            }
            printWriter.println(strConcat.concat("  tile breakdown:"));
            for (Map.Entry entry : map.entrySet()) {
                printWriter.println(strConcat + "    " + ((String) entry.getKey()) + " tile count: " + String.valueOf(entry.getValue()));
            }
        }
        printWriter.println(strConcat + "madeCurrentCount " + this.ag);
        uor uorVar = this.H;
        if (uorVar instanceof unb) {
            unb unbVar = (unb) uorVar;
            String strConcat2 = strConcat.concat("  ");
            printWriter.println(strConcat2.concat("DashServerTileStore:"));
            printWriter.print(strConcat2.concat("  counts by tile source: "));
            for (Map.Entry entry2 : unbVar.m.entrySet()) {
                printWriter.print(String.valueOf(entry2.getKey()) + ": " + String.valueOf(entry2.getValue()) + ", ");
            }
            printWriter.println();
            printWriter.println(strConcat2.concat("PaintNetworkTileFetcher:"));
            unbVar.c.b(strConcat2.concat("  "), printWriter);
        }
        if (abglVar == abgl.GMM_BUILDING_3D) {
            for (uii uiiVar3 : list2) {
                if ((uiiVar3 instanceof uht) && (uhbVar = ((uht) uiiVar3).a) != null) {
                    printWriter.println(strConcat + "buildingVertexDebugParams " + uhbVar.toString());
                }
            }
        }
    }

    @Override // defpackage.ufj
    public void k() {
        this.an = true;
        ufr ufrVar = this.B;
        ufrVar.a = ufrVar.b;
        v();
        i();
        this.av = false;
        uvg uvgVar = this.Q;
        uvgVar.f.add(ufrVar);
        uvgVar.k();
    }

    @Override // defpackage.ufj
    public void l() {
        this.an = false;
        ufr ufrVar = this.B;
        ufrVar.a = ufrVar.b;
        ugy ugyVar = this.e;
        ugyVar.i();
        ugyVar.j();
        ugyVar.s();
        h();
        this.av = true;
        w();
    }

    @Override // defpackage.ufj
    public void m(uly ulyVar, boolean z) {
        if (n(ulyVar)) {
            ugy ugyVar = this.e;
            vaq.d();
            if (!ugyVar.b.c(ulyVar)) {
                ugyVar.i();
                synchronized (ugyVar) {
                    ugyVar.m();
                    uly ulyVar2 = ugyVar.b;
                    boolean z2 = true;
                    if (ulyVar2.a.equals(ulyVar.a) && ulyVar2.b == ulyVar.b) {
                        z2 = false;
                    }
                    ugyVar.b = ulyVar;
                    if (z2) {
                        ugyVar.r();
                    }
                }
            }
            if (!this.x) {
                this.e.s();
            }
            this.Q.k();
        }
    }

    @Override // defpackage.ufj
    public final boolean n(uly ulyVar) {
        return !s().c(ulyVar);
    }

    protected uii o(ukp ukpVar, long j, uij uijVar) {
        return this.e.d(ukpVar, j, uijVar);
    }

    protected void p(ttv ttvVar) {
        this.q = ttvVar;
        this.e.a = ttvVar;
    }

    @ResultIgnorabilityUnspecified
    protected boolean q(List list, int i, too tooVar, long j, Set set) {
        boolean z;
        List list2;
        ukp ukpVarB;
        int i2 = 0;
        this.ab = 0;
        this.ax.clear();
        this.ay.clear();
        synchronized (this.G) {
            uij uijVarE = this.e.e();
            int i3 = 1;
            List list3 = list;
            int i4 = 0;
            z = true;
            while (i4 <= i) {
                int size = list3.size();
                int i5 = i2;
                while (i5 < size) {
                    ukp ukpVar = (ukp) list3.get(i5);
                    uii uiiVarO = o(ukpVar, j, uijVarE);
                    if (uiiVarO != null) {
                        P(uiiVarO, set);
                        uiiVarO.t();
                        if (i4 == 0) {
                            this.ab += i3;
                        }
                        list2 = list3;
                    } else {
                        ttv ttvVar = this.q;
                        if (ttvVar != null) {
                            List listC = ttvVar.c(ukpVar, tooVar);
                            int size2 = listC.size();
                            list2 = list3;
                            ArrayList arrayList = new ArrayList();
                            boolean z2 = z;
                            if (size2 == 4) {
                                int size3 = listC.size();
                                int i6 = 0;
                                while (i6 < size3) {
                                    List list4 = listC;
                                    uii uiiVarO2 = o((ukp) listC.get(i6), j, uijVarE);
                                    if (uiiVarO2 != null) {
                                        arrayList.add(uiiVarO2);
                                        i6++;
                                        listC = list4;
                                    } else if (i4 != i || (ukpVarB = this.q.b(ukpVar, tooVar)) == null) {
                                        z = false;
                                        N(arrayList);
                                    } else {
                                        if (!this.ax.contains(ukpVarB)) {
                                            this.ax.add(ukpVarB);
                                        }
                                        z = z2;
                                        N(arrayList);
                                    }
                                }
                                int size4 = arrayList.size();
                                for (int i7 = 0; i7 < size4; i7++) {
                                    P((uii) arrayList.get(i7), set);
                                }
                                z = z2;
                                N(arrayList);
                            } else {
                                if (i4 != i) {
                                }
                                z = false;
                                N(arrayList);
                            }
                        } else {
                            list2 = list3;
                            z = false;
                        }
                    }
                    i5++;
                    list3 = list2;
                    i3 = 1;
                }
                boolean z3 = z;
                if (i4 == i || this.ax.isEmpty()) {
                    z = z3;
                    break;
                }
                list3 = this.ax;
                List list5 = this.ay;
                this.ax = list5;
                this.ay = list3;
                list5.clear();
                i4++;
                z = z3;
                i2 = 0;
                i3 = 1;
            }
        }
        if (this.aa && this.q != null && i > 0) {
            aeug aeugVar = (aeug) set;
            aeul aeulVar = new aeul(aeugVar.j);
            aeuf aeufVar = new aeuf(aeugVar);
            while (aeufVar.hasNext()) {
                aeulVar.add(((uih) aeufVar.next()).o());
            }
            aeuf aeufVar2 = new aeuf(aeugVar);
            while (aeufVar2.hasNext()) {
                uii uiiVar = (uii) aeufVar2.next();
                ukp ukpVarB2 = this.q.b(uiiVar.o(), tooVar);
                int i8 = 0;
                while (true) {
                    if (i8 >= i || ukpVarB2 == null) {
                        break;
                    }
                    if (aeulVar.contains(ukpVarB2)) {
                        aeufVar2.remove();
                        uiiVar.t();
                        break;
                    }
                    ukpVarB2 = this.q.b(ukpVarB2, tooVar);
                    i8++;
                }
            }
        }
        erb erbVar = this.T;
        if (erbVar != null && this.b.equals(abgl.GMM_VECTOR_BASE)) {
            aaem aaemVar = (aaem) erbVar.R(qbo.l);
            aeuf aeufVar3 = new aeuf((aeug) set);
            int i9 = Integer.MAX_VALUE;
            while (true) {
                if (aeufVar3.hasNext()) {
                    int iH = ((uih) aeufVar3.next()).h();
                    if (i9 == Integer.MAX_VALUE) {
                        i9 = iH;
                    } else if (i9 != iH) {
                        if (!aaemVar.o()) {
                            aaemVar.m();
                            return z;
                        }
                    }
                } else if (aaemVar.o()) {
                    aaemVar.n();
                }
            }
        }
        return z;
    }

    public final uly s() {
        return this.e.b;
    }

    public final synchronized void t() {
        this.e.j();
        w();
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("paintTileType", this.b);
        xxgVarAo.b("drawMode", s());
        xxgVarAo.b("fetcher", this.e);
        xxgVarAo.h("allowMultiZoom", this.W);
        xxgVarAo.f("tileSize", 256);
        xxgVarAo.h("isContributingLabels", this.u);
        xxgVarAo.f("maxTileSize", this.a);
        return xxgVarAo.toString();
    }

    public final void u(boolean z) {
        this.A = z;
        this.r = z;
    }

    protected final void v() {
        if (this.q == null) {
            p(this.z.a(this.b, this.a, this.W, this.X));
        }
    }

    public final void w() {
        this.r = true;
        this.v = false;
        this.ap.c(Boolean.valueOf(J()));
        this.Q.k();
    }

    public final synchronized void x() {
        this.am = true;
        this.r = true;
    }

    public final synchronized void y() {
        aezk aezkVar = this.I;
        this.e.n(this.O.c(), ((tre) aezkVar.a()).a());
        uor uorVar = this.H;
        if ((uorVar instanceof unb) && ((unb) uorVar).v()) {
            t();
        }
        this.y = this.J.j(this.b);
    }

    public final void z(ygr ygrVar) {
        if (I()) {
            abgl abglVar = this.b;
            if (abglVar == abgl.GMM_VECTOR_BASE) {
                int i = abglVar.am;
                int i2 = i + i;
                if (ygrVar.contains(Integer.valueOf(i2))) {
                    this.D.g();
                }
                if (ygrVar.contains(Integer.valueOf(i2 | 1))) {
                    this.D.c();
                }
            }
            int i3 = abglVar.am;
            if (ygrVar.contains(Integer.valueOf((i3 + i3) | 1))) {
                this.w = true;
            }
        }
    }

    public void h() {
    }

    public void i() {
    }

    protected void r(Set set) {
    }
}
