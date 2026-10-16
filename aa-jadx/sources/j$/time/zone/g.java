package j$.time.zone;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    public static final java.util.concurrent.CopyOnWriteArrayList b;
    public static final j$.util.concurrent.ConcurrentHashMap c;
    public static volatile java.util.Set d;
    public final java.util.Set a;

    static {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        b = copyOnWriteArrayList;
        c = new j$.util.concurrent.ConcurrentHashMap(defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE, 0.75f, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.security.AccessController.doPrivileged(new j$.time.zone.f(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public g() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.String str : java.util.TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.a = java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j$.time.zone.ZoneRules a(java.lang.String str) {
        j$.util.Objects.a(str, "zoneId");
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = c;
        j$.time.zone.g gVar = (j$.time.zone.g) concurrentHashMap.get(str);
        if (gVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new j$.time.zone.e("No time-zone data files registered");
            }
            throw new j$.time.zone.e("Unknown time-zone ID: ".concat(str));
        }
        if (gVar.a.contains(str)) {
            return new j$.time.zone.ZoneRules(java.util.TimeZone.getTimeZone(str));
        }
        throw new j$.time.zone.e("Not a built-in time zone: ".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(j$.time.zone.g gVar) {
        j$.util.Objects.a(gVar, "provider");
        synchronized (j$.time.zone.g.class) {
            try {
                for (java.lang.String str : gVar.a) {
                    j$.util.Objects.a(str, "zoneId");
                    if (((j$.time.zone.g) c.putIfAbsent(str, gVar)) != null) {
                        throw new j$.time.zone.e("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + java.lang.String.valueOf(gVar));
                    }
                }
                d = java.util.Collections.unmodifiableSet(new java.util.HashSet(c.keySet()));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        b.add(gVar);
    }
}
