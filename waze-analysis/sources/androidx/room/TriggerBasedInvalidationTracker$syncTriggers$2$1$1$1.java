package androidx.room;

import androidx.room.ObservedTableStates;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1 extends g implements p<TransactionScope<ab>, e<? super ab>, Object> {
    final /* synthetic */ Transactor $connection;
    final /* synthetic */ ObservedTableStates.ObserveOp[] $tablesToSync;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ObservedTableStates.ObserveOp.values().length];
            try {
                iArr[ObservedTableStates.ObserveOp.NO_OP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ObservedTableStates.ObserveOp.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ObservedTableStates.ObserveOp.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(ObservedTableStates.ObserveOp[] observeOpArr, TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Transactor transactor, e<? super TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1> eVar) {
        super(2, eVar);
        this.$tablesToSync = observeOpArr;
        this.this$0 = triggerBasedInvalidationTracker;
        this.$connection = transactor;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(this.$tablesToSync, this.this$0, this.$connection, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(TransactionScope<ab> transactionScope, e<? super ab> eVar) {
        return ((TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1) create(transactionScope, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r7.stopTrackingTable(r12, r6, r11) != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r7.startTrackingTable(r12, r6, r11) != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008e -> B:27:0x008f). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            int r1 = r11.I$2
            int r4 = r11.I$1
            int r5 = r11.I$0
            java.lang.Object r6 = r11.L$2
            goto L25
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L1d:
            int r1 = r11.I$2
            int r4 = r11.I$1
            int r5 = r11.I$0
            java.lang.Object r6 = r11.L$2
        L25:
            androidx.room.Transactor r6 = (androidx.room.Transactor) r6
            java.lang.Object r7 = r11.L$1
            androidx.room.TriggerBasedInvalidationTracker r7 = (androidx.room.TriggerBasedInvalidationTracker) r7
            java.lang.Object r8 = r11.L$0
            androidx.room.ObservedTableStates$ObserveOp[] r8 = (androidx.room.ObservedTableStates.ObserveOp[]) r8
            e.b.c.b(r12)
            r12 = r6
            r6 = r5
            goto L8f
        L35:
            e.b.c.b(r12)
            androidx.room.ObservedTableStates$ObserveOp[] r12 = r11.$tablesToSync
            androidx.room.TriggerBasedInvalidationTracker r1 = r11.this$0
            androidx.room.Transactor r4 = r11.$connection
            int r5 = r12.length
            r6 = 0
            r8 = r12
            r7 = r1
            r12 = r4
            r1 = r5
            r4 = r6
        L45:
            if (r4 >= r1) goto L91
            r5 = r8[r4]
            int r9 = r6 + 1
            androidx.room.ObservedTableStates$ObserveOp r10 = androidx.room.ObservedTableStates.ObserveOp.NO_OP
            int r5 = r5.ordinal()
            if (r5 == 0) goto L8e
            if (r5 == r3) goto L75
            if (r5 != r2) goto L6f
            r5 = r12
            androidx.room.PooledConnection r5 = (androidx.room.PooledConnection) r5
            r11.L$0 = r8
            r11.L$1 = r7
            r11.L$2 = r12
            r11.I$0 = r9
            r11.I$1 = r4
            r11.I$2 = r1
            r11.label = r2
            java.lang.Object r5 = androidx.room.TriggerBasedInvalidationTracker.access$stopTrackingTable(r7, r5, r6, r11)
            if (r5 == r0) goto L8d
            goto L8e
        L6f:
            h.i r11 = new h.i
            r11.<init>()
            throw r11
        L75:
            r5 = r12
            androidx.room.PooledConnection r5 = (androidx.room.PooledConnection) r5
            r11.L$0 = r8
            r11.L$1 = r7
            r11.L$2 = r12
            r11.I$0 = r9
            r11.I$1 = r4
            r11.I$2 = r1
            r11.label = r3
            java.lang.Object r5 = androidx.room.TriggerBasedInvalidationTracker.access$startTrackingTable(r7, r5, r6, r11)
            if (r5 == r0) goto L8d
            goto L8e
        L8d:
            return r0
        L8e:
            r6 = r9
        L8f:
            int r4 = r4 + r3
            goto L45
        L91:
            h.ab r11 = h.ab.f48028a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
