package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tvz {
    private float A;
    private final defpackage.tqd B;
    private final defpackage.tqd C;
    private final defpackage.tqd D;
    private final float E;
    private float F;
    private float G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private final boolean L;
    private float M;
    private float N;
    private long O;
    private final android.view.VelocityTracker P;
    private defpackage.twb Q;
    private final defpackage.tvs R;
    private final defpackage.tvv S;
    private final android.view.View T;
    public float a;
    public float b;
    public float c;
    private final android.content.Context d;
    private android.view.MotionEvent e;
    private android.view.MotionEvent f;
    private final java.util.List g;
    private final java.util.List h;
    private final defpackage.tvo i;
    private final defpackage.tvo j;
    private final defpackage.tvo k;
    private final defpackage.tvo l;
    private final java.util.ArrayDeque m;
    private long n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    public tvz(defpackage.tvv tvvVar, android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.g = arrayList;
        this.h = new java.util.ArrayList();
        this.m = new java.util.ArrayDeque();
        this.B = new defpackage.tqd();
        this.C = new defpackage.tqd();
        this.D = new defpackage.tqd();
        this.O = 0L;
        android.content.Context context = view.getContext();
        this.d = context;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.E = viewConfiguration.getScaledEdgeSlop();
        this.S = tvvVar;
        this.T = view;
        float f = 160.0f;
        this.M = 160.0f;
        this.N = 160.0f;
        if (context != null) {
            android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            this.M = displayMetrics.xdpi;
            f = displayMetrics.ydpi;
            this.N = f;
        }
        defpackage.twg twgVar = new defpackage.twg(2, tvvVar, this.M, f);
        this.j = twgVar;
        arrayList.add(twgVar);
        defpackage.twg twgVar2 = new defpackage.twg(3, tvvVar, this.M, this.N);
        this.k = twgVar2;
        arrayList.add(twgVar2);
        arrayList.add(new defpackage.twh(tvvVar, this.M, this.N, viewConfiguration.getScaledTouchSlop()));
        boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        this.L = !zHasSystemFeature;
        if (zHasSystemFeature) {
            defpackage.twc twcVar = new defpackage.twc(tvvVar, this.M, this.N);
            this.l = twcVar;
            arrayList.add(twcVar);
        } else {
            defpackage.twe tweVar = new defpackage.twe(tvvVar, this.M, this.N);
            this.l = tweVar;
            arrayList.add(tweVar);
        }
        defpackage.twd twdVar = new defpackage.twd(tvvVar, this.M, this.N);
        this.i = twdVar;
        arrayList.add(twdVar);
        defpackage.tvs tvsVar = new defpackage.tvs(context, tvvVar, new android.os.Handler(android.os.Looper.getMainLooper()));
        this.R = tvsVar;
        tvsVar.x = true;
        tvsVar.l = tvvVar;
        this.P = android.view.VelocityTracker.obtain();
    }

    private final java.util.EnumSet f() {
        java.util.EnumSet enumSetNoneOf = java.util.EnumSet.noneOf(defpackage.tvy.class);
        if (this.j.b || this.k.b) {
            enumSetNoneOf.add(defpackage.tvy.d);
        } else if (!this.L) {
            enumSetNoneOf.add(defpackage.tvy.a);
        }
        if (this.i.b) {
            enumSetNoneOf.add(defpackage.tvy.b);
        }
        if (this.l.b && !this.L) {
            enumSetNoneOf.add(defpackage.tvy.c);
        }
        return enumSetNoneOf;
    }

    private final void g(android.view.MotionEvent motionEvent) {
        float f = this.F;
        float f2 = this.G;
        float x = motionEvent.getX(0);
        float y = motionEvent.getY(0);
        float x2 = motionEvent.getX(motionEvent.getPointerCount() - 1);
        int pointerCount = motionEvent.getPointerCount() - 1;
        float f3 = this.E;
        float y2 = motionEvent.getY(pointerCount);
        boolean z = x < f3 || y < f3 || x > f || y > f2;
        boolean z2 = x2 < f3 || y2 < f3 || x2 > f || y2 > f2;
        if (z && z2) {
            this.a = -1.0f;
            this.b = -1.0f;
            this.H = true;
        } else if (z) {
            this.a = motionEvent.getX(motionEvent.getPointerCount() - 1);
            this.b = motionEvent.getY(motionEvent.getPointerCount() - 1);
            this.H = true;
        } else if (!z2) {
            this.K = true;
            this.H = false;
        } else {
            this.a = motionEvent.getX(0);
            this.b = motionEvent.getY(0);
            this.H = true;
        }
    }

    private final void h() {
        java.util.List list = this.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.tvo tvoVar = (defpackage.tvo) list.get(i);
            defpackage.ysr.bn(tvoVar.b, "Ending inactive gesture: %s", tvoVar);
            tvoVar.a(this);
        }
        list.clear();
    }

    private final void i() {
        this.e = null;
        this.f = null;
        this.H = false;
        this.K = false;
        this.h.clear();
        java.util.ArrayDeque arrayDeque = this.m;
        java.util.Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((defpackage.tvt) it.next()).d();
        }
        arrayDeque.clear();
        java.util.List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.tvo tvoVar = (defpackage.tvo) list.get(i);
            if (tvoVar.b) {
                tvoVar.a(this);
            }
        }
    }

    private final void j(android.view.MotionEvent motionEvent) {
        this.f = android.view.MotionEvent.obtain(motionEvent);
        this.s = -1.0f;
        this.t = -1.0f;
        this.w = -1.0f;
        this.x = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.I = false;
        this.J = false;
        android.view.MotionEvent motionEvent2 = this.e;
        motionEvent2.getClass();
        float x = motionEvent2.getX(0);
        float y = motionEvent2.getY(0);
        float x2 = motionEvent2.getX(motionEvent2.getPointerCount() - 1);
        float y2 = motionEvent2.getY(motionEvent2.getPointerCount() - 1);
        float x3 = motionEvent.getX(0);
        float y3 = motionEvent.getY(0);
        float x4 = motionEvent.getX(motionEvent.getPointerCount() - 1);
        float f = x2 - x;
        float f2 = x4 - x3;
        float y4 = motionEvent.getY(motionEvent.getPointerCount() - 1);
        float f3 = y4 - y3;
        this.o = f;
        this.p = y2 - y;
        this.q = f2;
        this.r = f3;
        this.u = y;
        this.v = y3;
        this.a = (f2 * 0.5f) + x3;
        this.b = (f3 * 0.5f) + y3;
        this.c = (f * 0.5f) + x;
        motionEvent.getEventTime();
        motionEvent2.getEventTime();
        this.z = motionEvent.getPressure(0) + motionEvent.getPressure(motionEvent.getPointerCount() - 1);
        this.A = motionEvent2.getPressure(0) + motionEvent2.getPressure(motionEvent2.getPointerCount() - 1);
        defpackage.tqd tqdVar = this.B;
        tqdVar.n(this.o, this.p);
        defpackage.tqd tqdVar2 = this.C;
        tqdVar2.n(x3 - x, y3 - y);
        defpackage.tqd tqdVar3 = this.D;
        tqdVar3.n(x4 - x2, y4 - y2);
        tqdVar.b(tqdVar3);
        tqdVar.b(tqdVar2);
    }

    private final boolean k() {
        return !this.h.isEmpty();
    }

    private static boolean l(defpackage.tvo tvoVar) {
        return tvoVar.b;
    }

    private final boolean m(android.view.MotionEvent motionEvent) {
        return motionEvent.getEventTime() <= this.O + 100;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    private final void n(android.view.MotionEvent motionEvent) {
        boolean z;
        int iH;
        int action = motionEvent.getAction();
        java.util.ArrayDeque arrayDeque = this.m;
        if (arrayDeque.isEmpty()) {
            this.n = motionEvent.getEventTime();
        }
        arrayDeque.addLast(new defpackage.tvt(motionEvent));
        if (arrayDeque.size() > 20) {
            ((defpackage.tvt) arrayDeque.removeFirst()).d();
        }
        while (((defpackage.tvt) arrayDeque.getLast()).c - ((defpackage.tvt) arrayDeque.getFirst()).c >= 250 && arrayDeque.size() > 3) {
            ((defpackage.tvt) arrayDeque.removeFirst()).d();
        }
        if (action == 1) {
            z = true;
        } else {
            if (action == 3) {
                this.K = false;
            } else if (action == 6 || action == 262) {
                z = true;
            }
            z = false;
        }
        if (this.K) {
            java.util.List list = this.g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                defpackage.tvo tvoVar = (defpackage.tvo) list.get(i);
                if (!tvoVar.b) {
                    long j = this.n;
                    java.util.List list2 = this.h;
                    if (tvoVar.d() && !list2.isEmpty()) {
                        iH = 1;
                        break;
                    }
                    int size2 = list2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            if (z == tvoVar.f()) {
                                iH = tvoVar.h(j, arrayDeque, list2);
                                break;
                            }
                            break;
                        } else if (((defpackage.tvo) list2.get(i2)).d()) {
                            defpackage.ysr.bj(list2.size() == 1);
                        } else {
                            i2++;
                        }
                        iH = 1;
                        break;
                    }
                    int i3 = iH - 1;
                    if (i3 == 1) {
                        break;
                    }
                    if (i3 != 2) {
                        continue;
                    } else {
                        if (tvoVar.b) {
                            throw new java.lang.IllegalStateException("Gesture already active: ".concat(java.lang.String.valueOf(tvoVar.getClass().getName())));
                        }
                        boolean zC = tvoVar.c(this);
                        tvoVar.b = zC;
                        if (zC) {
                            list2.add(tvoVar);
                        }
                    }
                }
            }
        }
        if (z) {
            h();
            this.K = false;
        }
    }

    public final float a() {
        if (!l(this.l)) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        android.view.MotionEvent motionEvent = this.f;
        motionEvent.getClass();
        android.view.MotionEvent motionEvent2 = this.e;
        motionEvent2.getClass();
        if (motionEvent.getPointerCount() != motionEvent2.getPointerCount()) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        if (!this.J) {
            this.y = defpackage.a.H(defpackage.tvt.a(motionEvent2.getX(0), motionEvent2.getY(0), motionEvent2.getX(motionEvent2.getPointerCount() - 1), motionEvent2.getY(motionEvent2.getPointerCount() - 1)), defpackage.tvt.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(motionEvent.getPointerCount() - 1), motionEvent.getY(motionEvent.getPointerCount() - 1))) * 57.295776f;
            this.J = true;
        }
        return this.y;
    }

    public final float b() {
        if (!l(this.i)) {
            return 1.0f;
        }
        android.view.MotionEvent motionEvent = this.f;
        motionEvent.getClass();
        android.view.MotionEvent motionEvent2 = this.e;
        motionEvent2.getClass();
        if (motionEvent.getPointerCount() != motionEvent2.getPointerCount()) {
            return 1.0f;
        }
        float f = this.w;
        if (f != -1.0f) {
            return f;
        }
        float fHypot = this.s;
        if (fHypot == -1.0f) {
            fHypot = (float) java.lang.Math.hypot(this.q, this.r);
            this.s = fHypot;
        }
        float fHypot2 = this.t;
        if (fHypot2 == -1.0f) {
            fHypot2 = (float) java.lang.Math.hypot(this.o, this.p);
            this.t = fHypot2;
        }
        if (fHypot == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || fHypot2 == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return 1.0f;
        }
        float f2 = fHypot / fHypot2;
        this.w = f2;
        return f2;
    }

    public final float c() {
        if (!l(this.j)) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        if (!this.I) {
            this.x = (this.v - this.u) * 0.25f;
            this.I = true;
        }
        return this.x;
    }

    public final boolean d(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        defpackage.tvs tvsVar = this.R;
        if (action == 9) {
            return tvsVar.k.b(motionEvent);
        }
        if (motionEvent.getAction() != 7) {
            return false;
        }
        return tvsVar.k.c(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:190:0x038c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0148  */
    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0153  */
    /* JADX WARN: Code duplicated, block: B:72:0x0164  */
    /* JADX WARN: Code duplicated, block: B:81:0x017c  */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0174, code lost:
    
        if (r2 != 6) goto L83;
     */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvz.e(android.view.MotionEvent):void");
    }
}
