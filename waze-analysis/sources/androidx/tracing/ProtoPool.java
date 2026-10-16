package androidx.tracing;

import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ProtoPool {
    private final boolean isDebug;
    private final Pool<PooledTracePacketArray> tracePacketArrayPool;

    public ProtoPool(boolean z) {
        this.isDebug = z;
        this.tracePacketArrayPool = new Pool<>(256, z, new l() { // from class: androidx.tracing.ProtoPool$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ProtoPool.tracePacketArrayPool$lambda$0((Pool) obj);
            }
        });
    }

    static final PooledTracePacketArray tracePacketArrayPool$lambda$0(Pool pool) {
        TraceEvent[] traceEventArr = new TraceEvent[32];
        for (int i2 = 0; i2 < 32; i2++) {
            traceEventArr[i2] = new TraceEvent();
        }
        return new PooledTracePacketArray(pool, traceEventArr, 0);
    }

    public final Pool<PooledTracePacketArray> getTracePacketArrayPool$tracing() {
        return this.tracePacketArrayPool;
    }

    public final boolean isDebug$tracing() {
        return this.isDebug;
    }

    public final PooledTracePacketArray obtainTracePacketArray() {
        return this.tracePacketArrayPool.obtain$tracing();
    }

    public final long poolableCount() {
        if (this.isDebug) {
            return this.tracePacketArrayPool.count$tracing();
        }
        return 0L;
    }
}
