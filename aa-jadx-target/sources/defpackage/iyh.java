package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iyh implements defpackage.iyc {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.VALIDATOR");
    public static final defpackage.ygw b;
    private static final defpackage.yhx g;
    private static final defpackage.yhx h;
    private static final defpackage.yhx i;
    private static final defpackage.yhx j;
    private static defpackage.iyh k;
    private static int l;
    public final defpackage.afak c;
    public volatile com.google.android.gms.car.CarInfo d;
    private final java.util.Map m;
    private final defpackage.xzi n;
    private final defpackage.xzi o;
    private final boolean p;
    private final defpackage.xzi q;
    private final android.content.Context s;
    private volatile com.google.android.gms.car.CarUiInfo u;
    private volatile defpackage.xlk v;
    private final java.util.concurrent.CopyOnWriteArrayList r = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.util.concurrent.atomic.AtomicReference t = new java.util.concurrent.atomic.AtomicReference(new java.lang.ref.WeakReference(null));
    private final defpackage.aba w = new defpackage.aba(0);
    private final java.util.Set x = new java.util.HashSet();
    private final defpackage.iyf y = new defpackage.iyf(this);
    public final java.lang.Object e = new java.lang.Object();
    private final java.util.Map z = new java.util.HashMap();
    public java.util.concurrent.CountDownLatch f = new java.util.concurrent.CountDownLatch(1);

    static {
        defpackage.ynu ynuVar = new defpackage.ynu(0);
        g = ynuVar;
        defpackage.yhv yhvVar = new defpackage.yhv();
        yhvVar.k(ynuVar);
        yhvVar.c(2);
        h = yhvVar.g();
        i = new defpackage.ynu("com.google.android.gms");
        android.content.Intent intent = defpackage.iyi.a;
        defpackage.qqe qqeVar = defpackage.qqe.f;
        defpackage.iyg iygVar = new defpackage.iyg(intent, qqeVar, 0);
        defpackage.iyg iygVar2 = new defpackage.iyg(defpackage.iyi.b, qqeVar, 0);
        android.content.Intent intent2 = defpackage.iyi.d;
        defpackage.qqe qqeVar2 = defpackage.qqe.h;
        b = defpackage.ygw.v(iygVar, iygVar2, new defpackage.iyg(intent2, qqeVar2, 0), new defpackage.iyg(defpackage.iyi.e, qqeVar2, 0), new defpackage.iyg(defpackage.iyi.c, defpackage.qqe.c, 0), new defpackage.iyg(defpackage.iyi.f, defpackage.qqe.i, 0));
        j = defpackage.yhx.t(defpackage.qqe.c, defpackage.qqe.d, defpackage.qqe.b, defpackage.qqe.a, defpackage.qqe.j, defpackage.qqe.e, defpackage.qqe.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iyh(android.content.Context context, defpackage.afak afakVar) {
        defpackage.yhe yheVarD;
        this.s = context;
        this.c = afakVar;
        defpackage.acnc acncVar = defpackage.acnc.a;
        this.p = acncVar.fF().e();
        java.lang.String strC = acncVar.fF().c();
        java.util.HashMap map = new java.util.HashMap();
        if (strC.isEmpty()) {
            yheVarD = defpackage.ync.a;
        } else {
            defpackage.ygw ygwVarP = defpackage.ygw.p(strC.substring(strC.indexOf(124) + 1).split(","));
            java.util.HashMap map2 = new java.util.HashMap();
            defpackage.you youVarListIterator = ygwVarP.listIterator(0);
            while (youVarListIterator.hasNext()) {
                java.lang.String str = (java.lang.String) youVarListIterator.next();
                java.util.Map.Entry entryE = defpackage.tht.e(str);
                if (entryE == null) {
                    ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 1556)).y("Invalid package item: %s", str);
                } else {
                    java.lang.String str2 = (java.lang.String) entryE.getKey();
                    j$.util.Optional optional = (j$.util.Optional) entryE.getValue();
                    java.util.Set zfVar = (java.util.Set) map2.get(str2);
                    if (zfVar == null || !zfVar.isEmpty()) {
                        zfVar = (zfVar == null || optional.isEmpty()) ? new defpackage.zf(0) : zfVar;
                        if (optional.isPresent()) {
                            zfVar.add((java.lang.Long) optional.get());
                        }
                        map2.put(str2, zfVar);
                    }
                }
            }
            defpackage.yha yhaVar = new defpackage.yha(4);
            for (java.util.Map.Entry entry : map2.entrySet()) {
                yhaVar.f((java.lang.String) entry.getKey(), defpackage.yhx.n((java.util.Collection) entry.getValue()));
            }
            yheVarD = yhaVar.d(true);
        }
        defpackage.yot it = yheVarD.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            java.lang.String str3 = (java.lang.String) entry2.getKey();
            java.util.Set set = (java.util.Set) entry2.getValue();
            set.size();
            java.util.Iterator it2 = set.iterator();
            long jMin = Long.MAX_VALUE;
            while (it2.hasNext()) {
                jMin = java.lang.Math.min(jMin, ((java.lang.Long) it2.next()).longValue());
            }
            if (jMin >= Long.MAX_VALUE) {
                jMin = 0;
            }
            map.put(str3, java.lang.Long.valueOf(jMin));
        }
        this.m = map;
        this.n = defpackage.ysr.aQ(new defpackage.ilu(context, 8));
        this.o = defpackage.ysr.aQ(new defpackage.imy(5));
        this.q = defpackage.ysr.aQ(new defpackage.ilu(this, 9));
    }

    private final int A(java.lang.String str) throws android.content.pm.PackageManager.NameNotFoundException {
        android.content.pm.ApplicationInfo applicationInfo = this.s.getPackageManager().getApplicationInfo(str, 128);
        if (applicationInfo.metaData == null) {
            return 0;
        }
        return applicationInfo.metaData.getInt("com.google.android.gms.car.application", 0);
    }

    private final android.content.res.XmlResourceParser B(j$.util.Optional optional, j$.util.Optional optional2, java.lang.String str) throws android.content.pm.PackageManager.NameNotFoundException {
        if (optional2.isEmpty()) {
            optional2 = j$.util.Optional.of(java.lang.Integer.valueOf(A(str)));
        }
        if (((java.lang.Integer) optional2.get()).intValue() == 0) {
            return null;
        }
        if (optional.isEmpty()) {
            optional = j$.util.Optional.of(this.s.getPackageManager().getResourcesForApplication(str));
        }
        try {
            return ((android.content.res.Resources) optional.get()).getXml(((java.lang.Integer) optional2.get()).intValue());
        } catch (android.content.res.Resources.NotFoundException unused) {
            ((defpackage.yqj) a.l().ai((char) 1568)).y("Resource not found [%s]", str);
            return null;
        }
    }

    private final defpackage.ygw C(android.content.Intent intent, defpackage.qqe qqeVar, boolean z) {
        return K() ? F(intent, qqeVar, z, 0) : D(intent, qqeVar, z, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final defpackage.ygw D(android.content.Intent intent, final defpackage.qqe qqeVar, final boolean z, int i2) {
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities;
        int iAr;
        int iAr2;
        if (defpackage.acpj.a.fF().d()) {
            defpackage.tgg.a.b(defpackage.tgf.GEARHEAD_CAR_PROJECTION_VALIDATOR_QUERY_ALLOWED_CLIENTS);
        }
        android.content.Context context = this.s;
        int i3 = defpackage.epv.k(context) ? i2 | 128 : i2;
        int i4 = 7;
        int i5 = 5;
        defpackage.yhx yhxVarG = null;
        if (defpackage.a.O() && qqeVar == defpackage.qqe.j) {
            yhxVarG = intent.hasCategory("android.intent.category.CAR_LAUNCHER") ? G() : null;
            int iAr3 = defpackage.a.ar(defpackage.acqh.e().c);
            if (iAr3 == 0) {
                iAr3 = 1;
            }
            boolean z2 = (intent.getComponent() == null && android.text.TextUtils.isEmpty(intent.getPackage())) ? false : true;
            boolean zHasCategory = intent.hasCategory("android.intent.category.LAUNCHER");
            if ((defpackage.a.O() && (((iAr = defpackage.a.ar(defpackage.acqh.e().c)) != 0 && iAr == 5) || (defpackage.acqh.k() && (iAr2 = defpackage.a.ar(defpackage.acqh.d().c)) != 0 && iAr2 == 5))) || iAr3 == 7 || defpackage.acqh.k() || z2 || !zHasCategory) {
                ((defpackage.yqj) a.l().ai((char) 1561)).y("Using broad query for %s", intent);
                listQueryIntentActivities = this.s.getPackageManager().queryIntentActivities(intent, i3);
            } else {
                listQueryIntentActivities = new java.util.ArrayList<>();
                if (iAr3 != 2) {
                    defpackage.yot it = defpackage.kmv.a(defpackage.acqh.e()).keySet().iterator();
                    while (it.hasNext()) {
                        java.lang.String str = (java.lang.String) it.next();
                        try {
                            a$.ExternalSyntheticApiModelOutline2.m(context.getPackageManager(), str, 0);
                            android.content.pm.ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new android.content.Intent(intent).setPackage(str), i3);
                            if (resolveInfoResolveActivity != null) {
                                listQueryIntentActivities.add(resolveInfoResolveActivity);
                            }
                        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                        }
                    }
                }
            }
        } else {
            defpackage.qqe qqeVar2 = defpackage.qqe.i;
            android.content.Context context2 = this.s;
            listQueryIntentActivities = qqeVar == qqeVar2 ? context2.getPackageManager().queryIntentActivities(intent, i3) : context2.getPackageManager().queryIntentServices(intent, i3 | 64);
        }
        if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
            if (defpackage.acpj.a.fF().d()) {
                defpackage.tgg.a.d(defpackage.tgf.GEARHEAD_CAR_PROJECTION_VALIDATOR_QUERY_ALLOWED_CLIENTS, 2);
            }
            int i6 = defpackage.ygw.d;
            return defpackage.ymx.a;
        }
        if (qqeVar == defpackage.qqe.i) {
            j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(listQueryIntentActivities).filter(new defpackage.ghv((defpackage.yhx) j$.util.Collection.-EL.stream(b).filter(new defpackage.hmj(i5)).flatMap(new defpackage.gjt(this, i4)).map(new defpackage.ikc(14)).collect(defpackage.yds.b), 6));
            int i7 = defpackage.ygw.d;
            listQueryIntentActivities = (java.util.List) streamFilter.collect(defpackage.yds.a);
        }
        final boolean z3 = (i3 & 32768) == 32768;
        final defpackage.yhx yhxVar = yhxVarG;
        final java.util.function.Function function = new java.util.function.Function() { // from class: iyd
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function2) {
                return j$.util.function.Function.-CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                defpackage.qqe qqeVar3 = qqeVar;
                java.lang.String str2 = (java.lang.String) obj;
                if (qqeVar3 == defpackage.qqe.i) {
                    qqeVar3 = defpackage.qqe.b;
                }
                defpackage.yhx yhxVar2 = yhxVar;
                boolean z4 = z3;
                boolean z5 = z;
                return java.lang.Boolean.valueOf(this.a.z(str2, qqeVar3, z5, true, z4, yhxVar2));
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function2) {
                return j$.util.function.Function.-CC.$default$compose(this, function2);
            }
        };
        final java.util.HashMap map = new java.util.HashMap();
        j$.util.stream.Stream streamFilter2 = j$.util.Collection.-EL.stream(listQueryIntentActivities).filter(new java.util.function.Predicate() { // from class: iye
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
                return ((java.lang.Boolean) j$.util.Map.-EL.computeIfAbsent(map, defpackage.iyh.s((android.content.pm.ResolveInfo) obj), function)).booleanValue();
            }
        });
        int i8 = defpackage.ygw.d;
        defpackage.ygw ygwVar = (defpackage.ygw) streamFilter2.collect(defpackage.yds.a);
        if (defpackage.acpj.a.fF().d()) {
            defpackage.tgg.a.d(defpackage.tgf.GEARHEAD_CAR_PROJECTION_VALIDATOR_QUERY_ALLOWED_CLIENTS, 1);
        }
        return ygwVar;
    }

    private final defpackage.ygw E(android.content.Intent intent, boolean z) {
        android.content.Intent intentCloneFilter = intent.cloneFilter();
        intentCloneFilter.addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION");
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        ygrVar.k(C(intentCloneFilter, defpackage.qqe.f, z));
        if (defpackage.a.O()) {
            ygrVar.k(C(intent.cloneFilter(), defpackage.qqe.j, z));
        }
        return ygrVar.g();
    }

    private final defpackage.ygw F(android.content.Intent intent, defpackage.qqe qqeVar, boolean z, int i2) {
        synchronized (this.e) {
            defpackage.iyg iygVar = new defpackage.iyg(intent, qqeVar, i2);
            java.util.Map map = this.z;
            if (map.containsKey(iygVar)) {
                return (defpackage.ygw) map.get(iygVar);
            }
            boolean zD = defpackage.acpj.d();
            boolean z2 = (i2 & 32768) == 32768;
            defpackage.ygw ygwVarD = D(intent, qqeVar, z, (zD || !z2) ? 0 : 32768);
            j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(ygwVarD).filter(new defpackage.ghv(this, 7));
            int i3 = defpackage.ygw.d;
            defpackage.ygw ygwVar = (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
            if (r() != null) {
                if (z2 && !defpackage.acpj.d()) {
                    map.put(new defpackage.iyg(intent, qqeVar, 32768), ygwVarD);
                }
                map.put(new defpackage.iyg(intent, qqeVar, 0), ygwVar);
            }
            if (true != z2) {
                ygwVarD = ygwVar;
            }
            return ygwVarD;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    private final defpackage.yhx G() {
        boolean z;
        if (!defpackage.acqh.l() || android.os.Build.VERSION.SDK_INT < 37) {
            return g;
        }
        com.google.android.gms.car.CarInfo carInfo = this.d;
        if (carInfo == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1567)).u("CarInfo is null, not allowing video apps");
            return g;
        }
        defpackage.xlk xlkVar = this.v;
        if (defpackage.acpj.g() && xlkVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1566)).u("Primary display media codec type is null, not allowing video apps");
            return g;
        }
        boolean z2 = carInfo.e >= 6;
        if (defpackage.acpj.g()) {
            xlkVar.getClass();
            z = xlkVar.equals(defpackage.xlk.MEDIA_CODEC_VIDEO_H265);
        }
        boolean zN = N(carInfo);
        ((defpackage.yqj) a.l().ai(1565)).R("isPdk6OorAbove: %s, isH265: %s, devHU: %s", java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(zN));
        return ((z2 && z) || zN) ? h : g;
    }

    private final void H(defpackage.zbf zbfVar, java.lang.String str) {
        defpackage.jfo jfoVarR = r();
        if (jfoVarR == null) {
            return;
        }
        android.util.Pair pairCreate = android.util.Pair.create(zbfVar, str);
        java.util.Set set = this.x;
        if (set.contains(pairCreate) || set.size() >= 100) {
            return;
        }
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.CAR_PROJECTION_VALIDATOR, defpackage.zbd.rj);
        rrvVarH.v(zbfVar);
        rrvVarH.g(str);
        jfoVarR.b(rrvVarH.l());
        set.add(pairCreate);
    }

    private final boolean I() {
        return N(this.d);
    }

    private final boolean J() {
        return this.s.getSharedPreferences("carservice", 0).getBoolean("allow_unknown_sources", false);
    }

    private final boolean K() {
        return !I();
    }

    private final boolean L(java.lang.String str, defpackage.qqe qqeVar, boolean z, boolean z2) {
        return z(str, qqeVar, z, z2, false, qqeVar == defpackage.qqe.j ? G() : null);
    }

    private final boolean M(j$.util.Optional optional, j$.util.Optional optional2, java.lang.String str, defpackage.qqe qqeVar) throws android.content.pm.PackageManager.NameNotFoundException {
        if (qqeVar == defpackage.qqe.a) {
            ((defpackage.yqj) a.l().ai((char) 1618)).y("Skip meta-data checks; OEM application type [%s]", str);
            return true;
        }
        if (i.contains(str) && ((defpackage.slj) this.c.a()).b(str)) {
            ((defpackage.yqj) a.l().ai((char) 1617)).y("Skip meta-data checks; first-party skip list [%s]", str);
            return true;
        }
        android.content.res.XmlResourceParser xmlResourceParserB = B(optional, optional2, str);
        if (xmlResourceParserB == null) {
            return false;
        }
        try {
            int iOrdinal = defpackage.qqe.f.ordinal();
            for (int next = xmlResourceParserB.next(); next != 1; next = xmlResourceParserB.next()) {
                if (next == 2 && "uses".equals(xmlResourceParserB.getName())) {
                    defpackage.qqe qqeVar2 = null;
                    java.lang.String attributeValue = xmlResourceParserB.getAttributeValue(null, "name");
                    int iOrdinal2 = -1;
                    if (!android.text.TextUtils.isEmpty(attributeValue)) {
                        defpackage.qqe[] qqeVarArrValues = defpackage.qqe.values();
                        for (int length = qqeVarArrValues.length - 1; length >= 0; length--) {
                            defpackage.qqe qqeVar3 = qqeVarArrValues[length];
                            if (qqeVar3.name().equalsIgnoreCase(attributeValue)) {
                                qqeVar2 = qqeVar3;
                                break;
                            }
                        }
                    }
                    if (qqeVar2 != null) {
                        iOrdinal2 = qqeVar2.ordinal();
                    }
                    if (iOrdinal2 == qqeVar.ordinal()) {
                        return true;
                    }
                    if (qqeVar == defpackage.qqe.e && iOrdinal2 == iOrdinal) {
                        return true;
                    }
                }
            }
            return false;
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
            ((defpackage.yqj) a.l().ai((char) 1614)).y("Resource not parsable [%s]", str);
            return false;
        }
    }

    private static final boolean N(com.google.android.gms.car.CarInfo carInfo) {
        if (carInfo != null) {
            boolean z = defpackage.sli.a;
            if (!"user".equals(android.os.Build.TYPE) && j$.util.Objects.equals(carInfo.a, "Google") && j$.util.Objects.equals(carInfo.b, "Emulator")) {
                return true;
            }
            if (defpackage.acnc.f()) {
                return (j$.util.Objects.equals(carInfo.i, "Google") && j$.util.Objects.equals(carInfo.j, "tangorpro [AAR]")) || (j$.util.Objects.equals(carInfo.i, "Panasonic") && j$.util.Objects.equals(carInfo.j, "Seahawk [AAR]")) || (j$.util.Objects.equals(carInfo.a, "Google") && j$.util.Objects.equals(carInfo.b, "Desktop Head Unit"));
            }
        }
        return false;
    }

    public static synchronized defpackage.iyh q(android.content.Context context) {
        defpackage.iyh iyhVar;
        int i2 = 1;
        if (l == 0) {
            android.content.Context applicationContext = context.getApplicationContext();
            k = new defpackage.iyh(applicationContext, new defpackage.kpm(applicationContext, i2));
        }
        iyhVar = k;
        iyhVar.getClass();
        l++;
        return iyhVar;
    }

    public static java.lang.String s(android.content.pm.ResolveInfo resolveInfo) {
        return (resolveInfo.serviceInfo == null || android.text.TextUtils.isEmpty(resolveInfo.serviceInfo.packageName)) ? resolveInfo.activityInfo.packageName : resolveInfo.serviceInfo.packageName;
    }

    public static synchronized void v() {
        int i2 = l;
        if (i2 > 0) {
            int i3 = i2 - 1;
            l = i3;
            if (i3 == 0) {
                k.getClass();
                k = null;
            }
        }
    }

    @Override // defpackage.iyc
    public final defpackage.ygw a(defpackage.qqe qqeVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        java.util.Iterator<android.content.pm.ResolveInfo> it = this.s.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            android.content.pm.ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null) {
                arrayList.add(new android.content.ComponentName(activityInfo.packageName, activityInfo.name));
            }
        }
        int i2 = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            android.content.ComponentName componentName = (android.content.ComponentName) arrayList.get(i3);
            try {
                if (M(j$.util.Optional.empty(), j$.util.Optional.empty(), componentName.getPackageName(), qqeVar)) {
                    ygrVar.i(componentName);
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1564)).y("Package not included because it wasn't found [%s]", componentName.getPackageName());
            }
        }
        return ygrVar.g();
    }

    @Override // defpackage.iyc
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.ygw b(android.content.Intent intent, defpackage.qqe qqeVar) {
        defpackage.ill.e();
        return C(intent, qqeVar, true);
    }

    @Override // defpackage.iyc
    public final defpackage.ygw c(android.content.Intent intent) {
        defpackage.ill.e();
        return E(intent, true);
    }

    @Override // defpackage.iyc
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.ygw d(android.content.Intent intent) {
        return E(intent, false);
    }

    @Override // defpackage.iyc
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.ygw e(android.content.Intent intent, defpackage.qqe qqeVar) {
        int i2 = true != defpackage.acpj.d() ? 32768 : 0;
        return K() ? F(intent, qqeVar, true, i2) : D(intent, qqeVar, true, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iyc
    public final void f(java.io.PrintWriter printWriter) {
        printWriter.println("unknownSourcesEnabled=" + J());
        printWriter.println("Dumping denied packages");
        for (android.util.Pair pair : this.x) {
            printWriter.println(java.lang.String.format(java.util.Locale.US, "pgk=%s error=%s", pair.second, ((defpackage.zbf) pair.first).name()));
        }
        printWriter.println("CarInfo: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.d))));
        printWriter.println("Primary Display Media Codec Type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.v))));
        synchronized (this.e) {
            printWriter.println("Dumping Cached packages");
            java.util.Map map = this.z;
            for (defpackage.iyg iygVar : map.keySet()) {
                printWriter.println(iygVar.toString());
                defpackage.you youVarListIterator = ((defpackage.ygw) map.get(iygVar)).listIterator(0);
                while (youVarListIterator.hasNext()) {
                    printWriter.println(((android.content.pm.ResolveInfo) youVarListIterator.next()).toString());
                }
            }
        }
    }

    @Override // defpackage.iyc
    public final void g(java.lang.String str) {
        if (defpackage.acpj.a.fF().b()) {
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.r;
        if (copyOnWriteArrayList.contains(str)) {
            return;
        }
        try {
            this.s.getPackageManager().setApplicationEnabledSetting(str, 1, 1);
            copyOnWriteArrayList.add(str);
        } catch (java.lang.IllegalArgumentException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 1560)).y("Failed to enable Application %s", str);
        }
    }

    @Override // defpackage.iyc
    public final void h() {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 1619)).u("onProjectionSessionEnd");
        w();
        this.t.set(new java.lang.ref.WeakReference(null));
        synchronized (this.e) {
            this.z.clear();
        }
        defpackage.iyf iyfVar = this.y;
        android.content.Context context = this.s;
        context.getClass();
        ((defpackage.yqj) yqmVar.l().ai((char) 1555)).u("unbinding from play service");
        defpackage.sqf.a().c(context, iyfVar);
        iyfVar.a = false;
        iyfVar.c = null;
    }

    @Override // defpackage.iyc
    public final void i(defpackage.jfo jfoVar) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 1620)).u("onProjectionSessionStart");
        w();
        this.t.set(new java.lang.ref.WeakReference(jfoVar));
        android.content.Context context = this.s;
        context.getClass();
        defpackage.iyf iyfVar = this.y;
        if (iyfVar.a || iyfVar.c != null) {
            ((defpackage.yqj) yqmVar.l().ai((char) 1550)).u("ignoring bind play service request, already connected or connecting");
            return;
        }
        try {
            iyfVar.a = defpackage.sqf.a().d(context, new android.content.Intent().setComponent(defpackage.iyj.a), iyfVar, 1);
        } catch (java.lang.SecurityException e) {
            yqmVar = a;
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).p(e)).ai((char) 1552)).u("Exception binding to Play Store.");
            iyfVar.b.t(defpackage.zbd.rm);
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 1551)).y("binding to play service s=%b", java.lang.Boolean.valueOf(iyfVar.a));
    }

    @Override // defpackage.iyc
    public final void j(com.google.android.gms.car.CarInfo carInfo) {
        this.d = carInfo;
    }

    @Override // defpackage.iyc
    public final void k(com.google.android.gms.car.CarUiInfo carUiInfo) {
        this.u = carUiInfo;
    }

    @Override // defpackage.iyc
    public final void l(defpackage.xlk xlkVar) {
        this.v = xlkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iyc
    public final boolean m(java.lang.String str) {
        int i2;
        defpackage.ygw ygwVar = b;
        int i3 = ((defpackage.ymx) ygwVar).c;
        int i4 = 0;
        while (i4 < i3) {
            defpackage.iyg iygVar = (defpackage.iyg) ygwVar.get(i4);
            defpackage.ygw ygwVarE = e(iygVar.a, iygVar.b);
            int size = ygwVarE.size();
            int i5 = 0;
            while (true) {
                i2 = i4 + 1;
                if (i5 < size) {
                    java.lang.String strS = s((android.content.pm.ResolveInfo) ygwVarE.get(i5));
                    if (strS != null && j$.util.Objects.equals(strS, str)) {
                        return true;
                    }
                    i5++;
                }
            }
            i4 = i2;
        }
        return false;
    }

    @Override // defpackage.iyc
    public final boolean n(java.lang.String str, defpackage.qqe qqeVar) {
        defpackage.ill.e();
        return L(str, qqeVar, true, true);
    }

    @Override // defpackage.iyc
    public final boolean o(java.lang.String str, defpackage.qqe qqeVar) {
        defpackage.ill.e();
        return L(str, qqeVar, true, false);
    }

    @Override // defpackage.iyc
    public final boolean p(java.lang.String str, defpackage.qqe qqeVar) {
        return L(str, qqeVar, false, true);
    }

    public final defpackage.jfo r() {
        defpackage.jfo jfoVar = (defpackage.jfo) ((java.lang.ref.WeakReference) this.t.get()).get();
        if (jfoVar == null || !jfoVar.h()) {
            return null;
        }
        return jfoVar;
    }

    public final void t(defpackage.zbd zbdVar) {
        defpackage.jfo jfoVarR = r();
        if (jfoVarR == null) {
            return;
        }
        jfoVarR.b(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.CAR_PROJECTION_VALIDATOR, zbdVar).l());
    }

    public final void u(defpackage.zbf zbfVar, java.lang.String str) {
        if (defpackage.acpj.e()) {
            H(zbfVar, str);
        }
    }

    final void w() {
        this.x.clear();
    }

    public final boolean x(android.content.pm.ComponentInfo componentInfo) {
        int componentEnabledSetting = this.s.getPackageManager().getComponentEnabledSetting(new android.content.ComponentName(componentInfo.packageName, componentInfo.name));
        if (componentEnabledSetting != 1) {
            return componentEnabledSetting == 0 && componentInfo.enabled;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0177  */
    /* JADX WARN: Code duplicated, block: B:102:0x017c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0182  */
    /* JADX WARN: Code duplicated, block: B:107:0x0185 A[Catch: IOException | XmlPullParserException -> 0x0313, IOException | XmlPullParserException -> 0x0313, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d4 A[Catch: IOException | XmlPullParserException -> 0x0313, IOException | XmlPullParserException -> 0x0313, TRY_LEAVE, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:132:0x021c A[Catch: IOException | XmlPullParserException -> 0x0313, IOException | XmlPullParserException -> 0x0313, PHI: r7
  0x021c: PHI (r7v3 java.lang.Boolean) = (r7v1 java.lang.Boolean), (r7v6 java.lang.Boolean), (r7v1 java.lang.Boolean) binds: [B:23:0x003d, B:29:0x004a, B:27:0x0047] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:134:0x022e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x0230 A[Catch: IOException | XmlPullParserException -> 0x0313, IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0236  */
    /* JADX WARN: Code duplicated, block: B:138:0x0238  */
    /* JADX WARN: Code duplicated, block: B:140:0x023c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0244 A[Catch: IOException | XmlPullParserException -> 0x0313, IOException | XmlPullParserException -> 0x0313, TRY_LEAVE, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:147:0x025b  */
    /* JADX WARN: Code duplicated, block: B:149:0x0263  */
    /* JADX WARN: Code duplicated, block: B:150:0x0265  */
    /* JADX WARN: Code duplicated, block: B:152:0x026d  */
    /* JADX WARN: Code duplicated, block: B:153:0x026f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0277  */
    /* JADX WARN: Code duplicated, block: B:156:0x0279  */
    /* JADX WARN: Code duplicated, block: B:158:0x0281  */
    /* JADX WARN: Code duplicated, block: B:159:0x0283  */
    /* JADX WARN: Code duplicated, block: B:161:0x028b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0290  */
    /* JADX WARN: Code duplicated, block: B:166:0x0293  */
    /* JADX WARN: Code duplicated, block: B:168:0x0296  */
    /* JADX WARN: Code duplicated, block: B:170:0x0299  */
    /* JADX WARN: Code duplicated, block: B:172:0x029e A[Catch: IOException | XmlPullParserException -> 0x0313, IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:173:0x02a3 A[Catch: IOException | XmlPullParserException -> 0x0313, IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:174:0x02a9 A[Catch: IOException | XmlPullParserException -> 0x0313, IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:175:0x02b0 A[Catch: IOException | XmlPullParserException -> 0x0313, IOException | XmlPullParserException -> 0x0313, TRY_LEAVE, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:178:0x02b9 A[LOOP:3: B:141:0x023e->B:178:0x02b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x02e0 A[PHI: r7 r16 r17
  0x02e0: PHI (r7v4 java.lang.Boolean) = (r7v3 java.lang.Boolean), (r7v3 java.lang.Boolean), (r7v3 java.lang.Boolean), (r7v8 java.lang.Boolean) binds: [B:133:0x022c, B:139:0x023a, B:137:0x0236, B:131:0x0216] A[DONT_GENERATE, DONT_INLINE]
  0x02e0: PHI (r16v7 boolean) = (r16v6 boolean), (r16v6 boolean), (r16v6 boolean), (r16v9 boolean) binds: [B:133:0x022c, B:139:0x023a, B:137:0x0236, B:131:0x0216] A[DONT_GENERATE, DONT_INLINE]
  0x02e0: PHI (r17v5 java.lang.Boolean) = (r17v2 java.lang.Boolean), (r17v4 java.lang.Boolean), (r17v2 java.lang.Boolean), (r17v7 java.lang.Boolean) binds: [B:133:0x022c, B:139:0x023a, B:137:0x0236, B:131:0x0216] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:237:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fc A[Catch: IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0103 A[Catch: IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0106 A[Catch: IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0109 A[Catch: IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0110 A[Catch: IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:80:0x012d A[Catch: IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0134 A[Catch: IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:82:0x013b A[Catch: IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0158  */
    /* JADX WARN: Code duplicated, block: B:87:0x015a  */
    /* JADX WARN: Code duplicated, block: B:88:0x015c  */
    /* JADX WARN: Code duplicated, block: B:89:0x015f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0161  */
    /* JADX WARN: Code duplicated, block: B:91:0x0163  */
    /* JADX WARN: Code duplicated, block: B:92:0x0166  */
    /* JADX WARN: Code duplicated, block: B:93:0x0168  */
    /* JADX WARN: Code duplicated, block: B:94:0x016b  */
    /* JADX WARN: Code duplicated, block: B:95:0x016d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0174  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x0110, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser] */
    final boolean y(j$.util.Optional optional, j$.util.Optional optional2, java.lang.String str, com.google.android.gms.car.CarInfo carInfo, com.google.android.gms.car.CarUiInfo carUiInfo) {
        boolean z;
        java.lang.Boolean bool;
        ?? r0;
        boolean z2;
        java.lang.String strD;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        java.lang.String attributeValue;
        ?? r19;
        int i5;
        java.lang.String str2;
        boolean zContains;
        boolean z5 = false;
        try {
            ?? B = B(optional, optional2, str);
            if (B == 0) {
                return true;
            }
            try {
                int next = B.next();
                while (next != 1 && !"head-unit-whitelist".equals(B.getName())) {
                    next = B.next();
                }
                if (next == 1) {
                    return true;
                }
                if (carInfo == null && carUiInfo == null) {
                    return false;
                }
                java.lang.Boolean boolValueOf = null;
                java.lang.Boolean boolValueOf2 = null;
                for (int i6 = 1; next != i6; i6 = 1) {
                    if (next != 2) {
                        z = z5;
                    } else if ("car-info".equals(B.getName())) {
                        if (boolValueOf != null) {
                            if (boolValueOf.booleanValue()) {
                            }
                            z = z5;
                            bool = boolValueOf2;
                            if (!"car-ui-info".equals(B.getName())) {
                                if (bool == null) {
                                    if (bool.booleanValue()) {
                                    }
                                    boolValueOf2 = bool;
                                } else {
                                    bool = null;
                                }
                                if (carUiInfo != null) {
                                    r0 = z;
                                    while (true) {
                                        if (r0 < B.getAttributeCount()) {
                                            strD = xxj.c.d(xxj.e, B.getAttributeName(r0));
                                            switch (strD.hashCode()) {
                                                case -861240527:
                                                    if (!strD.equals("HAS_TOUCH_SCREEN")) {
                                                        throw new java.lang.IllegalArgumentException();
                                                    }
                                                    i2 = 2;
                                                    i3 = i2 - 1;
                                                    if (i3 == 0) {
                                                        z3 = carUiInfo.a;
                                                    } else if (i3 == 1) {
                                                        z3 = carUiInfo.b;
                                                    } else if (i3 == 2) {
                                                        z3 = carUiInfo.c;
                                                    } else if (i3 != 3) {
                                                        z3 = carUiInfo.f;
                                                    } else {
                                                        z3 = carUiInfo.d;
                                                    }
                                                    if (!z3) {
                                                        r0++;
                                                    } else {
                                                        z2 = z;
                                                    }
                                                    break;
                                                    break;
                                                case -642125595:
                                                    if (!strD.equals("HAS_ROTARY_CONTROLLER")) {
                                                        throw new java.lang.IllegalArgumentException();
                                                    }
                                                    i2 = 1;
                                                    i3 = i2 - 1;
                                                    if (i3 == 0) {
                                                        z3 = carUiInfo.a;
                                                    } else if (i3 == 1) {
                                                        z3 = carUiInfo.b;
                                                    } else if (i3 == 2) {
                                                        z3 = carUiInfo.c;
                                                    } else if (i3 != 3) {
                                                        z3 = carUiInfo.f;
                                                    } else {
                                                        z3 = carUiInfo.d;
                                                    }
                                                    if (!z3) {
                                                        z2 = z;
                                                    } else {
                                                        r0++;
                                                    }
                                                    break;
                                                    break;
                                                case -535308301:
                                                    if (!strD.equals("HAS_D_PAD")) {
                                                        throw new java.lang.IllegalArgumentException();
                                                    }
                                                    i2 = 5;
                                                    i3 = i2 - 1;
                                                    if (i3 == 0) {
                                                        z3 = carUiInfo.a;
                                                    } else if (i3 == 1) {
                                                        z3 = carUiInfo.b;
                                                    } else if (i3 == 2) {
                                                        z3 = carUiInfo.c;
                                                    } else if (i3 != 3) {
                                                        z3 = carUiInfo.f;
                                                    } else {
                                                        z3 = carUiInfo.d;
                                                    }
                                                    if (!z3) {
                                                        z2 = z;
                                                    } else {
                                                        r0++;
                                                    }
                                                    break;
                                                    break;
                                                case 559129059:
                                                    if (!strD.equals("HAS_TOUCHPAD_FOR_UI_NAVIGATION")) {
                                                        throw new java.lang.IllegalArgumentException();
                                                    }
                                                    i2 = 4;
                                                    i3 = i2 - 1;
                                                    if (i3 == 0) {
                                                        z3 = carUiInfo.a;
                                                    } else if (i3 == 1) {
                                                        z3 = carUiInfo.b;
                                                    } else if (i3 == 2) {
                                                        z3 = carUiInfo.c;
                                                    } else if (i3 != 3) {
                                                        z3 = carUiInfo.f;
                                                    } else {
                                                        z3 = carUiInfo.d;
                                                    }
                                                    if (!z3) {
                                                        z2 = z;
                                                    } else {
                                                        r0++;
                                                    }
                                                    break;
                                                    break;
                                                case 2052594852:
                                                    if (!strD.equals("HAS_SEARCH_BUTTON")) {
                                                        throw new java.lang.IllegalArgumentException();
                                                    }
                                                    i2 = 3;
                                                    i3 = i2 - 1;
                                                    if (i3 == 0) {
                                                        z3 = carUiInfo.a;
                                                    } else if (i3 == 1) {
                                                        z3 = carUiInfo.b;
                                                    } else if (i3 == 2) {
                                                        z3 = carUiInfo.c;
                                                    } else if (i3 != 3) {
                                                        z3 = carUiInfo.f;
                                                    } else {
                                                        z3 = carUiInfo.d;
                                                    }
                                                    if (!z3) {
                                                        z2 = z;
                                                    } else {
                                                        r0++;
                                                    }
                                                    break;
                                                    break;
                                                default:
                                                    throw new java.lang.IllegalArgumentException();
                                            }
                                        } else {
                                            z2 = true;
                                        }
                                        boolValueOf2 = java.lang.Boolean.valueOf(z2);
                                    }
                                } else {
                                    boolValueOf2 = bool;
                                }
                            } else {
                                boolValueOf2 = bool;
                            }
                        } else {
                            boolValueOf = null;
                        }
                        if (carInfo != null) {
                            ?? r1 = z5;
                            while (true) {
                                if (r1 < B.getAttributeCount()) {
                                    java.lang.String strD2 = xxj.c.d(xxj.e, B.getAttributeName(r1));
                                    try {
                                        z = z5;
                                        java.lang.String str3 = "HEAD_UNIT_MODEL";
                                        bool = boolValueOf2;
                                        switch (strD2.hashCode()) {
                                            case -2088886230:
                                                if (strD2.equals("HEAD_UNIT_MAKE")) {
                                                    i4 = 8;
                                                    try {
                                                        attributeValue = B.getAttributeValue(r1);
                                                        r19 = r1;
                                                        i5 = i4 - 1;
                                                        switch (i5) {
                                                            case defpackage.abnt.b /* 0 */:
                                                                str2 = carInfo.a;
                                                                break;
                                                            case 1:
                                                            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                                str2 = carInfo.b;
                                                                break;
                                                            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                                str2 = carInfo.c;
                                                                break;
                                                            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                str2 = carInfo.e + "." + carInfo.f;
                                                                break;
                                                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                str2 = carInfo.i;
                                                                break;
                                                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                                str2 = carInfo.j;
                                                                break;
                                                            case 9:
                                                                str2 = carInfo.k;
                                                                break;
                                                            default:
                                                                str2 = carInfo.l;
                                                                break;
                                                        }
                                                        if (str2 != null) {
                                                            if (i5 != 2) {
                                                                try {
                                                                    if (i5 != 3) {
                                                                        if (i5 != 4) {
                                                                            if (i5 != 5) {
                                                                                if (i5 != 6) {
                                                                                    zContains = str2.equalsIgnoreCase(attributeValue);
                                                                                }
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) >= 0) {
                                                                                z5 = z;
                                                                                boolValueOf2 = bool;
                                                                                r1 = (r19 == true ? 1 : 0) + 1;
                                                                                break;
                                                                            }
                                                                        } catch (java.lang.NumberFormatException e) {
                                                                            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 1546)).u("NumberFormatException while matching attribute.");
                                                                        }
                                                                    }
                                                                    if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) == 0) {
                                                                        z5 = z;
                                                                        boolValueOf2 = bool;
                                                                        r1 = (r19 == true ? 1 : 0) + 1;
                                                                        break;
                                                                    }
                                                                } catch (java.lang.NumberFormatException e2) {
                                                                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e2)).ai((char) 1545)).u("NumberFormatException while matching attribute.");
                                                                }
                                                            } else {
                                                                zContains = str2.toLowerCase(java.util.Locale.US).contains(attributeValue.toLowerCase(java.util.Locale.US));
                                                            }
                                                            if (zContains) {
                                                                z5 = z;
                                                                boolValueOf2 = bool;
                                                                r1 = (r19 == true ? 1 : 0) + 1;
                                                                break;
                                                            }
                                                        } else {
                                                            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(1547);
                                                            switch (i4) {
                                                                case 1:
                                                                    str3 = "MANUFACTURER";
                                                                    break;
                                                                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                                    str3 = "MODEL";
                                                                    break;
                                                                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                                    str3 = "MODEL_CONTAINS";
                                                                    break;
                                                                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                                    str3 = "MODEL_YEAR";
                                                                    break;
                                                                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                                    str3 = "MIN_MODEL_YEAR";
                                                                    break;
                                                                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                    str3 = "PROTOCOL_VERSION";
                                                                    break;
                                                                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                    str3 = "MIN_PROTOCOL_VERSION";
                                                                    break;
                                                                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                                    str3 = "HEAD_UNIT_MAKE";
                                                                    break;
                                                                case 9:
                                                                    break;
                                                                case 10:
                                                                    str3 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                                    break;
                                                                default:
                                                                    str3 = "HEAD_UNIT_SOFTWARE_VERSION";
                                                                    break;
                                                            }
                                                            yqjVar.M("Trying to find a match for [%s: %s] but corresponding CarInfo value is null. Assuming not a match.", str3, attributeValue);
                                                        }
                                                        z4 = z;
                                                    } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
                                                    }
                                                }
                                                try {
                                                    throw new java.lang.IllegalArgumentException();
                                                } catch (java.lang.IllegalArgumentException unused2) {
                                                    ((defpackage.yqj) a.l().ai(1548)).y("Unknown enum value: %s", strD2);
                                                    z4 = z;
                                                    boolValueOf = java.lang.Boolean.valueOf(z4);
                                                    boolValueOf2 = bool;
                                                    next = B.next();
                                                    z5 = z;
                                                }
                                                break;
                                            case -2087653134:
                                                if (strD2.equals("HEAD_UNIT_SOFTWARE_BUILD")) {
                                                    i4 = 10;
                                                    attributeValue = B.getAttributeValue(r1);
                                                    r19 = r1;
                                                    i5 = i4 - 1;
                                                    switch (i5) {
                                                        case defpackage.abnt.b /* 0 */:
                                                            str2 = carInfo.a;
                                                            break;
                                                        case 1:
                                                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                            str2 = carInfo.b;
                                                            break;
                                                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                            str2 = carInfo.c;
                                                            break;
                                                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                            str2 = carInfo.e + "." + carInfo.f;
                                                            break;
                                                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                            str2 = carInfo.i;
                                                            break;
                                                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                            str2 = carInfo.j;
                                                            break;
                                                        case 9:
                                                            str2 = carInfo.k;
                                                            break;
                                                        default:
                                                            str2 = carInfo.l;
                                                            break;
                                                    }
                                                    if (str2 != null) {
                                                        if (i5 != 2) {
                                                            if (i5 != 3) {
                                                                if (i5 != 4) {
                                                                    if (i5 != 5) {
                                                                        if (i5 != 6) {
                                                                            zContains = str2.equalsIgnoreCase(attributeValue);
                                                                        }
                                                                    }
                                                                }
                                                                if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) >= 0) {
                                                                    z5 = z;
                                                                    boolValueOf2 = bool;
                                                                    r1 = (r19 == true ? 1 : 0) + 1;
                                                                    break;
                                                                }
                                                            }
                                                            if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) == 0) {
                                                                z5 = z;
                                                                boolValueOf2 = bool;
                                                                r1 = (r19 == true ? 1 : 0) + 1;
                                                                break;
                                                            }
                                                        } else {
                                                            zContains = str2.toLowerCase(java.util.Locale.US).contains(attributeValue.toLowerCase(java.util.Locale.US));
                                                        }
                                                        if (zContains) {
                                                            z5 = z;
                                                            boolValueOf2 = bool;
                                                            r1 = (r19 == true ? 1 : 0) + 1;
                                                            break;
                                                        }
                                                    } else {
                                                        defpackage.yqj yqjVar2 = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(1547);
                                                        switch (i4) {
                                                            case 1:
                                                                str3 = "MANUFACTURER";
                                                                break;
                                                            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                                str3 = "MODEL";
                                                                break;
                                                            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                                str3 = "MODEL_CONTAINS";
                                                                break;
                                                            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                                str3 = "MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                                str3 = "MIN_MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                str3 = "PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                str3 = "MIN_PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                                str3 = "HEAD_UNIT_MAKE";
                                                                break;
                                                            case 9:
                                                                break;
                                                            case 10:
                                                                str3 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                                break;
                                                            default:
                                                                str3 = "HEAD_UNIT_SOFTWARE_VERSION";
                                                                break;
                                                        }
                                                        yqjVar2.M("Trying to find a match for [%s: %s] but corresponding CarInfo value is null. Assuming not a match.", str3, attributeValue);
                                                    }
                                                    z4 = z;
                                                    break;
                                                }
                                                throw new java.lang.IllegalArgumentException();
                                            case -1675119693:
                                                if (strD2.equals("MODEL_YEAR")) {
                                                    i4 = 4;
                                                    attributeValue = B.getAttributeValue(r1);
                                                    r19 = r1;
                                                    i5 = i4 - 1;
                                                    switch (i5) {
                                                        case defpackage.abnt.b /* 0 */:
                                                            str2 = carInfo.a;
                                                            break;
                                                        case 1:
                                                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                            str2 = carInfo.b;
                                                            break;
                                                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                            str2 = carInfo.c;
                                                            break;
                                                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                            str2 = carInfo.e + "." + carInfo.f;
                                                            break;
                                                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                            str2 = carInfo.i;
                                                            break;
                                                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                            str2 = carInfo.j;
                                                            break;
                                                        case 9:
                                                            str2 = carInfo.k;
                                                            break;
                                                        default:
                                                            str2 = carInfo.l;
                                                            break;
                                                    }
                                                    if (str2 != null) {
                                                        if (i5 != 2) {
                                                            if (i5 != 3) {
                                                                if (i5 != 4) {
                                                                    if (i5 != 5) {
                                                                        if (i5 != 6) {
                                                                            zContains = str2.equalsIgnoreCase(attributeValue);
                                                                        }
                                                                    }
                                                                }
                                                                if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) >= 0) {
                                                                    z5 = z;
                                                                    boolValueOf2 = bool;
                                                                    r1 = (r19 == true ? 1 : 0) + 1;
                                                                    break;
                                                                }
                                                            }
                                                            if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) == 0) {
                                                                z5 = z;
                                                                boolValueOf2 = bool;
                                                                r1 = (r19 == true ? 1 : 0) + 1;
                                                                break;
                                                            }
                                                        } else {
                                                            zContains = str2.toLowerCase(java.util.Locale.US).contains(attributeValue.toLowerCase(java.util.Locale.US));
                                                        }
                                                        if (zContains) {
                                                            z5 = z;
                                                            boolValueOf2 = bool;
                                                            r1 = (r19 == true ? 1 : 0) + 1;
                                                            break;
                                                        }
                                                    } else {
                                                        defpackage.yqj yqjVar3 = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(1547);
                                                        switch (i4) {
                                                            case 1:
                                                                str3 = "MANUFACTURER";
                                                                break;
                                                            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                                str3 = "MODEL";
                                                                break;
                                                            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                                str3 = "MODEL_CONTAINS";
                                                                break;
                                                            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                                str3 = "MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                                str3 = "MIN_MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                str3 = "PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                str3 = "MIN_PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                                str3 = "HEAD_UNIT_MAKE";
                                                                break;
                                                            case 9:
                                                                break;
                                                            case 10:
                                                                str3 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                                break;
                                                            default:
                                                                str3 = "HEAD_UNIT_SOFTWARE_VERSION";
                                                                break;
                                                        }
                                                        yqjVar3.M("Trying to find a match for [%s: %s] but corresponding CarInfo value is null. Assuming not a match.", str3, attributeValue);
                                                    }
                                                    z4 = z;
                                                    break;
                                                }
                                                throw new java.lang.IllegalArgumentException();
                                            case -951798255:
                                                if (strD2.equals("PROTOCOL_VERSION")) {
                                                    i4 = 6;
                                                    attributeValue = B.getAttributeValue(r1);
                                                    r19 = r1;
                                                    i5 = i4 - 1;
                                                    switch (i5) {
                                                        case defpackage.abnt.b /* 0 */:
                                                            str2 = carInfo.a;
                                                            break;
                                                        case 1:
                                                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                            str2 = carInfo.b;
                                                            break;
                                                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                            str2 = carInfo.c;
                                                            break;
                                                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                            str2 = carInfo.e + "." + carInfo.f;
                                                            break;
                                                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                            str2 = carInfo.i;
                                                            break;
                                                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                            str2 = carInfo.j;
                                                            break;
                                                        case 9:
                                                            str2 = carInfo.k;
                                                            break;
                                                        default:
                                                            str2 = carInfo.l;
                                                            break;
                                                    }
                                                    if (str2 != null) {
                                                        if (i5 != 2) {
                                                            if (i5 != 3) {
                                                                if (i5 != 4) {
                                                                    if (i5 != 5) {
                                                                        if (i5 != 6) {
                                                                            zContains = str2.equalsIgnoreCase(attributeValue);
                                                                        }
                                                                    }
                                                                }
                                                                if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) >= 0) {
                                                                    z5 = z;
                                                                    boolValueOf2 = bool;
                                                                    r1 = (r19 == true ? 1 : 0) + 1;
                                                                    break;
                                                                }
                                                            }
                                                            if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) == 0) {
                                                                z5 = z;
                                                                boolValueOf2 = bool;
                                                                r1 = (r19 == true ? 1 : 0) + 1;
                                                                break;
                                                            }
                                                        } else {
                                                            zContains = str2.toLowerCase(java.util.Locale.US).contains(attributeValue.toLowerCase(java.util.Locale.US));
                                                        }
                                                        if (zContains) {
                                                            z5 = z;
                                                            boolValueOf2 = bool;
                                                            r1 = (r19 == true ? 1 : 0) + 1;
                                                            break;
                                                        }
                                                    } else {
                                                        defpackage.yqj yqjVar4 = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(1547);
                                                        switch (i4) {
                                                            case 1:
                                                                str3 = "MANUFACTURER";
                                                                break;
                                                            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                                str3 = "MODEL";
                                                                break;
                                                            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                                str3 = "MODEL_CONTAINS";
                                                                break;
                                                            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                                str3 = "MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                                str3 = "MIN_MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                str3 = "PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                str3 = "MIN_PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                                str3 = "HEAD_UNIT_MAKE";
                                                                break;
                                                            case 9:
                                                                break;
                                                            case 10:
                                                                str3 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                                break;
                                                            default:
                                                                str3 = "HEAD_UNIT_SOFTWARE_VERSION";
                                                                break;
                                                        }
                                                        yqjVar4.M("Trying to find a match for [%s: %s] but corresponding CarInfo value is null. Assuming not a match.", str3, attributeValue);
                                                    }
                                                    z4 = z;
                                                    break;
                                                }
                                                throw new java.lang.IllegalArgumentException();
                                            case -364268964:
                                                if (strD2.equals("HEAD_UNIT_SOFTWARE_VERSION")) {
                                                    i4 = 11;
                                                    attributeValue = B.getAttributeValue(r1);
                                                    r19 = r1;
                                                    i5 = i4 - 1;
                                                    switch (i5) {
                                                        case defpackage.abnt.b /* 0 */:
                                                            str2 = carInfo.a;
                                                            break;
                                                        case 1:
                                                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                            str2 = carInfo.b;
                                                            break;
                                                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                            str2 = carInfo.c;
                                                            break;
                                                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                            str2 = carInfo.e + "." + carInfo.f;
                                                            break;
                                                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                            str2 = carInfo.i;
                                                            break;
                                                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                            str2 = carInfo.j;
                                                            break;
                                                        case 9:
                                                            str2 = carInfo.k;
                                                            break;
                                                        default:
                                                            str2 = carInfo.l;
                                                            break;
                                                    }
                                                    if (str2 != null) {
                                                        if (i5 != 2) {
                                                            if (i5 != 3) {
                                                                if (i5 != 4) {
                                                                    if (i5 != 5) {
                                                                        if (i5 != 6) {
                                                                            zContains = str2.equalsIgnoreCase(attributeValue);
                                                                        }
                                                                    }
                                                                }
                                                                if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) >= 0) {
                                                                    z5 = z;
                                                                    boolValueOf2 = bool;
                                                                    r1 = (r19 == true ? 1 : 0) + 1;
                                                                    break;
                                                                }
                                                            }
                                                            if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) == 0) {
                                                                z5 = z;
                                                                boolValueOf2 = bool;
                                                                r1 = (r19 == true ? 1 : 0) + 1;
                                                                break;
                                                            }
                                                        } else {
                                                            zContains = str2.toLowerCase(java.util.Locale.US).contains(attributeValue.toLowerCase(java.util.Locale.US));
                                                        }
                                                        if (zContains) {
                                                            z5 = z;
                                                            boolValueOf2 = bool;
                                                            r1 = (r19 == true ? 1 : 0) + 1;
                                                            break;
                                                        }
                                                    } else {
                                                        defpackage.yqj yqjVar5 = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(1547);
                                                        switch (i4) {
                                                            case 1:
                                                                str3 = "MANUFACTURER";
                                                                break;
                                                            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                                str3 = "MODEL";
                                                                break;
                                                            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                                str3 = "MODEL_CONTAINS";
                                                                break;
                                                            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                                str3 = "MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                                str3 = "MIN_MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                str3 = "PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                str3 = "MIN_PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                                str3 = "HEAD_UNIT_MAKE";
                                                                break;
                                                            case 9:
                                                                break;
                                                            case 10:
                                                                str3 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                                break;
                                                            default:
                                                                str3 = "HEAD_UNIT_SOFTWARE_VERSION";
                                                                break;
                                                        }
                                                        yqjVar5.M("Trying to find a match for [%s: %s] but corresponding CarInfo value is null. Assuming not a match.", str3, attributeValue);
                                                    }
                                                    z4 = z;
                                                    break;
                                                }
                                                throw new java.lang.IllegalArgumentException();
                                            case -335259522:
                                                if (strD2.equals("MIN_PROTOCOL_VERSION")) {
                                                    i4 = 7;
                                                    attributeValue = B.getAttributeValue(r1);
                                                    r19 = r1;
                                                    i5 = i4 - 1;
                                                    switch (i5) {
                                                        case defpackage.abnt.b /* 0 */:
                                                            str2 = carInfo.a;
                                                            break;
                                                        case 1:
                                                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                            str2 = carInfo.b;
                                                            break;
                                                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                            str2 = carInfo.c;
                                                            break;
                                                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                            str2 = carInfo.e + "." + carInfo.f;
                                                            break;
                                                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                            str2 = carInfo.i;
                                                            break;
                                                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                            str2 = carInfo.j;
                                                            break;
                                                        case 9:
                                                            str2 = carInfo.k;
                                                            break;
                                                        default:
                                                            str2 = carInfo.l;
                                                            break;
                                                    }
                                                    if (str2 != null) {
                                                        if (i5 != 2) {
                                                            if (i5 != 3) {
                                                                if (i5 != 4) {
                                                                    if (i5 != 5) {
                                                                        if (i5 != 6) {
                                                                            zContains = str2.equalsIgnoreCase(attributeValue);
                                                                        }
                                                                    }
                                                                }
                                                                if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) >= 0) {
                                                                    z5 = z;
                                                                    boolValueOf2 = bool;
                                                                    r1 = (r19 == true ? 1 : 0) + 1;
                                                                    break;
                                                                }
                                                            }
                                                            if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) == 0) {
                                                                z5 = z;
                                                                boolValueOf2 = bool;
                                                                r1 = (r19 == true ? 1 : 0) + 1;
                                                                break;
                                                            }
                                                        } else {
                                                            zContains = str2.toLowerCase(java.util.Locale.US).contains(attributeValue.toLowerCase(java.util.Locale.US));
                                                        }
                                                        if (zContains) {
                                                            z5 = z;
                                                            boolValueOf2 = bool;
                                                            r1 = (r19 == true ? 1 : 0) + 1;
                                                            break;
                                                        }
                                                    } else {
                                                        defpackage.yqj yqjVar6 = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(1547);
                                                        switch (i4) {
                                                            case 1:
                                                                str3 = "MANUFACTURER";
                                                                break;
                                                            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                                str3 = "MODEL";
                                                                break;
                                                            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                                str3 = "MODEL_CONTAINS";
                                                                break;
                                                            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                                str3 = "MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                                str3 = "MIN_MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                str3 = "PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                str3 = "MIN_PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                                str3 = "HEAD_UNIT_MAKE";
                                                                break;
                                                            case 9:
                                                                break;
                                                            case 10:
                                                                str3 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                                break;
                                                            default:
                                                                str3 = "HEAD_UNIT_SOFTWARE_VERSION";
                                                                break;
                                                        }
                                                        yqjVar6.M("Trying to find a match for [%s: %s] but corresponding CarInfo value is null. Assuming not a match.", str3, attributeValue);
                                                    }
                                                    z4 = z;
                                                    break;
                                                }
                                                throw new java.lang.IllegalArgumentException();
                                            case -330553267:
                                                if (strD2.equals("HEAD_UNIT_MODEL")) {
                                                    i4 = 9;
                                                    attributeValue = B.getAttributeValue(r1);
                                                    r19 = r1;
                                                    i5 = i4 - 1;
                                                    switch (i5) {
                                                        case defpackage.abnt.b /* 0 */:
                                                            str2 = carInfo.a;
                                                            break;
                                                        case 1:
                                                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                            str2 = carInfo.b;
                                                            break;
                                                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                            str2 = carInfo.c;
                                                            break;
                                                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                            str2 = carInfo.e + "." + carInfo.f;
                                                            break;
                                                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                            str2 = carInfo.i;
                                                            break;
                                                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                            str2 = carInfo.j;
                                                            break;
                                                        case 9:
                                                            str2 = carInfo.k;
                                                            break;
                                                        default:
                                                            str2 = carInfo.l;
                                                            break;
                                                    }
                                                    if (str2 != null) {
                                                        if (i5 != 2) {
                                                            if (i5 != 3) {
                                                                if (i5 != 4) {
                                                                    if (i5 != 5) {
                                                                        if (i5 != 6) {
                                                                            zContains = str2.equalsIgnoreCase(attributeValue);
                                                                        }
                                                                    }
                                                                }
                                                                if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) >= 0) {
                                                                    z5 = z;
                                                                    boolValueOf2 = bool;
                                                                    r1 = (r19 == true ? 1 : 0) + 1;
                                                                    break;
                                                                }
                                                            }
                                                            if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) == 0) {
                                                                z5 = z;
                                                                boolValueOf2 = bool;
                                                                r1 = (r19 == true ? 1 : 0) + 1;
                                                                break;
                                                            }
                                                        } else {
                                                            zContains = str2.toLowerCase(java.util.Locale.US).contains(attributeValue.toLowerCase(java.util.Locale.US));
                                                        }
                                                        if (zContains) {
                                                            z5 = z;
                                                            boolValueOf2 = bool;
                                                            r1 = (r19 == true ? 1 : 0) + 1;
                                                            break;
                                                        }
                                                    } else {
                                                        defpackage.yqj yqjVar7 = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(1547);
                                                        switch (i4) {
                                                            case 1:
                                                                str3 = "MANUFACTURER";
                                                                break;
                                                            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                                str3 = "MODEL";
                                                                break;
                                                            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                                str3 = "MODEL_CONTAINS";
                                                                break;
                                                            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                                str3 = "MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                                str3 = "MIN_MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                str3 = "PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                str3 = "MIN_PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                                str3 = "HEAD_UNIT_MAKE";
                                                                break;
                                                            case 9:
                                                                break;
                                                            case 10:
                                                                str3 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                                break;
                                                            default:
                                                                str3 = "HEAD_UNIT_SOFTWARE_VERSION";
                                                                break;
                                                        }
                                                        yqjVar7.M("Trying to find a match for [%s: %s] but corresponding CarInfo value is null. Assuming not a match.", str3, attributeValue);
                                                    }
                                                    z4 = z;
                                                    break;
                                                }
                                                throw new java.lang.IllegalArgumentException();
                                            case 73532169:
                                                if (strD2.equals("MODEL")) {
                                                    i4 = 2;
                                                    attributeValue = B.getAttributeValue(r1);
                                                    r19 = r1;
                                                    i5 = i4 - 1;
                                                    switch (i5) {
                                                        case defpackage.abnt.b /* 0 */:
                                                            str2 = carInfo.a;
                                                            break;
                                                        case 1:
                                                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                            str2 = carInfo.b;
                                                            break;
                                                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                            str2 = carInfo.c;
                                                            break;
                                                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                            str2 = carInfo.e + "." + carInfo.f;
                                                            break;
                                                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                            str2 = carInfo.i;
                                                            break;
                                                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                            str2 = carInfo.j;
                                                            break;
                                                        case 9:
                                                            str2 = carInfo.k;
                                                            break;
                                                        default:
                                                            str2 = carInfo.l;
                                                            break;
                                                    }
                                                    if (str2 != null) {
                                                        if (i5 != 2) {
                                                            if (i5 != 3) {
                                                                if (i5 != 4) {
                                                                    if (i5 != 5) {
                                                                        if (i5 != 6) {
                                                                            zContains = str2.equalsIgnoreCase(attributeValue);
                                                                        }
                                                                    }
                                                                }
                                                                if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) >= 0) {
                                                                    z5 = z;
                                                                    boolValueOf2 = bool;
                                                                    r1 = (r19 == true ? 1 : 0) + 1;
                                                                    break;
                                                                }
                                                            }
                                                            if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) == 0) {
                                                                z5 = z;
                                                                boolValueOf2 = bool;
                                                                r1 = (r19 == true ? 1 : 0) + 1;
                                                                break;
                                                            }
                                                        } else {
                                                            zContains = str2.toLowerCase(java.util.Locale.US).contains(attributeValue.toLowerCase(java.util.Locale.US));
                                                        }
                                                        if (zContains) {
                                                            z5 = z;
                                                            boolValueOf2 = bool;
                                                            r1 = (r19 == true ? 1 : 0) + 1;
                                                            break;
                                                        }
                                                    } else {
                                                        defpackage.yqj yqjVar8 = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(1547);
                                                        switch (i4) {
                                                            case 1:
                                                                str3 = "MANUFACTURER";
                                                                break;
                                                            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                                str3 = "MODEL";
                                                                break;
                                                            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                                str3 = "MODEL_CONTAINS";
                                                                break;
                                                            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                                str3 = "MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                                str3 = "MIN_MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                str3 = "PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                str3 = "MIN_PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                                str3 = "HEAD_UNIT_MAKE";
                                                                break;
                                                            case 9:
                                                                break;
                                                            case 10:
                                                                str3 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                                break;
                                                            default:
                                                                str3 = "HEAD_UNIT_SOFTWARE_VERSION";
                                                                break;
                                                        }
                                                        yqjVar8.M("Trying to find a match for [%s: %s] but corresponding CarInfo value is null. Assuming not a match.", str3, attributeValue);
                                                    }
                                                    z4 = z;
                                                    break;
                                                }
                                                throw new java.lang.IllegalArgumentException();
                                            case 347933649:
                                                if (strD2.equals("MANUFACTURER")) {
                                                    i4 = 1;
                                                    attributeValue = B.getAttributeValue(r1);
                                                    r19 = r1;
                                                    i5 = i4 - 1;
                                                    switch (i5) {
                                                        case defpackage.abnt.b /* 0 */:
                                                            str2 = carInfo.a;
                                                            break;
                                                        case 1:
                                                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                            str2 = carInfo.b;
                                                            break;
                                                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                            str2 = carInfo.c;
                                                            break;
                                                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                            str2 = carInfo.e + "." + carInfo.f;
                                                            break;
                                                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                            str2 = carInfo.i;
                                                            break;
                                                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                            str2 = carInfo.j;
                                                            break;
                                                        case 9:
                                                            str2 = carInfo.k;
                                                            break;
                                                        default:
                                                            str2 = carInfo.l;
                                                            break;
                                                    }
                                                    if (str2 != null) {
                                                        if (i5 != 2) {
                                                            if (i5 != 3) {
                                                                if (i5 != 4) {
                                                                    if (i5 != 5) {
                                                                        if (i5 != 6) {
                                                                            zContains = str2.equalsIgnoreCase(attributeValue);
                                                                        }
                                                                    }
                                                                }
                                                                if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) >= 0) {
                                                                    z5 = z;
                                                                    boolValueOf2 = bool;
                                                                    r1 = (r19 == true ? 1 : 0) + 1;
                                                                    break;
                                                                }
                                                            }
                                                            if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) == 0) {
                                                                z5 = z;
                                                                boolValueOf2 = bool;
                                                                r1 = (r19 == true ? 1 : 0) + 1;
                                                                break;
                                                            }
                                                        } else {
                                                            zContains = str2.toLowerCase(java.util.Locale.US).contains(attributeValue.toLowerCase(java.util.Locale.US));
                                                        }
                                                        if (zContains) {
                                                            z5 = z;
                                                            boolValueOf2 = bool;
                                                            r1 = (r19 == true ? 1 : 0) + 1;
                                                            break;
                                                        }
                                                    } else {
                                                        defpackage.yqj yqjVar9 = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(1547);
                                                        switch (i4) {
                                                            case 1:
                                                                str3 = "MANUFACTURER";
                                                                break;
                                                            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                                str3 = "MODEL";
                                                                break;
                                                            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                                str3 = "MODEL_CONTAINS";
                                                                break;
                                                            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                                str3 = "MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                                str3 = "MIN_MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                str3 = "PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                str3 = "MIN_PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                                str3 = "HEAD_UNIT_MAKE";
                                                                break;
                                                            case 9:
                                                                break;
                                                            case 10:
                                                                str3 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                                break;
                                                            default:
                                                                str3 = "HEAD_UNIT_SOFTWARE_VERSION";
                                                                break;
                                                        }
                                                        yqjVar9.M("Trying to find a match for [%s: %s] but corresponding CarInfo value is null. Assuming not a match.", str3, attributeValue);
                                                    }
                                                    z4 = z;
                                                    break;
                                                }
                                                throw new java.lang.IllegalArgumentException();
                                            case 674819040:
                                                if (strD2.equals("MIN_MODEL_YEAR")) {
                                                    i4 = 5;
                                                    attributeValue = B.getAttributeValue(r1);
                                                    r19 = r1;
                                                    i5 = i4 - 1;
                                                    switch (i5) {
                                                        case defpackage.abnt.b /* 0 */:
                                                            str2 = carInfo.a;
                                                            break;
                                                        case 1:
                                                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                            str2 = carInfo.b;
                                                            break;
                                                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                            str2 = carInfo.c;
                                                            break;
                                                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                            str2 = carInfo.e + "." + carInfo.f;
                                                            break;
                                                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                            str2 = carInfo.i;
                                                            break;
                                                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                            str2 = carInfo.j;
                                                            break;
                                                        case 9:
                                                            str2 = carInfo.k;
                                                            break;
                                                        default:
                                                            str2 = carInfo.l;
                                                            break;
                                                    }
                                                    if (str2 != null) {
                                                        if (i5 != 2) {
                                                            if (i5 != 3) {
                                                                if (i5 != 4) {
                                                                    if (i5 != 5) {
                                                                        if (i5 != 6) {
                                                                            zContains = str2.equalsIgnoreCase(attributeValue);
                                                                        }
                                                                    }
                                                                }
                                                                if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) >= 0) {
                                                                    z5 = z;
                                                                    boolValueOf2 = bool;
                                                                    r1 = (r19 == true ? 1 : 0) + 1;
                                                                    break;
                                                                }
                                                            }
                                                            if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) == 0) {
                                                                z5 = z;
                                                                boolValueOf2 = bool;
                                                                r1 = (r19 == true ? 1 : 0) + 1;
                                                                break;
                                                            }
                                                        } else {
                                                            zContains = str2.toLowerCase(java.util.Locale.US).contains(attributeValue.toLowerCase(java.util.Locale.US));
                                                        }
                                                        if (zContains) {
                                                            z5 = z;
                                                            boolValueOf2 = bool;
                                                            r1 = (r19 == true ? 1 : 0) + 1;
                                                            break;
                                                        }
                                                    } else {
                                                        defpackage.yqj yqjVar10 = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(1547);
                                                        switch (i4) {
                                                            case 1:
                                                                str3 = "MANUFACTURER";
                                                                break;
                                                            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                                str3 = "MODEL";
                                                                break;
                                                            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                                str3 = "MODEL_CONTAINS";
                                                                break;
                                                            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                                str3 = "MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                                str3 = "MIN_MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                str3 = "PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                str3 = "MIN_PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                                str3 = "HEAD_UNIT_MAKE";
                                                                break;
                                                            case 9:
                                                                break;
                                                            case 10:
                                                                str3 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                                break;
                                                            default:
                                                                str3 = "HEAD_UNIT_SOFTWARE_VERSION";
                                                                break;
                                                        }
                                                        yqjVar10.M("Trying to find a match for [%s: %s] but corresponding CarInfo value is null. Assuming not a match.", str3, attributeValue);
                                                    }
                                                    z4 = z;
                                                    break;
                                                }
                                                throw new java.lang.IllegalArgumentException();
                                            case 1325330069:
                                                if (strD2.equals("MODEL_CONTAINS")) {
                                                    i4 = 3;
                                                    attributeValue = B.getAttributeValue(r1);
                                                    r19 = r1;
                                                    i5 = i4 - 1;
                                                    switch (i5) {
                                                        case defpackage.abnt.b /* 0 */:
                                                            str2 = carInfo.a;
                                                            break;
                                                        case 1:
                                                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                            str2 = carInfo.b;
                                                            break;
                                                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                            str2 = carInfo.c;
                                                            break;
                                                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                            str2 = carInfo.e + "." + carInfo.f;
                                                            break;
                                                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                            str2 = carInfo.i;
                                                            break;
                                                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                            str2 = carInfo.j;
                                                            break;
                                                        case 9:
                                                            str2 = carInfo.k;
                                                            break;
                                                        default:
                                                            str2 = carInfo.l;
                                                            break;
                                                    }
                                                    if (str2 != null) {
                                                        if (i5 != 2) {
                                                            if (i5 != 3) {
                                                                if (i5 != 4) {
                                                                    if (i5 != 5) {
                                                                        if (i5 != 6) {
                                                                            zContains = str2.equalsIgnoreCase(attributeValue);
                                                                        }
                                                                    }
                                                                }
                                                                if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) >= 0) {
                                                                    z5 = z;
                                                                    boolValueOf2 = bool;
                                                                    r1 = (r19 == true ? 1 : 0) + 1;
                                                                    break;
                                                                }
                                                            }
                                                            if (java.lang.Float.compare(java.lang.Float.valueOf(str2).floatValue(), java.lang.Float.valueOf(attributeValue).floatValue()) == 0) {
                                                                z5 = z;
                                                                boolValueOf2 = bool;
                                                                r1 = (r19 == true ? 1 : 0) + 1;
                                                                break;
                                                            }
                                                        } else {
                                                            zContains = str2.toLowerCase(java.util.Locale.US).contains(attributeValue.toLowerCase(java.util.Locale.US));
                                                        }
                                                        if (zContains) {
                                                            z5 = z;
                                                            boolValueOf2 = bool;
                                                            r1 = (r19 == true ? 1 : 0) + 1;
                                                            break;
                                                        }
                                                    } else {
                                                        defpackage.yqj yqjVar11 = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(1547);
                                                        switch (i4) {
                                                            case 1:
                                                                str3 = "MANUFACTURER";
                                                                break;
                                                            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                                                str3 = "MODEL";
                                                                break;
                                                            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                                                str3 = "MODEL_CONTAINS";
                                                                break;
                                                            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                                                str3 = "MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                                                str3 = "MIN_MODEL_YEAR";
                                                                break;
                                                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                str3 = "PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                                                str3 = "MIN_PROTOCOL_VERSION";
                                                                break;
                                                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                                                str3 = "HEAD_UNIT_MAKE";
                                                                break;
                                                            case 9:
                                                                break;
                                                            case 10:
                                                                str3 = "HEAD_UNIT_SOFTWARE_BUILD";
                                                                break;
                                                            default:
                                                                str3 = "HEAD_UNIT_SOFTWARE_VERSION";
                                                                break;
                                                        }
                                                        yqjVar11.M("Trying to find a match for [%s: %s] but corresponding CarInfo value is null. Assuming not a match.", str3, attributeValue);
                                                    }
                                                    z4 = z;
                                                    break;
                                                }
                                                throw new java.lang.IllegalArgumentException();
                                            default:
                                                throw new java.lang.IllegalArgumentException();
                                        }
                                    } catch (java.lang.IllegalArgumentException unused3) {
                                        z = z5;
                                        bool = boolValueOf2;
                                    }
                                } else {
                                    z = z5;
                                    bool = boolValueOf2;
                                    z4 = true;
                                }
                                boolValueOf = java.lang.Boolean.valueOf(z4);
                            }
                        } else {
                            z = z5;
                            bool = boolValueOf2;
                            if (!"car-ui-info".equals(B.getName())) {
                                if (bool == null) {
                                    bool = null;
                                } else if (bool.booleanValue()) {
                                }
                                if (carUiInfo != null) {
                                    r0 = z;
                                    while (true) {
                                        if (r0 < B.getAttributeCount()) {
                                            strD = xxj.c.d(xxj.e, B.getAttributeName(r0));
                                            switch (strD.hashCode()) {
                                                case -861240527:
                                                    if (!strD.equals("HAS_TOUCH_SCREEN")) {
                                                        throw new java.lang.IllegalArgumentException();
                                                    }
                                                    i2 = 2;
                                                    i3 = i2 - 1;
                                                    if (i3 == 0) {
                                                        z3 = carUiInfo.a;
                                                    } else if (i3 == 1) {
                                                        z3 = carUiInfo.b;
                                                    } else if (i3 == 2) {
                                                        z3 = carUiInfo.c;
                                                    } else if (i3 != 3) {
                                                        z3 = carUiInfo.f;
                                                    } else {
                                                        z3 = carUiInfo.d;
                                                    }
                                                    if (!z3) {
                                                        z2 = z;
                                                    } else {
                                                        r0++;
                                                    }
                                                    break;
                                                    break;
                                                case -642125595:
                                                    if (!strD.equals("HAS_ROTARY_CONTROLLER")) {
                                                        throw new java.lang.IllegalArgumentException();
                                                    }
                                                    i2 = 1;
                                                    i3 = i2 - 1;
                                                    if (i3 == 0) {
                                                        z3 = carUiInfo.a;
                                                    } else if (i3 == 1) {
                                                        z3 = carUiInfo.b;
                                                    } else if (i3 == 2) {
                                                        z3 = carUiInfo.c;
                                                    } else if (i3 != 3) {
                                                        z3 = carUiInfo.f;
                                                    } else {
                                                        z3 = carUiInfo.d;
                                                    }
                                                    if (!z3) {
                                                        z2 = z;
                                                    } else {
                                                        r0++;
                                                    }
                                                    break;
                                                    break;
                                                case -535308301:
                                                    if (!strD.equals("HAS_D_PAD")) {
                                                        throw new java.lang.IllegalArgumentException();
                                                    }
                                                    i2 = 5;
                                                    i3 = i2 - 1;
                                                    if (i3 == 0) {
                                                        z3 = carUiInfo.a;
                                                    } else if (i3 == 1) {
                                                        z3 = carUiInfo.b;
                                                    } else if (i3 == 2) {
                                                        z3 = carUiInfo.c;
                                                    } else if (i3 != 3) {
                                                        z3 = carUiInfo.f;
                                                    } else {
                                                        z3 = carUiInfo.d;
                                                    }
                                                    if (!z3) {
                                                        z2 = z;
                                                    } else {
                                                        r0++;
                                                    }
                                                    break;
                                                    break;
                                                case 559129059:
                                                    if (!strD.equals("HAS_TOUCHPAD_FOR_UI_NAVIGATION")) {
                                                        throw new java.lang.IllegalArgumentException();
                                                    }
                                                    i2 = 4;
                                                    i3 = i2 - 1;
                                                    if (i3 == 0) {
                                                        z3 = carUiInfo.a;
                                                    } else if (i3 == 1) {
                                                        z3 = carUiInfo.b;
                                                    } else if (i3 == 2) {
                                                        z3 = carUiInfo.c;
                                                    } else if (i3 != 3) {
                                                        z3 = carUiInfo.f;
                                                    } else {
                                                        z3 = carUiInfo.d;
                                                    }
                                                    if (!z3) {
                                                        z2 = z;
                                                    } else {
                                                        r0++;
                                                    }
                                                    break;
                                                    break;
                                                case 2052594852:
                                                    if (!strD.equals("HAS_SEARCH_BUTTON")) {
                                                        throw new java.lang.IllegalArgumentException();
                                                    }
                                                    i2 = 3;
                                                    i3 = i2 - 1;
                                                    if (i3 == 0) {
                                                        z3 = carUiInfo.a;
                                                    } else if (i3 == 1) {
                                                        z3 = carUiInfo.b;
                                                    } else if (i3 == 2) {
                                                        z3 = carUiInfo.c;
                                                    } else if (i3 != 3) {
                                                        z3 = carUiInfo.f;
                                                    } else {
                                                        z3 = carUiInfo.d;
                                                    }
                                                    if (!z3) {
                                                        z2 = z;
                                                    } else {
                                                        r0++;
                                                    }
                                                    break;
                                                    break;
                                                default:
                                                    throw new java.lang.IllegalArgumentException();
                                            }
                                        } else {
                                            z2 = true;
                                        }
                                        boolValueOf2 = java.lang.Boolean.valueOf(z2);
                                    }
                                }
                            }
                        }
                        boolValueOf2 = bool;
                    } else {
                        z = z5;
                        bool = boolValueOf2;
                        if (!"car-ui-info".equals(B.getName())) {
                            boolValueOf2 = bool;
                        } else {
                            if (bool == null) {
                                if (bool.booleanValue()) {
                                }
                                boolValueOf2 = bool;
                            } else {
                                bool = null;
                            }
                            if (carUiInfo != null) {
                                r0 = z;
                                while (true) {
                                    if (r0 < B.getAttributeCount()) {
                                        strD = xxj.c.d(xxj.e, B.getAttributeName(r0));
                                        try {
                                            switch (strD.hashCode()) {
                                                case -861240527:
                                                    if (!strD.equals("HAS_TOUCH_SCREEN")) {
                                                        try {
                                                            throw new java.lang.IllegalArgumentException();
                                                        } catch (java.lang.IllegalArgumentException unused4) {
                                                            ((defpackage.yqj) a.l().ai(1549)).y("Unknown enum value: %s", strD);
                                                            z2 = z;
                                                            boolValueOf2 = java.lang.Boolean.valueOf(z2);
                                                            next = B.next();
                                                            z5 = z;
                                                        }
                                                    } else {
                                                        i2 = 2;
                                                        i3 = i2 - 1;
                                                        if (i3 == 0) {
                                                            z3 = carUiInfo.a;
                                                        } else if (i3 == 1) {
                                                            z3 = carUiInfo.b;
                                                        } else if (i3 == 2) {
                                                            z3 = carUiInfo.c;
                                                        } else if (i3 != 3) {
                                                            z3 = carUiInfo.f;
                                                        } else {
                                                            z3 = carUiInfo.d;
                                                        }
                                                        if (!z3) {
                                                            r0++;
                                                        } else {
                                                            z2 = z;
                                                        }
                                                    }
                                                    break;
                                                case -642125595:
                                                    if (!strD.equals("HAS_ROTARY_CONTROLLER")) {
                                                        throw new java.lang.IllegalArgumentException();
                                                    }
                                                    i2 = 1;
                                                    i3 = i2 - 1;
                                                    if (i3 == 0) {
                                                        z3 = carUiInfo.a;
                                                    } else if (i3 == 1) {
                                                        z3 = carUiInfo.b;
                                                    } else if (i3 == 2) {
                                                        z3 = carUiInfo.c;
                                                    } else if (i3 != 3) {
                                                        z3 = carUiInfo.f;
                                                    } else {
                                                        z3 = carUiInfo.d;
                                                    }
                                                    if (!z3) {
                                                        z2 = z;
                                                    } else {
                                                        r0++;
                                                    }
                                                    break;
                                                    break;
                                                case -535308301:
                                                    if (!strD.equals("HAS_D_PAD")) {
                                                        throw new java.lang.IllegalArgumentException();
                                                    }
                                                    i2 = 5;
                                                    i3 = i2 - 1;
                                                    if (i3 == 0) {
                                                        z3 = carUiInfo.a;
                                                    } else if (i3 == 1) {
                                                        z3 = carUiInfo.b;
                                                    } else if (i3 == 2) {
                                                        z3 = carUiInfo.c;
                                                    } else if (i3 != 3) {
                                                        z3 = carUiInfo.f;
                                                    } else {
                                                        z3 = carUiInfo.d;
                                                    }
                                                    if (!z3) {
                                                        z2 = z;
                                                    } else {
                                                        r0++;
                                                    }
                                                    break;
                                                    break;
                                                case 559129059:
                                                    if (!strD.equals("HAS_TOUCHPAD_FOR_UI_NAVIGATION")) {
                                                        throw new java.lang.IllegalArgumentException();
                                                    }
                                                    i2 = 4;
                                                    i3 = i2 - 1;
                                                    if (i3 == 0) {
                                                        z3 = carUiInfo.a;
                                                    } else if (i3 == 1) {
                                                        z3 = carUiInfo.b;
                                                    } else if (i3 == 2) {
                                                        z3 = carUiInfo.c;
                                                    } else if (i3 != 3) {
                                                        z3 = carUiInfo.f;
                                                    } else {
                                                        z3 = carUiInfo.d;
                                                    }
                                                    if (!z3) {
                                                        z2 = z;
                                                    } else {
                                                        r0++;
                                                    }
                                                    break;
                                                    break;
                                                case 2052594852:
                                                    if (!strD.equals("HAS_SEARCH_BUTTON")) {
                                                        throw new java.lang.IllegalArgumentException();
                                                    }
                                                    i2 = 3;
                                                    i3 = i2 - 1;
                                                    if (i3 == 0) {
                                                        z3 = carUiInfo.a;
                                                    } else if (i3 == 1) {
                                                        z3 = carUiInfo.b;
                                                    } else if (i3 == 2) {
                                                        z3 = carUiInfo.c;
                                                    } else if (i3 != 3) {
                                                        z3 = carUiInfo.f;
                                                    } else {
                                                        z3 = carUiInfo.d;
                                                    }
                                                    if (!z3) {
                                                        z2 = z;
                                                    } else {
                                                        r0++;
                                                    }
                                                    break;
                                                    break;
                                                default:
                                                    throw new java.lang.IllegalArgumentException();
                                            }
                                        } catch (java.lang.IllegalArgumentException unused5) {
                                        }
                                    } else {
                                        z2 = true;
                                    }
                                    boolValueOf2 = java.lang.Boolean.valueOf(z2);
                                }
                            } else {
                                boolValueOf2 = bool;
                            }
                        }
                    }
                    next = B.next();
                    z5 = z;
                }
                boolean z6 = z5;
                java.lang.Boolean bool2 = boolValueOf2;
                if ((boolValueOf == null || boolValueOf.booleanValue()) && (bool2 == null || bool2.booleanValue())) {
                    return true;
                }
                return z6;
            } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused6) {
                z = z5;
            }
            ((defpackage.yqj) a.l().ai((char) 1576)).y("Resource not parsable [%s]", str);
            return z;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused7) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0206 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Code duplicated, block: B:102:0x0207  */
    /* JADX WARN: Code duplicated, block: B:107:0x021e  */
    /* JADX WARN: Code duplicated, block: B:110:0x023b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:111:0x023c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0247 A[Catch: all -> 0x046a, TryCatch #5 {, blocks: (B:113:0x023f, B:115:0x0247, B:117:0x0251, B:120:0x025c, B:122:0x025f, B:123:0x0277), top: B:228:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0251 A[Catch: all -> 0x046a, TryCatch #5 {, blocks: (B:113:0x023f, B:115:0x0247, B:117:0x0251, B:120:0x025c, B:122:0x025f, B:123:0x0277), top: B:228:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0286  */
    /* JADX WARN: Code duplicated, block: B:129:0x0291  */
    /* JADX WARN: Code duplicated, block: B:131:0x0295  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:154:0x0349  */
    /* JADX WARN: Code duplicated, block: B:155:0x0352  */
    /* JADX WARN: Code duplicated, block: B:157:0x035b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x0406  */
    /* JADX WARN: Code duplicated, block: B:196:0x0408 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:198:0x040d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:199:0x040f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x0414  */
    /* JADX WARN: Code duplicated, block: B:203:0x0417  */
    /* JADX WARN: Code duplicated, block: B:205:0x0423  */
    /* JADX WARN: Code duplicated, block: B:214:0x046d  */
    /* JADX WARN: Code duplicated, block: B:226:0x03ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x023f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x02dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0104  */
    /* JADX WARN: Code duplicated, block: B:56:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x017f  */
    /* JADX WARN: Code duplicated, block: B:74:0x018e A[Catch: NameNotFoundException -> 0x0488, TRY_LEAVE, TryCatch #1 {NameNotFoundException -> 0x0488, blocks: (B:72:0x0188, B:74:0x018e), top: B:224:0x0188 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0197  */
    /* JADX WARN: Code duplicated, block: B:79:0x019f  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bb A[Catch: NameNotFoundException -> 0x01da, TryCatch #0 {NameNotFoundException -> 0x01da, blocks: (B:85:0x01ac, B:88:0x01bb, B:90:0x01bf), top: B:222:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01bf A[Catch: NameNotFoundException -> 0x01da, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x01da, blocks: (B:85:0x01ac, B:88:0x01bb, B:90:0x01bf), top: B:222:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:97:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x0202  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z(java.lang.String str, defpackage.qqe qqeVar, boolean z, boolean z2, boolean z3, defpackage.yhx yhxVar) {
        java.lang.String installerPackageName;
        boolean z4;
        int applicationEnabledSetting;
        java.util.Set set;
        int iA;
        java.lang.Integer numValueOf;
        android.content.res.Resources resourcesForApplication;
        boolean z5;
        defpackage.aba abaVar;
        android.util.Pair pair;
        defpackage.xzi xziVar;
        boolean z6;
        boolean zI;
        defpackage.aba abaVar2;
        defpackage.jfo jfoVarR;
        defpackage.zbd zbdVar;
        defpackage.rrv rrvVarH;
        qer qerVar;
        int i2;
        com.google.android.gms.car.CarInfo carInfo = this.d;
        com.google.android.gms.car.CarUiInfo carUiInfo = this.u;
        if (z) {
            android.os.StrictMode.noteSlowCall("CarProjectionValidator#isPackageAllowed3p");
        }
        defpackage.zkf zkfVar = new defpackage.zkf(defpackage.zke.a, str);
        boolean z7 = false;
        if (str == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1605)).u("Package DENIED; null package name");
            H(defpackage.zbf.PACKAGE_NULL, null);
            return false;
        }
        android.content.pm.PackageManager packageManager = this.s.getPackageManager();
        try {
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            int iM = a$.ExternalSyntheticApiModelOutline2.m(packageManager, str, 0);
            int i3 = packageManager.getPackageInfo(str, 0).versionCode;
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                android.content.pm.InstallSourceInfo installSourceInfoM = bgp$.ExternalSyntheticApiModelOutline0.m(packageManager, str);
                installerPackageName = bgp$.ExternalSyntheticApiModelOutline0.m(installSourceInfoM);
                if ("com.google.android.packageinstaller".equals(installerPackageName)) {
                    installerPackageName = bgp$.ExternalSyntheticApiModelOutline0.m$1(installSourceInfoM);
                }
            } else {
                installerPackageName = packageManager.getInstallerPackageName(str);
            }
            if (defpackage.acpj.a.fF().a()) {
                applicationEnabledSetting = packageManager.getApplicationEnabledSetting(str);
                if (applicationEnabledSetting != 1) {
                    if (applicationEnabledSetting == 0) {
                        z7 = false;
                        try {
                            if (applicationInfo.enabled) {
                                z7 = true;
                                z4 = true;
                                i2 = 0;
                            } else {
                                z4 = true;
                                i2 = 0;
                                z7 = false;
                            }
                        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1604)).y("Package DENIED; package not found [%s]", zkfVar);
                            u(defpackage.zbf.PACKAGE_NOT_FOUND, str);
                            return z7;
                        }
                    } else {
                        z4 = true;
                    }
                    if (z3) {
                        if (z7 && i2 != 4) {
                            z7 = z7;
                        }
                    }
                    if (!z7) {
                        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(1603)).K("Package DENIED; package is disabled [%s]; PackageEnabledSetting [%d]", str, applicationEnabledSetting);
                        return z7;
                    }
                    long j2 = i3;
                    set = (java.util.Set) ((defpackage.iyo) this.o.fF()).c.get(str);
                    if (set == null && j$.util.Collection.-EL.stream(set).anyMatch(new iym(installerPackageName, j2))) {
                        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1602)).y("Package DENIED; block listed [%s]", zkfVar);
                        u(defpackage.zbf.PACKAGE_BLACKLISTED, str);
                        return z7;
                    }
                    if (!str.equals("com.android.vending") && ((java.lang.Boolean) this.q.fF()).booleanValue() && qqeVar == defpackage.qqe.e) {
                        return z4;
                    }
                    if (defpackage.a.O() && qqeVar == defpackage.qqe.j) {
                        if (!defpackage.kmv.e(defpackage.acqh.e(), str) || (defpackage.acqh.k() && defpackage.kmv.c(defpackage.acqh.d(), str))) {
                            ((defpackage.yqj) a.l().ai((char) 1600)).y("Package is allowed native app [%s]", zkfVar);
                        } else {
                            if (yhxVar == null || !yhxVar.contains(java.lang.Integer.valueOf(ep$.ExternalSyntheticApiModelOutline1.m(applicationInfo)))) {
                                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(1577)).D("Package DENIED; Not allowed native app %s [%s]", ep$.ExternalSyntheticApiModelOutline1.m(applicationInfo), zkfVar);
                                return z7;
                            }
                            ((defpackage.yqj) a.l().ai(1578)).D("Package is allowed native app category %s [%s]", ep$.ExternalSyntheticApiModelOutline1.m(applicationInfo), zkfVar);
                        }
                    }
                    try {
                        iA = A(str);
                        if (iA != 0) {
                            numValueOf = java.lang.Integer.valueOf(iA);
                            resourcesForApplication = packageManager.getResourcesForApplication(str);
                        } else {
                            numValueOf = null;
                            resourcesForApplication = null;
                        }
                        if (defpackage.a.O() || qqeVar != defpackage.qqe.j) {
                            z5 = z7;
                        } else {
                            z5 = z4;
                        }
                        if (z2 && !z5) {
                            try {
                                if (!M(j$.util.Optional.ofNullable(resourcesForApplication), j$.util.Optional.ofNullable(numValueOf), str, qqeVar)) {
                                    if (qqeVar != defpackage.qqe.b) {
                                        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(1597)).M("Package DENIED; Uses for %s not defined [%s]", qqeVar, zkfVar);
                                        u(defpackage.zbf.PACKAGE_DOES_NOT_DECLARE_USES, str);
                                    }
                                    return z7;
                                }
                            } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1595)).y("Package DENIED; package not found [%s]", zkfVar);
                                u(defpackage.zbf.PACKAGE_NOT_FOUND, str);
                                return z7;
                            }
                        }
                        if (I()) {
                            return z4;
                        }
                        if (!y(j$.util.Optional.ofNullable(resourcesForApplication), j$.util.Optional.ofNullable(numValueOf), str, carInfo, carUiInfo)) {
                            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(1581)).M("Package DENIED; Should not run on HU [%s] [%s]", carInfo, zkfVar);
                            H(defpackage.zbf.PACKAGE_NOT_WHITELISTED_ON_HU, str);
                            return z7;
                        }
                        if (!this.p || ((defpackage.slj) this.c.a()).b(str)) {
                            return z4;
                        }
                        if ("com.google.android.projection.gearhead".equals(str)) {
                            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1591)).y("Package is not a first party package [%s]", "com.google.android.projection.gearhead");
                        }
                        if (((defpackage.yhx) this.n.fF()).contains(installerPackageName)) {
                            return z4;
                        }
                        abaVar = this.w;
                        synchronized (abaVar) {
                            pair = (android.util.Pair) abaVar.get(str);
                            if (pair != null) {
                                if (iM == ((java.lang.Integer) pair.first).intValue() && i3 == ((java.lang.Integer) pair.second).intValue()) {
                                    return z4;
                                }
                                abaVar.remove(str);
                                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(1607)).y("Removing cached value for %s", str);
                            }
                            xziVar = this.q;
                            if (((java.lang.Boolean) xziVar.fF()).booleanValue() || !"com.android.vending".equals(installerPackageName)) {
                                z6 = z7;
                            } else {
                                z6 = z4;
                            }
                            if (z) {
                                if (defpackage.acpj.a.fF().d()) {
                                    defpackage.tgg.a.b(defpackage.tgf.GEARHEAD_CAR_PROJECTION_VALIDATOR_PLAY_STORE_IS_PACKAGE_INSTALLED_BY_PLAY);
                                }
                                defpackage.ill.e();
                                if (((java.lang.Boolean) xziVar.fF()).booleanValue()) {
                                    qerVar = this.y.c;
                                    if (qerVar == null) {
                                        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1608)).u("isPackageInstalledByPlayCheck service not connected");
                                    } else {
                                        try {
                                            android.os.Parcel parcelFp = qerVar.fp();
                                            parcelFp.writeString(str);
                                            android.os.Parcel parcelFq = qerVar.fq(z4 ? 1 : 0, parcelFp);
                                            android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcelFq, android.os.Bundle.CREATOR);
                                            parcelFq.recycle();
                                            zI = bundle.getBoolean("Finsky.IsValid");
                                        } catch (android.os.RemoteException e) {
                                            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 1610)).u("Play store died");
                                            zI = z7;
                                        } catch (java.lang.SecurityException e2) {
                                            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e2)).ai((char) 1611)).u("SecurityException invoking remote Play Store method.");
                                            t(defpackage.zbd.rn);
                                            zI = z7;
                                        } catch (java.lang.RuntimeException e3) {
                                            if (!defpackage.acnc.h()) {
                                                throw e3;
                                            }
                                            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e3)).ai((char) 1612)).u("Swallowing Exception thrown by remote Play Store method.");
                                            t(defpackage.zbd.ro);
                                            zI = defpackage.acnc.i();
                                        }
                                        if (defpackage.acpj.a.fF().d()) {
                                            defpackage.tgg.a.d(defpackage.tgf.GEARHEAD_CAR_PROJECTION_VALIDATOR_PLAY_STORE_IS_PACKAGE_INSTALLED_BY_PLAY, 1);
                                        }
                                    }
                                } else {
                                    ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 1613)).u("Play store not google signed");
                                }
                                zI = z7;
                                if (defpackage.acpj.a.fF().d()) {
                                    defpackage.tgg.a.d(defpackage.tgf.GEARHEAD_CAR_PROJECTION_VALIDATOR_PLAY_STORE_IS_PACKAGE_INSTALLED_BY_PLAY, 1);
                                }
                            } else {
                                H(defpackage.zbf.SLOW_CALLS_NOT_ALLOWED, str);
                                zI = z7;
                            }
                            if (zI && !z6) {
                                if ("com.google.android.projection.gearhead".equals(str)) {
                                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1588)).y("Package is not installed by play [%s]", new defpackage.zkf(defpackage.zke.a, "com.google.android.projection.gearhead"));
                                }
                                java.util.Map map = this.m;
                                if (map.containsKey(str)) {
                                    java.lang.Long l2 = (java.lang.Long) map.get(str);
                                    long jLongValue = l2 == null ? 0L : l2.longValue();
                                    java.lang.Long.valueOf(jLongValue).getClass();
                                    if (j2 >= jLongValue) {
                                        android.content.pm.PackageManager packageManager2 = this.s.getPackageManager();
                                        defpackage.yot it = iyp.a.iterator();
                                        while (it.hasNext()) {
                                            if (iyp.a(packageManager2, str, (java.lang.String) it.next())) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                                if (J()) {
                                    if (j.contains(qqeVar)) {
                                        return true;
                                    }
                                    qqeVar.name();
                                }
                                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1585)).y("Package DENIED; failed all other checks [%s]", zkfVar);
                                H(defpackage.zbf.PACKAGE_FAILED_ALL_CHECKS, str);
                                return z7;
                            }
                            abaVar2 = this.w;
                            synchronized (abaVar2) {
                                abaVar2.put(str, new android.util.Pair(java.lang.Integer.valueOf(iM), java.lang.Integer.valueOf(i3)));
                            }
                            jfoVarR = r();
                            if (jfoVarR != null) {
                                if (!z6 && !zI) {
                                    zbdVar = defpackage.zbd.rl;
                                } else if (zI || z6) {
                                    zbdVar = null;
                                } else {
                                    zbdVar = defpackage.zbd.rk;
                                }
                                if (zbdVar != null) {
                                    rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.CAR_PROJECTION_VALIDATOR, zbdVar);
                                    if (rrvVarH.v == null) {
                                        rrvVarH.v = defpackage.zai.a.n();
                                    }
                                    defpackage.abor aborVar = rrvVarH.v;
                                    java.lang.String strValueOf = java.lang.String.valueOf(this.s.getPackageManager().getInstallerPackageName(str));
                                    aborVar.t();
                                    defpackage.zai zaiVar = (defpackage.zai) aborVar.b;
                                    defpackage.zai zaiVar2 = defpackage.zai.a;
                                    strValueOf.getClass();
                                    zaiVar.b |= 2;
                                    zaiVar.c = strValueOf;
                                    aborVar.t();
                                    defpackage.zai zaiVar3 = (defpackage.zai) aborVar.b;
                                    zaiVar3.b |= 4;
                                    zaiVar3.d = i3;
                                    jfoVarR.b(rrvVarH.l());
                                }
                            }
                            return true;
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1599)).y("Package DENIED; package not found [%s]", zkfVar);
                        u(defpackage.zbf.PACKAGE_NOT_FOUND, str);
                        return z7;
                    }
                }
                z7 = true;
                z4 = true;
                i2 = applicationEnabledSetting;
                if (z3) {
                    if (z7) {
                    }
                }
                if (!z7) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(1603)).K("Package DENIED; package is disabled [%s]; PackageEnabledSetting [%d]", str, applicationEnabledSetting);
                    return z7;
                }
                long j3 = i3;
                set = (java.util.Set) ((defpackage.iyo) this.o.fF()).c.get(str);
                if (set == null) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1602)).y("Package DENIED; block listed [%s]", zkfVar);
                    u(defpackage.zbf.PACKAGE_BLACKLISTED, str);
                    return z7;
                }
                if (!str.equals("com.android.vending")) {
                }
                if (defpackage.a.O()) {
                    if (defpackage.kmv.e(defpackage.acqh.e(), str)) {
                        ((defpackage.yqj) a.l().ai((char) 1600)).y("Package is allowed native app [%s]", zkfVar);
                    } else {
                        ((defpackage.yqj) a.l().ai((char) 1600)).y("Package is allowed native app [%s]", zkfVar);
                    }
                }
                iA = A(str);
                if (iA != 0) {
                    numValueOf = java.lang.Integer.valueOf(iA);
                    resourcesForApplication = packageManager.getResourcesForApplication(str);
                } else {
                    numValueOf = null;
                    resourcesForApplication = null;
                }
                if (defpackage.a.O()) {
                    z5 = z7;
                } else {
                    z5 = z7;
                }
                if (z2) {
                    if (!M(j$.util.Optional.ofNullable(resourcesForApplication), j$.util.Optional.ofNullable(numValueOf), str, qqeVar)) {
                        if (qqeVar != defpackage.qqe.b) {
                            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(1597)).M("Package DENIED; Uses for %s not defined [%s]", qqeVar, zkfVar);
                            u(defpackage.zbf.PACKAGE_DOES_NOT_DECLARE_USES, str);
                        }
                        return z7;
                    }
                }
                if (I()) {
                    return z4;
                }
                if (!y(j$.util.Optional.ofNullable(resourcesForApplication), j$.util.Optional.ofNullable(numValueOf), str, carInfo, carUiInfo)) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(1581)).M("Package DENIED; Should not run on HU [%s] [%s]", carInfo, zkfVar);
                    H(defpackage.zbf.PACKAGE_NOT_WHITELISTED_ON_HU, str);
                    return z7;
                }
                if (!this.p) {
                    return z4;
                }
                if ("com.google.android.projection.gearhead".equals(str)) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1591)).y("Package is not a first party package [%s]", "com.google.android.projection.gearhead");
                }
                if (((defpackage.yhx) this.n.fF()).contains(installerPackageName)) {
                    return z4;
                }
                abaVar = this.w;
                synchronized (abaVar) {
                    pair = (android.util.Pair) abaVar.get(str);
                    if (pair != null) {
                        if (iM == ((java.lang.Integer) pair.first).intValue()) {
                            return z4;
                        }
                        abaVar.remove(str);
                        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(1607)).y("Removing cached value for %s", str);
                    }
                    xziVar = this.q;
                    if (((java.lang.Boolean) xziVar.fF()).booleanValue()) {
                        z6 = z7;
                    } else {
                        z6 = z7;
                    }
                    if (z) {
                        if (defpackage.acpj.a.fF().d()) {
                            defpackage.tgg.a.b(defpackage.tgf.GEARHEAD_CAR_PROJECTION_VALIDATOR_PLAY_STORE_IS_PACKAGE_INSTALLED_BY_PLAY);
                        }
                        defpackage.ill.e();
                        if (((java.lang.Boolean) xziVar.fF()).booleanValue()) {
                            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 1613)).u("Play store not google signed");
                        } else {
                            qerVar = this.y.c;
                            if (qerVar == null) {
                                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1608)).u("isPackageInstalledByPlayCheck service not connected");
                            } else {
                                android.os.Parcel parcelFp2 = qerVar.fp();
                                parcelFp2.writeString(str);
                                android.os.Parcel parcelFq2 = qerVar.fq(z4 ? 1 : 0, parcelFp2);
                                android.os.Bundle bundle2 = (android.os.Bundle) defpackage.ijx.a(parcelFq2, android.os.Bundle.CREATOR);
                                parcelFq2.recycle();
                                zI = bundle2.getBoolean("Finsky.IsValid");
                                if (defpackage.acpj.a.fF().d()) {
                                    defpackage.tgg.a.d(defpackage.tgf.GEARHEAD_CAR_PROJECTION_VALIDATOR_PLAY_STORE_IS_PACKAGE_INSTALLED_BY_PLAY, 1);
                                }
                            }
                        }
                        zI = z7;
                        if (defpackage.acpj.a.fF().d()) {
                            defpackage.tgg.a.d(defpackage.tgf.GEARHEAD_CAR_PROJECTION_VALIDATOR_PLAY_STORE_IS_PACKAGE_INSTALLED_BY_PLAY, 1);
                        }
                    } else {
                        H(defpackage.zbf.SLOW_CALLS_NOT_ALLOWED, str);
                        zI = z7;
                    }
                    if (zI) {
                    }
                    abaVar2 = this.w;
                    synchronized (abaVar2) {
                        abaVar2.put(str, new android.util.Pair(java.lang.Integer.valueOf(iM), java.lang.Integer.valueOf(i3)));
                        jfoVarR = r();
                        if (jfoVarR != null) {
                            if (!z6) {
                                if (zI) {
                                    zbdVar = null;
                                } else {
                                    zbdVar = null;
                                }
                            } else if (zI) {
                                zbdVar = null;
                            } else {
                                zbdVar = null;
                            }
                            if (zbdVar != null) {
                                rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.CAR_PROJECTION_VALIDATOR, zbdVar);
                                if (rrvVarH.v == null) {
                                    rrvVarH.v = defpackage.zai.a.n();
                                }
                                defpackage.abor aborVar2 = rrvVarH.v;
                                java.lang.String strValueOf2 = java.lang.String.valueOf(this.s.getPackageManager().getInstallerPackageName(str));
                                aborVar2.t();
                                defpackage.zai zaiVar4 = (defpackage.zai) aborVar2.b;
                                defpackage.zai zaiVar5 = defpackage.zai.a;
                                strValueOf2.getClass();
                                zaiVar4.b |= 2;
                                zaiVar4.c = strValueOf2;
                                aborVar2.t();
                                defpackage.zai zaiVar6 = (defpackage.zai) aborVar2.b;
                                zaiVar6.b |= 4;
                                zaiVar6.d = i3;
                                jfoVarR.b(rrvVarH.l());
                            }
                        }
                        return true;
                    }
                }
            }
            z4 = true;
            z7 = false;
            applicationEnabledSetting = 0;
            z7 = z4;
            if (!z7) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(1603)).K("Package DENIED; package is disabled [%s]; PackageEnabledSetting [%d]", str, applicationEnabledSetting);
                return z7;
            }
            long j4 = i3;
            set = (java.util.Set) ((defpackage.iyo) this.o.fF()).c.get(str);
            if (set == null) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1602)).y("Package DENIED; block listed [%s]", zkfVar);
                u(defpackage.zbf.PACKAGE_BLACKLISTED, str);
                return z7;
            }
            if (!str.equals("com.android.vending")) {
            }
            if (defpackage.a.O()) {
                if (defpackage.kmv.e(defpackage.acqh.e(), str)) {
                    ((defpackage.yqj) a.l().ai((char) 1600)).y("Package is allowed native app [%s]", zkfVar);
                } else {
                    ((defpackage.yqj) a.l().ai((char) 1600)).y("Package is allowed native app [%s]", zkfVar);
                }
            }
            iA = A(str);
            if (iA != 0) {
                numValueOf = java.lang.Integer.valueOf(iA);
                resourcesForApplication = packageManager.getResourcesForApplication(str);
            } else {
                numValueOf = null;
                resourcesForApplication = null;
            }
            if (defpackage.a.O()) {
                z5 = z7;
            } else {
                z5 = z7;
            }
            if (z2) {
                if (!M(j$.util.Optional.ofNullable(resourcesForApplication), j$.util.Optional.ofNullable(numValueOf), str, qqeVar)) {
                    if (qqeVar != defpackage.qqe.b) {
                        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(1597)).M("Package DENIED; Uses for %s not defined [%s]", qqeVar, zkfVar);
                        u(defpackage.zbf.PACKAGE_DOES_NOT_DECLARE_USES, str);
                    }
                    return z7;
                }
            }
            if (I()) {
                return z4;
            }
            if (!y(j$.util.Optional.ofNullable(resourcesForApplication), j$.util.Optional.ofNullable(numValueOf), str, carInfo, carUiInfo)) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(1581)).M("Package DENIED; Should not run on HU [%s] [%s]", carInfo, zkfVar);
                H(defpackage.zbf.PACKAGE_NOT_WHITELISTED_ON_HU, str);
                return z7;
            }
            if (!this.p) {
                return z4;
            }
            if ("com.google.android.projection.gearhead".equals(str)) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1591)).y("Package is not a first party package [%s]", "com.google.android.projection.gearhead");
            }
            if (((defpackage.yhx) this.n.fF()).contains(installerPackageName)) {
                return z4;
            }
            abaVar = this.w;
            synchronized (abaVar) {
                pair = (android.util.Pair) abaVar.get(str);
                if (pair != null) {
                    if (iM == ((java.lang.Integer) pair.first).intValue()) {
                        return z4;
                    }
                    abaVar.remove(str);
                    ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(1607)).y("Removing cached value for %s", str);
                }
                xziVar = this.q;
                if (((java.lang.Boolean) xziVar.fF()).booleanValue()) {
                    z6 = z7;
                } else {
                    z6 = z7;
                }
                if (z) {
                    if (defpackage.acpj.a.fF().d()) {
                        defpackage.tgg.a.b(defpackage.tgf.GEARHEAD_CAR_PROJECTION_VALIDATOR_PLAY_STORE_IS_PACKAGE_INSTALLED_BY_PLAY);
                    }
                    defpackage.ill.e();
                    if (((java.lang.Boolean) xziVar.fF()).booleanValue()) {
                        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 1613)).u("Play store not google signed");
                    } else {
                        qerVar = this.y.c;
                        if (qerVar == null) {
                            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1608)).u("isPackageInstalledByPlayCheck service not connected");
                        } else {
                            android.os.Parcel parcelFp3 = qerVar.fp();
                            parcelFp3.writeString(str);
                            android.os.Parcel parcelFq3 = qerVar.fq(z4 ? 1 : 0, parcelFp3);
                            android.os.Bundle bundle3 = (android.os.Bundle) defpackage.ijx.a(parcelFq3, android.os.Bundle.CREATOR);
                            parcelFq3.recycle();
                            zI = bundle3.getBoolean("Finsky.IsValid");
                            if (defpackage.acpj.a.fF().d()) {
                                defpackage.tgg.a.d(defpackage.tgf.GEARHEAD_CAR_PROJECTION_VALIDATOR_PLAY_STORE_IS_PACKAGE_INSTALLED_BY_PLAY, 1);
                            }
                        }
                    }
                    zI = z7;
                    if (defpackage.acpj.a.fF().d()) {
                        defpackage.tgg.a.d(defpackage.tgf.GEARHEAD_CAR_PROJECTION_VALIDATOR_PLAY_STORE_IS_PACKAGE_INSTALLED_BY_PLAY, 1);
                    }
                } else {
                    H(defpackage.zbf.SLOW_CALLS_NOT_ALLOWED, str);
                    zI = z7;
                }
                if (zI) {
                }
                abaVar2 = this.w;
                synchronized (abaVar2) {
                    abaVar2.put(str, new android.util.Pair(java.lang.Integer.valueOf(iM), java.lang.Integer.valueOf(i3)));
                    jfoVarR = r();
                    if (jfoVarR != null) {
                        if (!z6) {
                            if (zI) {
                                zbdVar = null;
                            } else {
                                zbdVar = null;
                            }
                        } else if (zI) {
                            zbdVar = null;
                        } else {
                            zbdVar = null;
                        }
                        if (zbdVar != null) {
                            rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.CAR_PROJECTION_VALIDATOR, zbdVar);
                            if (rrvVarH.v == null) {
                                rrvVarH.v = defpackage.zai.a.n();
                            }
                            defpackage.abor aborVar3 = rrvVarH.v;
                            java.lang.String strValueOf3 = java.lang.String.valueOf(this.s.getPackageManager().getInstallerPackageName(str));
                            aborVar3.t();
                            defpackage.zai zaiVar7 = (defpackage.zai) aborVar3.b;
                            defpackage.zai zaiVar8 = defpackage.zai.a;
                            strValueOf3.getClass();
                            zaiVar7.b |= 2;
                            zaiVar7.c = strValueOf3;
                            aborVar3.t();
                            defpackage.zai zaiVar9 = (defpackage.zai) aborVar3.b;
                            zaiVar9.b |= 4;
                            zaiVar9.d = i3;
                            jfoVarR.b(rrvVarH.l());
                        }
                    }
                    return true;
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused4) {
            z7 = false;
        }
    }
}
