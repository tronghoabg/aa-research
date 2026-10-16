package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sib extends defpackage.rxq {
    public final /* synthetic */ defpackage.sid a;

    public sib(defpackage.sid sidVar) {
        this.a = sidVar;
    }

    private final void l(final java.util.List list, final com.google.android.gms.carsetup.CarInfoInternal carInfoInternal, byte[] bArr, final boolean z, final boolean z2) {
        defpackage.sid.a.f().ai(8975).w("Handoff service discovery complete %d", list.size());
        try {
            defpackage.abox aboxVarD = defpackage.abox.D(defpackage.xpc.a, bArr, 0, bArr.length, defpackage.abol.a);
            defpackage.abox.U(aboxVarD);
            final defpackage.xpc xpcVar = (defpackage.xpc) aboxVarD;
            carInfoInternal.getClass();
            defpackage.sid sidVar = this.a;
            carInfoInternal.n = sidVar.g;
            sidVar.e.post(new java.lang.Runnable() { // from class: shz
                @Override // java.lang.Runnable
                public final void run() {
                    defpackage.yqk yqkVar = com.google.android.gms.carsetup.CarSetupServiceImpl.a;
                    defpackage.ypu ypuVarAi = yqkVar.f().ai(8637);
                    defpackage.sbq sbqVar = this.a.a.j;
                    android.content.ComponentName componentName = sbqVar.w;
                    java.lang.String strFlattenToString = componentName != null ? componentName.flattenToString() : "<null>";
                    boolean z3 = z2;
                    boolean z4 = z;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z4);
                    defpackage.zke zkeVar = defpackage.zke.a;
                    ypuVarAi.S("Handoff complete. Interested component: %s. Success: %b. isCarAudioServiceMigrationEnabled: %s. gearheadSuppliedSkipLegacyFrxValue: %s.", strFlattenToString, bool, new defpackage.zkf(zkeVar, boolValueOf), new defpackage.zkf(zkeVar, java.lang.Boolean.valueOf(z3)));
                    if (!defpackage.a.o(sbqVar.u, boolValueOf)) {
                        yqkVar.h().ai(8638).u("Failed to update isCarAudioServiceMigrationEnabled");
                    }
                    java.util.List list2 = list;
                    defpackage.xpc xpcVar2 = xpcVar;
                    com.google.android.gms.carsetup.CarInfoInternal carInfoInternal2 = carInfoInternal;
                    sbqVar.t = z3;
                    defpackage.sbg sbgVar = sbqVar.f;
                    com.google.android.gms.car.CarInfo carInfo = carInfoInternal2.a;
                    sbgVar.c(carInfo.e, carInfo.f, xpcVar2);
                    sbqVar.c.post(new defpackage.inw(sbqVar, list2, xpcVar2, carInfoInternal2, 2));
                }
            });
        } catch (defpackage.abpp e) {
            throw new java.lang.IllegalStateException("Invalid serviceDiscoveryResponse provided", e);
        }
    }

    @Override // defpackage.rxr
    public final void c(final boolean z) {
        defpackage.sid.a.f().ai(8971).y("Handoff status %b", java.lang.Boolean.valueOf(z));
        this.a.e.post(new java.lang.Runnable() { // from class: sia
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.yqk yqkVar = com.google.android.gms.carsetup.CarSetupServiceImpl.a;
                defpackage.ypu ypuVarAi = yqkVar.f().ai(8639);
                boolean z2 = z;
                ypuVarAi.y("handoff initiated: %s", new defpackage.zkf(defpackage.zke.a, java.lang.Boolean.toString(z2)));
                defpackage.sbq sbqVar = this.a.a.j;
                defpackage.omv.g(sbqVar.e, "com.google.android.gms.car.CONNECTION_HANDOFF", (z2 ? defpackage.rsr.b : defpackage.rsr.c).ordinal(), null);
                sbqVar.s = z2;
                if (z2) {
                    return;
                }
                yqkVar.g().ai(8640).u("handoff initiated failed, running default behavior");
                sbqVar.n.b();
                sbqVar.c.post(sbqVar.j);
            }
        });
    }

    @Override // defpackage.rxr
    public final void f() {
        defpackage.sid.a.l().ai(8972).u("GMS:StartupManagerImpl::HandoffStartupCallback::onPreflightComplete no-op");
    }

    @Override // defpackage.rxr
    public final void g(int i, int i2, java.lang.String str) {
        defpackage.yqk yqkVar = defpackage.sid.a;
        defpackage.sid sidVar = this.a;
        if (sidVar.i.a) {
            sidVar.e.post(new jlq(this, i, i2, str, 5));
            return;
        }
        android.os.Handler handler = sidVar.e;
        defpackage.sbq sbqVar = sidVar.j;
        sbqVar.getClass();
        handler.post(new defpackage.sho(sbqVar, 10));
    }

    @Override // defpackage.rxr
    public final void h(boolean z, java.util.List list, int i, int i2, byte[] bArr) {
        defpackage.sid.a.f().ai(8974).y("Resume complete with status %b", java.lang.Boolean.valueOf(z));
        defpackage.sid sidVar = this.a;
        defpackage.sbq sbqVar = sidVar.j;
        sbqVar.getClass();
        sidVar.e.post(new defpackage.rzu(sbqVar, 10));
    }

    @Override // defpackage.rxr
    public final void i(java.util.List list, byte[] bArr, android.os.Bundle bundle) {
        java.lang.ClassLoader classLoader = com.google.android.gms.carsetup.CarInfoInternal.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        if (!bundle.containsKey("HU_META_SSL_SUBJECT_NAME")) {
            throw new java.lang.IllegalStateException();
        }
        if (!bundle.containsKey("HU_META_SSL_GAL_MAJOR_VERSION")) {
            throw new java.lang.IllegalStateException();
        }
        if (!bundle.containsKey("HU_META_SSL_GAL_MINOR_VERSION")) {
            throw new java.lang.IllegalStateException();
        }
        boolean z = bundle.getBoolean("HU_META_BUNDLE_GEARHEAD_SUPPLIED_SKIP_LEGACY_FRX_VALUE", false);
        defpackage.sid sidVar = this.a;
        int iOrdinal = defpackage.rsk.l.ordinal();
        android.content.Context context = sidVar.b;
        defpackage.omv.g(context, "com.google.android.gms.car.CAR_SETUP_SERVICE", iOrdinal, null);
        if (!defpackage.a.N()) {
            android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences("carservice", 0).edit();
            defpackage.sid.h(bundle, editorEdit, "car_tos_main");
            defpackage.sid.h(bundle, editorEdit, "car_tos_safety");
            defpackage.sid.h(bundle, editorEdit, "car_tos_data");
            defpackage.sid.g(bundle, editorEdit, "car_save_audio");
            defpackage.sid.g(bundle, editorEdit, "car_save_mic");
            defpackage.sid.g(bundle, editorEdit, "car_enable_audio_latency_dump");
            defpackage.sid.h(bundle, editorEdit, "audio_guidance_sample_rate");
            defpackage.sid.g(bundle, editorEdit, "car_only_connect_to_known_cars");
            editorEdit.apply();
        }
        l(list, (com.google.android.gms.carsetup.CarInfoInternal) bundle.getParcelable("HEAD_UNIT_METADATA_CAR_INFO"), bArr, bundle.getBoolean("HU_META_BUNDLE_AUDIO_MIGRATION_ENABLED", false), z);
    }

    @Override // defpackage.rxr
    public final void j() {
        defpackage.sid.a.f().ai(8976).u("Tear down initiated.");
        defpackage.sid sidVar = this.a;
        defpackage.sbq sbqVar = sidVar.j;
        sbqVar.getClass();
        sidVar.e.post(new defpackage.sho(sbqVar, 10));
    }

    @Override // defpackage.rxr
    @java.lang.Deprecated
    public final void k(java.util.List list, byte[] bArr) {
        l(list, null, bArr, false, false);
    }

    @Override // defpackage.rxr
    public final void a() {
    }

    @Override // defpackage.rxr
    public final void b(int i) {
    }

    @Override // defpackage.rxr
    public final void d(int i) {
    }
}
