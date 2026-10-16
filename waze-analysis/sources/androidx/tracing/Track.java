package androidx.tracing;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class Track implements AutoCloseable {
    public final TraceContext context;
    public volatile PooledTracePacketArray currentPacketArray;
    public final Object lock = new Object();
    public volatile ProtoPool pool;
    public final long uuid;

    public Track(TraceContext traceContext, long j2) {
        this.context = traceContext;
        this.uuid = j2;
    }

    public static /* synthetic */ void dispatchTraceEvent$tracing$default(Track track, TraceEvent traceEvent, boolean z, int i2, Object obj) {
        PooledTracePacketArray pooledTracePacketArray;
        ProtoPool protoPool;
        TraceEvent[] traceEventArr;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchTraceEvent");
        }
        boolean z2 = z & ((i2 & 2) == 0);
        if (traceEvent == null || (pooledTracePacketArray = track.currentPacketArray) == null) {
            return;
        }
        PooledTracePacketArray pooledTracePacketArray2 = track.currentPacketArray;
        Integer numValueOf = null;
        if (pooledTracePacketArray2 != null && (traceEventArr = pooledTracePacketArray2.packets) != null) {
            numValueOf = Integer.valueOf(traceEventArr.length);
        }
        pooledTracePacketArray.fillCount++;
        int i3 = pooledTracePacketArray.fillCount;
        if ((numValueOf != null && i3 == numValueOf.intValue()) || z2) {
            track.context.sink.enqueue(pooledTracePacketArray);
            ProtoPool protoPool2 = track.pool;
            if (protoPool2 == null) {
                synchronized (track.lock) {
                    protoPool = track.pool;
                    if (protoPool == null) {
                        protoPool = new ProtoPool(track.context.isDebug);
                        track.pool = protoPool;
                    }
                }
                protoPool2 = protoPool;
            }
            track.currentPacketArray = protoPool2.obtainTracePacketArray();
        }
    }

    public static /* synthetic */ void getContext$annotations() {
    }

    public static /* synthetic */ void getUuid$annotations() {
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    public final void dispatchTraceEvent$tracing(TraceEvent traceEvent, boolean z) {
        PooledTracePacketArray pooledTracePacketArray;
        ProtoPool protoPool;
        TraceEvent[] traceEventArr;
        if (traceEvent == null || (pooledTracePacketArray = this.currentPacketArray) == null) {
            return;
        }
        PooledTracePacketArray pooledTracePacketArray2 = this.currentPacketArray;
        Integer numValueOf = null;
        if (pooledTracePacketArray2 != null && (traceEventArr = pooledTracePacketArray2.packets) != null) {
            numValueOf = Integer.valueOf(traceEventArr.length);
        }
        pooledTracePacketArray.fillCount++;
        int i2 = pooledTracePacketArray.fillCount;
        if ((numValueOf != null && i2 == numValueOf.intValue()) || z) {
            this.context.sink.enqueue(pooledTracePacketArray);
            ProtoPool protoPool2 = this.pool;
            if (protoPool2 == null) {
                synchronized (this.lock) {
                    protoPool = this.pool;
                    if (protoPool == null) {
                        protoPool = new ProtoPool(this.context.isDebug);
                        this.pool = protoPool;
                    }
                }
                protoPool2 = protoPool;
            }
            this.currentPacketArray = protoPool2.obtainTracePacketArray();
        }
    }

    public final void enqueueSingleUnmodifiedEvent() {
        TraceEvent traceEvent;
        PooledTracePacketArray pooledTracePacketArray;
        ProtoPool protoPool;
        TraceEvent[] traceEventArr;
        ProtoPool protoPool2;
        if (this.currentPacketArray == null) {
            ProtoPool protoPool3 = this.pool;
            if (protoPool3 == null) {
                synchronized (this.lock) {
                    protoPool2 = this.pool;
                    if (protoPool2 == null) {
                        protoPool2 = new ProtoPool(this.context.isDebug);
                        this.pool = protoPool2;
                    }
                }
                protoPool3 = protoPool2;
            }
            this.currentPacketArray = protoPool3.obtainTracePacketArray();
        }
        PooledTracePacketArray pooledTracePacketArray2 = this.currentPacketArray;
        Integer numValueOf = null;
        if (pooledTracePacketArray2 == null) {
            this.context.sink.onDroppedTraceEvent();
            traceEvent = null;
        } else {
            traceEvent = pooledTracePacketArray2.packets[pooledTracePacketArray2.fillCount];
        }
        if (traceEvent == null || (pooledTracePacketArray = this.currentPacketArray) == null) {
            return;
        }
        PooledTracePacketArray pooledTracePacketArray3 = this.currentPacketArray;
        if (pooledTracePacketArray3 != null && (traceEventArr = pooledTracePacketArray3.packets) != null) {
            numValueOf = Integer.valueOf(traceEventArr.length);
        }
        pooledTracePacketArray.fillCount++;
        int i2 = pooledTracePacketArray.fillCount;
        if (numValueOf != null) {
            numValueOf.intValue();
        }
        this.context.sink.enqueue(pooledTracePacketArray);
        ProtoPool protoPool4 = this.pool;
        if (protoPool4 == null) {
            synchronized (this.lock) {
                protoPool = this.pool;
                if (protoPool == null) {
                    protoPool = new ProtoPool(this.context.isDebug);
                    this.pool = protoPool;
                }
            }
            protoPool4 = protoPool;
        }
        this.currentPacketArray = protoPool4.obtainTracePacketArray();
    }

    public final void flush$tracing() {
        ProtoPool protoPool;
        PooledTracePacketArray pooledTracePacketArray = this.currentPacketArray;
        if (pooledTracePacketArray != null) {
            this.context.sink.enqueue(pooledTracePacketArray);
            ProtoPool protoPool2 = this.pool;
            if (protoPool2 == null) {
                synchronized (this.lock) {
                    protoPool = this.pool;
                    if (protoPool == null) {
                        protoPool = new ProtoPool(this.context.isDebug);
                        this.pool = protoPool;
                    }
                }
                protoPool2 = protoPool;
            }
            this.currentPacketArray = protoPool2.obtainTracePacketArray();
        }
    }

    public final TraceEvent obtainTraceEvent$tracing() {
        ProtoPool protoPool;
        if (this.currentPacketArray == null) {
            ProtoPool protoPool2 = this.pool;
            if (protoPool2 == null) {
                synchronized (this.lock) {
                    protoPool = this.pool;
                    if (protoPool == null) {
                        protoPool = new ProtoPool(this.context.isDebug);
                        this.pool = protoPool;
                    }
                }
                protoPool2 = protoPool;
            }
            this.currentPacketArray = protoPool2.obtainTracePacketArray();
        }
        PooledTracePacketArray pooledTracePacketArray = this.currentPacketArray;
        if (pooledTracePacketArray != null) {
            return pooledTracePacketArray.packets[pooledTracePacketArray.fillCount];
        }
        this.context.sink.onDroppedTraceEvent();
        return null;
    }

    public final ProtoPool protoPool$tracing() {
        ProtoPool protoPool;
        ProtoPool protoPool2 = this.pool;
        if (protoPool2 != null) {
            return protoPool2;
        }
        synchronized (this.lock) {
            protoPool = this.pool;
            if (protoPool == null) {
                protoPool = new ProtoPool(this.context.isDebug);
                this.pool = protoPool;
            }
        }
        return protoPool;
    }

    public final void resetTraceEvents() {
        PooledTracePacketArray pooledTracePacketArray = this.currentPacketArray;
        if (pooledTracePacketArray != null) {
            int i2 = pooledTracePacketArray.fillCount;
            for (int i3 = 0; i3 < i2; i3++) {
                pooledTracePacketArray.packets[i3].reset();
            }
        }
        PooledTracePacketArray pooledTracePacketArray2 = this.currentPacketArray;
        if (pooledTracePacketArray2 != null) {
            pooledTracePacketArray2.fillCount = 0;
        }
    }
}
