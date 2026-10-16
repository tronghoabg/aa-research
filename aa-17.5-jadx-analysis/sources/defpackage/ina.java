package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.ArraySet;
import android.util.PrintWriterPrinter;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.TouchEventCompleteData;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class ina implements jkk, jjm {
    public static final yph a = yph.c("CAR.WM");
    private static final ygr au = ygr.r(1, 4, 3, 7);
    public static final Byte b = (byte) 1;
    public static final Byte c = (byte) 2;
    public static final Byte d = (byte) 3;
    public static final Byte e = (byte) 4;
    public static final Byte f = (byte) 5;
    public boolean A;
    public final AtomicInteger B;
    public volatile boolean C;
    public double D;
    public volatile boolean E;
    public volatile tkn F;
    public final ydx G;
    public final AtomicInteger H;
    public final AtomicInteger I;
    public final AtomicInteger J;
    public long K;
    public long L;
    public final AtomicInteger M;
    public final Object N;
    public final Set O;
    public int P;
    public final iva Q;
    public final aat R;
    public final SparseArray S;
    public final Queue T;
    public final List U;
    public final Object V;
    public final SparseArray W;
    public final yks X;
    public final jii Y;
    public final jem Z;
    private final imc aA;
    private BroadcastReceiver aB;
    private Thread aC;
    private final boolean aD;
    private final ivw aE;
    private final ivy aF;
    private volatile boolean aG;
    private boolean aH;
    private float aI;
    private float aJ;
    private final boolean aK;
    private final boolean aL;
    private final AtomicInteger aM;
    private final int[] aN;
    private CarRegionId aO;
    private int aP;
    private boolean aQ;
    private final Map aR;
    private final SparseArray aS;
    private final SparseBooleanArray aT;
    private int aU;
    private final List aV;
    private final Handler aW;
    private final Map aX;
    private final Map aY;
    private final List aZ;
    public final xyc aa;
    public final Object ab;
    public final ArrayList ac;
    public final Set ad;
    public volatile tkn ae;
    public final CarDisplayId af;
    public final jfg ag;
    public jko ah;
    public final jkh ai;
    public final jgi aj;
    public final AtomicLong ak;
    public final jjy al;
    public final jjs am;
    public final boolean an;
    public final boolean ao;
    public final jju ap;
    public final jix aq;
    public final qze ar;
    public final ntn as;
    final izj at;
    private final boolean av;
    private final jkj aw;
    private final jev ax;
    private final jew ay;
    private final ixs az;
    private final ikb ba;
    private final jkq bb;
    private final iur bc;
    private final jke bd;
    private final xya be;
    private final jgn bf;
    private final boolean bg;
    private lds bh;
    private lds bi;
    public final xyc g;
    public final boolean h;
    public final boolean i;
    public final double j;
    boolean k;
    public final Context l;
    public final ikz m;
    public final SharedPreferences.OnSharedPreferenceChangeListener n;
    public boolean o;
    public volatile Surface p;
    public Semaphore q;
    public Looper r;
    public volatile ims s;
    public final Semaphore t;
    public volatile UUID u;
    public ygr v;
    public volatile jhc w;
    public final jjo x;
    public int y;
    public volatile boolean z;

    public ina(jkj jkjVar, Context context, jes jesVar, jev jevVar, ikz ikzVar, jew jewVar, iva ivaVar, ikb ikbVar, ixs ixsVar, jem jemVar, xyc xycVar, CarDisplayId carDisplayId, jfg jfgVar, imc imcVar, jgi jgiVar, iur iurVar, ntn ntnVar) {
        CarInfo carInfo;
        jjs jjtVar = a.P() ? new jjt() : new jjr();
        boolean zF = affa.f(acon.a.gu().d(), "system_theme");
        this.av = zF;
        this.g = wub.L(new imq(0));
        this.j = Build.VERSION.SDK_INT >= 36 ? acvt.c() : 0.5d;
        this.k = false;
        ilg ilgVar = new ilg(this, 2);
        this.n = ilgVar;
        this.t = new Semaphore(1);
        this.aG = false;
        this.z = false;
        this.B = new AtomicInteger(0);
        this.C = false;
        this.aI = BitmapDescriptorFactory.HUE_RED;
        this.aJ = BitmapDescriptorFactory.HUE_RED;
        this.E = false;
        this.F = new tkn(0, 0);
        this.H = new AtomicInteger(0);
        this.I = new AtomicInteger(0);
        this.J = new AtomicInteger(0);
        this.M = new AtomicInteger(0);
        this.aM = new AtomicInteger(0);
        this.aN = new int[6];
        this.N = new Object();
        this.O = new HashSet();
        this.P = 0;
        this.bh = new lds((byte[]) null, (byte[]) null);
        this.aP = -1;
        this.aQ = true;
        this.aR = new HashMap();
        this.aS = new SparseArray();
        this.R = new aat(0);
        this.aT = new SparseBooleanArray();
        this.S = new SparseArray();
        this.T = new PriorityQueue(new azl(8));
        this.U = new ArrayList();
        this.V = new Object();
        this.W = new SparseArray();
        this.X = new yca(12, 3);
        this.aV = new ArrayList();
        this.aW = new sss(Looper.getMainLooper(), (byte[]) null);
        this.aX = new HashMap();
        this.aY = new HashMap();
        this.ab = new Object();
        this.ac = new ArrayList();
        this.ad = new ArraySet();
        this.ae = new tkn(0, 0);
        this.aZ = new ArrayList();
        this.ak = new AtomicLong(0L);
        xyi xyiVar = xvx.a;
        this.be = new xya(xyiVar);
        acvt acvtVar = acvt.a;
        this.an = acvtVar.gu().v();
        this.bg = acvtVar.gu().k();
        izj izjVar = new izj(this);
        this.at = izjVar;
        ols.K(context, "com.google.android.gms.car.PROJECTION_WINDOW_MANAGER", rrx.a.ordinal(), null);
        this.ba = ikbVar;
        CarUiInfo carUiInfo = ikbVar.m;
        carUiInfo.getClass();
        boolean zH = ecw.h(((ima) jesVar).v(false));
        this.i = zH;
        this.aw = jkjVar;
        this.ao = ecw.i();
        this.ar = new qze(this, jewVar);
        this.Z = jemVar;
        CarInfo carInfoT = jesVar.t();
        abru abruVarJ = acvtVar.gu().j();
        yph yphVar = kjf.a;
        Stream streamD = tgx.d(new ilq(17), abruVarJ);
        int i = yfq.d;
        boolean zH2 = kjf.h(carInfoT, (yfq) streamD.collect(ycm.a));
        this.aD = zH2;
        jjo jjqVar = zH2 ? new jjq(this) : new jjp(this);
        this.x = jjqVar;
        this.l = context;
        this.as = ntnVar;
        ivw ivwVar = new ivw(jjqVar, carInfoT);
        this.aE = ivwVar;
        ivwVar.a(false, false);
        this.aF = new ivy(jjqVar);
        this.Q = ivaVar;
        this.bb = new jkq(this, jesVar, jfgVar);
        this.bd = new jke(this);
        this.ax = jevVar;
        this.m = ikzVar;
        ikzVar.d(ilgVar);
        this.ay = jewVar;
        this.az = ixsVar;
        this.aa = xycVar;
        if (zH) {
            this.Y = new jig(this);
            carInfo = carInfoT;
        } else {
            izj izjVar2 = new izj(this);
            izj izjVar3 = new izj(this, null);
            carInfo = carInfoT;
            yph yphVar2 = iue.a;
            this.Y = new jim(this, izjVar3, izjVar2);
        }
        this.af = carDisplayId;
        this.ag = jfgVar;
        this.aA = imcVar;
        jkh jkhVar = new jkh(this, jemVar, jfgVar);
        this.ai = jkhVar;
        boolean zO = ikbVar.o();
        this.aK = zO;
        this.aL = (!actz.a.gu().i() || !carUiInfo.a || carUiInfo.f || zO || carUiInfo.b) ? false : true;
        this.G = new ydx(300);
        this.A = carUiInfo.b;
        ntn ntnVar2 = new ntn((Object) null);
        CarRegionId carRegionId = new CarRegionId(6, carDisplayId);
        context.getClass();
        jkb jkbVar = new jkb(this, carRegionId);
        xyiVar.getClass();
        this.al = (jjy) ntnVar2.i(new jjz(jkbVar, context, xyiVar));
        this.k = ikzVar.n();
        this.aO = new CarRegionId(0, carDisplayId);
        this.aj = jgiVar;
        this.am = jjtVar;
        jgn jgnVar = new jgn(izjVar);
        ilk ilkVar = new ilk(this, 12);
        jgm jgqVar = (Build.VERSION.SDK_INT < 36 || !hnc.a()) ? new jgq(jgnVar, carDisplayId, ilkVar) : new jgl(jgnVar, ilkVar);
        woy.aa(jgnVar.b == null, "set strategy must only be called once");
        jgnVar.b = jgqVar;
        this.bf = jgnVar;
        this.h = new jbq(carInfo.e, carInfo.f).t(6, 0);
        jju jjuVar = new jju();
        this.ap = jjuVar;
        if (zH) {
            this.aq = new jjd(context, new izj(this, null), b(), zF);
        } else {
            this.aq = new jiv(context, jjuVar, jkhVar, jewVar.i() == 0 ? 1 : 0, zF);
        }
        this.bc = iurVar;
    }

    private final void aA(jhf jhfVar) {
        ((ype) a.l().ai((char) 473)).y("Canceling animations for window %s", jhfVar.aM());
        this.Y.d(jhfVar);
    }

    private final void aB() {
        this.aV.clear();
    }

    private final void aC(jhf jhfVar, boolean z, boolean z2, int i, Rect rect) {
        if (jhfVar == null) {
            return;
        }
        if (z && z2) {
            ((ype) a.l().ai((char) 492)).u("Not dispatching window focus gain due to touch event");
        } else {
            jhfVar.W(new InputFocusChangedEvent(z, this.A, i, rect));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aD(defpackage.jhf r26, int r27, int r28, defpackage.ims r29, android.graphics.Rect r30, android.graphics.Rect r31, int r32, int r33, defpackage.jid r34, defpackage.jid r35, int r36, int r37, java.util.List r38, com.google.android.gms.car.ProjectionWindowDecorationParams r39, java.util.UUID r40, android.graphics.Rect r41, int r42) {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            r2 = r30
            jhc r3 = r0.w
            int r3 = r3.f
            r4 = 1
            r5 = 7
            if (r1 == r4) goto L33
            if (r1 == r5) goto L25
            r4 = 3
            if (r1 == r4) goto L25
            r3 = 4
            if (r1 != r3) goto L19
            r3 = r36 | 48
            goto L35
        L19:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "no layout specified for window layer "
            java.lang.String r1 = defpackage.a.bp(r1, r2)
            r0.<init>(r1)
            throw r0
        L25:
            jhc r0 = r0.w
            int r0 = r0.g
            r2 = 0
            r4 = 0
            r11 = r0
            r8 = r2
            r9 = r8
            r10 = r3
            r13 = r4
            r3 = r36
            goto L4c
        L33:
            r3 = r36
        L35:
            int r4 = r2.left
            jhc r0 = r0.w
            int r0 = r0.g
            int r6 = r2.bottom
            int r0 = r0 - r6
            int r6 = r2.width()
            int r2 = r2.height()
            r13 = r31
            r9 = r0
            r11 = r2
            r8 = r4
            r10 = r6
        L4c:
            if (r1 != r5) goto L50
            r3 = r3 | 192(0xc0, float:2.69E-43)
        L50:
            r7 = r26
            r12 = r28
            r14 = r32
            r15 = r33
            r16 = r34
            r17 = r35
            r19 = r37
            r20 = r38
            r21 = r39
            r22 = r40
            r23 = r41
            r24 = r42
            r18 = r3
            r7.ak(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = r29
            r0.g(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ina.aD(jhf, int, int, ims, android.graphics.Rect, android.graphics.Rect, int, int, jid, jid, int, int, java.util.List, com.google.android.gms.car.ProjectionWindowDecorationParams, java.util.UUID, android.graphics.Rect, int):void");
    }

    private final synchronized void aE(jhf jhfVar) {
        while (true) {
            SparseBooleanArray sparseBooleanArray = this.aT;
            if (sparseBooleanArray.size() > 0) {
                int size = sparseBooleanArray.size() - 1;
                int iKeyAt = sparseBooleanArray.keyAt(size);
                boolean zValueAt = sparseBooleanArray.valueAt(size);
                sparseBooleanArray.delete(iKeyAt);
                KeyEvent keyEvent = new KeyEvent(0L, 0L, 1, iKeyAt, 0, this.aU, 0, 0, 4);
                if (!zValueAt || jhfVar == null) {
                    ai(this.bh.K(), keyEvent);
                } else {
                    jhfVar.M(keyEvent);
                }
            }
        }
    }

    private final void aF() {
        yzy yzyVar;
        synchronized (this.V) {
            yzyVar = this.X.A() ? yzy.Ld : this.aV.isEmpty() ? yzy.Le : yzy.Lf;
        }
        rpz.a(this.l).c(rrc.h(yxy.CAR_SERVICE, yzz.PROJECTION_WINDOW_MANAGER, yzyVar).l());
    }

    private final synchronized void aG(jhf jhfVar, jhf jhfVar2) {
        aK(jhfVar, jhfVar2, false, -1, null);
    }

    private final synchronized void aH(jhf jhfVar, boolean z) {
        aJ(jhfVar, z, -1, null);
    }

    private final synchronized void aJ(jhf jhfVar, boolean z, int i, Rect rect) throws Throwable {
        try {
            try {
                aK(l(), jhfVar, z, i, rect);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final synchronized void aK(jhf jhfVar, jhf jhfVar2, boolean z, int i, Rect rect) throws Throwable {
        try {
            if (!this.C) {
                ((ype) a.l().ai((char) 592)).M("Not switching window input focus, composition is not running. toWindow: %s, fromWindow: %s", jhfVar2, jhfVar);
                return;
            }
            if (jhfVar2 == null) {
                ((ype) a.l().ai((char) 591)).y("Not switching window input focus, toWindow is null. fromWindow: %s", jhfVar);
                return;
            }
            if (jhfVar2 == jhfVar) {
                ((ype) a.l().ai((char) 590)).y("Not switching window input focus, toWindow same as fromWindow: %s", jhfVar2);
                return;
            }
            CarUiInfo carUiInfoO = o();
            if (!carUiInfoO.b && !carUiInfoO.a && !carUiInfoO.d) {
                ((ype) a.l().ai((char) 589)).u("Not switching window input focus, no input possible for window");
                return;
            }
            aE(jhfVar);
            ((ype) a.l().ai(588)).T("Moving input focus from [region: %s, z: %s]  to [region: %s, z: %d] with rect %s", jhfVar != null ? jhfVar.C() : "[null]", jhfVar != null ? Integer.valueOf(jhfVar.i()) : "[null]", jhfVar2.C(), Integer.valueOf(jhfVar2.i()), rect);
            try {
                aC(jhfVar, false, z, -1, null);
                aC(jhfVar2, true, z, i, rect);
                this.aO = jhfVar2.C();
                this.bh.M(jhfVar2);
                this.aP = i;
            } catch (Throwable th) {
                th = th;
                this = this;
                Throwable th2 = th;
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final void aL() {
        ims imsVar = this.s;
        if (imsVar != null) {
            imsVar.e();
        }
    }

    private final boolean aM(jhf jhfVar) {
        if (jhfVar == null || jhfVar.C() == null) {
            return false;
        }
        return this.aA.d(jhfVar.C());
    }

    private static boolean aN(int i, int i2, jhf jhfVar) {
        return jhfVar != null && jhfVar.aC() && jhfVar.ax(1) && jhfVar.aw(i, i2) && jhfVar.aY();
    }

    private final boolean aO(jhf jhfVar) {
        boolean zRemove;
        SparseArray sparseArray = this.W;
        int i = jhfVar.i();
        List list = (List) sparseArray.get(i);
        if (list != null) {
            zRemove = list.remove(jhfVar);
            if (zRemove && list.isEmpty()) {
                sparseArray.remove(i);
            }
        } else {
            zRemove = false;
        }
        this.X.C(jhfVar.C(), jhfVar);
        return zRemove;
    }

    private final boolean aP(jhf jhfVar) {
        jhf jhfVarK = this.bh.K();
        return jhfVarK != null && jhfVar.n().contains(jhfVarK.n()) && jhfVar.h() >= jhfVarK.h();
    }

    private static final boolean aQ(jid jidVar) {
        return (jidVar == null || jidVar.b == null) ? false : true;
    }

    private static final void aR(PrintWriter printWriter, SparseArray sparseArray, SparseArray sparseArray2, Collection collection) {
        for (int i = 0; i < sparseArray.size(); i++) {
            List list = (List) sparseArray.valueAt(i);
            printWriter.println("z " + sparseArray.keyAt(i));
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((jhf) it.next()).aQ(printWriter);
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
            List<jhf> list2 = (List) sparseArray2.valueAt(size);
            printWriter.printf("z: %d\n", Integer.valueOf(sparseArray2.keyAt(size)));
            if (list2 != null) {
                for (jhf jhfVar : list2) {
                    if (jhfVar != null) {
                        jhfVar.aQ(printWriter);
                    }
                }
            }
        }
        printWriter.println("Windows by region: ");
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            jhf jhfVar2 = (jhf) it2.next();
            if (jhfVar2 != null) {
                jhfVar2.aQ(printWriter);
            }
        }
    }

    private final Rect ar(jhf jhfVar, jhf jhfVar2, Rect rect) {
        int iF = this.av ? jhfVar.f() : 1;
        if (jhfVar.b() > jhfVar2.b() || jhfVar.b() + jhfVar.k() < jhfVar2.b() + jhfVar2.k()) {
            if (jhfVar.c() <= jhfVar2.c() && jhfVar.c() + jhfVar.d() >= jhfVar2.c() + jhfVar2.d()) {
                if (jhfVar.b() <= jhfVar2.b()) {
                    iF = 2;
                } else if (jhfVar.b() + jhfVar.k() >= jhfVar2.b() + jhfVar2.k()) {
                    iF = 4;
                }
            }
        } else if (jhfVar.c() <= jhfVar2.c()) {
            iF = 16;
        } else if (jhfVar.c() + jhfVar.d() >= jhfVar2.c() + jhfVar2.d()) {
            iF = 8;
        }
        if (iF == 1) {
            throw new IllegalStateException(a.bL(jhfVar2, jhfVar, "Window ", " does not mostly cover or provide a hint for one side of "));
        }
        Rect rect2 = new Rect(rect);
        Rect rectR = jhfVar.r();
        if (rectR == null) {
            rectR = new Rect();
        }
        if (iF != 1) {
            if (iF != 2) {
                if (iF == 4) {
                    rect2.right = Math.max(rect.right, ((jhfVar2.b() + jhfVar2.k()) - jhfVar.b()) - rectR.left);
                    return rect2;
                }
                if (iF == 8) {
                    rect2.top = Math.max(rect.top, ((jhfVar2.c() + jhfVar2.d()) - jhfVar.c()) - rectR.bottom);
                    return rect2;
                }
                if (iF != 16) {
                    ((ype) a.l().ai((char) 464)).w("Invalid inset direction %d provided.", iF);
                    return rect2;
                }
                rect2.bottom = Math.max(rect.bottom, ((jhfVar.c() + jhfVar.d()) - jhfVar2.c()) - rectR.top);
                return rect2;
            }
            rect2.left = Math.max(rect.left, ((jhfVar.b() + jhfVar.k()) - jhfVar2.b()) - rectR.right);
        }
        return rect2;
    }

    private final dzi as(jhf jhfVar) {
        for (dzi dziVar : this.aV) {
            if (dziVar.b == jhfVar) {
                return dziVar;
            }
        }
        return null;
    }

    private final jhf at(jhf jhfVar) {
        jhf jhfVar2;
        ((ype) a.l().ai((char) 477)).y("Computing next highest focusable window from window %s", jhfVar);
        synchronized (this.V) {
            jhfVar2 = null;
            for (dzi dziVar : this.aV) {
                if (jhfVar == null || ((jhf) dziVar.b).i() <= jhfVar.i()) {
                    jhf jhfVar3 = (jhf) dziVar.b;
                    if (!jhfVar3.av(1) && !jhfVar3.av(sk.AUDIO_CONTENT_BUFFER_SIZE) && (jhfVar2 == null || jhfVar2.i() < jhfVar3.i())) {
                        jhfVar2 = jhfVar3;
                    }
                }
            }
        }
        return jhfVar2;
    }

    private final jhf au(jhf jhfVar, int i, boolean z) {
        return m(this.w, this.aV, jhfVar, i, z, null);
    }

    private final Collection av(CarRegionId carRegionId, boolean z) {
        if (!z) {
            return ((yar) this.X).c(carRegionId);
        }
        yfq yfqVarB = this.aA.b(carRegionId);
        yar yarVar = (yar) this.X;
        List listC = yarVar.c(carRegionId);
        if (!listC.isEmpty()) {
            ax(yfqVarB);
            return listC;
        }
        int size = yfqVarB.size();
        int i = 0;
        while (i < size) {
            List listC2 = yarVar.c((CarRegionId) yfqVarB.get(i));
            i++;
            if (!listC2.isEmpty()) {
                return listC2;
            }
        }
        return listC;
    }

    private final void aw(jhf jhfVar, int i) {
        SparseArray sparseArray = this.W;
        List arrayList = (List) sparseArray.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            sparseArray.put(i, arrayList);
        }
        arrayList.add(jhfVar);
        List listC = ((yar) this.X).c(jhfVar.C());
        int i2 = 0;
        while (i2 < listC.size() && jhfVar.i() < ((jhf) listC.get(i2)).i()) {
            i2++;
        }
        listC.add(i2, jhfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ax(yfq yfqVar) {
        int size = yfqVar.size();
        for (int i = 0; i < size; i++) {
            CarRegionId carRegionId = (CarRegionId) yfqVar.get(i);
            List listC = ((yar) this.X).c(carRegionId);
            woy.af(listC.isEmpty(), "Region %s has windows %s which should not exist", carRegionId, listC);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void ay(defpackage.jhf r10, int r11, defpackage.jhf r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ina.ay(jhf, int, jhf):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void az() {
        yfq ylsVar;
        aB();
        Region region = new Region();
        SparseArray sparseArray = this.W;
        int size = sparseArray.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            for (jhf jhfVar : (List) sparseArray.valueAt(size)) {
                if (!jhfVar.av(64)) {
                    Rect rectN = jhfVar.n();
                    if (acvt.a.gu().o()) {
                        Rect rectS = jhfVar.s();
                        rectN.left += rectS.left;
                        rectN.right -= rectS.right;
                        rectN.top += rectS.top;
                        rectN.bottom -= rectS.bottom;
                    }
                    Region region2 = new Region(rectN);
                    region2.op(region, Region.Op.DIFFERENCE);
                    if (region2.isEmpty()) {
                        int i = yfq.d;
                        ylsVar = yls.a;
                    } else if (jhfVar.av(2048) && region2.isComplex()) {
                        Rect bounds = region.getBounds();
                        int i2 = yfq.d;
                        yfl yflVar = new yfl(4);
                        if (rectN.left < bounds.left) {
                            yflVar.i(new Rect(rectN.left, bounds.top, bounds.left, bounds.bottom));
                        }
                        if (rectN.right > bounds.right) {
                            yflVar.i(new Rect(bounds.right, bounds.top, rectN.right, bounds.bottom));
                        }
                        if (rectN.top < bounds.top) {
                            yflVar.i(new Rect(rectN.left, rectN.top, rectN.right, bounds.top));
                        }
                        if (rectN.bottom > bounds.bottom) {
                            yflVar.i(new Rect(rectN.left, bounds.bottom, rectN.right, rectN.bottom));
                        }
                        ylsVar = yflVar.g();
                    } else {
                        Rect bounds2 = region2.getBounds();
                        int i3 = yfq.d;
                        Object[] objArr = {bounds2};
                        yrm.B(objArr, 1);
                        ylsVar = new yls(objArr, 1);
                    }
                    for (int i4 = 0; i4 < ((yls) ylsVar).c; i4++) {
                        this.aV.add(new dzi((Rect) ylsVar.get(i4), jhfVar));
                    }
                    if (!ylsVar.isEmpty()) {
                        region.op(rectN, Region.Op.UNION);
                    }
                    if (true == jhfVar.av(16)) {
                        size = 0;
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(this.aV);
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            jhf jhfVar2 = (jhf) ((dzi) arrayList.get(i5)).b;
            int i6 = au(jhfVar2, 21, false) != null ? 1 : 0;
            if (au(jhfVar2, 19, false) != null) {
                i6 |= 2;
            }
            if (au(jhfVar2, 22, false) != null) {
                i6 |= 4;
            }
            if (au(jhfVar2, 20, false) != null) {
                i6 |= 8;
            }
            CarWindowManagerLayoutParams carWindowManagerLayoutParamsA = jhfVar2.A();
            if (i6 != carWindowManagerLayoutParamsA.a) {
                carWindowManagerLayoutParamsA.a = i6;
                jhfVar2.an(carWindowManagerLayoutParamsA);
            }
        }
    }

    static jhf m(jhc jhcVar, List list, jhf jhfVar, final int i, boolean z, Rect rect) {
        boolean z2;
        int i2;
        boolean zIntersects;
        if (actz.a.gu().i()) {
            if (i == 260) {
                i = 19;
            } else if (i == 261) {
                i = 20;
            }
        }
        Collections.sort(list, new Comparator() { // from class: imk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int iH;
                int iH2;
                dzi dziVar = (dzi) obj;
                dzi dziVar2 = (dzi) obj2;
                yph yphVar = ina.a;
                int i3 = i;
                if (i3 == 20) {
                    int i4 = ((Rect) dziVar.a).top - ((Rect) dziVar2.a).top;
                    if (i4 != 0) {
                        return i4;
                    }
                    iH = ((jhf) dziVar2.b).h();
                    iH2 = ((jhf) dziVar.b).h();
                } else if (i3 == 19) {
                    int i5 = ((Rect) dziVar2.a).bottom - ((Rect) dziVar.a).bottom;
                    if (i5 != 0) {
                        return i5;
                    }
                    iH = ((jhf) dziVar2.b).h();
                    iH2 = ((jhf) dziVar.b).h();
                } else if (i3 == 21) {
                    int i6 = ((Rect) dziVar2.a).right - ((Rect) dziVar.a).right;
                    if (i6 != 0) {
                        return i6;
                    }
                    iH = ((jhf) dziVar2.b).h();
                    iH2 = ((jhf) dziVar.b).h();
                } else {
                    int i7 = ((Rect) dziVar.a).left - ((Rect) dziVar2.a).left;
                    if (i7 != 0) {
                        return i7;
                    }
                    iH = ((jhf) dziVar2.b).h();
                    iH2 = ((jhf) dziVar.b).h();
                }
                return iH - iH2;
            }
        });
        jhf jhfVar2 = null;
        boolean z3 = false;
        dzi dziVar = null;
        int i3 = 0;
        while (i3 < list.size()) {
            dziVar = (dzi) list.get(i3);
            if (dziVar.b == jhfVar) {
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
        if (dziVar == null) {
            i3 = -1;
            if (z4) {
                z3 = z2;
                i2 = -1;
            } else if (z2) {
                i2 = jhcVar.g;
                z3 = true;
            } else {
                i2 = jhcVar.f;
            }
        } else if (z2) {
            i2 = ((Rect) dziVar.a).top;
            z3 = true;
        } else {
            i2 = ((Rect) dziVar.a).left;
        }
        Rect rect2 = new Rect();
        for (int i4 = i3 + 1; i4 >= 0 && i4 < list.size(); i4++) {
            dzi dziVar2 = (dzi) list.get(i4);
            if (!z || ((jhf) dziVar2.b).av(4)) {
                int i5 = z3 ? ((Rect) dziVar2.a).top : ((Rect) dziVar2.a).left;
                if ((z4 && i5 > i2) || (!z4 && i5 < i2)) {
                    if (rect == null) {
                        return (jhf) dziVar2.b;
                    }
                    if (z3) {
                        Rect rect3 = (Rect) dziVar2.a;
                        rect2.set(rect.left, rect3.top, rect.right, rect3.bottom);
                        zIntersects = Rect.intersects(rect2, rect3);
                    } else {
                        Rect rect4 = (Rect) dziVar2.a;
                        rect2.set(rect4.left, rect.top, rect4.right, rect.bottom);
                        zIntersects = Rect.intersects(rect2, rect4);
                    }
                    if (zIntersects) {
                        return (jhf) dziVar2.b;
                    }
                    if (jhfVar2 == null) {
                        jhfVar2 = (jhf) dziVar2.b;
                    }
                }
            }
        }
        return jhfVar2;
    }

    @Override // defpackage.jjm
    public final void A(int i) {
        if (this.C) {
            this.Q.u(i);
            synchronized (this.V) {
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray = this.W;
                    if (i2 < sparseArray.size()) {
                        for (jhf jhfVar : (List) sparseArray.valueAt(i2)) {
                            if (jhfVar != null) {
                                jhfVar.U(i);
                            }
                        }
                        i2++;
                    }
                }
            }
        }
    }

    public final void B(jhf jhfVar, long j, long j2, int i, List list) {
        jhf jhfVarK;
        synchronized (this) {
            jhfVarK = this.bh.K();
        }
        if (jhfVar != jhfVarK) {
            aH(jhfVar, true);
        }
        this.am.b(j2, i, list);
        jhfVar.aG(j, j2, i, list);
    }

    @Override // defpackage.ivg
    public final void C() {
        Optional optionalOf;
        long andSet = this.ak.getAndSet(0L);
        if (andSet != 0) {
            this.ag.f(yzz.PROJECTION_WINDOW_MANAGER, yzy.Hg, (SystemClock.elapsedRealtimeNanos() - andSet) / 1000000);
        }
        AtomicInteger atomicInteger = this.B;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        int i = 0;
        if (iDecrementAndGet < 0) {
            atomicInteger.set(0);
            ((ype) ((ype) a.h()).ai((char) 530)).w("negative remaining frames:%d", iDecrementAndGet);
        }
        jkh jkhVar = this.ai;
        ntn ntnVar = jkhVar.q;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        jkf jkfVarB = ntnVar.b();
        if (jkfVarB == null) {
            ((ype) ((ype) jkh.a.h()).ai((char) 2252)).u("Too many onFrameSent callbacks!");
            optionalOf = Optional.empty();
        } else {
            jkfVarB.f = jElapsedRealtimeNanos;
            Duration durationOfNanos = Duration.ofNanos(jkfVarB.d - jkfVarB.c);
            if (jkfVarB.e != 0) {
                jElapsedRealtimeNanos = jkfVarB.e;
            }
            jkg jkgVar = new jkg(durationOfNanos, Duration.ofNanos(jElapsedRealtimeNanos - jkfVarB.d), Duration.ofNanos(jkfVarB.c - jkfVarB.b));
            jkhVar.d();
            optionalOf = Optional.of(jkgVar);
        }
        imn imnVar = new imn(this, i);
        if (true == optionalOf.isPresent()) {
            Object obj = optionalOf.get();
            ina inaVar = (ina) imnVar.a;
            jdr jdrVar = inaVar.Z.j;
            if (jdrVar instanceof jen) {
                jen jenVar = (jen) jdrVar;
                jkg jkgVar2 = (jkg) obj;
                jenVar.t(jkgVar2.a);
                jenVar.s(jkgVar2.c);
                if (!inaVar.h) {
                    jenVar.u(jkgVar2.b);
                }
            }
        }
        if (this.h) {
            this.aj.l();
        }
        this.aj.f();
    }

    @Override // defpackage.ivg
    public final void D() {
        jkh jkhVar = this.ai;
        ntn ntnVar = jkhVar.p;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        jkf jkfVarB = ntnVar.b();
        if (jkfVarB == null) {
            ((ype) ((ype) jkh.a.h()).ai((char) 2253)).u("Too many onFrameWritten callbacks!");
        } else {
            jkfVarB.e = jElapsedRealtimeNanos;
            jkfVarB.b();
            jkhVar.d();
        }
        this.aj.e();
    }

    @Override // defpackage.jkk
    public final synchronized void E() throws Throwable {
        try {
            if (this.aQ) {
                ((ype) ((ype) a.h()).ai((char) 536)).u("Input focus gained again");
                return;
            }
            this.aQ = true;
            jhf jhfVarL = l();
            yph yphVar = a;
            ((ype) yphVar.l().ai((char) 534)).y("Input focus gained. Focused window: %s", jhfVarL);
            if (jhfVarL != null) {
                aE(null);
                try {
                    aC(jhfVarL, true, false, -1, null);
                    return;
                } catch (Throwable th) {
                    th = th;
                    this = this;
                    throw th;
                }
            }
            jhf jhfVarK = k(this.aO, true);
            if (jhfVarK == null || !ag(jhfVarK) || !af(jhfVarK, false)) {
                jhfVarK = at(null);
            }
            if (jhfVarK == null) {
                ((ype) ((ype) yphVar.f()).ai((char) 535)).u("No Focusable windows");
            } else {
                aE(null);
                aH(jhfVarK, false);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.jkk
    public final synchronized void F() throws Throwable {
        ina inaVar;
        try {
            try {
                jhf jhfVarL = l();
                ((ype) a.l().ai((char) 537)).y("Input focus lost. Focused window: %s", jhfVarL);
                if (jhfVarL != null) {
                    aE(jhfVarL);
                    inaVar = this;
                    inaVar.aC(jhfVarL, false, false, -1, null);
                } else {
                    inaVar = this;
                }
                inaVar.aQ = false;
                return;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }

    @Override // defpackage.jkk
    public final void G(jhf jhfVar, MotionEvent motionEvent, TouchEventCompleteData touchEventCompleteData) {
        int i;
        float f2;
        this.aP = -1;
        int i2 = 0;
        boolean z = this.aK && motionEvent.getSource() == 1048584;
        boolean z2 = this.aL && motionEvent.getSource() == 8194;
        if (z || z2) {
            if (this.o) {
                ((ype) ((ype) a.h()).ai((char) 543)).u("Cannot invoke onMotionEventComplete when disconnected.");
                return;
            }
            if (jhfVar != l()) {
                ((ype) ((ype) a.h()).ai(542)).M("Ignoring event delivered to old window. event:%s, data:%s", motionEvent, touchEventCompleteData);
                return;
            }
            jhfVar.ai(touchEventCompleteData.b);
            int i3 = touchEventCompleteData.a;
            if (i3 == -1) {
                int i4 = touchEventCompleteData.c;
                int i5 = i4 != 1 ? i4 != 2 ? i4 != 17 ? i4 != 33 ? i4 != 66 ? i4 != 130 ? 0 : 20 : 22 : 19 : 21 : 261 : 260;
                if (i5 == 0) {
                    int source = motionEvent.getSource();
                    if (source == 8194) {
                        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                        motionEvent.getPointerCoords(0, pointerCoords);
                        i = pointerCoords.getAxisValue(9) > BitmapDescriptorFactory.HUE_RED ? 261 : 260;
                    } else {
                        if (source != 1048584) {
                            throw new IllegalArgumentException("Unable to map keycode from event source: " + motionEvent.getSource());
                        }
                        float x = motionEvent.getX() - this.aI;
                        float y = motionEvent.getY() - this.aJ;
                        ikb ikbVar = this.ba;
                        float fAbs = Math.abs(x);
                        float fAbs2 = Math.abs(y);
                        int iE = ikbVar.e();
                        if (fAbs2 >= fAbs) {
                            f2 = BitmapDescriptorFactory.HUE_RED;
                            if (fAbs2 >= iE) {
                                i = y > BitmapDescriptorFactory.HUE_RED ? 20 : 19;
                            }
                        } else {
                            f2 = BitmapDescriptorFactory.HUE_RED;
                        }
                        i = (fAbs <= fAbs2 || fAbs < ((float) iE)) ? 0 : x > f2 ? 22 : 21;
                    }
                } else {
                    i = i5;
                }
                if (i != 0) {
                    KeyEvent keyEvent = new KeyEvent(1, i);
                    keyEvent.setSource(motionEvent.getSource());
                    if (ai(jhfVar, keyEvent)) {
                        if (true == z) {
                            i2 = 2;
                        }
                    }
                } else {
                    ((ype) ((ype) a.h()).ai(541)).S("keycode is unknown for event:%s, wasUiTouchpad:%s, touchpadOriginX:%s, touchpadOriginY:%s", motionEvent, Boolean.valueOf(z), Float.valueOf(this.aI), Float.valueOf(this.aJ));
                }
                i2 = -1;
            } else {
                i2 = i3;
            }
            if (i2 == -1 || i2 == 0) {
                return;
            }
            this.ba.n(i2);
        }
    }

    @Override // defpackage.jkk
    public final synchronized void H(MotionEvent motionEvent) {
        if (this.C) {
            this.A = false;
            jhf jhfVarL = l();
            if (jhfVarL != null) {
                jhfVarL.O(motionEvent);
            } else {
                ((ype) ((ype) a.f()).ai((char) 544)).u("Scroll event dropped, no focusable windows");
                aF();
            }
        }
    }

    @Override // defpackage.jkk
    public final synchronized void I(MotionEvent motionEvent) {
        this.A = false;
        if (this.C) {
            jhf jhfVarL = l();
            if (jhfVarL == null) {
                ((ype) ((ype) a.f()).ai((char) 545)).u("No window to send touchpad event to");
                aF();
                return;
            }
            if (this.aK && motionEvent.getAction() == 0) {
                this.aI = motionEvent.getX();
                this.aJ = motionEvent.getY();
            }
            jhfVarL.P(motionEvent);
        }
    }

    @Override // defpackage.jkk
    public final synchronized void J(xop xopVar, UUID uuid) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 550)).u("onUpdateUiConfigRequest");
        UUID uuid2 = this.u;
        boolean z = false;
        if (uuid2 != null && !uuid2.equals(uuid)) {
            z = true;
        }
        iuw iuwVarA = this.Q.a();
        iuwVarA.getClass();
        t(iuwVarA, uuid);
        this.Y.n(this.w.f, this.w.g - this.w.h);
        ims imsVar = this.s;
        if (imsVar == null) {
            ((ype) yphVar.l().ai((char) 551)).u("Resize when not compositing, not showing loading screen");
            this.ai.e(xopVar);
        } else {
            imsVar.b(xopVar);
            if (z) {
                rbe.j(new aq(this, uuid, 13, null));
            }
        }
    }

    @Override // defpackage.jkk
    public final synchronized void K(jhf jhfVar, boolean z) {
        L(jhfVar, z, null, null);
    }

    @Override // defpackage.jkk
    public final synchronized void L(jhf jhfVar, boolean z, jid jidVar, jid jidVar2) {
        boolean zContains;
        boolean zAh;
        ((ype) a.l().ai((char) 553)).y("window attach complete %s", jhfVar.aM());
        if (jhfVar == null) {
            return;
        }
        try {
            synchronized (this.V) {
                zContains = av(jhfVar.C(), true).contains(jhfVar);
                zAh = false;
                if (zContains) {
                    if (jhfVar.F().equals(this.u)) {
                        N(jhfVar);
                        zAh = ah(jhfVar, this.Y.w(jhfVar));
                    }
                    if (zAh) {
                        jidVar = jidVar2;
                    }
                }
            }
            if (!zContains) {
                try {
                    R(jhfVar, null, null, true, true, false, null);
                    return;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
            if (!z) {
                jhfVar.ao();
            } else if (aQ(jidVar)) {
                this.Y.j(jhfVar, jidVar);
            } else if (!aM(jhfVar) || (zAh && !(this.bg && this.Y.u()))) {
                this.Y.o(jhfVar, jidVar);
            } else {
                this.Y.l(jhfVar, jidVar);
            }
            rbe.g(Looper.getMainLooper(), new aq(this, jhfVar, 14, null));
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.jkk
    public final void M(Runnable runnable) {
        ims imsVar = this.s;
        if (imsVar != null) {
            imsVar.postAtFrontOfQueue(runnable);
        }
    }

    public final void N(jhf jhfVar) {
        O(jhfVar, yly.a, new ArraySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(jhf jhfVar, ygr ygrVar, Set set) {
        int i;
        if (!jhfVar.F().equals(this.u)) {
            ((ype) ((ype) a.f()).ai((char) 560)).y("%s does not have the correct configuration, unable to receive insets", jhfVar);
            return;
        }
        Rect rect = new Rect();
        yfq yfqVarD = jhfVar.D();
        int size = yfqVarD.size();
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            Iterator it = ((yar) this.X).c((CarRegionId) yfqVarD.get(i2)).iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    jhf jhfVar2 = (jhf) it.next();
                    set.remove(jhfVar2);
                    if (!jhfVar2.F().equals(this.u)) {
                        jhfVar2.aM();
                    } else if (ygrVar.contains(jhfVar2)) {
                        jhfVar2.aM();
                    } else {
                        rect = ar(jhfVar2, jhfVar, rect);
                        z |= !jhfVar2.aA();
                    }
                }
            }
            i2 = i;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            jhf jhfVar3 = (jhf) it2.next();
            if (yfqVarD.contains(jhfVar3.C())) {
                if (!jhfVar3.F().equals(this.u)) {
                    jhfVar3.aM();
                } else if (ygrVar.contains(jhfVar3)) {
                    jhfVar3.aM();
                } else {
                    rect = ar(jhfVar3, jhfVar, rect);
                    z |= !jhfVar3.aA();
                }
            }
        }
        if (rect.equals(jhfVar.v())) {
            return;
        }
        ((ype) a.l().ai((char) 555)).M("%s receives insets %s", jhfVar, rect);
        jhfVar.au(rect, z);
    }

    @Override // defpackage.jkk
    public final void P(jhf jhfVar) {
        synchronized (this.V) {
            N(jhfVar);
        }
    }

    public final void Q(int i) {
        this.aS.remove(i);
    }

    public final synchronized void R(jhf jhfVar, jid jidVar, jid jidVar2, boolean z, boolean z2, boolean z3, jhf jhfVar2) {
        boolean zAO;
        if (jhfVar != null) {
            yph yphVar = a;
            ((ype) yphVar.l().ai(563)).T("removeProjectionWindow %s, %s, %s, %s, %s", jhfVar.E(), jidVar, jidVar2, Boolean.valueOf(z), jhfVar2);
            boolean zO = this.bh.O(jhfVar);
            this.bh.N(jhfVar);
            if (this.C || !z3) {
                this.aZ.remove(jhfVar);
                lds ldsVar = this.bi;
                if (ldsVar != null) {
                    ldsVar.N(jhfVar);
                }
            }
            synchronized (this.V) {
                zAO = aO(jhfVar);
                if (zAO) {
                    az();
                    if (z && al(jhfVar, jhfVar2, this.Y.v(jhfVar))) {
                        ((ype) yphVar.l().ai(570)).y("Using region removal animation %s", jidVar2);
                        if (jidVar2 != null) {
                            jidVar = jidVar2;
                        }
                    }
                }
            }
            int iJ = jhfVar.j();
            if (iJ == 5) {
                aA(jhfVar);
                ((ype) ((ype) yphVar.f()).ai((char) 569)).y("removing window that is already removed %s", jhfVar);
                jhfVar.L();
                return;
            }
            if (iJ == 4 && this.Y.t(jhfVar)) {
                jhfVar.L();
                return;
            }
            if (!zAO) {
                jhfVar.ad();
                aA(jhfVar);
                if (z2) {
                    u(jhfVar);
                }
                jhfVar.L();
                ((ype) yphVar.l().ai((char) 568)).y("window removed %s", jhfVar);
                return;
            }
            if (zO) {
                ((ype) yphVar.l().ai((char) 565)).y("Removing window that was focused: %s", jhfVar.aM());
                jhf jhfVarL = this.bh.L(new imo(this, 1));
                if (jhfVarL == null) {
                    ((ype) yphVar.l().ai((char) 567)).u("Unable to find a window from history, switching to next highest focusable");
                    jhfVarL = at(jhfVar);
                } else {
                    ((ype) yphVar.l().ai((char) 566)).y("Found window %s from focus history", jhfVarL.aM());
                }
                aG(jhfVar, jhfVarL);
            }
            jhfVar.ad();
            ((ype) yphVar.l().ai((char) 564)).y("window detached %s", jhfVar);
            if (!jhfVar.aC()) {
                aA(jhfVar);
                if (z2) {
                    u(jhfVar);
                }
            } else {
                if (aQ(jidVar)) {
                    this.Y.i(jhfVar, jidVar, z2);
                    return;
                }
                if (aM(jhfVar) && jhfVar2 != null) {
                    this.Y.k(jhfVar, jidVar, z2);
                    return;
                }
                if (!this.Y.x(jhfVar, jidVar, z2)) {
                    jhfVar.L();
                }
            }
        }
    }

    public final void S(jhf jhfVar, int i) {
        List list = (List) this.S.get(i);
        if (list == null || !list.remove(jhfVar)) {
            return;
        }
        list.size();
        y();
    }

    @Override // defpackage.jkk
    public final void T() {
        if (this.aG) {
            return;
        }
        ixs ixsVar = this.az;
        ixsVar.getClass();
        new sss(Looper.getMainLooper()).post(new imt(ixsVar, 1, null));
    }

    @Override // defpackage.jkk
    public final void U() {
        this.Z.H();
    }

    @Override // defpackage.jkk
    public final void V(ivv ivvVar) {
        long jG;
        int i;
        ((ype) ivy.a.l().ai((char) 1438)).y("setFrameRateRestriction(%s)", ivvVar);
        ivy ivyVar = this.aF;
        synchronized (ivyVar.c) {
            ivyVar.d = ivvVar;
            int iOrdinal = ivyVar.d.ordinal();
            if (iOrdinal == 0) {
                jG = acqy.g();
            } else if (iOrdinal == 1) {
                jG = acqy.i();
            } else if (iOrdinal == 2) {
                jG = acqy.h();
            } else {
                if (iOrdinal != 3) {
                    throw new RuntimeException(null, null);
                }
                i = 0;
            }
            i = (int) jG;
        }
        ivyVar.b.b(ivyVar.e, i);
    }

    @Override // defpackage.jkk
    public final synchronized void W(CarRegionId carRegionId, jhf jhfVar, jid jidVar, jid jidVar2) {
        jhf jhfVarK;
        synchronized (this.V) {
            jhfVarK = k(carRegionId, true);
        }
        if (jhfVar == jhfVarK) {
            return;
        }
        byte[] bArr = null;
        this.aX.put(carRegionId, new jin(null, jidVar, null, jidVar2));
        Map map = this.aY;
        if (!map.containsKey(carRegionId)) {
            map.put(carRegionId, new aq(this, carRegionId, 15, bArr));
        }
        this.aW.postDelayed((Runnable) map.get(carRegionId), 5000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, qyw] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.jkk
    public final synchronized void X(boolean z) {
        if (this.C || !z) {
            this.aH = z;
        } else {
            ((ype) ((ype) a.h()).ai((char) 586)).u("stopComposition called for transient loss while not compositing");
        }
        lds ldsVar = this.bh;
        lds ldsVar2 = new lds((byte[]) null, (byte[]) null);
        ((imz) ldsVar2.a).addAll(ldsVar.a);
        this.bi = ldsVar2;
        this.bb.b();
        this.bd.c();
        ((ype) a.l().ai((char) 582)).u("stopComposition");
        if (this.C) {
            xya xyaVar = this.be;
            xyaVar.d();
            xyaVar.e();
            List list = this.aZ;
            list.clear();
            synchronized (this.V) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = this.W;
                    if (i >= sparseArray.size()) {
                        break;
                    }
                    list.addAll((List) sparseArray.valueAt(i));
                    i++;
                }
            }
            ((ype) a.l().ai(583)).y("Keep %s windows for recovery.", this.aZ);
            qze qzeVar = this.ar;
            synchronized (qzeVar.a) {
                Iterator it = qzeVar.c.iterator();
                while (it.hasNext()) {
                    try {
                        ((imv) it.next()).a.e(false);
                    } catch (RemoteException unused) {
                    }
                }
            }
            if (this.aB != null) {
                etb.a(this.l).c(this.aB);
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
            } catch (InterruptedException e2) {
                ((ype) ((ype) ((ype) a.g()).p(e2)).ai((char) 585)).u("Interrupted exception before composition thread joined");
            }
            if (this.aC.isAlive()) {
                ((ype) ((ype) a.h()).ai((char) 584)).u("CompositionThread still alive!");
                this.ax.aH(jeu.e);
            }
            jkh jkhVar = this.ai;
            jkhVar.c();
            jkhVar.n = false;
            jkhVar.k.set(0);
            jkhVar.l.set(0);
            jkhVar.m.set(0);
            this.aC = null;
            this.p = null;
            this.q = null;
            this.s = null;
            this.r = null;
            ydx ydxVar = this.G;
            synchronized (ydxVar) {
                ydxVar.clear();
            }
            jgi jgiVar = this.aj;
            jgiVar.g.d(jgiVar.c);
            synchronized (jgiVar) {
                Queue queue = jgiVar.f;
                Iterator it2 = queue.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Integer) it2.next()).intValue();
                    jfg jfgVar = jgiVar.c;
                    rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzz.PROJECTION_WINDOW_MANAGER, yzy.Jr);
                    rrbVarH.w(iIntValue);
                    jfgVar.b(rrbVarH.l());
                }
                queue.clear();
            }
            jgiVar.h();
            jgiVar.k();
            long andSet = this.ak.getAndSet(0L);
            if (andSet != 0) {
                this.ag.f(yzz.PROJECTION_WINDOW_MANAGER, yzy.Hh, (SystemClock.elapsedRealtimeNanos() - andSet) / 1000000);
            }
        }
    }

    @Override // defpackage.jkk
    public final void Y() {
        ((ype) a.l().ai((char) 587)).u("stopCompositionNow");
        if (this.C) {
            this.bf.b();
            if (this.aB != null) {
                etb.a(this.l).c(this.aB);
                this.aB = null;
            }
            this.C = false;
            Looper looper = this.r;
            if (looper != null) {
                aL();
                looper.quitSafely();
            }
        }
    }

    @Override // defpackage.jkk
    public final synchronized void Z(jhf jhfVar) {
        aJ(jhfVar, false, -1, null);
    }

    @Override // defpackage.jkk
    public final int a(int i) {
        return Math.round(i * (d() / 160.0f));
    }

    @Override // defpackage.ixl
    public final void aI(int i, boolean z) {
        boolean z2 = (i & 10) != 0;
        if (!this.aD) {
            this.aG = z2;
        }
        this.aE.a(z2, (i & 65536) != 0);
    }

    @Override // defpackage.jkk
    public final synchronized void aa(CarRegionId carRegionId, jhf jhfVar) {
        ab(carRegionId, jhfVar, 0);
    }

    @Override // defpackage.jkk
    public final synchronized void ab(CarRegionId carRegionId, jhf jhfVar, int i) throws Throwable {
        ina inaVar;
        jhf jhfVarK;
        ina inaVar2;
        try {
            try {
                ((ype) a.l().ai(593)).R("switchRegionWindow(%s, %s, %s)", carRegionId, jhfVar, Integer.valueOf(i));
                if (jhfVar != null) {
                    try {
                        if (jhfVar.g() != 1) {
                            throw new IllegalStateException();
                        }
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        inaVar = this;
                        throw th2;
                    }
                }
                Object obj = this.V;
                boolean z = jhfVar != null;
                synchronized (obj) {
                    try {
                        jhfVarK = k(carRegionId, z);
                    } finally {
                        th = th;
                        while (true) {
                            Throwable th3 = th;
                            try {
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                }
                if (jhfVarK == jhfVar) {
                    inaVar2 = this;
                } else {
                    Map map = this.aX;
                    jin jinVar = (jin) map.get(carRegionId);
                    map.put(carRegionId, null);
                    this.aW.removeCallbacks((Runnable) this.aY.get(carRegionId));
                    if ((jinVar == null || jinVar.b == null) && jhfVar != null) {
                        jid jidVarZ = jhfVar.z();
                        jinVar = jinVar == null ? new jin(null, jidVarZ, null, jidVarZ) : new jin(null, jidVarZ, null, jinVar.d);
                    }
                    if (jinVar == null) {
                        jinVar = new jin(null, null, null, null);
                    }
                    jhf jhfVar2 = (this.aw.f() && this.bh.O(jhfVarK)) ? jhfVarK : null;
                    inaVar2 = this;
                    inaVar2.R(jhfVarK, jinVar.b, jinVar.d, jhfVar == null || !(jhfVarK == null || Objects.equals(jhfVar.C(), jhfVarK.C())), true, false, jhfVar);
                    if (jhfVar != null) {
                        inaVar2.ay(jhfVar, i, jhfVar2);
                        return;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                throw th2;
            }
        } catch (Throwable th6) {
            th = th6;
            inaVar = this;
            throw th2;
        }
    }

    public final void ac() {
        ygr ygrVar = this.v;
        if (ygrVar == null || ygrVar.isEmpty()) {
            return;
        }
        this.bc.d(this.O.containsAll(this.v));
    }

    public final void ad() {
        jix jixVar = this.aq;
        if (jixVar != null) {
            jixVar.h(this.ar.b != null);
        }
    }

    @Override // defpackage.jkk
    public final boolean ae() {
        return this.C;
    }

    public final synchronized boolean af(jhf jhfVar, boolean z) {
        boolean zAv = (jhfVar.av(1) || jhfVar.av(sk.AUDIO_CONTENT_BUFFER_SIZE)) ? false : true;
        if (z && !zAv) {
            zAv = jhfVar.av(sk.AUDIO_CONTENT_BUFFER_SIZE);
        }
        boolean zAv2 = jhfVar.av(1024);
        if (!this.aw.f() && zAv && (jhfVar.av(32) || zAv2 || aP(jhfVar))) {
            zAv = !this.A || zAv2;
        }
        return ag(jhfVar) && zAv;
    }

    public final boolean ag(jhf jhfVar) {
        synchronized (this.V) {
            Iterator it = this.aV.iterator();
            while (it.hasNext()) {
                if (((dzi) it.next()).b == jhfVar) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ah(defpackage.jhf r10, boolean r11) {
        /*
            r9 = this;
            java.util.UUID r0 = r10.F()
            java.util.UUID r1 = r9.u
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L1b
            yph r9 = defpackage.ina.a
            yop r9 = r9.f()
            java.lang.String r11 = "%s does not have the correct configuration, unable to cast insets"
            r0 = 527(0x20f, float:7.38E-43)
            defpackage.a.bF(r9, r11, r10, r0)
            return r1
        L1b:
            yks r0 = r9.X
            java.util.Collection r0 = r0.v()
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r0.next()
            r5 = r2
            jhf r5 = (defpackage.jhf) r5
            java.util.UUID r2 = r5.F()
            java.util.UUID r3 = r9.u
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L7f
            yfq r2 = r5.D()
            com.google.android.gms.car.display.CarRegionId r3 = r10.C()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L7f
            android.graphics.Rect r2 = r5.v()
            android.graphics.Rect r6 = r9.ar(r10, r5, r2)
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L7f
            yph r1 = defpackage.ina.a
            yop r1 = r1.l()
            r2 = 526(0x20e, float:7.37E-43)
            yop r1 = r1.ai(r2)
            r3 = r1
            ype r3 = (defpackage.ype) r3
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r11)
            java.lang.String r4 = "%s receives insets %s from %s. Sending = %s"
            r7 = r10
            r3.S(r4, r5, r6, r7, r8)
            r1 = 1
            if (r11 == 0) goto L80
            boolean r10 = r7.aA()
            r10 = r10 ^ r1
            r5.au(r6, r10)
            goto L80
        L7f:
            r7 = r10
        L80:
            r10 = r7
            goto L25
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ina.ah(jhf, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    @Override // defpackage.jkk
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean ai(defpackage.jhf r17, android.view.KeyEvent r18) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ina.ai(jhf, android.view.KeyEvent):boolean");
    }

    @Override // defpackage.jkk
    @ResultIgnorabilityUnspecified
    public final boolean aj(jgt jgtVar, int i) {
        ilb.d();
        synchronized (this.ab) {
            this.ac.add(jgtVar);
            this.ad.remove(jgtVar);
        }
        jhf jhfVar = ((jgy) jgtVar).h;
        jhfVar.getClass();
        if (jhfVar.aD()) {
            ak(jhfVar, i);
            return true;
        }
        ((ype) ((ype) a.h()).ai((char) 554)).y("reattachCarWindow called with window %s in wrong state", jhfVar);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ak(defpackage.jhf r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.C
            r3 = 0
            if (r2 != 0) goto Lc
        L9:
            r13 = r3
            goto Lab
        Lc:
            int r2 = r1.g()
            r4 = 1
            if (r2 == r4) goto L20
            r5 = 4
            if (r2 == r5) goto L20
            r5 = 3
            if (r2 == r5) goto L20
            r5 = 7
            if (r2 != r5) goto L1e
            r2 = r5
            goto L20
        L1e:
            r5 = r3
            goto L21
        L20:
            r5 = r4
        L21:
            java.lang.String r6 = "Unsupported layer used: %s"
            defpackage.woy.Q(r5, r6, r2)
            jii r2 = r0.Y
            boolean r2 = r2.q(r1)
            if (r2 != 0) goto L42
            boolean r2 = r1.aD()
            if (r2 != 0) goto L42
            yph r0 = defpackage.ina.a
            yop r0 = r0.h()
            java.lang.String r2 = "recycleProjectionWindow for non-removed window %s"
            r4 = 561(0x231, float:7.86E-43)
            defpackage.a.bF(r0, r2, r1, r4)
            return r3
        L42:
            r2 = r4
            ims r4 = r0.s
            if (r4 == 0) goto L9
            jhq r5 = r1.x()
            r6 = r2
            int r2 = r1.g()
            r7 = r3
            int r3 = r1.i()
            android.graphics.Rect r8 = r1.t()
            r9 = r6
            android.graphics.Rect r6 = r1.u()
            r10 = r7
            int r7 = r1.f()
            r11 = r8
            int r8 = r1.e()
            r12 = r9
            jid r9 = r1.y()
            r13 = r10
            jid r10 = r1.z()
            if (r5 != 0) goto L76
            r14 = r13
            goto L78
        L76:
            int r14 = r5.k
        L78:
            if (r5 != 0) goto L7b
            goto L7e
        L7b:
            int r5 = r5.l
            r13 = r5
        L7e:
            yfq r5 = r1.D()
            r15 = r12
            r12 = r13
            r13 = r5
            r5 = r11
            r11 = r14
            com.google.android.gms.car.ProjectionWindowDecorationParams r14 = r1.B()
            r16 = r15
            java.util.UUID r15 = r1.F()
            android.graphics.Rect r17 = r1.r()
            if (r17 != 0) goto L9d
            android.graphics.Rect r17 = new android.graphics.Rect
            r17.<init>()
            goto La1
        L9d:
            android.graphics.Rect r17 = r1.r()
        La1:
            r18 = r16
            r16 = r17
            r17 = r21
            r0.aD(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r18
        Lab:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ina.ak(jhf, int):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean al(jhf jhfVar, jhf jhfVar2, boolean z) {
        boolean z2;
        int i;
        yfq yfqVar;
        boolean z3;
        jhf jhfVar3 = jhfVar;
        int i2 = 0;
        if (!jhfVar3.F().equals(this.u)) {
            ((ype) ((ype) a.f()).ai((char) 562)).y("%s does not have the correct configuration, unable to remove inset casting window", jhfVar3);
            return false;
        }
        if (jhfVar3.C() == null) {
            return false;
        }
        yks yksVar = this.X;
        boolean z4 = false;
        for (jhf jhfVar4 : yksVar.v()) {
            if (jhfVar4.F().equals(this.u) && jhfVar4.D().contains(jhfVar3.C())) {
                jhfVar3.aM();
                jhfVar4.aM();
                Rect rectV = jhfVar4.v();
                Rect rect = new Rect();
                yfq yfqVarD = jhfVar4.D();
                int size = yfqVarD.size();
                int i3 = i2;
                boolean z5 = i3;
                while (i3 < size) {
                    Iterator it = ((yar) yksVar).c((CarRegionId) yfqVarD.get(i3)).iterator();
                    while (true) {
                        i = i3 + 1;
                        if (it.hasNext()) {
                            jhf jhfVar5 = (jhf) it.next();
                            if (Objects.equals(jhfVar3, jhfVar5)) {
                                yfqVar = yfqVarD;
                            } else {
                                boolean z6 = jhfVar5.aC() || jhfVar5.aX();
                                jii jiiVar = this.Y;
                                if (jiiVar.w(jhfVar5) && jiiVar.r(jhfVar5)) {
                                    yfqVar = yfqVarD;
                                    z3 = true;
                                } else {
                                    yfqVar = yfqVarD;
                                    z3 = false;
                                }
                                if (jhfVar5.F().equals(this.u) && (z6 || z3 || jiiVar.s(jhfVar5))) {
                                    rect = ar(jhfVar5, jhfVar4, rect);
                                    z5 |= !jhfVar5.aA();
                                }
                            }
                            jhfVar3 = jhfVar;
                            yfqVarD = yfqVar;
                        }
                    }
                    jhfVar3 = jhfVar;
                    i3 = i;
                }
                if (rect.equals(rectV)) {
                    z2 = false;
                    z4 |= z2;
                } else if (jhfVar2 != null && jhfVar2.C() != null && jhfVar2.F().equals(this.u) && jhfVar4.D().contains(jhfVar2.C()) && ar(jhfVar2, jhfVar4, new Rect(rect)).equals(rectV)) {
                    ((ype) a.l().ai((char) 471)).u("Entering window covers existing insets, no inset changes to dispatch");
                    z2 = false;
                    z4 |= z2;
                } else {
                    Rect rect2 = rect;
                    ((ype) a.l().ai(470)).S("%s insets updated to %s due to %s removal. Sending = %s", jhfVar4, rect2, jhfVar, Boolean.valueOf(z));
                    if (z) {
                        jhfVar4.au(rect2, z5);
                    }
                    z2 = true;
                    z4 |= z2;
                }
            }
            jhfVar3 = jhfVar;
            i2 = 0;
        }
        return z4;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, qyw] */
    @Override // defpackage.jkk
    @ResultIgnorabilityUnspecified
    public final synchronized boolean am(Surface surface) {
        ilb.d();
        this.ak.set(SystemClock.elapsedRealtimeNanos());
        this.ag.e(yzz.PROJECTION_WINDOW_MANAGER, yzy.Hf);
        ((ype) a.l().ai((char) 577)).u("startComposition");
        List list = this.aZ;
        boolean zIsEmpty = list.isEmpty();
        if (list.size() > 1) {
            yfu yfuVar = new yfu(4);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CarRegionId carRegionIdC = ((jhf) it.next()).C();
                if (carRegionIdC != null) {
                    yfuVar.e(carRegionIdC, 0);
                }
            }
            rcc rccVar = new rcc();
            rccVar.e(yfuVar.d(false));
            rccVar.a = true;
            this.Y.c(rccVar.a());
        }
        this.Q.j(this);
        this.p = surface;
        aI(this.az.a(), false);
        this.Y.n(this.w.f, this.w.g - this.w.h);
        this.B.set(0);
        this.aj.h();
        this.aC = new Thread(new imt(this, 0), "CompositionThread");
        this.q = new Semaphore(0);
        this.aC.start();
        try {
            this.q.acquire();
        } catch (InterruptedException unused) {
        }
        if (!this.z) {
            return false;
        }
        this.aj.i();
        this.C = true;
        jgn jgnVar = this.bf;
        ims imsVar = this.s;
        jgnVar.a = true;
        jgm jgmVar = jgnVar.b;
        jgmVar.getClass();
        jgmVar.b(imsVar);
        this.H.set(0);
        this.I.set(0);
        this.J.set(0);
        this.M.set(0);
        this.aM.set(0);
        Arrays.fill(this.aN, 0);
        synchronized (this.V) {
            this.W.clear();
            this.X.q();
            aB();
        }
        ((imz) this.bh.a).clear();
        jkq jkqVar = this.bb;
        jhc jhcVar = this.w;
        CarDisplayId carDisplayId = this.af;
        jkqVar.a(jhcVar, new CarRegionId(2, carDisplayId), this.u);
        this.bd.b(this.w, new CarRegionId(2, carDisplayId), this.u);
        jjy jjyVar = this.al;
        jjyVar.b(this.w.a, this.u, b());
        if (zIsEmpty || !this.aH) {
            ((ype) ((ype) a.f()).ai((char) 578)).u("Maybe showing loading screen");
            xya xyaVar = this.be;
            Duration durationC = Duration.ZERO;
            if (xyaVar.a) {
                xyaVar.f();
                durationC = xyaVar.c();
            }
            jjx jjxVar = jjx.c;
            if (zIsEmpty) {
                jjxVar = CarDisplayId.a.equals(carDisplayId) ? jjx.b : jjx.d;
            }
            jjyVar.g(this.w.a, this.u, jjxVar, durationC);
        } else {
            ((ype) ((ype) a.f()).ai((char) 581)).u("Skipping loading screen for transient loss");
        }
        this.Y.g(this.w);
        if (this.aB == null) {
            this.aB = new imu(this);
            etb.a(this.l).b(this.aB, new IntentFilter("com.google.android.gms.car.DumpScreenshot"));
        }
        qze qzeVar = this.ar;
        synchronized (qzeVar.a) {
            Iterator it2 = qzeVar.c.iterator();
            while (it2.hasNext()) {
                try {
                    ((imv) it2.next()).a.e(true);
                } catch (RemoteException unused2) {
                }
            }
        }
        synchronized (this.ab) {
            Iterator it3 = this.ac.iterator();
            while (it3.hasNext()) {
                jgt jgtVar = (jgt) it3.next();
                if (jgtVar.o() == null) {
                    jgtVar.r(this.w);
                }
                if (acvt.a.gu().r() && !jgtVar.q()) {
                    ((ype) ((ype) a.f()).ai(579)).y("startComposition skipping init for already initialized car window %s", jgtVar);
                } else {
                    ((ype) a.l().ai(580)).y("Initializing %s from startComposition", jgtVar);
                    this.s.g(jgtVar.o());
                }
            }
        }
        return true;
    }

    @Override // defpackage.jkk
    public final boolean an(jiw jiwVar) {
        ims imsVar = this.s;
        if (imsVar == null) {
            return false;
        }
        imsVar.c(null, jiwVar);
        return true;
    }

    public final void ao(jhf jhfVar, int i, int i2) {
        yph yphVar = a;
        ((ype) yphVar.l().ai(507)).D("doWindowZOrderChange(requestedLayoutZ:%d) %s", i, jhfVar);
        int i3 = i2 - 1;
        int iH = jhfVar.h();
        if (i3 == 0) {
            jhfVar.am(i);
        } else if (i3 != 1) {
            jhfVar.al(i);
        } else {
            jhfVar.ag();
        }
        int iH2 = jhfVar.h();
        SparseArray sparseArray = this.S;
        List list = (List) sparseArray.get(iH);
        if (list == null || !list.remove(jhfVar)) {
            ((ype) yphVar.l().ai((char) 508)).y("z order changed for already removed window %s", jhfVar);
            return;
        }
        List arrayList = (List) sparseArray.get(iH2);
        if (arrayList == null) {
            arrayList = new ArrayList(2);
            sparseArray.put(iH2, arrayList);
        }
        arrayList.add(jhfVar);
        y();
    }

    @Override // defpackage.jkk
    public final synchronized void ap(KeyEvent keyEvent) {
        jhf jhfVarAu;
        this.A = false;
        if (this.C) {
            this.aU = keyEvent.getMetaState();
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                int keyCode = keyEvent.getKeyCode();
                jhf jhfVarK = this.bh.K();
                if (dsg.G(keyCode)) {
                    synchronized (this.V) {
                        jhfVarAu = au(jhfVarK, keyCode, true);
                    }
                    if (jhfVarAu != null) {
                        ((ype) a.l().ai(539)).R("Found priority window for %s -- %s. Moving focus without injecting keycode to %s", keyEvent, jhfVarAu.aM(), jhfVarK == null ? "null" : jhfVarK.aM());
                        Z(jhfVarAu);
                        return;
                    }
                }
                SparseBooleanArray sparseBooleanArray = this.aT;
                if (jhfVarK != null) {
                    sparseBooleanArray.put(keyEvent.getKeyCode(), true);
                    jhfVarK.M(keyEvent);
                    return;
                } else {
                    sparseBooleanArray.put(keyEvent.getKeyCode(), false);
                    ai(null, keyEvent);
                    return;
                }
            }
            SparseBooleanArray sparseBooleanArray2 = this.aT;
            if (sparseBooleanArray2.indexOfKey(keyEvent.getKeyCode()) < 0) {
                ((ype) a.l().ai((char) 538)).y("Dropping %s", keyEvent);
                return;
            }
            boolean z = sparseBooleanArray2.get(keyEvent.getKeyCode());
            jhf jhfVarL = l();
            if (!z || jhfVarL == null) {
                ai(this.bh.K(), keyEvent);
            } else {
                jhfVarL.M(keyEvent);
            }
            if (keyEvent.getAction() == 1) {
                sparseBooleanArray2.delete(keyEvent.getKeyCode());
            }
        }
    }

    @Override // defpackage.jkk
    public final void aq(KeyEvent keyEvent) {
        this.aP = -1;
        if (this.aK) {
            if (this.o) {
                ((ype) ((ype) a.h()).ai((char) 540)).u("Cannot invoke onKeyEventComplete when disconnected.");
            } else if (keyEvent.getKeyCode() == 23 && keyEvent.getAction() == 1) {
                this.ba.n(1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // defpackage.jkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b() {
        /*
            r5 = this;
            tkn r0 = r5.F
            int r1 = r0.a
            int r2 = android.graphics.Color.alpha(r1)
            r3 = 1
            r4 = 255(0xff, float:3.57E-43)
            if (r2 != r4) goto L21
            int r0 = r0.b
            int r2 = android.graphics.Color.alpha(r0)
            if (r2 == r4) goto L16
            goto L21
        L16:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r2.getClass()
            boolean r5 = r5.E
            if (r3 == r5) goto L2c
            r1 = r0
            goto L2c
        L21:
            boolean r0 = r5.ao
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r0 == 0) goto L2c
            boolean r5 = r5.E
            if (r3 == r5) goto L2c
            r1 = -1
        L2c:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r5.getClass()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ina.b():int");
    }

    public final int c() {
        boolean z = this.E;
        tkn tknVar = this.ae;
        return z ? tknVar.a : tknVar.b;
    }

    @Override // defpackage.jkk
    public final int d() {
        this.w.getClass();
        return this.w.a.i;
    }

    @Override // defpackage.jkk
    public final int e() {
        return this.w.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jkk
    @ResultIgnorabilityUnspecified
    public final int f(jhf jhfVar, Rect rect, Rect rect2, int i, int i2, int i3, yfq yfqVar, UUID uuid, ProjectionWindowDecorationParams projectionWindowDecorationParams) throws Throwable {
        int iM;
        Rect rect3 = rect;
        Integer numValueOf = Integer.valueOf(i3);
        ilb.d();
        Object obj = this.V;
        synchronized (obj) {
            try {
                try {
                    if (jhfVar.i() != i3 && aO(jhfVar)) {
                        ((ype) a.l().ai(525)).R("Moving window from Z: %d to %d, %s", Integer.valueOf(jhfVar.i()), numValueOf, jhfVar);
                        aw(jhfVar, i3);
                    }
                    jhq jhqVarX = jhfVar.x();
                    iM = jhfVar.m(rect3.left, e() - rect3.bottom, rect3.width(), rect3.height(), i3, rect2, i, i2, jhfVar.y(), jhfVar.z(), jhqVarX == null ? 0 : jhqVarX.k, jhqVarX != null ? jhqVarX.l : 0, yfqVar, projectionWindowDecorationParams, uuid, jhfVar.r() == null ? new Rect() : jhfVar.r());
                    if (this.X.z(jhfVar)) {
                        az();
                        al(jhfVar, null, true);
                        ah(jhfVar, true);
                        N(jhfVar);
                    }
                } catch (Throwable th) {
                    th = th;
                    rect3 = obj;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return iM;
    }

    public final long g(jhf jhfVar, long j, int i) {
        Map map = this.aR;
        if (i != 0) {
            return ((Long) new ntn((Long) map.get(jhfVar.C())).i(0L)).longValue();
        }
        map.put(jhfVar.C(), Long.valueOf(j));
        return j;
    }

    @Override // defpackage.jkk
    public final Point h() {
        if (this.w != null) {
            return new Point(this.w.f, this.w.g);
        }
        return null;
    }

    @Override // defpackage.jkk
    public final Rect i(Rect rect) {
        return new Rect(a(rect.left), a(rect.top), a(rect.right), a(rect.bottom));
    }

    @Override // defpackage.jkk
    @ResultIgnorabilityUnspecified
    public final jhf j(jki jkiVar) {
        jhf jhiVar;
        ina inaVar;
        int i = jkiVar.c;
        woy.Q(au.contains(Integer.valueOf(i)), "Unsupported layer used: %s", i);
        if (!this.C) {
            ((ype) a.l().ai((char) 490)).u("Composition not running. Unable to create projection window.");
            return null;
        }
        if (this.i) {
            jhiVar = new jhl(this, i, jkiVar.g, jkiVar.b, jkiVar.q, jkiVar.a);
            inaVar = this;
        } else {
            Consumer consumer = jkiVar.n;
            if (consumer == null) {
                inaVar = this;
                jhiVar = new jhb(inaVar, i, jkiVar.g, jkiVar.b, jkiVar.q, jkiVar.a);
            } else {
                inaVar = this;
                jhiVar = new jhi(inaVar, i, jkiVar.g, jkiVar.b, consumer, jkiVar.q, jkiVar.a);
            }
        }
        ims imsVar = inaVar.s;
        if (imsVar == null) {
            ((ype) a.l().ai((char) 489)).u("Composition handler not running. Unable to create projection window.");
            return null;
        }
        ina inaVar2 = inaVar;
        jhf jhfVar = jhiVar;
        inaVar2.aD(jhfVar, i, jkiVar.d, imsVar, jkiVar.e, jkiVar.f, jkiVar.k, jkiVar.l, jkiVar.h, jkiVar.i, jkiVar.o, jkiVar.p, jkiVar.j, jkiVar.m, jkiVar.q, jkiVar.r, 0);
        return jhfVar;
    }

    public final jhf k(CarRegionId carRegionId, boolean z) {
        synchronized (this.V) {
            Collection collectionAv = av(carRegionId, z);
            if (collectionAv.isEmpty()) {
                return null;
            }
            if (collectionAv.size() > 1) {
                ((ype) ((ype) a.h()).ai(510)).u("More than one active window, picking top");
            }
            return (jhf) yrm.ai(collectionAv.iterator());
        }
    }

    public final synchronized jhf l() {
        if (this.aQ) {
            return this.bh.K();
        }
        ((ype) ((ype) a.f()).ai((char) 514)).u("No input focus, not returning a focused window");
        return null;
    }

    public final jhf n(int i, int i2, int i3) {
        jhf jhfVar;
        jhf jhfVar2;
        jhf jhfVar3 = (jhf) this.aS.get(i);
        if (jhfVar3 != null) {
            return jhfVar3;
        }
        synchronized (this.V) {
            SparseArray sparseArray = this.W;
            int size = sparseArray.size();
            loop0: while (true) {
                size--;
                jhfVar = null;
                if (size < 0) {
                    break;
                }
                List list = (List) sparseArray.valueAt(size);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    jhf jhfVar4 = (jhf) list.get(i4);
                    if (jhfVar4 != null && jhfVar4.aC() && jhfVar4.aw(i2, i3)) {
                        if (this.an && jhfVar4.ax(2)) {
                            int i5 = i4 + 1;
                            while (true) {
                                if (i5 >= list.size()) {
                                    int i6 = size - 1;
                                    while (true) {
                                        if (i6 < 0) {
                                            jhfVar2 = null;
                                            break;
                                        }
                                        for (jhf jhfVar5 : (List) sparseArray.valueAt(i6)) {
                                            if (aN(i2, i3, jhfVar5)) {
                                                jhfVar2 = jhfVar5;
                                                break;
                                            }
                                        }
                                        i6--;
                                    }
                                } else {
                                    jhfVar2 = (jhf) list.get(i5);
                                    if (aN(i2, i3, jhfVar2)) {
                                        break;
                                    }
                                    i5++;
                                }
                            }
                            if (jhfVar2 != null) {
                                jhfVar = jhfVar2;
                                break loop0;
                            }
                        }
                        if (jhfVar4.aY()) {
                            jhfVar = jhfVar4;
                            break loop0;
                        }
                    }
                }
            }
        }
        this.aS.put(i, jhfVar);
        return jhfVar;
    }

    @Override // defpackage.jkk
    public final CarUiInfo o() {
        CarUiInfo carUiInfo = this.ba.m;
        carUiInfo.getClass();
        return carUiInfo;
    }

    @Override // defpackage.jkk
    public final synchronized CarRegionId p() {
        return this.aO;
    }

    @Override // defpackage.jkk
    public final synchronized void q(jhf jhfVar) {
        ay(jhfVar, 0, null);
    }

    @Override // defpackage.jkk
    public final synchronized void r(jhf jhfVar, int i) {
        ay(jhfVar, i, null);
    }

    public final void s() {
        jko jkoVar = this.ah;
        if (jkoVar != null) {
            jkoVar.c();
            this.ah = null;
        }
        this.ap.c();
        int i = yfq.d;
        v(yls.a);
        try {
            this.aq.j();
        } catch (jiy e2) {
            ((ype) ((ype) ((ype) a.h()).p(e2)).ai((char) 474)).u("Error stopping renderer");
        }
    }

    @Override // defpackage.jkk
    public final synchronized void t(iuw iuwVar, UUID uuid) {
        yph yphVar = a;
        ((ype) yphVar.l().ai(480)).M("Configuring display: %s, %s", iuwVar, uuid);
        jew jewVar = this.ay;
        yxi yxiVar = yxi.PROJECTION_WINDOW_MANAGER_STARTED_WIFI;
        yxi yxiVar2 = yxi.PROJECTION_WINDOW_MANAGER_STARTED_USB;
        int i = jewVar.i();
        if (i != 2) {
            yxiVar = i == 1 ? yxiVar2 : null;
        }
        if (yxiVar != null) {
            ols.M(this.l, yxiVar);
        }
        Context context = this.l;
        ols.K(context, "com.google.android.gms.car.PROJECTION_WINDOW_MANAGER", rrx.b.ordinal(), null);
        jjo jjoVar = this.x;
        int i2 = iuwVar.d;
        jjoVar.c(i2);
        this.ai.i = 1.0E9d / i2;
        rbe.g(Looper.getMainLooper(), new imp(this, iuwVar, uuid, 0));
        this.y = iuwVar.k;
        Resources resources = context.getResources();
        float f2 = resources.getDisplayMetrics().density;
        Size size = iuwVar.m;
        int height = size.getHeight();
        float dimension = resources.getDimension(R.dimen.car_rail_height) / f2;
        int i3 = iuwVar.i;
        int i4 = iuwVar.f;
        int iRound = (int) (dimension * (i3 / 160.0f));
        if (height != i4) {
            iRound = Math.round((iRound * height) / i4);
        }
        if (iRound >= height) {
            ((ype) ((ype) yphVar.h()).ai((char) 463)).w("Calculated height %d too large", iRound);
            iRound = height - 1;
        }
        int i5 = iRound;
        ((ype) yphVar.l().ai(481)).w("layout rail height:%d", i5);
        this.w = new jhc(iuwVar, size.getWidth(), size.getHeight(), iuwVar.l, i5);
        this.u = uuid;
        ype ypeVar = (ype) ((ype) yphVar.f()).ai(482);
        CarDisplayId carDisplayId = this.af;
        ypeVar.M("Setting display configuration id for %s to %s", carDisplayId, uuid);
        jkq jkqVar = this.bb;
        jhc jhcVar = this.w;
        CarRegionId carRegionId = new CarRegionId(2, carDisplayId);
        if (jkqVar.b != null) {
            jkqVar.b();
            jkqVar.a(jhcVar, carRegionId, uuid);
        }
        jke jkeVar = this.bd;
        jhc jhcVar2 = this.w;
        CarRegionId carRegionId2 = new CarRegionId(2, carDisplayId);
        if (jkeVar.b != null) {
            jkeVar.c();
            jkeVar.b(jhcVar2, carRegionId2, uuid);
        }
    }

    public final void u(jhf jhfVar) {
        ims imsVar;
        if (jhfVar == null || (imsVar = this.s) == null) {
            return;
        }
        imsVar.f(jhfVar);
    }

    public final void v(List list) {
        ((ype) a.l().ai((char) 494)).u("doTearDown windows");
        SparseArray sparseArray = this.S;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            List<jhf> list2 = (List) sparseArray.valueAt(i);
            if (list2 != null) {
                for (jhf jhfVar : list2) {
                    if (this.an) {
                        if (jhfVar.ax(1)) {
                            this.U.remove(jhfVar);
                            jhfVar.ag();
                        }
                        if (jhfVar.ax(2)) {
                            this.T.remove(jhfVar);
                        }
                    }
                    jhfVar.G();
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime() + 1000;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((jhf) it.next()).aV(jElapsedRealtime - SystemClock.elapsedRealtime());
                }
                list2.clear();
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((jhf) it2.next()).V();
        }
        sparseArray.clear();
    }

    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.jkk
    public final void w(PrintWriter printWriter) {
        ArrayList arrayList;
        SparseArray sparseArray;
        ArrayList arrayList2;
        SparseArray sparseArray2;
        printWriter.println(" -- ProjectionWindowManager for display ".concat(String.valueOf(String.valueOf(this.af))));
        this.x.d(printWriter);
        printWriter.println("decoder add depth:" + this.y);
        printWriter.println("power saving mode " + this.aG);
        printWriter.println("Frames to send " + this.B.get());
        AtomicInteger atomicInteger = this.H;
        int i = atomicInteger.get();
        AtomicInteger atomicInteger2 = this.I;
        int i2 = i + atomicInteger2.get();
        AtomicInteger atomicInteger3 = this.J;
        int i3 = i2 + atomicInteger3.get();
        AtomicInteger atomicInteger4 = this.aM;
        int i4 = i3 + atomicInteger4.get();
        AtomicInteger atomicInteger5 = this.M;
        printWriter.println("total frames:" + (i4 + atomicInteger5.get()) + " normal frames:" + atomicInteger.get() + " idle frames:" + atomicInteger2.get() + " drop by timer:" + atomicInteger3.get() + " drop by ack:" + atomicInteger4.get() + " drop by queue overflow:" + atomicInteger5.get());
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        StringBuilder sb = new StringBuilder("Now realtime: ");
        sb.append(jElapsedRealtimeNanos);
        printWriter.println(sb.toString());
        jkh jkhVar = this.ai;
        int iA = jkhVar.o.a();
        int iA2 = jkhVar.p.a();
        int iA3 = jkhVar.q.a();
        if (jkhVar.n) {
            printWriter.println("FrameTimingHelper results overflow detected, results may be inconsistent.");
        }
        printWriter.println(a.bp(iA, "Frames in encoder: "));
        printWriter.println("Frames not yet written to endpoint: " + (iA2 - iA));
        printWriter.println("Frames not yet written to transport: " + (iA3 - iA2));
        printWriter.println("Frames lost in encoder: " + jkhVar.k.get());
        printWriter.println("Frames timed out in encoder: " + jkhVar.l.get());
        printWriter.println("Frames with unknown timestamps: " + jkhVar.m.get());
        printWriter.println("== VSync Info ==");
        printWriter.println("Last frame realtime: " + this.K + " last frame time: " + this.L);
        jgm jgmVar = this.bf.b;
        if (jgmVar == null) {
            printWriter.println("No strategy set");
        } else {
            jgmVar.a(printWriter);
        }
        printWriter.println("num renderings per num windows:");
        int i5 = 0;
        for (int i6 = 0; i6 < 6; i6++) {
            printWriter.println(i6 + ":" + this.aN[i6]);
        }
        this.aq.c(printWriter);
        printWriter.println("frame time, delta from prev frame, result");
        ydx ydxVar = this.G;
        synchronized (ydxVar) {
            arrayList = new ArrayList(ydxVar);
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            imw imwVar = (imw) it.next();
            long j = imwVar.a;
            printWriter.println("0,0," + ((int) imwVar.b));
            imw imwVar2 = null;
            while (it.hasNext()) {
                imw imwVar3 = (imw) it.next();
                long j2 = imwVar3.a;
                printWriter.println((j2 - j) + "," + (j2 - imwVar.a) + "," + ((int) imwVar3.b));
                imwVar2 = imwVar;
                imwVar = imwVar3;
            }
            if (imwVar2 != null) {
                printWriter.println("Millis since last entry above: " + ((this.L / 1000000) - imwVar2.a));
            }
            printWriter.println();
        }
        ims imsVar = this.s;
        printWriter.println(imsVar);
        if (imsVar == null) {
            return;
        }
        imsVar.dump(new PrintWriterPrinter(printWriter), "CompositionHandler");
        if (!imsVar.a && this.w != null && (this.aq instanceof jiv)) {
            printWriter.println("Pixels: ".concat(String.valueOf(String.valueOf((List) rbe.a(imsVar.getLooper(), new iml(this, 1))))));
        }
        printWriter.println("Current displayConfigurationId: ".concat(String.valueOf(String.valueOf(this.u))));
        printWriter.println("Windows by layout z -- the order used for rendering: ");
        if (acvt.n()) {
            SparseArray sparseArray3 = new SparseArray();
            if (!imsVar.a && (sparseArray2 = (SparseArray) rbe.a(imsVar.getLooper(), new iml(this, i5))) != null) {
                sparseArray3 = sparseArray2;
            }
            synchronized (this.V) {
                SparseArray sparseArray4 = this.W;
                int size = sparseArray4.size();
                sparseArray = new SparseArray(size);
                yks yksVar = this.X;
                arrayList2 = new ArrayList(((ybm) yksVar).b);
                for (int i7 = 0; i7 < size; i7++) {
                    List list = (List) sparseArray4.valueAt(i7);
                    sparseArray.put(sparseArray4.keyAt(i7), list != null ? new ArrayList(list) : new ArrayList());
                }
                arrayList2.addAll(yksVar.v());
            }
            aR(printWriter, sparseArray3, sparseArray, arrayList2);
        } else {
            aR(printWriter, this.S, this.W, this.X.v());
        }
        StringBuilder sb2 = new StringBuilder("Focusable windows:");
        synchronized (this.V) {
            for (dzi dziVar : this.aV) {
                sb2.append(" (");
                sb2.append(((jhf) dziVar.b).E());
                sb2.append(", ");
                sb2.append(dziVar.a);
                sb2.append(")");
            }
        }
        printWriter.println(sb2);
        printWriter.print("Current focus region: ");
        printWriter.print(this.aO);
        printWriter.print(" ");
        printWriter.println(this.bh.K());
        StringBuilder sb3 = new StringBuilder("Focus history:");
        ?? r2 = this.bh.a;
        int size2 = r2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            jhf jhfVar = (jhf) r2.get(i8);
            sb3.append(" ");
            sb3.append(jhfVar.E());
        }
        printWriter.println(sb3);
        if (this.m.c.getBoolean("car_dump_screenshot", false)) {
            x(false, false);
        }
        this.Y.f(printWriter);
    }

    public final void x(final boolean z, final boolean z2) {
        ims imsVar = this.s;
        if (imsVar == null) {
            return;
        }
        imsVar.c(null, new jiw() { // from class: imm
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // defpackage.jiw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(android.graphics.Bitmap r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    ina r0 = r7.a
                    boolean r1 = r2
                    if (r1 == 0) goto Ld
                    android.content.Context r7 = r0.l
                    defpackage.ivr.a(r7, r8)
                    goto L9e
                Ld:
                    android.content.Context r1 = r0.l
                    yph r2 = defpackage.ivr.a
                    android.text.format.Time r2 = new android.text.format.Time
                    r2.<init>()
                    r2.setToNow()
                    java.io.File r1 = defpackage.ilb.b(r1)
                    r3 = 0
                    if (r1 != 0) goto L21
                    goto L71
                L21:
                    java.io.File r4 = new java.io.File
                    java.lang.String r5 = "%Y-%m-%d-%H:%M:%S"
                    java.lang.String r2 = r2.format(r5)
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    java.lang.String r6 = "screendump-"
                    r5.<init>(r6)
                    r5.append(r2)
                    java.lang.String r2 = ".png"
                    r5.append(r2)
                    java.lang.String r2 = r5.toString()
                    r4.<init>(r1, r2)
                    java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
                    java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
                    r2.<init>(r4)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
                    r1.<init>(r2)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
                    android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.io.IOException -> L57 java.lang.Throwable -> La2
                    r5 = 0
                    r8.compress(r2, r5, r1)     // Catch: java.io.IOException -> L57 java.lang.Throwable -> La2
                    r1.close()     // Catch: java.io.IOException -> L52
                L52:
                    r3 = r4
                    goto L71
                L54:
                    r7 = move-exception
                    goto La4
                L56:
                    r1 = r3
                L57:
                    yph r2 = defpackage.ivr.a     // Catch: java.lang.Throwable -> La2
                    yop r2 = r2.f()     // Catch: java.lang.Throwable -> La2
                    ype r2 = (defpackage.ype) r2     // Catch: java.lang.Throwable -> La2
                    r5 = 1426(0x592, float:1.998E-42)
                    yop r2 = r2.ai(r5)     // Catch: java.lang.Throwable -> La2
                    ype r2 = (defpackage.ype) r2     // Catch: java.lang.Throwable -> La2
                    java.lang.String r5 = "cannot save file for screenshot dump:%s"
                    r2.y(r5, r4)     // Catch: java.lang.Throwable -> La2
                    if (r1 == 0) goto L71
                    r1.close()     // Catch: java.io.IOException -> L71
                L71:
                    boolean r7 = r3
                    if (r7 == 0) goto L9e
                    android.content.Context r7 = r0.l
                    java.lang.String r0 = "com.google.android.gms.fileprovider"
                    android.net.Uri r0 = defpackage.duq.a(r7, r0, r3)
                    android.content.Intent r1 = new android.content.Intent
                    java.lang.String r2 = "android.intent.action.SEND"
                    r1.<init>(r2)
                    r2 = 268959744(0x10080000, float:2.682127E-29)
                    android.content.Intent r1 = r1.addFlags(r2)
                    r2 = 1
                    android.content.Intent r1 = r1.addFlags(r2)
                    java.lang.String r2 = "image/*"
                    android.content.Intent r1 = r1.setType(r2)
                    java.lang.String r2 = "android.intent.extra.STREAM"
                    android.content.Intent r0 = r1.putExtra(r2, r0)
                    r7.startActivity(r0)
                L9e:
                    r8.recycle()
                    return
                La2:
                    r7 = move-exception
                    r3 = r1
                La4:
                    if (r3 == 0) goto La9
                    r3.close()     // Catch: java.io.IOException -> La9
                La9:
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.imm.a(android.graphics.Bitmap):void");
            }
        });
    }

    public final void y() {
        this.P = this.y + 1;
    }

    @Override // defpackage.jkk
    public final void z() {
        ims imsVar = this.s;
        if (imsVar != null) {
            imsVar.a();
        }
    }
}
