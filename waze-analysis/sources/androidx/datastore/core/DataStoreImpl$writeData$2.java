package androidx.datastore.core;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.ao;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DataStoreImpl$writeData$2<T> extends g implements p<WriteScope<T>, e<? super ab>, Object> {
    final /* synthetic */ T $newData;
    final /* synthetic */ ao $newVersion;
    final /* synthetic */ boolean $updateCache;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$writeData$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends g implements l<e<? super ab>, Object> {
        final /* synthetic */ WriteScope<T> $$this$writeScope;
        final /* synthetic */ T $newData;
        final /* synthetic */ ao $newVersion;
        final /* synthetic */ boolean $updateCache;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ao aoVar, DataStoreImpl<T> dataStoreImpl, WriteScope<T> writeScope, T t, boolean z, e<? super AnonymousClass1> eVar) {
            super(1, eVar);
            this.$newVersion = aoVar;
            this.this$0 = dataStoreImpl;
            this.$$this$writeScope = writeScope;
            this.$newData = t;
            this.$updateCache = z;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass1(this.$newVersion, this.this$0, this.$$this$writeScope, this.$newData, this.$updateCache, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super ab> eVar) {
            return ((AnonymousClass1) create(eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
        
            if (r5.$$this$writeScope.writeData(r5.$newData, r5) == r0) goto L24;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                e.b.c.b(r6)
                goto L53
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L18:
                java.lang.Object r1 = r5.L$0
                h.g.b.ao r1 = (h.g.b.ao) r1
                e.b.c.b(r6)
                goto L38
            L20:
                e.b.c.b(r6)
                h.g.b.ao r1 = r5.$newVersion
                androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0
                androidx.datastore.core.InterProcessCoordinator r6 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r6)
                r4 = r5
                h.c.e r4 = (h.c.e) r4
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r6.incrementAndGetVersion(r4)
                if (r6 == r0) goto L78
            L38:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                r1.f48103a = r6
                androidx.datastore.core.WriteScope<T> r6 = r5.$$this$writeScope
                T r1 = r5.$newData
                r3 = r5
                h.c.e r3 = (h.c.e) r3
                r4 = 0
                r5.L$0 = r4
                r5.label = r2
                java.lang.Object r6 = r6.writeData(r1, r3)
                if (r6 != r0) goto L53
                goto L78
            L53:
                boolean r6 = r5.$updateCache
                if (r6 == 0) goto L75
                androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0
                T r0 = r5.$newData
                androidx.datastore.core.DataStoreInMemoryCache r6 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r6)
                androidx.datastore.core.Data r1 = new androidx.datastore.core.Data
                if (r0 == 0) goto L68
                int r2 = r0.hashCode()
                goto L69
            L68:
                r2 = 0
            L69:
                h.g.b.ao r5 = r5.$newVersion
                int r5 = r5.f48103a
                r1.<init>(r0, r2, r5)
                androidx.datastore.core.State r1 = (androidx.datastore.core.State) r1
                r6.tryUpdate(r1)
            L75:
                h.ab r5 = h.ab.f48028a
                return r5
            L78:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$writeData$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$writeData$2(DataStoreImpl<T> dataStoreImpl, ao aoVar, T t, boolean z, e<? super DataStoreImpl$writeData$2> eVar) {
        super(2, eVar);
        this.this$0 = dataStoreImpl;
        this.$newVersion = aoVar;
        this.$newData = t;
        this.$updateCache = z;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(this.this$0, this.$newVersion, this.$newData, this.$updateCache, eVar);
        dataStoreImpl$writeData$2.L$0 = obj;
        return dataStoreImpl$writeData$2;
    }

    @Override // h.g.a.p
    public final Object invoke(WriteScope<T> writeScope, e<? super ab> eVar) {
        return ((DataStoreImpl$writeData$2) create(writeScope, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        WriteScope writeScope = (WriteScope) this.L$0;
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            ao aoVar = this.$newVersion;
            T t = this.$newData;
            boolean z = this.$updateCache;
            this.L$0 = null;
            this.label = 1;
            if (DataStoreTracer_androidKt.trace$default(((DataStoreImpl) dataStoreImpl).tracer, "DataStore.writeData", null, new AnonymousClass1(aoVar, dataStoreImpl, writeScope, t, z, null), this, 4, null) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        return ab.f48028a;
    }
}
