package androidx.tracing;

import android.app.Application;
import android.os.Process;
import h.a.i;
import h.c.e;
import h.g.a.l;
import h.g.b.x;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class PerfettoTracer extends Tracer {
    public final l<String, Boolean> categoryEnabled;
    public final TraceContext context;
    public ProcessTrack process;

    /* JADX WARN: Multi-variable type inference failed */
    public PerfettoTracer(TraceContext traceContext, l<? super String, Boolean> lVar) {
        ProcessTrack process;
        this.context = traceContext;
        this.categoryEnabled = lVar;
        if (traceContext.isProcessInitialized) {
            process = traceContext.getProcess();
        } else {
            traceContext.createProcessTrack(Process.myPid(), Application.getProcessName());
            process = traceContext.getProcess();
        }
        this.process = process;
    }

    @Override // androidx.tracing.Tracer
    @DelicateTracingApi
    public Object beginCoroutineSectionWithMetadata(String str, String str2, PropagationToken propagationToken, boolean z, e<? super EventMetadataCloseable> eVar) {
        CoroutinePropagationElement coroutinePropagationElement;
        ProtoPool protoPool;
        PooledTracePacketArray pooledTracePacketArray;
        ProtoPool protoPool2;
        TraceEvent[] traceEventArr;
        if (x.n(propagationToken, PropagationUnsupportedToken.INSTANCE)) {
            return beginSectionWithMetadata(str, str2, PropagationUnsupportedToken.INSTANCE, z);
        }
        TraceEvent traceEvent = null;
        if (propagationToken == null) {
            coroutinePropagationElement = new CoroutinePropagationElement(this, "", "", i.d(new Long(CommonKt.monotonicId())));
        } else {
            PlatformThreadContextElement platformThreadContextElement = propagationToken instanceof PlatformThreadContextElement ? (PlatformThreadContextElement) propagationToken : null;
            if (platformThreadContextElement == null) {
                Objects.toString(propagationToken);
                throw new IllegalArgumentException("Unsupported token type ".concat(propagationToken.toString()));
            }
            String category = platformThreadContextElement.getCategory();
            if (category == null) {
                category = "";
            }
            String name = platformThreadContextElement.getName();
            if (name == null) {
                name = "";
            }
            List<Long> flowIds = platformThreadContextElement.getFlowIds();
            if (flowIds == null) {
                flowIds = i.d(new Long(CommonKt.monotonicId()));
            }
            coroutinePropagationElement = new CoroutinePropagationElement(this, category, name, flowIds);
        }
        coroutinePropagationElement.setName(str2);
        coroutinePropagationElement.setCategory(str);
        ProcessTrack processTrack = coroutinePropagationElement.getTracer$tracing().process;
        Thread threadCurrentThread = Thread.currentThread();
        long id = threadCurrentThread.getId();
        ThreadTrack orCreateThreadTrack = processTrack.l1ThreadTrack;
        ThreadTrack threadTrack = processTrack.l2ThreadTrack;
        if (orCreateThreadTrack == null || orCreateThreadTrack.getId() != id) {
            if (threadTrack == null || threadTrack.getId() != id) {
                orCreateThreadTrack = processTrack.getOrCreateThreadTrack(id, threadCurrentThread.getName());
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
                    Integer num = (pooledTracePacketArray2 == null || (traceEventArr = pooledTracePacketArray2.packets) == null) ? null : new Integer(traceEventArr.length);
                    pooledTracePacketArray.fillCount++;
                    int i2 = pooledTracePacketArray.fillCount;
                    if (num != null) {
                        num.intValue();
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
                eventMetadataCloseable2.propagationToken = coroutinePropagationElement;
                eventMetadataCloseable2.metadata = traceEventScope;
                traceEvent.primaryCategory = str;
                long j2 = threadTrack2.uuid;
                List<Long> flowIds2 = coroutinePropagationElement.getFlowIds();
                traceEvent.type = 1;
                traceEvent.trackUuid = j2;
                traceEvent.timestamp = System.nanoTime();
                traceEvent.flowIds = flowIds2;
                traceEvent.name = str2;
                threadTrack2.eventMetadataCloseable.closeable = coroutinePropagationElement;
            }
        }
        return threadTrack2.eventMetadataCloseable;
    }

    @Override // androidx.tracing.Tracer
    @DelicateTracingApi
    public EventMetadataCloseable beginSectionWithMetadata(String str, String str2, PropagationToken propagationToken, boolean z) {
        ProtoPool protoPool;
        PooledTracePacketArray pooledTracePacketArray;
        ProtoPool protoPool2;
        TraceEvent[] traceEventArr;
        ProtoPool protoPool3;
        PooledTracePacketArray pooledTracePacketArray2;
        ProtoPool protoPool4;
        TraceEvent[] traceEventArr2;
        TraceEvent traceEvent = null;
        if (propagationToken == null || x.n(propagationToken, PropagationUnsupportedToken.INSTANCE)) {
            ProcessTrack processTrack = this.process;
            Thread threadCurrentThread = Thread.currentThread();
            long id = threadCurrentThread.getId();
            ThreadTrack orCreateThreadTrack = processTrack.l1ThreadTrack;
            ThreadTrack threadTrack = processTrack.l2ThreadTrack;
            if (orCreateThreadTrack == null || orCreateThreadTrack.getId() != id) {
                if (threadTrack == null || threadTrack.getId() != id) {
                    orCreateThreadTrack = processTrack.getOrCreateThreadTrack(id, threadCurrentThread.getName());
                    processTrack.l2ThreadTrack = processTrack.l1ThreadTrack;
                    processTrack.l1ThreadTrack = orCreateThreadTrack;
                } else {
                    orCreateThreadTrack = threadTrack;
                }
            }
            ThreadTrack threadTrack2 = orCreateThreadTrack;
            PropagationUnsupportedToken propagationUnsupportedToken = PropagationUnsupportedToken.INSTANCE;
            EventMetadataCloseable eventMetadataCloseable = threadTrack2.eventMetadataCloseable;
            eventMetadataCloseable.metadata = EmptyEventMetadata.INSTANCE;
            eventMetadataCloseable.closeable = EmptyCloseable.INSTANCE;
            PropagationUnsupportedToken propagationUnsupportedToken2 = propagationUnsupportedToken;
            eventMetadataCloseable.propagationToken = propagationUnsupportedToken2;
            if (threadTrack2.context.isGloballyEnabled) {
                if (!threadTrack2.preamble) {
                    ThreadTrack threadTrack3 = threadTrack2;
                    if (threadTrack2.preamblePacket$tracing() != null && (pooledTracePacketArray = threadTrack3.currentPacketArray) != null) {
                        PooledTracePacketArray pooledTracePacketArray3 = threadTrack3.currentPacketArray;
                        Integer numValueOf = (pooledTracePacketArray3 == null || (traceEventArr = pooledTracePacketArray3.packets) == null) ? null : Integer.valueOf(traceEventArr.length);
                        pooledTracePacketArray.fillCount++;
                        int i2 = pooledTracePacketArray.fillCount;
                        if (numValueOf != null) {
                            numValueOf.intValue();
                        }
                        threadTrack3.context.sink.enqueue(pooledTracePacketArray);
                        ProtoPool protoPool5 = threadTrack3.pool;
                        if (protoPool5 == null) {
                            synchronized (threadTrack3.lock) {
                                protoPool2 = threadTrack3.pool;
                                if (protoPool2 == null) {
                                    protoPool2 = new ProtoPool(threadTrack3.context.isDebug);
                                    threadTrack3.pool = protoPool2;
                                }
                            }
                            protoPool5 = protoPool2;
                        }
                        threadTrack3.currentPacketArray = protoPool5.obtainTracePacketArray();
                    }
                    threadTrack2.preamble = true;
                }
                ThreadTrack threadTrack4 = threadTrack2;
                if (threadTrack4.currentPacketArray == null) {
                    ProtoPool protoPool6 = threadTrack4.pool;
                    if (protoPool6 == null) {
                        synchronized (threadTrack4.lock) {
                            protoPool = threadTrack4.pool;
                            if (protoPool == null) {
                                protoPool = new ProtoPool(threadTrack4.context.isDebug);
                                threadTrack4.pool = protoPool;
                            }
                        }
                        protoPool6 = protoPool;
                    }
                    threadTrack4.currentPacketArray = protoPool6.obtainTracePacketArray();
                }
                PooledTracePacketArray pooledTracePacketArray4 = threadTrack4.currentPacketArray;
                if (pooledTracePacketArray4 == null) {
                    threadTrack4.context.sink.onDroppedTraceEvent();
                } else {
                    traceEvent = pooledTracePacketArray4.packets[pooledTracePacketArray4.fillCount];
                }
                if (traceEvent != null) {
                    EventMetadataCloseable eventMetadataCloseable2 = threadTrack2.eventMetadataCloseable;
                    eventMetadataCloseable2.propagationToken = propagationUnsupportedToken2;
                    traceEvent.primaryCategory = str;
                    TraceEventScope traceEventScope = threadTrack2.traceEventScope;
                    traceEventScope.event = traceEvent;
                    eventMetadataCloseable2.metadata = traceEventScope;
                    long j2 = threadTrack2.uuid;
                    traceEvent.type = 1;
                    traceEvent.trackUuid = j2;
                    traceEvent.timestamp = System.nanoTime();
                    traceEvent.name = str2;
                    threadTrack2.eventMetadataCloseable.closeable = threadTrack2;
                }
            }
            return threadTrack2.eventMetadataCloseable;
        }
        PlatformThreadContextElement platformThreadContextElement = propagationToken instanceof PlatformThreadContextElement ? (PlatformThreadContextElement) propagationToken : null;
        if (platformThreadContextElement == null) {
            Objects.toString(propagationToken);
            throw new IllegalArgumentException("Unsupported token type ".concat(propagationToken.toString()));
        }
        ProcessTrack processTrack2 = this.process;
        Thread threadCurrentThread2 = Thread.currentThread();
        long id2 = threadCurrentThread2.getId();
        ThreadTrack orCreateThreadTrack2 = processTrack2.l1ThreadTrack;
        ThreadTrack threadTrack5 = processTrack2.l2ThreadTrack;
        if (orCreateThreadTrack2 == null || orCreateThreadTrack2.getId() != id2) {
            if (threadTrack5 == null || threadTrack5.getId() != id2) {
                orCreateThreadTrack2 = processTrack2.getOrCreateThreadTrack(id2, threadCurrentThread2.getName());
                processTrack2.l2ThreadTrack = processTrack2.l1ThreadTrack;
                processTrack2.l1ThreadTrack = orCreateThreadTrack2;
            } else {
                orCreateThreadTrack2 = threadTrack5;
            }
        }
        String category = platformThreadContextElement.getCategory();
        if (category == null) {
            category = "";
        }
        String name = platformThreadContextElement.getName();
        if (name == null) {
            name = "";
        }
        List<Long> flowIds = platformThreadContextElement.getFlowIds();
        if (flowIds == null) {
            flowIds = i.d(Long.valueOf(CommonKt.monotonicId()));
        }
        PropagationElement propagationElement = new PropagationElement(this, category, name, flowIds);
        ThreadTrack threadTrack6 = orCreateThreadTrack2;
        EventMetadataCloseable eventMetadataCloseable3 = threadTrack6.eventMetadataCloseable;
        eventMetadataCloseable3.metadata = EmptyEventMetadata.INSTANCE;
        eventMetadataCloseable3.closeable = EmptyCloseable.INSTANCE;
        eventMetadataCloseable3.propagationToken = PropagationUnsupportedToken.INSTANCE;
        if (threadTrack6.context.isGloballyEnabled) {
            if (!threadTrack6.preamble) {
                ThreadTrack threadTrack7 = threadTrack6;
                if (threadTrack6.preamblePacket$tracing() != null && (pooledTracePacketArray2 = threadTrack7.currentPacketArray) != null) {
                    PooledTracePacketArray pooledTracePacketArray5 = threadTrack7.currentPacketArray;
                    Integer numValueOf2 = (pooledTracePacketArray5 == null || (traceEventArr2 = pooledTracePacketArray5.packets) == null) ? null : Integer.valueOf(traceEventArr2.length);
                    pooledTracePacketArray2.fillCount++;
                    int i3 = pooledTracePacketArray2.fillCount;
                    if (numValueOf2 != null) {
                        numValueOf2.intValue();
                    }
                    threadTrack7.context.sink.enqueue(pooledTracePacketArray2);
                    ProtoPool protoPool7 = threadTrack7.pool;
                    if (protoPool7 == null) {
                        synchronized (threadTrack7.lock) {
                            protoPool4 = threadTrack7.pool;
                            if (protoPool4 == null) {
                                protoPool4 = new ProtoPool(threadTrack7.context.isDebug);
                                threadTrack7.pool = protoPool4;
                            }
                        }
                        protoPool7 = protoPool4;
                    }
                    threadTrack7.currentPacketArray = protoPool7.obtainTracePacketArray();
                }
                threadTrack6.preamble = true;
            }
            ThreadTrack threadTrack8 = threadTrack6;
            if (threadTrack8.currentPacketArray == null) {
                ProtoPool protoPool8 = threadTrack8.pool;
                if (protoPool8 == null) {
                    synchronized (threadTrack8.lock) {
                        protoPool3 = threadTrack8.pool;
                        if (protoPool3 == null) {
                            protoPool3 = new ProtoPool(threadTrack8.context.isDebug);
                            threadTrack8.pool = protoPool3;
                        }
                    }
                    protoPool8 = protoPool3;
                }
                threadTrack8.currentPacketArray = protoPool8.obtainTracePacketArray();
            }
            PooledTracePacketArray pooledTracePacketArray6 = threadTrack8.currentPacketArray;
            if (pooledTracePacketArray6 == null) {
                threadTrack8.context.sink.onDroppedTraceEvent();
            } else {
                traceEvent = pooledTracePacketArray6.packets[pooledTracePacketArray6.fillCount];
            }
            if (traceEvent != null) {
                TraceEventScope traceEventScope2 = threadTrack6.traceEventScope;
                traceEventScope2.event = traceEvent;
                EventMetadataCloseable eventMetadataCloseable4 = threadTrack6.eventMetadataCloseable;
                eventMetadataCloseable4.propagationToken = propagationElement;
                eventMetadataCloseable4.metadata = traceEventScope2;
                traceEvent.primaryCategory = str;
                long j3 = threadTrack6.uuid;
                List<Long> flowIds2 = propagationElement.getFlowIds();
                traceEvent.type = 1;
                traceEvent.trackUuid = j3;
                traceEvent.timestamp = System.nanoTime();
                traceEvent.flowIds = flowIds2;
                traceEvent.name = str2;
                threadTrack6.eventMetadataCloseable.closeable = propagationElement;
            }
        }
        return threadTrack6.eventMetadataCloseable;
    }

    @Override // androidx.tracing.Tracer
    public Counter counter(String str, String str2) {
        return this.process.getOrCreateCounterTrack(str2);
    }

    public final void enqueueSingleUnmodifiedEvent() {
        this.process.enqueueSingleUnmodifiedEvent();
    }

    @Override // androidx.tracing.Tracer
    @DelicateTracingApi
    public EventMetadataCloseable instant(String str, String str2) {
        ProcessTrack processTrack = this.process;
        Thread threadCurrentThread = Thread.currentThread();
        long id = threadCurrentThread.getId();
        ThreadTrack orCreateThreadTrack = processTrack.l1ThreadTrack;
        ThreadTrack threadTrack = processTrack.l2ThreadTrack;
        if (orCreateThreadTrack == null || orCreateThreadTrack.getId() != id) {
            if (threadTrack == null || threadTrack.getId() != id) {
                orCreateThreadTrack = processTrack.getOrCreateThreadTrack(id, threadCurrentThread.getName());
                processTrack.l2ThreadTrack = processTrack.l1ThreadTrack;
                processTrack.l1ThreadTrack = orCreateThreadTrack;
            } else {
                orCreateThreadTrack = threadTrack;
            }
        }
        return orCreateThreadTrack.instant(str, str2);
    }

    @Override // androidx.tracing.Tracer
    public boolean isCategoryEnabled(String str) {
        return this.categoryEnabled.invoke(str).booleanValue();
    }

    public final void resetTraceEvents() {
        ProcessTrack processTrack = this.process;
        Thread threadCurrentThread = Thread.currentThread();
        long id = threadCurrentThread.getId();
        ThreadTrack orCreateThreadTrack = processTrack.l1ThreadTrack;
        ThreadTrack threadTrack = processTrack.l2ThreadTrack;
        if (orCreateThreadTrack == null || orCreateThreadTrack.getId() != id) {
            if (threadTrack == null || threadTrack.getId() != id) {
                orCreateThreadTrack = processTrack.getOrCreateThreadTrack(id, threadCurrentThread.getName());
                processTrack.l2ThreadTrack = processTrack.l1ThreadTrack;
                processTrack.l1ThreadTrack = orCreateThreadTrack;
            } else {
                orCreateThreadTrack = threadTrack;
            }
        }
        orCreateThreadTrack.resetTraceEvents();
    }

    @Override // androidx.tracing.Tracer
    @ExperimentalContextPropagation
    public PropagationToken tokenForManualPropagation() {
        return new PropagationElement(this, "", "", i.d(Long.valueOf(CommonKt.monotonicId())));
    }

    @Override // androidx.tracing.Tracer
    @DelicateTracingApi
    public Object tokenFromCoroutineContext(e<? super PlatformThreadContextElement> eVar) {
        String category;
        List<Long> listD;
        String name;
        PlatformThreadContextElement platformThreadContextElement = (PlatformThreadContextElement) eVar.getContext().get(PlatformThreadContextElement.KEY);
        String str = "";
        if (platformThreadContextElement == null || (category = platformThreadContextElement.getCategory()) == null) {
            category = "";
        }
        if (platformThreadContextElement != null && (name = platformThreadContextElement.getName()) != null) {
            str = name;
        }
        if (platformThreadContextElement == null || (listD = platformThreadContextElement.getFlowIds()) == null) {
            listD = i.d(new Long(CommonKt.monotonicId()));
        }
        return new CoroutinePropagationElement(this, category, str, listD);
    }

    @Override // androidx.tracing.Tracer
    @DelicateTracingApi
    public PropagationToken tokenFromThreadContext() {
        return PropagationUnsupportedToken.INSTANCE;
    }
}
