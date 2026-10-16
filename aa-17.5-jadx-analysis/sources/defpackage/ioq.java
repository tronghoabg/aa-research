package defpackage;

import android.app.ActivityOptions;
import android.companion.virtual.VirtualDeviceManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.car.CarActivityLayoutParams;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarRegionId;
import java.io.PrintWriter;
import java.util.UUID;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public final class ioq extends ing {
    public static final yph E = yph.c("CAR.CAM.NATIVE");
    public static final inf F = new iok();
    public final ipn G;
    public final tel H;
    public qtu I;
    public boolean J;
    public final ygr K;
    public final AudioManager L;
    public int M;
    public Configuration N;
    public Configuration O;
    public final ServiceConnection P;
    public final VirtualDeviceManager.IntentInterceptorCallback Q;
    private final Intent R;
    private final irb S;
    private boolean T;
    private jhf U;

    public ioq(iob iobVar, ioc iocVar, jkk jkkVar, inz inzVar) {
        CarRegionId carRegionId = inzVar.i;
        Intent intent = inzVar.c;
        ComponentName componentName = inzVar.a;
        CarRegionId carRegionId2 = inzVar.i;
        ipn ipnVar = new ipn(jkkVar, carRegionId2, inzVar.h, inzVar.j, inzVar.k, inzVar.n, iobVar.k(carRegionId2), inzVar.a, iobVar.m(inzVar.i), inzVar.m, inzVar.l);
        irb irbVar = iobVar.m;
        super(iobVar, iocVar, componentName, jkkVar, carRegionId);
        this.M = -1;
        this.P = new lbg(this, 1);
        this.Q = new ipc(this, 1);
        ilb.d();
        this.L = (AudioManager) iobVar.d.getSystemService("audio");
        this.G = ipnVar;
        this.S = irbVar;
        tei teiVar = new tei(2, zfq.a, Level.FINE, E);
        iop iopVar = iop.a;
        teh tehVar = new teh(iopVar, teiVar);
        iop iopVar2 = iop.b;
        tehVar.b(iopVar, iopVar2);
        iop iopVar3 = iop.c;
        tehVar.b(iopVar2, iopVar3);
        tehVar.b(iopVar3, iopVar2);
        tehVar.b(iopVar2, iopVar);
        iop iopVar4 = iop.d;
        tehVar.b(iopVar, iopVar4);
        tehVar.d(iopVar, iopVar2, new ilp(this, 4));
        tehVar.d(iopVar2, iopVar3, new ilp(this, 5));
        tehVar.d(iopVar3, iopVar2, new ilp(this, 6));
        tehVar.d(iopVar2, iopVar, new ilp(this, 7));
        tehVar.d(iopVar, iopVar4, new ilp(this, 8));
        this.H = tehVar.a();
        intent.addFlags(402685952);
        this.R = intent;
        ajmd ajmdVar = new ajmd(this, null);
        ilb.d();
        ipnVar.j = ajmdVar;
        this.K = ygr.n(acpf.h().b);
    }

    public static final boolean R() {
        return !dlz.M();
    }

    private final void S(int i, Rect rect, Rect rect2, UUID uuid, ProjectionWindowDecorationParams projectionWindowDecorationParams) {
        jkc jkcVar = new jkc();
        jkcVar.n(this.z);
        jkcVar.m(i - 2);
        jkcVar.l(1);
        jkcVar.d(rect);
        jkcVar.g(rect2);
        jkcVar.b(uuid);
        jkk jkkVar = this.y;
        jkcVar.e(new iom(this, jkkVar));
        jkcVar.k(projectionWindowDecorationParams);
        this.U = jkkVar.j(jkcVar.a());
    }

    private final void T() {
        jhf jhfVar = this.U;
        if (jhfVar != null) {
            ((ina) this.y).R(jhfVar, null, null, true, true, false, null);
            this.U = null;
        }
    }

    @Override // defpackage.ing
    public final void A(CarActivityLayoutParams carActivityLayoutParams, UUID uuid) {
        ((ype) E.l().ai(872)).R("%s updateCarActivityLayoutParams(%s, %s)", this.i, carActivityLayoutParams, uuid);
        ilb.d();
        iob iobVar = this.b;
        ProjectionWindowAnimationParams projectionWindowAnimationParams = carActivityLayoutParams.i;
        CarRegionId carRegionId = this.z;
        this.x = iobVar.h(projectionWindowAnimationParams, carRegionId);
        this.v = iobVar.h(carActivityLayoutParams.h, carRegionId);
        this.G.o(carActivityLayoutParams, uuid);
        T();
        int i = carActivityLayoutParams.c;
        int i2 = carActivityLayoutParams.d;
        S(carActivityLayoutParams.e, new Rect(i, i2, carActivityLayoutParams.a + i, carActivityLayoutParams.b + i2), carActivityLayoutParams.f, uuid, carActivityLayoutParams.g);
    }

    @Override // defpackage.ing
    public final void B(Rect rect) {
        ((ype) E.l().ai(873)).M("%s updateInsets(%s)", this.i, rect);
        ilb.d();
    }

    @Override // defpackage.ing
    public final boolean G() {
        return this.J;
    }

    public final void M(Configuration configuration) {
        ((ype) E.l().ai(843)).M("%s onVideoConfigurationChangedInternal(%s)", this.i, configuration);
        if (acpf.n() && Build.VERSION.SDK_INT >= 37) {
            int i = configuration.uiMode & 48;
            Configuration configuration2 = new Configuration(configuration);
            configuration2.uiMode |= 3;
            Configuration configuration3 = this.N;
            if ((configuration3 == null || (configuration3.uiMode & 48) != i) && !this.G.t(i | 3)) {
                this.O = configuration2;
                return;
            }
            configuration = configuration2;
        }
        this.N = configuration;
    }

    public final void N(int i) {
        if (!acpf.m() || Build.VERSION.SDK_INT < 37) {
            return;
        }
        this.M = i;
        yph yphVar = E;
        ((ype) yphVar.l().ai(859)).w("NativeAppCarActivityManager.setSystemUiVisibility(%s)", i);
        qtu qtuVar = this.I;
        if (qtuVar == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 863)).u("App decor service not initialized, can't dismiss system Ui.");
            return;
        }
        try {
            CarRegionId carRegionId = this.z;
            rab rabVarG = qtuVar.g(carRegionId.h.b, carRegionId.g);
            if (rabVarG == null) {
                ((ype) ((ype) yphVar.h()).ai(862)).u("Unable to retrieve system ui service, can't dismiss system Ui.");
            } else {
                ((ype) yphVar.l().ai(860)).w("Setting system ui visibility to %s", i);
                rabVarG.f(i);
            }
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) E.h()).p(e)).ai((char) 861)).u("Unable to set system ui visibility.");
        }
    }

    public final void O(int i) {
        if (this.T) {
            this.G.i();
            return;
        }
        yph yphVar = E;
        ype ypeVar = (ype) yphVar.l().ai(869);
        String str = this.i;
        ypeVar.K("%s startRootActivityIfNeeded(%s)", str, i);
        Intent intent = this.R;
        ((ype) yphVar.l().ai(868)).S("%s startActivity(intent:%s, carRegionId:%s) with launchDisplayId: %d", str, intent, this.z, Integer.valueOf(i));
        iob iobVar = this.b;
        Bundle bundle = ActivityOptions.makeBasic().setLaunchDisplayId(i).toBundle();
        Context context = iobVar.d;
        context.startActivity(intent, bundle);
        rpz rpzVarA = rpz.a(context);
        rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzz.ACTIVITY_MANAGER, yzy.LK);
        rrbVarH.p(this.d);
        rpzVarA.c(rrbVarH.l());
        rpzVarA.c(olm.e(acai.M).l());
        this.T = true;
        this.G.i();
    }

    public final void P() {
        tel telVar = this.H;
        if (telVar.b() == iop.c) {
            telVar.c(iop.b);
            telVar.c(iop.a);
        }
        if (telVar.b() == iop.b) {
            telVar.c(iop.a);
        }
        telVar.c(iop.d);
    }

    public final void Q(int i) {
        xkk xkkVar;
        irb irbVar = this.S;
        if (irbVar != null) {
            imf imfVar = irbVar.o;
            imfVar.e(i);
            yfy yfyVarL = yfy.l(3, imfVar.a == 2 ? imfVar.a(3) : imfVar.c(3), 5, imfVar.a == 2 ? imfVar.a(5) : imfVar.c(5));
            iqa[] iqaVarArr = irbVar.w;
            for (int i2 = 0; i2 < 3; i2++) {
                iqa iqaVar = iqaVarArr[i2];
                if (iqaVar != null && (xkkVar = (xkk) yfyVarL.get(Integer.valueOf(iqaVar.c))) != null) {
                    synchronized (iqaVar.v) {
                        if (iqaVar.p.get()) {
                            if (!iqaVar.B) {
                                iqp iqpVar = iqaVar.j;
                                if (iqpVar != null) {
                                    iqpVar.f(xkkVar);
                                }
                            } else if (iqaVar.l != null) {
                                iqaVar.l.f(xkkVar);
                            }
                        }
                    }
                }
            }
        } else {
            ((ype) E.l().ai((char) 874)).u("CarAudioPlaybackService is null, cannot update media mode.");
        }
        ((ina) this.y).Q.v(i);
    }

    @Override // defpackage.ing
    public final jhf d() {
        return this.G.a();
    }

    @Override // defpackage.ing
    protected final void k(PrintWriter printWriter) {
        printWriter.println("NativeAppCarActivityManager Info");
        printWriter.println("RootActivityStarted: " + this.T);
        tel telVar = this.H;
        printWriter.println("State: " + String.valueOf(telVar.b()) + " last transition " + telVar.a());
        printWriter.println(this.G);
    }

    @Override // defpackage.ing
    public final void l() {
        ((ype) E.l().ai(838)).y("%s finishManager()", this.i);
        super.l();
        ilb.d();
        T();
        P();
        this.J = false;
    }

    @Override // defpackage.ing
    public final void n() {
        super.n();
        this.G.g();
    }

    @Override // defpackage.ing
    public final void o(inu inuVar) {
        ((ype) E.l().ai(841)).M("%s newIntent(%s)", this.i, inuVar);
        ilb.d();
    }

    @Override // defpackage.ing
    public final void r(Configuration configuration, int i) {
        ilb.d();
        ((ype) E.l().ai(854)).R("%s onVideoConfigurationChanged(%s, %d)", this.i, configuration, Integer.valueOf(i));
        M(configuration);
    }

    @Override // defpackage.ing
    public final void s(ing ingVar) {
        ((ype) E.l().ai(855)).M("%s pause nextManager:%s", this.i, ingVar);
        super.s(ingVar);
        ilb.d();
        this.H.c(iop.b);
        T();
    }

    @Override // defpackage.ing
    public final void t() {
        ((ype) E.l().ai(856)).y("%s reattachWindow()", this.i);
        ilb.d();
        this.G.m();
    }

    @Override // defpackage.ing
    public final void u() {
        ((ype) E.l().ai(857)).y("%s reset()", this.i);
        super.u();
        ilb.d();
        P();
    }

    @Override // defpackage.ing
    public final void w(inu inuVar) {
        ((ype) E.l().ai(858)).M("%s resume(%s)", this.i, inuVar);
        super.w(inuVar);
        ilb.d();
        if (acpf.n()) {
            M(this.b.c(this.z.h));
        }
        tel telVar = this.H;
        if (telVar.b() == iop.a) {
            telVar.c(iop.b);
        }
        telVar.c(iop.c);
        inz inzVar = inuVar.a;
        S(inzVar.h, inzVar.j, inzVar.k, inzVar.n, this.b.k(this.z));
    }

    @Override // defpackage.ing
    public final void y(ing ingVar) {
        yph yphVar = E;
        ype ypeVar = (ype) yphVar.l().ai(870);
        String str = this.i;
        ypeVar.M("%s stop nextManager:%s", str, ingVar);
        super.y(ingVar);
        ilb.d();
        T();
        tel telVar = this.H;
        Enum enumB = telVar.b();
        iop iopVar = iop.c;
        if (enumB != iopVar && telVar.b() != iop.b) {
            ((ype) ((ype) yphVar.f()).ai(871)).R("%s stop called while in state %s, nextManager: %s", str, telVar.b(), ingVar);
            return;
        }
        if (telVar.b() == iopVar) {
            telVar.c(iop.b);
        }
        telVar.c(iop.a);
    }
}
