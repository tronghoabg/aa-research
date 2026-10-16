package androidx.tracing;

import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
@DelicateTracingApi
/* loaded from: classes4.dex */
public final class PooledTracePacketArray extends Poolable<PooledTracePacketArray> {
    public volatile int fillCount;
    public final TraceEvent[] packets;

    public PooledTracePacketArray(Pool<PooledTracePacketArray> pool, TraceEvent[] traceEventArr, int i2) {
        super(pool);
        this.packets = traceEventArr;
        this.fillCount = i2;
    }

    public final void forEach(l<? super TraceEvent, ab> lVar) {
        int i2 = this.fillCount;
        for (int i3 = 0; i3 < i2; i3++) {
            lVar.invoke(this.packets[i3]);
        }
    }

    @Override // androidx.tracing.Poolable
    public void recycle() {
        int i2 = this.fillCount;
        for (int i3 = 0; i3 < i2; i3++) {
            this.packets[i3].reset();
        }
        this.fillCount = 0;
        getOwner$tracing().release$tracing(this);
    }
}
