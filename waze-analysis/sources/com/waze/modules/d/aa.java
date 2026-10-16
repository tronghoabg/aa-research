package com.waze.modules.d;

import com.waze.config.ConfigValues;
import com.waze.config.dh;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aa implements com.waze.stats.t {

    /* renamed from: a, reason: collision with root package name */
    private static final com.waze.shared_infra.i.d f30200a = com.waze.shared_infra.i.d.f37886a;

    /* renamed from: b, reason: collision with root package name */
    private final dh f30201b;

    /* renamed from: c, reason: collision with root package name */
    private final long f30202c;

    /* renamed from: d, reason: collision with root package name */
    private final long f30203d;

    /* renamed from: e, reason: collision with root package name */
    private final int f30204e;

    /* renamed from: f, reason: collision with root package name */
    private final int f30205f;

    /* renamed from: g, reason: collision with root package name */
    private final long f30206g;

    /* renamed from: h, reason: collision with root package name */
    private final int f30207h;

    public aa(dh dhVar) {
        h.g.b.x.f(dhVar, "offlineConfigManager");
        this.f30201b = dhVar;
        com.waze.config.c cVar = ConfigValues.CONFIG_VALUE_STATS_UNAUTHENTICATED_SEND_PERIODIC_INTERVAL_MILLIS;
        h.g.b.x.e(cVar, "CONFIG_VALUE_STATS_UNAUT…_PERIODIC_INTERVAL_MILLIS");
        long jA = dhVar.a(cVar);
        h.o.d dVar = h.o.d.f48272c;
        this.f30202c = h.o.c.j(jA, dVar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f30203d = h.o.c.j(10000L, dVar);
        com.waze.config.c cVar2 = ConfigValues.CONFIG_VALUE_STATS_MAX_UNAUTHENTICATED_PERSISTENT_EVENT_DAYS;
        h.g.b.x.e(cVar2, "CONFIG_VALUE_STATS_MAX_U…TED_PERSISTENT_EVENT_DAYS");
        this.f30204e = (int) dhVar.a(cVar2);
        com.waze.config.c cVar3 = ConfigValues.CONFIG_VALUE_STATS_UNAUTHENTICATED_SEND_BUFFER_EVENTS_SIZE;
        h.g.b.x.e(cVar3, "CONFIG_VALUE_STATS_UNAUT…D_SEND_BUFFER_EVENTS_SIZE");
        this.f30205f = (int) dhVar.a(cVar3);
        com.waze.config.c cVar4 = ConfigValues.CONFIG_VALUE_STATS_UNAUTHENTICATED_SEND_EVENTS_ON_STARTUP_DELAY_MILLIS;
        h.g.b.x.e(cVar4, "CONFIG_VALUE_STATS_UNAUT…S_ON_STARTUP_DELAY_MILLIS");
        this.f30206g = h.o.c.j(dhVar.a(cVar4), dVar);
        com.waze.config.c cVar5 = ConfigValues.CONFIG_VALUE_STATS_MAX_BATCH_SIZE;
        h.g.b.x.e(cVar5, "CONFIG_VALUE_STATS_MAX_BATCH_SIZE");
        this.f30207h = (int) dhVar.a(cVar5);
    }

    @Override // com.waze.stats.t
    public final int a() {
        return this.f30207h;
    }

    @Override // com.waze.stats.t
    public final int b() {
        return this.f30204e;
    }

    @Override // com.waze.stats.t
    public final int c() {
        return this.f30205f;
    }

    @Override // com.waze.stats.t
    public final long d() {
        return this.f30203d;
    }

    @Override // com.waze.stats.t
    public final long e() {
        return this.f30206g;
    }

    @Override // com.waze.stats.t
    public final long f() {
        return this.f30202c;
    }

    public final com.waze.shared_infra.i.d g() {
        Object next;
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_STATS_UNAUTHENTICATED_MINIMUM_LOG_LEVEL;
        h.g.b.x.e(dVar, "CONFIG_VALUE_STATS_UNAUT…TICATED_MINIMUM_LOG_LEVEL");
        String strB = this.f30201b.b(dVar);
        Iterator<E> it = z.f30267a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (h.g.b.x.n(((com.waze.shared_infra.i.d) next).name(), strB)) {
                break;
            }
        }
        com.waze.shared_infra.i.d dVar2 = (com.waze.shared_infra.i.d) next;
        return dVar2 == null ? f30200a : dVar2;
    }

    public final String toString() {
        String strName = g().name();
        long j2 = this.f30206g;
        long j3 = this.f30203d;
        return h.n.o.c("\n        minimumLogLevel=" + strName + ",\n        sendPeriodicInterval=" + h.o.a.y(this.f30202c) + ",\n        minimumSendPeriodicInterval=" + h.o.a.y(j3) + ",\n        maxPersistentEventsDays=" + this.f30204e + ",\n        sendEventsOnStartupDelay=" + h.o.a.y(j2) + ",\n        sendBufferEventsSize=" + this.f30205f + ",\n        maxBatchSize=" + this.f30207h + "\n    ");
    }
}
