package androidx.camera.camera2.pipe.core;

import h.a.i;
import h.a.u;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.e.b;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.w;
import h.g.b.x;
import java.util.List;
import kotlinx.a.a;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.a.t;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PruningProcessingQueue<T> {
    public static final Companion Companion = new Companion(null);
    private final int capacity;
    private final o<T> channel;
    private final l<List<? extends T>, ab> onUnprocessedElements;
    private final q<T, am<ab>, e<? super ab>, Object> process;
    private final p<List<T>, T, Boolean> prune;
    private final u<T> queue;
    private final a started;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ PruningProcessingQueue<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PruningProcessingQueue<T> pruningProcessingQueue, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.this$0 = pruningProcessingQueue;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Path cross not found for [B:14:0x004b, B:23:0x00a1], limit reached: 46 */
        /* JADX WARN: Path cross not found for [B:14:0x004b, B:25:0x00a5], limit reached: 46 */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0113 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0093 -> B:21:0x0095). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 277
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.core.PruningProcessingQueue.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PruningProcessingQueue(int i2, p<? super List<T>, ? super T, Boolean> pVar, l<? super List<? extends T>, ab> lVar, q<? super T, ? super am<ab>, ? super e<? super ab>, ? extends Object> qVar) {
        x.f(pVar, "prune");
        x.f(lVar, "onUnprocessedElements");
        x.f(qVar, "process");
        this.capacity = i2;
        this.prune = pVar;
        this.onUnprocessedElements = lVar;
        this.process = qVar;
        this.started = b.e(false);
        this.channel = w.c(i2, null, new l() { // from class: androidx.camera.camera2.pipe.core.PruningProcessingQueue$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return PruningProcessingQueue.channel$lambda$0(this.f$0, obj);
            }
        }, 2);
        this.queue = new u<>();
    }

    static final boolean _init_$lambda$0(List list, Object obj) {
        x.f(list, "<unused var>");
        return false;
    }

    static final ab _init_$lambda$1(List list) {
        x.f(list, "it");
        return ab.f48028a;
    }

    static final ab channel$lambda$0(PruningProcessingQueue pruningProcessingQueue, Object obj) {
        pruningProcessingQueue.queue.add(obj);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeAndReleaseUnprocessedElements(Throwable th) throws Throwable {
        u<T> uVar;
        if (this.channel.v(th)) {
            Object objH = this.channel.h();
            while (true) {
                boolean zG = t.g(objH);
                uVar = this.queue;
                if (!zG) {
                    break;
                }
                t.h(objH);
                uVar.add(objH);
                objH = this.channel.h();
            }
            if (uVar.isEmpty()) {
                return;
            }
            this.onUnprocessedElements.invoke(i.aq(this.queue));
            this.queue.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processingLoop(e eVar) {
        return aj.O(new AnonymousClass2(this, null), eVar);
    }

    public final Object emit(T t, e<? super ab> eVar) {
        Object objG = this.channel.g(t, eVar);
        return objG == h.c.a.a.f48038a ? objG : ab.f48028a;
    }

    public final void emitChecked(T t) {
        Object objI = this.channel.i(t);
        if (!t.g(objI)) {
            throw new IllegalStateException("Failed to emit item to ProcessingQueue!: ".concat(t.c(objI)));
        }
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final boolean tryEmit(T t) {
        return t.g(this.channel.i(t));
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final <T> PruningProcessingQueue<T> processIn(PruningProcessingQueue<T> pruningProcessingQueue, af afVar) throws Throwable {
            x.f(pruningProcessingQueue, "<this>");
            x.f(afVar, "scope");
            if (!((PruningProcessingQueue) pruningProcessingQueue).started.b(false, true)) {
                throw new IllegalStateException("PruningProcessingQueue cannot be re-started!");
            }
            if (aj.z(afVar, null, null, new PruningProcessingQueue$Companion$processIn$job$1(pruningProcessingQueue, null), 3).u()) {
                pruningProcessingQueue.closeAndReleaseUnprocessedElements(null);
            }
            return pruningProcessingQueue;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    public /* synthetic */ PruningProcessingQueue(int i2, p pVar, l lVar, q qVar, int i3, h.g.b.o oVar) {
        this(1 == (i3 & 1) ? Integer.MAX_VALUE : i2, (i3 & 2) != 0 ? new p() { // from class: androidx.camera.camera2.pipe.core.PruningProcessingQueue$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                PruningProcessingQueue._init_$lambda$0((List) obj, obj2);
                return false;
            }
        } : pVar, (i3 & 4) != 0 ? new l() { // from class: androidx.camera.camera2.pipe.core.PruningProcessingQueue$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return PruningProcessingQueue._init_$lambda$1((List) obj);
            }
        } : lVar, qVar);
    }
}
