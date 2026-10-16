package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class thf {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.StartupMeasure");
    public static final j$.time.Duration b = j$.time.Duration.ofSeconds(1);
    public static final defpackage.yhx c = defpackage.ysr.o(defpackage.tgu.GEARHEAD_PROJECTION_MODE_STARTED, defpackage.tgu.GEARHEAD_FACET_BAR_FIRST_RESUME, defpackage.tgu.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME);
    public static final defpackage.yhe d;
    public static final defpackage.yhx e;
    public static final defpackage.yhx f;
    public static final defpackage.thf g;
    private static final defpackage.yhx l;
    public final defpackage.yhe h;
    public final defpackage.yhe i;
    public boolean j = false;
    public defpackage.kpu k;
    private java.util.UUID m;

    static {
        defpackage.tgu tguVar = defpackage.tgu.GEARHEAD_PROJECTION_MODE_STARTED;
        defpackage.tgu tguVar2 = defpackage.tgu.GEARHEAD_WIRELESS_STARTUP_PROJECTION_MODE_STARTED;
        defpackage.tgu tguVar3 = defpackage.tgu.GEARHEAD_FACET_BAR_FIRST_RESUME;
        defpackage.tgu tguVar4 = defpackage.tgu.GEARHEAD_WIRELESS_STARTUP_FACET_BAR_FIRST_RESUME;
        defpackage.tgu tguVar5 = defpackage.tgu.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME;
        defpackage.tgu tguVar6 = defpackage.tgu.GEARHEAD_WIRELESS_STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME;
        defpackage.tgu tguVar7 = defpackage.tgu.FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED;
        defpackage.tgu tguVar8 = defpackage.tgu.GEARHEAD_WIRELESS_STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED;
        defpackage.tgu tguVar9 = defpackage.tgu.GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT_RFCOMM;
        defpackage.tgu tguVar10 = defpackage.tgu.GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT;
        defpackage.tgu tguVar11 = defpackage.tgu.GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT_TCP;
        defpackage.tgu tguVar12 = defpackage.tgu.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_RFCOMM;
        defpackage.tgu tguVar13 = defpackage.tgu.GEARHEAD_WIRELESS_WIFI_VERSION_REQUEST_RECEIVED;
        defpackage.tgu tguVar14 = defpackage.tgu.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_TCP;
        defpackage.tgu tguVar15 = defpackage.tgu.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_RFCOMM;
        defpackage.tgu tguVar16 = defpackage.tgu.GEARHEAD_WIRELESS_WIFI_START_REQUEST_RECEIVED;
        defpackage.tgu tguVar17 = defpackage.tgu.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_TCP;
        defpackage.ysr.aJ(tguVar, tguVar2);
        defpackage.ysr.aJ(tguVar3, tguVar4);
        defpackage.ysr.aJ(tguVar5, tguVar6);
        defpackage.ysr.aJ(tguVar7, tguVar8);
        defpackage.ysr.aJ(tguVar9, tguVar10);
        defpackage.ysr.aJ(tguVar11, tguVar10);
        defpackage.ysr.aJ(tguVar12, tguVar13);
        defpackage.ysr.aJ(tguVar14, tguVar13);
        defpackage.ysr.aJ(tguVar15, tguVar16);
        defpackage.ysr.aJ(tguVar17, tguVar16);
        d = defpackage.ysr.F(defpackage.ync.a(10, new java.lang.Object[]{tguVar, tguVar2, tguVar3, tguVar4, tguVar5, tguVar6, tguVar7, tguVar8, tguVar9, tguVar10, tguVar11, tguVar10, tguVar12, tguVar13, tguVar14, tguVar13, tguVar15, tguVar16, tguVar17, tguVar16}, null));
        e = defpackage.ysr.o(defpackage.tgu.GEARHEAD_PROJECTION_MODE_STARTED, defpackage.tgu.GEARHEAD_FACET_BAR_FIRST_RESUME, defpackage.tgu.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME, defpackage.tgu.FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED);
        f = defpackage.ysr.o(defpackage.tgu.GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT_RFCOMM, defpackage.tgu.GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT_TCP, defpackage.tgu.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_RFCOMM, defpackage.tgu.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_TCP, defpackage.tgu.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_RFCOMM, defpackage.tgu.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_TCP);
        l = defpackage.ysr.o(defpackage.tgu.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_RFCOMM, defpackage.tgu.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_TCP);
        g = new defpackage.thf();
    }

    public thf() {
        final int i = 1;
        final int i2 = 0;
        this.i = defpackage.ysr.F(defpackage.yhe.l(defpackage.tgt.a, new defpackage.the(new java.util.function.BooleanSupplier(this) { // from class: thc
            public final /* synthetic */ defpackage.thf a;

            {
                this.a = this;
            }

            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                int i3 = i;
                defpackage.thf thfVar = this.a;
                if (i3 != 0) {
                    java.util.Map map = (java.util.Map) thfVar.h.get(defpackage.tgt.a);
                    map.getClass();
                    if (!thfVar.j) {
                        return (map.containsKey(defpackage.tgu.GEARHEAD_WARM_STARTUP_STARTED) || map.containsKey(defpackage.tgu.GEARHEAD_COLD_STARTUP_STARTED)) && map.containsKey(defpackage.tgu.PROJECTION_STARTED_USB) && map.keySet().containsAll(defpackage.thf.c);
                    }
                    j$.util.Optional optionalB = thfVar.b();
                    if (!optionalB.isEmpty()) {
                        defpackage.tgu tguVar = defpackage.tgu.PROJECTION_STARTED_USB;
                        if (map.containsKey(tguVar)) {
                            java.util.Set setKeySet = map.keySet();
                            defpackage.yhx yhxVar = defpackage.thf.c;
                            if (!setKeySet.containsAll(yhxVar)) {
                                return false;
                            }
                            j$.time.Duration duration = ((defpackage.thd) optionalB.get()).b;
                            j$.time.Duration duration2 = (j$.time.Duration) map.get(tguVar);
                            duration2.getClass();
                            if (defpackage.ytn.d(duration, duration2)) {
                                return false;
                            }
                            defpackage.yot it = yhxVar.iterator();
                            while (it.hasNext()) {
                                j$.time.Duration duration3 = (j$.time.Duration) map.get((defpackage.tgu) it.next());
                                duration3.getClass();
                                if (defpackage.ytn.d(duration2, duration3)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                    return false;
                }
                java.util.Map map2 = (java.util.Map) thfVar.h.get(defpackage.tgt.b);
                map2.getClass();
                if (!thfVar.j) {
                    return (map2.containsKey(defpackage.tgu.GEARHEAD_WIRELESS_WARM_STARTUP_STARTED) || map2.containsKey(defpackage.tgu.GEARHEAD_WIRELESS_COLD_STARTUP_STARTED)) && map2.containsKey(defpackage.tgu.PROJECTION_STARTED_WIRELESS) && map2.keySet().containsAll(defpackage.thf.c);
                }
                j$.util.Optional optionalC = thfVar.c();
                if (!optionalC.isEmpty()) {
                    defpackage.tgu tguVar2 = defpackage.tgu.PROJECTION_STARTED_WIRELESS;
                    if (map2.containsKey(tguVar2)) {
                        java.util.Set setKeySet2 = map2.keySet();
                        defpackage.yhx yhxVar2 = defpackage.thf.c;
                        if (!setKeySet2.containsAll(yhxVar2)) {
                            return false;
                        }
                        j$.time.Duration duration4 = ((defpackage.thd) optionalC.get()).b;
                        j$.time.Duration duration5 = (j$.time.Duration) map2.get(tguVar2);
                        duration5.getClass();
                        if (defpackage.ytn.d(duration4, duration5)) {
                            return false;
                        }
                        defpackage.yot it2 = yhxVar2.iterator();
                        while (it2.hasNext()) {
                            j$.time.Duration duration6 = (j$.time.Duration) map2.get((defpackage.tgu) it2.next());
                            duration6.getClass();
                            if (defpackage.ytn.d(duration5, duration6)) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
        }, new java.lang.Runnable() { // from class: thb
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.thf thfVar = this.a;
                defpackage.yhe yheVar = thfVar.h;
                defpackage.tgt tgtVar = defpackage.tgt.a;
                java.util.Map map = (java.util.Map) yheVar.get(tgtVar);
                map.getClass();
                if (thfVar.j) {
                    defpackage.thf.j(map, (defpackage.thd) thfVar.b().orElseThrow());
                }
                defpackage.thf.d(map);
                if (map.containsKey(defpackage.tgu.GEARHEAD_FRX_STARTED)) {
                    ((defpackage.yqj) defpackage.thf.a.l().ai((char) 9040)).u("Not recording startup latency for session with FRX");
                } else if (thfVar.k()) {
                    ((defpackage.yqj) defpackage.thf.a.l().ai((char) 9039)).u("not recording startup latency for first run for new version");
                } else {
                    defpackage.tgu tguVar = defpackage.tgu.GEARHEAD_COLD_STARTUP_STARTED;
                    if (map.containsKey(tguVar)) {
                        java.util.Map map2 = (java.util.Map) yheVar.get(tgtVar);
                        map2.getClass();
                        j$.time.Duration duration = (j$.time.Duration) map2.get(tguVar);
                        duration.getClass();
                        java.util.Map map3 = (java.util.Map) yheVar.get(tgtVar);
                        map3.getClass();
                        for (java.util.Map.Entry entry : map3.entrySet()) {
                            defpackage.thf.e(entry, duration, true);
                            if (defpackage.thf.l((defpackage.tgu) entry.getKey())) {
                                defpackage.tgu tguVarA = defpackage.thf.a((defpackage.tgu) entry.getKey(), true);
                                defpackage.vlu vluVar = tguVarA.X;
                                defpackage.vlw.a().c(vluVar, duration.toMillis(), ((j$.time.Duration) entry.getValue()).toMillis());
                                ((defpackage.yqj) ((defpackage.yqj) defpackage.thf.a.f()).ai(9032)).M("recording %s=%s", vluVar, ((j$.time.Duration) entry.getValue()).minus(duration));
                                thfVar.g(tguVarA, ((j$.time.Duration) entry.getValue()).minus(duration));
                            }
                        }
                        thfVar.h(false);
                    } else {
                        defpackage.tgu tguVar2 = defpackage.tgu.GEARHEAD_WARM_STARTUP_STARTED;
                        if (map.containsKey(tguVar2)) {
                            java.util.Map map4 = (java.util.Map) yheVar.get(tgtVar);
                            map4.getClass();
                            j$.time.Duration duration2 = (j$.time.Duration) map4.get(tguVar2);
                            duration2.getClass();
                            java.util.Map map5 = (java.util.Map) yheVar.get(tgtVar);
                            map5.getClass();
                            for (java.util.Map.Entry entry2 : map5.entrySet()) {
                                defpackage.thf.e(entry2, duration2, false);
                                if (defpackage.thf.l((defpackage.tgu) entry2.getKey())) {
                                    defpackage.tgu tguVarA2 = defpackage.thf.a((defpackage.tgu) entry2.getKey(), false);
                                    defpackage.vlu vluVar2 = tguVarA2.X;
                                    defpackage.vlw.a().c(vluVar2, duration2.toMillis(), ((j$.time.Duration) entry2.getValue()).toMillis());
                                    ((defpackage.yqj) ((defpackage.yqj) defpackage.thf.a.f()).ai(9033)).M("recording %s=%s", vluVar2, ((j$.time.Duration) entry2.getValue()).minus(duration2));
                                    thfVar.g(tguVarA2, ((j$.time.Duration) entry2.getValue()).minus(duration2));
                                }
                            }
                            thfVar.h(true);
                        } else {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.thf.a.h()).ai((char) 9038)).u("no warm or cold startup time recorded, ignoring call");
                        }
                    }
                }
                map.clear();
            }
        }), defpackage.tgt.b, new defpackage.the(new java.util.function.BooleanSupplier(this) { // from class: thc
            public final /* synthetic */ defpackage.thf a;

            {
                this.a = this;
            }

            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                int i3 = i2;
                defpackage.thf thfVar = this.a;
                if (i3 != 0) {
                    java.util.Map map = (java.util.Map) thfVar.h.get(defpackage.tgt.a);
                    map.getClass();
                    if (!thfVar.j) {
                        return (map.containsKey(defpackage.tgu.GEARHEAD_WARM_STARTUP_STARTED) || map.containsKey(defpackage.tgu.GEARHEAD_COLD_STARTUP_STARTED)) && map.containsKey(defpackage.tgu.PROJECTION_STARTED_USB) && map.keySet().containsAll(defpackage.thf.c);
                    }
                    j$.util.Optional optionalB = thfVar.b();
                    if (!optionalB.isEmpty()) {
                        defpackage.tgu tguVar = defpackage.tgu.PROJECTION_STARTED_USB;
                        if (map.containsKey(tguVar)) {
                            java.util.Set setKeySet = map.keySet();
                            defpackage.yhx yhxVar = defpackage.thf.c;
                            if (!setKeySet.containsAll(yhxVar)) {
                                return false;
                            }
                            j$.time.Duration duration = ((defpackage.thd) optionalB.get()).b;
                            j$.time.Duration duration2 = (j$.time.Duration) map.get(tguVar);
                            duration2.getClass();
                            if (defpackage.ytn.d(duration, duration2)) {
                                return false;
                            }
                            defpackage.yot it = yhxVar.iterator();
                            while (it.hasNext()) {
                                j$.time.Duration duration3 = (j$.time.Duration) map.get((defpackage.tgu) it.next());
                                duration3.getClass();
                                if (defpackage.ytn.d(duration2, duration3)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                    return false;
                }
                java.util.Map map2 = (java.util.Map) thfVar.h.get(defpackage.tgt.b);
                map2.getClass();
                if (!thfVar.j) {
                    return (map2.containsKey(defpackage.tgu.GEARHEAD_WIRELESS_WARM_STARTUP_STARTED) || map2.containsKey(defpackage.tgu.GEARHEAD_WIRELESS_COLD_STARTUP_STARTED)) && map2.containsKey(defpackage.tgu.PROJECTION_STARTED_WIRELESS) && map2.keySet().containsAll(defpackage.thf.c);
                }
                j$.util.Optional optionalC = thfVar.c();
                if (!optionalC.isEmpty()) {
                    defpackage.tgu tguVar2 = defpackage.tgu.PROJECTION_STARTED_WIRELESS;
                    if (map2.containsKey(tguVar2)) {
                        java.util.Set setKeySet2 = map2.keySet();
                        defpackage.yhx yhxVar2 = defpackage.thf.c;
                        if (!setKeySet2.containsAll(yhxVar2)) {
                            return false;
                        }
                        j$.time.Duration duration4 = ((defpackage.thd) optionalC.get()).b;
                        j$.time.Duration duration5 = (j$.time.Duration) map2.get(tguVar2);
                        duration5.getClass();
                        if (defpackage.ytn.d(duration4, duration5)) {
                            return false;
                        }
                        defpackage.yot it2 = yhxVar2.iterator();
                        while (it2.hasNext()) {
                            j$.time.Duration duration6 = (j$.time.Duration) map2.get((defpackage.tgu) it2.next());
                            duration6.getClass();
                            if (defpackage.ytn.d(duration5, duration6)) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
        }, new defpackage.rzu(this, 14))));
        j$.util.stream.Stream stream = j$.util.DesugarArrays.stream(defpackage.tgt.values());
        final defpackage.mmf mmfVar = new defpackage.mmf(16);
        j$.util.stream.Collector collector = defpackage.yds.a;
        int i3 = 4;
        this.h = (defpackage.yhe) stream.collect(j$.util.stream.Collector.-CC.of(new defpackage.ydk(i3), new java.util.function.BiConsumer() { // from class: ydo
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                j$.util.stream.Collector collector2 = defpackage.yds.a;
                defpackage.tgt tgtVar = (defpackage.tgt) obj2;
                defpackage.yqm yqmVar = defpackage.thf.a;
                java.lang.Object objM = a$.ExternalSyntheticApiModelOutline2.m(mmfVar, obj2);
                tgtVar.getClass();
                objM.getClass();
                ((defpackage.ydr) obj).a(tgtVar, objM);
            }

            @Override // java.util.function.BiConsumer
            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
            }
        }, new defpackage.ydl(4), new defpackage.ydm(i3), new j$.util.stream.Collector.Characteristics[]{j$.util.stream.Collector.Characteristics.UNORDERED}));
    }

    public static defpackage.tgu a(defpackage.tgu tguVar, boolean z) {
        if (tguVar.equals(defpackage.tgu.GEARHEAD_PROJECTION_MODE_STARTED)) {
            return z ? defpackage.tgu.GEARHEAD_COLD_STARTUP_PROJECTION_MODE_STARTED : defpackage.tgu.GEARHEAD_WARM_STARTUP_PROJECTION_MODE_STARTED;
        }
        if (tguVar.equals(defpackage.tgu.GEARHEAD_FACET_BAR_FIRST_RESUME)) {
            return z ? defpackage.tgu.GEARHEAD_COLD_STARTUP_FACET_BAR_FIRST_RESUME : defpackage.tgu.GEARHEAD_WARM_STARTUP_FACET_BAR_FIRST_RESUME;
        }
        if (tguVar.equals(defpackage.tgu.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME)) {
            return z ? defpackage.tgu.GEARHEAD_COLD_STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME : defpackage.tgu.GEARHEAD_WARM_STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME;
        }
        if (tguVar.equals(defpackage.tgu.FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED)) {
            return z ? defpackage.tgu.GEARHEAD_COLD_STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED : defpackage.tgu.GEARHEAD_WARM_STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED;
        }
        return tguVar;
    }

    public static void d(java.util.Map map) {
        defpackage.tgu tguVar = defpackage.tgu.GEARHEAD_PREFLIGHT_STARTED;
        if (map.containsKey(tguVar)) {
            defpackage.tgu tguVar2 = defpackage.tgu.GEARHEAD_PREFLIGHT_COMPLETED;
            if (map.containsKey(tguVar2)) {
                final j$.time.Duration duration = (j$.time.Duration) map.get(tguVar2);
                duration.getClass();
                j$.time.Duration duration2 = (j$.time.Duration) map.get(tguVar);
                duration2.getClass();
                final j$.time.Duration durationMinus = duration.minus(duration2);
                j$.util.Map.-EL.replaceAll(map, new java.util.function.BiFunction() { // from class: tha
                    @Override // java.util.function.BiFunction
                    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
                        return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                        j$.time.Duration duration3 = (j$.time.Duration) obj2;
                        defpackage.yqm yqmVar = defpackage.thf.a;
                        return duration3.compareTo(duration) >= 0 ? duration3.minus(durationMinus) : duration3;
                    }
                });
            }
        }
        defpackage.tgu tguVar3 = defpackage.tgu.GEARHEAD_CAR_SERVICE_VIDEO_FOCUS_GAINED;
        if (map.containsKey(tguVar3)) {
            defpackage.tgu tguVar4 = defpackage.tgu.GEARHEAD_PROJECTION_MODE_STARTED;
            if (map.containsKey(tguVar4)) {
                j$.time.Duration duration3 = (j$.time.Duration) map.get(tguVar3);
                duration3.getClass();
                j$.time.Duration duration4 = (j$.time.Duration) map.get(tguVar4);
                duration4.getClass();
                j$.time.Duration durationMinus2 = duration3.minus(duration4);
                if (!durationMinus2.isNegative()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(map.keySet());
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        defpackage.tgu tguVar5 = (defpackage.tgu) arrayList.get(i);
                        j$.time.Duration duration5 = (j$.time.Duration) map.get(tguVar5);
                        duration5.getClass();
                        if (duration5.compareTo(duration3) >= 0) {
                            map.put(tguVar5, duration5.minus(durationMinus2));
                        }
                    }
                }
            }
        }
        defpackage.tgu tguVar6 = defpackage.tgu.GEARHEAD_FACET_BAR_FIRST_RESUME;
        if (map.containsKey(tguVar6)) {
            defpackage.tgu tguVar7 = defpackage.tgu.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME;
            if (map.containsKey(tguVar7)) {
                defpackage.tgu tguVar8 = defpackage.tgu.FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED;
                j$.time.Duration duration6 = (j$.time.Duration) map.get(tguVar6);
                duration6.getClass();
                j$.time.Duration duration7 = (j$.time.Duration) map.get(tguVar7);
                duration7.getClass();
                map.put(tguVar8, defpackage.wpu.v(duration6, duration7));
            }
        }
        if (map.containsKey(defpackage.tgu.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_TCP) && map.containsKey(defpackage.tgu.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_TCP)) {
            o(map, 3);
        } else if (map.containsKey(defpackage.tgu.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_RFCOMM) && map.containsKey(defpackage.tgu.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_RFCOMM)) {
            o(map, 2);
        }
    }

    public static void e(java.util.Map.Entry entry, j$.time.Duration duration, boolean z) {
        int iCompareTo = ((j$.time.Duration) entry.getValue()).compareTo(duration);
        defpackage.ysr.aY(iCompareTo >= 0, java.lang.String.format(java.util.Locale.US, "%s end time(%s) cannot be before start time(%s). isColdStartup: %b.", entry.getKey(), entry.getValue(), duration, java.lang.Boolean.valueOf(z)));
    }

    public static void j(java.util.Map map, defpackage.thd thdVar) {
        defpackage.yvr yvrVarF = defpackage.yvr.f(map);
        j$.time.Duration duration = thdVar.b;
        defpackage.yot it = yvrVarF.e(new defpackage.orr(duration, 16)).b().entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(9047)).S("%s end time(%s) cannot be before start time(%s). isColdStartup: %b.", entry.getKey(), entry.getValue(), duration, java.lang.Boolean.valueOf(thdVar.a == defpackage.tgs.COLD));
            j$.util.Map.-EL.remove(map, entry.getKey(), entry.getValue());
        }
    }

    public static boolean l(defpackage.tgu tguVar) {
        return e.contains(tguVar);
    }

    static final void n(defpackage.tgu tguVar, defpackage.tgs tgsVar, int i, j$.time.Duration duration, j$.time.Duration duration2) {
        defpackage.vlw.a().c(tguVar.a(tgsVar, i), duration.toMillis(), duration2.toMillis());
    }

    private static void o(java.util.Map map, int i) {
        j$.time.Duration duration = i == 3 ? (j$.time.Duration) map.get(defpackage.tgu.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_TCP) : (j$.time.Duration) map.get(defpackage.tgu.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_RFCOMM);
        duration.getClass();
        j$.time.Duration duration2 = i == 3 ? (j$.time.Duration) map.get(defpackage.tgu.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_TCP) : (j$.time.Duration) map.get(defpackage.tgu.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_RFCOMM);
        duration2.getClass();
        j$.time.Duration durationMinus = duration2.minus(duration);
        if (durationMinus.isNegative()) {
            return;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            j$.time.Duration duration3 = (j$.time.Duration) entry.getValue();
            duration3.getClass();
            if (!l.contains(entry.getKey()) && duration3.compareTo(duration2) >= 0) {
                entry.setValue(duration3.minus(durationMinus));
            }
        }
    }

    public final j$.util.Optional b() {
        java.util.Map map = (java.util.Map) this.h.get(defpackage.tgt.a);
        map.getClass();
        defpackage.tgu tguVar = defpackage.tgu.GEARHEAD_COLD_STARTUP_STARTED;
        if (map.containsKey(tguVar)) {
            return j$.util.Optional.of(new defpackage.thd(defpackage.tgs.COLD, (j$.time.Duration) map.get(tguVar)));
        }
        defpackage.tgu tguVar2 = defpackage.tgu.GEARHEAD_WARM_STARTUP_STARTED;
        return map.containsKey(tguVar2) ? j$.util.Optional.of(new defpackage.thd(defpackage.tgs.WARM, (j$.time.Duration) map.get(tguVar2))) : j$.util.Optional.empty();
    }

    public final j$.util.Optional c() {
        java.util.Map map = (java.util.Map) this.h.get(defpackage.tgt.b);
        map.getClass();
        defpackage.tgu tguVar = defpackage.tgu.GEARHEAD_WIRELESS_COLD_STARTUP_STARTED;
        if (map.containsKey(tguVar)) {
            return j$.util.Optional.of(new defpackage.thd(defpackage.tgs.COLD, (j$.time.Duration) map.get(tguVar)));
        }
        defpackage.tgu tguVar2 = defpackage.tgu.GEARHEAD_WIRELESS_WARM_STARTUP_STARTED;
        return map.containsKey(tguVar2) ? j$.util.Optional.of(new defpackage.thd(defpackage.tgs.WARM, (j$.time.Duration) map.get(tguVar2))) : j$.util.Optional.empty();
    }

    public final synchronized void f(final defpackage.tgu tguVar, final j$.time.Duration duration, java.util.UUID uuid) {
        if (!uuid.equals(this.m)) {
            ((defpackage.yqj) a.l().ai((char) 9031)).y("Received a new drive id %s. Resetting measurements.", uuid);
            j$.lang.Iterable.-EL.forEach(this.h.values(), new defpackage.nyj(5));
            this.m = uuid;
        }
        defpackage.yvr yvrVarG = defpackage.yvr.g(j$.util.Collection.-EL.stream(this.i.entrySet()));
        defpackage.yhx yhxVar = tguVar.Y;
        yhxVar.getClass();
        j$.util.Map.-EL.forEach(yvrVarG.d(new defpackage.imj(yhxVar, 3)).d(new java.util.function.Predicate() { // from class: tgy
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
                defpackage.thf thfVar = this.a;
                java.util.Map map = (java.util.Map) thfVar.h.get((defpackage.tgt) obj);
                map.getClass();
                defpackage.tgu tguVar2 = tguVar;
                j$.time.Duration duration2 = duration;
                if (!thfVar.j && map.containsKey(tguVar2)) {
                    if (duration2.minus((j$.time.Duration) map.get(tguVar2)).compareTo(defpackage.thf.b) < 0) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.thf.a.h()).ai((char) 9045)).y("Ignoring duplicate startup event %s.", tguVar2);
                        return false;
                    }
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.thf.a.h()).ai((char) 9046)).y("Received duplicate %s. Resetting measurements as startup events are not repeated.", tguVar2);
                    map.clear();
                }
                map.put(tguVar2, duration2);
                ((defpackage.yqj) ((defpackage.yqj) defpackage.thf.a.f()).ai(9044)).M("logEvent %s=%s", tguVar2, duration2);
                return true;
            }
        }).b(), new java.util.function.BiConsumer() { // from class: tgz
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                defpackage.the theVar = (defpackage.the) this.a.i.get((defpackage.tgt) obj);
                theVar.getClass();
                if (a$.ExternalSyntheticApiModelOutline2.m(theVar.a)) {
                    theVar.b.run();
                }
            }

            @Override // java.util.function.BiConsumer
            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public final void g(defpackage.tgu tguVar, j$.time.Duration duration) {
        defpackage.zaa zaaVar;
        if (this.k != null) {
            defpackage.ysr.bj(tguVar.Y.contains(defpackage.tgt.a));
            this.k.getClass();
            if (defpackage.acvt.k()) {
                switch (tguVar.ordinal()) {
                    case defpackage.abnt.b /* 0 */:
                        zaaVar = defpackage.zaa.COLD_STARTUP_HU_SERVICE_DISCOVERY_COMPLETED;
                        break;
                    case 1:
                        zaaVar = defpackage.zaa.COLD_STARTUP_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START;
                        break;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        zaaVar = defpackage.zaa.COLD_STARTUP_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED;
                        break;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        zaaVar = defpackage.zaa.COLD_STARTUP_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME;
                        break;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        zaaVar = defpackage.zaa.COLD_STARTUP_PROJECTION_MODE_STARTED_RECORDED;
                        break;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        zaaVar = defpackage.zaa.COLD_STARTUP_FACET_BAR_FIRST_RESUME;
                        break;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        zaaVar = defpackage.zaa.COLD_STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME;
                        break;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        zaaVar = defpackage.zaa.COLD_STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED;
                        break;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        zaaVar = defpackage.zaa.WARM_STARTUP_HU_SERVICE_DISCOVERY_COMPLETED;
                        break;
                    case 9:
                        zaaVar = defpackage.zaa.WARM_STARTUP_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START;
                        break;
                    case 10:
                        zaaVar = defpackage.zaa.WARM_STARTUP_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED;
                        break;
                    case 11:
                        zaaVar = defpackage.zaa.WARM_STARTUP_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME;
                        break;
                    case 12:
                        zaaVar = defpackage.zaa.WARM_STARTUP_PROJECTION_MODE_STARTED_RECORDED;
                        break;
                    case 13:
                        zaaVar = defpackage.zaa.WARM_STARTUP_FACET_BAR_FIRST_RESUME;
                        break;
                    case 14:
                        zaaVar = defpackage.zaa.WARM_STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME;
                        break;
                    case 15:
                        zaaVar = defpackage.zaa.WARM_STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED;
                        break;
                    default:
                        return;
                }
                defpackage.oim oimVarU = defpackage.omf.u();
                defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 38, zaaVar);
                rroVarH.h(duration.toMillis());
                oimVarU.f(rroVarH);
            }
        }
    }

    public final void h(boolean z) {
        java.util.Map map = (java.util.Map) this.h.get(defpackage.tgt.a);
        map.getClass();
        j$.time.Duration duration = z ? (j$.time.Duration) j$.util.Map.-EL.getOrDefault(map, defpackage.tgu.GEARHEAD_WARM_STARTUP_STARTED, j$.time.Duration.ofMillis(-1L)) : (j$.time.Duration) j$.util.Map.-EL.getOrDefault(map, defpackage.tgu.GEARHEAD_COLD_STARTUP_STARTED, j$.time.Duration.ofMillis(-1L));
        duration.getClass();
        j$.time.Duration duration2 = (j$.time.Duration) j$.util.Map.-EL.getOrDefault(map, defpackage.tgu.GEARHEAD_PROJECTION_ENABLED, j$.time.Duration.ofMillis(-1L));
        duration2.getClass();
        j$.time.Duration duration3 = (j$.time.Duration) j$.util.Map.-EL.getOrDefault(map, defpackage.tgu.PROJECTION_LIFECYCLE_LISTENER_ON_PROJECTION_START, j$.time.Duration.ofMillis(-1L));
        duration3.getClass();
        j$.time.Duration duration4 = (j$.time.Duration) j$.util.Map.-EL.getOrDefault(map, defpackage.tgu.GEARHEAD_PROJECTION_MODE_STARTED, j$.time.Duration.ofMillis(-1L));
        duration4.getClass();
        j$.time.Duration duration5 = (j$.time.Duration) j$.util.Map.-EL.getOrDefault(map, defpackage.tgu.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME, j$.time.Duration.ofMillis(-1L));
        duration5.getClass();
        if (duration2.compareTo(duration) <= 0 || duration3.compareTo(duration2) <= 0 || duration4.compareTo(duration3) <= 0 || duration5.compareTo(duration3) <= 0) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(9034)).T("persistMilestones failed, invalid measurements baseMs=%d huMs=%d pLifecycleStartedMs=%d pModeStartedMs=%d carActivityFirstResumeMs=%d", java.lang.Long.valueOf(duration.toMillis()), java.lang.Long.valueOf(duration2.toMillis()), java.lang.Long.valueOf(duration3.toMillis()), java.lang.Long.valueOf(duration4.toMillis()), java.lang.Long.valueOf(duration5.toMillis()));
            return;
        }
        ((defpackage.yqj) a.l().ai(9035)).S("persistMilestones huMs=%d pLifecycleStartedMs=%d pModeStartedMs=%d carActivityFirstResumeMs=%d", java.lang.Long.valueOf(duration2.minus(duration).toMillis()), java.lang.Long.valueOf(duration3.minus(duration2).toMillis()), java.lang.Long.valueOf(duration4.minus(duration3).toMillis()), java.lang.Long.valueOf(duration5.minus(duration3).toMillis()));
        defpackage.vlw.a().c(z ? defpackage.tgu.GEARHEAD_WARM_HU_SERVICE_DISCOVERY_COMPLETED.X : defpackage.tgu.GEARHEAD_COLD_HU_SERVICE_DISCOVERY_COMPLETED.X, duration.toMillis(), duration2.toMillis());
        g(z ? defpackage.tgu.GEARHEAD_WARM_HU_SERVICE_DISCOVERY_COMPLETED : defpackage.tgu.GEARHEAD_COLD_HU_SERVICE_DISCOVERY_COMPLETED, duration2.minus(duration));
        defpackage.vlw.a().c(z ? defpackage.tgu.GEARHEAD_WARM_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START.X : defpackage.tgu.GEARHEAD_COLD_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START.X, duration2.toMillis(), duration3.toMillis());
        g(z ? defpackage.tgu.GEARHEAD_WARM_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START : defpackage.tgu.GEARHEAD_COLD_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START, duration3.minus(duration2));
        defpackage.vlw.a().c(z ? defpackage.tgu.GEARHEAD_WARM_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED.X : defpackage.tgu.GEARHEAD_COLD_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED.X, duration3.toMillis(), duration4.toMillis());
        g(z ? defpackage.tgu.GEARHEAD_WARM_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED : defpackage.tgu.GEARHEAD_COLD_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED, duration4.minus(duration3));
        defpackage.vlw.a().c(z ? defpackage.tgu.GEARHEAD_WARM_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME.X : defpackage.tgu.GEARHEAD_COLD_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME.X, duration3.toMillis(), duration5.toMillis());
        g(z ? defpackage.tgu.GEARHEAD_WARM_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED : defpackage.tgu.GEARHEAD_COLD_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED, duration5.minus(duration3));
    }

    public final void i(defpackage.tgs tgsVar) {
        defpackage.yhe yheVar = this.h;
        defpackage.tgt tgtVar = defpackage.tgt.b;
        java.util.Map map = (java.util.Map) yheVar.get(tgtVar);
        map.getClass();
        defpackage.tgs tgsVar2 = defpackage.tgs.COLD;
        int i = true != map.containsKey(defpackage.tgu.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_TCP) ? 2 : 3;
        boolean z = tgsVar == tgsVar2;
        j$.time.Duration duration = (j$.time.Duration) map.get(z ? defpackage.tgu.GEARHEAD_WIRELESS_COLD_STARTUP_STARTED : defpackage.tgu.GEARHEAD_WIRELESS_WARM_STARTUP_STARTED);
        duration.getClass();
        j$.lang.Iterable.-EL.forEach(map.entrySet(), new tgv(duration, z));
        defpackage.yvr yvrVarG = defpackage.yvr.g(defpackage.yvr.f(map).d(new omr(19)).h(new defpackage.rix(12)).a().peek(new yvj(new tgw(tgsVar, i, duration))));
        yvrVarG.b.forEach(new yvp(yvrVarG, new tgx(this, tgsVar, i, duration)));
        java.util.Map map2 = (java.util.Map) yheVar.get(tgtVar);
        map2.getClass();
        j$.time.Duration duration2 = tgsVar == defpackage.tgs.WARM ? (j$.time.Duration) j$.util.Map.-EL.getOrDefault(map2, defpackage.tgu.GEARHEAD_WIRELESS_WARM_STARTUP_STARTED, j$.time.Duration.ofMillis(-1L)) : (j$.time.Duration) j$.util.Map.-EL.getOrDefault(map2, defpackage.tgu.GEARHEAD_WIRELESS_COLD_STARTUP_STARTED, j$.time.Duration.ofMillis(-1L));
        duration2.getClass();
        j$.time.Duration duration3 = (j$.time.Duration) j$.util.Map.-EL.getOrDefault(map2, defpackage.tgu.GEARHEAD_PROJECTION_ENABLED, j$.time.Duration.ofMillis(-1L));
        duration3.getClass();
        j$.time.Duration duration4 = (j$.time.Duration) j$.util.Map.-EL.getOrDefault(map2, defpackage.tgu.PROJECTION_LIFECYCLE_LISTENER_ON_PROJECTION_START, j$.time.Duration.ofMillis(-1L));
        duration4.getClass();
        j$.time.Duration duration5 = (j$.time.Duration) j$.util.Map.-EL.getOrDefault(map2, defpackage.tgu.GEARHEAD_PROJECTION_MODE_STARTED, j$.time.Duration.ofMillis(-1L));
        duration5.getClass();
        j$.time.Duration duration6 = (j$.time.Duration) j$.util.Map.-EL.getOrDefault(map2, defpackage.tgu.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME, j$.time.Duration.ofMillis(-1L));
        duration6.getClass();
        if (duration3.compareTo(duration2) <= 0 || duration4.compareTo(duration3) <= 0 || duration5.compareTo(duration4) <= 0 || duration6.compareTo(duration4) <= 0) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(9036)).T("persistMilestones failed, invalid measurements baseMs=%d huMs=%d pLifecycleStartedMs=%d pModeStartedMs=%d carActivityFirstResumeMs=%d", java.lang.Long.valueOf(duration2.toMillis()), java.lang.Long.valueOf(duration3.toMillis()), java.lang.Long.valueOf(duration4.toMillis()), java.lang.Long.valueOf(duration5.toMillis()), java.lang.Long.valueOf(duration6.toMillis()));
            return;
        }
        ((defpackage.yqj) a.l().ai(9037)).S("persistMilestones huMs=%d pLifecycleStartedMs=%d pModeStartedMs=%d carActivityFirstResumeMs=%d", java.lang.Long.valueOf(duration3.minus(duration2).toMillis()), java.lang.Long.valueOf(duration4.minus(duration3).toMillis()), java.lang.Long.valueOf(duration5.minus(duration4).toMillis()), java.lang.Long.valueOf(duration6.minus(duration4).toMillis()));
        defpackage.tgu tguVar = defpackage.tgu.GEARHEAD_WIRELESS_HU_SERVICE_DISCOVERY_COMPLETED;
        n(tguVar, tgsVar, i, duration2, duration3);
        m(tguVar, duration3.minus(duration2), tgsVar, i);
        defpackage.tgu tguVar2 = defpackage.tgu.GEARHEAD_WIRELESS_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START;
        n(tguVar2, tgsVar, i, duration3, duration4);
        m(tguVar2, duration4.minus(duration3), tgsVar, i);
        defpackage.tgu tguVar3 = defpackage.tgu.GEARHEAD_WIRELESS_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED;
        n(tguVar3, tgsVar, i, duration4, duration5);
        m(tguVar3, duration5.minus(duration4), tgsVar, i);
        n(defpackage.tgu.GEARHEAD_WIRELESS_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME, tgsVar, i, duration4, duration6);
        m(tguVar3, duration6.minus(duration4), tgsVar, i);
    }

    public final boolean k() {
        this.k.getClass();
        if (defpackage.acvt.i()) {
            android.content.Context context = defpackage.mkp.a.c;
            try {
                int i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("StartupMeasure", 0);
                int i2 = sharedPreferences.getInt("versionCode", -1);
                ((defpackage.yqj) a.l().ai(9028)).B("isFirstRun current=%d last=%d", i, i2);
                sharedPreferences.edit().putInt("versionCode", i).apply();
                return i != i2;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 9029)).u("GH package not found, unable to determine if first run");
            }
        }
        return false;
    }

    public final void m(defpackage.tgu tguVar, j$.time.Duration duration, defpackage.tgs tgsVar, int i) {
        defpackage.zaa zaaVarA;
        if (this.k != null) {
            defpackage.ysr.bj(tguVar.Y.contains(defpackage.tgt.b));
            this.k.getClass();
            if (defpackage.acvt.k()) {
                switch (tguVar.ordinal()) {
                    case 16:
                        zaaVarA = defpackage.kpu.a("STARTUP_CONTROL_CHANNEL_CONNECT_ATTEMPT", tgsVar, i);
                        break;
                    case 17:
                        zaaVarA = defpackage.kpu.a("STARTUP_WIFI_VERSION_REQUEST_RECEIVED", tgsVar, i);
                        break;
                    case 18:
                        zaaVarA = defpackage.kpu.a("STARTUP_WIFI_START_REQUEST_RECEIVED", tgsVar, i);
                        break;
                    case 19:
                        zaaVarA = defpackage.kpu.a("STARTUP_HU_SERVICE_DISCOVERY_COMPLETED", tgsVar, i);
                        break;
                    case 20:
                        zaaVarA = defpackage.kpu.a("STARTUP_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START", tgsVar, i);
                        break;
                    case 21:
                        zaaVarA = defpackage.kpu.a("STARTUP_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED", tgsVar, i);
                        break;
                    case 22:
                        zaaVarA = defpackage.kpu.a("STARTUP_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME", tgsVar, i);
                        break;
                    case 23:
                        zaaVarA = defpackage.kpu.a("STARTUP_PROJECTION_MODE_STARTED_RECORDED", tgsVar, i);
                        break;
                    case 24:
                        zaaVarA = defpackage.kpu.a("STARTUP_FACET_BAR_FIRST_RESUME", tgsVar, i);
                        break;
                    case 25:
                        zaaVarA = defpackage.kpu.a("STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME", tgsVar, i);
                        break;
                    case 26:
                        zaaVarA = defpackage.kpu.a("STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED", tgsVar, i);
                        break;
                    default:
                        return;
                }
                if (zaaVarA != null) {
                    defpackage.oim oimVarU = defpackage.omf.u();
                    defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 38, zaaVarA);
                    rroVarH.h(duration.toMillis());
                    oimVarU.f(rroVarH);
                }
            }
        }
    }
}
