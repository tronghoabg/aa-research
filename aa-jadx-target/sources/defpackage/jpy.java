package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class jpy extends defpackage.qvk {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.DelegatingCarSvcBase");
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);

    private final java.lang.Object b(defpackage.jpw jpwVar) throws android.os.RemoteException {
        while (true) {
            try {
                return jpwVar.call();
            } catch (android.os.DeadObjectException e) {
                if (!this.i(1)) {
                    throw e;
                }
            } catch (defpackage.jny unused) {
            }
        }
    }

    private final void c(jpx jpxVar) throws android.os.RemoteException {
        while (true) {
            try {
                jpxVar.a();
                return;
            } catch (android.os.DeadObjectException e) {
                if (!i(1)) {
                    throw e;
                }
            } catch (defpackage.jny unused) {
            }
        }
    }

    @Override // defpackage.qvl
    public final defpackage.qwn A() throws android.os.RemoteException {
        return (defpackage.qwn) b(new defpackage.jpn(this, 2));
    }

    @Override // defpackage.qvl
    public final qwt B() throws android.os.RemoteException {
        return (qwt) b(new defpackage.jpu(this, 3));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public qxh C() throws android.os.RemoteException {
        return (qxh) b(new defpackage.jph(this, 8));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final defpackage.qxq D() throws android.os.RemoteException {
        return (defpackage.qxq) b(new defpackage.jph(this, 0));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final defpackage.qxw E() throws android.os.RemoteException {
        return (defpackage.qxw) b(new defpackage.jph(this, 14));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final defpackage.qyf F() throws android.os.RemoteException {
        return (defpackage.qyf) b(new defpackage.jpu(this, 0));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final defpackage.qyl G() throws android.os.RemoteException {
        return (defpackage.qyl) b(new defpackage.jph(this, 11));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final defpackage.qyl H() throws android.os.RemoteException {
        return (defpackage.qyl) b(new defpackage.jph(this, 16));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final defpackage.qyx I() throws android.os.RemoteException {
        return (defpackage.qyx) b(new defpackage.jph(this, 20));
    }

    @Override // defpackage.qvl
    public final defpackage.qzd J() throws android.os.RemoteException {
        return (defpackage.qzd) b(new defpackage.jph(this, 15));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final defpackage.qzm K(java.lang.String str) throws android.os.RemoteException {
        return (defpackage.qzm) b(new defpackage.jpr(this, str, 0));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final defpackage.rab L() throws android.os.RemoteException {
        return (defpackage.rab) b(new defpackage.jpu(this, 4));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final defpackage.rae M() throws android.os.RemoteException {
        return (defpackage.rae) b(new defpackage.jpn(this, 0));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final defpackage.rik N() throws android.os.RemoteException {
        return (defpackage.rik) b(new defpackage.jpu(this, 1));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final defpackage.rji O() throws android.os.RemoteException {
        return (defpackage.rji) b(new defpackage.jph(this, 13));
    }

    @Override // defpackage.qvl
    public final rjx P() throws android.os.RemoteException {
        return (rjx) b(new defpackage.jpu(this, 6));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final defpackage.rki Q(com.google.android.gms.car.display.CarDisplayId carDisplayId) throws android.os.RemoteException {
        return (defpackage.rki) b(new defpackage.jpr(this, carDisplayId, 2));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final defpackage.rkw R() throws android.os.RemoteException {
        return (defpackage.rkw) b(new defpackage.jph(this, 5));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final defpackage.rlf S() throws android.os.RemoteException {
        return (defpackage.rlf) b(new defpackage.jph(this, 9));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final defpackage.rli T() throws android.os.RemoteException {
        return (defpackage.rli) b(new defpackage.jph(this, 18));
    }

    @Override // defpackage.qvl
    public final java.lang.String Y(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        return (java.lang.String) b(new defpackage.jpg(this, str, str2, 3));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final java.lang.String Z(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        return (java.lang.String) b(new defpackage.jpg(this, str, str2, 2));
    }

    protected abstract defpackage.qvl a() throws defpackage.jny;

    @Override // defpackage.qvl
    public final void aA(byte[] bArr, int i) throws android.os.RemoteException {
        c(new defpackage.jpq(this, bArr, i, 0));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void aB(com.google.android.gms.car.CarFacet carFacet) throws android.os.RemoteException {
        c(new defpackage.jpj(this, carFacet, 4));
    }

    @Override // defpackage.qvl
    public final void aC(com.google.android.gms.car.CarFrxEvent carFrxEvent) throws android.os.RemoteException {
        c(new defpackage.jpj(this, carFrxEvent, 10));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void aJ(qvo qvoVar) throws android.os.RemoteException {
        c(new defpackage.jpj(this, qvoVar, 3));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void aK(qvr qvrVar) throws android.os.RemoteException {
        c(new defpackage.jpj(this, qvrVar, 14));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void aL(qvu qvuVar) throws android.os.RemoteException {
        c(new defpackage.jpj(this, qvuVar, 15));
    }

    @Override // defpackage.qvl
    public void aM(defpackage.qxc qxcVar) throws android.os.RemoteException {
        c(new defpackage.jpj(this, qxcVar, 7));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void aN(defpackage.rqb rqbVar) throws android.os.RemoteException {
        c(new defpackage.jpj(this, rqbVar, 6));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void aO(defpackage.qzj qzjVar) throws android.os.RemoteException {
        c(new defpackage.jpj(this, qzjVar, 5));
    }

    @Override // defpackage.qvl
    public final void aR(final java.lang.String str, final boolean z) throws android.os.RemoteException {
        c(new jpx() { // from class: jpm
            public final void a() throws android.os.RemoteException {
                this.a.m().aR(str, z);
            }
        });
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void aS(com.google.android.gms.car.CarInfo carInfo, java.lang.String str) throws android.os.RemoteException {
        c(new defpackage.jpk(this, (java.lang.Object) carInfo, (java.lang.Object) str, 1));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void aT(boolean z) throws android.os.RemoteException {
        c(new jps(this, z, 0));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void aU(java.lang.String str, int i) throws android.os.RemoteException {
        c(new defpackage.jpq(this, str, i, 1));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void aV(com.google.android.gms.car.MediaOptions mediaOptions) throws android.os.RemoteException {
        c(new defpackage.jpj(this, mediaOptions, 0));
    }

    @Override // defpackage.qvl
    public final void aW(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        c(new defpackage.jpk(this, str, str2, 4));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void aX(java.lang.String str, java.util.List list) throws android.os.RemoteException {
        c(new defpackage.jpk(this, str, list, 6));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void aY(boolean z) throws android.os.RemoteException {
        c(new jps(this, z, 1));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void aZ(boolean z) throws android.os.RemoteException {
        c(new jps(this, z, 2));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final java.util.List aa() throws android.os.RemoteException {
        return (java.util.List) b(new defpackage.jpn(this, 1));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final java.util.List ab(int i) throws android.os.RemoteException {
        return (java.util.List) b(new jpt(this, i));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final java.util.List ac() throws android.os.RemoteException {
        return (java.util.List) b(new defpackage.jph(this, 3));
    }

    @Override // defpackage.qvl
    public final java.util.List ad(java.lang.String str, java.util.List list) throws android.os.RemoteException {
        return (java.util.List) b(new defpackage.jpg(this, str, list, 4));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final java.util.List ae(android.content.Intent intent, int i) throws android.os.RemoteException {
        return (java.util.List) b(new defpackage.jpp(this, intent, i, 2));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final java.util.List af(android.content.Intent intent, int i) throws android.os.RemoteException {
        return (java.util.List) b(new defpackage.jpp(this, intent, i, 7));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final java.util.List ag(android.content.Intent intent, int i) throws android.os.RemoteException {
        return (java.util.List) b(new defpackage.jpp(this, intent, i, 4));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final java.util.List ah(android.content.Intent intent, int i) throws android.os.RemoteException {
        return (java.util.List) b(new defpackage.jpp(this, intent, i, 5));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final java.util.List ai(android.content.Intent intent) throws android.os.RemoteException {
        return (java.util.List) b(new defpackage.jpr(this, intent, 3));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void ap(com.google.android.gms.car.display.CarDisplayId carDisplayId, com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) throws android.os.RemoteException {
        c(new defpackage.jpk(this, (com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable) carDisplayId, (java.lang.Object) projectionWindowAnimationChoreography, 3));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void aq(qwz qwzVar) throws android.os.RemoteException {
        c(new defpackage.jpj(this, qwzVar, 16));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void ar(com.google.android.gms.car.display.CarDisplayId carDisplayId, qwz qwzVar) throws android.os.RemoteException {
        c(new defpackage.jpk(this, (com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable) carDisplayId, (java.lang.Object) qwzVar, 0));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void as(com.google.android.gms.car.display.CarRegionId carRegionId, qwz qwzVar) throws android.os.RemoteException {
        c(new defpackage.jpk(this, (com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable) carRegionId, (java.lang.Object) qwzVar, 2));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void av() throws android.os.RemoteException {
        c(new defpackage.jpl(this, 0));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void aw(com.google.android.gms.car.CarInfo carInfo) throws android.os.RemoteException {
        c(new defpackage.jpj(this, carInfo, 8));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final boolean bA(android.content.Intent intent, android.os.Bundle bundle) throws android.os.RemoteException {
        return ((java.lang.Boolean) b(new defpackage.jpg(this, intent, bundle, 0))).booleanValue();
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final byte[] bB() throws android.os.RemoteException {
        return (byte[]) b(new defpackage.jph(this, 12));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final qxm bC() throws android.os.RemoteException {
        return (qxm) b(new defpackage.jph(this, 6));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void bb(com.google.android.gms.car.display.CarRegionId carRegionId) throws android.os.RemoteException {
        c(new defpackage.jpj(this, carRegionId, 2));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void bd(qvo qvoVar) throws android.os.RemoteException {
        c(new defpackage.jpj(this, qvoVar, 17));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void be(qvr qvrVar) throws android.os.RemoteException {
        c(new defpackage.jpj(this, qvrVar, 1));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void bf() throws android.os.RemoteException {
        c(new defpackage.jpl(this, 1));
    }

    @Override // defpackage.qvl
    public void bg(defpackage.qxc qxcVar) throws android.os.RemoteException {
        c(new defpackage.jpj(this, qxcVar, 13));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void bh(defpackage.rqb rqbVar) throws android.os.RemoteException {
        c(new defpackage.jpj(this, rqbVar, 12));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void bi(defpackage.qzj qzjVar) throws android.os.RemoteException {
        c(new defpackage.jpj(this, qzjVar, 9));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void bj(com.google.android.gms.car.lifecycle.CarActivityLayoutConfig carActivityLayoutConfig) throws android.os.RemoteException {
        c(new defpackage.jpj(this, carActivityLayoutConfig, 11));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final void bl(com.google.android.gms.car.display.CarRegionId carRegionId, android.graphics.Rect rect) throws android.os.RemoteException {
        c(new defpackage.jpk(this, carRegionId, rect, 5));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final boolean bo() throws android.os.RemoteException {
        return ((java.lang.Boolean) b(new defpackage.jpu(this, 5))).booleanValue();
    }

    @Override // defpackage.qvl
    public final boolean bp(java.lang.String str, boolean z) throws android.os.RemoteException {
        return ((java.lang.Boolean) b(new defpackage.jpv(this, str, z, 0))).booleanValue();
    }

    @Override // defpackage.qvl
    public final boolean bq(java.lang.String str, boolean z) throws android.os.RemoteException {
        return ((java.lang.Boolean) b(new defpackage.jpv(this, str, z, 1))).booleanValue();
    }

    @Override // defpackage.qvl, defpackage.jfe
    public boolean bs() throws android.os.RemoteException {
        return ((java.lang.Boolean) b(new defpackage.jph(this, 17))).booleanValue();
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final boolean bv(java.lang.String str, int i) throws android.os.RemoteException {
        return ((java.lang.Boolean) b(new defpackage.jpp(this, str, i, 6))).booleanValue();
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final boolean bw(java.lang.String str, int i) throws android.os.RemoteException {
        return ((java.lang.Boolean) b(new defpackage.jpp(this, str, i, 0))).booleanValue();
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final boolean bx() throws android.os.RemoteException {
        return ((java.lang.Boolean) b(new defpackage.jph(this, 1))).booleanValue();
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final boolean by(android.content.Intent intent) throws android.os.RemoteException {
        return ((java.lang.Boolean) b(new defpackage.jpr(this, intent, 1))).booleanValue();
    }

    public void d() {
        this.b.set(true);
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final double fm(java.lang.String str, double d) throws android.os.RemoteException {
        return ((java.lang.Double) b(new jpi(this, str, d))).doubleValue();
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final int fn(java.lang.String str, int i) throws android.os.RemoteException {
        return ((java.lang.Integer) b(new defpackage.jpp(this, str, i, 3))).intValue();
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final int fo() throws android.os.RemoteException {
        return ((java.lang.Integer) b(new defpackage.jpu(this, 2))).intValue();
    }

    @Override // defpackage.qvl, defpackage.jfe
    public int h() throws android.os.RemoteException {
        return ((java.lang.Integer) b(new defpackage.jph(this, 7))).intValue();
    }

    protected abstract boolean i(int i);

    @Override // defpackage.qvk, defpackage.qvl
    public final int k(java.lang.String str, int i) throws android.os.RemoteException {
        return ((java.lang.Integer) b(new defpackage.jpp(this, str, i, 1))).intValue();
    }

    public final defpackage.qvl m() throws defpackage.jny {
        defpackage.qvl qvlVarA = a();
        if (qvlVarA != null) {
            return qvlVarA;
        }
        if (n()) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2578)).u("Asserted presence of delegate after tearDown() called.");
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2577)).y("%s", "Delegate Car Service not present!");
        throw new java.lang.IllegalStateException("Delegate Car Service not present!");
    }

    public final boolean n() {
        return this.b.get();
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final com.google.android.gms.car.AnalyticsSessionInfo r() throws android.os.RemoteException {
        return (com.google.android.gms.car.AnalyticsSessionInfo) b(new defpackage.jph(this, 2));
    }

    @Override // defpackage.qvl
    public final com.google.android.gms.car.CarInfo s() throws android.os.RemoteException {
        return (com.google.android.gms.car.CarInfo) b(new defpackage.jph(this, 4));
    }

    @Override // defpackage.qvk, defpackage.qvl
    public final com.google.android.gms.car.CarUiInfo u() throws android.os.RemoteException {
        return (com.google.android.gms.car.CarUiInfo) b(new defpackage.jph(this, 19));
    }

    @Override // defpackage.qvl
    public final qvc w(com.google.android.gms.car.CreateAudioPolicyRequest createAudioPolicyRequest, quz quzVar, qvf qvfVar) throws android.os.RemoteException {
        return (qvc) b(new jpo(this, createAudioPolicyRequest, quzVar, qvfVar));
    }

    @Override // defpackage.qvl
    public final qvi x(com.google.android.gms.car.CreateAudioRecordRequest createAudioRecordRequest, quz quzVar) throws android.os.RemoteException {
        return (qvi) b(new defpackage.jpg(this, createAudioRecordRequest, quzVar, 1));
    }

    @Override // defpackage.qvl
    public final defpackage.qvx z() throws android.os.RemoteException {
        return (defpackage.qvx) b(new defpackage.jph(this, 10));
    }
}
