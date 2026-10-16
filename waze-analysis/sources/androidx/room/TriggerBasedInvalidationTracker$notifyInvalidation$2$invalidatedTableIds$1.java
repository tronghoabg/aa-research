package androidx.room;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 extends g implements p<Transactor, e<? super Set<? extends Integer>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, e<? super TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1> eVar) {
        super(2, eVar);
        this.this$0 = triggerBasedInvalidationTracker;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 = new TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1(this.this$0, eVar);
        triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1.L$0 = obj;
        return triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Transactor transactor, e<? super Set<Integer>> eVar) {
        return ((TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1) create(transactor, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r7 != r0) goto L19;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            e.b.c.b(r7)     // Catch: android.database.SQLException -> L5e
            goto L5b
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L18:
            java.lang.Object r1 = r6.L$0
            androidx.room.Transactor r1 = (androidx.room.Transactor) r1
            e.b.c.b(r7)
            goto L35
        L20:
            e.b.c.b(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            androidx.room.Transactor r1 = (androidx.room.Transactor) r1
            r7 = r6
            h.c.e r7 = (h.c.e) r7
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r1.inTransaction(r7)
            if (r7 == r0) goto L63
        L35:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L42
            java.util.Set r6 = e.c.d.a.p()
            return r6
        L42:
            androidx.room.Transactor$SQLiteTransactionType r7 = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE     // Catch: android.database.SQLException -> L5e
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1 r3 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1     // Catch: android.database.SQLException -> L5e
            androidx.room.TriggerBasedInvalidationTracker r4 = r6.this$0     // Catch: android.database.SQLException -> L5e
            r5 = 0
            r3.<init>(r4, r5)     // Catch: android.database.SQLException -> L5e
            h.g.a.p r3 = (h.g.a.p) r3     // Catch: android.database.SQLException -> L5e
            r4 = r6
            h.c.e r4 = (h.c.e) r4     // Catch: android.database.SQLException -> L5e
            r6.L$0 = r5     // Catch: android.database.SQLException -> L5e
            r6.label = r2     // Catch: android.database.SQLException -> L5e
            java.lang.Object r7 = r1.withTransaction(r7, r3, r4)     // Catch: android.database.SQLException -> L5e
            if (r7 == r0) goto L63
        L5b:
            java.util.Set r7 = (java.util.Set) r7     // Catch: android.database.SQLException -> L5e
            return r7
        L5e:
            java.util.Set r6 = e.c.d.a.p()
            return r6
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<TransactionScope<Set<? extends Integer>>, e<? super Set<? extends Integer>>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TriggerBasedInvalidationTracker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.this$0 = triggerBasedInvalidationTracker;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(TransactionScope<Set<Integer>> transactionScope, e<? super Set<Integer>> eVar) {
            return ((AnonymousClass1) create(transactionScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
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
            TransactionScope transactionScope = (TransactionScope) this.L$0;
            this.label = 1;
            Object objCheckInvalidatedTables = this.this$0.checkInvalidatedTables(transactionScope, this);
            return objCheckInvalidatedTables == aVar ? aVar : objCheckInvalidatedTables;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(TransactionScope<Set<? extends Integer>> transactionScope, e<? super Set<? extends Integer>> eVar) {
            return invoke2((TransactionScope<Set<Integer>>) transactionScope, (e<? super Set<Integer>>) eVar);
        }
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(Transactor transactor, e<? super Set<? extends Integer>> eVar) {
        return invoke2(transactor, (e<? super Set<Integer>>) eVar);
    }
}
