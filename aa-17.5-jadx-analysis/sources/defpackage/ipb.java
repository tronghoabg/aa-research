package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.car.CarActivityLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Optional;
import java.io.PrintWriter;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ipb extends ing {
    public static final yph E = yph.c("CAR.CAM");
    static final SparseArray F;
    public static final inf G;
    public final ipa H;
    public final Runnable I;
    public int J;
    protected int K;
    public volatile boolean L;
    public final iox M;
    public final jhf N;
    public volatile qxv O;
    boolean P;
    public Bundle Q;
    public volatile boolean R;
    public volatile boolean S;
    public boolean T;
    public volatile boolean U;
    public boolean V;
    public int W;
    public int X;
    public final Object Y;
    public final Queue Z;
    public final Queue aa;
    public InputFocusChangedEvent ab;
    public final ixt ac;
    public int ad;
    public Configuration ae;
    public final AtomicBoolean af;
    Configuration ag;
    public boolean ah;
    public boolean ai;
    public Optional aj;
    public final xyc ak;
    final jhe al;
    public final qxx am;
    private final Object an;
    private boolean ao;
    private final ServiceConnection ap;
    private final int aq;
    private final iow ar;

    static {
        SparseArray sparseArray = new SparseArray();
        F = sparseArray;
        sparseArray.put(-1, "INVALID");
        sparseArray.put(49, "LIFETIME");
        sparseArray.put(50, "LIFETIME_COMPLETE");
        sparseArray.put(0, "SETUP");
        sparseArray.put(1, "SETUP_COMPLETE");
        sparseArray.put(2, "START");
        sparseArray.put(3, "START_WINDOW_READY");
        sparseArray.put(4, "START_COMPLETE");
        sparseArray.put(5, "STOP");
        sparseArray.put(6, "STOP_COMPLETE");
        sparseArray.put(7, "RESUME");
        sparseArray.put(8, "RESUME_COMPLETE");
        sparseArray.put(9, "VIDEO_CONFIG_CHANGE");
        sparseArray.put(10, "VIDEO_CONFIG_CHANGE_COMPLETE");
        sparseArray.put(11, "PAUSE");
        sparseArray.put(12, "PAUSE_COMPLETE");
        sparseArray.put(13, "NEW_INTENT");
        sparseArray.put(14, "NEW_INTENT_COMPLETE");
        sparseArray.put(15, "PRE_FINISH");
        sparseArray.put(16, "FINISH");
        sparseArray.put(17, "ON_CRASH");
        sparseArray.put(18, "RELINQUISH_VIDEO_FOCUS");
        sparseArray.put(19, "REQUEST_VIDEO_FOCUS");
        sparseArray.put(20, "INPUT_FOCUS_CHANGE");
        sparseArray.put(21, "INPUT_FOCUS_CHANGE_COMPLETE");
        sparseArray.put(22, "START_INPUT");
        sparseArray.put(23, "STOP_INPUT");
        sparseArray.put(24, "ON_STOP_IME_INPUT");
        sparseArray.put(26, "INPUT_EVENT");
        sparseArray.put(27, "WINDOW_REATTACH");
        sparseArray.put(28, "WINDOW_REATTACH_COMPLETE");
        sparseArray.put(47, "BOUND_TO_CLIENT");
        G = new ior(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ipb(defpackage.iob r19, defpackage.ioc r20, int r21, defpackage.jkk r22, com.google.android.gms.car.display.CarRegionId r23, defpackage.inz r24, defpackage.iow r25, defpackage.xyc r26) throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipb.<init>(iob, ioc, int, jkk, com.google.android.gms.car.display.CarRegionId, inz, iow, xyc):void");
    }

    static String Q(int i) {
        return i != -1 ? i != 0 ? i != 1 ? i != 3 ? "UNKNOWN" : "S_RESUMED" : "S_STOPPED" : "S_INIT" : "S_FINISHED";
    }

    public static void V(boolean z) {
        tfk.a.d(tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_INPUT_EVENT, true != z ? 2 : 1);
    }

    private final String ad() {
        return "CarActivityManager: " + Integer.toHexString(System.identityHashCode(this)) + "\n Component: " + this.d.toShortString() + "\n State: " + Q(this.K);
    }

    private final void ae() {
        this.ac.c();
        synchronized (this.an) {
            if (!this.R) {
                ((ype) ((ype) E.f()).ai(988)).M("component: %s; not bound %s", this.i, this.ap);
                return;
            }
            ((ype) ((ype) E.f()).ai(987)).y("Unbinding from %s", this.i);
            this.R = false;
            spi.a().b(this.b.d, this.ap);
            rbr.d(this.H, this.I);
        }
    }

    @Override // defpackage.ing
    public final void A(CarActivityLayoutParams carActivityLayoutParams, UUID uuid) {
        yph yphVar;
        Configuration configurationO;
        ilb.d();
        int i = carActivityLayoutParams.c;
        int i2 = carActivityLayoutParams.d;
        Rect rect = new Rect(i, i2, carActivityLayoutParams.a + i, carActivityLayoutParams.b + i2);
        iob iobVar = this.b;
        ProjectionWindowAnimationParams projectionWindowAnimationParams = carActivityLayoutParams.i;
        CarRegionId carRegionId = this.z;
        this.x = iobVar.h(projectionWindowAnimationParams, carRegionId);
        this.v = iobVar.h(carActivityLayoutParams.h, carRegionId);
        jhf jhfVar = this.N;
        if (this.ah || this.ai) {
            yphVar = E;
            ((ype) yphVar.l().ai(989)).y("%s Resizing will happen when client starts", this.i);
        } else {
            yphVar = E;
            ((ype) yphVar.l().ai(993)).y("%s Resizing started", this.i);
            jhfVar.ap();
        }
        yph yphVar2 = yphVar;
        int iF = this.y.f(jhfVar, rect, carActivityLayoutParams.f, carActivityLayoutParams.j, carActivityLayoutParams.k, carActivityLayoutParams.e, carActivityLayoutParams.a(), uuid, carActivityLayoutParams.g) | 256;
        if (!acny.l() || this.ae == null) {
            ((ype) ((ype) yphVar2.f()).ai((char) 990)).u("updateCarActivityLayoutParams: nextVideoConfig is null, using current video config");
            configurationO = O();
        } else {
            ((ype) ((ype) yphVar2.f()).ai((char) 992)).u("updateCarActivityLayoutParams: nextVideoConfig is available, using it instead");
            configurationO = this.ae;
            Context context = iobVar.d;
            rpz rpzVarA = rpz.a(context);
            yxy yxyVar = yxy.CAR_SERVICE;
            yzz yzzVar = yzz.ACTIVITY_MANAGER;
            rpzVarA.c(rrc.h(yxyVar, yzzVar, yzy.MP).l());
            if ((this.ae.uiMode & 48) != (O().uiMode & 48)) {
                rpz.a(context).c(rrc.h(yxyVar, yzzVar, yzy.MQ).l());
            }
        }
        ((ype) ((ype) yphVar2.f()).ai((char) 991)).y("updateCarActivityLayoutParams: videoConfig=%s", configurationO);
        r(configurationO, iF);
    }

    @Override // defpackage.ing
    public final void B(Rect rect) {
        this.N.as(rect);
    }

    @Override // defpackage.ing
    public final boolean C() {
        return this.K != 0;
    }

    @Override // defpackage.ing
    public final boolean G() {
        return this.L;
    }

    @Override // defpackage.ing
    public final void J() {
        ((ype) ((ype) E.f()).ai(934)).M("component: %s; anr(anrDebugString:%s)", this.i, "Timeout connecting from CAMS");
        ipa ipaVar = this.H;
        rbe.g(ipaVar.getLooper(), new ino(ipaVar, 3));
    }

    @Override // defpackage.ing
    public final void L() {
        qxv qxvVar = Z("kill") ? this.O : null;
        if (qxvVar != null) {
            try {
                qxvVar.f();
            } catch (RemoteException unused) {
            }
        }
    }

    public final int M() {
        return P().b;
    }

    public final int N(InputFocusChangedEvent inputFocusChangedEvent) throws RemoteException {
        qxv qxvVar = this.O;
        if (qxvVar == null) {
            ((ype) ((ype) E.f()).ai(984)).y("component: %s; Service is null, ignoring sendInputFocusChange", this.i);
            return 3;
        }
        if (this.n < 4) {
            qxvVar.i(this.P);
        } else if (this.n < 7) {
            qxvVar.j(this.P, !inputFocusChangedEvent.b);
        } else {
            qxvVar.h(inputFocusChangedEvent);
        }
        return 1;
    }

    public final Configuration O() {
        S();
        return this.ag;
    }

    public final CarDisplayId P() {
        return this.z.h;
    }

    public final void R(int i, Configuration configuration) throws RemoteException {
        DrawingSpec drawingSpecAL = this.N.aL();
        ((ype) E.l().ai(953)).R("component: %s; doVideoConfigChangeInner type=%d config=%s", this.i, Integer.valueOf(i), configuration);
        this.O.x(M(), i, drawingSpecAL, configuration);
        this.ag = configuration;
        this.ae = null;
    }

    public final void S() {
        if (this.ag == null) {
            this.ag = this.b.c(P());
        }
    }

    public final void T(Rect rect) {
        if (aa("updateInsets")) {
            ilb.d();
            if (!H()) {
                ((ype) E.l().ai(963)).y("Client %s is not resumed, not dispatching insets", this.i);
                return;
            }
            try {
                this.O.w(rect);
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) E.g()).p(e)).ai((char) 962)).u("Error calling updateInsets");
            }
        }
    }

    public final void U(Rect rect, boolean z) {
        if (aa("updateNonDrawableInsets")) {
            ilb.d();
            if (this.n < 11) {
                ((ype) E.l().ai(967)).y("Client %s does not support non-drawable insets", this.i);
                return;
            }
            if (!H() && !z) {
                ((ype) E.l().ai(966)).y("Client %s is not resumed, not dispatching non-drawable insets", this.i);
                return;
            }
            ((ype) ((ype) E.f()).ai(964)).M("Successfully sending non-drawable insets of %s to %s", rect, this.i);
            try {
                this.O.n(rect);
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) E.g()).p(e)).ai((char) 965)).u("Error calling updateInsets");
            }
        }
    }

    public final void W() {
        ilb.d();
        if (this.ae != null) {
            ((ype) E.l().ai(974)).K("component: %s; onVideoConfigurationChangedComplete (pending config present: type=%d)", this.i, this.ad);
            return;
        }
        ((ype) E.l().ai(975)).y("component: %s; onVideoConfigurationChangedComplete (no pending config)", this.i);
        this.N.K();
        ipa ipaVar = this.H;
        ipaVar.sendMessage(Message.obtain(ipaVar, 48));
    }

    @ResultIgnorabilityUnspecified
    public final boolean X() {
        synchronized (this.an) {
            if (this.R) {
                ((ype) ((ype) E.f()).ai(938)).M("component: %s; already bound %s", this.i, this.ap);
                return true;
            }
            yph yphVar = E;
            ype ypeVar = (ype) ((ype) yphVar.f()).ai(935);
            String str = this.i;
            ServiceConnection serviceConnection = this.ap;
            ypeVar.M("component: %s; bindToClient() %s", str, serviceConnection);
            Context context = this.b.d;
            ixt ixtVar = this.ac;
            ComponentName componentName = this.d;
            ixtVar.d(componentName);
            int i = this.aq | 1;
            ((ype) ((ype) yphVar.f()).ai(936)).D("Using bind flags %s for %s", i, componentName);
            this.R = spi.a().e(context, "CarService", new Intent().setComponent(componentName), serviceConnection, i, false, null);
            if (this.R) {
                rbr.c(this.H, this.I, acoq.a.gu().a());
            } else {
                ((ype) ((ype) yphVar.h()).ai(937)).M("component: %s; bindService failed %s", str, serviceConnection);
            }
            return this.R;
        }
    }

    final boolean Y() {
        return (this.j || this.K == -1) ? false : true;
    }

    final boolean Z(String str) {
        if (this.R && this.S) {
            return true;
        }
        ((ype) ((ype) E.f()).ai(939)).M("component: %s; Callback not connected yet, ignoring %s", this.i, str);
        return false;
    }

    final boolean aa(String str) {
        if (this.R && this.O != null) {
            return true;
        }
        ((ype) ((ype) E.f()).ai(940)).M("component: %s; Service is null, ignoring %s", this.i, str);
        return false;
    }

    @ResultIgnorabilityUnspecified
    final boolean ab(boolean z) {
        if (!z) {
            ((ype) ((ype) E.h()).ai(947)).y("component: %s; Start complete but resume failed", this.i);
        } else {
            if (this.K == 3) {
                this.V = true;
                this.b.z(this);
                jhf jhfVar = this.N;
                if (jhfVar.g() == 1) {
                    this.y.ab(this.z, jhfVar, this.s.c.getIntExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 0));
                }
                boolean z2 = this.ao;
                this.ao = false;
                if (z2) {
                    this.H.t(this.s.c);
                }
                this.H.d(7);
                return true;
            }
            ((ype) ((ype) E.h()).ai(946)).y("component: %s; Start complete but state is not resumed", this.i);
        }
        this.b.v(this);
        return false;
    }

    @Override // defpackage.ing
    public final int b() {
        return this.N.g();
    }

    @Override // defpackage.ing
    public final ComponentName c() {
        return this.d;
    }

    @Override // defpackage.ing
    public final jhf d() {
        return this.N;
    }

    @Override // defpackage.ing
    public final String g() {
        ipa ipaVar = this.H;
        return ad() + "\n ProjectionClientMessageHandler: " + ipaVar.toString() + "\n";
    }

    @Override // defpackage.ing
    protected final void h() {
        this.O = null;
        this.S = false;
        this.P = false;
        this.N.aT();
        this.H.h();
    }

    @Override // defpackage.ing
    public final void k(PrintWriter printWriter) {
        printWriter.print("ProjectionCarActivityManager ");
        printWriter.println(Integer.toHexString(System.identityHashCode(this)));
        printWriter.print("\tState=");
        printWriter.print(Q(this.K));
        Intent intent = this.M.a;
        printWriter.print(" currentIntent=");
        printWriter.print(intent != null ? intent.toString() : null);
        printWriter.print(" hasFocus=");
        printWriter.print(this.P);
        printWriter.print(" window=");
        printWriter.println(Integer.toHexString(System.identityHashCode(this.N)));
        printWriter.print(" clientMessageHandler=");
        printWriter.println(this.H);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [ipi, java.lang.Object] */
    @Override // defpackage.ing
    public final void l() {
        super.l();
        this.H.n();
        ae();
        Optional optional = this.aj;
        if (true == optional.isPresent()) {
            optional.get().a();
        }
        this.aj = Optional.empty();
        this.K = -1;
        this.Q = null;
        this.M.a(null);
    }

    @Override // defpackage.ing
    public final void n() {
        if (this.K != 0) {
            return;
        }
        super.n();
        this.aj = this.ar.a();
        ipa ipaVar = this.H;
        ipaVar.d(0);
        ServiceConnection serviceConnection = this.ap;
        if ((serviceConnection instanceof iou) && ((iou) serviceConnection).a) {
            ipaVar.d(49);
        }
        this.K = 1;
    }

    @Override // defpackage.ing
    public final void o(inu inuVar) {
        if (inuVar.c) {
            return;
        }
        inz inzVar = inuVar.a;
        x(inzVar);
        this.H.t(inzVar.c);
    }

    @Override // defpackage.ing
    public final void p(int i) {
        if (aa("onPowerStateChange") && this.K != 0 && this.n > 1) {
            try {
                this.O.o(i);
            } catch (RemoteException e) {
                ipa ipaVar = this.H;
                RuntimeException runtimeException = new RuntimeException(e);
                int i2 = ipa.i;
                ipaVar.q(runtimeException);
            }
        }
    }

    @Override // defpackage.ing
    public final void q() {
        this.H.d(24);
    }

    @Override // defpackage.ing
    public final void r(Configuration configuration, int i) {
        yph yphVar = E;
        ype ypeVar = (ype) yphVar.l().ai(970);
        String str = this.i;
        Integer numValueOf = Integer.valueOf(i);
        ypeVar.R("component: %s; onVideoConfigurationChanged type=%d newConfig=%s", str, numValueOf, configuration);
        if (this.ae == null) {
            ((ype) yphVar.l().ai(971)).K("component: %s; Setting nextVideoConfig. Type=%d", str, i);
            this.ae = configuration;
            this.ad = i;
            this.H.d(9);
            return;
        }
        int i2 = this.ad;
        this.ad = i | i2;
        int iDiff = O().diff(configuration) | 3456;
        int i3 = this.ad & iDiff;
        this.ad = i3;
        if (i3 == 0) {
            ((ype) yphVar.l().ai(973)).S("component: %s; Clearing nextVideoConfig (merged to no-op). OldType=%d, NewType=%d, KeptMask=%d", str, Integer.valueOf(i2), numValueOf, Integer.valueOf(iDiff));
            this.ae = null;
        } else {
            ((ype) yphVar.l().ai(972)).T("component: %s; Merged into nextVideoConfig. OldType=%d, IncomingType=%d, ResultType=%d, KeptMask=%d", str, Integer.valueOf(i2), numValueOf, Integer.valueOf(this.ad), Integer.valueOf(iDiff));
            this.ae = configuration;
        }
    }

    @Override // defpackage.ing
    public final void s(ing ingVar) {
        super.s(ingVar);
        if (this.K != 3) {
            ((ype) ((ype) E.f()).ai(977)).M("Spurious pause for %s, nextManager: %s", g(), ingVar);
            return;
        }
        ipa ipaVar = this.H;
        ipaVar.d(11);
        ipaVar.r(new InputFocusChangedEvent(false, true, -1, null));
        this.K = 2;
    }

    @Override // defpackage.ing
    public final void t() {
        if (this.n < 3) {
            ((ype) ((ype) E.h()).ai((char) 980)).u("Client version too low; ignoring reattach");
            return;
        }
        jhf jhfVar = this.N;
        if (jhfVar.aD()) {
            this.U = true;
            ((ina) this.y).ak(jhfVar, 0);
        } else {
            ((ype) ((ype) E.h()).ai((char) 979)).w("reattachWindow called with window in state %d", jhfVar.j());
        }
    }

    public final String toString() {
        return acur.a.gu().n() ? ad() : g();
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [ipi, java.lang.Object] */
    @Override // defpackage.ing
    public final synchronized void u() {
        super.u();
        this.H.n();
        this.K = 0;
        this.O = null;
        this.P = false;
        ae();
        Optional optional = this.aj;
        if (true == optional.isPresent()) {
            optional.get().a();
        }
        this.aj = Optional.empty();
        this.S = false;
        this.T = false;
        this.U = false;
        this.X = -1;
        this.W = -1;
        synchronized (this.Y) {
            this.Z.clear();
            this.aa.clear();
            this.ab = null;
        }
        this.ao = false;
        if (this.ae != null) {
            ((ype) E.l().ai(981)).y("component: %s; reset() clearing nextVideoConfig", this.i);
        }
        this.ae = null;
        this.ah = false;
        this.ai = false;
    }

    @Override // defpackage.ing
    public final void w(inu inuVar) {
        inz inzVar = this.s;
        super.w(inuVar);
        int i = this.K;
        if (i == 1 || i == 2) {
            if (inzVar == null) {
                this.M.a(inuVar.a.c);
            } else {
                this.ao = (inzVar.c == inuVar.a.c || inuVar.c) ? false : true;
            }
            this.K = 3;
            this.H.d(2);
            return;
        }
        ((ype) ((ype) E.h()).ai((char) 983)).y("Spurious resume for %s", g());
        if (acny.j()) {
            iob iobVar = this.b;
            rpz.a(iobVar.d).c(rrc.h(yxy.CAR_SERVICE, yzz.ACTIVITY_MANAGER, yzy.MO).l());
            iobVar.x(this);
        }
    }

    @Override // defpackage.ing
    public final void y(ing ingVar) {
        super.y(ingVar);
        this.ai = true;
        int i = this.K;
        if (i == 3) {
            ipa ipaVar = this.H;
            ipaVar.d(11);
            ipaVar.r(new InputFocusChangedEvent(false, true, -1, null));
        } else if (i != 2) {
            ((ype) ((ype) E.f()).ai(986)).M("Spurious stop for %s, nextManager: %s", g(), ingVar);
            return;
        }
        this.H.d(5);
        this.K = 1;
    }
}
