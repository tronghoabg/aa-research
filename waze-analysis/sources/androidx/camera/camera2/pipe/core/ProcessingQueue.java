package androidx.camera.camera2.pipe.core;

import h.a.i;
import h.a.u;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.e.b;
import h.g.a.l;
import h.g.a.p;
import h.g.b.w;
import h.g.b.x;
import java.util.List;
import kotlinx.a.a;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.a.t;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ProcessingQueue<T> {
    public static final Companion Companion = new Companion(null);
    private final int capacity;
    private final o<T> channel;
    private final l<List<? extends T>, ab> onUnprocessedElements;
    private final p<List<T>, e<? super ab>, Object> process;
    private final u<T> queue;
    private final a started;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.core.ProcessingQueue$processingLoop$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int I$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ProcessingQueue<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ProcessingQueue<T> processingQueue, e<? super AnonymousClass1> eVar) {
            super(eVar);
            this.this$0 = processingQueue;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.processingLoop(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProcessingQueue(int i2, l<? super List<? extends T>, ab> lVar, p<? super List<T>, ? super e<? super ab>, ? extends Object> pVar) {
        x.f(lVar, "onUnprocessedElements");
        x.f(pVar, "process");
        this.capacity = i2;
        this.onUnprocessedElements = lVar;
        this.process = pVar;
        this.started = b.e(false);
        this.channel = w.c(i2, null, new l() { // from class: androidx.camera.camera2.pipe.core.ProcessingQueue$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ProcessingQueue.channel$lambda$0(this.f$0, obj);
            }
        }, 2);
        this.queue = new u<>();
    }

    static final ab _init_$lambda$0(List list) {
        x.f(list, "it");
        return ab.f48028a;
    }

    static final ab channel$lambda$0(ProcessingQueue processingQueue, Object obj) {
        processingQueue.queue.add(obj);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r7.invoke(r5, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        if (r2 == r6.queue.size()) goto L22;
     */
    /* JADX WARN: Path cross not found for [B:22:0x003d, B:25:0x004c], limit reached: 40 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0028, B:34:0x0083, B:25:0x004c, B:27:0x0056, B:28:0x005c, B:31:0x0064, B:32:0x0071, B:22:0x003d, B:24:0x0047, B:17:0x0034), top: B:40:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0028, B:34:0x0083, B:25:0x004c, B:27:0x0056, B:28:0x005c, B:31:0x0064, B:32:0x0071, B:22:0x003d, B:24:0x0047, B:17:0x0034), top: B:40:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0028, B:34:0x0083, B:25:0x004c, B:27:0x0056, B:28:0x005c, B:31:0x0064, B:32:0x0071, B:22:0x003d, B:24:0x0047, B:17:0x0034), top: B:40:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0081 -> B:34:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processingLoop(h.c.e<? super h.ab> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.camera.camera2.pipe.core.ProcessingQueue.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.camera.camera2.pipe.core.ProcessingQueue$processingLoop$1 r0 = (androidx.camera.camera2.pipe.core.ProcessingQueue.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.core.ProcessingQueue$processingLoop$1 r0 = new androidx.camera.camera2.pipe.core.ProcessingQueue$processingLoop$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            int r2 = r0.I$0
            e.b.c.b(r7)     // Catch: java.lang.Throwable -> L38
            goto L83
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            e.b.c.b(r7)     // Catch: java.lang.Throwable -> L38
            goto L47
        L38:
            r7 = move-exception
            goto L8d
        L3a:
            e.b.c.b(r7)
        L3d:
            kotlinx.coroutines.a.o<T> r7 = r6.channel     // Catch: java.lang.Throwable -> L38
            r0.label = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r7 = r7.d(r0)     // Catch: java.lang.Throwable -> L38
            if (r7 == r1) goto L8c
        L47:
            h.a.u<T> r2 = r6.queue     // Catch: java.lang.Throwable -> L38
            r2.add(r7)     // Catch: java.lang.Throwable -> L38
        L4c:
            h.a.u<T> r7 = r6.queue     // Catch: java.lang.Throwable -> L38
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Throwable -> L38
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r7 != 0) goto L3d
            kotlinx.coroutines.a.o<T> r7 = r6.channel     // Catch: java.lang.Throwable -> L38
            java.lang.Object r7 = r7.h()     // Catch: java.lang.Throwable -> L38
        L5c:
            boolean r2 = kotlinx.coroutines.a.t.g(r7)     // Catch: java.lang.Throwable -> L38
            h.a.u<T> r5 = r6.queue
            if (r2 == 0) goto L71
            kotlinx.coroutines.a.t.h(r7)     // Catch: java.lang.Throwable -> L38
            r5.add(r7)     // Catch: java.lang.Throwable -> L38
            kotlinx.coroutines.a.o<T> r7 = r6.channel     // Catch: java.lang.Throwable -> L38
            java.lang.Object r7 = r7.h()     // Catch: java.lang.Throwable -> L38
            goto L5c
        L71:
            int r2 = r5.size()     // Catch: java.lang.Throwable -> L38
            h.g.a.p<java.util.List<T>, h.c.e<? super h.ab>, java.lang.Object> r7 = r6.process     // Catch: java.lang.Throwable -> L38
            h.a.u<T> r5 = r6.queue     // Catch: java.lang.Throwable -> L38
            r0.I$0 = r2     // Catch: java.lang.Throwable -> L38
            r0.label = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L38
            if (r7 == r1) goto L8c
        L83:
            h.a.u<T> r7 = r6.queue     // Catch: java.lang.Throwable -> L38
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L38
            if (r2 != r7) goto L4c
            goto L3d
        L8c:
            return r1
        L8d:
            r6.releaseUnprocessedElements(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.core.ProcessingQueue.processingLoop(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseUnprocessedElements(Throwable th) throws Throwable {
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

        public final <T> ProcessingQueue<T> processIn(ProcessingQueue<T> processingQueue, af afVar) {
            x.f(processingQueue, "<this>");
            x.f(afVar, "scope");
            if (!((ProcessingQueue) processingQueue).started.b(false, true)) {
                throw new IllegalStateException("ProcessingQueue cannot be re-started!");
            }
            if (aj.z(afVar, null, null, new ProcessingQueue$Companion$processIn$job$1(processingQueue, null), 3).u()) {
                processingQueue.releaseUnprocessedElements(null);
            }
            return processingQueue;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    public /* synthetic */ ProcessingQueue(int i2, l lVar, p pVar, int i3, h.g.b.o oVar) {
        this(1 == (i3 & 1) ? Integer.MAX_VALUE : i2, (i3 & 2) != 0 ? new l() { // from class: androidx.camera.camera2.pipe.core.ProcessingQueue$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ProcessingQueue._init_$lambda$0((List) obj);
            }
        } : lVar, pVar);
    }
}
