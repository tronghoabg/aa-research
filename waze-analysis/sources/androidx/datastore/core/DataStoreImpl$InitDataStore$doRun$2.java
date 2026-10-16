package androidx.datastore.core;

import androidx.tracing.PropagationToken;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class DataStoreImpl$InitDataStore$doRun$2<T> extends g implements p<af, e<? super State<T>>, Object> {
    final /* synthetic */ PropagationToken $readAndInitToken;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;
    final /* synthetic */ DataStoreImpl<T>.InitDataStore this$1;

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$2$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements l<e<? super State<T>>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T>.InitDataStore this$0;
        final /* synthetic */ DataStoreImpl<T> this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DataStoreImpl<T>.InitDataStore initDataStore, DataStoreImpl<T> dataStoreImpl, e<? super AnonymousClass1> eVar) {
            super(1, eVar);
            this.this$0 = initDataStore;
            this.this$1 = dataStoreImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass1(this.this$0, this.this$1, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super State<T>> eVar) {
            return ((AnonymousClass1) create(eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
        
            if (r8 != r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
        
            if (r8 != r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
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
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r7.L$0
                h.g.a.p r0 = (h.g.a.p) r0
                e.b.c.b(r8)
                goto L65
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1c:
                java.lang.Object r0 = r7.L$0
                h.g.a.p r0 = (h.g.a.p) r0
                e.b.c.b(r8)
                goto L78
            L24:
                e.b.c.b(r8)
                androidx.datastore.core.DataStoreImpl<T> r8 = r7.this$1
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$2$1$getVersion$1 r1 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$2$1$getVersion$1
                r4 = 0
                r1.<init>(r8, r4)
                h.g.a.p r1 = (h.g.a.p) r1
                androidx.datastore.core.DataStoreImpl<T>$InitDataStore r8 = r7.this$0
                java.util.List r8 = androidx.datastore.core.DataStoreImpl.InitDataStore.access$getInitTasks$p(r8)
                if (r8 == 0) goto L68
                androidx.datastore.core.DataStoreImpl<T>$InitDataStore r8 = r7.this$0
                java.util.List r8 = androidx.datastore.core.DataStoreImpl.InitDataStore.access$getInitTasks$p(r8)
                h.g.b.x.c(r8)
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L49
                goto L68
            L49:
                androidx.datastore.core.DataStoreImpl<T> r8 = r7.this$1
                androidx.datastore.core.DataStoreImpl<T>$InitDataStore r3 = r7.this$0
                androidx.datastore.core.InterProcessCoordinator r5 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r8)
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$2$1$initData$1 r6 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$2$1$initData$1
                r6.<init>(r8, r1, r3, r4)
                h.g.a.l r6 = (h.g.a.l) r6
                r8 = r7
                h.c.e r8 = (h.c.e) r8
                r7.L$0 = r4
                r7.label = r2
                java.lang.Object r8 = r5.lock(r6, r8)
                if (r8 == r0) goto L87
            L65:
                androidx.datastore.core.Data r8 = (androidx.datastore.core.Data) r8
                goto L7a
            L68:
                androidx.datastore.core.DataStoreImpl<T> r8 = r7.this$1
                r2 = r7
                h.c.e r2 = (h.c.e) r2
                r7.L$0 = r4
                r7.label = r3
                r3 = 0
                java.lang.Object r8 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r8, r3, r1, r2)
                if (r8 == r0) goto L87
            L78:
                androidx.datastore.core.Data r8 = (androidx.datastore.core.Data) r8
            L7a:
                androidx.datastore.core.DataStoreImpl<T> r7 = r7.this$1
                androidx.datastore.core.DataStoreInMemoryCache r7 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r7)
                androidx.datastore.core.State r8 = (androidx.datastore.core.State) r8
                androidx.datastore.core.State r7 = r7.tryUpdate(r8)
                return r7
            L87:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$InitDataStore$doRun$2(DataStoreImpl<T> dataStoreImpl, PropagationToken propagationToken, DataStoreImpl<T>.InitDataStore initDataStore, e<? super DataStoreImpl$InitDataStore$doRun$2> eVar) {
        super(2, eVar);
        this.this$0 = dataStoreImpl;
        this.$readAndInitToken = propagationToken;
        this.this$1 = initDataStore;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DataStoreImpl$InitDataStore$doRun$2(this.this$0, this.$readAndInitToken, this.this$1, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super State<T>> eVar) {
        return ((DataStoreImpl$InitDataStore$doRun$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Exception {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return obj;
        }
        c.b(obj);
        DataStoreImpl<T> dataStoreImpl = this.this$0;
        PropagationToken propagationToken = this.$readAndInitToken;
        DataStoreImpl<T>.InitDataStore initDataStore = this.this$1;
        this.label = 1;
        Object objTrace = DataStoreTracer_androidKt.trace(((DataStoreImpl) dataStoreImpl).tracer, "DataStore.InitDataStore.doRun", propagationToken, new AnonymousClass1(initDataStore, dataStoreImpl, null), this);
        return objTrace == aVar ? aVar : objTrace;
    }
}
