package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class inh implements defpackage.jkr, defpackage.jjt {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.WM");
    private static final defpackage.yhx au = defpackage.yhx.r(1, 4, 3, 7);
    public static final java.lang.Byte b = (byte) 1;
    public static final java.lang.Byte c = (byte) 2;
    public static final java.lang.Byte d = (byte) 3;
    public static final java.lang.Byte e = (byte) 4;
    public static final java.lang.Byte f = (byte) 5;
    public boolean A;
    public final java.util.concurrent.atomic.AtomicInteger B;
    public volatile boolean C;
    public double D;
    public volatile boolean E;
    public volatile defpackage.tlk F;
    public final defpackage.yfd G;
    public final java.util.concurrent.atomic.AtomicInteger H;
    public final java.util.concurrent.atomic.AtomicInteger I;
    public final java.util.concurrent.atomic.AtomicInteger J;
    public long K;
    public long L;
    public final java.util.concurrent.atomic.AtomicInteger M;
    public final java.lang.Object N;
    public final java.util.Set O;
    public int P;
    public final defpackage.ivi Q;
    public final defpackage.aba R;
    public final android.util.SparseArray S;
    public final java.util.Queue T;
    public final java.util.List U;
    public final java.lang.Object V;
    public final android.util.SparseArray W;
    public final defpackage.ylx X;
    public final defpackage.jip Y;
    public final defpackage.jeu Z;
    private final defpackage.imk aA;
    private android.content.BroadcastReceiver aB;
    private java.lang.Thread aC;
    private final boolean aD;
    private final defpackage.iwe aE;
    private final defpackage.iwg aF;
    private volatile boolean aG;
    private boolean aH;
    private float aI;
    private float aJ;
    private final boolean aK;
    private final boolean aL;
    private final java.util.concurrent.atomic.AtomicInteger aM;
    private final int[] aN;
    private com.google.android.gms.car.display.CarRegionId aO;
    private int aP;
    private boolean aQ;
    private final java.util.Map aR;
    private final android.util.SparseArray aS;
    private final android.util.SparseBooleanArray aT;
    private int aU;
    private final java.util.List aV;
    private final android.os.Handler aW;
    private final java.util.Map aX;
    private final java.util.Map aY;
    private final java.util.List aZ;
    public final defpackage.xzi aa;
    public final java.lang.Object ab;
    public final java.util.ArrayList ac;
    public final java.util.Set ad;
    public volatile defpackage.tlk ae;
    public final com.google.android.gms.car.display.CarDisplayId af;
    public final defpackage.jfo ag;
    public defpackage.jkv ah;
    public final defpackage.jko ai;
    public final defpackage.jgq aj;
    public final java.util.concurrent.atomic.AtomicLong ak;
    public final defpackage.jkf al;
    public final defpackage.jjz am;
    public final boolean an;
    public final boolean ao;
    public final defpackage.jkb ap;
    public final defpackage.jje aq;
    public final defpackage.raa ar;
    public final defpackage.nub as;
    final defpackage.izq at;
    private final boolean av;
    private final defpackage.jkq aw;
    private final defpackage.jfd ax;
    private final defpackage.jfe ay;
    private final defpackage.iya az;
    private final defpackage.ikk ba;
    private final defpackage.jkx bb;
    private final defpackage.iuz bc;
    private final defpackage.jkl bd;
    private final defpackage.xzg be;
    private final defpackage.jgv bf;
    private final boolean bg;
    private defpackage.ldx bh;
    private defpackage.ldx bi;
    public final defpackage.xzi g;
    public final boolean h;
    public final boolean i;
    public final double j;
    public boolean k;
    public final android.content.Context l;
    public final defpackage.ilj m;
    public final android.content.SharedPreferences.OnSharedPreferenceChangeListener n;
    public boolean o;
    public volatile android.view.Surface p;
    public java.util.concurrent.Semaphore q;
    public android.os.Looper r;
    public volatile defpackage.ina s;
    public final java.util.concurrent.Semaphore t;
    public volatile java.util.UUID u;
    public defpackage.yhx v;
    public volatile defpackage.jhi w;
    public final defpackage.jjv x;
    public int y;
    public volatile boolean z;

    public inh(defpackage.jkq jkqVar, android.content.Context context, defpackage.jfa jfaVar, defpackage.jfd jfdVar, defpackage.ilj iljVar, defpackage.jfe jfeVar, defpackage.ivi iviVar, defpackage.ikk ikkVar, defpackage.iya iyaVar, defpackage.jeu jeuVar, defpackage.xzi xziVar, com.google.android.gms.car.display.CarDisplayId carDisplayId, defpackage.jfo jfoVar, defpackage.imk imkVar, defpackage.jgq jgqVar, defpackage.iuz iuzVar, defpackage.nub nubVar) {
        jka jkaVar = defpackage.a.O() ? new jka() : new defpackage.jjy();
        boolean zF = defpackage.afga.f(defpackage.acpp.a.fF().d(), "system_theme");
        this.av = zF;
        this.g = defpackage.ysr.aQ(new defpackage.imy(0));
        this.j = android.os.Build.VERSION.SDK_INT >= 36 ? defpackage.acwv.c() : 0.5d;
        this.k = false;
        defpackage.ilq ilqVar = new defpackage.ilq(this, 2);
        this.n = ilqVar;
        this.t = new java.util.concurrent.Semaphore(1);
        this.aG = false;
        this.z = false;
        this.B = new java.util.concurrent.atomic.AtomicInteger(0);
        this.C = false;
        this.aI = 0.0f;
        this.aJ = 0.0f;
        this.E = false;
        this.F = new defpackage.tlk(0, 0);
        this.H = new java.util.concurrent.atomic.AtomicInteger(0);
        this.I = new java.util.concurrent.atomic.AtomicInteger(0);
        this.J = new java.util.concurrent.atomic.AtomicInteger(0);
        this.M = new java.util.concurrent.atomic.AtomicInteger(0);
        this.aM = new java.util.concurrent.atomic.AtomicInteger(0);
        this.aN = new int[6];
        this.N = new java.lang.Object();
        this.O = new java.util.HashSet();
        this.P = 0;
        this.bh = new defpackage.ldx((byte[]) null, (byte[]) null, (byte[]) null);
        this.aP = -1;
        this.aQ = true;
        this.aR = new java.util.HashMap();
        this.aS = new android.util.SparseArray();
        this.R = new defpackage.aba(0);
        this.aT = new android.util.SparseBooleanArray();
        this.S = new android.util.SparseArray();
        this.T = new java.util.PriorityQueue(new defpackage.azq(8));
        this.U = new java.util.ArrayList();
        this.V = new java.lang.Object();
        this.W = new android.util.SparseArray();
        this.X = new defpackage.ydg(12, 3);
        this.aV = new java.util.ArrayList();
        this.aW = new defpackage.stq(android.os.Looper.getMainLooper(), (byte[]) null);
        this.aX = new java.util.HashMap();
        this.aY = new java.util.HashMap();
        this.ab = new java.lang.Object();
        this.ac = new java.util.ArrayList();
        this.ad = new android.util.ArraySet();
        this.ae = new defpackage.tlk(0, 0);
        this.aZ = new java.util.ArrayList();
        this.ak = new java.util.concurrent.atomic.AtomicLong(0L);
        defpackage.xzo xzoVar = defpackage.xxd.a;
        this.be = new defpackage.xzg(xzoVar);
        defpackage.acwv acwvVar = defpackage.acwv.a;
        this.an = acwvVar.fF().v();
        this.bg = acwvVar.fF().k();
        defpackage.izq izqVar = new defpackage.izq(this);
        this.at = izqVar;
        defpackage.omv.g(context, "com.google.android.gms.car.PROJECTION_WINDOW_MANAGER", defpackage.rsr.a.ordinal(), null);
        this.ba = ikkVar;
        com.google.android.gms.car.CarUiInfo carUiInfo = ikkVar.m;
        carUiInfo.getClass();
        boolean zL = defpackage.epv.l(((defpackage.imi) jfaVar).v(false));
        this.i = zL;
        this.aw = jkqVar;
        this.ao = defpackage.edd.g();
        this.ar = new defpackage.raa(this, jfeVar);
        this.Z = jeuVar;
        com.google.android.gms.car.CarInfo carInfoT = jfaVar.t();
        defpackage.absx absxVarJ = acwvVar.fF().j();
        defpackage.yqm yqmVar = defpackage.kjl.a;
        j$.util.stream.Stream streamD = defpackage.tht.d(new defpackage.ilz(16), absxVarJ);
        int i = defpackage.ygw.d;
        boolean zH = defpackage.kjl.h(carInfoT, (defpackage.ygw) streamD.collect(defpackage.yds.a));
        this.aD = zH;
        jjx jjxVar = zH ? new jjx(this) : new defpackage.jjw(this);
        this.x = jjxVar;
        this.l = context;
        this.as = nubVar;
        defpackage.iwe iweVar = new defpackage.iwe(jjxVar, carInfoT);
        this.aE = iweVar;
        iweVar.a(false, false);
        this.aF = new defpackage.iwg(jjxVar);
        this.Q = iviVar;
        this.bb = new defpackage.jkx(this, jfaVar, jfoVar);
        this.bd = new defpackage.jkl(this);
        this.ax = jfdVar;
        this.m = iljVar;
        iljVar.d(ilqVar);
        this.ay = jfeVar;
        this.az = iyaVar;
        this.aa = xziVar;
        if (zL) {
            this.Y = new defpackage.jin(this);
        } else {
            defpackage.izq izqVar2 = new defpackage.izq(this);
            defpackage.izq izqVar3 = new defpackage.izq(this, null);
            defpackage.yqm yqmVar2 = defpackage.ium.a;
            this.Y = new defpackage.jit(this, izqVar3, izqVar2);
        }
        this.af = carDisplayId;
        this.ag = jfoVar;
        this.aA = imkVar;
        defpackage.jko jkoVar = new defpackage.jko(this, jeuVar, jfoVar);
        this.ai = jkoVar;
        boolean zO = ikkVar.o();
        this.aK = zO;
        this.aL = (!defpackage.acvb.a.fF().i() || !carUiInfo.a || carUiInfo.f || zO || carUiInfo.b) ? false : true;
        this.G = new defpackage.yfd(300);
        this.A = carUiInfo.b;
        defpackage.nub nubVar2 = new defpackage.nub((java.lang.Object) null);
        com.google.android.gms.car.display.CarRegionId carRegionId = new com.google.android.gms.car.display.CarRegionId(6, carDisplayId);
        context.getClass();
        defpackage.jki jkiVar = new defpackage.jki(this, carRegionId);
        xzoVar.getClass();
        this.al = (defpackage.jkf) nubVar2.i(new defpackage.jkg(jkiVar, context, xzoVar));
        this.k = iljVar.n();
        this.aO = new com.google.android.gms.car.display.CarRegionId(0, carDisplayId);
        this.aj = jgqVar;
        this.am = jkaVar;
        defpackage.jgv jgvVar = new defpackage.jgv(izqVar);
        defpackage.ilu iluVar = new defpackage.ilu(this, 12);
        jgt jgyVar = (android.os.Build.VERSION.SDK_INT < 36 || !defpackage.hnj.a()) ? new defpackage.jgy(jgvVar, carDisplayId, iluVar) : new jgt(jgvVar, iluVar);
        defpackage.ysr.bk(jgvVar.b == null, "set strategy must only be called once");
        jgvVar.b = jgyVar;
        this.bf = jgvVar;
        this.h = new defpackage.jbx(carInfoT.e, carInfoT.f).E(6, 0);
        defpackage.jkb jkbVar = new defpackage.jkb();
        this.ap = jkbVar;
        if (zL) {
            this.aq = new defpackage.jjj(context, new defpackage.izq(this, null), b(), zF);
        } else {
            this.aq = new defpackage.jjc(context, jkbVar, jkoVar, jfeVar.i() == 0 ? 1 : 0, zF);
        }
        this.bc = iuzVar;
    }

    private final void aA(defpackage.jhl jhlVar) {
        ((defpackage.yqj) a.l().ai((char) 473)).y("Canceling animations for window %s", jhlVar.aO());
        this.Y.d(jhlVar);
    }

    private final void aB() {
        this.aV.clear();
    }

    private final void aC(defpackage.jhl jhlVar, boolean z, boolean z2, int i, android.graphics.Rect rect) {
        if (jhlVar == null) {
            return;
        }
        if (z && z2) {
            ((defpackage.yqj) a.l().ai((char) 492)).u("Not dispatching window focus gain due to touch event");
        } else {
            jhlVar.X(new com.google.android.gms.car.InputFocusChangedEvent(z, this.A, i, rect));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    private final void aD(defpackage.jhl jhlVar, int i, int i2, defpackage.ina inaVar, android.graphics.Rect rect, jhq jhqVar, int i3, int i4, defpackage.jik jikVar, defpackage.jik jikVar2, int i5, int i6, java.util.List list, com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams, java.util.UUID uuid, android.graphics.Rect rect2, int i7) {
        int i8;
        jhq jhqVar2;
        int iHeight;
        int i9;
        int i10;
        int i11;
        int i12 = this.w.f;
        if (i != 1) {
            if (i == 7 || i == 3) {
                iHeight = this.w.g;
                i11 = 0;
                i10 = 0;
                i9 = i12;
                jhqVar2 = null;
                i8 = i5;
            } else {
                if (i != 4) {
                    throw new java.lang.RuntimeException(defpackage.a.bo(i, "no layout specified for window layer "));
                }
                i8 = i5 | 48;
            }
            if (i == 7) {
                i8 |= 192;
            }
            jhlVar.al(i11, i10, i9, iHeight, i2, jhqVar2, i3, i4, jikVar, jikVar2, i8, i6, list, projectionWindowDecorationParams, uuid, rect2, i7);
            inaVar.g(jhlVar);
        }
        i8 = i5;
        int i13 = rect.left;
        int i14 = this.w.g - rect.bottom;
        int iWidth = rect.width();
        jhqVar2 = jhqVar;
        i10 = i14;
        iHeight = rect.height();
        i11 = i13;
        i9 = iWidth;
        if (i == 7) {
            i8 |= 192;
        }
        jhlVar.al(i11, i10, i9, iHeight, i2, jhqVar2, i3, i4, jikVar, jikVar2, i8, i6, list, projectionWindowDecorationParams, uuid, rect2, i7);
        inaVar.g(jhlVar);
    }

    private final synchronized void aE(defpackage.jhl jhlVar) {
        while (true) {
            android.util.SparseBooleanArray sparseBooleanArray = this.aT;
            if (sparseBooleanArray.size() > 0) {
                int size = sparseBooleanArray.size() - 1;
                int iKeyAt = sparseBooleanArray.keyAt(size);
                boolean zValueAt = sparseBooleanArray.valueAt(size);
                sparseBooleanArray.delete(iKeyAt);
                android.view.KeyEvent keyEvent = new android.view.KeyEvent(0L, 0L, 1, iKeyAt, 0, this.aU, 0, 0, 4);
                if (!zValueAt || jhlVar == null) {
                    ai(this.bh.r(), keyEvent);
                } else {
                    jhlVar.N(keyEvent);
                }
            }
        }
    }

    private final void aF() {
        defpackage.zbd zbdVar;
        synchronized (this.V) {
            if (this.X.A()) {
                zbdVar = defpackage.zbd.Lh;
            } else {
                zbdVar = this.aV.isEmpty() ? defpackage.zbd.Li : defpackage.zbd.Lj;
            }
        }
        defpackage.rqt.a(this.l).c(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.PROJECTION_WINDOW_MANAGER, zbdVar).l());
    }

    private final synchronized void aG(defpackage.jhl jhlVar, defpackage.jhl jhlVar2) {
        aK(jhlVar, jhlVar2, false, -1, null);
    }

    private final synchronized void aH(defpackage.jhl jhlVar, boolean z) {
        aJ(jhlVar, z, -1, null);
    }

    private final synchronized void aJ(defpackage.jhl jhlVar, boolean z, int i, android.graphics.Rect rect) throws java.lang.Throwable {
        try {
            try {
                aK(l(), jhlVar, z, i, rect);
            } catch (java.lang.Throwable th) {
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private final synchronized void aK(defpackage.jhl jhlVar, defpackage.jhl jhlVar2, boolean z, int i, android.graphics.Rect rect) throws java.lang.Throwable {
        try {
            if (!this.C) {
                ((defpackage.yqj) a.l().ai((char) 592)).M("Not switching window input focus, composition is not running. toWindow: %s, fromWindow: %s", jhlVar2, jhlVar);
                return;
            }
            if (jhlVar2 == null) {
                ((defpackage.yqj) a.l().ai((char) 591)).y("Not switching window input focus, toWindow is null. fromWindow: %s", jhlVar);
                return;
            }
            if (jhlVar2 == jhlVar) {
                ((defpackage.yqj) a.l().ai((char) 590)).y("Not switching window input focus, toWindow same as fromWindow: %s", jhlVar2);
                return;
            }
            com.google.android.gms.car.CarUiInfo carUiInfoO = o();
            if (!carUiInfoO.b && !carUiInfoO.a && !carUiInfoO.d) {
                ((defpackage.yqj) a.l().ai((char) 589)).u("Not switching window input focus, no input possible for window");
                return;
            }
            aE(jhlVar);
            ((defpackage.yqj) a.l().ai(588)).T("Moving input focus from [region: %s, z: %s]  to [region: %s, z: %d] with rect %s", jhlVar != null ? jhlVar.D() : "[null]", jhlVar != null ? java.lang.Integer.valueOf(jhlVar.i()) : "[null]", jhlVar2.D(), java.lang.Integer.valueOf(jhlVar2.i()), rect);
            try {
                aC(jhlVar, false, z, -1, null);
                aC(jhlVar2, true, z, i, rect);
                this.aO = jhlVar2.D();
                this.bh.t(jhlVar2);
                this.aP = i;
            } catch (java.lang.Throwable th) {
                th = th;
                this = this;
                java.lang.Throwable th2 = th;
                throw th2;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    private final void aL() {
        defpackage.ina inaVar = this.s;
        if (inaVar != null) {
            inaVar.e();
        }
    }

    private final boolean aM(defpackage.jhl jhlVar) {
        if (jhlVar == null || jhlVar.D() == null) {
            return false;
        }
        return this.aA.d(jhlVar.D());
    }

    private static boolean aN(int i, int i2, defpackage.jhl jhlVar) {
        return jhlVar != null && jhlVar.aE() && jhlVar.az(1) && jhlVar.ay(i, i2) && jhlVar.ba();
    }

    private final boolean aO(defpackage.jhl jhlVar) {
        boolean zRemove;
        android.util.SparseArray sparseArray = this.W;
        int i = jhlVar.i();
        java.util.List list = (java.util.List) sparseArray.get(i);
        if (list != null) {
            zRemove = list.remove(jhlVar);
            if (zRemove && list.isEmpty()) {
                sparseArray.remove(i);
            }
        } else {
            zRemove = false;
        }
        this.X.C(jhlVar.D(), jhlVar);
        return zRemove;
    }

    private final boolean aP(defpackage.jhl jhlVar) {
        defpackage.jhl jhlVarR = this.bh.r();
        return jhlVarR != null && jhlVar.n().contains(jhlVarR.n()) && jhlVar.h() >= jhlVarR.h();
    }

    private static final boolean aQ(defpackage.jik jikVar) {
        return (jikVar == null || jikVar.b == null) ? false : true;
    }

    private static final void aR(java.io.PrintWriter printWriter, android.util.SparseArray sparseArray, android.util.SparseArray sparseArray2, java.util.Collection collection) {
        for (int i = 0; i < sparseArray.size(); i++) {
            java.util.List list = (java.util.List) sparseArray.valueAt(i);
            printWriter.println("z " + sparseArray.keyAt(i));
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((defpackage.jhl) it.next()).aS(printWriter);
                }
            }
        }
        printWriter.println("Active windows by z -- order used for focus: ");
        int size = sparseArray2.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            java.util.List<defpackage.jhl> list2 = (java.util.List) sparseArray2.valueAt(size);
            printWriter.printf("z: %d\n", java.lang.Integer.valueOf(sparseArray2.keyAt(size)));
            if (list2 != null) {
                for (defpackage.jhl jhlVar : list2) {
                    if (jhlVar != null) {
                        jhlVar.aS(printWriter);
                    }
                }
            }
        }
        printWriter.println("Windows by region: ");
        java.util.Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            defpackage.jhl jhlVar2 = (defpackage.jhl) it2.next();
            if (jhlVar2 != null) {
                jhlVar2.aS(printWriter);
            }
        }
    }

    private final android.graphics.Rect ar(defpackage.jhl jhlVar, defpackage.jhl jhlVar2, android.graphics.Rect rect) {
        int iF = this.av ? jhlVar.f() : 1;
        if (jhlVar.b() > jhlVar2.b() || jhlVar.b() + jhlVar.k() < jhlVar2.b() + jhlVar2.k()) {
            if (jhlVar.c() <= jhlVar2.c() && jhlVar.c() + jhlVar.d() >= jhlVar2.c() + jhlVar2.d()) {
                if (jhlVar.b() <= jhlVar2.b()) {
                    iF = 2;
                } else if (jhlVar.b() + jhlVar.k() >= jhlVar2.b() + jhlVar2.k()) {
                    iF = 4;
                }
            }
        } else if (jhlVar.c() <= jhlVar2.c()) {
            iF = 16;
        } else if (jhlVar.c() + jhlVar.d() >= jhlVar2.c() + jhlVar2.d()) {
            iF = 8;
        }
        if (iF == 1) {
            throw new java.lang.IllegalStateException(defpackage.a.bK(jhlVar2, jhlVar, "Window ", " does not mostly cover or provide a hint for one side of "));
        }
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        android.graphics.Rect rectS = jhlVar.s();
        if (rectS == null) {
            rectS = new android.graphics.Rect();
        }
        if (iF != 1) {
            if (iF != 2) {
                if (iF == 4) {
                    rect2.right = java.lang.Math.max(rect.right, ((jhlVar2.b() + jhlVar2.k()) - jhlVar.b()) - rectS.left);
                    return rect2;
                }
                if (iF == 8) {
                    rect2.top = java.lang.Math.max(rect.top, ((jhlVar2.c() + jhlVar2.d()) - jhlVar.c()) - rectS.bottom);
                    return rect2;
                }
                if (iF != 16) {
                    ((defpackage.yqj) a.l().ai((char) 464)).w("Invalid inset direction %d provided.", iF);
                    return rect2;
                }
                rect2.bottom = java.lang.Math.max(rect.bottom, ((jhlVar.c() + jhlVar.d()) - jhlVar2.c()) - rectS.top);
                return rect2;
            }
            rect2.left = java.lang.Math.max(rect.left, ((jhlVar.b() + jhlVar.k()) - jhlVar2.b()) - rectS.right);
        }
        return rect2;
    }

    private final defpackage.dzp as(defpackage.jhl jhlVar) {
        for (defpackage.dzp dzpVar : this.aV) {
            if (dzpVar.b == jhlVar) {
                return dzpVar;
            }
        }
        return null;
    }

    private final defpackage.jhl at(defpackage.jhl jhlVar) {
        defpackage.jhl jhlVar2;
        ((defpackage.yqj) a.l().ai((char) 477)).y("Computing next highest focusable window from window %s", jhlVar);
        synchronized (this.V) {
            jhlVar2 = null;
            for (defpackage.dzp dzpVar : this.aV) {
                if (jhlVar == null || ((defpackage.jhl) dzpVar.b).i() <= jhlVar.i()) {
                    defpackage.jhl jhlVar3 = (defpackage.jhl) dzpVar.b;
                    if (!jhlVar3.ax(1) && !jhlVar3.ax(512) && (jhlVar2 == null || jhlVar2.i() < jhlVar3.i())) {
                        jhlVar2 = jhlVar3;
                    }
                }
            }
        }
        return jhlVar2;
    }

    private final defpackage.jhl au(defpackage.jhl jhlVar, int i, boolean z) {
        return m(this.w, this.aV, jhlVar, i, z, null);
    }

    private final java.util.Collection av(com.google.android.gms.car.display.CarRegionId carRegionId, boolean z) {
        if (!z) {
            return ((defpackage.ybx) this.X).c(carRegionId);
        }
        defpackage.ygw ygwVarB = this.aA.b(carRegionId);
        defpackage.ybx ybxVar = (defpackage.ybx) this.X;
        java.util.List listC = ybxVar.c(carRegionId);
        if (!listC.isEmpty()) {
            ax(ygwVarB);
            return listC;
        }
        int size = ygwVarB.size();
        int i = 0;
        while (i < size) {
            java.util.List listC2 = ybxVar.c((com.google.android.gms.car.display.CarRegionId) ygwVarB.get(i));
            i++;
            if (!listC2.isEmpty()) {
                return listC2;
            }
        }
        return listC;
    }

    private final void aw(defpackage.jhl jhlVar, int i) {
        android.util.SparseArray sparseArray = this.W;
        java.util.List arrayList = (java.util.List) sparseArray.get(i);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            sparseArray.put(i, arrayList);
        }
        arrayList.add(jhlVar);
        java.util.List listC = ((defpackage.ybx) this.X).c(jhlVar.D());
        int i2 = 0;
        while (i2 < listC.size() && jhlVar.i() < ((defpackage.jhl) listC.get(i2)).i()) {
            i2++;
        }
        listC.add(i2, jhlVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ax(defpackage.ygw ygwVar) {
        int size = ygwVar.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.car.display.CarRegionId carRegionId = (com.google.android.gms.car.display.CarRegionId) ygwVar.get(i);
            java.util.List listC = ((defpackage.ybx) this.X).c(carRegionId);
            defpackage.ysr.bp(listC.isEmpty(), "Region %s has windows %s which should not exist", carRegionId, listC);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c8  */
    private final synchronized void ay(defpackage.jhl jhlVar, int i, defpackage.jhl jhlVar2) throws java.lang.Throwable {
        boolean z;
        defpackage.jhl jhlVarR;
        defpackage.ldx ldxVar;
        defpackage.ldx ldxVar2;
        try {
            int iJ = jhlVar.j();
            boolean z2 = true;
            if (iJ != 1 && iJ != 0) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 467)).y("attachProjectionWindow while window is in wrong state: %s", jhlVar);
                try {
                    R(jhlVar, null, null, true, true, false, null);
                    jhlVar.ac();
                    return;
                } catch (java.lang.Throwable th) {
                    th = th;
                    this = this;
                    java.lang.Throwable th2 = th;
                    throw th2;
                }
            }
            synchronized (this.V) {
                ax(this.aA.b(jhlVar.D()));
                aw(jhlVar, jhlVar.i());
                az();
            }
            jhlVar.ad();
            defpackage.yqm yqmVar = a;
            ((defpackage.yqj) yqmVar.l().ai((char) 465)).y("window attached %s", jhlVar);
            java.util.List list = this.aZ;
            if (list.contains(jhlVar)) {
                list.remove(jhlVar);
                if (list.isEmpty()) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 520)).u("Attaching the last window which was active before losing video focus.");
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z && (ldxVar2 = this.bi) != null) {
                jhlVarR = ldxVar2.r();
            } else if ((i & 1) == 0 && (i & 512) == 0 && af(jhlVar, false)) {
                if (this.aw.f() && !jhlVar.ax(1024)) {
                    if (jhlVar.ax(32) || aP(jhlVar)) {
                        if (this.A) {
                            jhlVarR = null;
                            z2 = false;
                        }
                    } else if ((l() != null || !this.aQ) && (!aM(jhlVar) || !aM(jhlVar2))) {
                        jhlVarR = null;
                        z2 = false;
                    }
                }
                jhlVarR = jhlVar;
            } else {
                jhlVarR = null;
                z2 = false;
            }
            if (z2) {
                Z(jhlVarR);
            } else {
                ((defpackage.yqj) yqmVar.l().ai((char) 466)).y("Not switching input focus to %s", jhlVar.F());
            }
            if (!z || (ldxVar = this.bi) == null) {
                return;
            }
            this.bh = ldxVar;
            this.bi = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            java.lang.Throwable th4 = th;
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void az() {
        defpackage.ygw ymxVar;
        aB();
        android.graphics.Region region = new android.graphics.Region();
        android.util.SparseArray sparseArray = this.W;
        int size = sparseArray.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            for (defpackage.jhl jhlVar : (java.util.List) sparseArray.valueAt(size)) {
                if (!jhlVar.ax(64)) {
                    android.graphics.Rect rectN = jhlVar.n();
                    if (defpackage.acwv.a.fF().o()) {
                        android.graphics.Rect rectT = jhlVar.t();
                        rectN.left += rectT.left;
                        rectN.right -= rectT.right;
                        rectN.top += rectT.top;
                        rectN.bottom -= rectT.bottom;
                    }
                    android.graphics.Region region2 = new android.graphics.Region(rectN);
                    region2.op(region, android.graphics.Region.Op.DIFFERENCE);
                    if (region2.isEmpty()) {
                        int i = defpackage.ygw.d;
                        ymxVar = defpackage.ymx.a;
                    } else if (jhlVar.ax(2048) && region2.isComplex()) {
                        android.graphics.Rect bounds = region.getBounds();
                        int i2 = defpackage.ygw.d;
                        defpackage.ygr ygrVar = new defpackage.ygr(4);
                        if (rectN.left < bounds.left) {
                            ygrVar.i(new android.graphics.Rect(rectN.left, bounds.top, bounds.left, bounds.bottom));
                        }
                        if (rectN.right > bounds.right) {
                            ygrVar.i(new android.graphics.Rect(bounds.right, bounds.top, rectN.right, bounds.bottom));
                        }
                        if (rectN.top < bounds.top) {
                            ygrVar.i(new android.graphics.Rect(rectN.left, rectN.top, rectN.right, bounds.top));
                        }
                        if (rectN.bottom > bounds.bottom) {
                            ygrVar.i(new android.graphics.Rect(rectN.left, bounds.bottom, rectN.right, rectN.bottom));
                        }
                        ymxVar = ygrVar.g();
                    } else {
                        android.graphics.Rect bounds2 = region2.getBounds();
                        int i3 = defpackage.ygw.d;
                        java.lang.Object[] objArr = {bounds2};
                        defpackage.ysr.B(objArr, 1);
                        ymxVar = new defpackage.ymx(objArr, 1);
                    }
                    for (int i4 = 0; i4 < ((defpackage.ymx) ymxVar).c; i4++) {
                        this.aV.add(new defpackage.dzp((android.graphics.Rect) ymxVar.get(i4), jhlVar));
                    }
                    if (!ymxVar.isEmpty()) {
                        region.op(rectN, android.graphics.Region.Op.UNION);
                    }
                    if (true == jhlVar.ax(16)) {
                        size = 0;
                    }
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.aV);
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            defpackage.jhl jhlVar2 = (defpackage.jhl) ((defpackage.dzp) arrayList.get(i5)).b;
            int i6 = au(jhlVar2, 21, false) != null ? 1 : 0;
            if (au(jhlVar2, 19, false) != null) {
                i6 |= 2;
            }
            if (au(jhlVar2, 22, false) != null) {
                i6 |= 4;
            }
            if (au(jhlVar2, 20, false) != null) {
                i6 |= 8;
            }
            com.google.android.gms.car.CarWindowManagerLayoutParams carWindowManagerLayoutParamsB = jhlVar2.B();
            if (i6 != carWindowManagerLayoutParamsB.a) {
                carWindowManagerLayoutParamsB.a = i6;
                jhlVar2.ap(carWindowManagerLayoutParamsB);
            }
        }
    }

    static defpackage.jhl m(defpackage.jhi jhiVar, java.util.List list, defpackage.jhl jhlVar, final int i, boolean z, android.graphics.Rect rect) {
        boolean z2;
        int i2;
        boolean zIntersects;
        if (defpackage.acvb.a.fF().i()) {
            if (i == 260) {
                i = 19;
            } else if (i == 261) {
                i = 20;
            }
        }
        java.util.Collections.sort(list, new java.util.Comparator() { // from class: ims
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int iH;
                int iH2;
                defpackage.dzp dzpVar = (defpackage.dzp) obj;
                defpackage.dzp dzpVar2 = (defpackage.dzp) obj2;
                defpackage.yqm yqmVar = defpackage.inh.a;
                int i3 = i;
                if (i3 == 20) {
                    int i4 = ((android.graphics.Rect) dzpVar.a).top - ((android.graphics.Rect) dzpVar2.a).top;
                    if (i4 != 0) {
                        return i4;
                    }
                    iH = ((defpackage.jhl) dzpVar2.b).h();
                    iH2 = ((defpackage.jhl) dzpVar.b).h();
                } else if (i3 == 19) {
                    int i5 = ((android.graphics.Rect) dzpVar2.a).bottom - ((android.graphics.Rect) dzpVar.a).bottom;
                    if (i5 != 0) {
                        return i5;
                    }
                    iH = ((defpackage.jhl) dzpVar2.b).h();
                    iH2 = ((defpackage.jhl) dzpVar.b).h();
                } else if (i3 == 21) {
                    int i6 = ((android.graphics.Rect) dzpVar2.a).right - ((android.graphics.Rect) dzpVar.a).right;
                    if (i6 != 0) {
                        return i6;
                    }
                    iH = ((defpackage.jhl) dzpVar2.b).h();
                    iH2 = ((defpackage.jhl) dzpVar.b).h();
                } else {
                    int i7 = ((android.graphics.Rect) dzpVar.a).left - ((android.graphics.Rect) dzpVar2.a).left;
                    if (i7 != 0) {
                        return i7;
                    }
                    iH = ((defpackage.jhl) dzpVar2.b).h();
                    iH2 = ((defpackage.jhl) dzpVar.b).h();
                }
                return iH - iH2;
            }
        });
        defpackage.jhl jhlVar2 = null;
        boolean z3 = false;
        defpackage.dzp dzpVar = null;
        int i3 = 0;
        while (i3 < list.size()) {
            dzpVar = (defpackage.dzp) list.get(i3);
            if (dzpVar.b == jhlVar) {
                break;
            }
            i3++;
        }
        if (i == 19) {
            z2 = true;
        } else if (i == 20) {
            z2 = true;
            i = 20;
        } else {
            z2 = false;
        }
        boolean z4 = i == 20 || i == 22;
        if (dzpVar == null) {
            i3 = -1;
            if (z4) {
                z3 = z2;
                i2 = -1;
            } else if (z2) {
                i2 = jhiVar.g;
                z3 = true;
            } else {
                i2 = jhiVar.f;
            }
        } else if (z2) {
            i2 = ((android.graphics.Rect) dzpVar.a).top;
            z3 = true;
        } else {
            i2 = ((android.graphics.Rect) dzpVar.a).left;
        }
        android.graphics.Rect rect2 = new android.graphics.Rect();
        for (int i4 = i3 + 1; i4 >= 0 && i4 < list.size(); i4++) {
            defpackage.dzp dzpVar2 = (defpackage.dzp) list.get(i4);
            if (!z || ((defpackage.jhl) dzpVar2.b).ax(4)) {
                int i5 = z3 ? ((android.graphics.Rect) dzpVar2.a).top : ((android.graphics.Rect) dzpVar2.a).left;
                if ((z4 && i5 > i2) || (!z4 && i5 < i2)) {
                    if (rect == null) {
                        return (defpackage.jhl) dzpVar2.b;
                    }
                    if (z3) {
                        android.graphics.Rect rect3 = (android.graphics.Rect) dzpVar2.a;
                        rect2.set(rect.left, rect3.top, rect.right, rect3.bottom);
                        zIntersects = android.graphics.Rect.intersects(rect2, rect3);
                    } else {
                        android.graphics.Rect rect4 = (android.graphics.Rect) dzpVar2.a;
                        rect2.set(rect4.left, rect.top, rect4.right, rect.bottom);
                        zIntersects = android.graphics.Rect.intersects(rect2, rect4);
                    }
                    if (zIntersects) {
                        return (defpackage.jhl) dzpVar2.b;
                    }
                    if (jhlVar2 == null) {
                        jhlVar2 = (defpackage.jhl) dzpVar2.b;
                    }
                }
            }
        }
        return jhlVar2;
    }

    @Override // defpackage.jjt
    public final void A(int i) {
        if (this.C) {
            this.Q.u(i);
            synchronized (this.V) {
                int i2 = 0;
                while (true) {
                    android.util.SparseArray sparseArray = this.W;
                    if (i2 < sparseArray.size()) {
                        for (defpackage.jhl jhlVar : (java.util.List) sparseArray.valueAt(i2)) {
                            if (jhlVar != null) {
                                jhlVar.V(i);
                            }
                        }
                        i2++;
                    }
                }
            }
        }
    }

    public final void B(defpackage.jhl jhlVar, long j, long j2, int i, java.util.List list) {
        defpackage.jhl jhlVarR;
        synchronized (this) {
            jhlVarR = this.bh.r();
        }
        if (jhlVar != jhlVarR) {
            aH(jhlVar, true);
        }
        this.am.b(j2, i, list);
        jhlVar.aI(j, j2, i, list);
    }

    @Override // defpackage.ivo
    public final void C() {
        j$.util.Optional optionalOf;
        long andSet = this.ak.getAndSet(0L);
        if (andSet != 0) {
            this.ag.f(defpackage.zbe.PROJECTION_WINDOW_MANAGER, defpackage.zbd.Hk, (android.os.SystemClock.elapsedRealtimeNanos() - andSet) / 1000000);
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.B;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        int i = 0;
        if (iDecrementAndGet < 0) {
            atomicInteger.set(0);
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 530)).w("negative remaining frames:%d", iDecrementAndGet);
        }
        defpackage.jko jkoVar = this.ai;
        defpackage.nub nubVar = jkoVar.q;
        long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        defpackage.jkm jkmVarB = nubVar.b();
        if (jkmVarB == null) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.jko.a.h()).ai((char) 2253)).u("Too many onFrameSent callbacks!");
            optionalOf = j$.util.Optional.empty();
        } else {
            jkmVarB.f = jElapsedRealtimeNanos;
            j$.time.Duration durationOfNanos = j$.time.Duration.ofNanos(jkmVarB.d - jkmVarB.c);
            if (jkmVarB.e != 0) {
                jElapsedRealtimeNanos = jkmVarB.e;
            }
            defpackage.jkn jknVar = new defpackage.jkn(durationOfNanos, j$.time.Duration.ofNanos(jElapsedRealtimeNanos - jkmVarB.d), j$.time.Duration.ofNanos(jkmVarB.c - jkmVarB.b));
            jkoVar.d();
            optionalOf = j$.util.Optional.of(jknVar);
        }
        defpackage.imv imvVar = new defpackage.imv(this, i);
        if (true == optionalOf.isPresent()) {
            java.lang.Object obj = optionalOf.get();
            defpackage.inh inhVar = (defpackage.inh) imvVar.a;
            defpackage.jdy jdyVar = inhVar.Z.j;
            if (jdyVar instanceof defpackage.jev) {
                defpackage.jev jevVar = (defpackage.jev) jdyVar;
                defpackage.jkn jknVar2 = (defpackage.jkn) obj;
                jevVar.t(jknVar2.a);
                jevVar.s(jknVar2.c);
                if (!inhVar.h) {
                    jevVar.u(jknVar2.b);
                }
            }
        }
        if (this.h) {
            this.aj.l();
        }
        this.aj.f();
    }

    @Override // defpackage.ivo
    public final void D() {
        defpackage.jko jkoVar = this.ai;
        defpackage.nub nubVar = jkoVar.p;
        long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        defpackage.jkm jkmVarB = nubVar.b();
        if (jkmVarB == null) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.jko.a.h()).ai((char) 2254)).u("Too many onFrameWritten callbacks!");
        } else {
            jkmVarB.e = jElapsedRealtimeNanos;
            jkmVarB.b();
            jkoVar.d();
        }
        this.aj.e();
    }

    @Override // defpackage.jkr
    public final synchronized void E() throws java.lang.Throwable {
        try {
            if (this.aQ) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 536)).u("Input focus gained again");
                return;
            }
            this.aQ = true;
            defpackage.jhl jhlVarL = l();
            defpackage.yqm yqmVar = a;
            ((defpackage.yqj) yqmVar.l().ai((char) 534)).y("Input focus gained. Focused window: %s", jhlVarL);
            if (jhlVarL != null) {
                aE(null);
                try {
                    aC(jhlVarL, true, false, -1, null);
                    return;
                } catch (java.lang.Throwable th) {
                    th = th;
                    this = this;
                    throw th;
                }
            }
            defpackage.jhl jhlVarK = k(this.aO, true);
            if (jhlVarK == null || !ag(jhlVarK) || !af(jhlVarK, false)) {
                jhlVarK = at(null);
            }
            if (jhlVarK == null) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 535)).u("No Focusable windows");
            } else {
                aE(null);
                aH(jhlVarK, false);
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.jkr
    public final synchronized void F() throws java.lang.Throwable {
        defpackage.inh inhVar;
        try {
            try {
                defpackage.jhl jhlVarL = l();
                ((defpackage.yqj) a.l().ai((char) 537)).y("Input focus lost. Focused window: %s", jhlVarL);
                if (jhlVarL != null) {
                    aE(jhlVarL);
                    inhVar = this;
                    inhVar.aC(jhlVarL, false, false, -1, null);
                } else {
                    inhVar = this;
                }
                inhVar.aQ = false;
                return;
            } catch (java.lang.Throwable th) {
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        throw th;
    }

    @Override // defpackage.jkr
    public final void G(defpackage.jhl jhlVar, android.view.MotionEvent motionEvent, com.google.android.gms.car.TouchEventCompleteData touchEventCompleteData) {
        int i;
        int i2;
        float f2;
        this.aP = -1;
        int i3 = 0;
        boolean z = this.aK && motionEvent.getSource() == 1048584;
        boolean z2 = this.aL && motionEvent.getSource() == 8194;
        if (z || z2) {
            if (this.o) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 543)).u("Cannot invoke onMotionEventComplete when disconnected.");
                return;
            }
            if (jhlVar != l()) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(542)).M("Ignoring event delivered to old window. event:%s, data:%s", motionEvent, touchEventCompleteData);
                return;
            }
            jhlVar.aj(touchEventCompleteData.b);
            int i4 = touchEventCompleteData.a;
            if (i4 == -1) {
                int i5 = touchEventCompleteData.c;
                if (i5 == 1) {
                    i = 260;
                } else if (i5 == 2) {
                    i = 261;
                } else if (i5 == 17) {
                    i = 21;
                } else if (i5 == 33) {
                    i = 19;
                } else if (i5 != 66) {
                    i = i5 != 130 ? 0 : 20;
                } else {
                    i = 22;
                }
                if (i == 0) {
                    int source = motionEvent.getSource();
                    if (source == 8194) {
                        android.view.MotionEvent.PointerCoords pointerCoords = new android.view.MotionEvent.PointerCoords();
                        motionEvent.getPointerCoords(0, pointerCoords);
                        i2 = pointerCoords.getAxisValue(9) > 0.0f ? 261 : 260;
                    } else {
                        if (source != 1048584) {
                            throw new java.lang.IllegalArgumentException("Unable to map keycode from event source: " + motionEvent.getSource());
                        }
                        float x = motionEvent.getX() - this.aI;
                        float y = motionEvent.getY() - this.aJ;
                        defpackage.ikk ikkVar = this.ba;
                        float fAbs = java.lang.Math.abs(x);
                        float fAbs2 = java.lang.Math.abs(y);
                        int iE = ikkVar.e();
                        if (fAbs2 >= fAbs) {
                            f2 = 0.0f;
                            if (fAbs2 >= iE) {
                                i2 = y > 0.0f ? 20 : 19;
                            }
                        } else {
                            f2 = 0.0f;
                        }
                        if (fAbs <= fAbs2 || fAbs < iE) {
                            i2 = 0;
                        } else {
                            i2 = x > f2 ? 22 : 21;
                        }
                    }
                } else {
                    i2 = i;
                }
                if (i2 != 0) {
                    android.view.KeyEvent keyEvent = new android.view.KeyEvent(1, i2);
                    keyEvent.setSource(motionEvent.getSource());
                    if (ai(jhlVar, keyEvent)) {
                        if (true == z) {
                            i3 = 2;
                        }
                    }
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(541)).S("keycode is unknown for event:%s, wasUiTouchpad:%s, touchpadOriginX:%s, touchpadOriginY:%s", motionEvent, java.lang.Boolean.valueOf(z), java.lang.Float.valueOf(this.aI), java.lang.Float.valueOf(this.aJ));
                }
                i3 = -1;
            } else {
                i3 = i4;
            }
            if (i3 == -1 || i3 == 0) {
                return;
            }
            this.ba.n(i3);
        }
    }

    @Override // defpackage.jkr
    public final synchronized void H(android.view.MotionEvent motionEvent) {
        if (this.C) {
            this.A = false;
            defpackage.jhl jhlVarL = l();
            if (jhlVarL != null) {
                jhlVarL.P(motionEvent);
            } else {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 544)).u("Scroll event dropped, no focusable windows");
                aF();
            }
        }
    }

    @Override // defpackage.jkr
    public final synchronized void I(android.view.MotionEvent motionEvent) {
        this.A = false;
        if (this.C) {
            defpackage.jhl jhlVarL = l();
            if (jhlVarL == null) {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 545)).u("No window to send touchpad event to");
                aF();
                return;
            }
            if (this.aK && motionEvent.getAction() == 0) {
                this.aI = motionEvent.getX();
                this.aJ = motionEvent.getY();
            }
            jhlVarL.Q(motionEvent);
        }
    }

    @Override // defpackage.jkr
    public final synchronized void J(defpackage.xpq xpqVar, java.util.UUID uuid) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 550)).u("onUpdateUiConfigRequest");
        java.util.UUID uuid2 = this.u;
        boolean z = false;
        if (uuid2 != null && !uuid2.equals(uuid)) {
            z = true;
        }
        defpackage.ive iveVarA = this.Q.a();
        iveVarA.getClass();
        t(iveVarA, uuid);
        this.Y.n(this.w.f, this.w.g - this.w.h);
        defpackage.ina inaVar = this.s;
        if (inaVar == null) {
            ((defpackage.yqj) yqmVar.l().ai((char) 551)).u("Resize when not compositing, not showing loading screen");
            this.ai.e(xpqVar);
        } else {
            inaVar.b(xpqVar);
            if (z) {
                defpackage.rbz.j(new defpackage.aq(this, uuid, 12, null));
            }
        }
    }

    @Override // defpackage.jkr
    public final synchronized void K(defpackage.jhl jhlVar, boolean z) {
        L(jhlVar, z, null, null);
    }

    @Override // defpackage.jkr
    public final synchronized void L(defpackage.jhl jhlVar, boolean z, defpackage.jik jikVar, defpackage.jik jikVar2) {
        boolean zContains;
        boolean zAh;
        ((defpackage.yqj) a.l().ai((char) 553)).y("window attach complete %s", jhlVar.aO());
        if (jhlVar == null) {
            return;
        }
        try {
            synchronized (this.V) {
                zContains = av(jhlVar.D(), true).contains(jhlVar);
                zAh = false;
                if (zContains) {
                    if (jhlVar.G().equals(this.u)) {
                        N(jhlVar);
                        zAh = ah(jhlVar, this.Y.w(jhlVar));
                    }
                    if (zAh) {
                        jikVar = jikVar2;
                    }
                }
            }
            if (!zContains) {
                try {
                    R(jhlVar, null, null, true, true, false, null);
                    return;
                } catch (java.lang.Throwable th) {
                    th = th;
                    throw th;
                }
            }
            if (!z) {
                jhlVar.aq();
            } else if (aQ(jikVar)) {
                this.Y.j(jhlVar, jikVar);
            } else if (!aM(jhlVar) || (zAh && !(this.bg && this.Y.u()))) {
                this.Y.o(jhlVar, jikVar);
            } else {
                this.Y.l(jhlVar, jikVar);
            }
            defpackage.rbz.g(android.os.Looper.getMainLooper(), new defpackage.aq(this, jhlVar, 13, null));
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.jkr
    public final void M(java.lang.Runnable runnable) {
        defpackage.ina inaVar = this.s;
        if (inaVar != null) {
            inaVar.postAtFrontOfQueue(runnable);
        }
    }

    public final void N(defpackage.jhl jhlVar) {
        O(jhlVar, defpackage.ynd.a, new android.util.ArraySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(defpackage.jhl jhlVar, defpackage.yhx yhxVar, java.util.Set set) {
        int i;
        if (!jhlVar.G().equals(this.u)) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 560)).y("%s does not have the correct configuration, unable to receive insets", jhlVar);
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        defpackage.ygw ygwVarE = jhlVar.E();
        int size = ygwVarE.size();
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            java.util.Iterator it = ((defpackage.ybx) this.X).c((com.google.android.gms.car.display.CarRegionId) ygwVarE.get(i2)).iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    defpackage.jhl jhlVar2 = (defpackage.jhl) it.next();
                    set.remove(jhlVar2);
                    if (!jhlVar2.G().equals(this.u)) {
                        jhlVar2.aO();
                    } else if (yhxVar.contains(jhlVar2)) {
                        jhlVar2.aO();
                    } else {
                        rect = ar(jhlVar2, jhlVar, rect);
                        z |= !jhlVar2.aC();
                    }
                }
            }
            i2 = i;
        }
        java.util.Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            defpackage.jhl jhlVar3 = (defpackage.jhl) it2.next();
            if (ygwVarE.contains(jhlVar3.D())) {
                if (!jhlVar3.G().equals(this.u)) {
                    jhlVar3.aO();
                } else if (yhxVar.contains(jhlVar3)) {
                    jhlVar3.aO();
                } else {
                    rect = ar(jhlVar3, jhlVar, rect);
                    z |= !jhlVar3.aC();
                }
            }
        }
        if (rect.equals(jhlVar.w())) {
            return;
        }
        ((defpackage.yqj) a.l().ai((char) 555)).M("%s receives insets %s", jhlVar, rect);
        jhlVar.aw(rect, z);
    }

    @Override // defpackage.jkr
    public final void P(defpackage.jhl jhlVar) {
        synchronized (this.V) {
            N(jhlVar);
        }
    }

    public final void Q(int i) {
        this.aS.remove(i);
    }

    public final synchronized void R(defpackage.jhl jhlVar, defpackage.jik jikVar, defpackage.jik jikVar2, boolean z, boolean z2, boolean z3, defpackage.jhl jhlVar2) {
        boolean zAO;
        if (jhlVar != null) {
            defpackage.yqm yqmVar = a;
            ((defpackage.yqj) yqmVar.l().ai(563)).T("removeProjectionWindow %s, %s, %s, %s, %s", jhlVar.F(), jikVar, jikVar2, java.lang.Boolean.valueOf(z), jhlVar2);
            boolean zV = this.bh.v(jhlVar);
            this.bh.u(jhlVar);
            if (this.C || !z3) {
                this.aZ.remove(jhlVar);
                defpackage.ldx ldxVar = this.bi;
                if (ldxVar != null) {
                    ldxVar.u(jhlVar);
                }
            }
            synchronized (this.V) {
                zAO = aO(jhlVar);
                if (zAO) {
                    az();
                    if (z && al(jhlVar, jhlVar2, this.Y.v(jhlVar))) {
                        ((defpackage.yqj) yqmVar.l().ai(570)).y("Using region removal animation %s", jikVar2);
                        if (jikVar2 != null) {
                            jikVar = jikVar2;
                        }
                    }
                }
            }
            int iJ = jhlVar.j();
            if (iJ == 5) {
                aA(jhlVar);
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 569)).y("removing window that is already removed %s", jhlVar);
                jhlVar.M();
                return;
            }
            if (iJ == 4 && this.Y.t(jhlVar)) {
                jhlVar.M();
                return;
            }
            if (!zAO) {
                jhlVar.ae();
                aA(jhlVar);
                if (z2) {
                    u(jhlVar);
                }
                jhlVar.M();
                ((defpackage.yqj) yqmVar.l().ai((char) 568)).y("window removed %s", jhlVar);
                return;
            }
            if (zV) {
                ((defpackage.yqj) yqmVar.l().ai((char) 565)).y("Removing window that was focused: %s", jhlVar.aO());
                defpackage.jhl jhlVarS = this.bh.s(new defpackage.imw(this, 1));
                if (jhlVarS == null) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 567)).u("Unable to find a window from history, switching to next highest focusable");
                    jhlVarS = at(jhlVar);
                } else {
                    ((defpackage.yqj) yqmVar.l().ai((char) 566)).y("Found window %s from focus history", jhlVarS.aO());
                }
                aG(jhlVar, jhlVarS);
            }
            jhlVar.ae();
            ((defpackage.yqj) yqmVar.l().ai((char) 564)).y("window detached %s", jhlVar);
            if (!jhlVar.aE()) {
                aA(jhlVar);
                if (z2) {
                    u(jhlVar);
                }
            } else {
                if (aQ(jikVar)) {
                    this.Y.i(jhlVar, jikVar, z2);
                    return;
                }
                if (aM(jhlVar) && jhlVar2 != null) {
                    this.Y.k(jhlVar, jikVar, z2);
                    return;
                }
                if (!this.Y.x(jhlVar, jikVar, z2)) {
                    jhlVar.M();
                }
            }
        }
    }

    public final void S(defpackage.jhl jhlVar, int i) {
        java.util.List list = (java.util.List) this.S.get(i);
        if (list == null || !list.remove(jhlVar)) {
            return;
        }
        list.size();
        y();
    }

    @Override // defpackage.jkr
    public final void T() {
        if (this.aG) {
            return;
        }
        defpackage.iya iyaVar = this.az;
        iyaVar.getClass();
        new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.bgf(iyaVar, 15));
    }

    @Override // defpackage.jkr
    public final void U() {
        this.Z.H();
    }

    @Override // defpackage.jkr
    public final void V(defpackage.iwd iwdVar) {
        long jG;
        int i;
        ((defpackage.yqj) defpackage.iwg.a.l().ai((char) 1438)).y("setFrameRateRestriction(%s)", iwdVar);
        defpackage.iwg iwgVar = this.aF;
        synchronized (iwgVar.c) {
            iwgVar.d = iwdVar;
            int iOrdinal = iwgVar.d.ordinal();
            if (iOrdinal == 0) {
                jG = defpackage.acsa.g();
            } else if (iOrdinal == 1) {
                jG = defpackage.acsa.i();
            } else if (iOrdinal == 2) {
                jG = defpackage.acsa.h();
            } else {
                if (iOrdinal != 3) {
                    throw new java.lang.RuntimeException(null, null);
                }
                i = 0;
            }
            i = (int) jG;
        }
        iwgVar.b.b(iwgVar.e, i);
    }

    @Override // defpackage.jkr
    public final synchronized void W(com.google.android.gms.car.display.CarRegionId carRegionId, defpackage.jhl jhlVar, defpackage.jik jikVar, defpackage.jik jikVar2) {
        defpackage.jhl jhlVarK;
        synchronized (this.V) {
            jhlVarK = k(carRegionId, true);
        }
        if (jhlVar == jhlVarK) {
            return;
        }
        byte[] bArr = null;
        this.aX.put(carRegionId, new defpackage.jiu(null, jikVar, null, jikVar2));
        java.util.Map map = this.aY;
        if (!map.containsKey(carRegionId)) {
            map.put(carRegionId, new defpackage.aq(this, carRegionId, 14, bArr));
        }
        this.aW.postDelayed((java.lang.Runnable) map.get(carRegionId), 5000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, qzs] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.jkr
    public final synchronized void X(boolean z) {
        if (this.C || !z) {
            this.aH = z;
        } else {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 586)).u("stopComposition called for transient loss while not compositing");
        }
        defpackage.ldx ldxVar = this.bh;
        defpackage.ldx ldxVar2 = new defpackage.ldx((byte[]) null, (byte[]) null, (byte[]) null);
        ((defpackage.ing) ldxVar2.a).addAll(ldxVar.a);
        this.bi = ldxVar2;
        this.bb.b();
        this.bd.c();
        ((defpackage.yqj) a.l().ai((char) 582)).u("stopComposition");
        if (this.C) {
            defpackage.xzg xzgVar = this.be;
            xzgVar.d();
            xzgVar.e();
            java.util.List list = this.aZ;
            list.clear();
            synchronized (this.V) {
                int i = 0;
                while (true) {
                    android.util.SparseArray sparseArray = this.W;
                    if (i >= sparseArray.size()) {
                        break;
                    }
                    list.addAll((java.util.List) sparseArray.valueAt(i));
                    i++;
                }
            }
            ((defpackage.yqj) a.l().ai(583)).y("Keep %s windows for recovery.", this.aZ);
            defpackage.raa raaVar = this.ar;
            synchronized (raaVar.a) {
                java.util.Iterator it = raaVar.c.iterator();
                while (it.hasNext()) {
                    try {
                        ((defpackage.inc) it.next()).a.e(false);
                    } catch (android.os.RemoteException unused) {
                    }
                }
            }
            if (this.aB != null) {
                defpackage.eth.a(this.l).c(this.aB);
                this.aB = null;
            }
            this.bf.b();
            this.C = false;
            this.Y.h();
            try {
                if (this.r != null) {
                    aL();
                    this.r.quitSafely();
                    this.aC.join(3000L);
                }
            } catch (java.lang.InterruptedException e2) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e2)).ai((char) 585)).u("Interrupted exception before composition thread joined");
            }
            if (this.aC.isAlive()) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 584)).u("CompositionThread still alive!");
                this.ax.aH(defpackage.jfc.e);
            }
            defpackage.jko jkoVar = this.ai;
            jkoVar.c();
            jkoVar.n = false;
            jkoVar.k.set(0);
            jkoVar.l.set(0);
            jkoVar.m.set(0);
            this.aC = null;
            this.p = null;
            this.q = null;
            this.s = null;
            this.r = null;
            defpackage.yfd yfdVar = this.G;
            synchronized (yfdVar) {
                yfdVar.clear();
            }
            defpackage.jgq jgqVar = this.aj;
            jgqVar.g.o(jgqVar.c);
            synchronized (jgqVar) {
                java.util.Queue queue = jgqVar.f;
                java.util.Iterator it2 = queue.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((java.lang.Integer) it2.next()).intValue();
                    defpackage.jfo jfoVar = jgqVar.c;
                    defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.PROJECTION_WINDOW_MANAGER, defpackage.zbd.Jv);
                    rrvVarH.w(iIntValue);
                    jfoVar.b(rrvVarH.l());
                }
                queue.clear();
            }
            jgqVar.h();
            jgqVar.k();
            long andSet = this.ak.getAndSet(0L);
            if (andSet != 0) {
                this.ag.f(defpackage.zbe.PROJECTION_WINDOW_MANAGER, defpackage.zbd.Hl, (android.os.SystemClock.elapsedRealtimeNanos() - andSet) / 1000000);
            }
        }
    }

    @Override // defpackage.jkr
    public final void Y() {
        ((defpackage.yqj) a.l().ai((char) 587)).u("stopCompositionNow");
        if (this.C) {
            this.bf.b();
            if (this.aB != null) {
                defpackage.eth.a(this.l).c(this.aB);
                this.aB = null;
            }
            this.C = false;
            android.os.Looper looper = this.r;
            if (looper != null) {
                aL();
                looper.quitSafely();
            }
        }
    }

    @Override // defpackage.jkr
    public final synchronized void Z(defpackage.jhl jhlVar) {
        aJ(jhlVar, false, -1, null);
    }

    @Override // defpackage.jkr
    public final int a(int i) {
        return java.lang.Math.round(i * (d() / 160.0f));
    }

    @Override // defpackage.ixt
    public final void aI(int i, boolean z) {
        boolean z2 = (i & 10) != 0;
        if (!this.aD) {
            this.aG = z2;
        }
        this.aE.a(z2, (i & 65536) != 0);
    }

    @Override // defpackage.jkr
    public final synchronized void aa(com.google.android.gms.car.display.CarRegionId carRegionId, defpackage.jhl jhlVar) {
        ab(carRegionId, jhlVar, 0);
    }

    @Override // defpackage.jkr
    public final synchronized void ab(com.google.android.gms.car.display.CarRegionId carRegionId, defpackage.jhl jhlVar, int i) throws java.lang.Throwable {
        java.lang.Throwable th;
        defpackage.jhl jhlVarK;
        defpackage.inh inhVar;
        try {
            try {
                ((defpackage.yqj) a.l().ai(593)).R("switchRegionWindow(%s, %s, %s)", carRegionId, jhlVar, java.lang.Integer.valueOf(i));
                if (jhlVar != null) {
                    try {
                        if (jhlVar.g() != 1) {
                            throw new java.lang.IllegalStateException();
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                java.lang.Object obj = this.V;
                boolean z = jhlVar != null;
                synchronized (obj) {
                    try {
                        jhlVarK = k(carRegionId, z);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                throw th;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                }
                if (jhlVarK == jhlVar) {
                    inhVar = this;
                } else {
                    java.util.Map map = this.aX;
                    defpackage.jiu jiuVar = (defpackage.jiu) map.get(carRegionId);
                    map.put(carRegionId, null);
                    this.aW.removeCallbacks((java.lang.Runnable) this.aY.get(carRegionId));
                    if ((jiuVar == null || jiuVar.b == null) && jhlVar != null) {
                        defpackage.jik jikVarA = jhlVar.A();
                        jiuVar = jiuVar == null ? new defpackage.jiu(null, jikVarA, null, jikVarA) : new defpackage.jiu(null, jikVarA, null, jiuVar.d);
                    }
                    if (jiuVar == null) {
                        jiuVar = new defpackage.jiu(null, null, null, null);
                    }
                    defpackage.jhl jhlVar2 = (this.aw.f() && this.bh.v(jhlVarK)) ? jhlVarK : null;
                    inhVar = this;
                    inhVar.R(jhlVarK, jiuVar.b, jiuVar.d, jhlVar == null || !(jhlVarK == null || j$.util.Objects.equals(jhlVar.D(), jhlVarK.D())), true, false, jhlVar);
                    if (jhlVar != null) {
                        inhVar.ay(jhlVar, i, jhlVar2);
                        return;
                    }
                }
                return;
            } catch (java.lang.Throwable th5) {
                th = th5;
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            th = th;
            throw th;
        }
        throw th;
    }

    public final void ac() {
        defpackage.yhx yhxVar = this.v;
        if (yhxVar == null || yhxVar.isEmpty()) {
            return;
        }
        this.bc.d(this.O.containsAll(this.v));
    }

    public final void ad() {
        defpackage.jje jjeVar = this.aq;
        if (jjeVar != null) {
            jjeVar.h(this.ar.b != null);
        }
    }

    @Override // defpackage.jkr
    public final boolean ae() {
        return this.C;
    }

    public final synchronized boolean af(defpackage.jhl jhlVar, boolean z) {
        boolean zAx = (jhlVar.ax(1) || jhlVar.ax(512)) ? false : true;
        if (z && !zAx) {
            zAx = jhlVar.ax(512);
        }
        boolean zAx2 = jhlVar.ax(1024);
        if (!this.aw.f() && zAx && (jhlVar.ax(32) || zAx2 || aP(jhlVar))) {
            zAx = !this.A || zAx2;
        }
        return ag(jhlVar) && zAx;
    }

    public final boolean ag(defpackage.jhl jhlVar) {
        synchronized (this.V) {
            java.util.Iterator it = this.aV.iterator();
            while (it.hasNext()) {
                if (((defpackage.dzp) it.next()).b == jhlVar) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007f  */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean ah(defpackage.jhl jhlVar, boolean z) {
        defpackage.jhl jhlVar2;
        boolean z2 = false;
        if (!jhlVar.G().equals(this.u)) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 527)).y("%s does not have the correct configuration, unable to cast insets", jhlVar);
            return false;
        }
        for (defpackage.jhl jhlVar3 : this.X.v()) {
            if (jhlVar3.G().equals(this.u) && jhlVar3.E().contains(jhlVar.D())) {
                android.graphics.Rect rectW = jhlVar3.w();
                android.graphics.Rect rectAr = ar(jhlVar, jhlVar3, rectW);
                if (rectAr.equals(rectW)) {
                    jhlVar2 = jhlVar;
                } else {
                    jhlVar2 = jhlVar;
                    ((defpackage.yqj) a.l().ai(526)).S("%s receives insets %s from %s. Sending = %s", jhlVar3, rectAr, jhlVar2, java.lang.Boolean.valueOf(z));
                    z2 = true;
                    if (z) {
                        jhlVar3.aw(rectAr, !jhlVar2.aC());
                    }
                }
            } else {
                jhlVar2 = jhlVar;
            }
            jhlVar = jhlVar2;
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jkr
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized boolean ai(defpackage.jhl jhlVar, android.view.KeyEvent keyEvent) {
        java.lang.Object[] objArr;
        defpackage.jhl jhlVarS;
        android.graphics.Rect rect;
        if (keyEvent.getAction() == 1) {
            int keyCode = keyEvent.getKeyCode();
            synchronized (this.V) {
                int i = -1;
                android.graphics.Rect rect2 = null;
                defpackage.jhl jhlVar2 = null;
                rect2 = null;
                rect2 = null;
                rect2 = null;
                rect2 = null;
                if (!defpackage.ebm.k(keyCode) && keyCode != 261 && keyCode != 260) {
                    if (keyCode != 4) {
                        rect = null;
                        break;
                    }
                    java.util.Iterator it = this.aV.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            rect = null;
                            break;
                        }
                        defpackage.jhl jhlVar3 = (defpackage.jhl) ((defpackage.dzp) it.next()).b;
                        if (jhlVar3.ax(8)) {
                            rect = null;
                            jhlVar2 = jhlVar3;
                            break;
                        }
                    }
                } else if (this.bh.r() != jhlVar) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(549)).y("Ignoring unhandled key event delivered to non-focused window. event: %s", keyEvent);
                } else {
                    if (this.aK && keyEvent.getSource() == 1048584) {
                        objArr = true;
                    } else if ((this.aL && keyEvent.getSource() == 8194) || keyEvent.getSource() == 0) {
                        objArr = true;
                    } else {
                        objArr = false;
                    }
                    int iJ = defpackage.ebm.j(keyCode);
                    int i2 = this.aP;
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(defpackage.ebm.j(keyCode));
                    defpackage.yhe yheVar = defpackage.rph.a;
                    numValueOf.getClass();
                    if (i2 != -1 && numValueOf2.equals((java.lang.Integer) defpackage.rph.a.get(numValueOf)) && ((defpackage.ing) this.bh.a).size() > 1) {
                        defpackage.jhl jhlVarS2 = this.bh.s(new defpackage.imw(this, 0));
                        jhlVarS = this.bh.s(new defpackage.imw(this, 0));
                        this.bh.t(jhlVarS2);
                        ((defpackage.yqj) a.l().ai(548)).M("Reverse action. Going back to window: %s from window %s", jhlVarS, jhlVarS2);
                    } else if (!objArr == true || jhlVar == null || jhlVar.q() == null) {
                        jhlVarS = au(jhlVar, keyCode, false);
                    } else {
                        android.graphics.Rect rectN = jhlVar.n();
                        android.graphics.Rect rectQ = jhlVar.q();
                        android.graphics.Rect rect3 = new android.graphics.Rect();
                        rect3.set(rectN.left + rectQ.left, rectN.top + rectQ.top, rectN.left + rectQ.right, rectN.top + rectQ.bottom);
                        jhlVarS = m(this.w, this.aV, jhlVar, keyCode, false, rect3);
                    }
                    defpackage.jhl jhlVar4 = jhlVarS;
                    if (objArr != false && jhlVar != null && jhlVar.q() != null && jhlVar4 != null) {
                        android.graphics.Rect rectQ2 = jhlVar.q();
                        defpackage.dzp dzpVarAs = as(jhlVar);
                        defpackage.dzp dzpVarAs2 = as(jhlVar4);
                        if (dzpVarAs == null || dzpVarAs2 == null) {
                            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(478)).M("Unable to compute focusedRect in target window due to non-focusable window. fromWindow: %s, toWindow: %s", dzpVarAs, dzpVarAs2);
                        } else {
                            android.graphics.Rect rect4 = new android.graphics.Rect();
                            android.graphics.Rect rect5 = (android.graphics.Rect) dzpVarAs.a;
                            android.graphics.Rect rect6 = (android.graphics.Rect) dzpVarAs2.a;
                            rect4.set((rect5.left + rectQ2.left) - rect6.left, (rect5.top + rectQ2.top) - rect6.top, (rect5.left + rectQ2.right) - rect6.left, (rect5.top + rectQ2.bottom) - rect6.top);
                            ((defpackage.yqj) a.l().ai(479)).S("rect source: %s -> target: %s\n\twindowBounds source: %s -> target: %s", rectQ2, rect4, jhlVar, jhlVar4);
                            rect2 = rect4;
                        }
                    }
                    rect = rect2;
                    i = iJ;
                    jhlVar2 = jhlVar4;
                }
                if (jhlVar2 == null) {
                    ((defpackage.yqj) a.l().ai((char) 546)).u("Unable to switch focus for unhandled keycode");
                    return false;
                }
                ((defpackage.yqj) a.l().ai((char) 547)).y("Switch focus for unhandled keycode to %s", jhlVar2.aO());
                aJ(jhlVar2, false, i, rect);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jkr
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean aj(defpackage.jhb jhbVar, int i) {
        defpackage.ill.d();
        synchronized (this.ab) {
            this.ac.add(jhbVar);
            this.ad.remove(jhbVar);
        }
        defpackage.jhl jhlVar = ((defpackage.jhe) jhbVar).h;
        jhlVar.getClass();
        if (jhlVar.aF()) {
            ak(jhlVar, i);
            return true;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 554)).y("reattachCarWindow called with window %s in wrong state", jhlVar);
        return false;
    }

    public final boolean ak(defpackage.jhl jhlVar, int i) {
        boolean z;
        if (this.C) {
            int iG = jhlVar.g();
            if (iG == 1 || iG == 4 || iG == 3) {
                z = true;
            } else if (iG == 7) {
                iG = 7;
                z = true;
            } else {
                z = false;
            }
            defpackage.ysr.ba(z, "Unsupported layer used: %s", iG);
            if (!this.Y.q(jhlVar) && !jhlVar.aF()) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 561)).y("recycleProjectionWindow for non-removed window %s", jhlVar);
                return false;
            }
            defpackage.ina inaVar = this.s;
            if (inaVar != null) {
                defpackage.jhx jhxVarY = jhlVar.y();
                int iG2 = jhlVar.g();
                int i2 = jhlVar.i();
                android.graphics.Rect rectU = jhlVar.u();
                jhq jhqVar = new jhq(jhlVar.v(), jhlVar.r());
                int iF = jhlVar.f();
                int iE = jhlVar.e();
                defpackage.jik jikVarZ = jhlVar.z();
                int i3 = 0;
                defpackage.jik jikVarA = jhlVar.A();
                int i4 = jhxVarY == null ? 0 : jhxVarY.k;
                if (jhxVarY != null) {
                    i3 = jhxVarY.l;
                }
                aD(jhlVar, iG2, i2, inaVar, rectU, jhqVar, iF, iE, jikVarZ, jikVarA, i4, i3, jhlVar.E(), jhlVar.C(), jhlVar.G(), jhlVar.s() == null ? new android.graphics.Rect() : jhlVar.s(), i);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean al(defpackage.jhl jhlVar, defpackage.jhl jhlVar2, boolean z) {
        boolean z2;
        int i;
        defpackage.jhl jhlVar3 = jhlVar;
        int i2 = 0;
        if (!jhlVar3.G().equals(this.u)) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 562)).y("%s does not have the correct configuration, unable to remove inset casting window", jhlVar3);
            return false;
        }
        if (jhlVar3.D() == null) {
            return false;
        }
        defpackage.ylx ylxVar = this.X;
        boolean z3 = false;
        for (defpackage.jhl jhlVar4 : ylxVar.v()) {
            if (jhlVar4.G().equals(this.u) && jhlVar4.E().contains(jhlVar3.D())) {
                jhlVar3.aO();
                jhlVar4.aO();
                android.graphics.Rect rectW = jhlVar4.w();
                android.graphics.Rect rect = new android.graphics.Rect();
                defpackage.ygw ygwVarE = jhlVar4.E();
                int size = ygwVarE.size();
                int i3 = i2;
                boolean z4 = i3;
                while (i3 < size) {
                    java.util.Iterator it = ((defpackage.ybx) ylxVar).c((com.google.android.gms.car.display.CarRegionId) ygwVarE.get(i3)).iterator();
                    while (true) {
                        i = i3 + 1;
                        if (it.hasNext()) {
                            defpackage.jhl jhlVar5 = (defpackage.jhl) it.next();
                            if (j$.util.Objects.equals(jhlVar3, jhlVar5)) {
                                ygwVarE = ygwVarE;
                            } else {
                                boolean z5 = jhlVar5.aE() || jhlVar5.aZ();
                                defpackage.jip jipVar = this.Y;
                                boolean z6 = jipVar.w(jhlVar5) && jipVar.r(jhlVar5);
                                if (jhlVar5.G().equals(this.u) && (z5 || z6 || jipVar.s(jhlVar5))) {
                                    rect = ar(jhlVar5, jhlVar4, rect);
                                    z4 |= !jhlVar5.aC();
                                }
                            }
                            jhlVar3 = jhlVar;
                            ygwVarE = ygwVarE;
                        }
                    }
                    jhlVar3 = jhlVar;
                    i3 = i;
                }
                if (rect.equals(rectW)) {
                    z2 = false;
                } else if (jhlVar2 != null && jhlVar2.D() != null && jhlVar2.G().equals(this.u) && jhlVar4.E().contains(jhlVar2.D()) && ar(jhlVar2, jhlVar4, new android.graphics.Rect(rect)).equals(rectW)) {
                    ((defpackage.yqj) a.l().ai((char) 471)).u("Entering window covers existing insets, no inset changes to dispatch");
                    z2 = false;
                } else {
                    android.graphics.Rect rect2 = rect;
                    ((defpackage.yqj) a.l().ai(470)).S("%s insets updated to %s due to %s removal. Sending = %s", jhlVar4, rect2, jhlVar, java.lang.Boolean.valueOf(z));
                    if (z) {
                        jhlVar4.aw(rect2, z4);
                    }
                    z2 = true;
                }
                z3 |= z2;
            }
            jhlVar3 = jhlVar;
            i2 = 0;
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, qzs] */
    @Override // defpackage.jkr
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized boolean am(android.view.Surface surface) {
        defpackage.ill.d();
        this.ak.set(android.os.SystemClock.elapsedRealtimeNanos());
        this.ag.e(defpackage.zbe.PROJECTION_WINDOW_MANAGER, defpackage.zbd.Hj);
        ((defpackage.yqj) a.l().ai((char) 577)).u("startComposition");
        java.util.List list = this.aZ;
        boolean zIsEmpty = list.isEmpty();
        if (list.size() > 1) {
            defpackage.yha yhaVar = new defpackage.yha(4);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.car.display.CarRegionId carRegionIdD = ((defpackage.jhl) it.next()).D();
                if (carRegionIdD != null) {
                    yhaVar.f(carRegionIdD, 0);
                }
            }
            defpackage.rcx rcxVar = new defpackage.rcx();
            rcxVar.e(yhaVar.d(false));
            rcxVar.a = true;
            this.Y.c(rcxVar.a());
        }
        this.Q.j(this);
        this.p = surface;
        aI(this.az.a(), false);
        this.Y.n(this.w.f, this.w.g - this.w.h);
        this.B.set(0);
        this.aj.h();
        this.aC = new java.lang.Thread(new defpackage.bgf(this, 16, null), "CompositionThread");
        this.q = new java.util.concurrent.Semaphore(0);
        this.aC.start();
        try {
            this.q.acquire();
        } catch (java.lang.InterruptedException unused) {
        }
        if (!this.z) {
            return false;
        }
        this.aj.i();
        this.C = true;
        defpackage.jgv jgvVar = this.bf;
        defpackage.ina inaVar = this.s;
        jgvVar.a = true;
        defpackage.jgu jguVar = jgvVar.b;
        jguVar.getClass();
        jguVar.b(inaVar);
        this.H.set(0);
        this.I.set(0);
        this.J.set(0);
        this.M.set(0);
        this.aM.set(0);
        java.util.Arrays.fill(this.aN, 0);
        synchronized (this.V) {
            this.W.clear();
            this.X.q();
            aB();
        }
        ((defpackage.ing) this.bh.a).clear();
        defpackage.jkx jkxVar = this.bb;
        defpackage.jhi jhiVar = this.w;
        com.google.android.gms.car.display.CarDisplayId carDisplayId = this.af;
        jkxVar.a(jhiVar, new com.google.android.gms.car.display.CarRegionId(2, carDisplayId), this.u);
        this.bd.b(this.w, new com.google.android.gms.car.display.CarRegionId(2, carDisplayId), this.u);
        defpackage.jkf jkfVar = this.al;
        jkfVar.b(this.w.a, this.u, b());
        if (zIsEmpty || !this.aH) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 578)).u("Maybe showing loading screen");
            defpackage.xzg xzgVar = this.be;
            j$.time.Duration durationC = j$.time.Duration.ZERO;
            if (xzgVar.a) {
                xzgVar.f();
                durationC = xzgVar.c();
            }
            defpackage.jke jkeVar = defpackage.jke.c;
            if (zIsEmpty) {
                jkeVar = com.google.android.gms.car.display.CarDisplayId.a.equals(carDisplayId) ? defpackage.jke.b : defpackage.jke.d;
            }
            jkfVar.g(this.w.a, this.u, jkeVar, durationC);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 581)).u("Skipping loading screen for transient loss");
        }
        this.Y.g(this.w);
        if (this.aB == null) {
            this.aB = new defpackage.inb(this);
            defpackage.eth.a(this.l).b(this.aB, new android.content.IntentFilter("com.google.android.gms.car.DumpScreenshot"));
        }
        defpackage.raa raaVar = this.ar;
        synchronized (raaVar.a) {
            java.util.Iterator it2 = raaVar.c.iterator();
            while (it2.hasNext()) {
                try {
                    ((defpackage.inc) it2.next()).a.e(true);
                } catch (android.os.RemoteException unused2) {
                }
            }
        }
        synchronized (this.ab) {
            for (defpackage.jhb jhbVar : this.ac) {
                if (jhbVar.o() == null) {
                    jhbVar.r(this.w);
                }
                if (defpackage.acwv.a.fF().r() && !jhbVar.q()) {
                    ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(579)).y("startComposition skipping init for already initialized car window %s", jhbVar);
                } else {
                    ((defpackage.yqj) a.l().ai(580)).y("Initializing %s from startComposition", jhbVar);
                    this.s.g(jhbVar.o());
                }
            }
        }
        return true;
    }

    @Override // defpackage.jkr
    public final boolean an(defpackage.jjd jjdVar) {
        defpackage.ina inaVar = this.s;
        if (inaVar == null) {
            return false;
        }
        inaVar.c(null, jjdVar);
        return true;
    }

    public final void ao(defpackage.jhl jhlVar, int i, int i2) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai(507)).D("doWindowZOrderChange(requestedLayoutZ:%d) %s", i, jhlVar);
        int i3 = i2 - 1;
        int iH = jhlVar.h();
        if (i3 == 0) {
            jhlVar.ao(i);
        } else if (i3 != 1) {
            jhlVar.am(i);
        } else {
            jhlVar.ah();
        }
        int iH2 = jhlVar.h();
        android.util.SparseArray sparseArray = this.S;
        java.util.List list = (java.util.List) sparseArray.get(iH);
        if (list == null || !list.remove(jhlVar)) {
            ((defpackage.yqj) yqmVar.l().ai((char) 508)).y("z order changed for already removed window %s", jhlVar);
            return;
        }
        java.util.List arrayList = (java.util.List) sparseArray.get(iH2);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList(2);
            sparseArray.put(iH2, arrayList);
        }
        arrayList.add(jhlVar);
        y();
    }

    @Override // defpackage.jkr
    public final synchronized void ap(android.view.KeyEvent keyEvent) {
        defpackage.jhl jhlVarAu;
        this.A = false;
        if (this.C) {
            this.aU = keyEvent.getMetaState();
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                int keyCode = keyEvent.getKeyCode();
                defpackage.jhl jhlVarR = this.bh.r();
                if (defpackage.ebm.k(keyCode)) {
                    synchronized (this.V) {
                        jhlVarAu = au(jhlVarR, keyCode, true);
                    }
                    if (jhlVarAu != null) {
                        ((defpackage.yqj) a.l().ai(539)).R("Found priority window for %s -- %s. Moving focus without injecting keycode to %s", keyEvent, jhlVarAu.aO(), jhlVarR == null ? "null" : jhlVarR.aO());
                        Z(jhlVarAu);
                        return;
                    }
                }
                android.util.SparseBooleanArray sparseBooleanArray = this.aT;
                if (jhlVarR != null) {
                    sparseBooleanArray.put(keyEvent.getKeyCode(), true);
                    jhlVarR.N(keyEvent);
                    return;
                } else {
                    sparseBooleanArray.put(keyEvent.getKeyCode(), false);
                    ai(null, keyEvent);
                    return;
                }
            }
            android.util.SparseBooleanArray sparseBooleanArray2 = this.aT;
            if (sparseBooleanArray2.indexOfKey(keyEvent.getKeyCode()) < 0) {
                ((defpackage.yqj) a.l().ai((char) 538)).y("Dropping %s", keyEvent);
                return;
            }
            boolean z = sparseBooleanArray2.get(keyEvent.getKeyCode());
            defpackage.jhl jhlVarL = l();
            if (!z || jhlVarL == null) {
                ai(this.bh.r(), keyEvent);
            } else {
                jhlVarL.N(keyEvent);
            }
            if (keyEvent.getAction() == 1) {
                sparseBooleanArray2.delete(keyEvent.getKeyCode());
            }
        }
    }

    @Override // defpackage.jkr
    public final void aq(android.view.KeyEvent keyEvent) {
        this.aP = -1;
        if (this.aK) {
            if (this.o) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 540)).u("Cannot invoke onKeyEventComplete when disconnected.");
            } else if (keyEvent.getKeyCode() == 23 && keyEvent.getAction() == 1) {
                this.ba.n(1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // defpackage.jkr
    public final int b() {
        defpackage.tlk tlkVar = this.F;
        int i = tlkVar.a;
        if (android.graphics.Color.alpha(i) == 255) {
            int i2 = tlkVar.b;
            if (android.graphics.Color.alpha(i2) != 255) {
                i = -16777216;
                if (this.ao && true != this.E) {
                    i = -1;
                }
            } else {
                java.util.concurrent.TimeUnit.SECONDS.getClass();
                if (true != this.E) {
                    i = i2;
                }
            }
        } else {
            i = -16777216;
            if (this.ao) {
                i = -1;
            }
        }
        java.util.concurrent.TimeUnit.SECONDS.getClass();
        return i;
    }

    public final int c() {
        boolean z = this.E;
        defpackage.tlk tlkVar = this.ae;
        return z ? tlkVar.a : tlkVar.b;
    }

    @Override // defpackage.jkr
    public final int d() {
        this.w.getClass();
        return this.w.a.i;
    }

    @Override // defpackage.jkr
    public final int e() {
        return this.w.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // defpackage.jkr
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int f(defpackage.jhl jhlVar, android.graphics.Rect rect, jhq jhqVar, int i, int i2, int i3, defpackage.ygw ygwVar, java.util.UUID uuid, com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams) throws java.lang.Throwable {
        int iM;
        ?? r1 = rect;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
        defpackage.ill.d();
        java.lang.Object obj = this.V;
        synchronized (obj) {
            try {
                try {
                    if (jhlVar.i() != i3 && aO(jhlVar)) {
                        ((defpackage.yqj) a.l().ai(525)).R("Moving window from Z: %d to %d, %s", java.lang.Integer.valueOf(jhlVar.i()), numValueOf, jhlVar);
                        aw(jhlVar, i3);
                    }
                    defpackage.jhx jhxVarY = jhlVar.y();
                    iM = jhlVar.m(((android.graphics.Rect) r1).left, e() - ((android.graphics.Rect) r1).bottom, r1.width(), r1.height(), i3, jhqVar, i, i2, jhlVar.z(), jhlVar.A(), jhxVarY == null ? 0 : jhxVarY.k, jhxVarY != null ? jhxVarY.l : 0, ygwVar, projectionWindowDecorationParams, uuid, jhlVar.s() == null ? new android.graphics.Rect() : jhlVar.s());
                    if (this.X.z(jhlVar)) {
                        az();
                        al(jhlVar, null, true);
                        ah(jhlVar, true);
                        N(jhlVar);
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    r1 = obj;
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
        return iM;
    }

    public final long g(defpackage.jhl jhlVar, long j, int i) {
        java.util.Map map = this.aR;
        if (i != 0) {
            return ((java.lang.Long) new defpackage.nub((java.lang.Long) map.get(jhlVar.D())).i(0L)).longValue();
        }
        map.put(jhlVar.D(), java.lang.Long.valueOf(j));
        return j;
    }

    @Override // defpackage.jkr
    public final android.graphics.Point h() {
        if (this.w != null) {
            return new android.graphics.Point(this.w.f, this.w.g);
        }
        return null;
    }

    @Override // defpackage.jkr
    public final android.graphics.Rect i(android.graphics.Rect rect) {
        return new android.graphics.Rect(a(rect.left), a(rect.top), a(rect.right), a(rect.bottom));
    }

    @Override // defpackage.jkr
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.jhl j(defpackage.jkp jkpVar) {
        defpackage.jhl jhoVar;
        defpackage.inh inhVar;
        int i = jkpVar.c;
        defpackage.ysr.ba(au.contains(java.lang.Integer.valueOf(i)), "Unsupported layer used: %s", i);
        if (!this.C) {
            ((defpackage.yqj) a.l().ai((char) 490)).u("Composition not running. Unable to create projection window.");
            return null;
        }
        if (this.i) {
            jhoVar = new defpackage.jhs(this, i, jkpVar.g, jkpVar.b, jkpVar.q, jkpVar.a, false);
            inhVar = this;
        } else {
            java.util.function.Consumer consumer = jkpVar.n;
            if (consumer == null) {
                inhVar = this;
                jhoVar = new defpackage.jhh(inhVar, i, jkpVar.g, jkpVar.b, jkpVar.q, jkpVar.a);
            } else {
                inhVar = this;
                jhoVar = new defpackage.jho(inhVar, i, jkpVar.g, jkpVar.b, consumer, jkpVar.q, jkpVar.a);
            }
        }
        defpackage.ina inaVar = inhVar.s;
        if (inaVar == null) {
            ((defpackage.yqj) a.l().ai((char) 489)).u("Composition handler not running. Unable to create projection window.");
            return null;
        }
        defpackage.inh inhVar2 = inhVar;
        defpackage.jhl jhlVar = jhoVar;
        inhVar2.aD(jhlVar, i, jkpVar.d, inaVar, jkpVar.e, jkpVar.f, jkpVar.k, jkpVar.l, jkpVar.h, jkpVar.i, jkpVar.o, jkpVar.p, jkpVar.j, jkpVar.m, jkpVar.q, jkpVar.r, 0);
        return jhlVar;
    }

    public final defpackage.jhl k(com.google.android.gms.car.display.CarRegionId carRegionId, boolean z) {
        synchronized (this.V) {
            java.util.Collection collectionAv = av(carRegionId, z);
            if (collectionAv.isEmpty()) {
                return null;
            }
            if (collectionAv.size() > 1) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(510)).u("More than one active window, picking top");
            }
            return (defpackage.jhl) defpackage.ysr.ai(collectionAv.iterator());
        }
    }

    public final synchronized defpackage.jhl l() {
        if (this.aQ) {
            return this.bh.r();
        }
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 514)).u("No input focus, not returning a focused window");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0087 A[Catch: all -> 0x009a, TryCatch #0 {, blocks: (B:6:0x000d, B:7:0x0013, B:9:0x0018, B:10:0x001f, B:12:0x0025, B:14:0x002d, B:16:0x0033, B:18:0x0039, B:20:0x003d, B:22:0x0044, B:23:0x0046, B:25:0x004c, B:40:0x0084, B:28:0x0059, B:29:0x005c, B:31:0x0060, B:32:0x006a, B:34:0x0070, B:37:0x007e, B:42:0x0087, B:44:0x008d, B:46:0x0090, B:47:0x0093), top: B:54:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:57:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0090 A[SYNTHETIC] */
    public final defpackage.jhl n(int i, int i2, int i3) {
        defpackage.jhl jhlVar;
        defpackage.jhl jhlVar2;
        defpackage.jhl jhlVar3 = (defpackage.jhl) this.aS.get(i);
        if (jhlVar3 != null) {
            return jhlVar3;
        }
        synchronized (this.V) {
            android.util.SparseArray sparseArray = this.W;
            int size = sparseArray.size();
            loop0: while (true) {
                size--;
                jhlVar = null;
                if (size < 0) {
                    break;
                }
                java.util.List list = (java.util.List) sparseArray.valueAt(size);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    defpackage.jhl jhlVar4 = (defpackage.jhl) list.get(i4);
                    if (jhlVar4 != null && jhlVar4.aE() && jhlVar4.ay(i2, i3)) {
                        if (!this.an || !jhlVar4.az(2)) {
                            if (jhlVar4.ba()) {
                                jhlVar = jhlVar4;
                                break loop0;
                            }
                        } else {
                            int i5 = i4 + 1;
                            while (true) {
                                if (i5 >= list.size()) {
                                    int i6 = size - 1;
                                    while (true) {
                                        if (i6 < 0) {
                                            jhlVar2 = null;
                                            break;
                                        }
                                        java.util.Iterator it = ((java.util.List) sparseArray.valueAt(i6)).iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                defpackage.jhl jhlVar5 = (defpackage.jhl) it.next();
                                                if (aN(i2, i3, jhlVar5)) {
                                                    jhlVar2 = jhlVar5;
                                                    break;
                                                }
                                            } else {
                                                i6--;
                                            }
                                        }
                                    }
                                } else {
                                    jhlVar2 = (defpackage.jhl) list.get(i5);
                                    if (aN(i2, i3, jhlVar2)) {
                                        break;
                                    }
                                    i5++;
                                }
                            }
                            if (jhlVar2 != null) {
                                jhlVar = jhlVar2;
                                break loop0;
                            }
                            if (jhlVar4.ba()) {
                                jhlVar = jhlVar4;
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        this.aS.put(i, jhlVar);
        return jhlVar;
    }

    @Override // defpackage.jkr
    public final com.google.android.gms.car.CarUiInfo o() {
        com.google.android.gms.car.CarUiInfo carUiInfo = this.ba.m;
        carUiInfo.getClass();
        return carUiInfo;
    }

    @Override // defpackage.jkr
    public final synchronized com.google.android.gms.car.display.CarRegionId p() {
        return this.aO;
    }

    @Override // defpackage.jkr
    public final synchronized void q(defpackage.jhl jhlVar) {
        ay(jhlVar, 0, null);
    }

    @Override // defpackage.jkr
    public final synchronized void r(defpackage.jhl jhlVar, int i) {
        ay(jhlVar, i, null);
    }

    public final void s() {
        defpackage.jkv jkvVar = this.ah;
        if (jkvVar != null) {
            jkvVar.c();
            this.ah = null;
        }
        this.ap.c();
        int i = defpackage.ygw.d;
        v(defpackage.ymx.a);
        try {
            this.aq.j();
        } catch (defpackage.jjf e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e2)).ai((char) 474)).u("Error stopping renderer");
        }
    }

    @Override // defpackage.jkr
    public final synchronized void t(defpackage.ive iveVar, java.util.UUID uuid) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai(480)).M("Configuring display: %s, %s", iveVar, uuid);
        defpackage.jfe jfeVar = this.ay;
        defpackage.yyn yynVar = defpackage.yyn.PROJECTION_WINDOW_MANAGER_STARTED_WIFI;
        defpackage.yyn yynVar2 = defpackage.yyn.PROJECTION_WINDOW_MANAGER_STARTED_USB;
        int i = jfeVar.i();
        if (i != 2) {
            yynVar = i == 1 ? yynVar2 : null;
        }
        if (yynVar != null) {
            defpackage.omv.i(this.l, yynVar);
        }
        android.content.Context context = this.l;
        defpackage.omv.g(context, "com.google.android.gms.car.PROJECTION_WINDOW_MANAGER", defpackage.rsr.b.ordinal(), null);
        defpackage.jjv jjvVar = this.x;
        int i2 = iveVar.d;
        jjvVar.c(i2);
        this.ai.i = 1.0E9d / ((double) i2);
        defpackage.rbz.g(android.os.Looper.getMainLooper(), new defpackage.imx(this, iveVar, uuid, 0));
        this.y = iveVar.k;
        android.content.res.Resources resources = context.getResources();
        float f2 = resources.getDisplayMetrics().density;
        android.util.Size size = iveVar.m;
        int height = size.getHeight();
        float dimension = resources.getDimension(2131165550) / f2;
        int i3 = iveVar.i;
        int i4 = iveVar.f;
        int iRound = (int) (dimension * (i3 / 160.0f));
        if (height != i4) {
            iRound = java.lang.Math.round((iRound * height) / i4);
        }
        if (iRound >= height) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 463)).w("Calculated height %d too large", iRound);
            iRound = height - 1;
        }
        int i5 = iRound;
        ((defpackage.yqj) yqmVar.l().ai(481)).w("layout rail height:%d", i5);
        this.w = new defpackage.jhi(iveVar, size.getWidth(), size.getHeight(), iveVar.l, i5);
        this.u = uuid;
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(482);
        com.google.android.gms.car.display.CarDisplayId carDisplayId = this.af;
        yqjVar.M("Setting display configuration id for %s to %s", carDisplayId, uuid);
        defpackage.jkx jkxVar = this.bb;
        defpackage.jhi jhiVar = this.w;
        com.google.android.gms.car.display.CarRegionId carRegionId = new com.google.android.gms.car.display.CarRegionId(2, carDisplayId);
        if (jkxVar.b != null) {
            jkxVar.b();
            jkxVar.a(jhiVar, carRegionId, uuid);
        }
        defpackage.jkl jklVar = this.bd;
        defpackage.jhi jhiVar2 = this.w;
        com.google.android.gms.car.display.CarRegionId carRegionId2 = new com.google.android.gms.car.display.CarRegionId(2, carDisplayId);
        if (jklVar.b != null) {
            jklVar.c();
            jklVar.b(jhiVar2, carRegionId2, uuid);
        }
    }

    public final void u(defpackage.jhl jhlVar) {
        defpackage.ina inaVar;
        if (jhlVar == null || (inaVar = this.s) == null) {
            return;
        }
        inaVar.f(jhlVar);
    }

    public final void v(java.util.List list) {
        ((defpackage.yqj) a.l().ai((char) 494)).u("doTearDown windows");
        android.util.SparseArray sparseArray = this.S;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            java.util.List<defpackage.jhl> list2 = (java.util.List) sparseArray.valueAt(i);
            if (list2 != null) {
                for (defpackage.jhl jhlVar : list2) {
                    if (this.an) {
                        if (jhlVar.az(1)) {
                            this.U.remove(jhlVar);
                            jhlVar.ah();
                        }
                        if (jhlVar.az(2)) {
                            this.T.remove(jhlVar);
                        }
                    }
                    jhlVar.H();
                }
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() + 1000;
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((defpackage.jhl) it.next()).aX(jElapsedRealtime - android.os.SystemClock.elapsedRealtime());
                }
                list2.clear();
            }
        }
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((defpackage.jhl) it2.next()).W();
        }
        sparseArray.clear();
    }

    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.jkr
    public final void w(java.io.PrintWriter printWriter) {
        java.util.ArrayList arrayList;
        android.util.SparseArray sparseArray;
        java.util.ArrayList arrayList2;
        android.util.SparseArray sparseArray2;
        printWriter.println(" -- ProjectionWindowManager for display ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.af))));
        this.x.d(printWriter);
        printWriter.println("decoder add depth:" + this.y);
        printWriter.println("power saving mode " + this.aG);
        printWriter.println("Frames to send " + this.B.get());
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.H;
        int i = atomicInteger.get();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = this.I;
        int i2 = i + atomicInteger2.get();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = this.J;
        int i3 = i2 + atomicInteger3.get();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = this.aM;
        int i4 = i3 + atomicInteger4.get();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = this.M;
        printWriter.println("total frames:" + (i4 + atomicInteger5.get()) + " normal frames:" + atomicInteger.get() + " idle frames:" + atomicInteger2.get() + " drop by timer:" + atomicInteger3.get() + " drop by ack:" + atomicInteger4.get() + " drop by queue overflow:" + atomicInteger5.get());
        long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Now realtime: ");
        sb.append(jElapsedRealtimeNanos);
        printWriter.println(sb.toString());
        defpackage.jko jkoVar = this.ai;
        int iA = jkoVar.o.a();
        int iA2 = jkoVar.p.a();
        int iA3 = jkoVar.q.a();
        if (jkoVar.n) {
            printWriter.println("FrameTimingHelper results overflow detected, results may be inconsistent.");
        }
        printWriter.println(defpackage.a.bo(iA, "Frames in encoder: "));
        printWriter.println("Frames not yet written to endpoint: " + (iA2 - iA));
        printWriter.println("Frames not yet written to transport: " + (iA3 - iA2));
        printWriter.println("Frames lost in encoder: " + jkoVar.k.get());
        printWriter.println("Frames timed out in encoder: " + jkoVar.l.get());
        printWriter.println("Frames with unknown timestamps: " + jkoVar.m.get());
        printWriter.println("== VSync Info ==");
        printWriter.println("Last frame realtime: " + this.K + " last frame time: " + this.L);
        defpackage.jgu jguVar = this.bf.b;
        if (jguVar == null) {
            printWriter.println("No strategy set");
        } else {
            jguVar.a(printWriter);
        }
        printWriter.println("num renderings per num windows:");
        int i5 = 0;
        for (int i6 = 0; i6 < 6; i6++) {
            printWriter.println(i6 + ":" + this.aN[i6]);
        }
        this.aq.c(printWriter);
        printWriter.println("frame time, delta from prev frame, result");
        defpackage.yfd yfdVar = this.G;
        synchronized (yfdVar) {
            arrayList = new java.util.ArrayList(yfdVar);
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            defpackage.ind indVar = (defpackage.ind) it.next();
            long j = indVar.a;
            printWriter.println("0,0," + ((int) indVar.b));
            defpackage.ind indVar2 = null;
            while (it.hasNext()) {
                defpackage.ind indVar3 = (defpackage.ind) it.next();
                long j2 = indVar3.a;
                printWriter.println((j2 - j) + "," + (j2 - indVar.a) + "," + ((int) indVar3.b));
                indVar2 = indVar;
                indVar = indVar3;
            }
            if (indVar2 != null) {
                printWriter.println("Millis since last entry above: " + ((this.L / 1000000) - indVar2.a));
            }
            printWriter.println();
        }
        defpackage.ina inaVar = this.s;
        printWriter.println(inaVar);
        if (inaVar == null) {
            return;
        }
        inaVar.dump(new android.util.PrintWriterPrinter(printWriter), "CompositionHandler");
        if (!inaVar.a && this.w != null && (this.aq instanceof defpackage.jjc)) {
            printWriter.println("Pixels: ".concat(java.lang.String.valueOf(java.lang.String.valueOf((java.util.List) defpackage.rbz.a(inaVar.getLooper(), new defpackage.imt(this, 1))))));
        }
        printWriter.println("Current displayConfigurationId: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.u))));
        printWriter.println("Windows by layout z -- the order used for rendering: ");
        if (defpackage.acwv.n()) {
            android.util.SparseArray sparseArray3 = new android.util.SparseArray();
            if (!inaVar.a && (sparseArray2 = (android.util.SparseArray) defpackage.rbz.a(inaVar.getLooper(), new defpackage.imt(this, i5))) != null) {
                sparseArray3 = sparseArray2;
            }
            synchronized (this.V) {
                android.util.SparseArray sparseArray4 = this.W;
                int size = sparseArray4.size();
                sparseArray = new android.util.SparseArray(size);
                defpackage.ylx ylxVar = this.X;
                arrayList2 = new java.util.ArrayList(((defpackage.ycs) ylxVar).b);
                for (int i7 = 0; i7 < size; i7++) {
                    java.util.List list = (java.util.List) sparseArray4.valueAt(i7);
                    sparseArray.put(sparseArray4.keyAt(i7), list != null ? new java.util.ArrayList(list) : new java.util.ArrayList());
                }
                arrayList2.addAll(ylxVar.v());
            }
            aR(printWriter, sparseArray3, sparseArray, arrayList2);
        } else {
            aR(printWriter, this.S, this.W, this.X.v());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Focusable windows:");
        synchronized (this.V) {
            for (defpackage.dzp dzpVar : this.aV) {
                sb2.append(" (");
                sb2.append(((defpackage.jhl) dzpVar.b).F());
                sb2.append(", ");
                sb2.append(dzpVar.a);
                sb2.append(")");
            }
        }
        printWriter.println(sb2);
        printWriter.print("Current focus region: ");
        printWriter.print(this.aO);
        printWriter.print(" ");
        printWriter.println(this.bh.r());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Focus history:");
        ?? r2 = this.bh.a;
        int size2 = r2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            defpackage.jhl jhlVar = (defpackage.jhl) r2.get(i8);
            sb3.append(" ");
            sb3.append(jhlVar.F());
        }
        printWriter.println(sb3);
        if (this.m.c.getBoolean("car_dump_screenshot", false)) {
            x(false, false);
        }
        this.Y.f(printWriter);
    }

    public final void x(final boolean z, final boolean z2) {
        defpackage.ina inaVar = this.s;
        if (inaVar == null) {
            return;
        }
        inaVar.c(null, new defpackage.jjd() { // from class: imu
            /* JADX WARN: Code duplicated, block: B:33:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v10 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v13 */
            /* JADX WARN: Type inference failed for: r1v14 */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.io.File] */
            /* JADX WARN: Type inference failed for: r1v8 */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.io.BufferedOutputStream] */
            /* JADX WARN: Type inference failed for: r3v3 */
            /* JADX WARN: Type inference failed for: r3v6 */
            /* JADX WARN: Type inference failed for: r8v0, types: [android.graphics.Bitmap] */
            @Override // defpackage.jjd
            public final void a(android.graphics.Bitmap bitmap) throws java.lang.Throwable {
                java.io.BufferedOutputStream bufferedOutputStream;
                defpackage.inh inhVar = this.a;
                if (z2) {
                    defpackage.ivz.a(inhVar.l, bitmap);
                } else {
                    android.content.Context context = inhVar.l;
                    defpackage.yqm yqmVar = defpackage.ivz.a;
                    android.text.format.Time time = new android.text.format.Time();
                    time.setToNow();
                    ?? B = defpackage.ill.b(context);
                    java.io.File file = null;
                    file = null;
                    file = null;
                    file = null;
                    ?? r3 = 0;
                    if (B != 0) {
                        java.io.File file2 = new java.io.File((java.io.File) B, "screendump-" + time.format("%Y-%m-%d-%H:%M:%S") + ".png");
                        try {
                            try {
                                bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file2));
                                try {
                                    bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, bufferedOutputStream);
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (java.io.IOException unused) {
                                    }
                                    file = file2;
                                    B = bufferedOutputStream;
                                } catch (java.io.IOException unused2) {
                                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ivz.a.f()).ai(1426)).y("cannot save file for screenshot dump:%s", file2);
                                    B = bufferedOutputStream;
                                    if (bufferedOutputStream != null) {
                                        try {
                                            bufferedOutputStream.close();
                                            B = bufferedOutputStream;
                                        } catch (java.io.IOException unused3) {
                                        }
                                    }
                                }
                            } catch (java.lang.Throwable th) {
                                th = th;
                                r3 = B;
                                if (r3 != 0) {
                                    try {
                                        r3.close();
                                    } catch (java.io.IOException unused4) {
                                    }
                                }
                                throw th;
                            }
                        } catch (java.io.IOException unused5) {
                            bufferedOutputStream = null;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (r3 != 0) {
                                r3.close();
                            }
                            throw th;
                        }
                    }
                    if (z) {
                        android.content.Context context2 = inhVar.l;
                        context2.startActivity(new android.content.Intent("android.intent.action.SEND").addFlags(268959744).addFlags(1).setType("image/*").putExtra("android.intent.extra.STREAM", defpackage.dux.a(context2, "com.google.android.gms.fileprovider", file)));
                    }
                }
                bitmap.recycle();
            }
        });
    }

    public final void y() {
        this.P = this.y + 1;
    }

    @Override // defpackage.jkr
    public final void z() {
        defpackage.ina inaVar = this.s;
        if (inaVar != null) {
            inaVar.a();
        }
    }
}
