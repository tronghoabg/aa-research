package com.waze.modules.d;

import com.waze.config.ConfigValues;
import com.waze.config.dh;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p implements com.waze.stats.n {

    /* renamed from: a, reason: collision with root package name */
    private static final com.waze.shared_infra.i.d f30236a = com.waze.shared_infra.i.d.f37886a;

    /* renamed from: b, reason: collision with root package name */
    private final dh f30237b;

    /* renamed from: c, reason: collision with root package name */
    private final long f30238c;

    /* renamed from: d, reason: collision with root package name */
    private final long f30239d;

    public p(dh dhVar) {
        h.g.b.x.f(dhVar, "offlineConfigManager");
        this.f30237b = dhVar;
        h.o.c cVar = h.o.a.f48264a;
        com.waze.config.c cVar2 = ConfigValues.CONFIG_VALUE_STATS_MOBILE_METRICS_RETRY_INTERVAL_IN_SECONDS;
        h.g.b.x.e(cVar2, "CONFIG_VALUE_STATS_MOBIL…RETRY_INTERVAL_IN_SECONDS");
        this.f30238c = h.o.c.j(dhVar.a(cVar2), h.o.d.f48273d);
        com.waze.config.c cVar3 = ConfigValues.CONFIG_VALUE_STATS_MOBILE_METRICS_MAX_NUMBER_OF_RETRIES;
        h.g.b.x.e(cVar3, "CONFIG_VALUE_STATS_MOBIL…ICS_MAX_NUMBER_OF_RETRIES");
        this.f30239d = dhVar.a(cVar3);
    }

    public final com.waze.shared_infra.i.d a() {
        Object next;
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_STATS_MINIMUM_LOG_LEVEL;
        h.g.b.x.e(dVar, "CONFIG_VALUE_STATS_MINIMUM_LOG_LEVEL");
        String strB = this.f30237b.b(dVar);
        Iterator<E> it = o.f30235a.iterator();
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
        return dVar2 == null ? f30236a : dVar2;
    }

    public final String toString() {
        return "minimumLogLevel=" + a().name() + ", retryIntervalInSeconds=" + h.o.a.y(this.f30238c) + ", maxNumberOfRetries=" + this.f30239d;
    }
}
