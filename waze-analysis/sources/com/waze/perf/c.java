package com.waze.perf;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f33035a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.shared_infra.q.n f33036b = com.waze.shared_infra.q.m.a(false);

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap f33037c = new ConcurrentHashMap();

    public static final void a(b bVar) {
        h.g.b.x.f(bVar, NotificationCompat.CATEGORY_EVENT);
        long jA = f33036b.a();
        if (((Long) f33037c.putIfAbsent(bVar, Long.valueOf(jA))) == null) {
            Log.d("WazePerf", "boot event logged: event=" + bVar + ", elapsedMs=" + jA);
        }
    }

    public static final Long b(b bVar) {
        h.g.b.x.f(bVar, NotificationCompat.CATEGORY_EVENT);
        return (Long) f33037c.get(bVar);
    }

    public static final void c() {
        f33036b.c();
    }
}
