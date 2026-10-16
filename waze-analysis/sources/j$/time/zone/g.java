package j$.time.zone;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArrayList f50114b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f50115c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile Set f50116d;

    /* renamed from: a, reason: collision with root package name */
    public final Set f50117a;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f50114b = copyOnWriteArrayList;
        f50115c = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new f(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f50117a = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneRules a(String str) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f50115c;
        g gVar = (g) concurrentHashMap.get(str);
        if (gVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new e("No time-zone data files registered");
            }
            throw new e("Unknown time-zone ID: " + str);
        }
        if (gVar.f50117a.contains(str)) {
            return new ZoneRules(TimeZone.getTimeZone(str));
        }
        throw new e("Not a built-in time zone: " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(g gVar) {
        Objects.requireNonNull(gVar, "provider");
        synchronized (g.class) {
            try {
                for (String str : gVar.f50117a) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((g) f50115c.putIfAbsent(str, gVar)) != null) {
                        throw new e("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + String.valueOf(gVar));
                    }
                }
                f50116d = Collections.unmodifiableSet(new HashSet(f50115c.keySet()));
            } catch (Throwable th) {
                throw th;
            }
        }
        f50114b.add(gVar);
    }
}
