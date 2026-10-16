package androidx.tracing;

import androidx.collection.MutableLongObjectMap;
import androidx.collection.MutableScatterMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ProcessTrack extends SliceTrack {
    private final MutableScatterMap<String, CounterTrack> counters;
    private final int id;
    public volatile ThreadTrack l1ThreadTrack;
    public volatile ThreadTrack l2ThreadTrack;
    private final String name;
    private final MutableLongObjectMap<ThreadTrack> threads;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051 A[Catch: all -> 0x00c3, TryCatch #1 {, blocks: (B:6:0x0022, B:8:0x0029, B:10:0x002d, B:11:0x002f, B:15:0x003f, B:19:0x0044, B:20:0x0045, B:21:0x0046, B:22:0x004c, B:24:0x0051, B:27:0x0062, B:52:0x00bf, B:30:0x007c, B:32:0x0080, B:34:0x0084, B:35:0x0089, B:37:0x0092, B:38:0x0095, B:40:0x00a0, B:41:0x00a2, B:45:0x00b2, B:49:0x00b7, B:50:0x00b8, B:51:0x00b9, B:25:0x005a, B:12:0x0030, B:14:0x0034, B:42:0x00a3, B:44:0x00a7), top: B:62:0x0022, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[Catch: all -> 0x00c3, TryCatch #1 {, blocks: (B:6:0x0022, B:8:0x0029, B:10:0x002d, B:11:0x002f, B:15:0x003f, B:19:0x0044, B:20:0x0045, B:21:0x0046, B:22:0x004c, B:24:0x0051, B:27:0x0062, B:52:0x00bf, B:30:0x007c, B:32:0x0080, B:34:0x0084, B:35:0x0089, B:37:0x0092, B:38:0x0095, B:40:0x00a0, B:41:0x00a2, B:45:0x00b2, B:49:0x00b7, B:50:0x00b8, B:51:0x00b9, B:25:0x005a, B:12:0x0030, B:14:0x0034, B:42:0x00a3, B:44:0x00a7), top: B:62:0x0022, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[Catch: all -> 0x00c3, TryCatch #1 {, blocks: (B:6:0x0022, B:8:0x0029, B:10:0x002d, B:11:0x002f, B:15:0x003f, B:19:0x0044, B:20:0x0045, B:21:0x0046, B:22:0x004c, B:24:0x0051, B:27:0x0062, B:52:0x00bf, B:30:0x007c, B:32:0x0080, B:34:0x0084, B:35:0x0089, B:37:0x0092, B:38:0x0095, B:40:0x00a0, B:41:0x00a2, B:45:0x00b2, B:49:0x00b7, B:50:0x00b8, B:51:0x00b9, B:25:0x005a, B:12:0x0030, B:14:0x0034, B:42:0x00a3, B:44:0x00a7), top: B:62:0x0022, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProcessTrack(androidx.tracing.TraceContext r15, int r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tracing.ProcessTrack.<init>(androidx.tracing.TraceContext, int, java.lang.String):void");
    }

    public final ThreadTrack currentThreadTrack() {
        Thread threadCurrentThread = Thread.currentThread();
        long id = threadCurrentThread.getId();
        ThreadTrack threadTrack = this.l1ThreadTrack;
        ThreadTrack threadTrack2 = this.l2ThreadTrack;
        if (threadTrack != null && threadTrack.getId() == id) {
            return threadTrack;
        }
        if (threadTrack2 != null && threadTrack2.getId() == id) {
            return threadTrack2;
        }
        ThreadTrack orCreateThreadTrack = getOrCreateThreadTrack(id, threadCurrentThread.getName());
        this.l2ThreadTrack = this.l1ThreadTrack;
        this.l1ThreadTrack = orCreateThreadTrack;
        return orCreateThreadTrack;
    }

    public final MutableScatterMap<String, CounterTrack> getCounters$tracing() {
        return this.counters;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public CounterTrack getOrCreateCounterTrack(String str) {
        CounterTrack counterTrack;
        synchronized (this.counters) {
            MutableScatterMap<String, CounterTrack> mutableScatterMap = this.counters;
            CounterTrack counterTrack2 = mutableScatterMap.get(str);
            if (counterTrack2 == null) {
                counterTrack2 = new CounterTrack(str, this);
                mutableScatterMap.set(str, counterTrack2);
            }
            counterTrack = counterTrack2;
        }
        return counterTrack;
    }

    public ThreadTrack getOrCreateThreadTrack(long j2, String str) {
        ThreadTrack threadTrack;
        synchronized (this.threads) {
            MutableLongObjectMap<ThreadTrack> mutableLongObjectMap = this.threads;
            ThreadTrack threadTrack2 = mutableLongObjectMap.get(j2);
            if (threadTrack2 == null) {
                threadTrack2 = new ThreadTrack(j2, str, this);
                mutableLongObjectMap.set(j2, threadTrack2);
            }
            threadTrack = threadTrack2;
        }
        return threadTrack;
    }

    public final MutableLongObjectMap<ThreadTrack> getThreads() {
        return this.threads;
    }

    @Override // androidx.tracing.SliceTrack
    public TraceEvent preamblePacket$tracing() {
        return null;
    }
}
