package androidx.tracing;

import h.ab;
import h.c.j;
import java.util.List;
import kotlinx.coroutines.dc;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class CoroutinePropagationElement extends PlatformThreadContextElement implements dc<ab> {
    private String category;
    private final List<Long> flowIds;
    private String name;
    private final PerfettoTracer tracer;

    public CoroutinePropagationElement(PerfettoTracer perfettoTracer, String str, String str2, List<Long> list) {
        super(perfettoTracer, str, str2, list);
        this.tracer = perfettoTracer;
        this.category = str;
        this.name = str2;
        this.flowIds = list;
    }

    @Override // androidx.tracing.PlatformThreadContextElement
    public String getCategory() {
        return this.category;
    }

    @Override // androidx.tracing.PlatformThreadContextElement
    public List<Long> getFlowIds() {
        return this.flowIds;
    }

    @Override // androidx.tracing.PlatformThreadContextElement
    public String getName() {
        return this.name;
    }

    @Override // androidx.tracing.PlatformThreadContextElement
    public PerfettoTracer getTracer$tracing() {
        return this.tracer;
    }

    @Override // kotlinx.coroutines.dc
    public void restoreThreadContext(j jVar, ab abVar) {
        boolean z;
        PlatformThreadContextElement platformThreadContextElement = (PlatformThreadContextElement) jVar.get(PlatformThreadContextElement.KEY);
        String name = platformThreadContextElement != null ? platformThreadContextElement.getName() : null;
        if (platformThreadContextElement == null || name == null) {
            return;
        }
        synchronized (platformThreadContextElement) {
            long id = Thread.currentThread().getId();
            z = false;
            if (platformThreadContextElement.started.getOrDefault(id, 0) == 1) {
                platformThreadContextElement.started.set(id, 0);
                z = true;
            }
        }
        if (z) {
            ProcessTrack processTrack = platformThreadContextElement.getTracer$tracing().process;
            Thread threadCurrentThread = Thread.currentThread();
            long id2 = threadCurrentThread.getId();
            ThreadTrack orCreateThreadTrack = processTrack.l1ThreadTrack;
            ThreadTrack threadTrack = processTrack.l2ThreadTrack;
            if (orCreateThreadTrack == null || orCreateThreadTrack.getId() != id2) {
                if (threadTrack == null || threadTrack.getId() != id2) {
                    orCreateThreadTrack = processTrack.getOrCreateThreadTrack(id2, threadCurrentThread.getName());
                    processTrack.l2ThreadTrack = processTrack.l1ThreadTrack;
                    processTrack.l1ThreadTrack = orCreateThreadTrack;
                } else {
                    orCreateThreadTrack = threadTrack;
                }
            }
            orCreateThreadTrack.endSection();
        }
    }

    @Override // androidx.tracing.PlatformThreadContextElement
    public void setCategory(String str) {
        this.category = str;
    }

    @Override // androidx.tracing.PlatformThreadContextElement
    public void setName(String str) {
        this.name = str;
    }

    /* renamed from: updateThreadContext, reason: avoid collision after fix types in other method */
    public void updateThreadContext2(j jVar) {
        boolean z;
        ProtoPool protoPool;
        PooledTracePacketArray pooledTracePacketArray;
        ProtoPool protoPool2;
        TraceEvent[] traceEventArr;
        PlatformThreadContextElement platformThreadContextElement = (PlatformThreadContextElement) jVar.get(PlatformThreadContextElement.KEY);
        TraceEvent traceEvent = null;
        String category = platformThreadContextElement != null ? platformThreadContextElement.getCategory() : null;
        String name = platformThreadContextElement != null ? platformThreadContextElement.getName() : null;
        if (platformThreadContextElement == null || category == null || name == null) {
            return;
        }
        synchronized (platformThreadContextElement) {
            long id = Thread.currentThread().getId();
            z = false;
            if (platformThreadContextElement.started.getOrDefault(id, 0) == 0) {
                platformThreadContextElement.started.set(id, 1);
                z = true;
            }
        }
        if (z) {
            ProcessTrack processTrack = platformThreadContextElement.getTracer$tracing().process;
            Thread threadCurrentThread = Thread.currentThread();
            long id2 = threadCurrentThread.getId();
            ThreadTrack orCreateThreadTrack = processTrack.l1ThreadTrack;
            ThreadTrack threadTrack = processTrack.l2ThreadTrack;
            if (orCreateThreadTrack == null || orCreateThreadTrack.getId() != id2) {
                if (threadTrack == null || threadTrack.getId() != id2) {
                    orCreateThreadTrack = processTrack.getOrCreateThreadTrack(id2, threadCurrentThread.getName());
                    processTrack.l2ThreadTrack = processTrack.l1ThreadTrack;
                    processTrack.l1ThreadTrack = orCreateThreadTrack;
                } else {
                    orCreateThreadTrack = threadTrack;
                }
            }
            ThreadTrack threadTrack2 = orCreateThreadTrack;
            EventMetadataCloseable eventMetadataCloseable = threadTrack2.eventMetadataCloseable;
            eventMetadataCloseable.metadata = EmptyEventMetadata.INSTANCE;
            eventMetadataCloseable.closeable = EmptyCloseable.INSTANCE;
            eventMetadataCloseable.propagationToken = PropagationUnsupportedToken.INSTANCE;
            if (threadTrack2.context.isGloballyEnabled) {
                if (!threadTrack2.preamble) {
                    ThreadTrack threadTrack3 = threadTrack2;
                    if (threadTrack2.preamblePacket$tracing() != null && (pooledTracePacketArray = threadTrack3.currentPacketArray) != null) {
                        PooledTracePacketArray pooledTracePacketArray2 = threadTrack3.currentPacketArray;
                        Integer numValueOf = (pooledTracePacketArray2 == null || (traceEventArr = pooledTracePacketArray2.packets) == null) ? null : Integer.valueOf(traceEventArr.length);
                        pooledTracePacketArray.fillCount++;
                        int i2 = pooledTracePacketArray.fillCount;
                        if (numValueOf != null) {
                            numValueOf.intValue();
                        }
                        threadTrack3.context.sink.enqueue(pooledTracePacketArray);
                        ProtoPool protoPool3 = threadTrack3.pool;
                        if (protoPool3 == null) {
                            synchronized (threadTrack3.lock) {
                                protoPool2 = threadTrack3.pool;
                                if (protoPool2 == null) {
                                    protoPool2 = new ProtoPool(threadTrack3.context.isDebug);
                                    threadTrack3.pool = protoPool2;
                                }
                            }
                            protoPool3 = protoPool2;
                        }
                        threadTrack3.currentPacketArray = protoPool3.obtainTracePacketArray();
                    }
                    threadTrack2.preamble = true;
                }
                ThreadTrack threadTrack4 = threadTrack2;
                if (threadTrack4.currentPacketArray == null) {
                    ProtoPool protoPool4 = threadTrack4.pool;
                    if (protoPool4 == null) {
                        synchronized (threadTrack4.lock) {
                            protoPool = threadTrack4.pool;
                            if (protoPool == null) {
                                protoPool = new ProtoPool(threadTrack4.context.isDebug);
                                threadTrack4.pool = protoPool;
                            }
                        }
                        protoPool4 = protoPool;
                    }
                    threadTrack4.currentPacketArray = protoPool4.obtainTracePacketArray();
                }
                PooledTracePacketArray pooledTracePacketArray3 = threadTrack4.currentPacketArray;
                if (pooledTracePacketArray3 == null) {
                    threadTrack4.context.sink.onDroppedTraceEvent();
                } else {
                    traceEvent = pooledTracePacketArray3.packets[pooledTracePacketArray3.fillCount];
                }
                if (traceEvent != null) {
                    TraceEventScope traceEventScope = threadTrack2.traceEventScope;
                    traceEventScope.event = traceEvent;
                    EventMetadataCloseable eventMetadataCloseable2 = threadTrack2.eventMetadataCloseable;
                    eventMetadataCloseable2.propagationToken = platformThreadContextElement;
                    eventMetadataCloseable2.metadata = traceEventScope;
                    traceEvent.primaryCategory = category;
                    long j2 = threadTrack2.uuid;
                    List<Long> flowIds = platformThreadContextElement.getFlowIds();
                    traceEvent.type = 1;
                    traceEvent.trackUuid = j2;
                    traceEvent.timestamp = System.nanoTime();
                    traceEvent.flowIds = flowIds;
                    traceEvent.name = name;
                    threadTrack2.eventMetadataCloseable.closeable = platformThreadContextElement;
                }
            }
            threadTrack2.eventMetadataCloseable.metadata.dispatchToTraceSink();
        }
    }

    @Override // kotlinx.coroutines.dc
    public /* bridge */ /* synthetic */ ab updateThreadContext(j jVar) {
        updateThreadContext2(jVar);
        return ab.f48028a;
    }
}
