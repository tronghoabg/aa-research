package com.waze.modules.d;

import com.waze.config.ConfigValues;
import com.waze.config.dh;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class s implements com.waze.stats.t {

    /* renamed from: a, reason: collision with root package name */
    private static final com.waze.shared_infra.i.d f30243a = com.waze.shared_infra.i.d.f37886a;

    /* renamed from: b, reason: collision with root package name */
    private final dh f30244b;

    /* renamed from: c, reason: collision with root package name */
    private final long f30245c;

    /* renamed from: d, reason: collision with root package name */
    private final long f30246d;

    /* renamed from: e, reason: collision with root package name */
    private final int f30247e;

    /* renamed from: f, reason: collision with root package name */
    private final int f30248f;

    /* renamed from: g, reason: collision with root package name */
    private final long f30249g;

    /* renamed from: h, reason: collision with root package name */
    private final int f30250h;

    public s(dh dhVar) {
        h.g.b.x.f(dhVar, "offlineConfigManager");
        this.f30244b = dhVar;
        h.o.c cVar = h.o.a.f48264a;
        com.waze.config.c cVar2 = ConfigValues.CONFIG_VALUE_STATS_SEND_PERIODIC_INTERVAL_MILLIS;
        h.g.b.x.e(cVar2, "CONFIG_VALUE_STATS_SEND_PERIODIC_INTERVAL_MILLIS");
        long jA = dhVar.a(cVar2);
        h.o.d dVar = h.o.d.f48272c;
        this.f30245c = h.o.c.j(jA, dVar);
        this.f30246d = h.o.c.i(10, h.o.d.f48273d);
        com.waze.config.c cVar3 = ConfigValues.CONFIG_VALUE_STATS_MAX_PERSISTENT_EVENT_DAYS;
        h.g.b.x.e(cVar3, "CONFIG_VALUE_STATS_MAX_PERSISTENT_EVENT_DAYS");
        this.f30247e = (int) dhVar.a(cVar3);
        com.waze.config.c cVar4 = ConfigValues.CONFIG_VALUE_STATS_SEND_BUFFER_EVENTS_SIZE;
        h.g.b.x.e(cVar4, "CONFIG_VALUE_STATS_SEND_BUFFER_EVENTS_SIZE");
        this.f30248f = (int) dhVar.a(cVar4);
        com.waze.config.c cVar5 = ConfigValues.CONFIG_VALUE_STATS_SEND_EVENTS_ON_STARTUP_DELAY_MILLIS;
        h.g.b.x.e(cVar5, "CONFIG_VALUE_STATS_SEND_…S_ON_STARTUP_DELAY_MILLIS");
        this.f30249g = h.o.c.j(dhVar.a(cVar5), dVar);
        com.waze.config.c cVar6 = ConfigValues.CONFIG_VALUE_STATS_MAX_BATCH_SIZE;
        h.g.b.x.e(cVar6, "CONFIG_VALUE_STATS_MAX_BATCH_SIZE");
        this.f30250h = (int) dhVar.a(cVar6);
    }

    @Override // com.waze.stats.t
    public final int a() {
        return this.f30250h;
    }

    @Override // com.waze.stats.t
    public final int b() {
        return this.f30247e;
    }

    @Override // com.waze.stats.t
    public final int c() {
        return this.f30248f;
    }

    @Override // com.waze.stats.t
    public final long d() {
        return this.f30246d;
    }

    @Override // com.waze.stats.t
    public final long e() {
        return this.f30249g;
    }

    @Override // com.waze.stats.t
    public final long f() {
        return this.f30245c;
    }

    public final com.waze.shared_infra.i.d g() {
        Object next;
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_STATS_MINIMUM_LOG_LEVEL;
        h.g.b.x.e(dVar, "CONFIG_VALUE_STATS_MINIMUM_LOG_LEVEL");
        String strB = this.f30244b.b(dVar);
        Iterator<E> it = r.f30242a.iterator();
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
        return dVar2 == null ? f30243a : dVar2;
    }

    public final String toString() {
        String strName = g().name();
        long j2 = this.f30249g;
        long j3 = this.f30246d;
        return h.n.o.c("\n        minimumLogLevel=" + strName + ",\n        sendPeriodicInterval=" + h.o.a.y(this.f30245c) + ",\n        minimumSendPeriodicInterval=" + h.o.a.y(j3) + ",\n        maxPersistentEventsDays=" + this.f30247e + ",\n        sendEventsOnStartupDelay=" + h.o.a.y(j2) + ",\n        sendBufferEventsSize=" + this.f30248f + ",\n        maxBatchSize=" + this.f30250h + "\n    ");
    }
}
