package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class oml {
    public static defpackage.oml a;

    public oml() {
    }

    public static boolean A(defpackage.qsh qshVar, java.lang.String str, int i) throws defpackage.qst {
        return qshVar.a().q(str, i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [afak, java.lang.Object] */
    public static void B(defpackage.qsh qshVar, com.google.android.gms.car.display.CarDisplayId carDisplayId, rdb rdbVar) throws defpackage.qst {
        defpackage.ret retVarL = ((defpackage.qtv) qshVar).d().L(carDisplayId);
        ((defpackage.rps) retVarL.f.a()).g(new defpackage.rdp(retVarL, rdbVar, 7));
    }

    public static void C(defpackage.qsh qshVar, java.lang.String str, boolean z) throws defpackage.qst {
        qshVar.a().n(str, z);
    }

    public static void D(defpackage.qsh qshVar, java.lang.String str, java.lang.String str2) throws defpackage.qst {
        qshVar.a().o(str, str2);
    }

    public static void E(defpackage.qsh qshVar, com.google.android.gms.car.display.CarRegionId carRegionId) throws defpackage.qst {
        defpackage.rei reiVarD = ((defpackage.qtv) qshVar).d();
        reiVarD.f.g(new defpackage.rdp(reiVarD, carRegionId, 4, null));
    }

    public static void F(defpackage.qsh qshVar, com.google.android.gms.car.display.CarDisplayId carDisplayId, rdb rdbVar) throws defpackage.qst {
        defpackage.ret retVarL = ((defpackage.qtv) qshVar).d().L(carDisplayId);
        ((defpackage.lam) retVarL.d).F(new defpackage.rdn(rdbVar, 5));
    }

    public static void G(java.lang.IllegalStateException illegalStateException) throws defpackage.qst {
        try {
            H(illegalStateException);
            throw illegalStateException;
        } catch (defpackage.qsu unused) {
            throw illegalStateException;
        }
    }

    public static void H(java.lang.IllegalStateException illegalStateException) throws defpackage.qsu, defpackage.qst {
        java.lang.String message = illegalStateException.getMessage();
        if (message == null) {
            throw illegalStateException;
        }
        int iHashCode = message.hashCode();
        if (iHashCode == 191842363) {
            if (!message.equals("OutOfCarLifecycle")) {
                throw illegalStateException;
            }
            if (defpackage.rrx.e("CAR.CLIENT", 2)) {
                defpackage.rrx.d(2, "CAR.CLIENT", illegalStateException, "IllegalStateException from car service: %s", illegalStateException.getMessage());
            }
            throw new defpackage.rlq(illegalStateException);
        }
        if (iHashCode == 1028412234) {
            if (!message.equals("CarNotConnected")) {
                throw illegalStateException;
            }
            if (defpackage.rrx.e("CAR.CLIENT", 2)) {
                defpackage.rrx.d(2, "CAR.CLIENT", illegalStateException, "IllegalStateException from car service: %s", illegalStateException.getMessage());
            }
            throw new defpackage.qst(illegalStateException);
        }
        if (iHashCode != 1587819759 || !message.equals("CarNotSupported")) {
            throw illegalStateException;
        }
        if (defpackage.rrx.e("CAR.CLIENT", 2)) {
            defpackage.rrx.d(2, "CAR.CLIENT", illegalStateException, "IllegalStateException from car service: %s", illegalStateException.getMessage());
        }
        throw new defpackage.qsu(illegalStateException);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public static void I(android.os.RemoteException remoteException) throws rlo {
        if (defpackage.rrx.e("CAR.CLIENT", 2)) {
            defpackage.rrx.d(2, "CAR.CLIENT", remoteException, "RemoteException from car service: %s", remoteException.getMessage());
        }
        throw new rlo(remoteException);
    }

    public static final defpackage.yhx K(defpackage.yhx yhxVar) {
        java.util.HashSet hashSet = new java.util.HashSet(yhxVar);
        hashSet.remove(32772);
        return defpackage.yhx.n(hashSet);
    }

    public static boolean L(java.util.concurrent.Future future) {
        if (!future.isDone() || future.isCancelled()) {
            return false;
        }
        try {
            defpackage.ysr.bn(future.isDone(), "Future was expected to be done: %s", future);
            defpackage.a.K(future);
            return true;
        } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException unused) {
            return false;
        }
    }

    public static defpackage.oml M(defpackage.rsi rsiVar) {
        int iOrdinal = rsiVar.ordinal();
        if (iOrdinal == 2) {
            if (defpackage.rmp.b == null) {
                defpackage.rmp.b = new defpackage.rmp();
            }
            return defpackage.rmp.b;
        }
        if (iOrdinal == 3) {
            return defpackage.rmm.N(defpackage.rsi.AUDIO_SINK_GUIDANCE);
        }
        if (iOrdinal == 5) {
            return defpackage.rmm.N(defpackage.rsi.AUDIO_SINK_MEDIA);
        }
        defpackage.oml omlVar = a;
        if (omlVar != null) {
            return omlVar;
        }
        defpackage.oml omlVar2 = new defpackage.oml(null);
        a = omlVar2;
        return omlVar2;
    }

    public static void a(android.view.View view, java.util.function.Consumer consumer) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ooj(view, consumer));
    }

    public static void b(android.view.View view, java.util.function.Function function) {
        view.getViewTreeObserver().addOnPreDrawListener(new ooi(view, function));
    }

    public static void c(android.view.Window window, android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            defpackage.ebo.d(window, false);
            window.setNavigationBarColor(0);
            if (view != null) {
                d(view);
            }
        }
    }

    public static void d(android.view.View view) {
        ooh oohVar = new ooh(view.getPaddingBottom());
        int[] iArr = defpackage.ebt.a;
        defpackage.ebl.e(view, oohVar);
    }

    public static void e(android.view.View view, int i) {
        android.view.View view2 = (android.view.View) view.getParent();
        view2.post(new oc(view, i, view2, 10, (byte[]) null));
    }

    public static void f(defpackage.qsh qshVar, com.google.android.gms.car.display.CarDisplayId carDisplayId, com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) throws defpackage.qst {
        defpackage.rei reiVarD = ((defpackage.qtv) qshVar).d();
        if (!reiVarD.p(defpackage.rbf.F)) {
            throw new java.lang.IllegalStateException("This API can only be used if coolwalk is enabled");
        }
        reiVarD.f.g(new defpackage.rdv(reiVarD, carDisplayId, projectionWindowAnimationChoreography, 2));
    }

    @java.lang.Deprecated
    public static defpackage.zhs g(defpackage.qsh qshVar) throws defpackage.qst {
        defpackage.rei reiVarD = ((defpackage.qtv) qshVar).d();
        return (defpackage.zhs) reiVarD.f.b(new defpackage.rdg(reiVarD, 3));
    }

    public static boolean h(defpackage.qsh qshVar, java.lang.String str) throws defpackage.qst {
        return qshVar.a().N(str);
    }

    public static defpackage.ros i(defpackage.qsh qshVar) throws defpackage.qsu, defpackage.qst {
        return qshVar.a().r();
    }

    public static defpackage.rov j(defpackage.qsh qshVar) throws defpackage.qsu, defpackage.qst {
        return qshVar.a().s();
    }

    public static defpackage.qsb k(defpackage.qsh qshVar) throws defpackage.qsu, defpackage.qst {
        return qshVar.a().b();
    }

    public static defpackage.rjf l(defpackage.qsh qshVar) throws defpackage.qsu, defpackage.qst {
        return qshVar.a().e();
    }

    public static defpackage.rkc m(defpackage.qsh qshVar) {
        defpackage.rei reiVarD = ((defpackage.qtv) qshVar).d();
        return (defpackage.rkc) reiVarD.f.c(new defpackage.rdg(reiVarD, 19));
    }

    public static rko n(defpackage.qsh qshVar) throws defpackage.qsu, defpackage.qst {
        defpackage.rei reiVarD = ((defpackage.qtv) qshVar).d();
        return (rko) reiVarD.f.a(new defpackage.res(reiVarD, 1));
    }

    public static defpackage.row o(defpackage.qsh qshVar, com.google.android.gms.car.display.CarDisplayId carDisplayId) throws defpackage.qsu, defpackage.qst {
        return qshVar.a().t(carDisplayId);
    }

    public static defpackage.rkp p(defpackage.qsh qshVar) throws defpackage.qsu, defpackage.qst {
        return ((defpackage.qtv) qshVar).d().f();
    }

    public static defpackage.rkq q(defpackage.qsh qshVar) throws defpackage.qsu, defpackage.qst {
        return ((defpackage.qtv) qshVar).d().g();
    }

    public static rif r(defpackage.qsh qshVar) throws defpackage.qsu, defpackage.qst {
        defpackage.rei reiVarD = ((defpackage.qtv) qshVar).d();
        return (rif) reiVarD.f.a(new defpackage.rdg(reiVarD, 15));
    }

    public static defpackage.roz s(defpackage.qsh qshVar) throws defpackage.qst {
        return qshVar.a().w();
    }

    public static qsv t(defpackage.qsh qshVar) throws defpackage.qsu, defpackage.qst {
        return qshVar.a().d();
    }

    @java.lang.Deprecated
    public static defpackage.sax u(defpackage.qsh qshVar) throws defpackage.qsu, defpackage.qst {
        return ((defpackage.qtv) qshVar).d().h(com.google.android.gms.car.display.CarDisplayId.a);
    }

    public static defpackage.sax v(defpackage.qsh qshVar, com.google.android.gms.car.display.CarDisplayId carDisplayId) throws defpackage.qsu, defpackage.qst {
        return qshVar.a().h(carDisplayId);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [afak, java.lang.Object] */
    public static com.google.android.gms.car.display.CarDisplayUiFeatures w(defpackage.qsh qshVar, com.google.android.gms.car.display.CarDisplayId carDisplayId) throws defpackage.qst {
        defpackage.ret retVarL = ((defpackage.qtv) qshVar).d().L(carDisplayId);
        return (com.google.android.gms.car.display.CarDisplayUiFeatures) ((defpackage.rps) retVarL.f.a()).b(new defpackage.res(retVarL, 2));
    }

    public static rkn x(defpackage.qsh qshVar, com.google.android.gms.car.display.CarDisplayId carDisplayId) throws defpackage.qsu, defpackage.qst {
        defpackage.rei reiVarD = ((defpackage.qtv) qshVar).d();
        return (rkn) reiVarD.f.a(new defpackage.rdt(reiVarD, carDisplayId, 0));
    }

    public static java.lang.String y(defpackage.qsh qshVar, java.lang.String str, java.lang.String str2) throws defpackage.qst {
        return qshVar.a().D(str, str2);
    }

    public static boolean z(defpackage.qsh qshVar, defpackage.rbf rbfVar) {
        return qshVar.a().p(rbfVar);
    }

    public defpackage.yhx J(defpackage.rmo rmoVar) {
        return new defpackage.ynu(32772);
    }

    public oml(char[] cArr) {
    }
}
