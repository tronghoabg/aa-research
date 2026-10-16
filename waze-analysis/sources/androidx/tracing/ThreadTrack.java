package androidx.tracing;

import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ThreadTrack extends SliceTrack {
    private final long id;
    private final String name;
    private final ProcessTrack process;

    public ThreadTrack(long j2, String str, ProcessTrack processTrack) {
        super(processTrack.context, CommonKt.monotonicId());
        this.id = j2;
        this.name = str;
        this.process = processTrack;
    }

    public final void assertThreadIdWhenNotOptimized() {
        if (this.id == Thread.currentThread().getId()) {
            return;
        }
        throw new IllegalArgumentException(o.c("\n                Invariant violation. Current thread id (" + Thread.currentThread().getId() + " does not match\n                expected " + this.id + ". This means that there might be a race condition in the code\n                where begin and end sections are being called on separate threads.\n            "));
    }

    @Override // androidx.tracing.SliceTrack
    public void endSection() {
        super.endSection();
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final ProcessTrack getProcess() {
        return this.process;
    }

    @Override // androidx.tracing.SliceTrack
    public TraceEvent preamblePacket$tracing() {
        TraceEvent traceEvent;
        ProtoPool protoPool;
        ThreadTrack threadTrack = this;
        if (threadTrack.currentPacketArray == null) {
            ProtoPool protoPool2 = threadTrack.pool;
            if (protoPool2 == null) {
                synchronized (threadTrack.lock) {
                    protoPool = threadTrack.pool;
                    if (protoPool == null) {
                        protoPool = new ProtoPool(threadTrack.context.isDebug);
                        threadTrack.pool = protoPool;
                    }
                }
                protoPool2 = protoPool;
            }
            threadTrack.currentPacketArray = protoPool2.obtainTracePacketArray();
        }
        PooledTracePacketArray pooledTracePacketArray = threadTrack.currentPacketArray;
        if (pooledTracePacketArray == null) {
            threadTrack.context.sink.onDroppedTraceEvent();
            traceEvent = null;
        } else {
            traceEvent = pooledTracePacketArray.packets[pooledTracePacketArray.fillCount];
        }
        if (traceEvent != null) {
            String str = this.name;
            long j2 = this.uuid;
            ProcessTrack processTrack = this.process;
            traceEvent.trackDescriptor = new TrackDescriptor(str, j2, processTrack.uuid, 2, processTrack.getId(), this.id);
            traceEvent.timestamp = System.nanoTime();
        }
        return traceEvent;
    }
}
