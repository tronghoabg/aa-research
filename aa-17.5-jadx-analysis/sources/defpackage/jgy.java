package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Size;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.car.BlackHoleParams;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class jgy implements jgt {
    public static final yph a = yph.c("CAR.WM.CW");
    private final boolean A;
    private InputFocusChangedEvent B;
    private final AtomicBoolean C = new AtomicBoolean(false);
    private final IBinder.DeathRecipient D;
    private iph E;
    private ipf F;
    private Size G;
    private boolean H;
    private final boolean I;
    private final ntn J;
    public final String b;
    public final String c;
    public final jkk d;
    public final jgx e;
    public final jgx f;
    public CarWindowLayoutParams g;
    public jhf h;
    public boolean i;
    public jid j;
    public jid k;
    public boolean l;
    public boolean m;
    public boolean n;
    public ProjectionWindowAnimationParams o;
    public volatile int p;
    public boolean q;
    public boolean r;
    public final Handler s;
    public Runnable t;
    public final qyy u;
    private final String v;
    private final ComponentName w;
    private final qzc x;
    private final jfg y;
    private final int z;

    public jgy(String str, String str2, CarWindowLayoutParams carWindowLayoutParams, jkk jkkVar, qzc qzcVar, int i, ikz ikzVar, jfg jfgVar, ntn ntnVar, boolean z) throws RemoteException {
        rnm rnmVar = new rnm(this, 1);
        this.D = rnmVar;
        this.H = true;
        this.p = 0;
        this.s = new sss(Looper.getMainLooper(), (byte[]) null);
        this.b = str;
        this.c = str2;
        this.v = a.bJ(str, str2, ":");
        this.w = new ComponentName(str2, str);
        this.g = carWindowLayoutParams;
        this.d = jkkVar;
        this.x = qzcVar;
        qzcVar.asBinder().linkToDeath(rnmVar, 0);
        this.z = i;
        this.A = ikzVar.m();
        this.y = jfgVar;
        this.J = ntnVar;
        this.I = z;
        this.e = new jgx(this);
        this.f = new jgx(this);
        this.u = new qyy(this);
    }

    private final Rect C(jhc jhcVar) {
        Context context = ((ina) this.d).l;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View view = new View(context);
        CarWindowLayoutParams carWindowLayoutParams = this.g;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(carWindowLayoutParams.b, carWindowLayoutParams.c, carWindowLayoutParams.h);
        layoutParams.leftMargin = this.g.d;
        layoutParams.topMargin = this.g.e;
        layoutParams.rightMargin = this.g.f;
        layoutParams.bottomMargin = this.g.g;
        layoutParams.gravity = this.g.h;
        frameLayout.addView(view, layoutParams);
        int i = jhcVar.f;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        int i2 = jhcVar.g;
        frameLayout.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
        frameLayout.layout(0, 0, i, i2);
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private final void D(InputFocusChangedEvent inputFocusChangedEvent) {
        ((ype) a.l().ai(2126)).M("%s.sendInputFocusChange(event: %s)", this.b, inputFocusChangedEvent);
        try {
            int i = this.z;
            qzc qzcVar = this.x;
            if (i < 7) {
                qzcVar.h(inputFocusChangedEvent.a, !inputFocusChangedEvent.b);
            } else {
                qzcVar.g(inputFocusChangedEvent);
            }
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai(2127)).y("%s.onInputFocusChange RemoteException", this.b);
        }
    }

    public final void A() {
        ipf ipfVar;
        iph iphVar;
        ((ype) a.l().ai((char) 2137)).y("%s.tearDown", this.b);
        if (this.C.compareAndSet(false, true)) {
            this.x.asBinder().unlinkToDeath(this.D, 0);
        }
        jkk jkkVar = this.d;
        jid jidVarV = v();
        ilb.d();
        ina inaVar = (ina) jkkVar;
        synchronized (inaVar.ab) {
            ((ina) jkkVar).ac.remove(this);
            ((ina) jkkVar).ad.remove(this);
        }
        inaVar.R(this.h, null, jidVarV, true, true, false, null);
        if (Build.VERSION.SDK_INT > 35 && (iphVar = this.E) != null) {
            iphVar.j(null);
            this.E.g();
            this.E = null;
            this.G = null;
        }
        if (Build.VERSION.SDK_INT >= 37 && (ipfVar = this.F) != null) {
            ipfVar.c.h(ipfVar.f);
            ipfVar.a().b();
            this.F = null;
        }
        this.e.c();
        this.f.c();
    }

    public final void B(CarWindowLayoutParams carWindowLayoutParams) {
        yfq yfqVarB;
        ilb.d();
        this.g = carWindowLayoutParams;
        jkk jkkVar = this.d;
        jhc jhcVar = ((ina) jkkVar).w;
        jhcVar.getClass();
        Rect rectC = C(jhcVar);
        Rect rectA = carWindowLayoutParams.a();
        jhf jhfVar = this.h;
        int i = rectC.left;
        int i2 = jhcVar.g - rectC.bottom;
        int iWidth = rectC.width();
        int iHeight = rectC.height();
        CarWindowLayoutParams carWindowLayoutParams2 = this.g;
        int i3 = carWindowLayoutParams2.i;
        Rect rect = carWindowLayoutParams.q;
        int i4 = carWindowLayoutParams.z;
        int i5 = carWindowLayoutParams.A;
        jid jidVar = this.j;
        jid jidVar2 = this.k;
        int i6 = carWindowLayoutParams2.n;
        int i7 = carWindowLayoutParams2.y;
        if (this.r) {
            int i8 = yfq.d;
            yfqVarB = yls.a;
        } else {
            yfqVarB = carWindowLayoutParams.b();
        }
        CarWindowLayoutParams carWindowLayoutParams3 = this.g;
        jhfVar.m(i, i2, iWidth, iHeight, i3, rect, i4, i5, jidVar, jidVar2, i6, i7, yfqVarB, carWindowLayoutParams3.u, UUID.fromString(carWindowLayoutParams3.x), jkkVar.i(rectA));
    }

    @Override // defpackage.jgt, defpackage.jhe
    public final String a() {
        return this.v;
    }

    @Override // defpackage.jhe
    public final void b(jhf jhfVar) {
        int i;
        ilb.d();
        try {
            DrawingSpec drawingSpecAL = this.h.aL();
            if (drawingSpecAL == null) {
                ((ype) ((ype) a.h()).ai(2105)).y("%s.onWindowAttached dropped as window has been already torn down", this.b);
                return;
            }
            float f = this.g.C;
            if (f != 1.0f) {
                int i2 = (int) (drawingSpecAL.c * f);
                ((ype) ((ype) a.f()).ai(2112)).w("Using scaled DPI of %s", i2);
                drawingSpecAL.c = i2;
            }
            yph yphVar = a;
            ype ypeVar = (ype) ((ype) yphVar.f()).ai(2107);
            String str = this.b;
            ypeVar.y("%s.onWindowAttached", str);
            BlackHoleParams blackHoleParams = this.g.B;
            if (blackHoleParams == null || Build.VERSION.SDK_INT < 37) {
                ((ype) yphVar.l().ai(2108)).R("%s using local VD: %s, %s", str, blackHoleParams, Integer.valueOf(Build.VERSION.SDK_INT));
            } else {
                int i3 = drawingSpecAL.a;
                int i4 = drawingSpecAL.b;
                Size size = new Size(i3, i4);
                iph iphVar = this.E;
                if (iphVar != null) {
                    ((ype) yphVar.l().ai(2111)).M("%s reusing VDM backed VirtualDisplay. Params: %s", str, blackHoleParams);
                    Size size2 = this.G;
                    if (size2 == null || !size.equals(size2)) {
                        iphVar.i(size.getWidth(), size.getHeight(), drawingSpecAL.c);
                        this.G = size;
                    }
                    iphVar.j(drawingSpecAL.d);
                    i = i3;
                } else {
                    ((ype) yphVar.l().ai(2110)).M("%s using VDM backed VirtualDisplay. Params: %s", str, blackHoleParams);
                    this.G = size;
                    int i5 = drawingSpecAL.c;
                    Context context = ((ina) this.d).l;
                    context.getClass();
                    i = i3;
                    iph iphVar2 = new iph(i, i4, i5, 10, jme.a.a(context).f(dlz.D()), false, str, false, null);
                    iphVar2.l(1);
                    iphVar2.j(drawingSpecAL.d);
                    this.E = iphVar2;
                    ntn ntnVar = this.J;
                    context.getClass();
                    str.getClass();
                    yph yphVar2 = ipf.a;
                    ipf ipfVar = new ipf(str, iphVar2, new gzm(ntnVar, 16), new hgf(blackHoleParams, context, str, 3));
                    ipfVar.c.d(ipfVar.f, new zhb(zfq.a));
                    this.F = ipfVar;
                }
                iph iphVar3 = this.E;
                iphVar3.getClass();
                drawingSpecAL = new DrawingSpec(i, i4, drawingSpecAL.c, drawingSpecAL.d, drawingSpecAL.e, drawingSpecAL.f, iphVar3.c().getDisplayId(), drawingSpecAL.h);
            }
            int i6 = this.z;
            qzc qzcVar = this.x;
            if (i6 < 9) {
                qzcVar.n(drawingSpecAL);
            } else {
                qzcVar.m(drawingSpecAL, (Configuration) ((ina) this.d).aa.gu());
            }
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai(2106)).y("%s.onWindowAttached RemoteException", this.b);
        }
    }

    @Override // defpackage.jhe
    public final void c(jhf jhfVar, Rect rect) {
        ((ype) a.l().ai(2116)).M("%s.onWindowInsetsChanged(%s)", this.b, rect);
        ilb.d();
        try {
            this.x.i(rect);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai(2117)).y("%s.onWindowInsetsChanged RemoteException", this.b);
        }
    }

    @Override // defpackage.jhe
    public final void d(jhf jhfVar) {
        try {
            this.x.p();
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai(2119)).y("%s.onWindowDetached RemoteException", this.b);
        }
    }

    @Override // defpackage.jhe
    public final void e(jhf jhfVar, int i, int i2) {
        ((ype) ((ype) a.f()).ai(2120)).R("%s.onWindowSurfaceAvailable width: %d height: %d", this.b, Integer.valueOf(i), Integer.valueOf(i2));
        ilb.d();
        this.d.q(this.h);
    }

    @Override // defpackage.jhe
    public final void f(jhf jhfVar, KeyEvent keyEvent) {
        ilb.d();
        this.e.d(keyEvent);
        try {
            this.x.j(keyEvent);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai(2095)).M("%s.onKeyEvent(%s) RemoteException", this.b, keyEvent);
        }
    }

    @Override // defpackage.jhe
    public final void g(jhf jhfVar, MotionEvent motionEvent) {
        ilb.d();
        this.f.d(motionEvent);
        try {
            this.x.k(motionEvent);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai(2098)).M("%s.onMotionEvent(%s) RemoteException", this.b, motionEvent);
        }
    }

    @Override // defpackage.jhe
    public final void h(int i) {
        ilb.d();
        try {
            this.x.f(i);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai(2092)).y("%s.onFrameRateChange RemoteException", this.b);
        }
    }

    @Override // defpackage.jhe
    public final void i(jhf jhfVar, InputFocusChangedEvent inputFocusChangedEvent) {
        ilb.d();
        jgx jgxVar = this.e;
        if (jgxVar.e() && this.f.e()) {
            D(inputFocusChangedEvent);
            return;
        }
        ype ypeVar = (ype) a.l().ai(2093);
        String str = this.b;
        StringBuilder sb = new StringBuilder();
        jgx jgxVar2 = this.f;
        if (!jgxVar2.e()) {
            sb.append("touchQueue:\n");
            jgxVar2.b(sb);
        }
        if (!jgxVar.e()) {
            sb.append("keyQueue:\n");
            jgxVar.b(sb);
        }
        ypeVar.R("%s.onInputFocusChange(event: %s) pending\nUnhandled items:\n%s", str, inputFocusChangedEvent, sb.toString());
        this.B = inputFocusChangedEvent;
    }

    @Override // defpackage.jhe
    public final void j(jhf jhfVar) {
        ((ype) ((ype) a.g()).ai(2104)).K("%s.onWindowAttachFailed state=%d", this.b, this.h.j());
        ilb.d();
        this.y.b(rrc.h(yxy.CAR_SERVICE, yzz.PROJECTION_WINDOW_MANAGER, yzy.Js).l());
    }

    @Override // defpackage.jhe
    public final void k(jhf jhfVar) {
        if (this.z >= 7) {
            try {
                this.x.o(jhfVar.A());
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai(2114)).y("%s.onWindowAttributesChanged RemoteException", this.b);
            }
        }
    }

    @Override // defpackage.jhe
    public final void l(jhf jhfVar) {
        ilb.d();
    }

    @Override // defpackage.jhe
    public final void m(jhf jhfVar) {
        ((ype) ((ype) a.g()).ai(2121)).y("%s.onWindowSurfaceInitFailed", this.b);
        ilb.d();
    }

    @Override // defpackage.jgt
    public final jhf o() {
        return this.h;
    }

    @Override // defpackage.jgt
    public final void p(Configuration configuration, int i) {
        int i2 = this.z;
        if (i2 < 9) {
            ((ype) ((ype) a.h()).ai(2102)).K("%s.onVideoConfigurationChanged ignored, clientVersion not supported v=%d", this.b, i2);
            return;
        }
        try {
            this.x.l(configuration, i);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai(2101)).y("%s.onVideoConfigurationChanged RemoteException", this.b);
        }
    }

    @Override // defpackage.jgt
    public final boolean q() {
        jhf jhfVar = this.h;
        if (jhfVar == null) {
            return false;
        }
        if (!this.H) {
            return jhfVar.aD();
        }
        this.H = false;
        return true;
    }

    @Override // defpackage.jgt
    public final void r(jhc jhcVar) {
        jhf jhjVar;
        yfq yfqVarB;
        jgy jgyVar = this;
        if (jgyVar.I) {
            jkk jkkVar = jgyVar.d;
            CarWindowLayoutParams carWindowLayoutParams = jgyVar.g;
            jhjVar = new jhl(jkkVar, 1, jgyVar, carWindowLayoutParams.s, UUID.fromString(carWindowLayoutParams.x), jgyVar.w);
        } else {
            int i = jgyVar.g.l;
            if (i == 0) {
                jkk jkkVar2 = jgyVar.d;
                CarWindowLayoutParams carWindowLayoutParams2 = jgyVar.g;
                jhjVar = new jhb(jkkVar2, 1, jgyVar, carWindowLayoutParams2.s, UUID.fromString(carWindowLayoutParams2.x), jgyVar.w);
            } else {
                boolean z = i == 1;
                CarWindowLayoutParams carWindowLayoutParams3 = jgyVar.g;
                jhjVar = new jhj(jgyVar.d, jgyVar, z, carWindowLayoutParams3.p, carWindowLayoutParams3.s, UUID.fromString(carWindowLayoutParams3.x), jgyVar.w);
                jgyVar = jgyVar;
            }
        }
        jhf jhfVar = jhjVar;
        if (jgyVar.g.m) {
            jhfVar.J();
        }
        Rect rectC = C(jhcVar);
        ((ype) a.l().ai(2082)).M("%s window: %s", jgyVar.b, rectC);
        Rect rectA = jgyVar.g.a();
        int i2 = rectC.left;
        int i3 = jhcVar.g - rectC.bottom;
        int iWidth = rectC.width();
        int iHeight = rectC.height();
        CarWindowLayoutParams carWindowLayoutParams4 = jgyVar.g;
        int i4 = carWindowLayoutParams4.i;
        Rect rect = carWindowLayoutParams4.q;
        int i5 = carWindowLayoutParams4.z;
        int i6 = carWindowLayoutParams4.A;
        jid jidVar = jgyVar.j;
        jid jidVar2 = jgyVar.k;
        int i7 = carWindowLayoutParams4.n;
        int i8 = carWindowLayoutParams4.y;
        if (jgyVar.r) {
            int i9 = yfq.d;
            yfqVarB = yls.a;
        } else {
            yfqVarB = carWindowLayoutParams4.b();
        }
        yfq yfqVar = yfqVarB;
        CarWindowLayoutParams carWindowLayoutParams5 = jgyVar.g;
        jhfVar.ak(i2, i3, iWidth, iHeight, i4, rect, i5, i6, jidVar, jidVar2, i7, i8, yfqVar, carWindowLayoutParams5.u, UUID.fromString(carWindowLayoutParams5.x), jgyVar.d.i(rectA), jgyVar.p);
        jgyVar.h = jhfVar;
        if (jgyVar.i) {
            jhfVar.ar(true);
        }
    }

    public final int s() {
        jhf jhfVar = this.h;
        return jhfVar != null ? jhfVar.d() : this.d.a(this.g.c);
    }

    public final int t() {
        jhf jhfVar = this.h;
        return jhfVar != null ? jhfVar.k() : this.d.a(this.g.b);
    }

    public final String toString() {
        return "CarProjectionWindowImpl{name='" + this.v + ", clientVersion=" + this.z + ", params=" + String.valueOf(this.g) + ", isHidden=" + this.l + ", window=" + String.valueOf(this.h) + "}";
    }

    public final Context u(String str) {
        try {
            return ((ina) this.d).l.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai(2083)).M("%s Failed to find package %s", this.b, str);
            return null;
        }
    }

    public final jid v() {
        if (this.g.w.a <= 0) {
            return null;
        }
        jkk jkkVar = this.d;
        ina inaVar = (ina) jkkVar;
        return inaVar.Y.b(roc.aG(inaVar.l, this.c), this.g.w, t(), s());
    }

    public final void w() {
        if (this.A) {
            ((ype) ((ype) a.h()).ai(2084)).y("%s Ignoring ANR because ANR monitoring is disabled.", this.b);
        } else {
            try {
                this.x.e();
            } catch (RemoteException unused) {
            }
            A();
        }
    }

    public final void x(jid jidVar) {
        if (this.r) {
            ((ype) a.l().ai((char) 2088)).y("%s was transiently showing, cancelling transient hide during normal hide", this.b);
            this.r = false;
            this.q = false;
            Runnable runnable = this.t;
            if (runnable != null) {
                this.s.removeCallbacks(runnable);
            }
            B(this.g);
        }
        if (this.l) {
            ((ype) ((ype) a.h()).ai(2087)).y("%s already hidden, nothing to do.", this.b);
            return;
        }
        ((ype) a.l().ai(2086)).M("%s.hideWindow(%s)", this.b, jidVar);
        this.l = true;
        jkk jkkVar = this.d;
        ilb.d();
        ina inaVar = (ina) jkkVar;
        synchronized (inaVar.ab) {
            ((ina) jkkVar).ad.add(this);
            ((ina) jkkVar).ac.remove(this);
        }
        jhf jhfVar = this.h;
        inaVar.R(jhfVar, jhfVar == null ? null : jhfVar.z(), jidVar, true, false, false, null);
        this.f.c();
        this.e.c();
    }

    public final void y() {
        InputFocusChangedEvent inputFocusChangedEvent;
        if (this.e.e() && this.f.e() && (inputFocusChangedEvent = this.B) != null) {
            D(inputFocusChangedEvent);
            this.B = null;
        }
    }

    public final void z(boolean z, ProjectionWindowAnimationParams projectionWindowAnimationParams, int i) {
        if (this.r) {
            ((ype) a.l().ai((char) 2136)).y("%s was transiently showing, cancelling transient hide and restoring insets", this.b);
            this.r = false;
            this.q = false;
            Runnable runnable = this.t;
            if (runnable != null) {
                this.s.removeCallbacks(runnable);
            }
            B(this.g);
            return;
        }
        if (!this.l) {
            ((ype) ((ype) a.h()).ai(2135)).y("%s not hidden, nothing to do.", this.b);
            return;
        }
        ((ype) a.l().ai(2134)).N("%s.showWindow(%b)", this.b, z);
        this.l = false;
        this.h.getClass();
        if (this.d.aj(this, i)) {
            this.m = true;
            this.n = z;
            this.o = projectionWindowAnimationParams;
        }
    }

    @Override // defpackage.jhe
    public final void n(Rect rect) {
    }
}
