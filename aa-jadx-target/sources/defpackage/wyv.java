package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wyv extends defpackage.lin implements defpackage.mph {
    public static final defpackage.yqm m = defpackage.yqm.c("GH.GHLifetimeManager");
    private boolean A;
    private final java.util.List B;
    public final java.lang.Runnable n;
    public final defpackage.xyd o;
    public com.google.android.apps.auto.components.headunit.HeadUnitUpdateManager p;
    public final android.os.Handler q;
    public defpackage.xfe r;
    public defpackage.xgz s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    private final defpackage.xyd x;
    private final android.net.ConnectivityManager.NetworkCallback y;
    private boolean z;

    public wyv(android.content.Context context) {
        defpackage.kpo kpoVar = new defpackage.kpo(12);
        defpackage.kpo kpoVar2 = new defpackage.kpo(13);
        super(context);
        this.n = new defpackage.wyl(this, 0);
        this.q = new android.os.Handler();
        this.t = false;
        this.A = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.B = new java.util.ArrayList();
        this.x = kpoVar;
        this.o = kpoVar2;
        this.y = new defpackage.wyp(this);
    }

    public static final defpackage.sax A() {
        return (defpackage.sax) defpackage.kgu.c(new defpackage.kyr(8), "GH.GHLifetimeManager", defpackage.zbe.LIFETIME, defpackage.zbd.ph, true, "Could not get car window manager", new java.lang.Object[0]);
    }

    @Override // defpackage.mph
    public final void b(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
        if (!defpackage.mkt.y.equals(intent.getComponent()) && com.google.android.gms.car.display.CarDisplayId.b(carRegionId.h)) {
            this.q.postDelayed(new defpackage.wuj(this, 12), defpackage.acvt.c());
            defpackage.mpj.b().j(this);
        }
    }

    @Override // defpackage.lin
    public final java.util.List k() {
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        ygrVar.j(com.google.android.projection.gearhead.service.GearheadService.class, com.google.android.gearhead.appdecor.AppDecorService.class);
        return ygrVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lin
    protected final void o() {
        if (defpackage.acxe.c()) {
            defpackage.tgg tggVar = defpackage.tgg.a;
            defpackage.tgf tgfVar = defpackage.tgf.GEARHEAD_PROJECTION_LIFETIME_START_PHONE_CAPABILITIES_REPORTER;
            tggVar.b(tgfVar);
            ((defpackage.mfn) defpackage.mkp.a.i(defpackage.mfn.class)).a();
            tggVar.d(tgfVar, 1);
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            try {
                android.content.pm.InstallSourceInfo installSourceInfoM = bgp$.ExternalSyntheticApiModelOutline0.m(this.c.getPackageManager(), "com.google.android.projection.gearhead");
                if (installSourceInfoM == null || !j$.util.Objects.equals(bgp$.ExternalSyntheticApiModelOutline0.m(installSourceInfoM), "com.android.vending")) {
                    defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.LIFETIME, defpackage.zbd.pn).l());
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) m.h()).p(e)).ai((char) 9931)).u("PackageManager found no install info");
            }
        }
        if (android.os.Build.VERSION.SDK_INT == 34 && ((java.lang.Boolean) defpackage.kgu.c(new defpackage.kyr(9), "GH.GHLifetimeManager", defpackage.zbe.LIFETIME, defpackage.zbd.ph, true, "Could not get car connection type", new java.lang.Object[0])).booleanValue()) {
            ((android.net.ConnectivityManager) this.c.getSystemService(android.net.ConnectivityManager.class)).registerNetworkCallback(new android.net.NetworkRequest.Builder().build(), this.y);
            this.z = true;
        }
        defpackage.ygw ygwVar = defpackage.wyu.d;
        int i = ((defpackage.ymx) ygwVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.lii) ygwVar.get(i2)).a("delayed");
        }
        this.A = false;
        defpackage.ygw ygwVar2 = defpackage.wyu.f;
        int i3 = ((defpackage.ymx) ygwVar2).c;
        for (int i4 = 0; i4 < i3; i4++) {
            ((defpackage.lii) ygwVar2.get(i4)).a("Delayed Coolwalk");
        }
        android.content.Context context = this.c;
        boolean zR = defpackage.acqe.r();
        defpackage.yqm yqmVar = defpackage.kuv.a;
        context.getClass();
        context.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(context, (java.lang.Class<?>) com.google.android.apps.auto.components.coolwalk.compose.catalog.ComposeCatalogCarActivityService.class), true != zR ? 2 : 1, 1);
        this.A = true;
        defpackage.tgg tggVar2 = defpackage.tgg.a;
        defpackage.tgf tgfVar2 = defpackage.tgf.GEARHEAD_PROJECTION_LIFETIME_START_LOG_HOST_LEVEL_TELEMETRY;
        tggVar2.b(tgfVar2);
        defpackage.qsh qshVarE = defpackage.kit.b().e();
        defpackage.yqm yqmVar2 = defpackage.kag.a;
        int iB = (int) defpackage.adae.b();
        ((defpackage.yqj) defpackage.kag.a.l().ai(2894)).w("Host SDK max api: %d", iB);
        defpackage.rrv rrvVarA = defpackage.kag.a(defpackage.zbd.rW);
        rrvVarA.i(java.lang.Integer.toString(iB));
        defpackage.kag.e(rrvVarA);
        final defpackage.ygw ygwVarC = defpackage.kag.c(qshVarE, "androidx.car.app.category.NAVIGATION");
        final defpackage.ygw ygwVarC2 = defpackage.kag.c(qshVarE, "androidx.car.app.category.PARKING");
        final defpackage.ygw ygwVarC3 = defpackage.kag.c(qshVarE, "androidx.car.app.category.CHARGING");
        final defpackage.ygw ygwVarC4 = defpackage.kag.c(qshVarE, "androidx.car.app.category.MESSAGING");
        final defpackage.ygw ygwVarC5 = defpackage.kag.c(qshVarE, "androidx.car.app.category.POI");
        defpackage.kag.d((defpackage.ygw) j$.util.Collection.-EL.stream(defpackage.kag.c(qshVarE, null)).filter(new java.util.function.Predicate() { // from class: kaf
            @Override // java.util.function.Predicate
            public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
                return j$.util.function.Predicate.-CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ java.util.function.Predicate negate() {
                return j$.util.function.Predicate.-CC.$default$negate(this);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
                return j$.util.function.Predicate.-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                defpackage.yqm yqmVar3 = defpackage.kag.a;
                return (componentName.getPackageName().equals("com.google.android.projection.gearhead") || ygwVarC.contains(componentName) || ygwVarC2.contains(componentName) || ygwVarC3.contains(componentName) || ygwVarC4.contains(componentName) || ygwVarC5.contains(componentName)) ? false : true;
            }
        }).collect(defpackage.yds.a), defpackage.yyd.CAR_APP_CATEGORY_UNKNOWN, null);
        defpackage.kag.d(ygwVarC, defpackage.yyd.CAR_APP_CATEGORY_NAVIGATION, "navigation");
        defpackage.kag.d(ygwVarC2, defpackage.yyd.CAR_APP_CATEGORY_PARKING, "parking");
        defpackage.kag.d(ygwVarC3, defpackage.yyd.CAR_APP_CATEGORY_CHARGING, "charging");
        defpackage.kag.d(ygwVarC4, defpackage.yyd.CAR_APP_CATEGORY_MESSAGING, "messaging");
        defpackage.kag.d(ygwVarC5, defpackage.yyd.CAR_APP_CATEGORY_POI, "POI");
        tggVar2.d(tgfVar2, 1);
        tggVar2.b(tgfVar2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    @Override // defpackage.lin
    protected final void p() throws afbj {
        boolean z;
        long jM;
        java.lang.String string;
        defpackage.wyv wyvVar = this;
        ((defpackage.oyl) defpackage.mkp.a.i(defpackage.oyl.class)).b();
        java.lang.Object objA = wyvVar.x.a(wyvVar.c);
        java.util.Iterator it = ((defpackage.yhe) defpackage.tht.d(new mjb(12), defpackage.acxn.b()).collect(defpackage.yds.b(new defpackage.mmf(18), new defpackage.rix(16), new riy(3)))).entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Long l = (java.lang.Long) entry.getValue();
            long jLongValue = l.longValue();
            if (defpackage.acyc.V() && defpackage.laz.a().a(((com.google.android.apps.auto.components.softminversion.SoftMinversionManager) objA).c, "soft_minversion_dismissed_prefs").getBoolean(str, false)) {
                ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.softminversion.SoftMinversionManager.a.f()).ai((char) 5102)).y("Package %s is dismissed, skipping notification.", str);
            } else {
                try {
                    jM = hh$.ExternalSyntheticApiModelOutline0.m(((com.google.android.apps.auto.components.softminversion.SoftMinversionManager) objA).c.getPackageManager().getPackageInfo(str, 0));
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    jM = 0;
                }
                if (jM < jLongValue) {
                    defpackage.yqm yqmVar = com.google.android.apps.auto.components.softminversion.SoftMinversionManager.a;
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(5101)).R("Package %s installed version is %d. Soft minversion is %d, notifying.", str, java.lang.Long.valueOf(jM), l);
                    android.content.ComponentName componentName = new android.content.ComponentName(str, "");
                    com.google.android.apps.auto.components.softminversion.SoftMinversionManager softMinversionManager = (com.google.android.apps.auto.components.softminversion.SoftMinversionManager) objA;
                    defpackage.rqt rqtVar = softMinversionManager.d;
                    defpackage.yzd yzdVar = defpackage.yzd.GEARHEAD;
                    defpackage.zbe zbeVar = defpackage.zbe.SOFT_MINVERSION;
                    defpackage.rrv rrvVarH = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.yE);
                    rrvVarH.p(componentName);
                    rrvVarH.r(jLongValue);
                    rqtVar.c(rrvVarH.l());
                    defpackage.rrv rrvVarH2 = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.yD);
                    rrvVarH2.p(componentName);
                    rrvVarH2.r(jM);
                    rqtVar.c(rrvVarH2.l());
                    android.content.Context context = softMinversionManager.c;
                    android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) com.google.android.apps.auto.components.softminversion.SoftMinversionManager.NotificationActionBroadcastReceiver.class);
                    intent.setAction("com.google.android.apps.auto.components.softminversion.ACTION_UPDATE.".concat(java.lang.String.valueOf(str)));
                    intent.putExtra("app_to_update", str);
                    intent.putExtra("installed_version_code", jM);
                    intent.putExtra("soft_minversion_code", jLongValue);
                    java.lang.Object obj = objA;
                    java.util.Iterator it2 = it;
                    intent.putExtra("notification_created_ms", android.os.SystemClock.elapsedRealtime());
                    intent.setFlags(268435456);
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5100)).y("Created intent: %s", intent);
                    android.content.ClipData clipData = wer.a;
                    android.app.PendingIntent pendingIntentC = wer.c(context, 0, intent, 1409286144);
                    pendingIntentC.getClass();
                    java.lang.String string2 = context.getString(((java.lang.Integer) softMinversionManager.b.getOrDefault(str, 2132083139)).intValue());
                    if (jM > 0) {
                        string = "com.google.android.projection.gearhead".equals(str) ? context.getString(2132084649) : context.getString(2132084650, string2);
                    } else {
                        string = context.getString(2132084645, string2);
                    }
                    java.lang.String string3 = context.getString(2132084627);
                    if (defpackage.acyc.V()) {
                        if (j$.util.Objects.equals(str, "com.google.android.apps.maps")) {
                            string = context.getString(2132084647);
                            string3 = context.getString(2132084626);
                        } else if (j$.util.Objects.equals(str, "com.google.android.googlequicksearchbox")) {
                            string = context.getString(2132084646);
                            string3 = context.getString(2132084625);
                        }
                    }
                    defpackage.maz.c();
                    defpackage.dte dteVar = new defpackage.dte(context, "gearhead_alerts");
                    dteVar.n(2131231572);
                    dteVar.i(string);
                    dteVar.h(string3);
                    dteVar.g = pendingIntentC;
                    dteVar.e(16, true);
                    if (defpackage.acyc.V()) {
                        android.content.Intent intent2 = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) com.google.android.apps.auto.components.softminversion.SoftMinversionManager.NotificationActionBroadcastReceiver.class);
                        intent2.setAction("com.google.android.apps.auto.components.softminversion.ACTION_DISMISS.".concat(java.lang.String.valueOf(str)));
                        intent2.putExtra("app_to_update", str);
                        intent2.putExtra("installed_version_code", jM);
                        intent2.putExtra("soft_minversion_code", jLongValue);
                        intent2.putExtra("notification_created_ms", android.os.SystemClock.elapsedRealtime());
                        intent2.putExtra("dismiss_action", true);
                        intent2.setFlags(268435456);
                        android.app.PendingIntent pendingIntentC2 = wer.c(context, 0, intent2, 1409286144);
                        pendingIntentC2.getClass();
                        dteVar.f(0, context.getString(2132084623), pendingIntentC2);
                    }
                    if (softMinversionManager.a(str) != null) {
                        dteVar.k(softMinversionManager.a(str));
                    }
                    new defpackage.dun(context).b(str, 2131429849, dteVar.a());
                    wyvVar = this;
                    objA = obj;
                    it = it2;
                } else {
                    wyvVar = this;
                }
            }
        }
        com.google.android.apps.auto.components.headunit.HeadUnitUpdateManager headUnitUpdateManager = wyvVar.p;
        if (headUnitUpdateManager != null) {
            android.content.Context context2 = headUnitUpdateManager.b;
            android.content.SharedPreferences sharedPreferences = context2.getSharedPreferences("HeadUnitManager", 0);
            java.lang.String str2 = null;
            if (headUnitUpdateManager.f) {
                ((defpackage.yqj) com.google.android.apps.auto.components.headunit.HeadUnitUpdateManager.a.f()).y("Notifying head unit needs update, notification=", headUnitUpdateManager.e);
                android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                java.lang.String str3 = headUnitUpdateManager.g;
                if (str3 == null) {
                    defpackage.afga.d("attributionKey");
                    str3 = null;
                }
                editorEdit.putBoolean(str3, true).apply();
                android.app.Notification notification = headUnitUpdateManager.e;
                if (notification != null) {
                    new defpackage.dun(context2).b(null, 2131428333, notification);
                    z = true;
                } else {
                    z = false;
                }
                headUnitUpdateManager.c.c(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.HEAD_UNIT_UPDATER, defpackage.zbd.Ky).l());
                if (z) {
                    java.lang.String str4 = headUnitUpdateManager.j;
                    if (str4 == null) {
                        defpackage.afga.d("numNotificationsKeyToStore");
                        str4 = null;
                    }
                    int i = sharedPreferences.getInt(str4, 0) + 1;
                    android.content.SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    java.lang.String str5 = headUnitUpdateManager.j;
                    if (str5 == null) {
                        defpackage.afga.d("numNotificationsKeyToStore");
                        str5 = null;
                    }
                    editorEdit2.putInt(str5, i).apply();
                }
            }
            if (headUnitUpdateManager.i != null) {
                android.content.SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                java.lang.String str6 = headUnitUpdateManager.i;
                if (str6 == null) {
                    defpackage.afga.d("notifiedKeyToStore");
                } else {
                    str2 = str6;
                }
                editorEdit3.putInt(str2, headUnitUpdateManager.h).apply();
            }
        }
    }

    @Override // defpackage.lin
    protected final void s() {
        if (defpackage.acwj.r()) {
            android.content.Context context = this.c;
            defpackage.yqm yqmVar = les.a;
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
            les.a(context, 3600000L);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lin
    protected final void v() throws wfo {
        java.util.List list = this.B;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.lxy.l().f((mbe) it.next());
        }
        list.clear();
        this.q.removeCallbacks(this.n);
        if (this.w) {
            defpackage.wyu.i.b();
        }
        if (this.u) {
            defpackage.wyu.g.b();
        }
        if (this.v) {
            defpackage.wyu.h.b();
        }
        if (this.t) {
            defpackage.ygw ygwVarH = defpackage.wyu.e.h();
            int size = ygwVarH.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.lii) ygwVarH.get(i)).b();
            }
        }
        defpackage.ygw ygwVarH2 = defpackage.wyu.b.h();
        int size2 = ygwVarH2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((defpackage.lii) ygwVarH2.get(i2)).b();
        }
        defpackage.mpk.a().d();
        defpackage.lgv lgvVarA = defpackage.lgv.a();
        if (lgvVarA.h()) {
            java.util.Iterator it2 = lgvVarA.d.iterator();
            loop3: while (true) {
                if (!it2.hasNext()) {
                    lgvVarA.f(false);
                    break;
                }
                java.util.ArrayList filesFromSpec = com.google.android.libraries.handwriting.base.OnDeviceSpecUtils.getFilesFromSpec(lgvVarA.b(((java.util.Locale) it2.next()).getLanguage()));
                int size3 = filesFromSpec.size();
                int i3 = 0;
                while (i3 < size3) {
                    java.lang.String str = (java.lang.String) filesFromSpec.get(i3);
                    i3++;
                    if (!new java.io.File(com.google.android.libraries.handwriting.base.Util.maybeMakeFilenameFromUrl(lgvVarA.c, str)).exists()) {
                        defpackage.wzi wziVarA = defpackage.wzi.a();
                        wziVarA.b(1, 2131231483, 2132083143, 2132083765, new android.content.Intent(wziVarA.b, (java.lang.Class<?>) com.google.android.projection.gearhead.companion.AndroidAutoActivity.class), 600000L);
                        break loop3;
                    }
                }
            }
        }
        defpackage.omf.w().E(defpackage.xgy.p());
        defpackage.xgy xgyVarP = defpackage.xgy.p();
        defpackage.kit.b().w(xgyVarP.g);
        xgyVarP.y();
        com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider ghMicrophoneContentProviderA = com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider.a();
        ghMicrophoneContentProviderA.c = null;
        defpackage.kxl kxlVar = ghMicrophoneContentProviderA.d;
        if (kxlVar != null) {
            ((defpackage.yqj) com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider.a.l().ai((char) 3467)).u("stop");
            kxlVar.c();
            ghMicrophoneContentProviderA.d = null;
        }
        defpackage.xfe xfeVar = this.r;
        android.content.Context context = this.c;
        xfeVar.a = false;
        context.unregisterReceiver(xfeVar);
        xfeVar.b = null;
        defpackage.xgz xgzVar = this.s;
        if (xgzVar != null) {
            if (xgzVar.b) {
                context.unregisterReceiver(xgzVar);
                xgzVar.b = false;
            } else {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.xgz.a.h()).ai((char) 10308)).u("Receiver not registered");
            }
        }
        defpackage.ygw ygwVarH3 = defpackage.wyu.c.h();
        int size4 = ygwVarH3.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((defpackage.lii) ygwVarH3.get(i4)).b();
        }
        if (this.g) {
            if (this.A) {
                defpackage.ygw ygwVarH4 = defpackage.wyu.f.h();
                int size5 = ygwVarH4.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    ((defpackage.lii) ygwVarH4.get(i5)).b();
                }
            }
            defpackage.ygw ygwVarH5 = defpackage.wyu.d.h();
            int size6 = ygwVarH5.size();
            for (int i6 = 0; i6 < size6; i6++) {
                ((defpackage.lii) ygwVarH5.get(i6)).b();
            }
            if (this.z) {
                ((android.net.ConnectivityManager) context.getSystemService(android.net.ConnectivityManager.class)).unregisterNetworkCallback(this.y);
            }
        } else {
            ((defpackage.yqj) ((defpackage.yqj) m.f()).ai((char) 9933)).u("Skipping stop for delayed start services.");
        }
        defpackage.juv.l().d(null);
        z(false);
        if (defpackage.leo.a().d()) {
            y(false);
        }
    }

    public final void x(mbe mbeVar) {
        this.B.add(mbeVar);
        defpackage.lxy.l().e(mbeVar);
    }

    public final void y(boolean z) {
        android.content.Context context = this.c;
        android.content.ComponentName componentName = new android.content.ComponentName(context, (java.lang.Class<?>) com.google.android.apps.auto.components.carlocalmedia.CarLocalMediaBrowserService.class);
        try {
            ((defpackage.yqj) ((defpackage.yqj) m.h()).ai(9934)).N("Car local media set %s to %b", componentName, z);
            context.getPackageManager().setComponentEnabledSetting(componentName, true != z ? 2 : 1, 1);
        } catch (java.lang.IllegalArgumentException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) m.f()).p(e)).ai((char) 9935)).u("CarLocalMediaBrowserService not found");
        }
    }

    public final void z(boolean z) {
        try {
            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) m.h()).ai(9936);
            android.content.ComponentName componentName = defpackage.mkt.G;
            yqjVar.N("Radio set %s to %b", componentName, z);
            this.c.getPackageManager().setComponentEnabledSetting(componentName, true != z ? 2 : 1, 1);
        } catch (java.lang.IllegalArgumentException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) m.f()).p(e)).ai((char) 9937)).u("RadioMediaBrowserService not found");
        }
    }

    @Override // defpackage.mph
    public final /* synthetic */ void a(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
    }

    @Override // defpackage.mph
    public final /* synthetic */ void e(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
    }

    @Override // defpackage.mph
    public final /* synthetic */ void f(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
    }
}
