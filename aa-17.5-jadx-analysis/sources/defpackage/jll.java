package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.carsetup.CarInfoInternal;
import java.util.List;

/* loaded from: classes2.dex */
public final class jll extends rwx {
    public final /* synthetic */ jln a;

    public jll(jln jlnVar) {
        this.a = jlnVar;
    }

    private final void l(boolean z, int i) {
        xhv xhvVarB = xhv.b(i);
        if (xhvVarB == null) {
            throw new IllegalArgumentException(a.bp(i, "Unknown ByeByeReason value: "));
        }
        jln jlnVar = this.a;
        byte[] bArr = null;
        if (z) {
            jlnVar.e.post(new jlh(this, xhvVarB, 2, bArr));
        } else {
            jlnVar.e.post(new jlh(this, xhvVarB, 3, bArr));
        }
    }

    @Override // defpackage.rwy
    public final void b(int i) {
        if (acrb.y()) {
            l(false, i);
        } else {
            ((ype) ((ype) jln.a.g()).ai((char) 2298)).u("onByeByeMessageSent invoked, flag is disabled.");
        }
    }

    @Override // defpackage.rwy
    public final void c(boolean z) {
        ((ype) ((ype) jln.a.f()).ai((char) 2299)).y("Handoff status %b", Boolean.valueOf(z));
        this.a.e.post(new jgv(this, z, 5));
    }

    @Override // defpackage.rwy
    public final void d(int i) {
        if (acrb.y()) {
            l(true, i);
        } else {
            ((ype) ((ype) jln.a.g()).ai((char) 2300)).u("onPctsByeByeMessageSent invoked, flag is disabled.");
        }
    }

    @Override // defpackage.rwy
    public final void f() throws RemoteException {
        ((ype) jln.a.l().ai((char) 2301)).u("GH:StartupManagerImpl::HandoffStartupCallback::onPreflightComplete no-op");
    }

    @Override // defpackage.rwy
    public final void g(int i, int i2, String str) {
        yph yphVar = jln.a;
        ((ype) ((ype) yphVar.h()).ai(2302)).R("Protocol error %d (%d): %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        ype ypeVar = (ype) yphVar.l().ai(2303);
        jln jlnVar = this.a;
        jlm jlmVar = jlnVar.j;
        ypeVar.Q("handoff bound state: %s, bypass bound check: %s.", jlmVar.a, true);
        jlj jljVar = new jlj(this, i, i2, str, 0);
        Handler handler = jlnVar.e;
        handler.post(jljVar);
        if (jlmVar.a) {
            return;
        }
        jle jleVar = jlnVar.h;
        jleVar.getClass();
        handler.post(new jgu(jleVar, 13));
    }

    @Override // defpackage.rwy
    public final void h(boolean z, List list, int i, int i2, byte[] bArr) {
        ((ype) ((ype) jln.a.f()).ai((char) 2304)).y("Resume complete with status %b", Boolean.valueOf(z));
        jln jlnVar = this.a;
        jle jleVar = jlnVar.h;
        jleVar.getClass();
        jlnVar.e.post(new jgu(jleVar, 12));
    }

    @Override // defpackage.rwy
    public final void i(List list, byte[] bArr, Bundle bundle) {
        ClassLoader classLoader = CarInfoInternal.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        ols.L(this.a.b, "com.google.android.gms.car.CAR_SETUP_SERVICE", rrq.l, null);
        CarInfoInternal carInfoInternal = (CarInfoInternal) bundle.getParcelable("HEAD_UNIT_METADATA_CAR_INFO");
        carInfoInternal.getClass();
        boolean z = bundle.getBoolean("HU_META_BUNDLE_AUDIO_MIGRATION_ENABLED", false);
        bundle.getBoolean("HU_META_BUNDLE_GEARHEAD_SUPPLIED_SKIP_LEGACY_FRX_VALUE", false);
        ((ype) ((ype) jln.a.f()).ai((char) 2305)).w("Handoff service discovery complete %d", list.size());
        try {
            xob xobVar = (xob) abnv.x(xob.a, bArr);
            jln jlnVar = this.a;
            carInfoInternal.n = jlnVar.g;
            jlnVar.e.post(new jlk(this, carInfoInternal, xobVar, list, z, 0));
        } catch (abon e) {
            throw new IllegalStateException("Invalid serviceDiscoveryResponse provided", e);
        }
    }

    @Override // defpackage.rwy
    public final void j() {
        ((ype) ((ype) jln.a.f()).ai((char) 2306)).u("Tear down initiated.");
        jln jlnVar = this.a;
        jle jleVar = jlnVar.h;
        jleVar.getClass();
        jlnVar.e.post(new jgu(jleVar, 13));
    }

    @Override // defpackage.rwy
    @Deprecated
    public final void k(List list, byte[] bArr) {
        throw new UnsupportedOperationException("onServiceDiscoveryComplete is not supported.");
    }

    @Override // defpackage.rwy
    public final void a() {
    }
}
