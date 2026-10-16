package androidx.tracing;

import androidx.collection.LongIntMapKt;
import androidx.collection.MutableLongIntMap;
import h.c.h;
import h.c.i;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class PlatformThreadContextElement extends h.c.a implements PropagationToken, AutoCloseable {
    public static final Companion Companion = new Companion(null);
    public static final i<PlatformThreadContextElement> KEY = new i<PlatformThreadContextElement>() { // from class: androidx.tracing.PlatformThreadContextElement$Companion$KEY$1
    };
    public static final int STATE_BEGIN = 1;
    public static final int STATE_END = 0;
    private String category;
    private final List<Long> flowIds;
    private String name;
    public final MutableLongIntMap started;
    private final PerfettoTracer tracer;

    public PlatformThreadContextElement(PerfettoTracer perfettoTracer, String str, String str2, List<Long> list) {
        super(KEY);
        this.tracer = perfettoTracer;
        this.category = str;
        this.name = str2;
        this.flowIds = list;
        MutableLongIntMap mutableLongIntMapMutableLongIntMapOf = LongIntMapKt.mutableLongIntMapOf();
        this.started = mutableLongIntMapMutableLongIntMapOf;
        synchronized (this) {
            mutableLongIntMapMutableLongIntMapOf.set(Thread.currentThread().getId(), 1);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        boolean z;
        synchronized (this) {
            long id = Thread.currentThread().getId();
            z = false;
            if (this.started.getOrDefault(id, 0) == 1) {
                this.started.set(id, 0);
                z = true;
            }
        }
        if (z) {
            ProcessTrack processTrack = getTracer$tracing().process;
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

    @Override // androidx.tracing.PropagationToken
    @DelicateTracingApi
    public h contextElementOrNull() {
        return this;
    }

    public String getCategory() {
        return this.category;
    }

    public List<Long> getFlowIds() {
        return this.flowIds;
    }

    public String getName() {
        return this.name;
    }

    public PerfettoTracer getTracer$tracing() {
        return this.tracer;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public final boolean synchronizedCompareAndSet$tracing(int i2, int i3) {
        boolean z;
        synchronized (this) {
            long id = Thread.currentThread().getId();
            z = false;
            if (this.started.getOrDefault(id, 0) == i2) {
                this.started.set(id, i3);
                z = true;
            }
        }
        return z;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getKEY$annotations() {
        }

        public static /* synthetic */ void getSTATE_BEGIN$annotations() {
        }

        public static /* synthetic */ void getSTATE_END$annotations() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
