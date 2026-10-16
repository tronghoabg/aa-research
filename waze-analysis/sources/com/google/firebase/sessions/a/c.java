package com.google.firebase.sessions.a;

import android.util.Log;
import com.google.firebase.crashlytics.a.c.j;
import h.g.b.x;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.h.i;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f10774a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f10775b;

    static {
        Map mapSynchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        x.e(mapSynchronizedMap, "synchronizedMap(...)");
        f10775b = mapSynchronizedMap;
    }

    public static final void b(d dVar) {
        x.f(dVar, "subscriberName");
        if (dVar == d.f10777b) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map map = f10775b;
        if (map.containsKey(dVar)) {
            Log.d("SessionsDependencies", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new a(i.d()));
        Log.d("SessionsDependencies", "Dependency to " + dVar + " added.");
    }

    public static final void c(j jVar) {
        x.f(jVar, "subscriber");
        d dVar = d.f10776a;
        a aVarD = d(dVar);
        if (aVarD.b() != null) {
            Log.d("SessionsDependencies", "Subscriber " + dVar + " already registered.");
            return;
        }
        aVarD.c(jVar);
        Log.d("SessionsDependencies", "Subscriber " + dVar + " registered.");
        aVarD.a().unlock(null);
    }

    private static final a d(d dVar) {
        Object obj = f10775b.get(dVar);
        if (obj != null) {
            x.e(obj, "getOrElse(...)");
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4 A[Catch: all -> 0x00d0, TRY_ENTER, TryCatch #0 {all -> 0x00d0, blocks: (B:20:0x009d, B:23:0x00b4, B:24:0x00cf), top: B:30:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009c -> B:30:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.firebase.sessions.a.b
            if (r0 == 0) goto L13
            r0 = r10
            com.google.firebase.sessions.a.b r0 = (com.google.firebase.sessions.a.b) r0
            int r1 = r0.f10772h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10772h = r1
            goto L18
        L13:
            com.google.firebase.sessions.a.b r0 = new com.google.firebase.sessions.a.b
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r9 = r0.f10770f
            h.c.a.a r10 = h.c.a.a.f48038a
            int r1 = r0.f10772h
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L47
            if (r1 != r2) goto L3f
            java.lang.Object r1 = r0.f10769e
            java.lang.Object r4 = r0.f10768d
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.f10767c
            kotlinx.coroutines.h.a r5 = (kotlinx.coroutines.h.a) r5
            com.google.firebase.sessions.a.d r6 = r0.f10773i
            r7 = r6
            com.google.firebase.sessions.a.d r7 = (com.google.firebase.sessions.a.d) r7
            java.lang.Object r7 = r0.f10766b
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.f10765a
            java.util.Map r8 = (java.util.Map) r8
            e.b.c.b(r9)
            goto L9d
        L3f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L47:
            e.b.c.b(r9)
            java.util.Map r9 = com.google.firebase.sessions.a.c.f10775b
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r4 = r9.size()
            int r4 = h.a.r.a(r4)
            r1.<init>(r4)
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r9 = r9.entrySet()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r7 = r9
            r4 = r1
        L67:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Ld6
            java.lang.Object r9 = r7.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r1 = r9.getKey()
            java.lang.Object r5 = r9.getKey()
            r6 = r5
            com.google.firebase.sessions.a.d r6 = (com.google.firebase.sessions.a.d) r6
            java.lang.Object r9 = r9.getValue()
            com.google.firebase.sessions.a.a r9 = (com.google.firebase.sessions.a.a) r9
            kotlinx.coroutines.h.a r5 = r9.a()
            r0.f10765a = r4
            r0.f10766b = r7
            r0.f10773i = r6
            r0.f10767c = r5
            r0.f10768d = r4
            r0.f10769e = r1
            r0.f10772h = r2
            java.lang.Object r9 = r5.lock(r3, r0)
            if (r9 == r10) goto Ld5
            r8 = r4
        L9d:
            java.lang.String r9 = "subscriberName"
            h.g.b.x.f(r6, r9)     // Catch: java.lang.Throwable -> Ld0
            com.google.firebase.sessions.a.a r9 = d(r6)     // Catch: java.lang.Throwable -> Ld0
            com.google.firebase.crashlytics.a.c.j r9 = r9.b()     // Catch: java.lang.Throwable -> Ld0
            if (r9 == 0) goto Lb4
            r5.unlock(r3)
            r4.put(r1, r9)
            r4 = r8
            goto L67
        Lb4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            r10.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r0 = "Subscriber "
            r10.append(r0)     // Catch: java.lang.Throwable -> Ld0
            r10.append(r6)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r0 = " has not been registered."
            r10.append(r0)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Ld0
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Ld0
            throw r9     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            r9 = move-exception
            r5.unlock(r3)
            throw r9
        Ld5:
            return r10
        Ld6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.a.c.a(h.c.e):java.lang.Object");
    }
}
