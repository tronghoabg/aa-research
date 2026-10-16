package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lzk implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lzk(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // java.lang.Runnable
    public final void run() throws wfo {
        int i = 6;
        byte[] bArr = null;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object obj = this.a;
                ((lzi) obj).j(lzh.c);
                lzl lzlVar = (lzl) obj;
                lzlVar.e.c(lzlVar.f);
                return;
            case 1:
                defpackage.yqj yqjVar = (defpackage.yqj) com.google.android.apps.auto.components.metadataview.MetadataView.a.l().ai(4466);
                com.google.android.apps.auto.components.metadataview.MetadataView metadataView = (com.google.android.apps.auto.components.metadataview.MetadataView) this.a;
                yqjVar.y("onImageLoadTimeout currentModel=%s", metadataView.j);
                metadataView.a(false);
                metadataView.g(metadataView.j);
                lze lzeVar = metadataView.f;
                if (lzeVar != null) {
                    lzeVar.m();
                    return;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.ntl.a().b((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object obj2 = this.a;
                synchronized (((defpackage.mad) obj2).d) {
                    defpackage.maf mafVar = ((defpackage.mad) obj2).e;
                    if (mafVar != null && !mafVar.f) {
                        ((defpackage.mad) obj2).b();
                        return;
                    }
                    return;
                }
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.wfp.c();
                ((defpackage.yqj) ((defpackage.yqj) defpackage.mad.a.h()).ai((char) 4561)).u("onNavigationServiceInitFailed");
                java.lang.Object obj3 = this.a;
                defpackage.maf mafVar2 = (defpackage.maf) obj3;
                android.content.ComponentName componentName = mafVar2.d;
                mae maeVar = mafVar2.e;
                defpackage.mad madVar = (defpackage.mad) maeVar;
                madVar.c.n(componentName, "Navigation service init failed");
                synchronized (madVar.d) {
                    ((defpackage.mad) maeVar).d((defpackage.maf) obj3);
                    break;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.mas masVar = (defpackage.mas) ((defpackage.mar) this.a).a.get();
                if (masVar == null) {
                    return;
                }
                masVar.d = false;
                masVar.e(defpackage.maq.b);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((max) this.a).b();
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                mec mecVar = (mec) this.a;
                if (!mecVar.b.d()) {
                    mecVar.g.d.postDelayed(this, 100L);
                    return;
                } else {
                    defpackage.yqm yqmVar = com.google.android.apps.auto.components.permission.impl.PermissionPollerImpl.a;
                    mecVar.b();
                    return;
                }
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.permission.impl.PermissionPollerImpl.a.g()).ai((char) 4800)).u("Timed out while getting permissions.");
                mec mecVar2 = (mec) this.a;
                mecVar2.a(defpackage.zbd.ql);
                if (defpackage.acyc.aO()) {
                    mecVar2.c();
                    mecVar2.c.b();
                    return;
                } else {
                    mecVar2.c.b();
                    mecVar2.c();
                    return;
                }
            case 9:
                defpackage.wfp.b();
                java.lang.Object obj4 = this.a;
                synchronized (obj4) {
                    if (defpackage.ler.c().i()) {
                        return;
                    }
                    defpackage.kgu.d(new defpackage.kyo(obj4, i), "GH.ProjectedApps", defpackage.zbe.PROJECTED_APPS, defpackage.zbd.MM, "Could not get vendor extension manager", new java.lang.Object[0]);
                    rpg rpgVar = ((defpackage.mib) obj4).h;
                    if (rpgVar == null) {
                        return;
                    }
                    rpgVar.b = new mhx((defpackage.mib) obj4);
                    ((defpackage.yqj) defpackage.mib.a.l().ai(4960)).u("Registered Projected Apps vendor extension listener");
                    defpackage.wfp.e(new defpackage.lzk(obj4, 10));
                    return;
                }
            case 10:
                defpackage.wfp.c();
                if (defpackage.ler.c().i()) {
                    return;
                }
                java.lang.Object obj5 = this.a;
                defpackage.mkp.a.d.execute(new defpackage.mbx(obj5, defpackage.ler.a().e(defpackage.kit.b().e(), defpackage.nze.a()), i, bArr));
                defpackage.wfp.c();
                defpackage.mkc.a();
                defpackage.mib mibVar = (defpackage.mib) obj5;
                android.content.Context context = mibVar.d;
                ajnd ajndVar = new ajnd(obj5);
                java.util.HashSet hashSet = new java.util.HashSet();
                hashSet.add(new mkb(context, ajndVar));
                mibVar.b = new tmr(hashSet);
                return;
            case 11:
                ((com.google.android.apps.auto.components.radio.RadioMediaBrowserService) this.a).n = null;
                return;
            case 12:
                defpackage.yqm yqmVar2 = mjt.a;
                ((mjs) this.a).e.a();
                return;
            case 13:
                androidx.navigation.fragment.NavHostFragment.b((android.support.v4.app.Fragment) this.a).f(2131427405, null);
                return;
            case 14:
                ((mmc) this.a).d();
                return;
            case 15:
                java.lang.Object obj6 = this.a;
                android.support.v4.app.Fragment fragment = (android.support.v4.app.Fragment) obj6;
                if (android.provider.Settings.Global.getInt(fragment.requireContext().getContentResolver(), "adb_enabled", 0) == 1) {
                    ((com.google.android.apps.auto.components.settings.interactivetroubleshooter.DisableAdbFragment) obj6).c();
                    return;
                }
                defpackage.omv.i(fragment.requireContext(), defpackage.yyn.INTERACTIVE_TROUBLESHOOTER_DISABLED_ADB);
                com.google.android.apps.auto.components.settings.interactivetroubleshooter.DisableAdbFragment disableAdbFragment = (com.google.android.apps.auto.components.settings.interactivetroubleshooter.DisableAdbFragment) obj6;
                disableAdbFragment.a.setImageResource(2131231574);
                disableAdbFragment.b.setText(2132084852);
                disableAdbFragment.d.setImageResource(2131233894);
                disableAdbFragment.c.setVisibility(8);
                disableAdbFragment.e.setVisibility(0);
                disableAdbFragment.f.setVisibility(8);
                disableAdbFragment.g.setText(2132084029);
                disableAdbFragment.l.postDelayed(disableAdbFragment.m, com.google.android.apps.auto.components.settings.interactivetroubleshooter.DisableAdbFragment.h.toMillis());
                return;
            case 16:
                java.lang.Object obj7 = this.a;
                defpackage.omv.i(((android.support.v4.app.Fragment) obj7).requireContext(), defpackage.yyn.INTERACTIVE_TROUBLESHOOTER_ADB_DISABLE_DID_NOT_RESOLVE);
                ((com.google.android.apps.auto.components.settings.interactivetroubleshooter.DisableAdbFragment) obj7).c();
                return;
            case 17:
                java.lang.Object obj8 = this.a;
                android.support.v4.app.Fragment fragment2 = (android.support.v4.app.Fragment) obj8;
                if (android.provider.Settings.Global.getInt(fragment2.requireContext().getContentResolver(), "adb_enabled", 0) == 0) {
                    defpackage.omv.i(fragment2.requireContext(), defpackage.yyn.INTERACTIVE_TROUBLESHOOTER_ADB_ALREADY_DISABLED);
                    ((com.google.android.apps.auto.components.settings.interactivetroubleshooter.DisableAdbFragment) obj8).c();
                    return;
                }
                com.google.android.apps.auto.components.settings.interactivetroubleshooter.DisableAdbFragment disableAdbFragment2 = (com.google.android.apps.auto.components.settings.interactivetroubleshooter.DisableAdbFragment) obj8;
                disableAdbFragment2.a.setImageResource(2131233906);
                disableAdbFragment2.d.setImageResource(2131233898);
                disableAdbFragment2.b.setText(2132085432);
                disableAdbFragment2.c.setText(2132085431);
                disableAdbFragment2.c.setVisibility(0);
                disableAdbFragment2.e.setVisibility(8);
                disableAdbFragment2.g.setText(2132083081);
                disableAdbFragment2.g.setOnClickListener(new mhi(obj8, 7));
                disableAdbFragment2.f.setVisibility(0);
                disableAdbFragment2.f.setText(2132083082);
                disableAdbFragment2.f.setOnClickListener(new mhi(obj8, 8));
                return;
            case 18:
                android.support.v4.app.Fragment fragment3 = (android.support.v4.app.Fragment) this.a;
                defpackage.omv.i(fragment3.requireContext(), defpackage.yyn.INTERACTIVE_TROUBLESHOOTER_PROJECTION_NOT_STARTED);
                androidx.navigation.fragment.NavHostFragment.b(fragment3).f(2131427435, null);
                return;
            case 19:
                java.lang.Object obj9 = this.a;
                synchronized (((moq) obj9).f) {
                    if (!((moq) obj9).k) {
                        ((moq) obj9).m.d();
                        ((moq) obj9).k = true;
                    }
                    break;
                }
                return;
            default:
                moq moqVar = (moq) this.a;
                ajnd ajndVar2 = moqVar.l;
                if (((com.google.android.projection.gearhead.input.RotaryKeyboardLayout) ajndVar2.a).i(moqVar.d)) {
                    moqVar.c = true;
                    moqVar.b.postDelayed(moqVar.a, 400L);
                    return;
                }
                return;
        }
    }

    public lzk(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
