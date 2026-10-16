package com.waze.ui.o;

import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.waze.NativeManager;
import com.waze.config.ConfigValues;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ac implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f43117a;

    public /* synthetic */ ac(int i2) {
        this.f43117a = i2;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        boolean z;
        Object objA;
        org.a.d.k.b bVarC2;
        h.g.b.m mVar2;
        byte[] bArr = null;
        switch (this.f43117a) {
            case 0:
                int i2 = ae.f43122a;
                return h.ab.f48028a;
            case 1:
                return h.ab.f48028a;
            case 2:
                int i3 = com.waze.ui.r.a.c.c.f43308a;
                return new com.waze.ui.r.a.c.a();
            case 3:
                int i4 = com.waze.ui.r.a.e.e.f43379a;
                return false;
            case 4:
                int i5 = com.waze.ui.r.a.e.e.f43379a;
                return new com.waze.ui.r.a.e.c.b(bArr);
            case 5:
                int i6 = com.waze.ui.r.a.e.e.f43379a;
                return com.waze.ui.r.a.e.a.b.b();
            case 6:
                int i7 = com.waze.ui.r.a.e.e.f43379a;
                return com.waze.ui.r.a.a.p.a();
            case 7:
                int i8 = com.waze.ui.r.a.e.b.b.f43363a;
                return com.waze.ui.r.a.e.b.a.f43360b;
            case 8:
                return h.ab.f48028a;
            case 9:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            case 10:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            case 11:
                return h.ab.f48028a;
            case 12:
                int i9 = com.waze.ui.af.b.f41869a;
                return h.ab.f48028a;
            case 13:
                int i10 = com.waze.ui.af.b.f41869a;
                return h.ab.f48028a;
            case 14:
                int i11 = com.waze.ui.af.b.f41869a;
                return h.ab.f48028a;
            case 15:
                int i12 = com.waze.ui.af.b.f41869a;
                return h.ab.f48028a;
            case 16:
                org.a.d.a.a aVar = com.waze.uid.o.f44543a;
                boolean z2 = aVar instanceof org.a.d.a.b;
                if (z2) {
                    bVarC = ((org.a.d.a.b) aVar).l();
                    int i13 = ar.f48106a;
                    mVar = new h.g.b.m(com.waze.r.a.class);
                } else {
                    bVarC = aVar.getKoin().a().c();
                    int i14 = ar.f48106a;
                    mVar = new h.g.b.m(com.waze.r.a.class);
                }
                com.waze.r.a aVar2 = (com.waze.r.a) bVarC.a(mVar, null, null);
                if (z2) {
                    objA = ((org.a.d.a.b) aVar).l().a(new h.g.b.m(com.waze.bf.a.class), null, null);
                    z = true;
                } else {
                    z = false;
                    objA = aVar.getKoin().a().c().a(new h.g.b.m(com.waze.bf.a.class), null, null);
                }
                com.waze.bf.a aVar3 = (com.waze.bf.a) objA;
                if (z) {
                    bVarC2 = ((org.a.d.a.b) aVar).l();
                    mVar2 = new h.g.b.m(com.waze.b.u.class);
                } else {
                    bVarC2 = aVar.getKoin().a().c();
                    mVar2 = new h.g.b.m(com.waze.b.u.class);
                }
                return new com.waze.uid.o(aVar2, aVar3, (com.waze.b.u) bVarC2.a(mVar2, null, null));
            case 17:
                NativeManager.getInstance().shutDown();
                return h.ab.f48028a;
            case 18:
                return ConfigValues.CONFIG_VALUE_SIGNUP_ONBOARDING_SUMMARY_STAT_EXPERIMENT_NAME.b();
            case 19:
                return ConfigValues.CONFIG_VALUE_SIGNUP_VEHICLE_TYPE_ONBOARDING_ENABLED.b();
            default:
                return ConfigValues.CONFIG_VALUE_SIGNUP_HOME_WORK_ONBOARDING_ENABLED.b();
        }
    }
}
