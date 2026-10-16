package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.car.AnalyticsSessionInfo;
import com.google.android.gms.car.CarFacet;
import com.google.android.gms.car.CarFrxEvent;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.CreateAudioPolicyRequest;
import com.google.android.gms.car.CreateAudioRecordRequest;
import com.google.android.gms.car.MediaOptions;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.car.lifecycle.CarActivityLayoutConfig;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class jpw extends quo {
    private static final yph a = yph.c("GH.DelegatingCarSvcBase");
    private final AtomicBoolean b = new AtomicBoolean(false);

    private final Object b(jpu jpuVar) throws RemoteException {
        while (true) {
            try {
                return jpuVar.call();
            } catch (DeadObjectException e) {
                if (!this.i(1)) {
                    throw e;
                }
            } catch (jnq unused) {
            }
        }
    }

    private final void c(jpv jpvVar) throws RemoteException {
        while (true) {
            try {
                jpvVar.a();
                return;
            } catch (DeadObjectException e) {
                if (!i(1)) {
                    throw e;
                }
            } catch (jnq unused) {
            }
        }
    }

    @Override // defpackage.qup
    public final qvr A() throws RemoteException {
        return (qvr) b(new jpb(this, 5));
    }

    @Override // defpackage.qup
    public final qvx B() throws RemoteException {
        return (qvx) b(new jpr(this, 1));
    }

    @Override // defpackage.quo, defpackage.qup
    public qwl C() throws RemoteException {
        return (qwl) b(new joz(this, 7));
    }

    @Override // defpackage.quo, defpackage.qup
    public final qwu D() throws RemoteException {
        return (qwu) b(new joz(this, 0));
    }

    @Override // defpackage.quo, defpackage.qup
    public final qxa E() throws RemoteException {
        return (qxa) b(new joz(this, 13));
    }

    @Override // defpackage.quo, defpackage.qup
    public final qxj F() throws RemoteException {
        return (qxj) b(new joz(this, 19));
    }

    @Override // defpackage.quo, defpackage.qup
    public final qxp G() throws RemoteException {
        return (qxp) b(new joz(this, 10));
    }

    @Override // defpackage.quo, defpackage.qup
    public final qxp H() throws RemoteException {
        return (qxp) b(new joz(this, 14));
    }

    @Override // defpackage.quo, defpackage.qup
    public final qyb I() throws RemoteException {
        return (qyb) b(new joz(this, 17));
    }

    @Override // defpackage.qup
    public final qyh J() throws RemoteException {
        return (qyh) b(new jpb(this, 3));
    }

    @Override // defpackage.quo, defpackage.qup
    public final qyq K(String str) throws RemoteException {
        return (qyq) b(new jpl(this, str, 0));
    }

    @Override // defpackage.quo, defpackage.qup
    public final qzf L() throws RemoteException {
        return (qzf) b(new jpr(this, 0));
    }

    @Override // defpackage.quo, defpackage.qup
    public final qzi M() throws RemoteException {
        return (qzi) b(new jpb(this, 2));
    }

    @Override // defpackage.quo, defpackage.qup
    public final rho N() throws RemoteException {
        return (rho) b(new joz(this, 18));
    }

    @Override // defpackage.quo, defpackage.qup
    public final rim O() throws RemoteException {
        return (rim) b(new joz(this, 12));
    }

    @Override // defpackage.qup
    public final rjb P() throws RemoteException {
        return (rjb) b(new jpr(this, 3));
    }

    @Override // defpackage.quo, defpackage.qup
    public final rjm Q(CarDisplayId carDisplayId) throws RemoteException {
        return (rjm) b(new jpl(this, carDisplayId, 2));
    }

    @Override // defpackage.quo, defpackage.qup
    public final rka R() throws RemoteException {
        return (rka) b(new joz(this, 4));
    }

    @Override // defpackage.quo, defpackage.qup
    public final rkj S() throws RemoteException {
        return (rkj) b(new joz(this, 8));
    }

    @Override // defpackage.quo, defpackage.qup
    public final rkm T() throws RemoteException {
        return (rkm) b(new jpb(this, 4));
    }

    @Override // defpackage.qup
    public final String Y(String str, String str2) throws RemoteException {
        return (String) b(new jpt(this, str, str2, 1));
    }

    @Override // defpackage.quo, defpackage.qup
    public final String Z(String str, String str2) throws RemoteException {
        return (String) b(new joy(this, str, str2, 2));
    }

    protected abstract qup a() throws jnq;

    @Override // defpackage.qup
    public final void aA(final byte[] bArr, final int i) throws RemoteException {
        c(new jpv() { // from class: jpk
            @Override // defpackage.jpv
            public final void a() throws RemoteException {
                this.a.m().aA(bArr, i);
            }
        });
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aB(CarFacet carFacet) throws RemoteException {
        c(new jpd(this, carFacet, 3));
    }

    @Override // defpackage.qup
    public final void aC(CarFrxEvent carFrxEvent) throws RemoteException {
        c(new jpd(this, carFrxEvent, 9));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aJ(final qus qusVar) throws RemoteException {
        c(new jpv() { // from class: jpe
            @Override // defpackage.jpv
            public final void a() throws RemoteException {
                this.a.m().aJ(qusVar);
            }
        });
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aK(quv quvVar) throws RemoteException {
        c(new jpd(this, quvVar, 13));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aL(quy quyVar) throws RemoteException {
        c(new jpd(this, quyVar, 14));
    }

    @Override // defpackage.qup
    public void aM(qwg qwgVar) throws RemoteException {
        c(new jpd(this, qwgVar, 6));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aN(rpg rpgVar) throws RemoteException {
        c(new jpd(this, rpgVar, 5));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aO(qyn qynVar) throws RemoteException {
        c(new jpd(this, qynVar, 4));
    }

    @Override // defpackage.qup
    public final void aR(final String str, final boolean z) throws RemoteException {
        c(new jpv() { // from class: jpg
            @Override // defpackage.jpv
            public final void a() throws RemoteException {
                this.a.m().aR(str, z);
            }
        });
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aS(CarInfo carInfo, String str) throws RemoteException {
        c(new jpn(this, (Object) carInfo, (Object) str, 1));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aT(boolean z) throws RemoteException {
        c(new jpm(this, z, 0));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aU(final String str, final int i) throws RemoteException {
        c(new jpv() { // from class: jpc
            @Override // defpackage.jpv
            public final void a() throws RemoteException {
                this.a.m().aU(str, i);
            }
        });
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aV(MediaOptions mediaOptions) throws RemoteException {
        c(new jpd(this, mediaOptions, 0));
    }

    @Override // defpackage.qup
    public final void aW(String str, String str2) throws RemoteException {
        c(new jpp(this, str, str2, 0));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aX(String str, List list) throws RemoteException {
        c(new jpn(this, str, list, 4));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aY(boolean z) throws RemoteException {
        c(new jpm(this, z, 1));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aZ(boolean z) throws RemoteException {
        c(new jpm(this, z, 2));
    }

    @Override // defpackage.quo, defpackage.qup
    public final List aa() throws RemoteException {
        return (List) b(new jpb(this, 1));
    }

    @Override // defpackage.quo, defpackage.qup
    public final List ab(final int i) throws RemoteException {
        return (List) b(new jpu() { // from class: jpo
            @Override // defpackage.jpu, java.util.concurrent.Callable
            public final Object call() {
                return this.a.m().ab(i);
            }
        });
    }

    @Override // defpackage.quo, defpackage.qup
    public final List ac() throws RemoteException {
        return (List) b(new joz(this, 3));
    }

    @Override // defpackage.qup
    public final List ad(String str, List list) throws RemoteException {
        return (List) b(new jpt(this, str, list, 0));
    }

    @Override // defpackage.quo, defpackage.qup
    public final List ae(Intent intent, int i) throws RemoteException {
        return (List) b(new jpj(this, intent, i, 2));
    }

    @Override // defpackage.quo, defpackage.qup
    public final List af(final Intent intent, final int i) throws RemoteException {
        return (List) b(new jpu() { // from class: jps
            @Override // defpackage.jpu, java.util.concurrent.Callable
            public final Object call() throws RemoteException {
                List listAf = this.a.m().af(intent, i);
                listAf.getClass();
                return listAf;
            }
        });
    }

    @Override // defpackage.quo, defpackage.qup
    public final List ag(Intent intent, int i) throws RemoteException {
        return (List) b(new jpj(this, intent, i, 4));
    }

    @Override // defpackage.quo, defpackage.qup
    public final List ah(Intent intent, int i) throws RemoteException {
        return (List) b(new jpj(this, intent, i, 5));
    }

    @Override // defpackage.quo, defpackage.qup
    public final List ai(Intent intent) throws RemoteException {
        return (List) b(new jpl(this, intent, 3));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void ap(CarDisplayId carDisplayId, ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) throws RemoteException {
        c(new jpn(this, (AbstractSafeParcelable) carDisplayId, (Object) projectionWindowAnimationChoreography, 2));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aq(qwd qwdVar) throws RemoteException {
        c(new jpd(this, qwdVar, 15));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void ar(CarDisplayId carDisplayId, qwd qwdVar) throws RemoteException {
        c(new jpp(this, carDisplayId, qwdVar, 1));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void as(CarRegionId carRegionId, qwd qwdVar) throws RemoteException {
        c(new jpn(this, (AbstractSafeParcelable) carRegionId, (Object) qwdVar, 0));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void av() throws RemoteException {
        c(new jpf(this, 0));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void aw(CarInfo carInfo) throws RemoteException {
        c(new jpd(this, carInfo, 7));
    }

    @Override // defpackage.quo, defpackage.qup
    public final boolean bA(Intent intent, Bundle bundle) throws RemoteException {
        return ((Boolean) b(new joy(this, intent, bundle, 0))).booleanValue();
    }

    @Override // defpackage.quo, defpackage.qup
    public final byte[] bB() throws RemoteException {
        return (byte[]) b(new joz(this, 11));
    }

    @Override // defpackage.quo, defpackage.qup
    public final qwq bC() throws RemoteException {
        return (qwq) b(new joz(this, 5));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void bb(CarRegionId carRegionId) throws RemoteException {
        c(new jpd(this, carRegionId, 2));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void bd(qus qusVar) throws RemoteException {
        c(new jpd(this, qusVar, 16));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void be(quv quvVar) throws RemoteException {
        c(new jpd(this, quvVar, 1));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void bf() throws RemoteException {
        c(new jpf(this, 1));
    }

    @Override // defpackage.qup
    public void bg(qwg qwgVar) throws RemoteException {
        c(new jpd(this, qwgVar, 12));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void bh(rpg rpgVar) throws RemoteException {
        c(new jpd(this, rpgVar, 11));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void bi(qyn qynVar) throws RemoteException {
        c(new jpd(this, qynVar, 8));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void bj(CarActivityLayoutConfig carActivityLayoutConfig) throws RemoteException {
        c(new jpd(this, carActivityLayoutConfig, 10));
    }

    @Override // defpackage.quo, defpackage.qup
    public final void bl(CarRegionId carRegionId, Rect rect) throws RemoteException {
        c(new jpn(this, carRegionId, rect, 3));
    }

    @Override // defpackage.quo, defpackage.qup
    public final boolean bo() throws RemoteException {
        return ((Boolean) b(new jpr(this, 2))).booleanValue();
    }

    @Override // defpackage.qup
    public final boolean bp(final String str, final boolean z) throws RemoteException {
        return ((Boolean) b(new jpu() { // from class: jpq
            @Override // defpackage.jpu, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.a.m().bp(str, z));
            }
        })).booleanValue();
    }

    @Override // defpackage.qup
    public final boolean bq(final String str, final boolean z) throws RemoteException {
        return ((Boolean) b(new jpu() { // from class: jpi
            @Override // defpackage.jpu, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.a.m().bq(str, z));
            }
        })).booleanValue();
    }

    @Override // defpackage.qup, defpackage.jew
    public boolean bs() throws RemoteException {
        return ((Boolean) b(new joz(this, 15))).booleanValue();
    }

    @Override // defpackage.quo, defpackage.qup
    public final boolean bv(String str, int i) throws RemoteException {
        return ((Boolean) b(new jpj(this, str, i, 6))).booleanValue();
    }

    @Override // defpackage.quo, defpackage.qup
    public final boolean bw(String str, int i) throws RemoteException {
        return ((Boolean) b(new jpj(this, str, i, 0))).booleanValue();
    }

    @Override // defpackage.quo, defpackage.qup
    public final boolean bx() throws RemoteException {
        return ((Boolean) b(new joz(this, 1))).booleanValue();
    }

    @Override // defpackage.quo, defpackage.qup
    public final boolean by(Intent intent) throws RemoteException {
        return ((Boolean) b(new jpl(this, intent, 1))).booleanValue();
    }

    public void d() {
        this.b.set(true);
    }

    @Override // defpackage.quo, defpackage.qup
    public final double ge(final String str, final double d) throws RemoteException {
        return ((Double) b(new jpu() { // from class: jpa
            @Override // defpackage.jpu, java.util.concurrent.Callable
            public final Object call() {
                return Double.valueOf(this.a.m().ge(str, d));
            }
        })).doubleValue();
    }

    @Override // defpackage.quo, defpackage.qup
    public final int gf(String str, int i) throws RemoteException {
        return ((Integer) b(new jpj(this, str, i, 3))).intValue();
    }

    @Override // defpackage.quo, defpackage.qup
    public final int gg() throws RemoteException {
        return ((Integer) b(new joz(this, 20))).intValue();
    }

    @Override // defpackage.qup, defpackage.jew
    public int h() throws RemoteException {
        return ((Integer) b(new joz(this, 6))).intValue();
    }

    protected abstract boolean i(int i);

    @Override // defpackage.quo, defpackage.qup
    public final int k(String str, int i) throws RemoteException {
        return ((Integer) b(new jpj(this, str, i, 1))).intValue();
    }

    public final qup m() throws jnq {
        qup qupVarA = a();
        if (qupVarA != null) {
            return qupVarA;
        }
        if (n()) {
            ((ype) ((ype) a.h()).ai((char) 2576)).u("Asserted presence of delegate after tearDown() called.");
        }
        ((ype) ((ype) a.h()).ai((char) 2575)).y("%s", "Delegate Car Service not present!");
        throw new IllegalStateException("Delegate Car Service not present!");
    }

    protected final boolean n() {
        return this.b.get();
    }

    @Override // defpackage.quo, defpackage.qup
    public final AnalyticsSessionInfo r() throws RemoteException {
        return (AnalyticsSessionInfo) b(new joz(this, 2));
    }

    @Override // defpackage.qup
    public final CarInfo s() throws RemoteException {
        return (CarInfo) b(new jpb(this, 0));
    }

    @Override // defpackage.quo, defpackage.qup
    public final CarUiInfo u() throws RemoteException {
        return (CarUiInfo) b(new joz(this, 16));
    }

    @Override // defpackage.qup
    public final qug w(final CreateAudioPolicyRequest createAudioPolicyRequest, final qud qudVar, final quj qujVar) throws RemoteException {
        return (qug) b(new jpu() { // from class: jph
            @Override // defpackage.jpu, java.util.concurrent.Callable
            public final Object call() {
                return this.a.m().w(createAudioPolicyRequest, qudVar, qujVar);
            }
        });
    }

    @Override // defpackage.qup
    public final qum x(CreateAudioRecordRequest createAudioRecordRequest, qud qudVar) throws RemoteException {
        return (qum) b(new joy(this, createAudioRecordRequest, qudVar, 1));
    }

    @Override // defpackage.qup
    public final qvb z() throws RemoteException {
        return (qvb) b(new joz(this, 9));
    }
}
