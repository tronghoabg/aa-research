package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.telecom.PhoneAccountHandle;
import com.google.android.gms.car.CarCall;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public final class qqe extends sla {
    static final rju a;
    private static final omc l;

    static {
        qqd qqdVar = new qqd();
        l = qqdVar;
        a = new rju("Call.API", qqdVar);
    }

    public qqe(Context context) {
        super(context, null, a, null, skz.a);
    }

    public final svz a(CarCall carCall) {
        snb snbVar = new snb();
        snbVar.a = new qpy(carCall, 6);
        snbVar.c = 11015;
        return super.u(1, snbVar.a());
    }

    public final svz b(CarCall carCall) {
        snb snbVar = new snb();
        snbVar.a = new qpy(carCall, 7);
        snbVar.c = 11017;
        return super.u(1, snbVar.a());
    }

    public final svz c() {
        snb snbVar = new snb();
        snbVar.c = 11004;
        snbVar.a = new qpz(0);
        return super.u(0, snbVar.a());
    }

    public final svz d() {
        snb snbVar = new snb();
        snbVar.c = 11001;
        snbVar.a = new qpz(4);
        return super.u(0, snbVar.a());
    }

    public final svz e() {
        snb snbVar = new snb();
        snbVar.c = 11002;
        snbVar.a = new qpz(2);
        return super.u(0, snbVar.a());
    }

    public final svz f() {
        snb snbVar = new snb();
        snbVar.c = 11003;
        snbVar.a = new qpz(3);
        return super.u(0, snbVar.a());
    }

    public final svz g(String str) {
        snb snbVar = new snb();
        snbVar.a = new qpy(str, 1);
        snbVar.c = 11025;
        return super.u(1, snbVar.a());
    }

    public final svz h(final int i) {
        snb snbVar = new snb();
        snbVar.a = new smy() { // from class: qqb
            @Override // defpackage.smy
            public final void a(Object obj, Object obj2) throws RemoteException {
                ((qvx) ((rni) obj).v()).o(i);
                ((nok) obj2).c(null);
            }
        };
        snbVar.c = 11013;
        return super.u(1, snbVar.a());
    }

    @ResultIgnorabilityUnspecified
    public final void i(CarCall carCall, CarCall carCall2) {
        snb snbVar = new snb();
        snbVar.a = new qoq(carCall, carCall2, 3, null);
        snbVar.c = 11023;
        super.u(1, snbVar.a());
    }

    @ResultIgnorabilityUnspecified
    public final void j() {
        snb snbVar = new snb();
        snbVar.a = new qpz(5);
        snbVar.c = 11026;
        super.u(1, snbVar.a());
    }

    @ResultIgnorabilityUnspecified
    public final void k(CarCall carCall) {
        snb snbVar = new snb();
        snbVar.a = new qpy(carCall, 0);
        snbVar.c = 11018;
        super.u(1, snbVar.a());
    }

    @ResultIgnorabilityUnspecified
    public final void l(CarCall carCall, PhoneAccountHandle phoneAccountHandle) {
        snb snbVar = new snb();
        snbVar.a = new qoq(carCall, phoneAccountHandle, 2);
        snbVar.c = 11027;
        super.u(1, snbVar.a());
    }

    @ResultIgnorabilityUnspecified
    public final void m(final CarCall carCall, final char c) {
        snb snbVar = new snb();
        snbVar.a = new smy() { // from class: qqa
            @Override // defpackage.smy
            public final void a(Object obj, Object obj2) throws RemoteException {
                ((qvx) ((rni) obj).v()).n(carCall, c);
                ((nok) obj2).c(null);
            }
        };
        snbVar.c = 11020;
        super.u(1, snbVar.a());
    }

    public final svz n(CarCall carCall) {
        snb snbVar = new snb();
        snbVar.a = new qpy(carCall, 2);
        snbVar.c = 11016;
        return super.u(1, snbVar.a());
    }

    @ResultIgnorabilityUnspecified
    public final void o(final boolean z) {
        snb snbVar = new snb();
        snbVar.a = new smy() { // from class: qqc
            @Override // defpackage.smy
            public final void a(Object obj, Object obj2) throws RemoteException {
                ((qvx) ((rni) obj).v()).p(z);
                ((nok) obj2).c(null);
            }
        };
        snbVar.c = 11012;
        super.u(1, snbVar.a());
    }

    @ResultIgnorabilityUnspecified
    public final void p(CarCall carCall) {
        snb snbVar = new snb();
        snbVar.a = new qpy(carCall, 8);
        snbVar.c = 11021;
        super.u(1, snbVar.a());
    }

    @ResultIgnorabilityUnspecified
    public final void q(CarCall carCall) {
        snb snbVar = new snb();
        snbVar.a = new qpy(carCall, 5);
        snbVar.c = 11019;
        super.u(1, snbVar.a());
    }
}
