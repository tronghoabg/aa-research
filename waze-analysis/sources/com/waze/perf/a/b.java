package com.waze.perf.a;

import android.app.usage.StorageStatsManager;
import com.waze.network.ap;
import com.waze.perf.u;
import com.waze.shared_infra.a.c;
import com.waze.shared_infra.i.e;
import h.ab;
import h.g.b.x;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final StorageStatsManager f33017a;

    /* renamed from: b, reason: collision with root package name */
    private final ap f33018b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f33019c;

    /* renamed from: d, reason: collision with root package name */
    private final e f33020d;

    /* renamed from: e, reason: collision with root package name */
    private final u f33021e;

    /* renamed from: f, reason: collision with root package name */
    private final String f33022f;

    public b(StorageStatsManager storageStatsManager, ap apVar, h.g.a.a aVar, e eVar, u uVar) {
        x.f(apVar, "networkUsageProvider");
        x.f(aVar, "getReportIntervalSec");
        x.f(eVar, "logger");
        x.f(uVar, "statsReporter");
        this.f33017a = storageStatsManager;
        this.f33018b = apVar;
        this.f33019c = aVar;
        this.f33020d = eVar;
        this.f33021e = uVar;
        this.f33022f = "HealthReportDaemon";
    }

    @Override // com.waze.shared_infra.a.c
    public final Object b(h.c.e eVar) {
        long millis = TimeUnit.SECONDS.toMillis(((Number) this.f33019c.invoke()).longValue());
        e eVar2 = this.f33020d;
        if (millis < 0) {
            eVar2.g("a negative interval, not sending health report stat");
            return ab.f48028a;
        }
        eVar2.e("health report interval is set to " + millis + "[ms]");
        Object objV = aj.v(av.b(), new a(this, millis, null), eVar);
        return objV == h.c.a.a.f48038a ? objV : ab.f48028a;
    }

    @Override // com.waze.shared_infra.a.c
    public final String c() {
        return this.f33022f;
    }
}
