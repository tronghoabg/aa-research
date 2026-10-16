package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class eyx extends defpackage.affy implements defpackage.affc {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i) {
        super(1, obj, eyy.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
        this.a = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f2  */
    @Override // defpackage.affc
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) throws afbj {
        gah gahVarE;
        androidx.car.app.model.CarIcon icon;
        defpackage.qsh qshVarE;
        java.util.Collection collection;
        int i = 3;
        gcw gcwVarI = null;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                ((java.util.Set) obj).getClass();
                eyy eyyVar = (eyy) this.receiver;
                java.util.concurrent.locks.ReentrantLock reentrantLock = eyyVar.d;
                reentrantLock.lock();
                try {
                    java.util.List listAZ = defpackage.afga.aZ(eyyVar.c.values());
                    reentrantLock.unlock();
                    java.util.Iterator it = listAZ.iterator();
                    if (!it.hasNext()) {
                        return defpackage.afbk.a;
                    }
                    throw null;
                } catch (java.lang.Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 1:
                return ((aivc) this.receiver).a((defpackage.afdk) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                hmo hmoVar = (hmo) obj;
                hmoVar.getClass();
                ((hmq) this.receiver).b(hmoVar);
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((hsz) this.receiver).H(((java.lang.Number) obj).intValue());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((hsz) this.receiver).I((android.graphics.drawable.Drawable) obj);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((hsz) this.receiver).y(((java.lang.Number) obj).intValue());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((hsz) this.receiver).z((android.graphics.drawable.Drawable) obj);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((aiwn) ((defpackage.htw) this.receiver).a).gX((defpackage.afdk) obj);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                hrs hrsVar = (hrs) obj;
                hrsVar.getClass();
                jxg jxgVar = (jxg) this.receiver;
                if (hrsVar.a == 3) {
                    jxgVar.c.m(true);
                    jxgVar.t(hrsVar);
                } else {
                    java.lang.Object obj2 = hrsVar.c;
                    if (obj2 == null) {
                        jxgVar.t(hrsVar);
                    } else {
                        com.google.android.apps.auto.components.apphost.view.presenters.navigation.minimized.MinimizedTurnCardView minimizedTurnCardView = jxgVar.c;
                        minimizedTurnCardView.m(false);
                        androidx.car.app.navigation.model.Step step = (androidx.car.app.navigation.model.Step) obj2;
                        androidx.car.app.navigation.model.Maneuver maneuver = step.getManeuver();
                        if (maneuver == null || (icon = maneuver.getIcon()) == null) {
                            gahVarE = null;
                        } else {
                            gfa gfaVar = ((hll) jxgVar).i;
                            gfaVar.getClass();
                            gae gaeVarE = fxy.e(icon, gfaVar, new defpackage.jxf(1), new defpackage.jxf(0), (gib) null, 24);
                            gfaVar.getClass();
                            gahVarE = fyh.e(gaeVarE, gfaVar, (hce) null);
                        }
                        minimizedTurnCardView.n(gahVarE);
                        androidx.car.app.model.CarText cue = step.getCue();
                        if (cue != null) {
                            gfa gfaVar2 = ((hll) jxgVar).i;
                            gfaVar2.getClass();
                            hmb hmbVar = hmb.a;
                            hma hmaVar = new hma();
                            hmaVar.g = true;
                            gcwVarI = defpackage.fzv.i(cue, gfaVar2, hmaVar.a());
                        }
                        minimizedTurnCardView.a(gcwVarI);
                        java.lang.Object obj3 = hrsVar.d;
                        if (obj3 != null) {
                            minimizedTurnCardView.k(hme.b(((hll) jxgVar).i, (androidx.car.app.model.Distance) obj3));
                        }
                        jxgVar.t(hrsVar);
                    }
                }
                return defpackage.afbk.a;
            case 9:
                ((kcy) this.receiver).t((androidx.car.app.model.Alert) obj);
                return defpackage.afbk.a;
            case 10:
                ((kcy) this.receiver).t((androidx.car.app.model.Alert) obj);
                return defpackage.afbk.a;
            case 11:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                defpackage.ljd ljdVar = (defpackage.ljd) this.receiver;
                defpackage.ljc ljcVar = defpackage.ljd.a;
                if (ljdVar.d != 2) {
                    if (zBooleanValue) {
                        defpackage.xzg xzgVar = ljdVar.c;
                        xzgVar.d();
                        xzgVar.e();
                        i = 2;
                    }
                } else if (zBooleanValue) {
                    i = 2;
                } else {
                    ljdVar.a();
                }
                ljdVar.d = i;
                return defpackage.afbk.a;
            case 12:
                java.lang.String str = (java.lang.String) obj;
                str.getClass();
                ((lkk) this.receiver).j(str);
                return defpackage.afbk.a;
            case 13:
                java.lang.String str2 = (java.lang.String) obj;
                str2.getClass();
                ((lkk) this.receiver).j(str2);
                return defpackage.afbk.a;
            case 14:
                android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) obj;
                resolveInfo.getClass();
                defpackage.mdb mdbVar = defpackage.mdc.a;
                android.content.pm.ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                serviceInfo.getClass();
                return java.lang.Boolean.valueOf(defpackage.afga.f("com.google.android.projection.gearhead", ((android.content.pm.PackageItemInfo) serviceInfo).packageName));
            case 15:
                java.util.List list = (java.util.List) obj;
                list.getClass();
                mer merVar = (mer) this.receiver;
                defpackage.zbe zbeVar = mer.a;
                defpackage.tmy tmyVar = merVar.f;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                java.lang.Long l = merVar.i;
                l.getClass();
                long jLongValue = jElapsedRealtime - l.longValue();
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, mer.a, defpackage.zbd.iT);
                rrvVarH.p(defpackage.mkt.b);
                rrvVarH.z(list.size());
                rrvVarH.u(jLongValue);
                defpackage.omf.u().F(rrvVarH.l());
                ((defpackage.ype) mer.b.e().ai(4812)).x("All contacts loaded in %s", jLongValue);
                return list;
            case 16:
                java.util.List list2 = (java.util.List) obj;
                list2.getClass();
                mez mezVar = (mez) this.receiver;
                defpackage.ypg ypgVar = mez.a;
                defpackage.tmy tmyVar2 = mezVar.e;
                long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                java.lang.Long l2 = mezVar.g;
                l2.getClass();
                long jLongValue2 = jElapsedRealtime2 - l2.longValue();
                defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_BROWSE_FAVORITES, defpackage.zbd.iT);
                rrvVarH2.p(defpackage.mkt.b);
                rrvVarH2.z(list2.size());
                rrvVarH2.u(jLongValue2);
                defpackage.omf.u().F(rrvVarH2.l());
                ((defpackage.ype) mez.a.e().ai(4819)).x("Favorite contacts loaded in %s", jLongValue2);
                return list2;
            case 17:
                java.util.List list3 = (java.util.List) obj;
                list3.getClass();
                mfi mfiVar = (mfi) this.receiver;
                defpackage.zbe zbeVar2 = mfi.a;
                defpackage.tmy tmyVar3 = mfiVar.g;
                long jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                java.lang.Long l3 = mfiVar.j;
                l3.getClass();
                long jLongValue3 = jElapsedRealtime3 - l3.longValue();
                defpackage.rrv rrvVarH3 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, mfi.a, defpackage.zbd.iT);
                rrvVarH3.p(defpackage.mkt.b);
                rrvVarH3.z(list3.size());
                rrvVarH3.u(jLongValue3);
                defpackage.omf.u().F(rrvVarH3.l());
                ((defpackage.ype) mfi.b.e().ai(4829)).x("Call history loaded in %s", jLongValue3);
                return list3;
            case 18:
                defpackage.ngi ngiVar = (defpackage.ngi) obj;
                ngiVar.getClass();
                mnd mndVar = (mnd) this.receiver;
                defpackage.yqm yqmVar = mnd.f;
                defpackage.ngi ngiVar2 = mndVar.g;
                if (ngiVar2 == null) {
                    defpackage.afga.d("currentlyDisplayedSetting");
                    ngiVar2 = null;
                }
                if (ngiVar2 == ngiVar) {
                    mnd.f.l().y("onSettingChanged(%s): ignoring because unchanged", ngiVar);
                } else {
                    mndVar.g = ngiVar;
                    defpackage.ypu ypuVarL = mnd.f.l();
                    gcw gcwVar = mndVar.g;
                    if (gcwVar == null) {
                        defpackage.afga.d("currentlyDisplayedSetting");
                    } else {
                        gcwVarI = gcwVar;
                    }
                    ypuVarL.M("onSettingChanged(%s -> %s): invalidating", gcwVarI, ngiVar);
                    mndVar.j();
                }
                return defpackage.afbk.a;
            case 19:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                defpackage.nkg nkgVar = (defpackage.nkg) this.receiver;
                defpackage.yqm yqmVar2 = defpackage.nkj.b;
                yqmVar2.l().y("Last primary region app %s", componentName);
                if (componentName != null && !defpackage.afga.f(componentName, nkgVar.h) && !defpackage.afga.f(componentName, nkgVar.a) && !defpackage.afga.f(componentName, nkgVar.i)) {
                    defpackage.yhx yhxVarB = defpackage.ler.a().b(defpackage.kit.b().e(), defpackage.nze.a());
                    yhxVarB.getClass();
                    aisy aisyVar = new aisy(afsg.l(defpackage.afga.bg(yhxVarB), new defpackage.njy(9)), 1);
                    while (aisyVar.hasNext()) {
                        if (defpackage.afga.f(((defpackage.mqj) aisyVar.next()).a(), componentName)) {
                            if (nkgVar.a != null || defpackage.lhc.a().a(defpackage.mqg.NAVIGATION) == null) {
                                if (defpackage.acyc.V()) {
                                    qshVarE = defpackage.kit.b().e();
                                    qshVarE.getClass();
                                    if (defpackage.nkj.m(componentName, qshVarE) && !defpackage.nkg.v(componentName)) {
                                        yqmVar2.l().y("Last primary region app %s passed checks, updating list", componentName);
                                        collection = (java.util.List) nkgVar.e();
                                        if (collection == null) {
                                            collection = defpackage.afce.a;
                                        }
                                        java.util.List listBb = defpackage.afga.bb(collection);
                                        listBb.remove(componentName);
                                        listBb.add(0, componentName);
                                        nkgVar.u(listBb);
                                    }
                                } else if (defpackage.afga.f(componentName, defpackage.mkt.v) || defpackage.kmv.c(acxw.b(), componentName.flattenToString())) {
                                    nkgVar.u(defpackage.afga.aa(componentName));
                                }
                            }
                        }
                    }
                    if (defpackage.acyc.V()) {
                        qshVarE = defpackage.kit.b().e();
                        qshVarE.getClass();
                        if (defpackage.nkj.m(componentName, qshVarE)) {
                            yqmVar2.l().y("Last primary region app %s passed checks, updating list", componentName);
                            collection = (java.util.List) nkgVar.e();
                            if (collection == null) {
                                collection = defpackage.afce.a;
                            }
                            java.util.List listBb2 = defpackage.afga.bb(collection);
                            listBb2.remove(componentName);
                            listBb2.add(0, componentName);
                            nkgVar.u(listBb2);
                        }
                    } else if (defpackage.afga.f(componentName, defpackage.mkt.v)) {
                        nkgVar.u(defpackage.afga.aa(componentName));
                    } else {
                        nkgVar.u(defpackage.afga.aa(componentName));
                    }
                }
                return defpackage.afbk.a;
            default:
                android.content.ComponentName componentName2 = (android.content.ComponentName) obj;
                nki nkiVar = (nki) this.receiver;
                if (componentName2 == null) {
                    defpackage.nkj.b.l().u("Not updating null phone app");
                } else {
                    nkiVar.m(componentName2);
                }
                return defpackage.afbk.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, byte[] bArr) {
        super(1, obj, aivc.class, "await", "await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, byte[] bArr, byte[] bArr2) {
        super(1, obj, defpackage.nkg.class, "updateLastPrimaryRegionApp", "updateLastPrimaryRegionApp(Landroid/content/ComponentName;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, char[] cArr) {
        super(1, obj, hmq.class, "stopSession", "stopSession(Lcom/android/car/libraries/apphost/voice/VoiceSessionManager$StopReason;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, char[] cArr, byte[] bArr) {
        super(1, obj, nki.class, "mostRecentPhoneAppChange", "mostRecentPhoneAppChange(Landroid/content/ComponentName;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, float[] fArr) {
        super(1, obj, hsz.class, "error", "error(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/request/BaseRequestOptions;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, int[] iArr) {
        super(1, obj, hsz.class, "placeholder", "placeholder(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/request/BaseRequestOptions;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, short[] sArr) {
        super(1, obj, hsz.class, "placeholder", "placeholder(I)Lcom/bumptech/glide/request/BaseRequestOptions;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, boolean[] zArr) {
        super(1, obj, hsz.class, "error", "error(I)Lcom/bumptech/glide/request/BaseRequestOptions;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, byte[][] bArr) {
        super(1, obj, defpackage.htw.class, "getSize", "getSize(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, char[][] cArr) {
        super(1, obj, jxg.class, "setNavBar", "setNavBar(Lcom/android/car/libraries/apphost/common/ResponsiveTurnCardData;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, float[][] fArr) {
        super(1, obj, lkk.class, "showSearchResultsScreen", "showSearchResultsScreen(Ljava/lang/String;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, int[][] iArr) {
        super(1, obj, kcy.class, "updateAlert", "updateAlert(Landroidx/car/app/model/Alert;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, boolean[][] zArr) {
        super(1, obj, defpackage.ljd.class, "onParkingStateChanged", "onParkingStateChanged(Z)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, char[][][] cArr) {
        super(1, obj, defpackage.mdc.class, "isGearheadResolveInfo", "isGearheadResolveInfo(Landroid/content/pm/ResolveInfo;)Z", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, float[][][] fArr) {
        super(1, obj, mnd.class, "onSettingChanged", "onSettingChanged(Lcom/google/android/apps/auto/components/system/daynightmode/DayNightModeSetting;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, int[][][] iArr) {
        super(1, obj, mez.class, "logLoadTime", "logLoadTime(Ljava/util/List;)Ljava/util/List;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, short[][][] sArr) {
        super(1, obj, mer.class, "logLoadTime", "logLoadTime(Ljava/util/List;)Ljava/util/List;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(java.lang.Object obj, int i, boolean[][][] zArr) {
        super(1, obj, mfi.class, "logLoadTime", "logLoadTime(Ljava/util/List;)Ljava/util/List;", 0);
        this.a = i;
    }
}
