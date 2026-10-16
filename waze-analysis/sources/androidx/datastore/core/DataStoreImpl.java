package androidx.datastore.core;

import androidx.core.app.NotificationCompat;
import androidx.datastore.core.Message;
import androidx.datastore.core.UpdatingDataContextElement;
import androidx.datastore.core.handlers.ReThrowCorruptionHandler;
import androidx.tracing.PropagationToken;
import androidx.tracing.Tracer;
import h.a.i;
import h.ab;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.c.j;
import h.f;
import h.g.a.l;
import h.g.a.p;
import h.g.b.ao;
import h.g.b.aq;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.br;
import kotlinx.coroutines.h.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DataStoreImpl<T> implements CurrentDataProviderStore<T> {
    public static final String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";
    public static final Companion Companion = new Companion(null);
    private int collectorCounter;
    private br collectorJob;
    private final a collectorMutex;
    private final f<InterProcessCoordinator> coordinatorDelegate;
    private final CorruptionHandler<T> corruptionHandler;
    private final k<T> data;
    private final DataStoreInMemoryCache<T> inMemoryCache;
    private final DataStoreImpl<T>.InitDataStore readAndInit;
    private final af scope;
    private final Storage<T> storage;
    private final f<StorageConnection<T>> storageConnectionDelegate;
    private final Tracer tracer;
    private final SimpleActor<Message.Update<T>> writeActor;

    /* compiled from: WazeSource */
    final class InitDataStore extends RunOnce {
        private final j context;
        private List<? extends p<? super InitializerApi<T>, ? super e<? super ab>, ? extends Object>> initTasks;
        final /* synthetic */ DataStoreImpl<T> this$0;

        public InitDataStore(DataStoreImpl dataStoreImpl, List<? extends p<? super InitializerApi<T>, ? super e<? super ab>, ? extends Object>> list, j jVar) {
            x.f(list, "initTasksList");
            x.f(jVar, "context");
            this.this$0 = dataStoreImpl;
            this.context = jVar;
            this.initTasks = i.ao(list);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        
            if (kotlinx.coroutines.aj.v(r2, r5, r0) == r1) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.datastore.core.RunOnce
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected java.lang.Object doRun(h.c.e<? super h.ab> r8) {
            /*
                r7 = this;
                boolean r0 = r8 instanceof androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                r0.<init>(r7, r8)
            L18:
                java.lang.Object r8 = r0.result
                h.c.a.a r1 = h.c.a.a.f48038a
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2e
                java.lang.Object r7 = r0.L$0
                androidx.tracing.PropagationToken r7 = (androidx.tracing.PropagationToken) r7
                e.b.c.b(r8)
                goto L64
            L2e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L36:
                e.b.c.b(r8)
                goto L4b
            L3a:
                e.b.c.b(r8)
                androidx.datastore.core.DataStoreImpl<T> r8 = r7.this$0
                androidx.tracing.Tracer r8 = androidx.datastore.core.DataStoreImpl.access$getTracer$p(r8)
                r0.label = r4
                java.lang.Object r8 = androidx.datastore.core.DataStoreTracer_androidKt.captureTraceToken(r8, r0)
                if (r8 == r1) goto L67
            L4b:
                h.c.j r2 = r7.context
                androidx.datastore.core.DataStoreImpl<T> r4 = r7.this$0
                androidx.tracing.PropagationToken r8 = (androidx.tracing.PropagationToken) r8
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$2 r5 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$2
                r6 = 0
                r5.<init>(r4, r8, r7, r6)
                h.g.a.p r5 = (h.g.a.p) r5
                r0.L$0 = r6
                r0.label = r3
                java.lang.Object r7 = kotlinx.coroutines.aj.v(r2, r5, r0)
                if (r7 != r1) goto L64
                goto L67
            L64:
                h.ab r7 = h.ab.f48028a
                return r7
            L67:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.InitDataStore.doRun(h.c.e):java.lang.Object");
        }

        public final j getContext() {
            return this.context;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$currentData$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DataStoreImpl<T> dataStoreImpl, e<? super AnonymousClass1> eVar) {
            super(eVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.currentData(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$decrementCollector$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    final class C04161 extends c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04161(DataStoreImpl<T> dataStoreImpl, e<? super C04161> eVar) {
            super(eVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.decrementCollector(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass2 extends g implements l<e, Object> {
        final /* synthetic */ l<e, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(l<? super e, ? extends Object> lVar, e<? super AnonymousClass2> eVar) {
            super(1, eVar);
            this.$block = lVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass2(this.$block, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e eVar) {
            return ((AnonymousClass2) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            l<e, Object> lVar = this.$block;
            this.label = 1;
            Object objInvoke = lVar.invoke(this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$handleUpdate$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    final class C04172 extends g implements l<e<? super Boolean>, Object> {
        final /* synthetic */ Message.Update<T> $update;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04172(DataStoreImpl<T> dataStoreImpl, Message.Update<T> update, e<? super C04172> eVar) {
            super(1, eVar);
            this.this$0 = dataStoreImpl;
            this.$update = update;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new C04172(this.this$0, this.$update, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super Boolean> eVar) {
            return ((C04172) create(eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(5:6|26|7|23|24)(2:11|12))(1:13))(3:14|(0)|25)|16|28|17|(3:19|23|24)|25|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        
            r8 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
        
            r0 = r4;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r8.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r0 = r8.L$2
                kotlinx.coroutines.CompletableDeferred r0 = (kotlinx.coroutines.CompletableDeferred) r0
                java.lang.Object r1 = r8.L$1
                androidx.datastore.core.DataStoreImpl r1 = (androidx.datastore.core.DataStoreImpl) r1
                java.lang.Object r8 = r8.L$0
                androidx.tracing.PropagationToken r8 = (androidx.tracing.PropagationToken) r8
                e.b.c.b(r9)     // Catch: java.lang.Throwable -> L1c
                goto L75
            L1c:
                r8 = move-exception
                goto L71
            L1e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L26:
                e.b.c.b(r9)
                goto L3e
            L2a:
                e.b.c.b(r9)
                androidx.datastore.core.DataStoreImpl<T> r9 = r8.this$0
                androidx.tracing.Tracer r9 = androidx.datastore.core.DataStoreImpl.access$getTracer$p(r9)
                r1 = r8
                h.c.e r1 = (h.c.e) r1
                r8.label = r3
                java.lang.Object r9 = androidx.datastore.core.DataStoreTracer_androidKt.captureTraceToken(r9, r1)
                if (r9 == r0) goto L7e
            L3e:
                androidx.datastore.core.Message$Update<T> r1 = r8.$update
                androidx.datastore.core.DataStoreImpl<T> r3 = r8.this$0
                androidx.tracing.PropagationToken r9 = (androidx.tracing.PropagationToken) r9
                kotlinx.coroutines.CompletableDeferred r4 = r1.getAck()
                h.c.j r5 = r1.getCallerContext()     // Catch: java.lang.Throwable -> L6f
                h.c.j r6 = r8.getContext()     // Catch: java.lang.Throwable -> L6f
                h.c.j r5 = r5.plus(r6)     // Catch: java.lang.Throwable -> L6f
                androidx.datastore.core.DataStoreImpl$handleUpdate$2$1$1 r6 = new androidx.datastore.core.DataStoreImpl$handleUpdate$2$1$1     // Catch: java.lang.Throwable -> L6f
                r7 = 0
                r6.<init>(r3, r1, r9, r7)     // Catch: java.lang.Throwable -> L6f
                h.g.a.p r6 = (h.g.a.p) r6     // Catch: java.lang.Throwable -> L6f
                r8.L$0 = r7     // Catch: java.lang.Throwable -> L6f
                r8.L$1 = r7     // Catch: java.lang.Throwable -> L6f
                r8.L$2 = r4     // Catch: java.lang.Throwable -> L6f
                r9 = 0
                r8.I$0 = r9     // Catch: java.lang.Throwable -> L6f
                r8.label = r2     // Catch: java.lang.Throwable -> L6f
                java.lang.Object r9 = kotlinx.coroutines.aj.v(r5, r6, r8)     // Catch: java.lang.Throwable -> L6f
                if (r9 == r0) goto L7e
                r0 = r4
                goto L75
            L6f:
                r8 = move-exception
                r0 = r4
            L71:
                java.lang.Object r9 = e.b.c.a(r8)
            L75:
                boolean r8 = kotlinx.coroutines.bo.i(r0, r9)
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                return r8
            L7e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C04172.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$incrementCollector$1, reason: invalid class name and case insensitive filesystem */
    final class C04181 extends c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04181(DataStoreImpl<T> dataStoreImpl, e<? super C04181> eVar) {
            super(eVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.incrementCollector(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    final class C04192 extends g implements l<e<? super ab>, Object> {
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04192(DataStoreImpl<T> dataStoreImpl, e<? super C04192> eVar) {
            super(1, eVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new C04192(this.this$0, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super ab> eVar) {
            return ((C04192) create(eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        
            if (r9 != r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
        
            if (r9 == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
        
            if (((androidx.datastore.core.DataStoreImpl) r8.this$0).readAndInit.runIfNeeded(r8) != r0) goto L31;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r8.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L35
                if (r1 == r5) goto L31
                if (r1 == r4) goto L2d
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                int r0 = r8.I$0
                e.b.c.b(r9)     // Catch: java.lang.Throwable -> L1a
                goto La9
            L1a:
                r9 = move-exception
                goto Lb0
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L25:
                java.lang.Object r1 = r8.L$0
                androidx.tracing.PropagationToken r1 = (androidx.tracing.PropagationToken) r1
                e.b.c.b(r9)
                goto L8d
            L2d:
                e.b.c.b(r9)
                goto L6b
            L31:
                e.b.c.b(r9)
                goto L55
            L35:
                e.b.c.b(r9)
                androidx.datastore.core.DataStoreImpl<T> r9 = r8.this$0
                h.f r9 = androidx.datastore.core.DataStoreImpl.access$getCoordinatorDelegate$p(r9)
                boolean r9 = r9.isInitialized()
                androidx.datastore.core.DataStoreImpl<T> r1 = r8.this$0
                if (r9 == 0) goto L5c
                androidx.datastore.core.InterProcessCoordinator r9 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r1)
                r1 = r8
                h.c.e r1 = (h.c.e) r1
                r8.label = r5
                java.lang.Object r9 = r9.getVersion(r1)
                if (r9 == r0) goto Lc1
            L55:
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                goto L93
            L5c:
                androidx.tracing.Tracer r9 = androidx.datastore.core.DataStoreImpl.access$getTracer$p(r1)
                r1 = r8
                h.c.e r1 = (h.c.e) r1
                r8.label = r4
                java.lang.Object r9 = androidx.datastore.core.DataStoreTracer_androidKt.captureTraceToken(r9, r1)
                if (r9 == r0) goto Lc1
            L6b:
                androidx.datastore.core.DataStoreImpl<T> r1 = r8.this$0
                androidx.tracing.PropagationToken r9 = (androidx.tracing.PropagationToken) r9
                kotlinx.coroutines.af r1 = androidx.datastore.core.DataStoreImpl.access$getScope$p(r1)
                h.c.j r1 = r1.getCoroutineContext()
                androidx.datastore.core.DataStoreImpl<T> r4 = r8.this$0
                androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$2$preReadVersion$1 r5 = new androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$2$preReadVersion$1
                r5.<init>(r4, r9, r6)
                h.g.a.p r5 = (h.g.a.p) r5
                r9 = r8
                h.c.e r9 = (h.c.e) r9
                r8.L$0 = r6
                r8.label = r3
                java.lang.Object r9 = kotlinx.coroutines.aj.v(r1, r5, r9)
                if (r9 == r0) goto Lc1
            L8d:
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
            L93:
                androidx.datastore.core.DataStoreImpl<T> r1 = r8.this$0     // Catch: java.lang.Throwable -> Lac
                androidx.datastore.core.DataStoreImpl$InitDataStore r1 = androidx.datastore.core.DataStoreImpl.access$getReadAndInit$p(r1)     // Catch: java.lang.Throwable -> Lac
                r3 = r8
                h.c.e r3 = (h.c.e) r3     // Catch: java.lang.Throwable -> Lac
                r8.L$0 = r6     // Catch: java.lang.Throwable -> Lac
                r8.I$0 = r9     // Catch: java.lang.Throwable -> Lac
                r8.label = r2     // Catch: java.lang.Throwable -> Lac
                java.lang.Object r8 = r1.runIfNeeded(r3)     // Catch: java.lang.Throwable -> Lac
                if (r8 != r0) goto La9
                goto Lc1
            La9:
                h.ab r8 = h.ab.f48028a
                return r8
            Lac:
                r0 = move-exception
                r7 = r0
                r0 = r9
                r9 = r7
            Lb0:
                androidx.datastore.core.DataStoreImpl<T> r8 = r8.this$0
                androidx.datastore.core.DataStoreInMemoryCache r8 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r8)
                androidx.datastore.core.ReadException r1 = new androidx.datastore.core.ReadException
                r1.<init>(r9, r0)
                androidx.datastore.core.State r1 = (androidx.datastore.core.State) r1
                r8.tryUpdate(r1)
                throw r9
            Lc1:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C04192.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1, reason: invalid class name and case insensitive filesystem */
    final class C04201 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04201(DataStoreImpl<T> dataStoreImpl, e<? super C04201> eVar) {
            super(eVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataAndUpdateCache(false, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass3 extends g implements l<e<? super h.k<? extends State<T>, ? extends Boolean>>, Object> {
        final /* synthetic */ p<Boolean, e<? super Integer>, Object> $getVersion;
        final /* synthetic */ boolean $requireLock;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(DataStoreImpl<T> dataStoreImpl, p<? super Boolean, ? super e<? super Integer>, ? extends Object> pVar, boolean z, e<? super AnonymousClass3> eVar) {
            super(1, eVar);
            this.this$0 = dataStoreImpl;
            this.$getVersion = pVar;
            this.$requireLock = z;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass3(this.this$0, this.$getVersion, this.$requireLock, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super h.k<? extends State<T>, Boolean>> eVar) {
            return ((AnonymousClass3) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            ReadException readException;
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            try {
            } catch (Throwable th2) {
                p<Boolean, e<? super Integer>, Object> pVar = this.$getVersion;
                Boolean boolValueOf = Boolean.valueOf(this.$requireLock);
                this.L$0 = null;
                this.L$1 = th2;
                this.label = 2;
                Object objInvoke = pVar.invoke(boolValueOf, this);
                if (objInvoke == aVar) {
                    return aVar;
                }
                th = th2;
                obj = objInvoke;
            }
            if (i2 == 0) {
                e.b.c.b(obj);
                this.label = 1;
                obj = this.this$0.readDataOrHandleCorruption(true, this.$getVersion, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.L$1;
                    e.b.c.b(obj);
                    readException = new ReadException(th, ((Number) obj).intValue());
                    return new h.k(readException, true);
                }
                e.b.c.b(obj);
            }
            readException = (State) obj;
            return new h.k(readException, true);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataFromFileOrDefault$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    final class C04212 extends g implements l<e<? super T>, Object> {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04212(DataStoreImpl<T> dataStoreImpl, e<? super C04212> eVar) {
            super(1, eVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new C04212(this.this$0, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super T> eVar) {
            return ((C04212) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.label = 1;
            Object data = StorageConnectionKt.readData(this.this$0.getStorageConnection$datastore_core(), this);
            return data == aVar ? aVar : data;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1, reason: invalid class name and case insensitive filesystem */
    final class C04221 extends c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04221(DataStoreImpl<T> dataStoreImpl, e<? super C04221> eVar) {
            super(eVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataOrHandleCorruption(false, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$readState$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    final class C04241 extends c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04241(DataStoreImpl<T> dataStoreImpl, e<? super C04241> eVar) {
            super(eVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readState(false, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$transformAndWrite$2, reason: invalid class name and case insensitive filesystem */
    final class C04252 extends g implements l<e<? super T>, Object> {
        final /* synthetic */ j $callerContext;
        final /* synthetic */ PropagationToken $token;
        final /* synthetic */ p<T, e<? super T>, Object> $transform;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* compiled from: WazeSource */
        /* renamed from: androidx.datastore.core.DataStoreImpl$transformAndWrite$2$1, reason: invalid class name */
        /* loaded from: classes3.dex */
        final class AnonymousClass1 extends g implements l<e<? super T>, Object> {
            final /* synthetic */ j $callerContext;
            final /* synthetic */ p<T, e<? super T>, Object> $transform;
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(DataStoreImpl<T> dataStoreImpl, j jVar, p<? super T, ? super e<? super T>, ? extends Object> pVar, e<? super AnonymousClass1> eVar) {
                super(1, eVar);
                this.this$0 = dataStoreImpl;
                this.$callerContext = jVar;
                this.$transform = pVar;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(e<?> eVar) {
                return new AnonymousClass1(this.this$0, this.$callerContext, this.$transform, eVar);
            }

            @Override // h.g.a.l
            public final Object invoke(e<? super T> eVar) {
                return ((AnonymousClass1) create(eVar)).invokeSuspend(ab.f48028a);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
            @Override // h.c.b.a.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    h.c.a.a r0 = h.c.a.a.f48038a
                    int r1 = r13.label
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 0
                    r6 = 1
                    if (r1 == 0) goto L42
                    if (r1 == r6) goto L3e
                    if (r1 == r4) goto L35
                    if (r1 == r3) goto L29
                    if (r1 != r2) goto L21
                    java.lang.Object r0 = r13.L$2
                    java.lang.Object r1 = r13.L$1
                    androidx.tracing.PropagationToken r1 = (androidx.tracing.PropagationToken) r1
                    java.lang.Object r13 = r13.L$0
                    androidx.datastore.core.Data r13 = (androidx.datastore.core.Data) r13
                    e.b.c.b(r14)
                    return r0
                L21:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L29:
                    java.lang.Object r1 = r13.L$1
                    androidx.tracing.PropagationToken r1 = (androidx.tracing.PropagationToken) r1
                    java.lang.Object r1 = r13.L$0
                    androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
                    e.b.c.b(r14)
                    goto L91
                L35:
                    java.lang.Object r1 = r13.L$0
                    androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
                    e.b.c.b(r14)
                    r11 = r1
                    goto L70
                L3e:
                    e.b.c.b(r14)
                    goto L59
                L42:
                    e.b.c.b(r14)
                    androidx.datastore.core.DataStoreImpl<T> r14 = r13.this$0
                    androidx.datastore.core.DataStoreImpl$transformAndWrite$2$1$curData$1 r1 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$1$curData$1
                    r1.<init>(r14, r5)
                    h.g.a.p r1 = (h.g.a.p) r1
                    r7 = r13
                    h.c.e r7 = (h.c.e) r7
                    r13.label = r6
                    java.lang.Object r14 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r14, r6, r1, r7)
                    if (r14 == r0) goto Lb3
                L59:
                    androidx.datastore.core.DataStoreImpl<T> r1 = r13.this$0
                    androidx.datastore.core.Data r14 = (androidx.datastore.core.Data) r14
                    androidx.tracing.Tracer r1 = androidx.datastore.core.DataStoreImpl.access$getTracer$p(r1)
                    r7 = r13
                    h.c.e r7 = (h.c.e) r7
                    r13.L$0 = r14
                    r13.label = r4
                    java.lang.Object r1 = androidx.datastore.core.DataStoreTracer_androidKt.captureTraceToken(r1, r7)
                    if (r1 == r0) goto Lb3
                    r11 = r14
                    r14 = r1
                L70:
                    h.c.j r1 = r13.$callerContext
                    androidx.datastore.core.DataStoreImpl<T> r8 = r13.this$0
                    h.g.a.p<T, h.c.e<? super T>, java.lang.Object> r10 = r13.$transform
                    r9 = r14
                    androidx.tracing.PropagationToken r9 = (androidx.tracing.PropagationToken) r9
                    androidx.datastore.core.DataStoreImpl$transformAndWrite$2$1$newData$1 r7 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$1$newData$1
                    r12 = 0
                    r7.<init>(r8, r9, r10, r11, r12)
                    h.g.a.p r7 = (h.g.a.p) r7
                    r14 = r13
                    h.c.e r14 = (h.c.e) r14
                    r13.L$0 = r11
                    r13.L$1 = r5
                    r13.label = r3
                    java.lang.Object r14 = kotlinx.coroutines.aj.v(r1, r7, r14)
                    if (r14 == r0) goto Lb3
                    r1 = r11
                L91:
                    r1.checkHashCode()
                    java.lang.Object r1 = r1.getValue()
                    boolean r1 = h.g.b.x.n(r1, r14)
                    if (r1 != 0) goto Lb2
                    androidx.datastore.core.DataStoreImpl<T> r1 = r13.this$0
                    r3 = r13
                    h.c.e r3 = (h.c.e) r3
                    r13.L$0 = r5
                    r13.L$1 = r5
                    r13.L$2 = r14
                    r13.label = r2
                    java.lang.Object r13 = r1.writeData$datastore_core(r14, r6, r3)
                    if (r13 != r0) goto Lb2
                    goto Lb3
                Lb2:
                    return r14
                Lb3:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C04252.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04252(DataStoreImpl<T> dataStoreImpl, PropagationToken propagationToken, j jVar, p<? super T, ? super e<? super T>, ? extends Object> pVar, e<? super C04252> eVar) {
            super(1, eVar);
            this.this$0 = dataStoreImpl;
            this.$token = propagationToken;
            this.$callerContext = jVar;
            this.$transform = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new C04252(this.this$0, this.$token, this.$callerContext, this.$transform, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super T> eVar) {
            return ((C04252) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Exception {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            PropagationToken propagationToken = this.$token;
            j jVar = this.$callerContext;
            p<T, e<? super T>, Object> pVar = this.$transform;
            this.label = 1;
            Object objTrace = DataStoreTracer_androidKt.trace(((DataStoreImpl) dataStoreImpl).tracer, "DataStore.transformAndWrite", propagationToken, new AnonymousClass1(dataStoreImpl, jVar, pVar, null), this);
            return objTrace == aVar ? aVar : objTrace;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$updateData$2, reason: invalid class name and case insensitive filesystem */
    final class C04262 extends g implements l<e<? super T>, Object> {
        final /* synthetic */ p<T, e<? super T>, Object> $transform;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* compiled from: WazeSource */
        /* renamed from: androidx.datastore.core.DataStoreImpl$updateData$2$1, reason: invalid class name */
        /* loaded from: classes3.dex */
        final class AnonymousClass1 extends g implements p<af, e<? super T>, Object> {
            final /* synthetic */ PropagationToken $token;
            final /* synthetic */ p<T, e<? super T>, Object> $transform;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(DataStoreImpl<T> dataStoreImpl, p<? super T, ? super e<? super T>, ? extends Object> pVar, PropagationToken propagationToken, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.this$0 = dataStoreImpl;
                this.$transform = pVar;
                this.$token = propagationToken;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$transform, this.$token, eVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super T> eVar) {
                return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                af afVar = (af) this.L$0;
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.b.c.b(obj);
                    return obj;
                }
                e.b.c.b(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                p<T, e<? super T>, Object> pVar = this.$transform;
                PropagationToken propagationToken = this.$token;
                CompletableDeferred completableDeferredJ = bo.j();
                NoValueDataState currentState = ((DataStoreImpl) dataStoreImpl).inMemoryCache.getCurrentState();
                if (currentState instanceof Data) {
                    currentState = new NoValueDataState(((Data) currentState).getVersion());
                }
                ((DataStoreImpl) this.this$0).writeActor.offer(new Message.Update(pVar, completableDeferredJ, currentState, afVar.getCoroutineContext(), propagationToken));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                Object objC = completableDeferredJ.c(this);
                return objC == aVar ? aVar : objC;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04262(DataStoreImpl<T> dataStoreImpl, p<? super T, ? super e<? super T>, ? extends Object> pVar, e<? super C04262> eVar) {
            super(1, eVar);
            this.this$0 = dataStoreImpl;
            this.$transform = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new C04262(this.this$0, this.$transform, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super T> eVar) {
            return ((C04262) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                this.label = 1;
                obj = DataStoreTracer_androidKt.captureTraceToken(((DataStoreImpl) this.this$0).tracer, this);
                if (obj != aVar) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            PropagationToken propagationToken = (PropagationToken) obj;
            UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) getContext().get(UpdatingDataContextElement.Companion.Key.INSTANCE);
            if (updatingDataContextElement != null) {
                updatingDataContextElement.checkNotUpdating(this.this$0);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            Object objV = aj.v(new UpdatingDataContextElement(updatingDataContextElement, this.this$0), new AnonymousClass1(this.this$0, this.$transform, propagationToken, null), this);
            return objV == aVar ? aVar : objV;
        }
    }

    public DataStoreImpl(Storage<T> storage, List<? extends p<? super InitializerApi<T>, ? super e<? super ab>, ? extends Object>> list, CorruptionHandler<T> corruptionHandler, j jVar, Tracer tracer) {
        x.f(storage, "storage");
        x.f(list, "initTasksList");
        x.f(corruptionHandler, "corruptionHandler");
        x.f(jVar, "context");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.tracer = tracer;
        br brVar = (br) jVar.get(br.f51766a);
        if (brVar == null) {
            Objects.toString(jVar);
            throw new IllegalStateException("Missing Job on Coroutine context: ".concat(String.valueOf(jVar)));
        }
        af afVarE = aj.e(jVar.plus(brVar));
        this.scope = afVarE;
        this.data = ai.E(new DataStoreImpl$data$1(this, null));
        this.collectorMutex = kotlinx.coroutines.h.i.c();
        this.inMemoryCache = new DataStoreInMemoryCache<>();
        this.readAndInit = new InitDataStore(this, list, afVarE.getCoroutineContext());
        this.storageConnectionDelegate = h.g.a(new h.g.a.a() { // from class: androidx.datastore.core.DataStoreImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.storage.createConnection();
            }
        });
        this.coordinatorDelegate = h.g.a(new h.g.a.a() { // from class: androidx.datastore.core.DataStoreImpl$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.getStorageConnection$datastore_core().getCoordinator();
            }
        });
        this.writeActor = new SimpleActor<>(afVarE, new l() { // from class: androidx.datastore.core.DataStoreImpl$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DataStoreImpl.writeActor$lambda$0(this.f$0, (Throwable) obj);
            }
        }, new p() { // from class: androidx.datastore.core.DataStoreImpl$$ExternalSyntheticLambda3
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return DataStoreImpl.writeActor$lambda$1((Message.Update) obj, (Throwable) obj2);
            }
        }, new DataStoreImpl$writeActor$3(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object decrementCollector(h.c.e<? super h.ab> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl.C04161
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl.C04161) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$decrementCollector$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            int r1 = r0.I$0
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.h.a r0 = (kotlinx.coroutines.h.a) r0
            e.b.c.b(r6)
            goto L49
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            e.b.c.b(r6)
            kotlinx.coroutines.h.a r6 = r5.collectorMutex
            r0.L$0 = r6
            r2 = 0
            r0.I$0 = r2
            r0.label = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 == r1) goto L65
            r0 = r6
        L49:
            int r6 = r5.collectorCounter     // Catch: java.lang.Throwable -> L60
            int r6 = r6 + (-1)
            r5.collectorCounter = r6     // Catch: java.lang.Throwable -> L60
            if (r6 != 0) goto L5a
            kotlinx.coroutines.br r6 = r5.collectorJob     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L58
            h.g.b.o.o(r6)     // Catch: java.lang.Throwable -> L60
        L58:
            r5.collectorJob = r4     // Catch: java.lang.Throwable -> L60
        L5a:
            r0.unlock(r4)
            h.ab r5 = h.ab.f48028a
            return r5
        L60:
            r5 = move-exception
            r0.unlock(r4)
            throw r5
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.decrementCollector(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> Object doWithWriteFileLock(boolean z, l<? super e<? super R>, ? extends Object> lVar, e<? super R> eVar) {
        return z ? lVar.invoke(eVar) : getCoordinator().lock(new AnonymousClass2(lVar, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterProcessCoordinator getCoordinator() {
        return this.coordinatorDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleUpdate(Message.Update<T> update, e<? super ab> eVar) throws Exception {
        Object objTrace = DataStoreTracer_androidKt.trace(this.tracer, "DataStore.handleUpdate", update.getToken(), new C04172(this, update, null), eVar);
        return objTrace == h.c.a.a.f48038a ? objTrace : ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object incrementCollector(h.c.e<? super h.ab> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl.C04181
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl.C04181) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$incrementCollector$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            int r1 = r0.I$0
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.h.a r0 = (kotlinx.coroutines.h.a) r0
            e.b.c.b(r6)
            goto L49
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            e.b.c.b(r6)
            kotlinx.coroutines.h.a r6 = r5.collectorMutex
            r0.L$0 = r6
            r2 = 0
            r0.I$0 = r2
            r0.label = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 == r1) goto L6b
            r0 = r6
        L49:
            int r6 = r5.collectorCounter     // Catch: java.lang.Throwable -> L66
            int r6 = r6 + r3
            r5.collectorCounter = r6     // Catch: java.lang.Throwable -> L66
            if (r6 != r3) goto L60
            kotlinx.coroutines.af r6 = r5.scope     // Catch: java.lang.Throwable -> L66
            androidx.datastore.core.DataStoreImpl$incrementCollector$2$1 r1 = new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1     // Catch: java.lang.Throwable -> L66
            r1.<init>(r5, r4)     // Catch: java.lang.Throwable -> L66
            h.g.a.p r1 = (h.g.a.p) r1     // Catch: java.lang.Throwable -> L66
            r2 = 3
            kotlinx.coroutines.br r6 = kotlinx.coroutines.aj.z(r6, r4, r4, r1, r2)     // Catch: java.lang.Throwable -> L66
            r5.collectorJob = r6     // Catch: java.lang.Throwable -> L66
        L60:
            r0.unlock(r4)
            h.ab r5 = h.ab.f48028a
            return r5
        L66:
            r5 = move-exception
            r0.unlock(r4)
            throw r5
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.incrementCollector(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readAndInitOrPropagateAndThrowFailure(PropagationToken propagationToken, e<? super ab> eVar) throws Exception {
        Object objTrace = DataStoreTracer_androidKt.trace(this.tracer, "DataStore.readAndInitOrPropagateAndThrowFailure", propagationToken, new C04192(this, null), eVar);
        return objTrace == h.c.a.a.f48038a ? objTrace : ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00de, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readDataAndUpdateCache(boolean r9, h.c.e<? super androidx.datastore.core.State<T>> r10) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataAndUpdateCache(boolean, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readDataFromFileOrDefault(e<? super T> eVar) {
        return DataStoreTracer_androidKt.trace$default(this.tracer, "DataStore.readDataFromFileOrDefault", null, new C04212(this, null), eVar, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readDataOrHandleCorruption(boolean r11, h.g.a.p<? super java.lang.Boolean, ? super h.c.e<? super java.lang.Integer>, ? extends java.lang.Object> r12, h.c.e<? super androidx.datastore.core.Data<T>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.datastore.core.DataStoreImpl.C04221
            if (r0 == 0) goto L13
            r0 = r13
            androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1 r0 = (androidx.datastore.core.DataStoreImpl.C04221) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1 r0 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            boolean r10 = r0.Z$0
            java.lang.Object r10 = r0.L$1
            androidx.tracing.PropagationToken r10 = (androidx.tracing.PropagationToken) r10
            java.lang.Object r10 = r0.L$0
            h.g.a.p r10 = (h.g.a.p) r10
            e.b.c.b(r13)
            return r13
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            boolean r11 = r0.Z$0
            java.lang.Object r12 = r0.L$0
            h.g.a.p r12 = (h.g.a.p) r12
            e.b.c.b(r13)
            goto L57
        L46:
            e.b.c.b(r13)
            androidx.tracing.Tracer r13 = r10.tracer
            r0.L$0 = r12
            r0.Z$0 = r11
            r0.label = r4
            java.lang.Object r13 = androidx.datastore.core.DataStoreTracer_androidKt.captureTraceToken(r13, r0)
            if (r13 == r1) goto L7c
        L57:
            r7 = r11
            r8 = r12
            kotlinx.coroutines.af r11 = r10.scope
            r6 = r13
            androidx.tracing.PropagationToken r6 = (androidx.tracing.PropagationToken) r6
            h.c.j r11 = r11.getCoroutineContext()
            androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2 r4 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2
            r9 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            h.g.a.p r4 = (h.g.a.p) r4
            r10 = 0
            r0.L$0 = r10
            r0.L$1 = r10
            r0.Z$0 = r7
            r0.label = r3
            java.lang.Object r10 = kotlinx.coroutines.aj.v(r11, r4, r0)
            if (r10 != r1) goto L7b
            goto L7c
        L7b:
            return r10
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataOrHandleCorruption(boolean, h.g.a.p, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readState(boolean r7, androidx.tracing.PropagationToken r8, h.c.e<? super androidx.datastore.core.State<T>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.DataStoreImpl.C04241
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.DataStoreImpl$readState$1 r0 = (androidx.datastore.core.DataStoreImpl.C04241) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readState$1 r0 = new androidx.datastore.core.DataStoreImpl$readState$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            boolean r6 = r0.Z$0
            java.lang.Object r6 = r0.L$0
            androidx.tracing.PropagationToken r6 = (androidx.tracing.PropagationToken) r6
            e.b.c.b(r9)
            return r9
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$0
            androidx.tracing.PropagationToken r8 = (androidx.tracing.PropagationToken) r8
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L6b
            goto L5d
        L43:
            e.b.c.b(r9)
            androidx.datastore.core.DataStoreInMemoryCache<T> r9 = r6.inMemoryCache
            androidx.datastore.core.State r9 = r9.getCurrentState()
            boolean r9 = r9 instanceof androidx.datastore.core.Final
            if (r9 != 0) goto L73
            r0.L$0 = r3     // Catch: java.lang.Throwable -> L6b
            r0.Z$0 = r7     // Catch: java.lang.Throwable -> L6b
            r0.label = r5     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r8 = r6.readAndInitOrPropagateAndThrowFailure(r8, r0)     // Catch: java.lang.Throwable -> L6b
            if (r8 != r1) goto L5d
            goto L69
        L5d:
            r0.L$0 = r3
            r0.Z$0 = r7
            r0.label = r4
            java.lang.Object r6 = r6.readDataAndUpdateCache(r7, r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            return r6
        L6b:
            r6 = move-exception
            androidx.datastore.core.ReadException r7 = new androidx.datastore.core.ReadException
            r8 = -1
            r7.<init>(r6, r8)
            return r7
        L73:
            androidx.datastore.core.DataStoreInMemoryCache<T> r6 = r6.inMemoryCache
            androidx.datastore.core.State r6 = r6.getCurrentState()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readState(boolean, androidx.tracing.PropagationToken, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object transformAndWrite(p<? super T, ? super e<? super T>, ? extends Object> pVar, j jVar, PropagationToken propagationToken, e<? super T> eVar) {
        return getCoordinator().lock(new C04252(this, propagationToken, jVar, pVar, null), eVar);
    }

    static final ab writeActor$lambda$0(DataStoreImpl dataStoreImpl, Throwable th) {
        if (th != null) {
            dataStoreImpl.inMemoryCache.tryUpdate(new Final(th));
        }
        if (dataStoreImpl.storageConnectionDelegate.isInitialized()) {
            dataStoreImpl.getStorageConnection$datastore_core().close();
        }
        return ab.f48028a;
    }

    static final ab writeActor$lambda$1(Message.Update update, Throwable th) {
        x.f(update, NotificationCompat.CATEGORY_MESSAGE);
        CompletableDeferred<T> ack = update.getAck();
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        ack.b(th);
        return ab.f48028a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r6 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.datastore.core.CurrentDataProviderStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object currentData(h.c.e<? super T> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$currentData$1 r0 = (androidx.datastore.core.DataStoreImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$currentData$1 r0 = new androidx.datastore.core.DataStoreImpl$currentData$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.L$0
            androidx.tracing.PropagationToken r5 = (androidx.tracing.PropagationToken) r5
            e.b.c.b(r6)
            goto L5e
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            e.b.c.b(r6)
            goto L50
        L3a:
            e.b.c.b(r6)
            kotlinx.coroutines.af r6 = r5.scope
            h.c.j r6 = r6.getCoroutineContext()
            h.g.b.o.f(r6)
            androidx.tracing.Tracer r6 = r5.tracer
            r0.label = r4
            java.lang.Object r6 = androidx.datastore.core.DataStoreTracer_androidKt.captureTraceToken(r6, r0)
            if (r6 == r1) goto L9d
        L50:
            androidx.tracing.PropagationToken r6 = (androidx.tracing.PropagationToken) r6
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            r2 = 0
            java.lang.Object r6 = r5.readState(r2, r6, r0)
            if (r6 == r1) goto L9d
        L5e:
            androidx.datastore.core.State r6 = (androidx.datastore.core.State) r6
            boolean r5 = r6 instanceof androidx.datastore.core.Data
            if (r5 == 0) goto L6b
            androidx.datastore.core.Data r6 = (androidx.datastore.core.Data) r6
            java.lang.Object r5 = r6.getValue()
            return r5
        L6b:
            boolean r5 = r6 instanceof androidx.datastore.core.UnInitialized
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            if (r5 != 0) goto L97
            boolean r5 = r6 instanceof androidx.datastore.core.ReadException
            if (r5 != 0) goto L90
            boolean r5 = r6 instanceof androidx.datastore.core.Final
            if (r5 != 0) goto L89
            boolean r5 = r6 instanceof androidx.datastore.core.NoValueDataState
            if (r5 == 0) goto L83
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r0)
            throw r5
        L83:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        L89:
            androidx.datastore.core.Final r6 = (androidx.datastore.core.Final) r6
            java.lang.Throwable r5 = r6.getFinalException()
            throw r5
        L90:
            androidx.datastore.core.ReadException r6 = (androidx.datastore.core.ReadException) r6
            java.lang.Throwable r5 = r6.getReadException()
            throw r5
        L97:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r0)
            throw r5
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.currentData(h.c.e):java.lang.Object");
    }

    @Override // androidx.datastore.core.DataStore
    public k<T> getData() {
        return this.data;
    }

    public final StorageConnection<T> getStorageConnection$datastore_core() {
        return this.storageConnectionDelegate.getValue();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(p<? super T, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar) {
        o.f(this.scope.getCoroutineContext());
        return DataStoreTracer_androidKt.trace$default(this.tracer, "DataStore.updateData", null, new C04262(this, pVar, null), eVar, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeData$datastore_core(T r11, boolean r12, h.c.e<? super java.lang.Integer> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.datastore.core.DataStoreImpl$writeData$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = (androidx.datastore.core.DataStoreImpl$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = new androidx.datastore.core.DataStoreImpl$writeData$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r10 = r0.Z$0
            java.lang.Object r10 = r0.L$1
            h.g.b.ao r10 = (h.g.b.ao) r10
            java.lang.Object r11 = r0.L$0
            e.b.c.b(r13)
            goto L5e
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            e.b.c.b(r13)
            h.g.b.ao r6 = new h.g.b.ao
            r6.<init>()
            androidx.datastore.core.StorageConnection r13 = r10.getStorageConnection$datastore_core()
            androidx.datastore.core.DataStoreImpl$writeData$2 r4 = new androidx.datastore.core.DataStoreImpl$writeData$2
            r9 = 0
            r5 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            h.g.a.p r4 = (h.g.a.p) r4
            r10 = 0
            r0.L$0 = r10
            r0.L$1 = r6
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r10 = r13.writeScope(r4, r0)
            if (r10 == r1) goto L66
            r10 = r6
        L5e:
            int r10 = r10.f48103a
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            return r11
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.writeData$datastore_core(java.lang.Object, boolean, h.c.e):java.lang.Object");
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    final class C04232 extends g implements p<af, e<? super Data<T>>, Object> {
        final /* synthetic */ p<Boolean, e<? super Integer>, Object> $getVersion;
        final /* synthetic */ boolean $hasWriteFileLock;
        final /* synthetic */ PropagationToken $readOrHandleCorruptionToken;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04232(DataStoreImpl<T> dataStoreImpl, PropagationToken propagationToken, boolean z, p<? super Boolean, ? super e<? super Integer>, ? extends Object> pVar, e<? super C04232> eVar) {
            super(2, eVar);
            this.this$0 = dataStoreImpl;
            this.$readOrHandleCorruptionToken = propagationToken;
            this.$hasWriteFileLock = z;
            this.$getVersion = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new C04232(this.this$0, this.$readOrHandleCorruptionToken, this.$hasWriteFileLock, this.$getVersion, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super Data<T>> eVar) {
            return ((C04232) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Exception {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            PropagationToken propagationToken = this.$readOrHandleCorruptionToken;
            boolean z = this.$hasWriteFileLock;
            p<Boolean, e<? super Integer>, Object> pVar = this.$getVersion;
            this.label = 1;
            Object objTrace = DataStoreTracer_androidKt.trace(((DataStoreImpl) dataStoreImpl).tracer, "DataStore.readDataOrHandleCorruption", propagationToken, new AnonymousClass1(z, dataStoreImpl, pVar, null), this);
            return objTrace == aVar ? aVar : objTrace;
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements l<e<? super Data<T>>, Object> {
            final /* synthetic */ p<Boolean, e<? super Integer>, Object> $getVersion;
            final /* synthetic */ boolean $hasWriteFileLock;
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ DataStoreImpl<T> this$0;

            /* compiled from: WazeSource */
            /* renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2$1$2, reason: invalid class name and collision with other inner class name */
            final class C00952 extends g implements l<e<? super ab>, Object> {
                final /* synthetic */ p<Boolean, e<? super Integer>, Object> $getVersion;
                final /* synthetic */ boolean $hasWriteFileLock;
                final /* synthetic */ aq<T> $newData;
                final /* synthetic */ ao $version;
                Object L$0;
                Object L$1;
                int label;
                final /* synthetic */ DataStoreImpl<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00952(aq<T> aqVar, DataStoreImpl<T> dataStoreImpl, ao aoVar, p<? super Boolean, ? super e<? super Integer>, ? extends Object> pVar, boolean z, e<? super C00952> eVar) {
                    super(1, eVar);
                    this.$newData = aqVar;
                    this.this$0 = dataStoreImpl;
                    this.$version = aoVar;
                    this.$getVersion = pVar;
                    this.$hasWriteFileLock = z;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(e<?> eVar) {
                    return new C00952(this.$newData, this.this$0, this.$version, this.$getVersion, this.$hasWriteFileLock, eVar);
                }

                @Override // h.g.a.l
                public final Object invoke(e<? super ab> eVar) {
                    return ((C00952) create(eVar)).invokeSuspend(ab.f48028a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
                
                    if (r8 != r0) goto L22;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // h.c.b.a.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        r7 = this;
                        h.c.a.a r0 = h.c.a.a.f48038a
                        int r1 = r7.label
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L33
                        if (r1 == r4) goto L2b
                        if (r1 == r3) goto L23
                        if (r1 != r2) goto L1b
                        java.lang.Object r0 = r7.L$1
                        h.g.b.ao r0 = (h.g.b.ao) r0
                        java.lang.Object r7 = r7.L$0
                        androidx.datastore.core.CorruptionException r7 = (androidx.datastore.core.CorruptionException) r7
                        e.b.c.b(r8)
                        goto L81
                    L1b:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L23:
                        java.lang.Object r1 = r7.L$0
                        h.g.b.ao r1 = (h.g.b.ao) r1
                        e.b.c.b(r8)     // Catch: androidx.datastore.core.CorruptionException -> L67
                        goto L5e
                    L2b:
                        java.lang.Object r1 = r7.L$0
                        h.g.b.aq r1 = (h.g.b.aq) r1
                        e.b.c.b(r8)     // Catch: androidx.datastore.core.CorruptionException -> L67
                        goto L48
                    L33:
                        e.b.c.b(r8)
                        h.g.b.aq<T> r1 = r7.$newData     // Catch: androidx.datastore.core.CorruptionException -> L67
                        androidx.datastore.core.DataStoreImpl<T> r8 = r7.this$0     // Catch: androidx.datastore.core.CorruptionException -> L67
                        r5 = r7
                        h.c.e r5 = (h.c.e) r5     // Catch: androidx.datastore.core.CorruptionException -> L67
                        r7.L$0 = r1     // Catch: androidx.datastore.core.CorruptionException -> L67
                        r7.label = r4     // Catch: androidx.datastore.core.CorruptionException -> L67
                        java.lang.Object r8 = androidx.datastore.core.DataStoreImpl.access$readDataFromFileOrDefault(r8, r5)     // Catch: androidx.datastore.core.CorruptionException -> L67
                        if (r8 != r0) goto L48
                        goto L8c
                    L48:
                        r1.f48105a = r8     // Catch: androidx.datastore.core.CorruptionException -> L67
                        h.g.b.ao r1 = r7.$version     // Catch: androidx.datastore.core.CorruptionException -> L67
                        h.g.a.p<java.lang.Boolean, h.c.e<? super java.lang.Integer>, java.lang.Object> r8 = r7.$getVersion     // Catch: androidx.datastore.core.CorruptionException -> L67
                        boolean r5 = r7.$hasWriteFileLock     // Catch: androidx.datastore.core.CorruptionException -> L67
                        java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: androidx.datastore.core.CorruptionException -> L67
                        r7.L$0 = r1     // Catch: androidx.datastore.core.CorruptionException -> L67
                        r7.label = r3     // Catch: androidx.datastore.core.CorruptionException -> L67
                        java.lang.Object r8 = r8.invoke(r5, r7)     // Catch: androidx.datastore.core.CorruptionException -> L67
                        if (r8 == r0) goto L8c
                    L5e:
                        java.lang.Number r8 = (java.lang.Number) r8     // Catch: androidx.datastore.core.CorruptionException -> L67
                        int r8 = r8.intValue()     // Catch: androidx.datastore.core.CorruptionException -> L67
                        r1.f48103a = r8     // Catch: androidx.datastore.core.CorruptionException -> L67
                        goto L89
                    L67:
                        h.g.b.ao r8 = r7.$version
                        androidx.datastore.core.DataStoreImpl<T> r1 = r7.this$0
                        h.g.b.aq<T> r3 = r7.$newData
                        java.lang.Object r3 = r3.f48105a
                        r5 = r7
                        h.c.e r5 = (h.c.e) r5
                        r6 = 0
                        r7.L$0 = r6
                        r7.L$1 = r8
                        r7.label = r2
                        java.lang.Object r7 = r1.writeData$datastore_core(r3, r4, r5)
                        if (r7 == r0) goto L8c
                        r0 = r8
                        r8 = r7
                    L81:
                        java.lang.Number r8 = (java.lang.Number) r8
                        int r7 = r8.intValue()
                        r0.f48103a = r7
                    L89:
                        h.ab r7 = h.ab.f48028a
                        return r7
                    L8c:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C04232.AnonymousClass1.C00952.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(boolean z, DataStoreImpl<T> dataStoreImpl, p<? super Boolean, ? super e<? super Integer>, ? extends Object> pVar, e<? super AnonymousClass1> eVar) {
                super(1, eVar);
                this.$hasWriteFileLock = z;
                this.this$0 = dataStoreImpl;
                this.$getVersion = pVar;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(e<?> eVar) {
                return new AnonymousClass1(this.$hasWriteFileLock, this.this$0, this.$getVersion, eVar);
            }

            @Override // h.g.a.l
            public final Object invoke(e<? super Data<T>> eVar) {
                return ((AnonymousClass1) create(eVar)).invokeSuspend(ab.f48028a);
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[Catch: CorruptionException -> 0x0059, TryCatch #1 {CorruptionException -> 0x0059, blocks: (B:17:0x0048, B:43:0x00ba, B:20:0x0051, B:38:0x0093, B:21:0x0055, B:33:0x0074, B:35:0x007a, B:26:0x005f, B:29:0x0065, B:40:0x009f), top: B:64:0x000b }] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
            @Override // h.c.b.a.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) throws androidx.datastore.core.CorruptionException {
                /*
                    Method dump skipped, instructions count: 287
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C04232.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* compiled from: WazeSource */
            /* renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2$1$1, reason: invalid class name and collision with other inner class name */
            final class C00941 extends g implements p<Boolean, e<? super Data<T>>, Object> {
                final /* synthetic */ p<Boolean, e<? super Integer>, Object> $getVersion;
                int I$0;
                Object L$0;
                Object L$1;
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ DataStoreImpl<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00941(DataStoreImpl<T> dataStoreImpl, p<? super Boolean, ? super e<? super Integer>, ? extends Object> pVar, e<? super C00941> eVar) {
                    super(2, eVar);
                    this.this$0 = dataStoreImpl;
                    this.$getVersion = pVar;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    C00941 c00941 = new C00941(this.this$0, this.$getVersion, eVar);
                    c00941.Z$0 = ((Boolean) obj).booleanValue();
                    return c00941;
                }

                public final Object invoke(boolean z, e<? super Data<T>> eVar) {
                    return ((C00941) create(Boolean.valueOf(z), eVar)).invokeSuspend(ab.f48028a);
                }

                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    Object obj2;
                    int i2;
                    boolean z = this.Z$0;
                    h.c.a.a aVar = h.c.a.a.f48038a;
                    int i3 = this.label;
                    if (i3 == 0) {
                        e.b.c.b(obj);
                        this.Z$0 = z;
                        this.label = 1;
                        obj = this.this$0.readDataFromFileOrDefault(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i2 = this.I$0;
                            obj2 = this.L$1;
                            e.b.c.b(obj);
                            return new Data(obj2, i2, ((Number) obj).intValue());
                        }
                        e.b.c.b(obj);
                    }
                    int iHashCode = obj != null ? obj.hashCode() : 0;
                    p<Boolean, e<? super Integer>, Object> pVar = this.$getVersion;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    this.L$0 = null;
                    this.L$1 = obj;
                    this.Z$0 = z;
                    this.I$0 = iHashCode;
                    this.label = 2;
                    Object objInvoke = pVar.invoke(boolValueOf, this);
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                    Object obj3 = obj;
                    obj = objInvoke;
                    obj2 = obj3;
                    i2 = iHashCode;
                    return new Data(obj2, i2, ((Number) obj).intValue());
                }

                @Override // h.g.a.p
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
                    return invoke(bool.booleanValue(), (e) obj);
                }
            }
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass4 extends g implements p<Boolean, e<? super h.k<? extends State<T>, ? extends Boolean>>, Object> {
        final /* synthetic */ p<Boolean, e<? super Integer>, Object> $getVersion;
        Object L$0;
        Object L$1;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(DataStoreImpl<T> dataStoreImpl, p<? super Boolean, ? super e<? super Integer>, ? extends Object> pVar, e<? super AnonymousClass4> eVar) {
            super(2, eVar);
            this.this$0 = dataStoreImpl;
            this.$getVersion = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$getVersion, eVar);
            anonymousClass4.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass4;
        }

        public final Object invoke(boolean z, e<? super h.k<? extends State<T>, Boolean>> eVar) {
            return ((AnonymousClass4) create(Boolean.valueOf(z), eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            ReadException readException;
            boolean z = this.Z$0;
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            try {
            } catch (Throwable th2) {
                p<Boolean, e<? super Integer>, Object> pVar = this.$getVersion;
                Boolean boolValueOf = Boolean.valueOf(z);
                this.L$0 = null;
                this.L$1 = th2;
                this.Z$0 = z;
                this.label = 2;
                Object objInvoke = pVar.invoke(boolValueOf, this);
                if (objInvoke != aVar) {
                    th = th2;
                    obj = objInvoke;
                }
            }
            if (i2 == 0) {
                e.b.c.b(obj);
                this.Z$0 = z;
                this.label = 1;
                obj = this.this$0.readDataOrHandleCorruption(z, this.$getVersion, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.L$1;
                    e.b.c.b(obj);
                    readException = new ReadException(th, ((Number) obj).intValue());
                    return new h.k(readException, Boolean.valueOf(z));
                }
                e.b.c.b(obj);
            }
            readException = (State) obj;
            return new h.k(readException, Boolean.valueOf(z));
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return invoke(bool.booleanValue(), (e) obj);
        }
    }

    public /* synthetic */ DataStoreImpl(Storage storage, List list, ReThrowCorruptionHandler reThrowCorruptionHandler, kotlinx.coroutines.ab abVar, Tracer tracer, int i2, o oVar) {
        this(storage, (i2 & 2) != 0 ? i.h() : list, (i2 & 4) != 0 ? new ReThrowCorruptionHandler() : reThrowCorruptionHandler, (i2 & 8) != 0 ? Actual_jvmKt.ioDispatcher() : abVar, (i2 & 16) != 0 ? null : tracer);
    }
}
