package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.car.CarActivityLayoutParams;
import com.google.android.gms.car.display.CarRegionId;
import j$.time.Duration;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class ing {
    public static final yph a = yph.c("CAR.CAM");
    HandlerThread A;
    Handler B;
    public boolean C;
    private String F;
    private boolean I;
    private boolean J;
    private final boolean K;
    private boolean L;
    public final iob b;
    protected final ioc c;
    public final ComponentName d;
    public volatile String f;
    public Handler h;
    public final String i;
    public boolean m;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public inz s;
    public Intent t;
    public jid u;
    public jid v;
    public jid w;
    public jid x;
    public final jkk y;
    public final CarRegionId z;
    private int E = -1;
    private volatile RuntimeException G = null;
    private volatile boolean H = false;
    public volatile boolean e = false;
    public boolean j = false;
    public volatile int k = -1;
    public volatile String l = "unknown";
    public volatile int n = -1;
    public final AtomicReference D = new AtomicReference();
    protected final Runnable g = new imt(this, 3, null);

    protected ing(iob iobVar, ioc iocVar, ComponentName componentName, jkk jkkVar, CarRegionId carRegionId) {
        this.b = iobVar;
        this.c = iocVar;
        this.y = jkkVar;
        this.z = carRegionId;
        this.d = componentName;
        this.K = iobVar.g.m();
        this.i = e(componentName);
    }

    static String e(ComponentName componentName) {
        String className = componentName.getClassName();
        return className.lastIndexOf(46) < className.length() + (-1) ? className.substring(className.lastIndexOf(46) + 1) : className;
    }

    public abstract void A(CarActivityLayoutParams carActivityLayoutParams, UUID uuid);

    public abstract void B(Rect rect);

    public boolean C() {
        return true;
    }

    public final boolean D() {
        ilb.d();
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

    protected final void K(String str, Duration duration) {
        if (this.K) {
            ((ype) ((ype) a.h()).ai(614)).y("component: %s; Ignoring ANR because ANR monitoring is disabled.", this.i);
            return;
        }
        ype ypeVar = (ype) ((ype) a.f()).ai(613);
        String str2 = this.i;
        zjc zjcVar = zjc.a;
        ypeVar.M("Handling client ANR, component: %s, anrDebugString: %s", new zjd(zjcVar, str2), new zjd(zjcVar, str));
        this.f = str;
        if (acoq.q()) {
            rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzz.ACTIVITY_MANAGER, yzy.tO);
            rrbVarH.p(this.d);
            rrbVarH.o(this.f);
            if (duration != null) {
                rrbVarH.u(duration.toMillis());
            }
            rpz.a(this.b.d).c(rrbVarH.l());
        }
        L();
        m(new RuntimeException("ANR(" + this.f + ") in " + this.d.flattenToShortString()));
    }

    public final int a() {
        int i = this.E;
        if (i != -1) {
            return i;
        }
        try {
            this.E = this.b.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            this.E = 0;
            ComponentName componentName = this.d;
            ((ype) a.l().ai((char) 611)).y("Cannot find version code for package: %s", componentName.getPackageName());
        }
        return this.E;
    }

    public int b() {
        return 1;
    }

    public ComponentName c() {
        return null;
    }

    public abstract jhf d();

    public final String f() {
        String str = this.F;
        if (str != null) {
            return str;
        }
        try {
            String str2 = this.b.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 0).versionName;
            this.F = str2;
            if (str2 == null) {
                this.F = "";
            }
        } catch (PackageManager.NameNotFoundException unused) {
            this.F = "";
            ComponentName componentName = this.d;
            ((ype) a.l().ai((char) 612)).y("Cannot find version code for package: %s", componentName.getPackageName());
        }
        return this.F;
    }

    public String g() {
        return toString();
    }

    public final void i() {
        if (this.H) {
            return;
        }
        this.H = true;
        this.b.av(this, new zwj(this.G));
    }

    public final void j(PrintWriter printWriter) {
        printWriter.print("CarActivityManager ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.print(" ");
        printWriter.println(this.d);
        printWriter.print("\tclientVersion=");
        printWriter.print(this.n);
        printWriter.print(" pid=");
        printWriter.print(this.k);
        printWriter.print(" clientProcessName=");
        printWriter.println(this.l);
        inz inzVar = this.s;
        printWriter.print("\tstartInfo=");
        printWriter.print(inzVar != null ? inzVar.toString() : "null");
        printWriter.print(" currentStartIntent=");
        printWriter.print(this.t);
        printWriter.print(" enterAnimation=");
        printWriter.print(this.u);
        printWriter.print(" resumed=");
        printWriter.println(this.I);
        k(printWriter);
    }

    public void l() {
        ilb.d();
        ((ype) a.l().ai(610)).y("component: %s; finishManager", this.i);
        this.J = true;
        ioc iocVar = this.c;
        List list = iocVar.e;
        list.remove(this);
        if (list.isEmpty()) {
            iob iobVar = iocVar.c;
            iobVar.n.remove(iocVar.d);
        }
        this.b.t(this);
    }

    protected final void m(RuntimeException runtimeException) {
        if (this.j) {
            ((ype) a.l().ai(615)).y("component: %s; We've already handled a crash, returning", this.i);
            return;
        }
        h();
        this.j = true;
        this.G = runtimeException;
        if (this.e) {
            i();
            return;
        }
        sss sssVar = new sss(Looper.getMainLooper(), (byte[]) null);
        this.h = sssVar;
        rbr.c(sssVar, this.g, 1000L);
    }

    public void n() {
        if (acur.a.gu().k() && this.A == null) {
            HandlerThread handlerThread = new HandlerThread(String.valueOf(this.i).concat("_cam_telemetry"));
            this.A = handlerThread;
            handlerThread.start();
            this.B = new sss(this.A.getLooper(), (byte[]) null);
        }
    }

    public void s(ing ingVar) {
        this.I = false;
        this.r = false;
    }

    public abstract void t();

    public void u() {
        ilb.d();
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
        HandlerThread handlerThread = this.A;
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

    public void w(inu inuVar) {
        v();
        x(inuVar.a);
        jin jinVar = inuVar.d;
        this.u = jinVar.a;
        this.v = jinVar.c;
        this.w = jinVar.b;
        this.x = jinVar.d;
        this.L = true;
    }

    protected final void x(inz inzVar) {
        woy.aa(inzVar.c == this.t, "Trying to set startInfo with different intent than the currentStartIntent");
        this.s = inzVar;
    }

    public void y(ing ingVar) {
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

    protected void k(PrintWriter printWriter) {
    }

    public void o(inu inuVar) {
    }

    public void p(int i) {
    }

    public void r(Configuration configuration, int i) {
    }
}
