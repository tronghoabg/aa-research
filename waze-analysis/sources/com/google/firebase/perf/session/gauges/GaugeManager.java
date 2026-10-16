package com.google.firebase.perf.session.gauges;

import android.content.Context;
import android.support.v4.app.n;
import com.google.firebase.components.aa;
import com.google.firebase.components.w;
import com.google.firebase.perf.d.f;
import com.google.firebase.perf.e.m;
import com.google.firebase.perf.f.i;
import com.google.firebase.perf.f.k;
import com.google.firebase.perf.f.o;
import com.google.firebase.perf.f.p;
import com.google.firebase.perf.f.q;
import com.google.firebase.perf.f.r;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private i applicationProcessState;
    private final com.google.firebase.perf.config.a configResolver;
    private final w<a> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final w<ScheduledExecutorService> gaugeManagerExecutor;
    private c gaugeMetadataManager;
    private final w<d> memoryGaugeCollector;
    private String sessionId;
    private final f transportManager;
    private static final com.google.firebase.perf.c.a logger = com.google.firebase.perf.c.a.a();
    private static final GaugeManager instance = new GaugeManager();

    private GaugeManager() {
        w wVar = new w(new aa(3));
        f fVarA = f.a();
        com.google.firebase.perf.config.a aVarO = com.google.firebase.perf.config.a.o();
        final int i2 = 1;
        w wVar2 = new w(new com.google.firebase.g.c() { // from class: com.google.firebase.perf.session.gauges.b
            @Override // com.google.firebase.g.c
            public final Object a() {
                return i2 != 0 ? GaugeManager.lambda$new$0() : GaugeManager.lambda$new$1();
            }
        });
        final int i3 = 0;
        this(wVar, fVarA, aVarO, null, wVar2, new w(new com.google.firebase.g.c() { // from class: com.google.firebase.perf.session.gauges.b
            @Override // com.google.firebase.g.c
            public final Object a() {
                return i3 != 0 ? GaugeManager.lambda$new$0() : GaugeManager.lambda$new$1();
            }
        }));
    }

    private long getCpuGaugeCollectionFrequencyMs(i iVar) {
        int iOrdinal = iVar.ordinal();
        long jH = iOrdinal != 1 ? iOrdinal != 2 ? -1L : this.configResolver.h() : this.configResolver.i();
        if (a.f(jH)) {
            return -1L;
        }
        return jH;
    }

    private p getGaugeMetadata() {
        o oVarNewBuilder = p.newBuilder();
        oVarNewBuilder.a(this.gaugeMetadataManager.a());
        oVarNewBuilder.b(this.gaugeMetadataManager.b());
        oVarNewBuilder.c(this.gaugeMetadataManager.c());
        return oVarNewBuilder.build();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(i iVar) {
        int iOrdinal = iVar.ordinal();
        long jK = iOrdinal != 1 ? iOrdinal != 2 ? -1L : this.configResolver.k() : this.configResolver.l();
        if (d.f(jK)) {
            return -1L;
        }
        return jK;
    }

    static /* synthetic */ a lambda$new$0() {
        return new a();
    }

    static /* synthetic */ d lambda$new$1() {
        return new d();
    }

    private boolean startCollectingCpuMetrics(long j2, m mVar) {
        if (j2 == -1) {
            logger.b("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        ((a) this.cpuGaugeCollector.a()).d(j2, mVar);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j2, m mVar) {
        if (j2 == -1) {
            logger.b("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ((d) this.memoryGaugeCollector.a()).d(j2, mVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$0(String str, i iVar) {
        q qVarNewBuilder = r.newBuilder();
        while (!((a) this.cpuGaugeCollector.a()).f10564a.isEmpty()) {
            qVarNewBuilder.b((k) ((a) this.cpuGaugeCollector.a()).f10564a.poll());
        }
        while (!((d) this.memoryGaugeCollector.a()).f10575a.isEmpty()) {
            qVarNewBuilder.a((com.google.firebase.perf.f.d) ((d) this.memoryGaugeCollector.a()).f10575a.poll());
        }
        qVarNewBuilder.d(str);
        this.transportManager.i(qVarNewBuilder.build(), iVar);
    }

    public void collectGaugeMetricOnce(m mVar) {
        collectGaugeMetricOnce((a) this.cpuGaugeCollector.a(), (d) this.memoryGaugeCollector.a(), mVar);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new c(context);
    }

    public boolean logGaugeMetadata(String str, i iVar) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        q qVarNewBuilder = r.newBuilder();
        qVarNewBuilder.d(str);
        qVarNewBuilder.c(getGaugeMetadata());
        this.transportManager.i(qVarNewBuilder.build(), iVar);
        return true;
    }

    public void startCollectingGauges(com.google.firebase.perf.session.b bVar, i iVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(iVar, bVar.b());
        if (jStartCollectingGauges == -1) {
            logger.i("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String strD = bVar.d();
        this.sessionId = strD;
        this.applicationProcessState = iVar;
        try {
            long j2 = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.a()).scheduleAtFixedRate(new n(this, strD, iVar, 4, (byte[]) null), j2, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            logger.i("Unable to start collecting Gauges: ".concat(String.valueOf(e2.getMessage())));
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        i iVar = this.applicationProcessState;
        ((a) this.cpuGaugeCollector.a()).e();
        ((d) this.memoryGaugeCollector.a()).e();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.a()).schedule(new n(this, str, iVar, 3, (byte[]) null), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = i.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private static void collectGaugeMetricOnce(a aVar, d dVar, m mVar) {
        aVar.c(mVar);
        dVar.c(mVar);
    }

    GaugeManager(w<ScheduledExecutorService> wVar, f fVar, com.google.firebase.perf.config.a aVar, c cVar, w<a> wVar2, w<d> wVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = i.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = wVar;
        this.transportManager = fVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = cVar;
        this.cpuGaugeCollector = wVar2;
        this.memoryGaugeCollector = wVar3;
    }

    private long startCollectingGauges(i iVar, m mVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(iVar);
        if (true != startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, mVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(iVar);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, mVar) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
