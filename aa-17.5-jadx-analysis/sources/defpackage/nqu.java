package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes.dex */
public final class nqu extends lhf implements nqg {
    static final /* synthetic */ afia[] b = {new affh(nqu.class, "immersiveModeState", "getImmersiveModeState()Lcom/google/android/apps/auto/components/system/immersivemode/impl/ImmersiveModeControllerImpl$ImmersiveModeState;", 0)};
    public static final yph c = yph.c("GH.ImmersiveMode");
    public ComponentName d;
    public final Handler e;
    public final Runnable f;
    public owj g;
    private final eqm h;
    private final eqm i;
    private boolean k;
    private final eqn l;
    private final eqj m;
    private final qwn n;

    public nqu() {
        eqm eqmVar = new eqm(nqr.a);
        this.h = eqmVar;
        if (!(eqmVar.e() instanceof nqt)) {
            throw new IllegalStateException("MutableLiveData must be initialized to use as a delegate");
        }
        this.i = eqmVar;
        this.e = new Handler(Looper.getMainLooper());
        this.l = new kkl(this, 6);
        nna nnaVar = new nna(8);
        afco afcoVar = tby.a;
        this.m = eqy.b(eqmVar, nnaVar);
        this.n = new qwn(this);
        this.f = new iqz(3);
    }

    private final void k(nqt nqtVar) {
        b[0].getClass();
        this.i.m(nqtVar);
    }

    private static final sab l() {
        return (sab) khc.t(new wci("GH.ImmersiveMode", yzz.IMMERSIVE_MODE, yzy.Ma, "Failed to get CarWindowManager", new Object[0]), new ngv(20));
    }

    private static final boolean m(nqt nqtVar) {
        nqs nqsVar = nqtVar instanceof nqs ? (nqs) nqtVar : null;
        return nqsVar != null && nqsVar.a;
    }

    @Override // defpackage.nqg
    public final eqj a() {
        return this.m;
    }

    @Override // defpackage.nqg
    public final void b(qrn qrnVar, ComponentName componentName) {
        Integer num;
        qrnVar.getClass();
        wer.c();
        if (!this.k) {
            c.l().u("Not started, ignoring request to enter immersive mode");
            return;
        }
        if (i() instanceof nqs) {
            c.l().u("Ignoring redundant request to enter immersive mode");
            return;
        }
        yph yphVar = c;
        yphVar.l().u("Entering immersive mode");
        this.d = componentName;
        nsv nsvVarD = nsh.i().d(CarDisplayId.a);
        nso nsoVarB = nsr.c().b();
        if (nsvVarD != nsv.a || nsoVarB.F() || acpf.o()) {
            k(new nqs(false));
        } else {
            yphVar.l().u("Forcing vertical rail");
            k(new nqs(true));
            nsoVarB.O();
        }
        if (acpf.o()) {
            mki.a.g();
            if (!ols.z(qrnVar, raj.W)) {
                mpl.e().i(false);
                if (acpf.m() && (num = (Integer) lau.c().i().e()) != null && num.intValue() == 2) {
                    mpl.e().g(true);
                }
            }
            if (acpf.m() || nqj.a.a().d()) {
                sab sabVarL = l();
                if (sabVarL != null) {
                    try {
                        sabVarL.a.j(this.n);
                    } catch (RemoteException e) {
                        rrd.c("CAR.WM", e, "registerCarFrameDebugCallback RemoteException");
                    }
                } else {
                    yphVar = c;
                    ((ype) yphVar.h()).u("Registering gesture listener failed");
                }
                if (acpf.m()) {
                    if (mpl.e().k()) {
                        return;
                    }
                    yphVar.l().u("System bars are hidden upon entering immersive mode with app controlled immersive mode enabled, triggering education opportunity");
                    this.e.post(this.f);
                    return;
                }
                j();
                Handler handler = this.e;
                Runnable runnable = this.f;
                nqi nqiVar = nqj.a;
                handler.postDelayed(runnable, aisq.e(nqi.b));
            }
        }
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void c() {
        super.c();
        wer.c();
        this.k = true;
        nfy.a().b(this, new niu(this, 3));
        lau.c().i().i(this.l);
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void d() {
        super.d();
        wer.c();
        this.k = false;
        k(nqr.a);
        if (acpf.o()) {
            nqj.a.a().a(true);
        }
        lau.c().i().k(this.l);
    }

    @Override // defpackage.nqg
    public final void e(qrn qrnVar) {
        qrnVar.getClass();
        wer.c();
        if (!this.k) {
            c.l().u("Not started, ignoring request to exit immersive mode");
            return;
        }
        this.d = null;
        nqt nqtVarI = i();
        if (nqtVarI instanceof nqr) {
            c.l().u("Ignoring redundant request to exit immersive mode");
            return;
        }
        c.l().u("Exiting immersive mode");
        k(nqr.a);
        if (m(nqtVarI)) {
            nsr.c().b().O();
        }
        if (acpf.o()) {
            sab sabVarL = l();
            if (sabVarL != null) {
                try {
                    sabVarL.a.o(this.n);
                } catch (RemoteException e) {
                    rrd.c("CAR.WM", e, "unregisterCarFrameDebugCallback RemoteException");
                }
            }
            nqj.a.a().a(true);
            mpl.e().i(true);
            this.e.removeCallbacks(this.f);
            owj owjVar = this.g;
            if (owjVar != null) {
                owjVar.c();
            }
        }
    }

    @Override // defpackage.nqg
    public final void f(boolean z) {
        wer.c();
        if (!z && h() && acpf.m()) {
            c.l().u("System bars are hidden, triggering education opportunity");
            this.e.post(this.f);
        }
    }

    @Override // defpackage.nqg
    public final boolean g() {
        return m(i());
    }

    @Override // defpackage.nqg
    public final boolean h() {
        return i() instanceof nqs;
    }

    public final nqt i() {
        b[0].getClass();
        return (nqt) this.i.e();
    }

    public final void j() {
        if (i() instanceof nqr) {
            c.l().u("Ignoring call to show toolbar in disabled state");
            return;
        }
        c.l().u("Showing toolbar");
        nqj nqjVarA = nqj.a.a();
        ComponentName componentName = this.d;
        if (componentName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        nqjVarA.c(componentName);
    }
}
