package androidx.tracing;

import androidx.collection.MutableLongObjectMap;
import androidx.collection.MutableScatterMap;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class TraceContext implements AutoCloseable {
    public final l<String, Boolean> isCategoryEnabled;
    public final boolean isDebug;
    public final boolean isGloballyEnabled;
    public volatile boolean isProcessInitialized;
    public ProcessTrack process;
    public final Object processTrackLock;
    public final AbstractTraceSink sink;

    /* JADX WARN: Multi-variable type inference failed */
    public TraceContext(AbstractTraceSink abstractTraceSink, boolean z, l<? super String, Boolean> lVar, boolean z2) {
        this.sink = abstractTraceSink;
        this.isGloballyEnabled = z;
        this.isCategoryEnabled = lVar;
        this.isDebug = z2;
        this.processTrackLock = new Object();
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        flush();
        this.sink.close();
    }

    public void createProcessTrack(int i2, String str) {
        synchronized (this.processTrackLock) {
            if (!this.isProcessInitialized) {
                setProcess(new ProcessTrack(this, i2, str));
                this.isProcessInitialized = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void flush() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tracing.TraceContext.flush():void");
    }

    public ProcessTrack getProcess() {
        ProcessTrack processTrack = this.process;
        if (processTrack != null) {
            return processTrack;
        }
        x.j("process");
        return null;
    }

    public final long poolableCount$tracing() {
        long j2;
        long j3;
        long j4;
        char c2;
        ProtoPool protoPool;
        char c3;
        int i2;
        ProtoPool protoPool2;
        ProtoPool protoPool3;
        if (!this.isDebug) {
            return 0L;
        }
        ProcessTrack process = getProcess();
        ProtoPool protoPool4 = process.pool;
        if (protoPool4 == null) {
            synchronized (process.lock) {
                protoPool3 = process.pool;
                if (protoPool3 == null) {
                    protoPool3 = new ProtoPool(process.context.isDebug);
                    process.pool = protoPool3;
                }
            }
            protoPool4 = protoPool3;
        }
        long jPoolableCount = protoPool4.poolableCount();
        synchronized (getProcess().getThreads()) {
            MutableLongObjectMap<ThreadTrack> threads = getProcess().getThreads();
            Object[] objArr = threads.values;
            long[] jArr = threads.metadata;
            int length = jArr.length - 2;
            int i3 = 8;
            if (length >= 0) {
                int i4 = 0;
                j2 = 128;
                j3 = 255;
                while (true) {
                    long j5 = jArr[i4];
                    char c4 = 7;
                    j4 = -9187201950435737472L;
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j5 & 255) < 128) {
                                ThreadTrack threadTrack = (ThreadTrack) objArr[(i4 << 3) + i6];
                                c3 = c4;
                                ProtoPool protoPool5 = threadTrack.pool;
                                if (protoPool5 == null) {
                                    synchronized (threadTrack.lock) {
                                        protoPool2 = threadTrack.pool;
                                        if (protoPool2 == null) {
                                            i2 = i3;
                                            protoPool2 = new ProtoPool(threadTrack.context.isDebug);
                                            threadTrack.pool = protoPool2;
                                        } else {
                                            i2 = i3;
                                        }
                                    }
                                    protoPool5 = protoPool2;
                                } else {
                                    i2 = i3;
                                }
                                jPoolableCount += protoPool5.poolableCount();
                            } else {
                                c3 = c4;
                                i2 = i3;
                            }
                            j5 >>= i2;
                            i6++;
                            c4 = c3;
                            i3 = i2;
                        }
                        c2 = c4;
                        if (i5 != i3) {
                            break;
                        }
                    } else {
                        c2 = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    i3 = 8;
                }
            } else {
                j2 = 128;
                j3 = 255;
                j4 = -9187201950435737472L;
                c2 = 7;
            }
        }
        synchronized (getProcess().getCounters$tracing()) {
            MutableScatterMap<String, CounterTrack> counters$tracing = getProcess().getCounters$tracing();
            Object[] objArr2 = counters$tracing.values;
            long[] jArr2 = counters$tracing.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i7 = 0;
                while (true) {
                    long j6 = jArr2[i7];
                    if ((((~j6) << c2) & j6 & j4) != j4) {
                        int i8 = 8 - ((~(i7 - length2)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((j6 & j3) < j2) {
                                CounterTrack counterTrack = (CounterTrack) objArr2[(i7 << 3) + i9];
                                ProtoPool protoPool6 = counterTrack.pool;
                                if (protoPool6 == null) {
                                    synchronized (counterTrack.lock) {
                                        protoPool = counterTrack.pool;
                                        if (protoPool == null) {
                                            protoPool = new ProtoPool(counterTrack.context.isDebug);
                                            counterTrack.pool = protoPool;
                                        }
                                    }
                                    protoPool6 = protoPool;
                                }
                                jPoolableCount += protoPool6.poolableCount();
                            }
                            j6 >>= 8;
                        }
                        if (i8 != 8) {
                            break;
                        }
                    }
                    if (i7 == length2) {
                        break;
                    }
                    i7++;
                }
            }
        }
        return jPoolableCount;
    }

    public void setProcess(ProcessTrack processTrack) {
        this.process = processTrack;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void validateTrackPools$tracing(h.g.a.l<? super androidx.tracing.Track, h.ab> r25) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tracing.TraceContext.validateTrackPools$tracing(h.g.a.l):void");
    }

    public TraceContext(AbstractTraceSink abstractTraceSink, boolean z, l<? super String, Boolean> lVar) {
        this(abstractTraceSink, z, lVar, false);
    }
}
