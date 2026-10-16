package androidx.room;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.aq;
import java.util.Set;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class TriggerBasedInvalidationTracker$createFlow$1 extends g implements p<l<? super Set<? extends String>>, e<? super ab>, Object> {
    final /* synthetic */ boolean $emitInitialState;
    final /* synthetic */ String[] $resolvedTableNames;
    final /* synthetic */ int[] $tableIds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;
        final /* synthetic */ TriggerBasedInvalidationTracker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.this$0 = triggerBasedInvalidationTracker;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (this.this$0.syncTriggers$room_runtime(this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$createFlow$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, int[] iArr, boolean z, String[] strArr, e<? super TriggerBasedInvalidationTracker$createFlow$1> eVar) {
        super(2, eVar);
        this.this$0 = triggerBasedInvalidationTracker;
        this.$tableIds = iArr;
        this.$emitInitialState = z;
        this.$resolvedTableNames = strArr;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        TriggerBasedInvalidationTracker$createFlow$1 triggerBasedInvalidationTracker$createFlow$1 = new TriggerBasedInvalidationTracker$createFlow$1(this.this$0, this.$tableIds, this.$emitInitialState, this.$resolvedTableNames, eVar);
        triggerBasedInvalidationTracker$createFlow$1.L$0 = obj;
        return triggerBasedInvalidationTracker$createFlow$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(l<? super Set<String>> lVar, e<? super ab> eVar) {
        return ((TriggerBasedInvalidationTracker$createFlow$1) create(lVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r10.this$0.observedTableVersions.collect(new androidx.room.TriggerBasedInvalidationTracker$createFlow$1.AnonymousClass2(r5, r10.$emitInitialState, r7, r10.$resolvedTableNames, r10.$tableIds), r10) != r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[PHI: r1
  0x0073: PHI (r1v4 kotlinx.coroutines.b.l) = (r1v2 kotlinx.coroutines.b.l), (r1v3 kotlinx.coroutines.b.l), (r1v10 kotlinx.coroutines.b.l) binds: [B:16:0x0045, B:20:0x0071, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r10.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L31
            if (r1 == r5) goto L29
            if (r1 == r4) goto L21
            if (r1 == r3) goto L18
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L18:
            e.b.c.b(r11)     // Catch: java.lang.Throwable -> L1d
            goto L9a
        L1d:
            r0 = move-exception
            r11 = r0
            goto La0
        L21:
            java.lang.Object r1 = r10.L$0
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            e.b.c.b(r11)
            goto L73
        L29:
            java.lang.Object r1 = r10.L$0
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            e.b.c.b(r11)
            goto L5b
        L31:
            e.b.c.b(r11)
            java.lang.Object r11 = r10.L$0
            r1 = r11
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            androidx.room.TriggerBasedInvalidationTracker r11 = r10.this$0
            int[] r6 = r10.$tableIds
            androidx.room.ObservedTableStates r11 = androidx.room.TriggerBasedInvalidationTracker.access$getObservedTableStates$p(r11)
            boolean r11 = r11.onObserverAdded$room_runtime(r6)
            if (r11 == 0) goto L73
            androidx.room.TriggerBasedInvalidationTracker r11 = r10.this$0
            androidx.room.RoomDatabase r11 = androidx.room.TriggerBasedInvalidationTracker.access$getDatabase$p(r11)
            r6 = r10
            h.c.e r6 = (h.c.e) r6
            r10.L$0 = r1
            r10.label = r5
            r5 = 0
            java.lang.Object r11 = androidx.room.util.DBUtil.getCoroutineContext(r11, r5, r6)
            if (r11 == r0) goto L99
        L5b:
            androidx.room.TriggerBasedInvalidationTracker r5 = r10.this$0
            h.c.j r11 = (h.c.j) r11
            androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1 r6 = new androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1
            r6.<init>(r5, r2)
            h.g.a.p r6 = (h.g.a.p) r6
            r5 = r10
            h.c.e r5 = (h.c.e) r5
            r10.L$0 = r1
            r10.label = r4
            java.lang.Object r11 = kotlinx.coroutines.aj.v(r11, r6, r5)
            if (r11 == r0) goto L99
        L73:
            r7 = r1
            h.g.b.aq r5 = new h.g.b.aq     // Catch: java.lang.Throwable -> L1d
            r5.<init>()     // Catch: java.lang.Throwable -> L1d
            androidx.room.TriggerBasedInvalidationTracker r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
            androidx.room.ObservedTableVersions r11 = androidx.room.TriggerBasedInvalidationTracker.access$getObservedTableVersions$p(r11)     // Catch: java.lang.Throwable -> L1d
            androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2 r4 = new androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2     // Catch: java.lang.Throwable -> L1d
            boolean r6 = r10.$emitInitialState     // Catch: java.lang.Throwable -> L1d
            java.lang.String[] r8 = r10.$resolvedTableNames     // Catch: java.lang.Throwable -> L1d
            int[] r9 = r10.$tableIds     // Catch: java.lang.Throwable -> L1d
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1d
            kotlinx.coroutines.b.l r4 = (kotlinx.coroutines.b.l) r4     // Catch: java.lang.Throwable -> L1d
            r1 = r10
            h.c.e r1 = (h.c.e) r1     // Catch: java.lang.Throwable -> L1d
            r10.L$0 = r2     // Catch: java.lang.Throwable -> L1d
            r10.label = r3     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r11 = r11.collect(r4, r1)     // Catch: java.lang.Throwable -> L1d
            if (r11 != r0) goto L9a
        L99:
            return r0
        L9a:
            h.e r11 = new h.e     // Catch: java.lang.Throwable -> L1d
            r11.<init>()     // Catch: java.lang.Throwable -> L1d
            throw r11     // Catch: java.lang.Throwable -> L1d
        La0:
            androidx.room.TriggerBasedInvalidationTracker r0 = r10.this$0
            int[] r10 = r10.$tableIds
            androidx.room.ObservedTableStates r0 = androidx.room.TriggerBasedInvalidationTracker.access$getObservedTableStates$p(r0)
            r0.onObserverRemoved$room_runtime(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$createFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(l<? super Set<? extends String>> lVar, e<? super ab> eVar) {
        return invoke2((l<? super Set<String>>) lVar, eVar);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2, reason: invalid class name */
    final class AnonymousClass2<T> implements l {
        final /* synthetic */ l<Set<String>> $$this$flow;
        final /* synthetic */ aq<int[]> $currentVersions;
        final /* synthetic */ boolean $emitInitialState;
        final /* synthetic */ String[] $resolvedTableNames;
        final /* synthetic */ int[] $tableIds;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(aq<int[]> aqVar, boolean z, l<? super Set<String>> lVar, String[] strArr, int[] iArr) {
            this.$currentVersions = aqVar;
            this.$emitInitialState = z;
            this.$$this$flow = lVar;
            this.$resolvedTableNames = strArr;
            this.$tableIds = iArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        
            if (r14.emit(r2, r0) == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
        
            if (r14.emit(r2, r0) == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
        
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(int[] r13, h.c.e<? super h.ab> r14) {
            /*
                r12 = this;
                boolean r0 = r14 instanceof androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1
                if (r0 == 0) goto L13
                r0 = r14
                androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1
                r0.<init>(r12, r14)
            L18:
                java.lang.Object r14 = r0.result
                h.c.a.a r1 = h.c.a.a.f48038a
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L2f
                if (r2 != r3) goto L27
                goto L2f
            L27:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L2f:
                java.lang.Object r13 = r0.L$0
                int[] r13 = (int[]) r13
                e.b.c.b(r14)
                goto La7
            L38:
                e.b.c.b(r14)
                h.g.b.aq<int[]> r14 = r12.$currentVersions
                java.lang.Object r2 = r14.f48105a
                if (r2 != 0) goto L58
                boolean r14 = r12.$emitInitialState
                if (r14 == 0) goto La7
                kotlinx.coroutines.b.l<java.util.Set<java.lang.String>> r14 = r12.$$this$flow
                java.lang.String[] r2 = r12.$resolvedTableNames
                java.util.Set r2 = h.a.c.ad(r2)
                r0.L$0 = r13
                r0.label = r4
                java.lang.Object r14 = r14.emit(r2, r0)
                if (r14 != r1) goto La7
                goto La6
            L58:
                java.lang.String[] r2 = r12.$resolvedTableNames
                int[] r4 = r12.$tableIds
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Collection r5 = (java.util.Collection) r5
                int r6 = r2.length
                r7 = 0
                r8 = r7
            L66:
                if (r7 >= r6) goto L89
                r9 = r2[r7]
                int r10 = r8 + 1
                java.lang.Object r11 = r14.f48105a
                if (r11 == 0) goto L81
                int[] r11 = (int[]) r11
                r8 = r4[r8]
                r11 = r11[r8]
                r8 = r13[r8]
                if (r11 == r8) goto L7d
                r5.add(r9)
            L7d:
                int r7 = r7 + 1
                r8 = r10
                goto L66
            L81:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "Required value was null."
                r12.<init>(r13)
                throw r12
            L89:
                java.util.List r5 = (java.util.List) r5
                r14 = r5
                java.util.Collection r14 = (java.util.Collection) r14
                boolean r14 = r14.isEmpty()
                if (r14 != 0) goto La7
                kotlinx.coroutines.b.l<java.util.Set<java.lang.String>> r14 = r12.$$this$flow
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Set r2 = h.a.i.au(r5)
                r0.L$0 = r13
                r0.label = r3
                java.lang.Object r14 = r14.emit(r2, r0)
                if (r14 != r1) goto La7
            La6:
                return r1
            La7:
                h.g.b.aq<int[]> r12 = r12.$currentVersions
                r12.f48105a = r13
                h.ab r12 = h.ab.f48028a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$createFlow$1.AnonymousClass2.emit(int[], h.c.e):java.lang.Object");
        }

        @Override // kotlinx.coroutines.b.l
        public /* bridge */ /* synthetic */ Object emit(Object obj, e eVar) {
            return emit((int[]) obj, (e<? super ab>) eVar);
        }
    }
}
