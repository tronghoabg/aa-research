package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class inn {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.CAM");
    android.os.HandlerThread A;
    android.os.Handler B;
    public boolean C;
    private java.lang.String F;
    private boolean I;
    private boolean J;
    private final boolean K;
    private boolean L;
    public final defpackage.ioh b;
    protected final defpackage.ioi c;
    public final android.content.ComponentName d;
    public volatile java.lang.String f;
    public android.os.Handler h;
    public final java.lang.String i;
    public boolean m;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public defpackage.iof s;
    public android.content.Intent t;
    public defpackage.jik u;
    public defpackage.jik v;
    public defpackage.jik w;
    public defpackage.jik x;
    public final defpackage.jkr y;
    public final com.google.android.gms.car.display.CarRegionId z;
    private int E = -1;
    private volatile java.lang.RuntimeException G = null;
    private volatile boolean H = false;
    public volatile boolean e = false;
    public boolean j = false;
    public volatile int k = -1;
    public volatile java.lang.String l = "unknown";
    public volatile int n = -1;
    public final java.util.concurrent.atomic.AtomicReference D = new java.util.concurrent.atomic.AtomicReference();
    protected final java.lang.Runnable g = new defpackage.bgf(this, 18);

    protected inn(defpackage.ioh iohVar, defpackage.ioi ioiVar, android.content.ComponentName componentName, defpackage.jkr jkrVar, com.google.android.gms.car.display.CarRegionId carRegionId) {
        this.b = iohVar;
        this.c = ioiVar;
        this.y = jkrVar;
        this.z = carRegionId;
        this.d = componentName;
        this.K = iohVar.g.m();
        this.i = e(componentName);
    }

    static java.lang.String e(android.content.ComponentName componentName) {
        java.lang.String className = componentName.getClassName();
        return className.lastIndexOf(46) < className.length() + (-1) ? className.substring(className.lastIndexOf(46) + 1) : className;
    }

    public abstract void A(com.google.android.gms.car.CarActivityLayoutParams carActivityLayoutParams, java.util.UUID uuid);

    public abstract void B(android.graphics.Rect rect);

    public boolean C() {
        return true;
    }

    public final boolean D() {
        defpackage.ill.d();
        boolean z = this.L;
        this.L = false;
        return z;
    }

    public final boolean E() {
        return this.r && !this.J;
    }

    public final boolean F() {
        return this.J || G();
    }

    public abstract boolean G();

    public final boolean H() {
        return !this.J && this.I;
    }

    public final boolean I() {
        return this.o || this.I;
    }

    protected final void K(java.lang.String str, j$.time.Duration duration) {
        if (this.K) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(614)).y("component: %s; Ignoring ANR because ANR monitoring is disabled.", this.i);
            return;
        }
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(613);
        java.lang.String str2 = this.i;
        defpackage.zke zkeVar = defpackage.zke.a;
        yqjVar.M("Handling client ANR, component: %s, anrDebugString: %s", new defpackage.zkf(zkeVar, str2), new defpackage.zkf(zkeVar, str));
        this.f = str;
        if (defpackage.acps.q()) {
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.ACTIVITY_MANAGER, defpackage.zbd.tS);
            rrvVarH.p(this.d);
            rrvVarH.o(this.f);
            if (duration != null) {
                rrvVarH.u(duration.toMillis());
            }
            defpackage.rqt.a(this.b.d).c(rrvVarH.l());
        }
        L();
        m(new java.lang.RuntimeException("ANR(" + this.f + ") in " + this.d.flattenToShortString()));
    }

    public final int a() {
        int i = this.E;
        if (i != -1) {
            return i;
        }
        try {
            this.E = this.b.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            this.E = 0;
            android.content.ComponentName componentName = this.d;
            ((defpackage.yqj) a.l().ai((char) 611)).y("Cannot find version code for package: %s", componentName.getPackageName());
        }
        return this.E;
    }

    public int b() {
        return 1;
    }

    public android.content.ComponentName c() {
        return null;
    }

    public abstract defpackage.jhl d();

    public final java.lang.String f() {
        java.lang.String str = this.F;
        if (str != null) {
            return str;
        }
        try {
            java.lang.String str2 = this.b.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 0).versionName;
            this.F = str2;
            if (str2 == null) {
                this.F = "";
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            this.F = "";
            android.content.ComponentName componentName = this.d;
            ((defpackage.yqj) a.l().ai((char) 612)).y("Cannot find version code for package: %s", componentName.getPackageName());
        }
        return this.F;
    }

    public java.lang.String g() {
        return toString();
    }

    public final void i() {
        if (this.H) {
            return;
        }
        this.H = true;
        this.b.av(this, new zxm(this.G));
    }

    public final void j(java.io.PrintWriter printWriter) {
        printWriter.print("CarActivityManager ");
        printWriter.print(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        printWriter.print(" ");
        printWriter.println(this.d);
        printWriter.print("\tclientVersion=");
        printWriter.print(this.n);
        printWriter.print(" pid=");
        printWriter.print(this.k);
        printWriter.print(" clientProcessName=");
        printWriter.println(this.l);
        defpackage.iof iofVar = this.s;
        printWriter.print("\tstartInfo=");
        printWriter.print(iofVar != null ? iofVar.toString() : "null");
        printWriter.print(" currentStartIntent=");
        printWriter.print(this.t);
        printWriter.print(" enterAnimation=");
        printWriter.print(this.u);
        printWriter.print(" resumed=");
        printWriter.println(this.I);
        k(printWriter);
    }

    public void l() {
        defpackage.ill.d();
        ((defpackage.yqj) a.l().ai(610)).y("component: %s; finishManager", this.i);
        this.J = true;
        defpackage.ioi ioiVar = this.c;
        java.util.List list = ioiVar.e;
        list.remove(this);
        if (list.isEmpty()) {
            defpackage.ioh iohVar = ioiVar.c;
            iohVar.n.remove(ioiVar.d);
        }
        this.b.t(this);
    }

    protected final void m(java.lang.RuntimeException runtimeException) {
        if (this.j) {
            ((defpackage.yqj) a.l().ai(615)).y("component: %s; We've already handled a crash, returning", this.i);
            return;
        }
        h();
        this.j = true;
        this.G = runtimeException;
        if (this.e) {
            i();
            return;
        }
        defpackage.stq stqVar = new defpackage.stq(android.os.Looper.getMainLooper(), (byte[]) null);
        this.h = stqVar;
        defpackage.rcm.c(stqVar, this.g, 1000L);
    }

    public void n() {
        if (defpackage.acvt.a.fF().j() && this.A == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread(java.lang.String.valueOf(this.i).concat("_cam_telemetry"));
            this.A = handlerThread;
            handlerThread.start();
            this.B = new defpackage.stq(this.A.getLooper(), (byte[]) null);
        }
    }

    public void s(defpackage.inn innVar) {
        this.I = false;
        this.r = false;
    }

    public abstract void t();

    public void u() {
        defpackage.ill.d();
        this.j = false;
        this.k = -1;
        this.H = false;
        this.G = null;
        this.e = false;
        this.l = "unknown";
        this.m = false;
        this.n = -1;
        this.E = -1;
        this.F = null;
        this.f = null;
        this.I = false;
        this.r = false;
        android.os.HandlerThread handlerThread = this.A;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.A = null;
        }
        this.B = null;
    }

    public final void v() {
        this.I = true;
        this.p = false;
        this.q = false;
        this.o = false;
    }

    public void w(defpackage.ioa ioaVar) {
        v();
        x(ioaVar.a);
        defpackage.jiu jiuVar = ioaVar.d;
        this.u = jiuVar.a;
        this.v = jiuVar.c;
        this.w = jiuVar.b;
        this.x = jiuVar.d;
        this.L = true;
    }

    protected final void x(defpackage.iof iofVar) {
        defpackage.ysr.bk(iofVar.c == this.t, "Trying to set startInfo with different intent than the currentStartIntent");
        this.s = iofVar;
    }

    public void y(defpackage.inn innVar) {
        this.I = false;
        this.r = false;
    }

    public final void z() {
        this.p = true;
        y(null);
    }

    public void J() {
    }

    public void L() {
    }

    protected void h() {
    }

    public void q() {
    }

    protected void k(java.io.PrintWriter printWriter) {
    }

    public void o(defpackage.ioa ioaVar) {
    }

    public void p(int i) {
    }

    public void r(android.content.res.Configuration configuration, int i) {
    }
}
