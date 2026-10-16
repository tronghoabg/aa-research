package androidx.tracing;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class SliceTrack extends Track {
    public final EventMetadataCloseable eventMetadataCloseable;
    public boolean preamble;
    public final TraceAttributesImpl traceAttributes;
    public final TraceEventScope traceEventScope;

    public SliceTrack(TraceContext traceContext, long j2) {
        super(traceContext, j2);
        TraceEventScope traceEventScope = new TraceEventScope();
        traceEventScope.owner = this;
        this.traceEventScope = traceEventScope;
        TraceAttributesImpl traceAttributesImpl = new TraceAttributesImpl();
        traceAttributesImpl.owner = this;
        this.traceAttributes = traceAttributesImpl;
        this.eventMetadataCloseable = new EventMetadataCloseable(null, null, null, 7, null);
    }

    public final EventMetadataCloseable beginCoroutineSection$tracing(String str, String str2, PlatformThreadContextElement platformThreadContextElement) {
        ProtoPool protoPool;
        PooledTracePacketArray pooledTracePacketArray;
        ProtoPool protoPool2;
        TraceEvent[] traceEventArr;
        EmptyEventMetadata emptyEventMetadata = EmptyEventMetadata.INSTANCE;
        EventMetadataCloseable eventMetadataCloseable = this.eventMetadataCloseable;
        eventMetadataCloseable.metadata = emptyEventMetadata;
        eventMetadataCloseable.closeable = EmptyCloseable.INSTANCE;
        eventMetadataCloseable.propagationToken = PropagationUnsupportedToken.INSTANCE;
        if (this.context.isGloballyEnabled) {
            TraceEvent traceEvent = null;
            if (!this.preamble) {
                SliceTrack sliceTrack = this;
                if (preamblePacket$tracing() != null && (pooledTracePacketArray = sliceTrack.currentPacketArray) != null) {
                    PooledTracePacketArray pooledTracePacketArray2 = sliceTrack.currentPacketArray;
                    Integer numValueOf = (pooledTracePacketArray2 == null || (traceEventArr = pooledTracePacketArray2.packets) == null) ? null : Integer.valueOf(traceEventArr.length);
                    pooledTracePacketArray.fillCount++;
                    int i2 = pooledTracePacketArray.fillCount;
                    if (numValueOf != null) {
                        numValueOf.intValue();
                    }
                    sliceTrack.context.sink.enqueue(pooledTracePacketArray);
                    ProtoPool protoPool3 = sliceTrack.pool;
                    if (protoPool3 == null) {
                        synchronized (sliceTrack.lock) {
                            protoPool2 = sliceTrack.pool;
                            if (protoPool2 == null) {
                                protoPool2 = new ProtoPool(sliceTrack.context.isDebug);
                                sliceTrack.pool = protoPool2;
                            }
                        }
                        protoPool3 = protoPool2;
                    }
                    sliceTrack.currentPacketArray = protoPool3.obtainTracePacketArray();
                }
                this.preamble = true;
            }
            SliceTrack sliceTrack2 = this;
            if (sliceTrack2.currentPacketArray == null) {
                ProtoPool protoPool4 = sliceTrack2.pool;
                if (protoPool4 == null) {
                    synchronized (sliceTrack2.lock) {
                        protoPool = sliceTrack2.pool;
                        if (protoPool == null) {
                            protoPool = new ProtoPool(sliceTrack2.context.isDebug);
                            sliceTrack2.pool = protoPool;
                        }
                    }
                    protoPool4 = protoPool;
                }
                sliceTrack2.currentPacketArray = protoPool4.obtainTracePacketArray();
            }
            PooledTracePacketArray pooledTracePacketArray3 = sliceTrack2.currentPacketArray;
            if (pooledTracePacketArray3 == null) {
                sliceTrack2.context.sink.onDroppedTraceEvent();
            } else {
                traceEvent = pooledTracePacketArray3.packets[pooledTracePacketArray3.fillCount];
            }
            if (traceEvent != null) {
                TraceEventScope traceEventScope = this.traceEventScope;
                traceEventScope.event = traceEvent;
                EventMetadataCloseable eventMetadataCloseable2 = this.eventMetadataCloseable;
                eventMetadataCloseable2.propagationToken = platformThreadContextElement;
                eventMetadataCloseable2.metadata = traceEventScope;
                traceEvent.primaryCategory = str;
                long j2 = this.uuid;
                List<Long> flowIds = platformThreadContextElement.getFlowIds();
                traceEvent.type = 1;
                traceEvent.trackUuid = j2;
                traceEvent.timestamp = System.nanoTime();
                traceEvent.flowIds = flowIds;
                traceEvent.name = str2;
                this.eventMetadataCloseable.closeable = platformThreadContextElement;
            }
        }
        return this.eventMetadataCloseable;
    }

    public final EventMetadataCloseable beginSection$tracing(String str, String str2, PropagationUnsupportedToken propagationUnsupportedToken) {
        ProtoPool protoPool;
        PooledTracePacketArray pooledTracePacketArray;
        ProtoPool protoPool2;
        TraceEvent[] traceEventArr;
        EmptyEventMetadata emptyEventMetadata = EmptyEventMetadata.INSTANCE;
        EventMetadataCloseable eventMetadataCloseable = this.eventMetadataCloseable;
        eventMetadataCloseable.metadata = emptyEventMetadata;
        eventMetadataCloseable.closeable = EmptyCloseable.INSTANCE;
        eventMetadataCloseable.propagationToken = PropagationUnsupportedToken.INSTANCE;
        if (this.context.isGloballyEnabled) {
            TraceEvent traceEvent = null;
            if (!this.preamble) {
                SliceTrack sliceTrack = this;
                if (preamblePacket$tracing() != null && (pooledTracePacketArray = sliceTrack.currentPacketArray) != null) {
                    PooledTracePacketArray pooledTracePacketArray2 = sliceTrack.currentPacketArray;
                    Integer numValueOf = (pooledTracePacketArray2 == null || (traceEventArr = pooledTracePacketArray2.packets) == null) ? null : Integer.valueOf(traceEventArr.length);
                    pooledTracePacketArray.fillCount++;
                    int i2 = pooledTracePacketArray.fillCount;
                    if (numValueOf != null) {
                        numValueOf.intValue();
                    }
                    sliceTrack.context.sink.enqueue(pooledTracePacketArray);
                    ProtoPool protoPool3 = sliceTrack.pool;
                    if (protoPool3 == null) {
                        synchronized (sliceTrack.lock) {
                            protoPool2 = sliceTrack.pool;
                            if (protoPool2 == null) {
                                protoPool2 = new ProtoPool(sliceTrack.context.isDebug);
                                sliceTrack.pool = protoPool2;
                            }
                        }
                        protoPool3 = protoPool2;
                    }
                    sliceTrack.currentPacketArray = protoPool3.obtainTracePacketArray();
                }
                this.preamble = true;
            }
            SliceTrack sliceTrack2 = this;
            if (sliceTrack2.currentPacketArray == null) {
                ProtoPool protoPool4 = sliceTrack2.pool;
                if (protoPool4 == null) {
                    synchronized (sliceTrack2.lock) {
                        protoPool = sliceTrack2.pool;
                        if (protoPool == null) {
                            protoPool = new ProtoPool(sliceTrack2.context.isDebug);
                            sliceTrack2.pool = protoPool;
                        }
                    }
                    protoPool4 = protoPool;
                }
                sliceTrack2.currentPacketArray = protoPool4.obtainTracePacketArray();
            }
            PooledTracePacketArray pooledTracePacketArray3 = sliceTrack2.currentPacketArray;
            if (pooledTracePacketArray3 == null) {
                sliceTrack2.context.sink.onDroppedTraceEvent();
            } else {
                traceEvent = pooledTracePacketArray3.packets[pooledTracePacketArray3.fillCount];
            }
            if (traceEvent != null) {
                EventMetadataCloseable eventMetadataCloseable2 = this.eventMetadataCloseable;
                eventMetadataCloseable2.propagationToken = propagationUnsupportedToken;
                traceEvent.primaryCategory = str;
                TraceEventScope traceEventScope = this.traceEventScope;
                traceEventScope.event = traceEvent;
                eventMetadataCloseable2.metadata = traceEventScope;
                long j2 = this.uuid;
                traceEvent.type = 1;
                traceEvent.trackUuid = j2;
                traceEvent.timestamp = System.nanoTime();
                traceEvent.name = str2;
                this.eventMetadataCloseable.closeable = this;
            }
        }
        return this.eventMetadataCloseable;
    }

    @Override // androidx.tracing.Track, java.lang.AutoCloseable
    public void close() {
        endSection();
    }

    public final void emitPreamble$tracing() {
        PooledTracePacketArray pooledTracePacketArray;
        ProtoPool protoPool;
        TraceEvent[] traceEventArr;
        if (this.preamble) {
            return;
        }
        SliceTrack sliceTrack = this;
        if (preamblePacket$tracing() != null && (pooledTracePacketArray = sliceTrack.currentPacketArray) != null) {
            PooledTracePacketArray pooledTracePacketArray2 = sliceTrack.currentPacketArray;
            Integer numValueOf = null;
            if (pooledTracePacketArray2 != null && (traceEventArr = pooledTracePacketArray2.packets) != null) {
                numValueOf = Integer.valueOf(traceEventArr.length);
            }
            pooledTracePacketArray.fillCount++;
            int i2 = pooledTracePacketArray.fillCount;
            if (numValueOf != null) {
                numValueOf.intValue();
            }
            sliceTrack.context.sink.enqueue(pooledTracePacketArray);
            ProtoPool protoPool2 = sliceTrack.pool;
            if (protoPool2 == null) {
                synchronized (sliceTrack.lock) {
                    protoPool = sliceTrack.pool;
                    if (protoPool == null) {
                        protoPool = new ProtoPool(sliceTrack.context.isDebug);
                        sliceTrack.pool = protoPool;
                    }
                }
                protoPool2 = protoPool;
            }
            sliceTrack.currentPacketArray = protoPool2.obtainTracePacketArray();
        }
        this.preamble = true;
    }

    public void endSection() {
        TraceEvent traceEvent;
        ProtoPool protoPool;
        TraceEvent[] traceEventArr;
        ProtoPool protoPool2;
        if (this.context.isGloballyEnabled) {
            SliceTrack sliceTrack = this;
            if (sliceTrack.currentPacketArray == null) {
                ProtoPool protoPool3 = sliceTrack.pool;
                if (protoPool3 == null) {
                    synchronized (sliceTrack.lock) {
                        protoPool2 = sliceTrack.pool;
                        if (protoPool2 == null) {
                            protoPool2 = new ProtoPool(sliceTrack.context.isDebug);
                            sliceTrack.pool = protoPool2;
                        }
                    }
                    protoPool3 = protoPool2;
                }
                sliceTrack.currentPacketArray = protoPool3.obtainTracePacketArray();
            }
            PooledTracePacketArray pooledTracePacketArray = sliceTrack.currentPacketArray;
            Integer numValueOf = null;
            if (pooledTracePacketArray == null) {
                sliceTrack.context.sink.onDroppedTraceEvent();
                traceEvent = null;
            } else {
                traceEvent = pooledTracePacketArray.packets[pooledTracePacketArray.fillCount];
            }
            if (traceEvent != null) {
                long j2 = this.uuid;
                traceEvent.type = 2;
                traceEvent.trackUuid = j2;
                traceEvent.timestamp = System.nanoTime();
                PooledTracePacketArray pooledTracePacketArray2 = sliceTrack.currentPacketArray;
                if (pooledTracePacketArray2 != null) {
                    PooledTracePacketArray pooledTracePacketArray3 = sliceTrack.currentPacketArray;
                    if (pooledTracePacketArray3 != null && (traceEventArr = pooledTracePacketArray3.packets) != null) {
                        numValueOf = Integer.valueOf(traceEventArr.length);
                    }
                    pooledTracePacketArray2.fillCount++;
                    int i2 = pooledTracePacketArray2.fillCount;
                    if (numValueOf == null || i2 != numValueOf.intValue()) {
                        return;
                    }
                    sliceTrack.context.sink.enqueue(pooledTracePacketArray2);
                    ProtoPool protoPool4 = sliceTrack.pool;
                    if (protoPool4 == null) {
                        synchronized (sliceTrack.lock) {
                            protoPool = sliceTrack.pool;
                            if (protoPool == null) {
                                protoPool = new ProtoPool(sliceTrack.context.isDebug);
                                sliceTrack.pool = protoPool;
                            }
                        }
                        protoPool4 = protoPool;
                    }
                    sliceTrack.currentPacketArray = protoPool4.obtainTracePacketArray();
                }
            }
        }
    }

    public final EventMetadataCloseable instant(String str, String str2) {
        ProtoPool protoPool;
        PooledTracePacketArray pooledTracePacketArray;
        ProtoPool protoPool2;
        TraceEvent[] traceEventArr;
        if (!this.context.isGloballyEnabled) {
            return EventMetadataCloseableKt.getEmptyEventMetadataCloseable();
        }
        TraceEvent traceEvent = null;
        if (!this.preamble) {
            SliceTrack sliceTrack = this;
            if (preamblePacket$tracing() != null && (pooledTracePacketArray = sliceTrack.currentPacketArray) != null) {
                PooledTracePacketArray pooledTracePacketArray2 = sliceTrack.currentPacketArray;
                Integer numValueOf = (pooledTracePacketArray2 == null || (traceEventArr = pooledTracePacketArray2.packets) == null) ? null : Integer.valueOf(traceEventArr.length);
                pooledTracePacketArray.fillCount++;
                int i2 = pooledTracePacketArray.fillCount;
                if (numValueOf != null) {
                    numValueOf.intValue();
                }
                sliceTrack.context.sink.enqueue(pooledTracePacketArray);
                ProtoPool protoPool3 = sliceTrack.pool;
                if (protoPool3 == null) {
                    synchronized (sliceTrack.lock) {
                        protoPool2 = sliceTrack.pool;
                        if (protoPool2 == null) {
                            protoPool2 = new ProtoPool(sliceTrack.context.isDebug);
                            sliceTrack.pool = protoPool2;
                        }
                    }
                    protoPool3 = protoPool2;
                }
                sliceTrack.currentPacketArray = protoPool3.obtainTracePacketArray();
            }
            this.preamble = true;
        }
        SliceTrack sliceTrack2 = this;
        if (sliceTrack2.currentPacketArray == null) {
            ProtoPool protoPool4 = sliceTrack2.pool;
            if (protoPool4 == null) {
                synchronized (sliceTrack2.lock) {
                    protoPool = sliceTrack2.pool;
                    if (protoPool == null) {
                        protoPool = new ProtoPool(sliceTrack2.context.isDebug);
                        sliceTrack2.pool = protoPool;
                    }
                }
                protoPool4 = protoPool;
            }
            sliceTrack2.currentPacketArray = protoPool4.obtainTracePacketArray();
        }
        PooledTracePacketArray pooledTracePacketArray3 = sliceTrack2.currentPacketArray;
        if (pooledTracePacketArray3 == null) {
            sliceTrack2.context.sink.onDroppedTraceEvent();
        } else {
            traceEvent = pooledTracePacketArray3.packets[pooledTracePacketArray3.fillCount];
        }
        if (traceEvent != null) {
            long j2 = this.uuid;
            traceEvent.type = 3;
            traceEvent.trackUuid = j2;
            traceEvent.timestamp = System.nanoTime();
            traceEvent.name = str2;
            traceEvent.primaryCategory = str;
        }
        TraceEventScope traceEventScope = this.traceEventScope;
        traceEventScope.event = traceEvent;
        EventMetadataCloseable eventMetadataCloseable = this.eventMetadataCloseable;
        eventMetadataCloseable.metadata = traceEventScope;
        return eventMetadataCloseable;
    }

    public abstract TraceEvent preamblePacket$tracing();

    public final TraceAttributes traceAttributes() {
        ProtoPool protoPool;
        PooledTracePacketArray pooledTracePacketArray;
        ProtoPool protoPool2;
        TraceEvent[] traceEventArr;
        if (!this.context.isGloballyEnabled) {
            return EmptyTraceAttributes.INSTANCE;
        }
        TraceEvent traceEvent = null;
        if (!this.preamble) {
            SliceTrack sliceTrack = this;
            if (preamblePacket$tracing() != null && (pooledTracePacketArray = sliceTrack.currentPacketArray) != null) {
                PooledTracePacketArray pooledTracePacketArray2 = sliceTrack.currentPacketArray;
                Integer numValueOf = (pooledTracePacketArray2 == null || (traceEventArr = pooledTracePacketArray2.packets) == null) ? null : Integer.valueOf(traceEventArr.length);
                pooledTracePacketArray.fillCount++;
                int i2 = pooledTracePacketArray.fillCount;
                if (numValueOf != null) {
                    numValueOf.intValue();
                }
                sliceTrack.context.sink.enqueue(pooledTracePacketArray);
                ProtoPool protoPool3 = sliceTrack.pool;
                if (protoPool3 == null) {
                    synchronized (sliceTrack.lock) {
                        protoPool2 = sliceTrack.pool;
                        if (protoPool2 == null) {
                            protoPool2 = new ProtoPool(sliceTrack.context.isDebug);
                            sliceTrack.pool = protoPool2;
                        }
                    }
                    protoPool3 = protoPool2;
                }
                sliceTrack.currentPacketArray = protoPool3.obtainTracePacketArray();
            }
            this.preamble = true;
        }
        SliceTrack sliceTrack2 = this;
        if (sliceTrack2.currentPacketArray == null) {
            ProtoPool protoPool4 = sliceTrack2.pool;
            if (protoPool4 == null) {
                synchronized (sliceTrack2.lock) {
                    protoPool = sliceTrack2.pool;
                    if (protoPool == null) {
                        protoPool = new ProtoPool(sliceTrack2.context.isDebug);
                        sliceTrack2.pool = protoPool;
                    }
                }
                protoPool4 = protoPool;
            }
            sliceTrack2.currentPacketArray = protoPool4.obtainTracePacketArray();
        }
        PooledTracePacketArray pooledTracePacketArray3 = sliceTrack2.currentPacketArray;
        if (pooledTracePacketArray3 == null) {
            sliceTrack2.context.sink.onDroppedTraceEvent();
        } else {
            traceEvent = pooledTracePacketArray3.packets[pooledTracePacketArray3.fillCount];
        }
        if (traceEvent != null) {
            traceEvent.timestamp = System.nanoTime();
        }
        TraceAttributesImpl traceAttributesImpl = this.traceAttributes;
        traceAttributesImpl.event = traceEvent;
        return traceAttributesImpl;
    }
}
