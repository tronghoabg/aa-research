package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class jha implements defpackage.jhl, defpackage.jhv {
    public final com.google.android.gms.car.display.CarRegionId A;
    public final java.lang.Runnable B;
    public volatile jhw C;
    public final int D;
    private boolean F;
    private int G;
    private volatile android.graphics.Rect I;
    private android.graphics.Rect J;
    private android.graphics.Rect K;
    private android.graphics.Rect L;
    private int M;
    private android.graphics.Rect N;
    private volatile boolean O;
    private volatile boolean P;
    private android.graphics.Rect Q;
    private final int R;
    private defpackage.ygw S;
    private android.view.MotionEvent T;
    public final defpackage.jkr c;
    public java.util.UUID e;
    public volatile defpackage.jhx f;
    public android.graphics.Rect g;
    public android.graphics.Rect h;
    protected int i;
    public volatile boolean j;
    public com.google.android.gms.car.ProjectionWindowDecorationParams k;
    public final boolean l;
    public final defpackage.jiz m;
    public volatile boolean n;
    public volatile boolean o;
    public defpackage.jhm p;
    public final defpackage.jhk q;
    public final defpackage.jgz r;
    public final android.content.ComponentName s;
    protected final java.lang.Object t;
    protected final java.lang.Object u;
    public int v;
    public volatile float w;
    public volatile boolean x;
    public volatile boolean y;
    public volatile int z;
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.WM.WIN");
    protected static final android.graphics.Rect b = new android.graphics.Rect();
    private static final java.util.concurrent.atomic.AtomicInteger E = new java.util.concurrent.atomic.AtomicInteger(1);
    protected final boolean d = defpackage.afga.f(defpackage.acpp.a.fF().d(), "system_theme");
    private final com.google.android.gms.car.CarWindowManagerLayoutParams H = new com.google.android.gms.car.CarWindowManagerLayoutParams();

    protected jha(defpackage.jkr jkrVar, int i, defpackage.jhk jhkVar, com.google.android.gms.car.display.CarRegionId carRegionId, java.util.UUID uuid, android.content.ComponentName componentName, boolean z, defpackage.jiz jizVar) {
        android.graphics.Rect rect = b;
        this.K = rect;
        this.L = rect;
        this.g = rect;
        this.h = rect;
        this.i = 1;
        this.M = 0;
        this.k = com.google.android.gms.car.ProjectionWindowDecorationParams.a();
        this.N = new android.graphics.Rect();
        this.n = false;
        java.lang.Object obj = new java.lang.Object();
        this.t = obj;
        this.u = new java.lang.Object();
        int i2 = defpackage.ygw.d;
        this.S = defpackage.ymx.a;
        this.B = new defpackage.ire(this, 15);
        this.D = E.getAndIncrement();
        this.c = jkrVar;
        this.l = z;
        this.R = i;
        this.q = jhkVar;
        this.A = carRegionId;
        this.e = uuid;
        this.s = componentName;
        this.r = new defpackage.jgz(this);
        this.m = jizVar;
        java.lang.System.identityHashCode(obj);
        this.v = 0;
        this.w = 1.0f;
    }

    private final android.graphics.Rect aR(android.graphics.Rect rect) {
        return this.k.h ? rect : new android.graphics.Rect(java.lang.Math.max(rect.left - this.k.a, 0), java.lang.Math.max(rect.top - this.k.b, 0), java.lang.Math.max(rect.right - this.k.c, 0), java.lang.Math.max(rect.bottom - this.k.d, 0));
    }

    private final void aU(int i, boolean z) {
        int i2;
        defpackage.jhx jhxVar = this.f;
        jhxVar.getClass();
        if (z) {
            i2 = i;
        } else {
            int iH = this.F ? h() + (i - this.G) : i;
            this.G = i;
            i2 = iH;
        }
        this.f = new defpackage.jhx(jhxVar.a, jhxVar.b, jhxVar.c, jhxVar.d, i2, jhxVar.h, jhxVar.i, jhxVar.j, jhxVar.k, jhxVar.l);
    }

    private final synchronized void aW(int i, int i2) {
        this.f = new defpackage.jhx(this.f.a + i, this.f.b + i2, this.f.c, this.f.d, this.f.g, this.f.h, this.f.i, this.f.j, this.f.k, this.f.l);
        defpackage.jhi jhiVar = ((defpackage.inh) this.c).w;
        jhiVar.getClass();
        int i3 = this.f.a;
        int i4 = this.f.f;
        int i5 = jhiVar.g;
        this.I = new android.graphics.Rect(i3, i5 - i4, this.f.e, i5 - this.f.b);
        Z();
    }

    @Override // defpackage.jhl
    public final defpackage.jik A() {
        return this.f.j;
    }

    @Override // defpackage.jhl
    public final synchronized com.google.android.gms.car.CarWindowManagerLayoutParams B() {
        return this.H;
    }

    @Override // defpackage.jhl
    public final com.google.android.gms.car.ProjectionWindowDecorationParams C() {
        return this.k;
    }

    @Override // defpackage.jhl
    public final com.google.android.gms.car.display.CarRegionId D() {
        return this.A;
    }

    @Override // defpackage.jhl
    public final defpackage.ygw E() {
        return this.S;
    }

    @Override // defpackage.jhl
    public final java.lang.String F() {
        return this.q.a();
    }

    @Override // defpackage.jhl
    public final java.util.UUID G() {
        return this.e;
    }

    @Override // defpackage.jhl
    public final synchronized void H() {
        boolean z;
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 2018)).y("cleanup %s", this);
        java.lang.Object obj = this.t;
        synchronized (obj) {
            int i = this.v;
            if (i == 5) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(2020)).y("requesting removal for already removed window %s", this);
                return;
            }
            if (i < 4) {
                this.v = 4;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.r.b();
            }
            S();
            av(false);
            this.q.d(this);
            synchronized (obj) {
                this.v = 5;
            }
        }
    }

    @Override // defpackage.jhl
    public final void I() {
        synchronized (this.t) {
            if (this.v >= 4) {
                return;
            }
            this.v = 4;
        }
    }

    @Override // defpackage.jhl
    public final void K() {
        this.x = true;
    }

    @Override // defpackage.jhl
    public final void L() {
        this.y = false;
        defpackage.rbz.j(new defpackage.jeo(this, 6));
    }

    @Override // defpackage.jhl
    public final void M() {
        av(false);
        this.c.z();
    }

    @Override // defpackage.jhl
    public final void N(android.view.KeyEvent keyEvent) {
        defpackage.jgz jgzVar = this.r;
        jgzVar.sendMessage(jgzVar.obtainMessage(8, keyEvent));
    }

    @Override // defpackage.jhl
    public final void O(long j, java.util.List list) {
        aI(j, j, 4, list);
    }

    @Override // defpackage.jhl
    public final void P(android.view.MotionEvent motionEvent) {
        this.r.d(motionEvent);
    }

    @Override // defpackage.jhl
    public final void Q(android.view.MotionEvent motionEvent) {
        this.r.d(motionEvent);
    }

    @Override // defpackage.jhl
    public final void R(int i) {
        defpackage.ygw ygwVarD;
        int size;
        java.lang.Object obj;
        if (this.C == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 2025)).y("Trying to move non draggable window %s", this);
            return;
        }
        ((defpackage.yqj) a.l().ai(2024)).D("Moving to drag step %s for %s", i, this);
        jhw jhwVar = this.C;
        defpackage.ygw ygwVarD2 = jhwVar.d();
        ygwVarD2.getClass();
        if (i < 0 || i >= ygwVarD2.size()) {
            if (i >= jhwVar.d().size()) {
                ygwVarD = jhwVar.d();
                size = jhwVar.d().size() - 1;
            } else {
                ygwVarD = jhwVar.d();
                size = 0;
            }
            obj = (java.lang.Integer) ygwVarD.get(size);
        } else {
            obj = ygwVarD2.get(i);
        }
        obj.getClass();
        int iIntValue = ((java.lang.Number) obj).intValue();
        emv emvVar = jhwVar.q;
        if (emvVar != null) {
            emvVar.b();
        }
        if (!jhwVar.m) {
            jhwVar.m = true;
            jhwVar.e.bp(null);
        }
        jhwVar.e(iIntValue);
    }

    protected abstract void S();

    @Override // defpackage.jhl
    public final void V(int i) {
        defpackage.jgz jgzVar = this.r;
        jgzVar.sendMessage(jgzVar.obtainMessage(9, i, 0));
    }

    @Override // defpackage.jhl
    public final void W() {
        ((defpackage.yqj) a.l().ai((char) 2027)).y("onInitFailed for %s", this);
        synchronized (this.t) {
            this.v = 5;
        }
        defpackage.jgz jgzVar = this.r;
        jgzVar.sendMessage(jgzVar.obtainMessage(11));
    }

    @Override // defpackage.jhl
    public final void X(com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent) {
        defpackage.jgz jgzVar = this.r;
        jgzVar.sendMessage(jgzVar.obtainMessage(6, inputFocusChangedEvent));
    }

    @Override // defpackage.jhl
    public final void Y(android.view.KeyEvent keyEvent) {
        this.c.aq(keyEvent);
    }

    protected abstract void Z();

    @Override // defpackage.jhl
    public final float a() {
        return this.w;
    }

    public abstract boolean aA();

    protected final boolean aB() {
        return this.k.l.a != 0;
    }

    @Override // defpackage.jhl
    public final boolean aC() {
        return !this.x && this.w == 1.0f;
    }

    @Override // defpackage.jhl
    public final boolean aD() {
        int iJ = j();
        return (iJ == 1 || iJ == 2 || iJ == 3) ? false : true;
    }

    @Override // defpackage.jhl
    public final boolean aE() {
        return this.n;
    }

    @Override // defpackage.jhl
    public final boolean aF() {
        int iJ = j();
        return iJ == 4 || iJ == 5;
    }

    @Override // defpackage.jhl
    public final boolean aG() {
        return this.f == null || (this.f.k & 128) == 0;
    }

    @Override // defpackage.jhl
    public final boolean aH() {
        return (this.f == null || (this.f.k & 256) == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x027f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0283  */
    /* JADX WARN: Code duplicated, block: B:118:0x0287  */
    /* JADX WARN: Code duplicated, block: B:120:0x0295  */
    /* JADX WARN: Code duplicated, block: B:121:0x029a  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:127:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:138:0x0303  */
    /* JADX WARN: Code duplicated, block: B:141:0x0313  */
    /* JADX WARN: Code duplicated, block: B:144:0x0329  */
    /* JADX WARN: Code duplicated, block: B:149:0x034e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0371  */
    /* JADX WARN: Code duplicated, block: B:154:0x0383  */
    /* JADX WARN: Code duplicated, block: B:157:0x038a  */
    /* JADX WARN: Code duplicated, block: B:160:0x039d  */
    /* JADX WARN: Code duplicated, block: B:161:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:164:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:166:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:167:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:169:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:170:0x03df  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:182:0x0417  */
    /* JADX WARN: Code duplicated, block: B:186:0x0424 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x0426  */
    /* JADX WARN: Code duplicated, block: B:188:0x042a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0439  */
    /* JADX WARN: Code duplicated, block: B:205:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:? A[LOOP:1: B:136:0x02fd->B:206:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:? A[LOOP:2: B:142:0x0323->B:209:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x03f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:? A[LOOP:3: B:171:0x03e7->B:212:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:38:0x0105  */
    /* JADX WARN: Code duplicated, block: B:40:0x011b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x012b  */
    @Override // defpackage.jhl
    public final void aI(long j, long j2, int i, java.util.List list) {
        long j3;
        boolean z;
        boolean z2;
        android.view.VelocityTracker velocityTracker;
        float xVelocity;
        int i2;
        int i3;
        java.util.List list2;
        java.util.ListIterator listIterator;
        int iNextIndex;
        int iIntValue;
        int i4;
        java.lang.Object objValueOf;
        float f;
        int i5;
        java.util.List list3;
        float f2;
        float f3;
        float f4;
        int iIntValue2;
        java.util.Iterator it;
        int iIntValue3;
        com.google.android.gms.car.FlingStepRange flingStepRange;
        emw emwVar;
        emw emwVar2;
        emv emvVar;
        java.lang.Integer num;
        java.util.Iterator it2;
        int iIntValue4;
        int iIntValue5;
        float f5;
        android.view.VelocityTracker velocityTracker2;
        emv emvVar2;
        int iK;
        java.util.List list4;
        int iIntValue6;
        int iIntValue7;
        if (this.n) {
            int i6 = (-this.c.e()) + this.f.f;
            int i7 = -this.f.a;
            com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams = this.k;
            if (!projectionWindowDecorationParams.h) {
                i6 -= projectionWindowDecorationParams.b;
                i7 -= projectionWindowDecorationParams.a;
            }
            int i8 = i6;
            int i9 = i7;
            android.view.MotionEvent motionEventA = defpackage.iyl.a(j, j2, i, list, i9, i8, 4098, 1);
            android.view.MotionEvent motionEvent = this.T;
            if (motionEvent != null) {
                if (defpackage.fzj.k(motionEventA.getEventTime() - motionEvent.getEventTime(), motionEventA.getAction(), motionEvent.getAction())) {
                    ((defpackage.yqj) a.l().ai((char) 2023)).u("Fling fix amended touch event timing");
                    motionEventA = defpackage.iyl.a(j, motionEvent.getEventTime(), i, list, i9, i8, 4098, 1);
                }
                long eventTime = motionEvent.getEventTime();
                motionEvent.recycle();
                j3 = eventTime;
            } else {
                j3 = j2;
            }
            this.T = android.view.MotionEvent.obtain(motionEventA);
            jhw jhwVar = this.C;
            if (jhwVar != null) {
                android.view.MotionEvent motionEventA2 = defpackage.iyl.a(j, j3, i, list, 0, 0, 4098, 1);
                motionEventA2.getClass();
                int actionMasked = motionEventA2.getActionMasked();
                int iIntValue8 = 0;
                if (actionMasked == 0) {
                    android.graphics.Point point = new android.graphics.Point((int) motionEventA2.getX(), (int) motionEventA2.getY());
                    java.util.List list5 = jhwVar.t;
                    if ((list5 instanceof java.util.Collection) && list5.isEmpty()) {
                        jhwVar.k = point;
                        jhwVar.l = point;
                        jhwVar.j = motionEventA2.getPointerId(0);
                        jhwVar.m = false;
                        jhwVar.s = -1;
                        velocityTracker2 = jhwVar.n;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                        }
                        jhwVar.n = android.view.VelocityTracker.obtain();
                        emvVar2 = jhwVar.q;
                        if (emvVar2 != null) {
                            emvVar2.b();
                        }
                        iK = jhwVar.o;
                        list4 = jhwVar.f;
                        if (!list4.isEmpty()) {
                            iIntValue6 = ((java.lang.Number) defpackage.afga.az(list4)).intValue();
                            iIntValue7 = ((java.lang.Number) defpackage.afga.aE(list4)).intValue();
                            if (iK < iIntValue6) {
                                iK = defpackage.afhi.k(iIntValue6 - jhwVar.b(iIntValue6 - iK));
                            } else if (iK > iIntValue7) {
                                iK = defpackage.afhi.k(iIntValue7 + jhwVar.b(iK - iIntValue7));
                            }
                        }
                        jhwVar.p = iK;
                    } else {
                        java.util.Iterator it3 = list5.iterator();
                        while (it3.hasNext()) {
                            if (((android.graphics.Rect) it3.next()).contains(point.x + i9, point.y + i8)) {
                                jhwVar.j = -1;
                            }
                        }
                        jhwVar.k = point;
                        jhwVar.l = point;
                        jhwVar.j = motionEventA2.getPointerId(0);
                        jhwVar.m = false;
                        jhwVar.s = -1;
                        velocityTracker2 = jhwVar.n;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                        }
                        jhwVar.n = android.view.VelocityTracker.obtain();
                        emvVar2 = jhwVar.q;
                        if (emvVar2 != null) {
                            emvVar2.b();
                        }
                        iK = jhwVar.o;
                        list4 = jhwVar.f;
                        if (!list4.isEmpty()) {
                            iIntValue6 = ((java.lang.Number) defpackage.afga.az(list4)).intValue();
                            iIntValue7 = ((java.lang.Number) defpackage.afga.aE(list4)).intValue();
                            if (iK < iIntValue6) {
                                iK = defpackage.afhi.k(iIntValue6 - jhwVar.b(iIntValue6 - iK));
                            } else if (iK > iIntValue7) {
                                iK = defpackage.afhi.k(iIntValue7 + jhwVar.b(iK - iIntValue7));
                            }
                        }
                        jhwVar.p = iK;
                    }
                } else {
                    int i10 = jhwVar.j;
                    if (i10 != -1) {
                        if (actionMasked == 1) {
                            z = jhwVar.m;
                            if (z) {
                                velocityTracker = jhwVar.n;
                                if (velocityTracker != null) {
                                    return;
                                }
                                velocityTracker.addMovement(motionEventA2);
                                velocityTracker.computeCurrentVelocity(1000);
                                if (jhwVar.h() == 2) {
                                    xVelocity = velocityTracker.getXVelocity();
                                } else {
                                    xVelocity = -velocityTracker.getYVelocity();
                                }
                                velocityTracker.recycle();
                                jhwVar.n = null;
                                if (java.lang.Math.abs(xVelocity) > 2500.0f) {
                                    i5 = jhwVar.p;
                                    list3 = jhwVar.f;
                                    f2 = 1.0f;
                                    if (!list3.isEmpty()) {
                                        iIntValue4 = ((java.lang.Number) defpackage.afga.az(list3)).intValue();
                                        iIntValue5 = ((java.lang.Number) defpackage.afga.aE(list3)).intValue();
                                        if (i5 < iIntValue4) {
                                            f5 = iIntValue4 - i5;
                                        } else if (i5 > iIntValue5) {
                                            f5 = i5 - iIntValue5;
                                        }
                                        float f6 = jhwVar.i;
                                        float f7 = f5 + f6;
                                        f2 = (f6 * f6) / (f7 * f7);
                                    }
                                    f3 = xVelocity * f2;
                                    f4 = jhwVar.o + (f3 / 200.0f);
                                    if (f3 > 0.0f) {
                                        iIntValue2 = ((java.lang.Number) defpackage.afga.aE(list3)).intValue();
                                        it2 = list3.iterator();
                                        while (it2.hasNext()) {
                                            iIntValue3 = ((java.lang.Number) it2.next()).intValue();
                                            if (iIntValue3 >= f4) {
                                                iIntValue2 = iIntValue3;
                                                break;
                                            }
                                        }
                                    } else {
                                        java.util.List list6 = jhwVar.g;
                                        iIntValue2 = ((java.lang.Number) defpackage.afga.aE(list6)).intValue();
                                        it = list6.iterator();
                                        while (it.hasNext()) {
                                            iIntValue3 = ((java.lang.Number) it.next()).intValue();
                                            if (iIntValue3 <= f4) {
                                                iIntValue2 = iIntValue3;
                                                break;
                                            }
                                        }
                                    }
                                    defpackage.ygw ygwVarB = jhwVar.c.b();
                                    ygwVarB.getClass();
                                    flingStepRange = (com.google.android.gms.car.FlingStepRange) defpackage.afga.aC(ygwVarB, jhwVar.c());
                                    if (flingStepRange != null) {
                                        int iIndexOf = jhwVar.d().indexOf(java.lang.Integer.valueOf(iIntValue2));
                                        defpackage.ygw ygwVarD = jhwVar.d();
                                        ygwVarD.getClass();
                                        num = (java.lang.Integer) defpackage.afga.aC(ygwVarD, defpackage.afqt.g(iIndexOf, flingStepRange.a, flingStepRange.b));
                                        if (num != null) {
                                            iIntValue2 = num.intValue();
                                        }
                                    }
                                    emv emvVar3 = new emv(jhwVar, jhw.b, iIntValue2);
                                    ((emt) emvVar3).i = f3;
                                    emwVar = emvVar3.s;
                                    if (emwVar != null) {
                                        emwVar.e(200.0f);
                                    }
                                    emwVar2 = emvVar3.s;
                                    if (emwVar2 != null) {
                                        emwVar2.c(0.75f);
                                    }
                                    emvVar3.g(new jht(jhwVar, iIntValue2, 0));
                                    jhwVar.q = emvVar3;
                                    emvVar = jhwVar.q;
                                    if (emvVar != null) {
                                        emvVar.e();
                                    }
                                } else {
                                    i2 = jhwVar.r;
                                    i3 = jhwVar.o;
                                    list2 = jhwVar.f;
                                    if (!list2.isEmpty()) {
                                        if (i3 <= ((java.lang.Number) defpackage.afga.az(list2)).intValue()) {
                                            iIntValue8 = ((java.lang.Number) defpackage.afga.az(list2)).intValue();
                                        } else if (i3 >= ((java.lang.Number) defpackage.afga.aE(list2)).intValue()) {
                                            iIntValue8 = ((java.lang.Number) defpackage.afga.aE(list2)).intValue();
                                        } else {
                                            listIterator = list2.listIterator(list2.size());
                                            while (true) {
                                                if (listIterator.hasPrevious()) {
                                                    iNextIndex = -1;
                                                    break;
                                                } else if (((java.lang.Number) listIterator.previous()).intValue() <= i3) {
                                                    iNextIndex = listIterator.nextIndex();
                                                    break;
                                                }
                                            }
                                            iIntValue = ((java.lang.Number) list2.get(iNextIndex)).intValue();
                                            i4 = iNextIndex + 1;
                                            if (i4 >= 0 || i4 >= list2.size()) {
                                                objValueOf = java.lang.Integer.valueOf(iIntValue);
                                            } else {
                                                objValueOf = list2.get(i4);
                                            }
                                            iIntValue8 = ((java.lang.Number) objValueOf).intValue();
                                            if (iIntValue != iIntValue8) {
                                                if (i2 > i3) {
                                                    f = 0.8f;
                                                } else {
                                                    f = 0.2f;
                                                }
                                                if (i3 < iIntValue + ((iIntValue8 - iIntValue) * f)) {
                                                    iIntValue8 = iIntValue;
                                                }
                                            } else {
                                                iIntValue8 = iIntValue;
                                            }
                                        }
                                    }
                                    jhwVar.e(iIntValue8);
                                }
                            }
                            jhwVar.j = -1;
                            z2 = z;
                            if (z2) {
                                return;
                            }
                        } else {
                            if (actionMasked != 2) {
                                if (actionMasked == 3) {
                                    z = jhwVar.m;
                                    if (z) {
                                        velocityTracker = jhwVar.n;
                                        if (velocityTracker != null) {
                                            return;
                                        }
                                        velocityTracker.addMovement(motionEventA2);
                                        velocityTracker.computeCurrentVelocity(1000);
                                        if (jhwVar.h() == 2) {
                                            xVelocity = velocityTracker.getXVelocity();
                                        } else {
                                            xVelocity = -velocityTracker.getYVelocity();
                                        }
                                        velocityTracker.recycle();
                                        jhwVar.n = null;
                                        if (java.lang.Math.abs(xVelocity) > 2500.0f) {
                                            i5 = jhwVar.p;
                                            list3 = jhwVar.f;
                                            f2 = 1.0f;
                                            if (!list3.isEmpty()) {
                                                iIntValue4 = ((java.lang.Number) defpackage.afga.az(list3)).intValue();
                                                iIntValue5 = ((java.lang.Number) defpackage.afga.aE(list3)).intValue();
                                                if (i5 < iIntValue4) {
                                                    f5 = iIntValue4 - i5;
                                                } else if (i5 > iIntValue5) {
                                                    f5 = i5 - iIntValue5;
                                                }
                                                float f8 = jhwVar.i;
                                                float f9 = f5 + f8;
                                                f2 = (f8 * f8) / (f9 * f9);
                                            }
                                            f3 = xVelocity * f2;
                                            f4 = jhwVar.o + (f3 / 200.0f);
                                            if (f3 > 0.0f) {
                                                iIntValue2 = ((java.lang.Number) defpackage.afga.aE(list3)).intValue();
                                                it2 = list3.iterator();
                                                while (it2.hasNext()) {
                                                    iIntValue3 = ((java.lang.Number) it2.next()).intValue();
                                                    if (iIntValue3 >= f4) {
                                                        iIntValue2 = iIntValue3;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                java.util.List list7 = jhwVar.g;
                                                iIntValue2 = ((java.lang.Number) defpackage.afga.aE(list7)).intValue();
                                                it = list7.iterator();
                                                while (it.hasNext()) {
                                                    iIntValue3 = ((java.lang.Number) it.next()).intValue();
                                                    if (iIntValue3 <= f4) {
                                                        iIntValue2 = iIntValue3;
                                                        break;
                                                    }
                                                }
                                            }
                                            defpackage.ygw ygwVarB2 = jhwVar.c.b();
                                            ygwVarB2.getClass();
                                            flingStepRange = (com.google.android.gms.car.FlingStepRange) defpackage.afga.aC(ygwVarB2, jhwVar.c());
                                            if (flingStepRange != null) {
                                                int iIndexOf2 = jhwVar.d().indexOf(java.lang.Integer.valueOf(iIntValue2));
                                                defpackage.ygw ygwVarD2 = jhwVar.d();
                                                ygwVarD2.getClass();
                                                num = (java.lang.Integer) defpackage.afga.aC(ygwVarD2, defpackage.afqt.g(iIndexOf2, flingStepRange.a, flingStepRange.b));
                                                if (num != null) {
                                                    iIntValue2 = num.intValue();
                                                }
                                            }
                                            emv emvVar4 = new emv(jhwVar, jhw.b, iIntValue2);
                                            ((emt) emvVar4).i = f3;
                                            emwVar = emvVar4.s;
                                            if (emwVar != null) {
                                                emwVar.e(200.0f);
                                            }
                                            emwVar2 = emvVar4.s;
                                            if (emwVar2 != null) {
                                                emwVar2.c(0.75f);
                                            }
                                            emvVar4.g(new jht(jhwVar, iIntValue2, 0));
                                            jhwVar.q = emvVar4;
                                            emvVar = jhwVar.q;
                                            if (emvVar != null) {
                                                emvVar.e();
                                            }
                                        } else {
                                            i2 = jhwVar.r;
                                            i3 = jhwVar.o;
                                            list2 = jhwVar.f;
                                            if (!list2.isEmpty()) {
                                                if (i3 <= ((java.lang.Number) defpackage.afga.az(list2)).intValue()) {
                                                    iIntValue8 = ((java.lang.Number) defpackage.afga.az(list2)).intValue();
                                                } else if (i3 >= ((java.lang.Number) defpackage.afga.aE(list2)).intValue()) {
                                                    iIntValue8 = ((java.lang.Number) defpackage.afga.aE(list2)).intValue();
                                                } else {
                                                    listIterator = list2.listIterator(list2.size());
                                                    while (true) {
                                                        if (listIterator.hasPrevious()) {
                                                            iNextIndex = -1;
                                                            break;
                                                        } else if (((java.lang.Number) listIterator.previous()).intValue() <= i3) {
                                                            iNextIndex = listIterator.nextIndex();
                                                            break;
                                                        }
                                                    }
                                                    iIntValue = ((java.lang.Number) list2.get(iNextIndex)).intValue();
                                                    i4 = iNextIndex + 1;
                                                    if (i4 >= 0) {
                                                        objValueOf = java.lang.Integer.valueOf(iIntValue);
                                                    } else {
                                                        objValueOf = java.lang.Integer.valueOf(iIntValue);
                                                    }
                                                    iIntValue8 = ((java.lang.Number) objValueOf).intValue();
                                                    if (iIntValue != iIntValue8) {
                                                        if (i2 > i3) {
                                                            f = 0.8f;
                                                        } else {
                                                            f = 0.2f;
                                                        }
                                                        if (i3 < iIntValue + ((iIntValue8 - iIntValue) * f)) {
                                                            iIntValue8 = iIntValue;
                                                        }
                                                    } else {
                                                        iIntValue8 = iIntValue;
                                                    }
                                                }
                                            }
                                            jhwVar.e(iIntValue8);
                                        }
                                    }
                                    jhwVar.j = -1;
                                    z2 = z;
                                } else if (actionMasked == 5) {
                                    int actionIndex = motionEventA2.getActionIndex();
                                    android.graphics.Point point2 = new android.graphics.Point((int) motionEventA2.getX(actionIndex), (int) motionEventA2.getY(actionIndex));
                                    jhwVar.k = point2;
                                    jhwVar.l = point2;
                                    jhwVar.j = motionEventA2.getPointerId(actionIndex);
                                } else if (actionMasked == 6) {
                                    int actionIndex2 = motionEventA2.getActionIndex();
                                    if (motionEventA2.getPointerId(actionIndex2) == jhwVar.j) {
                                        iIntValue8 = actionIndex2 == 0 ? 1 : 0;
                                        jhwVar.l = new android.graphics.Point((int) motionEventA2.getX(iIntValue8), (int) motionEventA2.getY(iIntValue8));
                                        jhwVar.j = motionEventA2.getPointerId(iIntValue8);
                                    }
                                }
                                if (z2) {
                                    return;
                                }
                            } else {
                                boolean z3 = jhwVar.m;
                                int iFindPointerIndex = motionEventA2.findPointerIndex(i10);
                                if (iFindPointerIndex != -1) {
                                    android.view.VelocityTracker velocityTracker3 = jhwVar.n;
                                    if (velocityTracker3 != null) {
                                        velocityTracker3.addMovement(motionEventA2);
                                    }
                                    int x = (int) motionEventA2.getX(iFindPointerIndex);
                                    int y = (int) motionEventA2.getY(iFindPointerIndex);
                                    int i11 = jhwVar.h() == 2 ? x - jhwVar.l.x : jhwVar.l.y - y;
                                    if (!jhwVar.m) {
                                        int iAbs = java.lang.Math.abs(x - jhwVar.k.x);
                                        int iAbs2 = java.lang.Math.abs(y - jhwVar.k.y);
                                        jhwVar.m = jhwVar.h() + (-1) == 1 ? !(iAbs <= jhwVar.h || iAbs <= iAbs2) : !(iAbs2 <= jhwVar.h || iAbs2 <= iAbs);
                                    }
                                    jhwVar.l = new android.graphics.Point(x, y);
                                    if (jhwVar.m) {
                                        if (!z3) {
                                            jhwVar.e.bp(motionEventA2);
                                            try {
                                                defpackage.rau rauVar = jhwVar.d;
                                                if (rauVar != null) {
                                                    rauVar.g();
                                                }
                                            } catch (android.os.RemoteException unused) {
                                                ((defpackage.yqj) jhw.a.h()).u("RemoteException when notifying client of drag start");
                                            }
                                        }
                                        int iK2 = jhwVar.p + i11;
                                        jhwVar.p = iK2;
                                        java.util.List list8 = jhwVar.f;
                                        if (!list8.isEmpty()) {
                                            int iIntValue9 = ((java.lang.Number) defpackage.afga.az(list8)).intValue();
                                            int iIntValue10 = ((java.lang.Number) defpackage.afga.aE(list8)).intValue();
                                            if (iK2 < iIntValue9) {
                                                iK2 = defpackage.afhi.k(iIntValue9 - jhwVar.a(iIntValue9 - iK2));
                                            } else if (iK2 > iIntValue10) {
                                                iK2 = defpackage.afhi.k(iIntValue10 + jhwVar.a(iK2 - iIntValue10));
                                            }
                                        }
                                        int i12 = iK2 - jhwVar.o;
                                        jhwVar.o = iK2;
                                        jhwVar.f();
                                        if (i12 != 0) {
                                            jhwVar.e.bl(jhwVar.h() == 2 ? i12 : 0, jhwVar.h() == 1 ? i12 : 0);
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            z2 = jhwVar.m;
                            if (z2) {
                                return;
                            }
                        }
                    }
                }
            }
            this.r.d(motionEventA);
        }
    }

    @Override // defpackage.jhv
    public void aJ() {
        aW(0, 0);
        if (this.C != null) {
            defpackage.ygw ygwVarC = this.k.l.c();
            if (ygwVarC == null || !ygwVarC.contains(java.lang.Integer.valueOf(this.C.c()))) {
                defpackage.jkr jkrVar = this.c;
                synchronized (((defpackage.inh) jkrVar).V) {
                    ((defpackage.inh) jkrVar).al(this, null, true);
                    ((defpackage.inh) jkrVar).ah(this, true);
                }
            }
        }
    }

    @Override // defpackage.jhl
    public final void aK() {
        this.w = 0.54f;
    }

    @Override // defpackage.jhl
    public final void aa(android.view.MotionEvent motionEvent, com.google.android.gms.car.TouchEventCompleteData touchEventCompleteData) {
        this.c.G(this, motionEvent, touchEventCompleteData);
    }

    @Override // defpackage.jhl
    public final void ab(android.view.KeyEvent keyEvent) {
        this.c.ai(this, keyEvent);
    }

    @Override // defpackage.jhl
    public final void ac() {
        defpackage.jgz jgzVar = this.r;
        jgzVar.sendMessage(jgzVar.obtainMessage(10));
    }

    @Override // defpackage.jhl
    public final void ad() {
        synchronized (this.t) {
            this.v = 2;
        }
        this.r.a();
    }

    @Override // defpackage.jhl
    public final void ae() {
        synchronized (this.t) {
            if (this.v >= 4) {
                return;
            }
            this.v = 4;
            ((defpackage.yqj) a.l().ai((char) 2028)).y("notify window detach %s", this);
            this.r.b();
        }
    }

    protected abstract void af();

    @Override // defpackage.jhl
    public final void ag() {
        synchronized (this.t) {
            if (this.v >= 3) {
                return;
            }
            this.v = 3;
        }
    }

    @Override // defpackage.jhl
    public final synchronized void ah() {
        if (!this.F) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2030)).y("removeSystemLayoutZOverride when not overridden for %s", this);
            return;
        }
        ((defpackage.yqj) a.l().ai(2029)).D("Clearing override z and using %s for %s", this.G, this);
        this.F = false;
        aU(this.G, false);
    }

    @Override // defpackage.jhl
    public final synchronized void aj(android.graphics.Rect rect) {
        this.Q = rect;
    }

    @Override // defpackage.jhl
    public final synchronized void ak(int i) {
        ((defpackage.yqj) a.l().ai(2032)).D("setFocusFlags(flags:%d) %s", i, this);
        defpackage.jhx jhxVar = this.f;
        this.f = new defpackage.jhx(jhxVar.a, jhxVar.b, jhxVar.c, jhxVar.d, jhxVar.g, jhxVar.h, jhxVar.i, jhxVar.j, i, jhxVar.l);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0081 A[Catch: all -> 0x01d5, TryCatch #0 {all -> 0x01d5, blocks: (B:5:0x000d, B:7:0x002a, B:11:0x0039, B:18:0x009e, B:20:0x00a4, B:30:0x00c2, B:32:0x0133, B:33:0x0135, B:36:0x013d, B:38:0x0142, B:40:0x0149, B:42:0x0160, B:48:0x0170, B:49:0x017d, B:51:0x0181, B:52:0x0191, B:54:0x01a2, B:58:0x01c9, B:65:0x01d6, B:61:0x01d0, B:44:0x0166, B:46:0x016a, B:37:0x0140, B:39:0x0145, B:29:0x00bf, B:23:0x00a9, B:12:0x005d, B:14:0x0061, B:16:0x0076, B:17:0x0081), top: B:67:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00b3 A[PHI: r2
  0x00b3: PHI (r2v1 int) = (r2v0 int), (r2v0 int), (r2v17 int) binds: [B:6:0x0028, B:8:0x0034, B:22:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jhl
    public final synchronized void al(int i, int i2, int i3, int i4, int i5, jhq jhqVar, int i6, int i7, defpackage.jik jikVar, defpackage.jik jikVar2, int i8, int i9, java.util.List list, com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams, java.util.UUID uuid, android.graphics.Rect rect, int i10) throws java.lang.Throwable {
        int i11;
        int i12;
        int i13;
        int iIntValue;
        defpackage.jha jhaVar = this;
        int iC = i10;
        synchronized (this) {
            try {
                jhaVar.G = i5;
                com.google.android.gms.car.ProjectionWindowDragParams projectionWindowDragParams = projectionWindowDecorationParams.l;
                int i14 = defpackage.ygw.d;
                defpackage.ygw ygwVar = defpackage.ymx.a;
                boolean zEquals = j$.util.Objects.equals(projectionWindowDragParams, new com.google.android.gms.car.ProjectionWindowDragParams(0, ygwVar, null, ygwVar, ygwVar));
                if (zEquals || projectionWindowDecorationParams.l.a().isEmpty()) {
                    i11 = i;
                    i12 = iC;
                    i13 = i2;
                } else {
                    if (iC != -1) {
                        iIntValue = ((java.lang.Integer) projectionWindowDecorationParams.l.a().get(iC)).intValue();
                        ((defpackage.yqj) a.l().ai(2035)).B("SetLayoutParams with drag state %s for an offset of %s", iC, iIntValue);
                    } else if (jhaVar.C != null) {
                        jhw jhwVar = jhaVar.C;
                        defpackage.ygw ygwVarA = projectionWindowDecorationParams.l.a();
                        ygwVarA.getClass();
                        if (defpackage.afga.f(jhwVar.d(), ygwVarA)) {
                            iIntValue = jhaVar.C.r;
                            iC = jhaVar.C.c();
                        } else {
                            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2034)).y("Attempting to use current drag state with changed drag states %s", jhaVar);
                            iIntValue = ((java.lang.Integer) projectionWindowDecorationParams.l.a().get(0)).intValue();
                        }
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2034)).y("Attempting to use current drag state with changed drag states %s", jhaVar);
                        iIntValue = ((java.lang.Integer) projectionWindowDecorationParams.l.a().get(0)).intValue();
                    }
                    int i15 = projectionWindowDecorationParams.l.a;
                    if (i15 == 1) {
                        i11 = iIntValue + i;
                        i12 = iC;
                        i13 = i2;
                    } else if (i15 == 2) {
                        i12 = iC;
                        i13 = i2 - (i4 - iIntValue);
                        i11 = i;
                    } else {
                        i11 = i;
                        i12 = iC;
                        i13 = i2;
                    }
                }
                android.graphics.Rect rect2 = jhqVar == null ? null : jhqVar.a;
                jhaVar.f = new defpackage.jhx(i11, i13, i3, i4, i5, rect2, jikVar, jikVar2, i8, i9);
                ((defpackage.yqj) a.l().ai(2033)).R("Setting layoutParams of %s to: %s. RegionsCastingInsets=%s", jhaVar.F(), jhaVar.f, list);
                jhaVar.z = jhaVar.f.g;
                defpackage.jkr jkrVar = jhaVar.c;
                defpackage.jhi jhiVar = ((defpackage.inh) jkrVar).w;
                jhiVar.getClass();
                int i16 = jhiVar.g;
                jhaVar.J = new android.graphics.Rect(i, i16 - (i2 + i4), i + i3, i16 - i2);
                jhaVar.I = new android.graphics.Rect(jhaVar.f.a, i16 - jhaVar.f.f, jhaVar.f.e, i16 - jhaVar.f.b);
                if (rect2 == null) {
                    rect2 = b;
                }
                jhaVar.K = rect2;
                if (jhaVar.d) {
                    jhaVar.L = jhqVar == null ? b : jhqVar.b;
                } else {
                    jhaVar.L = b;
                }
                jhaVar.S = defpackage.ygw.o(list);
                jhaVar.i = i6;
                jhaVar.M = i7;
                defpackage.jiz jizVar = jhaVar.m;
                jizVar.e(projectionWindowDecorationParams);
                if ((projectionWindowDecorationParams.h && !jhaVar.k.h) || (projectionWindowDecorationParams.i && !jhaVar.k.i)) {
                    jizVar.b(!b.equals(jhaVar.g));
                }
                if (jhaVar.l) {
                    defpackage.jgz jgzVar = jhaVar.r;
                    android.graphics.Rect rect3 = b;
                    jgzVar.e(rect3);
                    jhaVar.h = rect3;
                    jhaVar.j = false;
                    jgzVar.removeCallbacks(jhaVar.B);
                }
                jhaVar.k = projectionWindowDecorationParams;
                jhaVar.e = uuid;
                jhaVar.N = new android.graphics.Rect(rect);
                if (!zEquals) {
                    try {
                        jhw jhwVar2 = new jhw(((defpackage.inh) jkrVar).l, projectionWindowDecorationParams.l, jhaVar, new android.util.Size(i3, i4), jkrVar.d(), i12);
                        jhaVar = jhaVar;
                        jhaVar.C = jhwVar2;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                jhaVar.Z();
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.jhl
    public final synchronized void am(int i) {
        ((defpackage.yqj) a.l().ai(2036)).D("setLocalLayoutZ(z:%s) %s", i, this);
        aU(i, false);
    }

    @Override // defpackage.jhl
    public final void an(java.util.List list) {
        if (this.C != null) {
            jhw jhwVar = this.C;
            list.getClass();
            jhwVar.t = list;
        }
    }

    @Override // defpackage.jhl
    public final synchronized void ao(int i) {
        ((defpackage.yqj) a.l().ai(2037)).D("Setting override z of %s for %s", i, this);
        aU(i, true);
        this.F = true;
    }

    @Override // defpackage.jhl
    public final synchronized void ap(com.google.android.gms.car.CarWindowManagerLayoutParams carWindowManagerLayoutParams) {
        this.H.a = carWindowManagerLayoutParams.a;
        defpackage.jgz jgzVar = this.r;
        jgzVar.sendMessage(jgzVar.obtainMessage(12));
    }

    @Override // defpackage.jhl
    public final void aq() {
        av(true);
        this.c.z();
    }

    @Override // defpackage.jhl
    public final void ar() {
        this.y = true;
        defpackage.rbz.j(new defpackage.jeo(this, 5));
    }

    @Override // defpackage.jhl
    public void at(boolean z) {
        if (this.A == null) {
            ((defpackage.yqj) a.l().ai((char) 2039)).y("Ignoring critical ui state change for window %s, carRegionId is null", F());
            return;
        }
        synchronized (this.u) {
            this.P = true;
            this.o = z;
            bn();
        }
    }

    @Override // defpackage.jhl
    public final void au(android.graphics.Rect rect) {
        this.K = rect;
        this.r.c(o());
    }

    public void av(boolean z) {
        synchronized (this.u) {
            this.n = z;
            bn();
        }
    }

    @Override // defpackage.jhl
    public final void aw(android.graphics.Rect rect, boolean z) {
        ((defpackage.yqj) a.l().ai(2041)).R("%s getting window insets of %s, transparency %b", F(), rect, java.lang.Boolean.valueOf(z));
        if (this.l) {
            defpackage.jgz jgzVar = this.r;
            jgzVar.removeCallbacks(this.B);
            if (z) {
                android.graphics.Rect rect2 = b;
                jgzVar.e(rect2);
                this.h = rect2;
                this.j = false;
            } else {
                android.graphics.Rect rect3 = this.g;
                rect3.getClass();
                if (rect3.left > rect.left || rect3.right > rect.right || rect3.top > rect.top || rect3.bottom > rect.bottom) {
                    android.graphics.Rect rect4 = b;
                    jgzVar.e(rect4);
                    this.h = rect4;
                    this.j = defpackage.rox.j(rect);
                } else if (!rect.equals(this.g)) {
                    this.j = true;
                }
            }
        }
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams = this.k;
        if ((projectionWindowDecorationParams.h || projectionWindowDecorationParams.i) && !this.g.equals(rect)) {
            android.graphics.Rect rect5 = this.g;
            android.graphics.Rect rect6 = b;
            if (rect5.equals(rect6) || rect.equals(rect6)) {
                android.graphics.Rect rect7 = new android.graphics.Rect(rect.left - this.g.left, rect.top - this.g.top, rect.right - this.g.right, rect.bottom - this.g.bottom);
                boolean zJ = defpackage.rox.j(rect);
                defpackage.jiz jizVar = this.m;
                if (zJ) {
                    jizVar.c(rect7);
                } else {
                    jizVar.d(rect7);
                }
            }
        }
        this.g = rect;
        this.r.c(o());
    }

    @Override // defpackage.jhl
    public final boolean ax(int i) {
        return (this.f.k & i) != 0;
    }

    @Override // defpackage.jhl
    public final boolean ay(int i, int i2) {
        int iE = this.c.e();
        int i3 = iE - i2;
        int iMax = this.f.a;
        int iMax2 = this.f.b;
        int iMin = this.f.a + this.f.c;
        int iMin2 = this.f.b + this.f.d;
        if (aB()) {
            iMax = java.lang.Math.max(iMax, this.J.left);
            iMax2 = java.lang.Math.max(iMax2, iE - this.J.bottom);
            iMin = java.lang.Math.min(iMin, this.J.right);
            iMin2 = java.lang.Math.min(iMin2, iE - this.J.top);
        }
        return i >= iMax && i3 >= iMax2 && i < iMin && i3 < iMin2;
    }

    @Override // defpackage.jhl
    public final boolean az(int i) {
        return (this.f == null || (this.f.l & i) == 0) ? false : true;
    }

    @Override // defpackage.jhl
    public final int b() {
        return this.f.a;
    }

    public final defpackage.jhm bk(defpackage.jhm jhmVar) {
        defpackage.jhi jhiVar = ((defpackage.inh) this.c).w;
        jhiVar.getClass();
        float f = jhiVar.b;
        float f2 = jhmVar.a - f;
        float f3 = jhmVar.c - f;
        float f4 = jhiVar.c;
        float f5 = jhmVar.d - f4;
        float f6 = jhmVar.b - f4;
        float f7 = jhiVar.d;
        double d = f7;
        if (d > 1.0d) {
            f3 *= f7;
            f2 *= f7;
        } else if (d < 1.0d) {
            f5 /= f7;
            f6 /= f7;
        }
        return new defpackage.jhm(this, f2, f5, f3, f6);
    }

    @Override // defpackage.jhv
    public final void bl(int i, int i2) {
        aW(i, i2);
    }

    protected final synchronized void bm(int i) {
        ((defpackage.yqj) a.l().ai(2031)).D("requestZ(requestedZ:%d) %s", i, this);
        Z();
        defpackage.ina inaVar = ((defpackage.inh) this.c).s;
        if (inaVar != null) {
            ((defpackage.yqj) defpackage.inh.a.l().ai(573)).D("requestZChange(requestedZ:%s) %s", i, this);
            inaVar.h(this, i);
        }
    }

    protected final void bn() {
        com.google.android.gms.car.display.CarRegionId carRegionId = this.A;
        if (carRegionId == null || !this.P) {
            return;
        }
        boolean z = false;
        if (this.n && this.o && aA()) {
            z = true;
        }
        if (z != this.O) {
            this.O = z;
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2038)).U("Critical ui ready state of window %s changed to %s. criticalUiContentReady=%s, visible=%s, drawn=%s, carDisplayConfigurationId=%s", F(), java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(this.o), java.lang.Boolean.valueOf(this.n), java.lang.Boolean.valueOf(aA()), this.e);
            defpackage.jkr jkrVar = this.c;
            synchronized (((defpackage.inh) jkrVar).N) {
                try {
                    if (z) {
                        ((defpackage.inh) jkrVar).O.add(carRegionId);
                    } else {
                        ((defpackage.inh) jkrVar).O.remove(carRegionId);
                    }
                    ((defpackage.inh) jkrVar).ac();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    protected void bo(int i, int i2) {
        this.q.e(this, i, i2);
    }

    @Override // defpackage.jhv
    public void bp(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        this.r.d(motionEventObtain);
    }

    @Override // defpackage.jhl
    public final int c() {
        return this.f.b;
    }

    @Override // defpackage.jhl
    public final int d() {
        return this.f.d;
    }

    @Override // defpackage.jhl
    public final int e() {
        return this.M;
    }

    @Override // defpackage.jhl
    public final int f() {
        return this.i;
    }

    @Override // defpackage.jhl
    public final int g() {
        return this.R;
    }

    @Override // defpackage.jhl
    public final int h() {
        return this.f.g;
    }

    @Override // defpackage.jhl
    public final int i() {
        return this.z;
    }

    @Override // defpackage.jhl
    public final int j() {
        int i;
        synchronized (this.t) {
            i = this.v;
        }
        return i;
    }

    @Override // defpackage.jhl
    public final int k() {
        return this.f.c;
    }

    @Override // defpackage.jhl
    public final int l() {
        return this.D;
    }

    @Override // defpackage.jhl
    public final synchronized int m(int i, int i2, int i3, int i4, int i5, jhq jhqVar, int i6, int i7, defpackage.jik jikVar, defpackage.jik jikVar2, int i8, int i9, java.util.List list, com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams, java.util.UUID uuid, android.graphics.Rect rect) {
        int i10;
        defpackage.ill.d();
        int i11 = this.f.c;
        int i12 = this.f.d;
        int i13 = 1024;
        boolean z = false;
        if (i3 == i11 && i4 == i12) {
            i13 = 0;
        }
        if (java.lang.Math.min(i11, i12) != java.lang.Math.min(i3, i4)) {
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
        if (this.z != i5) {
            ((defpackage.yqj) a.l().ai(2040)).R("Moving window %s from Z: %d to %d", F(), java.lang.Integer.valueOf(this.z), java.lang.Integer.valueOf(i5));
            al(i, i2, i3, i4, this.f.g, jhqVar, i6, i7, jikVar, jikVar2, i8, i9, list, projectionWindowDecorationParams, uuid, rect, 0);
            bm(i5);
            this.z = i5;
        } else {
            al(i, i2, i3, i4, i5, jhqVar, i6, i7, jikVar, jikVar2, i8, i9, list, projectionWindowDecorationParams, uuid, rect, 0);
        }
        af();
        synchronized (this.t) {
            if (this.v == 2) {
                this.r.a();
            }
        }
        return i10;
    }

    @Override // defpackage.jhl
    public final android.graphics.Rect n() {
        return new android.graphics.Rect(this.I);
    }

    @Override // defpackage.jhl
    public final android.graphics.Rect o() {
        return new android.graphics.Rect(aR(t()));
    }

    @Override // defpackage.jhl
    public final android.graphics.Rect p() {
        return new android.graphics.Rect(aR(this.h));
    }

    @Override // defpackage.jhl
    public final synchronized android.graphics.Rect q() {
        return this.Q;
    }

    @Override // defpackage.jhl
    public final android.graphics.Rect r() {
        return new android.graphics.Rect(this.L);
    }

    @Override // defpackage.jhl
    public final android.graphics.Rect s() {
        return this.N;
    }

    @Override // defpackage.jhl
    public final android.graphics.Rect t() {
        android.graphics.Rect rect = new android.graphics.Rect(java.lang.Math.max(this.g.left, this.K.left) + this.L.left, java.lang.Math.max(this.g.top, this.K.top) + this.L.top, java.lang.Math.max(this.g.right, this.K.right) + this.L.right, java.lang.Math.max(this.g.bottom, this.K.bottom) + this.L.bottom);
        return (!this.k.h || this.g.equals(b)) ? rect : new android.graphics.Rect(rect.left + this.k.a, rect.top + this.k.b, rect.right + this.k.c, rect.bottom + this.k.d);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String name = getClass().getName();
        sb.append(name.substring(name.lastIndexOf(46) + 1));
        sb.append("@");
        sb.append(java.lang.Integer.toHexString(hashCode()));
        sb.append("{name=");
        sb.append(this.q.a());
        sb.append(",region=");
        sb.append(this.A);
        sb.append(",l=");
        sb.append(this.R);
        sb.append(",s=");
        sb.append(this.v);
        sb.append(",vis=");
        sb.append(this.n);
        sb.append(",isResizing=");
        sb.append(this.y);
        sb.append(",a=");
        sb.append(this.w);
        sb.append(",windowInsets=");
        sb.append(this.g);
        sb.append(",systemInsets=");
        sb.append(this.K);
        sb.append(",extraInsets=");
        sb.append(this.L);
        sb.append(",regionsCastingInsets=");
        sb.append(this.S);
        sb.append(",insetSideHint=");
        sb.append(this.i);
        sb.append(",insetBehavior=");
        sb.append(this.M);
        sb.append(",carDisplayConfigurationId=");
        sb.append(this.e);
        sb.append(",windowDecorationParams=");
        sb.append(this.k);
        sb.append(",transparencyEnabled=");
        sb.append(this.x);
        sb.append(",stableZ=");
        sb.append(this.z);
        sb.append(",hasSystemLayoutZOverride=");
        sb.append(this.F);
        sb.append(",nonSystemOverrideLayoutZ=");
        sb.append(this.G);
        defpackage.jhx jhxVar = this.f;
        if (jhxVar != null) {
            sb.append(jhxVar);
        }
        jhw jhwVar = this.C;
        if (jhwVar != null) {
            sb.append(",dragHandler=");
            sb.append(jhwVar);
        }
        sb.append(",lastRenderBounds=");
        sb.append(this.p);
        sb.append('}');
        return sb.toString();
    }

    @Override // defpackage.jhl
    public final android.graphics.Rect u() {
        return new android.graphics.Rect(this.J);
    }

    @Override // defpackage.jhl
    public final android.graphics.Rect v() {
        return new android.graphics.Rect(this.K);
    }

    @Override // defpackage.jhl
    public final android.graphics.Rect w() {
        return new android.graphics.Rect(this.g);
    }

    @Override // defpackage.jhl
    public final defpackage.jhx y() {
        return this.f;
    }

    @Override // defpackage.jhl
    public final defpackage.jik z() {
        return this.f.i;
    }
}
