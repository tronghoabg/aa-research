package defpackage;

import android.content.ComponentName;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.TouchEventCompleteData;
import com.google.android.gms.car.display.CarRegionId;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class jgs implements jhf, jho {
    public final Runnable A;
    public volatile jhp B;
    public final int C;
    private boolean E;
    private int F;
    private final CarWindowManagerLayoutParams G = new CarWindowManagerLayoutParams();
    private volatile Rect H;
    private Rect I;
    private Rect J;
    private int K;
    private Rect L;
    private volatile boolean M;
    private volatile boolean N;
    private Rect O;
    private final int P;
    private yfq Q;
    private MotionEvent R;
    public final jkk c;
    public UUID d;
    public volatile jhq e;
    public Rect f;
    public Rect g;
    protected int h;
    public volatile boolean i;
    public ProjectionWindowDecorationParams j;
    public final boolean k;
    public final jis l;
    public volatile boolean m;
    public volatile boolean n;
    public jhg o;
    public final jhe p;
    public final jgr q;
    public final ComponentName r;
    protected final Object s;
    protected final Object t;
    public int u;
    public volatile float v;
    public volatile boolean w;
    public volatile boolean x;
    public volatile int y;
    public final CarRegionId z;
    public static final yph a = yph.c("CAR.WM.WIN");
    protected static final Rect b = new Rect();
    private static final AtomicInteger D = new AtomicInteger(1);

    protected jgs(jkk jkkVar, int i, jhe jheVar, CarRegionId carRegionId, UUID uuid, ComponentName componentName, boolean z, jis jisVar) {
        Rect rect = b;
        this.J = rect;
        this.f = rect;
        this.g = rect;
        this.h = 1;
        this.K = 0;
        this.j = ProjectionWindowDecorationParams.a();
        this.L = new Rect();
        this.m = false;
        Object obj = new Object();
        this.s = obj;
        this.t = new Object();
        int i2 = yfq.d;
        this.Q = yls.a;
        this.A = new jgw(this, 1);
        this.C = D.getAndIncrement();
        this.c = jkkVar;
        this.k = z;
        this.P = i;
        this.p = jheVar;
        this.z = carRegionId;
        this.d = uuid;
        this.r = componentName;
        this.q = new jgr(this);
        this.l = jisVar;
        Integer.toHexString(System.identityHashCode(obj));
        this.u = 0;
        this.v = 1.0f;
    }

    private final Rect aP(Rect rect) {
        return this.j.h ? rect : new Rect(Math.max(rect.left - this.j.a, 0), Math.max(rect.top - this.j.b, 0), Math.max(rect.right - this.j.c, 0), Math.max(rect.bottom - this.j.d, 0));
    }

    private final void aS(int i, boolean z) {
        int i2;
        jhq jhqVar = this.e;
        jhqVar.getClass();
        if (z) {
            i2 = i;
        } else {
            int iH = this.E ? h() + (i - this.F) : i;
            this.F = i;
            i2 = iH;
        }
        this.e = new jhq(jhqVar.a, jhqVar.b, jhqVar.c, jhqVar.d, i2, jhqVar.h, jhqVar.i, jhqVar.j, jhqVar.k, jhqVar.l);
    }

    private final synchronized void aU(int i, int i2) {
        this.e = new jhq(this.e.a + i, this.e.b + i2, this.e.c, this.e.d, this.e.g, this.e.h, this.e.i, this.e.j, this.e.k, this.e.l);
        jhc jhcVar = ((ina) this.c).w;
        jhcVar.getClass();
        int i3 = this.e.a;
        int i4 = this.e.f;
        int i5 = jhcVar.g;
        this.H = new Rect(i3, i5 - i4, this.e.e, i5 - this.e.b);
        Y();
    }

    @Override // defpackage.jhf
    public final synchronized CarWindowManagerLayoutParams A() {
        return this.G;
    }

    @Override // defpackage.jhf
    public final ProjectionWindowDecorationParams B() {
        return this.j;
    }

    @Override // defpackage.jhf
    public final CarRegionId C() {
        return this.z;
    }

    @Override // defpackage.jhf
    public final yfq D() {
        return this.Q;
    }

    @Override // defpackage.jhf
    public final String E() {
        return this.p.a();
    }

    @Override // defpackage.jhf
    public final UUID F() {
        return this.d;
    }

    @Override // defpackage.jhf
    public final synchronized void G() {
        boolean z;
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 2018)).y("cleanup %s", this);
        Object obj = this.s;
        synchronized (obj) {
            int i = this.u;
            if (i == 5) {
                ((ype) ((ype) yphVar.f()).ai(2020)).y("requesting removal for already removed window %s", this);
                return;
            }
            if (i < 4) {
                this.u = 4;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.q.b();
            }
            R();
            at(false);
            this.p.d(this);
            synchronized (obj) {
                this.u = 5;
            }
        }
    }

    @Override // defpackage.jhf
    public final void H() {
        synchronized (this.s) {
            if (this.u >= 4) {
                return;
            }
            this.u = 4;
        }
    }

    @Override // defpackage.jhf
    public final void J() {
        this.w = true;
    }

    @Override // defpackage.jhf
    public final void K() {
        this.x = false;
        rbe.j(new ire(this, 20));
    }

    @Override // defpackage.jhf
    public final void L() {
        at(false);
        this.c.z();
    }

    @Override // defpackage.jhf
    public final void M(KeyEvent keyEvent) {
        jgr jgrVar = this.q;
        jgrVar.sendMessage(jgrVar.obtainMessage(8, keyEvent));
    }

    @Override // defpackage.jhf
    public final void N(long j, List list) {
        aG(j, j, 4, list);
    }

    @Override // defpackage.jhf
    public final void O(MotionEvent motionEvent) {
        this.q.d(motionEvent);
    }

    @Override // defpackage.jhf
    public final void P(MotionEvent motionEvent) {
        this.q.d(motionEvent);
    }

    @Override // defpackage.jhf
    public final void Q(int i) {
        yfq yfqVarD;
        int size;
        Object obj;
        if (this.B == null) {
            ((ype) ((ype) a.f()).ai((char) 2025)).y("Trying to move non draggable window %s", this);
            return;
        }
        ((ype) a.l().ai(2024)).D("Moving to drag step %s for %s", i, this);
        jhp jhpVar = this.B;
        yfq yfqVarD2 = jhpVar.d();
        yfqVarD2.getClass();
        if (i < 0 || i >= yfqVarD2.size()) {
            if (i >= jhpVar.d().size()) {
                yfqVarD = jhpVar.d();
                size = jhpVar.d().size() - 1;
            } else {
                yfqVarD = jhpVar.d();
                size = 0;
            }
            obj = (Integer) yfqVarD.get(size);
        } else {
            obj = yfqVarD2.get(i);
        }
        obj.getClass();
        int iIntValue = ((Number) obj).intValue();
        emp empVar = jhpVar.q;
        if (empVar != null) {
            empVar.b();
        }
        if (!jhpVar.m) {
            jhpVar.m = true;
            jhpVar.e.bn(null);
        }
        jhpVar.e(iIntValue);
    }

    protected abstract void R();

    @Override // defpackage.jhf
    public final void U(int i) {
        jgr jgrVar = this.q;
        jgrVar.sendMessage(jgrVar.obtainMessage(9, i, 0));
    }

    @Override // defpackage.jhf
    public final void V() {
        ((ype) a.l().ai((char) 2027)).y("onInitFailed for %s", this);
        synchronized (this.s) {
            this.u = 5;
        }
        jgr jgrVar = this.q;
        jgrVar.sendMessage(jgrVar.obtainMessage(11));
    }

    @Override // defpackage.jhf
    public final void W(InputFocusChangedEvent inputFocusChangedEvent) {
        jgr jgrVar = this.q;
        jgrVar.sendMessage(jgrVar.obtainMessage(6, inputFocusChangedEvent));
    }

    @Override // defpackage.jhf
    public final void X(KeyEvent keyEvent) {
        this.c.aq(keyEvent);
    }

    protected abstract void Y();

    @Override // defpackage.jhf
    public final void Z(MotionEvent motionEvent, TouchEventCompleteData touchEventCompleteData) {
        this.c.G(this, motionEvent, touchEventCompleteData);
    }

    @Override // defpackage.jhf
    public final boolean aA() {
        return !this.w && this.v == 1.0f;
    }

    @Override // defpackage.jhf
    public final boolean aB() {
        int iJ = j();
        return (iJ == 1 || iJ == 2 || iJ == 3) ? false : true;
    }

    @Override // defpackage.jhf
    public final boolean aC() {
        return this.m;
    }

    @Override // defpackage.jhf
    public final boolean aD() {
        int iJ = j();
        return iJ == 4 || iJ == 5;
    }

    @Override // defpackage.jhf
    public final boolean aE() {
        return this.e == null || (this.e.k & 128) == 0;
    }

    @Override // defpackage.jhf
    public final boolean aF() {
        return (this.e == null || (this.e.k & 256) == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.jhf
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aG(long r22, long r24, int r26, java.util.List r27) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgs.aG(long, long, int, java.util.List):void");
    }

    @Override // defpackage.jho
    public void aH() {
        aU(0, 0);
        if (this.B != null) {
            yfq yfqVarC = this.j.l.c();
            if (yfqVarC == null || !yfqVarC.contains(Integer.valueOf(this.B.c()))) {
                jkk jkkVar = this.c;
                synchronized (((ina) jkkVar).V) {
                    ((ina) jkkVar).al(this, null, true);
                    ((ina) jkkVar).ah(this, true);
                }
            }
        }
    }

    @Override // defpackage.jhf
    public final void aI() {
        this.v = 0.54f;
    }

    @Override // defpackage.jhf
    public final void aa(KeyEvent keyEvent) {
        this.c.ai(this, keyEvent);
    }

    @Override // defpackage.jhf
    public final void ab() {
        jgr jgrVar = this.q;
        jgrVar.sendMessage(jgrVar.obtainMessage(10));
    }

    @Override // defpackage.jhf
    public final void ac() {
        synchronized (this.s) {
            this.u = 2;
        }
        this.q.a();
    }

    @Override // defpackage.jhf
    public final void ad() {
        synchronized (this.s) {
            if (this.u >= 4) {
                return;
            }
            this.u = 4;
            ((ype) a.l().ai((char) 2028)).y("notify window detach %s", this);
            this.q.b();
        }
    }

    protected abstract void ae();

    @Override // defpackage.jhf
    public final void af() {
        synchronized (this.s) {
            if (this.u >= 3) {
                return;
            }
            this.u = 3;
        }
    }

    @Override // defpackage.jhf
    public final synchronized void ag() {
        if (!this.E) {
            ((ype) ((ype) a.h()).ai((char) 2030)).y("removeSystemLayoutZOverride when not overridden for %s", this);
            return;
        }
        ((ype) a.l().ai(2029)).D("Clearing override z and using %s for %s", this.F, this);
        this.E = false;
        aS(this.F, false);
    }

    @Override // defpackage.jhf
    public final synchronized void ai(Rect rect) {
        this.O = rect;
    }

    @Override // defpackage.jhf
    public final synchronized void aj(int i) {
        ((ype) a.l().ai(2032)).D("setFocusFlags(flags:%d) %s", i, this);
        jhq jhqVar = this.e;
        this.e = new jhq(jhqVar.a, jhqVar.b, jhqVar.c, jhqVar.d, jhqVar.g, jhqVar.h, jhqVar.i, jhqVar.j, i, jhqVar.l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e A[Catch: all -> 0x01ba, TryCatch #1 {all -> 0x01ba, blocks: (B:5:0x000b, B:7:0x0027, B:11:0x0036, B:18:0x009b, B:20:0x00a1, B:26:0x00b4, B:28:0x0127, B:30:0x012c, B:32:0x0145, B:38:0x0155, B:39:0x0162, B:41:0x0166, B:42:0x0176, B:44:0x0187, B:48:0x01ae, B:55:0x01bb, B:51:0x01b5, B:34:0x014b, B:36:0x014f, B:23:0x00a6, B:12:0x005a, B:14:0x005e, B:16:0x0073, B:17:0x007e), top: B:59:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0127 A[Catch: all -> 0x01ba, TryCatch #1 {all -> 0x01ba, blocks: (B:5:0x000b, B:7:0x0027, B:11:0x0036, B:18:0x009b, B:20:0x00a1, B:26:0x00b4, B:28:0x0127, B:30:0x012c, B:32:0x0145, B:38:0x0155, B:39:0x0162, B:41:0x0166, B:42:0x0176, B:44:0x0187, B:48:0x01ae, B:55:0x01bb, B:51:0x01b5, B:34:0x014b, B:36:0x014f, B:23:0x00a6, B:12:0x005a, B:14:0x005e, B:16:0x0073, B:17:0x007e), top: B:59:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0145 A[Catch: all -> 0x01ba, TryCatch #1 {all -> 0x01ba, blocks: (B:5:0x000b, B:7:0x0027, B:11:0x0036, B:18:0x009b, B:20:0x00a1, B:26:0x00b4, B:28:0x0127, B:30:0x012c, B:32:0x0145, B:38:0x0155, B:39:0x0162, B:41:0x0166, B:42:0x0176, B:44:0x0187, B:48:0x01ae, B:55:0x01bb, B:51:0x01b5, B:34:0x014b, B:36:0x014f, B:23:0x00a6, B:12:0x005a, B:14:0x005e, B:16:0x0073, B:17:0x007e), top: B:59:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014b A[Catch: all -> 0x01ba, TryCatch #1 {all -> 0x01ba, blocks: (B:5:0x000b, B:7:0x0027, B:11:0x0036, B:18:0x009b, B:20:0x00a1, B:26:0x00b4, B:28:0x0127, B:30:0x012c, B:32:0x0145, B:38:0x0155, B:39:0x0162, B:41:0x0166, B:42:0x0176, B:44:0x0187, B:48:0x01ae, B:55:0x01bb, B:51:0x01b5, B:34:0x014b, B:36:0x014f, B:23:0x00a6, B:12:0x005a, B:14:0x005e, B:16:0x0073, B:17:0x007e), top: B:59:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0166 A[Catch: all -> 0x01ba, TryCatch #1 {all -> 0x01ba, blocks: (B:5:0x000b, B:7:0x0027, B:11:0x0036, B:18:0x009b, B:20:0x00a1, B:26:0x00b4, B:28:0x0127, B:30:0x012c, B:32:0x0145, B:38:0x0155, B:39:0x0162, B:41:0x0166, B:42:0x0176, B:44:0x0187, B:48:0x01ae, B:55:0x01bb, B:51:0x01b5, B:34:0x014b, B:36:0x014f, B:23:0x00a6, B:12:0x005a, B:14:0x005e, B:16:0x0073, B:17:0x007e), top: B:59:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0187 A[Catch: all -> 0x01ba, TRY_LEAVE, TryCatch #1 {all -> 0x01ba, blocks: (B:5:0x000b, B:7:0x0027, B:11:0x0036, B:18:0x009b, B:20:0x00a1, B:26:0x00b4, B:28:0x0127, B:30:0x012c, B:32:0x0145, B:38:0x0155, B:39:0x0162, B:41:0x0166, B:42:0x0176, B:44:0x0187, B:48:0x01ae, B:55:0x01bb, B:51:0x01b5, B:34:0x014b, B:36:0x014f, B:23:0x00a6, B:12:0x005a, B:14:0x005e, B:16:0x0073, B:17:0x007e), top: B:59:0x000b }] */
    @Override // defpackage.jhf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void ak(int r21, int r22, int r23, int r24, int r25, android.graphics.Rect r26, int r27, int r28, defpackage.jid r29, defpackage.jid r30, int r31, int r32, java.util.List r33, com.google.android.gms.car.ProjectionWindowDecorationParams r34, java.util.UUID r35, android.graphics.Rect r36, int r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgs.ak(int, int, int, int, int, android.graphics.Rect, int, int, jid, jid, int, int, java.util.List, com.google.android.gms.car.ProjectionWindowDecorationParams, java.util.UUID, android.graphics.Rect, int):void");
    }

    @Override // defpackage.jhf
    public final synchronized void al(int i) {
        ((ype) a.l().ai(2036)).D("setLocalLayoutZ(z:%s) %s", i, this);
        aS(i, false);
    }

    @Override // defpackage.jhf
    public final synchronized void am(int i) {
        ((ype) a.l().ai(2037)).D("Setting override z of %s for %s", i, this);
        aS(i, true);
        this.E = true;
    }

    @Override // defpackage.jhf
    public final synchronized void an(CarWindowManagerLayoutParams carWindowManagerLayoutParams) {
        this.G.a = carWindowManagerLayoutParams.a;
        jgr jgrVar = this.q;
        jgrVar.sendMessage(jgrVar.obtainMessage(12));
    }

    @Override // defpackage.jhf
    public final void ao() {
        at(true);
        this.c.z();
    }

    @Override // defpackage.jhf
    public final void ap() {
        this.x = true;
        rbe.j(new ire(this, 19));
    }

    protected final void aq() {
        CarRegionId carRegionId = this.z;
        if (carRegionId == null || !this.N) {
            return;
        }
        boolean z = false;
        if (this.m && this.n && ay()) {
            z = true;
        }
        if (z != this.M) {
            this.M = z;
            ((ype) ((ype) a.f()).ai(2038)).U("Critical ui ready state of window %s changed to %s. criticalUiContentReady=%s, visible=%s, drawn=%s, carDisplayConfigurationId=%s", E(), Boolean.valueOf(z), Boolean.valueOf(this.n), Boolean.valueOf(this.m), Boolean.valueOf(ay()), this.d);
            jkk jkkVar = this.c;
            synchronized (((ina) jkkVar).N) {
                if (z) {
                    ((ina) jkkVar).O.add(carRegionId);
                } else {
                    ((ina) jkkVar).O.remove(carRegionId);
                }
                ((ina) jkkVar).ac();
            }
        }
    }

    @Override // defpackage.jhf
    public void ar(boolean z) {
        if (this.z == null) {
            ((ype) a.l().ai((char) 2039)).y("Ignoring critical ui state change for window %s, carRegionId is null", E());
            return;
        }
        synchronized (this.t) {
            this.N = true;
            this.n = z;
            aq();
        }
    }

    @Override // defpackage.jhf
    public final void as(Rect rect) {
        this.J = rect;
        this.q.c(o());
    }

    public void at(boolean z) {
        synchronized (this.t) {
            this.m = z;
            aq();
        }
    }

    @Override // defpackage.jhf
    public final void au(Rect rect, boolean z) {
        ((ype) a.l().ai(2041)).R("%s getting window insets of %s, transparency %b", E(), rect, Boolean.valueOf(z));
        if (this.k) {
            jgr jgrVar = this.q;
            jgrVar.removeCallbacks(this.A);
            if (z) {
                Rect rect2 = b;
                jgrVar.e(rect2);
                this.g = rect2;
                this.i = false;
            } else {
                Rect rect3 = this.f;
                rect3.getClass();
                if (rect3.left > rect.left || rect3.right > rect.right || rect3.top > rect.top || rect3.bottom > rect.bottom) {
                    Rect rect4 = b;
                    jgrVar.e(rect4);
                    this.g = rect4;
                    this.i = thg.k(rect);
                } else if (!rect.equals(this.f)) {
                    this.i = true;
                }
            }
        }
        ProjectionWindowDecorationParams projectionWindowDecorationParams = this.j;
        if ((projectionWindowDecorationParams.h || projectionWindowDecorationParams.i) && !this.f.equals(rect)) {
            Rect rect5 = this.f;
            Rect rect6 = b;
            if (rect5.equals(rect6) || rect.equals(rect6)) {
                Rect rect7 = new Rect(rect.left - this.f.left, rect.top - this.f.top, rect.right - this.f.right, rect.bottom - this.f.bottom);
                boolean zK = thg.k(rect);
                jis jisVar = this.l;
                if (zK) {
                    jisVar.c(rect7);
                } else {
                    jisVar.d(rect7);
                }
            }
        }
        this.f = rect;
        this.q.c(o());
    }

    @Override // defpackage.jhf
    public final boolean av(int i) {
        return (this.e.k & i) != 0;
    }

    @Override // defpackage.jhf
    public final boolean aw(int i, int i2) {
        int iE = this.c.e();
        int i3 = iE - i2;
        int iMax = this.e.a;
        int iMax2 = this.e.b;
        int iMin = this.e.a + this.e.c;
        int iMin2 = this.e.b + this.e.d;
        if (az()) {
            iMax = Math.max(iMax, this.I.left);
            iMax2 = Math.max(iMax2, iE - this.I.bottom);
            iMin = Math.min(iMin, this.I.right);
            iMin2 = Math.min(iMin2, iE - this.I.top);
        }
        return i >= iMax && i3 >= iMax2 && i < iMin && i3 < iMin2;
    }

    @Override // defpackage.jhf
    public final boolean ax(int i) {
        return (this.e == null || (this.e.l & i) == 0) ? false : true;
    }

    protected abstract boolean ay();

    protected final boolean az() {
        return this.j.l.a != 0;
    }

    @Override // defpackage.jhf
    public final int b() {
        return this.e.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float bi() {
        return this.v;
    }

    protected final jhg bj(jhg jhgVar) {
        jhc jhcVar = ((ina) this.c).w;
        jhcVar.getClass();
        float f = jhcVar.b;
        float f2 = jhgVar.a - f;
        float f3 = jhgVar.c - f;
        float f4 = jhcVar.c;
        float f5 = jhgVar.d - f4;
        float f6 = jhgVar.b - f4;
        float f7 = jhcVar.d;
        double d = f7;
        if (d > 1.0d) {
            f3 *= f7;
            f2 *= f7;
        } else if (d < 1.0d) {
            f5 /= f7;
            f6 /= f7;
        }
        return new jhg(this, f2, f5, f3, f6);
    }

    @Override // defpackage.jho
    public final void bk(int i, int i2) {
        aU(i, i2);
    }

    protected final synchronized void bl(int i) {
        ((ype) a.l().ai(2031)).D("requestZ(requestedZ:%d) %s", i, this);
        Y();
        ims imsVar = ((ina) this.c).s;
        if (imsVar != null) {
            ((ype) ina.a.l().ai(573)).D("requestZChange(requestedZ:%s) %s", i, this);
            imsVar.h(this, i);
        }
    }

    protected void bm(int i, int i2) {
        this.p.e(this, i, i2);
    }

    @Override // defpackage.jho
    public void bn(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        this.q.d(motionEventObtain);
    }

    @Override // defpackage.jhf
    public final int c() {
        return this.e.b;
    }

    @Override // defpackage.jhf
    public final int d() {
        return this.e.d;
    }

    @Override // defpackage.jhf
    public final int e() {
        return this.K;
    }

    @Override // defpackage.jhf
    public final int f() {
        return this.h;
    }

    @Override // defpackage.jhf
    public final int g() {
        return this.P;
    }

    @Override // defpackage.jhf
    public final int h() {
        return this.e.g;
    }

    @Override // defpackage.jhf
    public final int i() {
        return this.y;
    }

    @Override // defpackage.jhf
    public final int j() {
        int i;
        synchronized (this.s) {
            i = this.u;
        }
        return i;
    }

    @Override // defpackage.jhf
    public final int k() {
        return this.e.c;
    }

    @Override // defpackage.jhf
    public final int l() {
        return this.C;
    }

    @Override // defpackage.jhf
    @ResultIgnorabilityUnspecified
    public final synchronized int m(int i, int i2, int i3, int i4, int i5, Rect rect, int i6, int i7, jid jidVar, jid jidVar2, int i8, int i9, List list, ProjectionWindowDecorationParams projectionWindowDecorationParams, UUID uuid, Rect rect2) {
        int i10;
        ilb.d();
        int i11 = this.e.c;
        int i12 = this.e.d;
        int i13 = 1024;
        boolean z = false;
        if (i3 == i11 && i4 == i12) {
            i13 = 0;
        }
        if (Math.min(i11, i12) != Math.min(i3, i4)) {
            i13 |= 2048;
        }
        boolean z2 = i11 == i12;
        boolean z3 = i3 == i4;
        boolean z4 = i11 > i12;
        if (i3 > i4) {
            z = true;
        }
        if (z2 != z3 || z4 != z) {
            i13 |= 128;
        }
        i10 = i13;
        if (this.y != i5) {
            ((ype) a.l().ai(2040)).R("Moving window %s from Z: %d to %d", E(), Integer.valueOf(this.y), Integer.valueOf(i5));
            ak(i, i2, i3, i4, this.e.g, rect, i6, i7, jidVar, jidVar2, i8, i9, list, projectionWindowDecorationParams, uuid, rect2, 0);
            bl(i5);
            this.y = i5;
        } else {
            ak(i, i2, i3, i4, i5, rect, i6, i7, jidVar, jidVar2, i8, i9, list, projectionWindowDecorationParams, uuid, rect2, 0);
        }
        ae();
        synchronized (this.s) {
            if (this.u == 2) {
                this.q.a();
            }
        }
        return i10;
    }

    @Override // defpackage.jhf
    public final Rect n() {
        return new Rect(this.H);
    }

    @Override // defpackage.jhf
    public final Rect o() {
        return new Rect(aP(s()));
    }

    @Override // defpackage.jhf
    public final Rect p() {
        return new Rect(aP(this.g));
    }

    @Override // defpackage.jhf
    public final synchronized Rect q() {
        return this.O;
    }

    @Override // defpackage.jhf
    public final Rect r() {
        return this.L;
    }

    @Override // defpackage.jhf
    public final Rect s() {
        Rect rect = new Rect(Math.max(this.f.left, this.J.left), Math.max(this.f.top, this.J.top), Math.max(this.f.right, this.J.right), Math.max(this.f.bottom, this.J.bottom));
        return (!this.j.h || this.f.equals(b)) ? rect : new Rect(rect.left + this.j.a, rect.top + this.j.b, rect.right + this.j.c, rect.bottom + this.j.d);
    }

    @Override // defpackage.jhf
    public final Rect t() {
        return new Rect(this.I);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String name = getClass().getName();
        sb.append(name.substring(name.lastIndexOf(46) + 1));
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append("{name=");
        sb.append(this.p.a());
        sb.append(",region=");
        sb.append(this.z);
        sb.append(",l=");
        sb.append(this.P);
        sb.append(",s=");
        sb.append(this.u);
        sb.append(",vis=");
        sb.append(this.m);
        sb.append(",isResizing=");
        sb.append(this.x);
        sb.append(",a=");
        sb.append(this.v);
        sb.append(",windowInsets=");
        sb.append(this.f);
        sb.append(",systemInsets=");
        sb.append(this.J);
        sb.append(",regionsCastingInsets=");
        sb.append(this.Q);
        sb.append(",insetSideHint=");
        sb.append(this.h);
        sb.append(",insetBehavior=");
        sb.append(this.K);
        sb.append(",carDisplayConfigurationId=");
        sb.append(this.d);
        sb.append(",windowDecorationParams=");
        sb.append(this.j);
        sb.append(",transparencyEnabled=");
        sb.append(this.w);
        sb.append(",stableZ=");
        sb.append(this.y);
        sb.append(",hasSystemLayoutZOverride=");
        sb.append(this.E);
        sb.append(",nonSystemOverrideLayoutZ=");
        sb.append(this.F);
        jhq jhqVar = this.e;
        if (jhqVar != null) {
            sb.append(jhqVar);
        }
        sb.append(",lastRenderBounds=");
        sb.append(this.o);
        sb.append('}');
        return sb.toString();
    }

    @Override // defpackage.jhf
    public final Rect u() {
        return new Rect(this.J);
    }

    @Override // defpackage.jhf
    public final Rect v() {
        return new Rect(this.f);
    }

    @Override // defpackage.jhf
    public final jhq x() {
        return this.e;
    }

    @Override // defpackage.jhf
    public final jid y() {
        return this.e.i;
    }

    @Override // defpackage.jhf
    public final jid z() {
        return this.e.j;
    }
}
