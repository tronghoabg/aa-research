package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class tgj {
    public static final yph a = yph.c("GH.StartupMeasure");
    public static final Duration b = Duration.ofSeconds(1);
    public static final ygr c = yrm.o(tfy.GEARHEAD_PROJECTION_MODE_STARTED, tfy.GEARHEAD_FACET_BAR_FIRST_RESUME, tfy.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME);
    public static final yfy d;
    public static final ygr e;
    public static final ygr f;
    public static final tgj g;
    private static final ygr l;
    public final yfy h;
    public final yfy i;
    public boolean j = false;
    public kpo k;
    private UUID m;

    static {
        tfy tfyVar = tfy.GEARHEAD_PROJECTION_MODE_STARTED;
        tfy tfyVar2 = tfy.GEARHEAD_WIRELESS_STARTUP_PROJECTION_MODE_STARTED;
        tfy tfyVar3 = tfy.GEARHEAD_FACET_BAR_FIRST_RESUME;
        tfy tfyVar4 = tfy.GEARHEAD_WIRELESS_STARTUP_FACET_BAR_FIRST_RESUME;
        tfy tfyVar5 = tfy.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME;
        tfy tfyVar6 = tfy.GEARHEAD_WIRELESS_STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME;
        tfy tfyVar7 = tfy.FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED;
        tfy tfyVar8 = tfy.GEARHEAD_WIRELESS_STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED;
        tfy tfyVar9 = tfy.GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT_RFCOMM;
        tfy tfyVar10 = tfy.GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT;
        tfy tfyVar11 = tfy.GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT_TCP;
        tfy tfyVar12 = tfy.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_RFCOMM;
        tfy tfyVar13 = tfy.GEARHEAD_WIRELESS_WIFI_VERSION_REQUEST_RECEIVED;
        tfy tfyVar14 = tfy.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_TCP;
        tfy tfyVar15 = tfy.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_RFCOMM;
        tfy tfyVar16 = tfy.GEARHEAD_WIRELESS_WIFI_START_REQUEST_RECEIVED;
        tfy tfyVar17 = tfy.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_TCP;
        wub.E(tfyVar, tfyVar2);
        wub.E(tfyVar3, tfyVar4);
        wub.E(tfyVar5, tfyVar6);
        wub.E(tfyVar7, tfyVar8);
        wub.E(tfyVar9, tfyVar10);
        wub.E(tfyVar11, tfyVar10);
        wub.E(tfyVar12, tfyVar13);
        wub.E(tfyVar14, tfyVar13);
        wub.E(tfyVar15, tfyVar16);
        wub.E(tfyVar17, tfyVar16);
        d = yrm.F(ylx.a(10, new Object[]{tfyVar, tfyVar2, tfyVar3, tfyVar4, tfyVar5, tfyVar6, tfyVar7, tfyVar8, tfyVar9, tfyVar10, tfyVar11, tfyVar10, tfyVar12, tfyVar13, tfyVar14, tfyVar13, tfyVar15, tfyVar16, tfyVar17, tfyVar16}, null));
        e = yrm.o(tfy.GEARHEAD_PROJECTION_MODE_STARTED, tfy.GEARHEAD_FACET_BAR_FIRST_RESUME, tfy.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME, tfy.FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED);
        f = yrm.o(tfy.GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT_RFCOMM, tfy.GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT_TCP, tfy.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_RFCOMM, tfy.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_TCP, tfy.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_RFCOMM, tfy.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_TCP);
        l = yrm.o(tfy.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_RFCOMM, tfy.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_TCP);
        g = new tgj();
    }

    public tgj() {
        final int i = 1;
        final int i2 = 0;
        int i3 = 3;
        this.i = yrm.F(yfy.l(tfx.a, new tgi(new BooleanSupplier(this) { // from class: tgg
            public final /* synthetic */ tgj a;

            {
                this.a = this;
            }

            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                int i4 = i;
                tgj tgjVar = this.a;
                if (i4 != 0) {
                    Map map = (Map) tgjVar.h.get(tfx.a);
                    map.getClass();
                    if (!tgjVar.j) {
                        return (map.containsKey(tfy.GEARHEAD_WARM_STARTUP_STARTED) || map.containsKey(tfy.GEARHEAD_COLD_STARTUP_STARTED)) && map.containsKey(tfy.PROJECTION_STARTED_USB) && map.keySet().containsAll(tgj.c);
                    }
                    Optional optionalB = tgjVar.b();
                    if (!optionalB.isEmpty()) {
                        tfy tfyVar = tfy.PROJECTION_STARTED_USB;
                        if (map.containsKey(tfyVar)) {
                            Set setKeySet = map.keySet();
                            ygr ygrVar = tgj.c;
                            if (!setKeySet.containsAll(ygrVar)) {
                                return false;
                            }
                            Duration duration = ((tgh) optionalB.get()).b;
                            Duration duration2 = (Duration) map.get(tfyVar);
                            duration2.getClass();
                            if (ysi.d(duration, duration2)) {
                                return false;
                            }
                            yno it = ygrVar.iterator();
                            while (it.hasNext()) {
                                Duration duration3 = (Duration) map.get((tfy) it.next());
                                duration3.getClass();
                                if (ysi.d(duration2, duration3)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                    return false;
                }
                Map map2 = (Map) tgjVar.h.get(tfx.b);
                map2.getClass();
                if (!tgjVar.j) {
                    return (map2.containsKey(tfy.GEARHEAD_WIRELESS_WARM_STARTUP_STARTED) || map2.containsKey(tfy.GEARHEAD_WIRELESS_COLD_STARTUP_STARTED)) && map2.containsKey(tfy.PROJECTION_STARTED_WIRELESS) && map2.keySet().containsAll(tgj.c);
                }
                Optional optionalC = tgjVar.c();
                if (!optionalC.isEmpty()) {
                    tfy tfyVar2 = tfy.PROJECTION_STARTED_WIRELESS;
                    if (map2.containsKey(tfyVar2)) {
                        Set setKeySet2 = map2.keySet();
                        ygr ygrVar2 = tgj.c;
                        if (!setKeySet2.containsAll(ygrVar2)) {
                            return false;
                        }
                        Duration duration4 = ((tgh) optionalC.get()).b;
                        Duration duration5 = (Duration) map2.get(tfyVar2);
                        duration5.getClass();
                        if (ysi.d(duration4, duration5)) {
                            return false;
                        }
                        yno it2 = ygrVar2.iterator();
                        while (it2.hasNext()) {
                            Duration duration6 = (Duration) map2.get((tfy) it2.next());
                            duration6.getClass();
                            if (ysi.d(duration5, duration6)) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
        }, new Runnable() { // from class: tgf
            @Override // java.lang.Runnable
            public final void run() {
                tgj tgjVar = this.a;
                yfy yfyVar = tgjVar.h;
                tfx tfxVar = tfx.a;
                Map map = (Map) yfyVar.get(tfxVar);
                map.getClass();
                if (tgjVar.j) {
                    tgj.j(map, (tgh) tgjVar.b().orElseThrow());
                }
                tgj.d(map);
                if (map.containsKey(tfy.GEARHEAD_FRX_STARTED)) {
                    ((ype) tgj.a.l().ai((char) 9015)).u("Not recording startup latency for session with FRX");
                } else if (tgjVar.k()) {
                    ((ype) tgj.a.l().ai((char) 9014)).u("not recording startup latency for first run for new version");
                } else {
                    tfy tfyVar = tfy.GEARHEAD_COLD_STARTUP_STARTED;
                    if (map.containsKey(tfyVar)) {
                        Map map2 = (Map) yfyVar.get(tfxVar);
                        map2.getClass();
                        Duration duration = (Duration) map2.get(tfyVar);
                        duration.getClass();
                        Map map3 = (Map) yfyVar.get(tfxVar);
                        map3.getClass();
                        for (Map.Entry entry : map3.entrySet()) {
                            tgj.e(entry, duration, true);
                            if (tgj.l((tfy) entry.getKey())) {
                                tfy tfyVarA = tgj.a((tfy) entry.getKey(), true);
                                vky vkyVar = tfyVarA.X;
                                vla.a().c(vkyVar, duration.toMillis(), ((Duration) entry.getValue()).toMillis());
                                ((ype) ((ype) tgj.a.f()).ai(9007)).M("recording %s=%s", vkyVar, ((Duration) entry.getValue()).minus(duration));
                                tgjVar.g(tfyVarA, ((Duration) entry.getValue()).minus(duration));
                            }
                        }
                        tgjVar.h(false);
                    } else {
                        tfy tfyVar2 = tfy.GEARHEAD_WARM_STARTUP_STARTED;
                        if (map.containsKey(tfyVar2)) {
                            Map map4 = (Map) yfyVar.get(tfxVar);
                            map4.getClass();
                            Duration duration2 = (Duration) map4.get(tfyVar2);
                            duration2.getClass();
                            Map map5 = (Map) yfyVar.get(tfxVar);
                            map5.getClass();
                            for (Map.Entry entry2 : map5.entrySet()) {
                                tgj.e(entry2, duration2, false);
                                if (tgj.l((tfy) entry2.getKey())) {
                                    tfy tfyVarA2 = tgj.a((tfy) entry2.getKey(), false);
                                    vky vkyVar2 = tfyVarA2.X;
                                    vla.a().c(vkyVar2, duration2.toMillis(), ((Duration) entry2.getValue()).toMillis());
                                    ((ype) ((ype) tgj.a.f()).ai(9008)).M("recording %s=%s", vkyVar2, ((Duration) entry2.getValue()).minus(duration2));
                                    tgjVar.g(tfyVarA2, ((Duration) entry2.getValue()).minus(duration2));
                                }
                            }
                            tgjVar.h(true);
                        } else {
                            ((ype) ((ype) tgj.a.h()).ai((char) 9013)).u("no warm or cold startup time recorded, ignoring call");
                        }
                    }
                }
                map.clear();
            }
        }), tfx.b, new tgi(new BooleanSupplier(this) { // from class: tgg
            public final /* synthetic */ tgj a;

            {
                this.a = this;
            }

            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                int i4 = i2;
                tgj tgjVar = this.a;
                if (i4 != 0) {
                    Map map = (Map) tgjVar.h.get(tfx.a);
                    map.getClass();
                    if (!tgjVar.j) {
                        return (map.containsKey(tfy.GEARHEAD_WARM_STARTUP_STARTED) || map.containsKey(tfy.GEARHEAD_COLD_STARTUP_STARTED)) && map.containsKey(tfy.PROJECTION_STARTED_USB) && map.keySet().containsAll(tgj.c);
                    }
                    Optional optionalB = tgjVar.b();
                    if (!optionalB.isEmpty()) {
                        tfy tfyVar = tfy.PROJECTION_STARTED_USB;
                        if (map.containsKey(tfyVar)) {
                            Set setKeySet = map.keySet();
                            ygr ygrVar = tgj.c;
                            if (!setKeySet.containsAll(ygrVar)) {
                                return false;
                            }
                            Duration duration = ((tgh) optionalB.get()).b;
                            Duration duration2 = (Duration) map.get(tfyVar);
                            duration2.getClass();
                            if (ysi.d(duration, duration2)) {
                                return false;
                            }
                            yno it = ygrVar.iterator();
                            while (it.hasNext()) {
                                Duration duration3 = (Duration) map.get((tfy) it.next());
                                duration3.getClass();
                                if (ysi.d(duration2, duration3)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                    return false;
                }
                Map map2 = (Map) tgjVar.h.get(tfx.b);
                map2.getClass();
                if (!tgjVar.j) {
                    return (map2.containsKey(tfy.GEARHEAD_WIRELESS_WARM_STARTUP_STARTED) || map2.containsKey(tfy.GEARHEAD_WIRELESS_COLD_STARTUP_STARTED)) && map2.containsKey(tfy.PROJECTION_STARTED_WIRELESS) && map2.keySet().containsAll(tgj.c);
                }
                Optional optionalC = tgjVar.c();
                if (!optionalC.isEmpty()) {
                    tfy tfyVar2 = tfy.PROJECTION_STARTED_WIRELESS;
                    if (map2.containsKey(tfyVar2)) {
                        Set setKeySet2 = map2.keySet();
                        ygr ygrVar2 = tgj.c;
                        if (!setKeySet2.containsAll(ygrVar2)) {
                            return false;
                        }
                        Duration duration4 = ((tgh) optionalC.get()).b;
                        Duration duration5 = (Duration) map2.get(tfyVar2);
                        duration5.getClass();
                        if (ysi.d(duration4, duration5)) {
                            return false;
                        }
                        yno it2 = ygrVar2.iterator();
                        while (it2.hasNext()) {
                            Duration duration6 = (Duration) map2.get((tfy) it2.next());
                            duration6.getClass();
                            if (ysi.d(duration5, duration6)) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
        }, new teg(this, i3))));
        Stream stream = DesugarArrays.stream(tfx.values());
        final kqm kqmVar = new kqm(15);
        Collector collector = ycm.a;
        int i4 = 4;
        this.h = (yfy) stream.collect(Collector.CC.of(new yce(i4), new BiConsumer() { // from class: yci
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Collector collector2 = ycm.a;
                tfx tfxVar = (tfx) obj2;
                yph yphVar = tgj.a;
                Object objApply = kqmVar.apply(obj2);
                tfxVar.getClass();
                objApply.getClass();
                ((ycl) obj).a(tfxVar, objApply);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new ycf(i4), new ych(i3), Collector.Characteristics.UNORDERED));
    }

    public static tfy a(tfy tfyVar, boolean z) {
        return tfyVar.equals(tfy.GEARHEAD_PROJECTION_MODE_STARTED) ? z ? tfy.GEARHEAD_COLD_STARTUP_PROJECTION_MODE_STARTED : tfy.GEARHEAD_WARM_STARTUP_PROJECTION_MODE_STARTED : tfyVar.equals(tfy.GEARHEAD_FACET_BAR_FIRST_RESUME) ? z ? tfy.GEARHEAD_COLD_STARTUP_FACET_BAR_FIRST_RESUME : tfy.GEARHEAD_WARM_STARTUP_FACET_BAR_FIRST_RESUME : tfyVar.equals(tfy.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME) ? z ? tfy.GEARHEAD_COLD_STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME : tfy.GEARHEAD_WARM_STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME : tfyVar.equals(tfy.FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED) ? z ? tfy.GEARHEAD_COLD_STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED : tfy.GEARHEAD_WARM_STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED : tfyVar;
    }

    public static void d(Map map) {
        tfy tfyVar = tfy.GEARHEAD_PREFLIGHT_STARTED;
        if (map.containsKey(tfyVar)) {
            tfy tfyVar2 = tfy.GEARHEAD_PREFLIGHT_COMPLETED;
            if (map.containsKey(tfyVar2)) {
                final Duration duration = (Duration) map.get(tfyVar2);
                duration.getClass();
                Duration duration2 = (Duration) map.get(tfyVar);
                duration2.getClass();
                final Duration durationMinus = duration.minus(duration2);
                Map.EL.replaceAll(map, new BiFunction() { // from class: tge
                    public final /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        Duration duration3 = (Duration) obj2;
                        yph yphVar = tgj.a;
                        return duration3.compareTo(duration) >= 0 ? duration3.minus(durationMinus) : duration3;
                    }
                });
            }
        }
        tfy tfyVar3 = tfy.GEARHEAD_CAR_SERVICE_VIDEO_FOCUS_GAINED;
        if (map.containsKey(tfyVar3)) {
            tfy tfyVar4 = tfy.GEARHEAD_PROJECTION_MODE_STARTED;
            if (map.containsKey(tfyVar4)) {
                Duration duration3 = (Duration) map.get(tfyVar3);
                duration3.getClass();
                Duration duration4 = (Duration) map.get(tfyVar4);
                duration4.getClass();
                Duration durationMinus2 = duration3.minus(duration4);
                if (!durationMinus2.isNegative()) {
                    ArrayList arrayList = new ArrayList(map.keySet());
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        tfy tfyVar5 = (tfy) arrayList.get(i);
                        Duration duration5 = (Duration) map.get(tfyVar5);
                        duration5.getClass();
                        if (duration5.compareTo(duration3) >= 0) {
                            map.put(tfyVar5, duration5.minus(durationMinus2));
                        }
                    }
                }
            }
        }
        tfy tfyVar6 = tfy.GEARHEAD_FACET_BAR_FIRST_RESUME;
        if (map.containsKey(tfyVar6)) {
            tfy tfyVar7 = tfy.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME;
            if (map.containsKey(tfyVar7)) {
                tfy tfyVar8 = tfy.FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED;
                Duration duration6 = (Duration) map.get(tfyVar6);
                duration6.getClass();
                Duration duration7 = (Duration) map.get(tfyVar7);
                duration7.getClass();
                map.put(tfyVar8, (Duration) ysi.j(duration6, duration7));
            }
        }
        if (map.containsKey(tfy.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_TCP) && map.containsKey(tfy.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_TCP)) {
            o(map, 3);
        } else if (map.containsKey(tfy.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_RFCOMM) && map.containsKey(tfy.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_RFCOMM)) {
            o(map, 2);
        }
    }

    public static void e(Map.Entry entry, Duration duration, boolean z) {
        int iCompareTo = ((Duration) entry.getValue()).compareTo(duration);
        woy.O(iCompareTo >= 0, String.format(Locale.US, "%s end time(%s) cannot be before start time(%s). isColdStartup: %b.", entry.getKey(), entry.getValue(), duration, Boolean.valueOf(z)));
    }

    public static void j(java.util.Map map, tgh tghVar) {
        yum yumVarF = yum.f(map);
        Duration duration = tghVar.b;
        yno it = yumVarF.e(new pcx(duration, 15)).b().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((ype) ((ype) a.h()).ai(9022)).S("%s end time(%s) cannot be before start time(%s). isColdStartup: %b.", entry.getKey(), entry.getValue(), duration, Boolean.valueOf(tghVar.a == tfw.COLD));
            Map.EL.remove(map, entry.getKey(), entry.getValue());
        }
    }

    public static boolean l(tfy tfyVar) {
        return e.contains(tfyVar);
    }

    static final void n(tfy tfyVar, tfw tfwVar, int i, Duration duration, Duration duration2) {
        vla.a().c(tfyVar.a(tfwVar, i), duration.toMillis(), duration2.toMillis());
    }

    private static void o(java.util.Map map, int i) {
        Duration duration = i == 3 ? (Duration) map.get(tfy.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_TCP) : (Duration) map.get(tfy.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_RFCOMM);
        duration.getClass();
        Duration duration2 = i == 3 ? (Duration) map.get(tfy.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_TCP) : (Duration) map.get(tfy.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_RFCOMM);
        duration2.getClass();
        Duration durationMinus = duration2.minus(duration);
        if (durationMinus.isNegative()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            Duration duration3 = (Duration) entry.getValue();
            duration3.getClass();
            if (!l.contains(entry.getKey()) && duration3.compareTo(duration2) >= 0) {
                entry.setValue(duration3.minus(durationMinus));
            }
        }
    }

    public final Optional b() {
        java.util.Map map = (java.util.Map) this.h.get(tfx.a);
        map.getClass();
        tfy tfyVar = tfy.GEARHEAD_COLD_STARTUP_STARTED;
        if (map.containsKey(tfyVar)) {
            return Optional.of(new tgh(tfw.COLD, (Duration) map.get(tfyVar)));
        }
        tfy tfyVar2 = tfy.GEARHEAD_WARM_STARTUP_STARTED;
        return map.containsKey(tfyVar2) ? Optional.of(new tgh(tfw.WARM, (Duration) map.get(tfyVar2))) : Optional.empty();
    }

    public final Optional c() {
        java.util.Map map = (java.util.Map) this.h.get(tfx.b);
        map.getClass();
        tfy tfyVar = tfy.GEARHEAD_WIRELESS_COLD_STARTUP_STARTED;
        if (map.containsKey(tfyVar)) {
            return Optional.of(new tgh(tfw.COLD, (Duration) map.get(tfyVar)));
        }
        tfy tfyVar2 = tfy.GEARHEAD_WIRELESS_WARM_STARTUP_STARTED;
        return map.containsKey(tfyVar2) ? Optional.of(new tgh(tfw.WARM, (Duration) map.get(tfyVar2))) : Optional.empty();
    }

    public final synchronized void f(final tfy tfyVar, final Duration duration, UUID uuid) {
        if (!uuid.equals(this.m)) {
            ((ype) a.l().ai((char) 9006)).y("Received a new drive id %s. Resetting measurements.", uuid);
            Iterable$EL.forEach(this.h.values(), new nxt(5));
            this.m = uuid;
        }
        yum yumVarG = yum.g(Collection.EL.stream(this.i.entrySet()));
        ygr ygrVar = tfyVar.Y;
        ygrVar.getClass();
        Map.EL.forEach(yumVarG.d(new imb(ygrVar, 4)).d(new Predicate() { // from class: tgc
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo56negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                tgj tgjVar = this.a;
                java.util.Map map = (java.util.Map) tgjVar.h.get((tfx) obj);
                map.getClass();
                tfy tfyVar2 = tfyVar;
                Duration duration2 = duration;
                if (!tgjVar.j && map.containsKey(tfyVar2)) {
                    if (duration2.minus((Duration) map.get(tfyVar2)).compareTo(tgj.b) < 0) {
                        ((ype) ((ype) tgj.a.h()).ai((char) 9020)).y("Ignoring duplicate startup event %s.", tfyVar2);
                        return false;
                    }
                    ((ype) ((ype) tgj.a.h()).ai((char) 9021)).y("Received duplicate %s. Resetting measurements as startup events are not repeated.", tfyVar2);
                    map.clear();
                }
                map.put(tfyVar2, duration2);
                ((ype) ((ype) tgj.a.f()).ai(9019)).M("logEvent %s=%s", tfyVar2, duration2);
                return true;
            }
        }).b(), new BiConsumer() { // from class: tgd
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                tgi tgiVar = (tgi) this.a.i.get((tfx) obj);
                tgiVar.getClass();
                if (tgiVar.a.getAsBoolean()) {
                    tgiVar.b.run();
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public final void g(tfy tfyVar, Duration duration) {
        yyv yyvVar;
        if (this.k != null) {
            woy.Z(tfyVar.Y.contains(tfx.a));
            this.k.getClass();
            if (acur.l()) {
                switch (tfyVar) {
                    case GEARHEAD_COLD_HU_SERVICE_DISCOVERY_COMPLETED:
                        yyvVar = yyv.COLD_STARTUP_HU_SERVICE_DISCOVERY_COMPLETED;
                        break;
                    case GEARHEAD_COLD_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START:
                        yyvVar = yyv.COLD_STARTUP_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START;
                        break;
                    case GEARHEAD_COLD_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED:
                        yyvVar = yyv.COLD_STARTUP_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED;
                        break;
                    case GEARHEAD_COLD_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME:
                        yyvVar = yyv.COLD_STARTUP_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME;
                        break;
                    case GEARHEAD_COLD_STARTUP_PROJECTION_MODE_STARTED:
                        yyvVar = yyv.COLD_STARTUP_PROJECTION_MODE_STARTED_RECORDED;
                        break;
                    case GEARHEAD_COLD_STARTUP_FACET_BAR_FIRST_RESUME:
                        yyvVar = yyv.COLD_STARTUP_FACET_BAR_FIRST_RESUME;
                        break;
                    case GEARHEAD_COLD_STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME:
                        yyvVar = yyv.COLD_STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME;
                        break;
                    case GEARHEAD_COLD_STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED:
                        yyvVar = yyv.COLD_STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED;
                        break;
                    case GEARHEAD_WARM_HU_SERVICE_DISCOVERY_COMPLETED:
                        yyvVar = yyv.WARM_STARTUP_HU_SERVICE_DISCOVERY_COMPLETED;
                        break;
                    case GEARHEAD_WARM_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START:
                        yyvVar = yyv.WARM_STARTUP_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START;
                        break;
                    case GEARHEAD_WARM_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED:
                        yyvVar = yyv.WARM_STARTUP_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED;
                        break;
                    case GEARHEAD_WARM_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME:
                        yyvVar = yyv.WARM_STARTUP_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME;
                        break;
                    case GEARHEAD_WARM_STARTUP_PROJECTION_MODE_STARTED:
                        yyvVar = yyv.WARM_STARTUP_PROJECTION_MODE_STARTED_RECORDED;
                        break;
                    case GEARHEAD_WARM_STARTUP_FACET_BAR_FIRST_RESUME:
                        yyvVar = yyv.WARM_STARTUP_FACET_BAR_FIRST_RESUME;
                        break;
                    case GEARHEAD_WARM_STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME:
                        yyvVar = yyv.WARM_STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME;
                        break;
                    case GEARHEAD_WARM_STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED:
                        yyvVar = yyv.WARM_STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED;
                        break;
                    default:
                        return;
                }
                ohs ohsVarJ = ebf.j();
                rqu rquVarH = rqv.h(yxy.GEARHEAD, 38, yyvVar);
                rquVarH.h(duration.toMillis());
                ohsVarJ.f(rquVarH);
            }
        }
    }

    public final void h(boolean z) {
        java.util.Map map = (java.util.Map) this.h.get(tfx.a);
        map.getClass();
        Duration duration = z ? (Duration) Map.EL.getOrDefault(map, tfy.GEARHEAD_WARM_STARTUP_STARTED, Duration.ofMillis(-1L)) : (Duration) Map.EL.getOrDefault(map, tfy.GEARHEAD_COLD_STARTUP_STARTED, Duration.ofMillis(-1L));
        duration.getClass();
        Duration duration2 = (Duration) Map.EL.getOrDefault(map, tfy.GEARHEAD_PROJECTION_ENABLED, Duration.ofMillis(-1L));
        duration2.getClass();
        Duration duration3 = (Duration) Map.EL.getOrDefault(map, tfy.PROJECTION_LIFECYCLE_LISTENER_ON_PROJECTION_START, Duration.ofMillis(-1L));
        duration3.getClass();
        Duration duration4 = (Duration) Map.EL.getOrDefault(map, tfy.GEARHEAD_PROJECTION_MODE_STARTED, Duration.ofMillis(-1L));
        duration4.getClass();
        Duration duration5 = (Duration) Map.EL.getOrDefault(map, tfy.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME, Duration.ofMillis(-1L));
        duration5.getClass();
        if (duration2.compareTo(duration) <= 0 || duration3.compareTo(duration2) <= 0 || duration4.compareTo(duration3) <= 0 || duration5.compareTo(duration3) <= 0) {
            ((ype) ((ype) a.g()).ai(9009)).T("persistMilestones failed, invalid measurements baseMs=%d huMs=%d pLifecycleStartedMs=%d pModeStartedMs=%d carActivityFirstResumeMs=%d", Long.valueOf(duration.toMillis()), Long.valueOf(duration2.toMillis()), Long.valueOf(duration3.toMillis()), Long.valueOf(duration4.toMillis()), Long.valueOf(duration5.toMillis()));
            return;
        }
        ((ype) a.l().ai(9010)).S("persistMilestones huMs=%d pLifecycleStartedMs=%d pModeStartedMs=%d carActivityFirstResumeMs=%d", Long.valueOf(duration2.minus(duration).toMillis()), Long.valueOf(duration3.minus(duration2).toMillis()), Long.valueOf(duration4.minus(duration3).toMillis()), Long.valueOf(duration5.minus(duration3).toMillis()));
        vla.a().c(z ? tfy.GEARHEAD_WARM_HU_SERVICE_DISCOVERY_COMPLETED.X : tfy.GEARHEAD_COLD_HU_SERVICE_DISCOVERY_COMPLETED.X, duration.toMillis(), duration2.toMillis());
        g(z ? tfy.GEARHEAD_WARM_HU_SERVICE_DISCOVERY_COMPLETED : tfy.GEARHEAD_COLD_HU_SERVICE_DISCOVERY_COMPLETED, duration2.minus(duration));
        vla.a().c(z ? tfy.GEARHEAD_WARM_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START.X : tfy.GEARHEAD_COLD_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START.X, duration2.toMillis(), duration3.toMillis());
        g(z ? tfy.GEARHEAD_WARM_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START : tfy.GEARHEAD_COLD_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START, duration3.minus(duration2));
        vla.a().c(z ? tfy.GEARHEAD_WARM_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED.X : tfy.GEARHEAD_COLD_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED.X, duration3.toMillis(), duration4.toMillis());
        g(z ? tfy.GEARHEAD_WARM_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED : tfy.GEARHEAD_COLD_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED, duration4.minus(duration3));
        vla.a().c(z ? tfy.GEARHEAD_WARM_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME.X : tfy.GEARHEAD_COLD_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME.X, duration3.toMillis(), duration5.toMillis());
        g(z ? tfy.GEARHEAD_WARM_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED : tfy.GEARHEAD_COLD_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED, duration5.minus(duration3));
    }

    public final void i(final tfw tfwVar) {
        yfy yfyVar = this.h;
        tfx tfxVar = tfx.b;
        java.util.Map map = (java.util.Map) yfyVar.get(tfxVar);
        map.getClass();
        tfw tfwVar2 = tfw.COLD;
        final int i = true != map.containsKey(tfy.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_TCP) ? 2 : 3;
        final boolean z = tfwVar == tfwVar2;
        final Duration duration = (Duration) map.get(z ? tfy.GEARHEAD_WIRELESS_COLD_STARTUP_STARTED : tfy.GEARHEAD_WIRELESS_WARM_STARTUP_STARTED);
        duration.getClass();
        Iterable$EL.forEach(map.entrySet(), new Consumer() { // from class: tfz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                tgj.e((Map.Entry) obj, duration, z);
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        yum yumVarH = yum.f(map).d(new oly(18)).h(new ric(13));
        final BiConsumer biConsumer = new BiConsumer() { // from class: tga
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ype) ((ype) tgj.a.f()).ai(9005)).M("recording %s=%s", ((tfy) obj).a(tfwVar, i), ((Duration) obj2).minus(duration));
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                return BiConsumer$CC.$default$andThen(this, biConsumer2);
            }
        };
        final yum yumVarG = yum.g(yumVarH.a().peek(new Consumer() { // from class: yue
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                biConsumer.accept(entry.getKey(), entry.getValue());
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
        final BiConsumer biConsumer2 = new BiConsumer() { // from class: tgb
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                tfy tfyVar = (tfy) obj;
                tfw tfwVar3 = tfwVar;
                int i2 = i;
                Duration duration2 = (Duration) obj2;
                Duration duration3 = duration;
                tgj.n(tfyVar, tfwVar3, i2, duration3, duration2);
                this.a.m(tfyVar, duration2.minus(duration3), tfwVar3, i2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer3) {
                return BiConsumer$CC.$default$andThen(this, biConsumer3);
            }
        };
        yumVarG.b.forEach(new Consumer() { // from class: yuk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                BiConsumer biConsumer3 = biConsumer2;
                yum yumVar = yumVarG;
                biConsumer3.accept(yumVar.c.apply(obj), yumVar.d.apply(obj));
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        java.util.Map map2 = (java.util.Map) yfyVar.get(tfxVar);
        map2.getClass();
        Duration duration2 = tfwVar == tfw.WARM ? (Duration) Map.EL.getOrDefault(map2, tfy.GEARHEAD_WIRELESS_WARM_STARTUP_STARTED, Duration.ofMillis(-1L)) : (Duration) Map.EL.getOrDefault(map2, tfy.GEARHEAD_WIRELESS_COLD_STARTUP_STARTED, Duration.ofMillis(-1L));
        duration2.getClass();
        Duration duration3 = (Duration) Map.EL.getOrDefault(map2, tfy.GEARHEAD_PROJECTION_ENABLED, Duration.ofMillis(-1L));
        duration3.getClass();
        Duration duration4 = (Duration) Map.EL.getOrDefault(map2, tfy.PROJECTION_LIFECYCLE_LISTENER_ON_PROJECTION_START, Duration.ofMillis(-1L));
        duration4.getClass();
        Duration duration5 = (Duration) Map.EL.getOrDefault(map2, tfy.GEARHEAD_PROJECTION_MODE_STARTED, Duration.ofMillis(-1L));
        duration5.getClass();
        Duration duration6 = (Duration) Map.EL.getOrDefault(map2, tfy.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME, Duration.ofMillis(-1L));
        duration6.getClass();
        if (duration3.compareTo(duration2) <= 0 || duration4.compareTo(duration3) <= 0 || duration5.compareTo(duration4) <= 0 || duration6.compareTo(duration4) <= 0) {
            ((ype) ((ype) a.g()).ai(9011)).T("persistMilestones failed, invalid measurements baseMs=%d huMs=%d pLifecycleStartedMs=%d pModeStartedMs=%d carActivityFirstResumeMs=%d", Long.valueOf(duration2.toMillis()), Long.valueOf(duration3.toMillis()), Long.valueOf(duration4.toMillis()), Long.valueOf(duration5.toMillis()), Long.valueOf(duration6.toMillis()));
            return;
        }
        ((ype) a.l().ai(9012)).S("persistMilestones huMs=%d pLifecycleStartedMs=%d pModeStartedMs=%d carActivityFirstResumeMs=%d", Long.valueOf(duration3.minus(duration2).toMillis()), Long.valueOf(duration4.minus(duration3).toMillis()), Long.valueOf(duration5.minus(duration4).toMillis()), Long.valueOf(duration6.minus(duration4).toMillis()));
        tfy tfyVar = tfy.GEARHEAD_WIRELESS_HU_SERVICE_DISCOVERY_COMPLETED;
        n(tfyVar, tfwVar, i, duration2, duration3);
        m(tfyVar, duration3.minus(duration2), tfwVar, i);
        tfy tfyVar2 = tfy.GEARHEAD_WIRELESS_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START;
        n(tfyVar2, tfwVar, i, duration3, duration4);
        m(tfyVar2, duration4.minus(duration3), tfwVar, i);
        tfy tfyVar3 = tfy.GEARHEAD_WIRELESS_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED;
        n(tfyVar3, tfwVar, i, duration4, duration5);
        m(tfyVar3, duration5.minus(duration4), tfwVar, i);
        n(tfy.GEARHEAD_WIRELESS_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME, tfwVar, i, duration4, duration6);
        m(tfyVar3, duration6.minus(duration4), tfwVar, i);
    }

    public final boolean k() {
        this.k.getClass();
        if (acur.j()) {
            Context context = mki.a.c;
            try {
                int i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                SharedPreferences sharedPreferences = context.getSharedPreferences("StartupMeasure", 0);
                int i2 = sharedPreferences.getInt("versionCode", -1);
                ((ype) a.l().ai(9003)).B("isFirstRun current=%d last=%d", i, i2);
                sharedPreferences.edit().putInt("versionCode", i).apply();
                return i != i2;
            } catch (PackageManager.NameNotFoundException unused) {
                ((ype) ((ype) a.g()).ai((char) 9004)).u("GH package not found, unable to determine if first run");
            }
        }
        return false;
    }

    public final void m(tfy tfyVar, Duration duration, tfw tfwVar, int i) {
        yyv yyvVarA;
        if (this.k != null) {
            woy.Z(tfyVar.Y.contains(tfx.b));
            this.k.getClass();
            if (acur.l()) {
                switch (tfyVar.ordinal()) {
                    case 16:
                        yyvVarA = kpo.a("STARTUP_CONTROL_CHANNEL_CONNECT_ATTEMPT", tfwVar, i);
                        break;
                    case 17:
                        yyvVarA = kpo.a("STARTUP_WIFI_VERSION_REQUEST_RECEIVED", tfwVar, i);
                        break;
                    case 18:
                        yyvVarA = kpo.a("STARTUP_WIFI_START_REQUEST_RECEIVED", tfwVar, i);
                        break;
                    case 19:
                        yyvVarA = kpo.a("STARTUP_HU_SERVICE_DISCOVERY_COMPLETED", tfwVar, i);
                        break;
                    case 20:
                        yyvVarA = kpo.a("STARTUP_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START", tfwVar, i);
                        break;
                    case 21:
                        yyvVarA = kpo.a("STARTUP_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED", tfwVar, i);
                        break;
                    case 22:
                        yyvVarA = kpo.a("STARTUP_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME", tfwVar, i);
                        break;
                    case 23:
                        yyvVarA = kpo.a("STARTUP_PROJECTION_MODE_STARTED_RECORDED", tfwVar, i);
                        break;
                    case 24:
                        yyvVarA = kpo.a("STARTUP_FACET_BAR_FIRST_RESUME", tfwVar, i);
                        break;
                    case 25:
                        yyvVarA = kpo.a("STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME", tfwVar, i);
                        break;
                    case 26:
                        yyvVarA = kpo.a("STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED", tfwVar, i);
                        break;
                    default:
                        return;
                }
                if (yyvVarA != null) {
                    ohs ohsVarJ = ebf.j();
                    rqu rquVarH = rqv.h(yxy.GEARHEAD, 38, yyvVarA);
                    rquVarH.h(duration.toMillis());
                    ohsVarJ.f(rquVarH);
                }
            }
        }
    }
}
