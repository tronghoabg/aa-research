package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.util.List;

/* loaded from: classes.dex */
public final class shg extends rwx {
    public final /* synthetic */ shi a;

    public shg(shi shiVar) {
        this.a = shiVar;
    }

    private final void l(final List list, final CarInfoInternal carInfoInternal, byte[] bArr, final boolean z, final boolean z2) {
        shi.a.f().ai(8950).w("Handoff service discovery complete %d", list.size());
        try {
            abnv abnvVarD = abnv.D(xob.a, bArr, 0, bArr.length, abnj.a);
            abnv.U(abnvVarD);
            final xob xobVar = (xob) abnvVarD;
            carInfoInternal.getClass();
            shi shiVar = this.a;
            carInfoInternal.n = shiVar.g;
            shiVar.e.post(new Runnable() { // from class: she
                @Override // java.lang.Runnable
                public final void run() {
                    ypf ypfVar = CarSetupServiceImpl.a;
                    yop yopVarAi = ypfVar.f().ai(8612);
                    sat satVar = this.a.a.j;
                    ComponentName componentName = satVar.v;
                    String strFlattenToString = componentName != null ? componentName.flattenToString() : "<null>";
                    boolean z3 = z2;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    zjc zjcVar = zjc.a;
                    yopVarAi.S("Handoff complete. Interested component: %s. Success: %b. isCarAudioServiceMigrationEnabled: %s. gearheadSuppliedSkipLegacyFrxValue: %s.", strFlattenToString, true, new zjd(zjcVar, boolValueOf), new zjd(zjcVar, Boolean.valueOf(z3)));
                    if (!a.p(satVar.u, boolValueOf)) {
                        ypfVar.h().ai(8613).u("Failed to update isCarAudioServiceMigrationEnabled");
                    }
                    List list2 = list;
                    xob xobVar2 = xobVar;
                    CarInfoInternal carInfoInternal2 = carInfoInternal;
                    satVar.t = z3;
                    sak sakVar = satVar.f;
                    CarInfo carInfo = carInfoInternal2.a;
                    sakVar.c(carInfo.e, carInfo.f, xobVar2);
                    satVar.c.post(new inp(satVar, list2, xobVar2, carInfoInternal2, 2));
                }
            });
        } catch (abon e) {
            throw new IllegalStateException("Invalid serviceDiscoveryResponse provided", e);
        }
    }

    @Override // defpackage.rwy
    public final void c(final boolean z) {
        shi.a.f().ai(8946).y("Handoff status %b", Boolean.valueOf(z));
        this.a.e.post(new Runnable() { // from class: shf
            @Override // java.lang.Runnable
            public final void run() {
                ypf ypfVar = CarSetupServiceImpl.a;
                yop yopVarAi = ypfVar.f().ai(8614);
                boolean z2 = z;
                yopVarAi.y("handoff initiated: %s", new zjd(zjc.a, Boolean.toString(z2)));
                sat satVar = this.a.a.j;
                ols.K(satVar.e, "com.google.android.gms.car.CONNECTION_HANDOFF", (z2 ? rrx.b : rrx.c).ordinal(), null);
                satVar.s = z2;
                if (z2) {
                    return;
                }
                ypfVar.g().ai(8615).u("handoff initiated failed, running default behavior");
                satVar.n.b();
                satVar.c.post(satVar.j);
            }
        });
    }

    @Override // defpackage.rwy
    public final void f() {
        shi.a.l().ai(8947).u("GMS:StartupManagerImpl::HandoffStartupCallback::onPreflightComplete no-op");
    }

    @Override // defpackage.rwy
    public final void g(int i, int i2, String str) {
        ypf ypfVar = shi.a;
        shi shiVar = this.a;
        if (shiVar.i.a) {
            shiVar.e.post(new jlj(this, i, i2, str, 5));
            return;
        }
        Handler handler = shiVar.e;
        sat satVar = shiVar.j;
        satVar.getClass();
        handler.post(new shd(satVar, 0));
    }

    @Override // defpackage.rwy
    public final void h(boolean z, List list, int i, int i2, byte[] bArr) {
        shi.a.f().ai(8949).y("Resume complete with status %b", Boolean.valueOf(z));
        shi shiVar = this.a;
        sat satVar = shiVar.j;
        satVar.getClass();
        shiVar.e.post(new rsv(satVar, 20));
    }

    @Override // defpackage.rwy
    public final void i(List list, byte[] bArr, Bundle bundle) {
        ClassLoader classLoader = CarInfoInternal.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        if (!bundle.containsKey("HU_META_SSL_SUBJECT_NAME")) {
            throw new IllegalStateException();
        }
        if (!bundle.containsKey("HU_META_SSL_GAL_MAJOR_VERSION")) {
            throw new IllegalStateException();
        }
        if (!bundle.containsKey("HU_META_SSL_GAL_MINOR_VERSION")) {
            throw new IllegalStateException();
        }
        boolean z = bundle.getBoolean("HU_META_BUNDLE_GEARHEAD_SUPPLIED_SKIP_LEGACY_FRX_VALUE", false);
        shi shiVar = this.a;
        int iOrdinal = rrq.l.ordinal();
        Context context = shiVar.b;
        ols.K(context, "com.google.android.gms.car.CAR_SETUP_SERVICE", iOrdinal, null);
        if (!a.O()) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("carservice", 0).edit();
            shi.h(bundle, editorEdit, "car_tos_main");
            shi.h(bundle, editorEdit, "car_tos_safety");
            shi.h(bundle, editorEdit, "car_tos_data");
            shi.g(bundle, editorEdit, "car_save_audio");
            shi.g(bundle, editorEdit, "car_save_mic");
            shi.g(bundle, editorEdit, "car_enable_audio_latency_dump");
            shi.h(bundle, editorEdit, "audio_guidance_sample_rate");
            shi.g(bundle, editorEdit, "car_only_connect_to_known_cars");
            editorEdit.apply();
        }
        l(list, (CarInfoInternal) bundle.getParcelable("HEAD_UNIT_METADATA_CAR_INFO"), bArr, bundle.getBoolean("HU_META_BUNDLE_AUDIO_MIGRATION_ENABLED", false), z);
    }

    @Override // defpackage.rwy
    public final void j() {
        shi.a.f().ai(8951).u("Tear down initiated.");
        shi shiVar = this.a;
        sat satVar = shiVar.j;
        satVar.getClass();
        shiVar.e.post(new shd(satVar, 0));
    }

    @Override // defpackage.rwy
    @Deprecated
    public final void k(List list, byte[] bArr) {
        l(list, null, bArr, false, false);
    }

    @Override // defpackage.rwy
    public final void a() {
    }

    @Override // defpackage.rwy
    public final void b(int i) {
    }

    @Override // defpackage.rwy
    public final void d(int i) {
    }
}
