package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iya implements defpackage.ixr {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.POWER");
    public float A;
    public boolean B;
    public long C;
    public final java.lang.Object D;
    public boolean E;
    public final java.lang.Runnable F;
    public boolean G;
    private final android.os.Looper H;
    private final android.os.Handler I;
    public int b;
    public long c;
    public int d;
    public float e;
    public boolean f;
    public boolean g;
    public final android.content.Context h;
    public final defpackage.jfo i;
    public final defpackage.ixs j;
    public final java.util.concurrent.CopyOnWriteArrayList k;
    public final defpackage.ixu l;
    public final java.lang.Object m;
    public int n;
    public final android.os.HandlerThread o;
    public final android.os.Handler p;
    public final defpackage.ixz q;
    public final java.lang.Object r;
    public boolean s;
    public int t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public defpackage.ixy x;
    public boolean y;
    public final boolean z;

    public iya(android.content.Context context, defpackage.jfo jfoVar) {
        android.os.Looper mainLooper;
        java.lang.Runnable iriVar;
        defpackage.ixv ixvVar = new defpackage.ixv(context);
        this.b = -1;
        this.d = -1;
        this.e = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.f = false;
        this.g = false;
        this.k = new java.util.concurrent.CopyOnWriteArrayList();
        this.m = new java.lang.Object();
        this.n = 0;
        this.s = false;
        this.t = 0;
        this.y = false;
        this.A = 1.0f;
        this.B = false;
        this.C = 0L;
        this.E = false;
        this.G = false;
        this.h = context;
        this.i = jfoVar;
        this.l = ixvVar;
        defpackage.acsa acsaVar = defpackage.acsa.a;
        if (acsaVar.fF().s()) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("ProjectionPowerManagerThread");
            this.o = handlerThread;
            handlerThread.start();
            mainLooper = handlerThread.getLooper();
            this.H = mainLooper;
        } else {
            this.o = null;
            mainLooper = android.os.Looper.getMainLooper();
            this.H = mainLooper;
        }
        android.os.Handler handler = new android.os.Handler(mainLooper);
        this.p = handler;
        this.I = new android.os.Handler(android.os.Looper.getMainLooper());
        this.q = new defpackage.ixz(this, mainLooper);
        this.j = new defpackage.ixs(context, handler);
        int i = 1;
        boolean z = android.os.Build.VERSION.SDK_INT >= 36 && defpackage.acsa.s();
        this.z = z;
        boolean z2 = android.os.Build.VERSION.SDK_INT >= 29;
        this.u = z2;
        this.v = acsaVar.fF().r();
        this.w = android.os.Build.VERSION.SDK_INT >= 31;
        if (z2) {
            this.r = new defpackage.ock(this, i);
        } else {
            this.r = null;
        }
        if (z) {
            this.D = new android.os.PowerManager$OnThermalHeadroomChangedListener() { // from class: ixw
                public final void onThermalHeadroomChanged(float f, float f2, int i2, java.util.Map map) {
                    java.lang.Float f3 = (java.lang.Float) map.get(java.lang.Integer.valueOf((int) defpackage.acsa.l()));
                    if (f3 != null) {
                        this.a.A = f3.floatValue();
                    }
                }
            };
            iriVar = new defpackage.iqv(this, 13, null);
        } else {
            this.D = null;
            iriVar = new defpackage.iri(2);
        }
        this.F = iriVar;
    }

    public final int a() {
        int i;
        synchronized (this.m) {
            i = this.n;
        }
        return i;
    }

    public final void b(final int i, final boolean z) {
        ((defpackage.yqj) a.l().ai(1529)).E("Power state change %d %b", i, z);
        this.I.post(new java.lang.Runnable() { // from class: ixx
            @Override // java.lang.Runnable
            public final void run() {
                java.util.Iterator it = this.a.k.iterator();
                while (it.hasNext()) {
                    boolean z2 = z;
                    ((defpackage.ixt) it.next()).aI(i, z2);
                }
            }
        });
    }

    public final void c(defpackage.ixt ixtVar) {
        if (ixtVar == null) {
            return;
        }
        this.k.addIfAbsent(ixtVar);
    }

    public final void d() {
        int i;
        boolean z = false;
        if (this.u) {
            boolean z2 = this.f;
            boolean z3 = ((long) this.t) >= defpackage.acsa.a.fF().k() || this.B;
            this.f = z3;
            if (z2 != z3) {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(1539)).R("thermal throttling %s due to thermal status: %s, forecastTooHot: %s", java.lang.Boolean.valueOf(this.f), java.lang.Integer.valueOf(this.t), java.lang.Boolean.valueOf(this.B));
            }
        } else {
            float f = this.e;
            if (f >= 45.0f) {
                this.f = true;
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 1538)).y("battery temp too high, temp:%g", java.lang.Float.valueOf(this.e));
            } else if (this.f && f < 40.0f) {
                this.f = false;
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 1537)).y("battery cooled down, temp:%g", java.lang.Float.valueOf(this.e));
            }
        }
        if (this.v) {
            this.g = this.y;
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(1536)).Q("battery level low is %b, power save mode %b", this.g, this.y);
        } else {
            int i2 = this.d;
            if (i2 != -1 && i2 <= 15) {
                this.g = true;
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(1535)).w("battery level too low, level:%d", this.d);
            }
            if (this.g && this.d >= 20) {
                this.g = false;
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(1534)).w("battery level above threshold, level:%d", this.d);
            }
        }
        if (this.b == -1) {
            this.b = this.d;
            this.c = android.os.SystemClock.elapsedRealtime();
        }
        int i3 = true != this.f ? 0 : 9;
        if (this.g) {
            i3 |= 3;
        }
        synchronized (this.m) {
            int i4 = this.n;
            i = i3 | ((-65536) & i4);
            if (i != i4) {
                this.n = i;
                z = true;
            }
        }
        if (z) {
            b(i, true);
        }
    }

    public final void e(int i) {
        int i2;
        int i3;
        if (defpackage.acsa.a.fF().p()) {
            return;
        }
        defpackage.ixu ixuVar = this.l;
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        defpackage.ixv ixvVar = (defpackage.ixv) ixuVar;
        if (ixvVar.b != null && ixvVar.c == 0) {
            try {
                ((defpackage.ixv) ixuVar).b.invoke(((defpackage.ixv) ixuVar).a, java.lang.Long.valueOf(jUptimeMillis), java.lang.Integer.valueOf(i), 2);
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
                if (e.getCause() instanceof java.lang.SecurityException) {
                    ixvVar.c = -3;
                } else {
                    ixvVar.c = -2;
                }
            }
        }
        synchronized (this.m) {
            i2 = this.n;
            i3 = 65536 | i2;
            this.n = i3;
        }
        if (i2 != i3) {
            b(i3, false);
        }
        this.q.b();
    }
}
