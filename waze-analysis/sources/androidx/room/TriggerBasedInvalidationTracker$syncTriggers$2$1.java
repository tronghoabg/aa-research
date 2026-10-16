package androidx.room;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class TriggerBasedInvalidationTracker$syncTriggers$2$1 extends g implements p<Transactor, e<? super ab>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$syncTriggers$2$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, e<? super TriggerBasedInvalidationTracker$syncTriggers$2$1> eVar) {
        super(2, eVar);
        this.this$0 = triggerBasedInvalidationTracker;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(this.this$0, eVar);
        triggerBasedInvalidationTracker$syncTriggers$2$1.L$0 = obj;
        return triggerBasedInvalidationTracker$syncTriggers$2$1;
    }

    @Override // h.g.a.p
    public final Object invoke(Transactor transactor, e<? super ab> eVar) {
        return ((TriggerBasedInvalidationTracker$syncTriggers$2$1) create(transactor, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        if (r2.withTransaction(r5, r9, r20) != r1) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
