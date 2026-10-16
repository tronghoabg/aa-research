package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* loaded from: classes2.dex */
public final class fpg extends afda {
    public /* synthetic */ Object a;
    final /* synthetic */ ConstraintTrackingWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpg(ConstraintTrackingWorker constraintTrackingWorker, afck afckVar) {
        super(afckVar);
        this.b = constraintTrackingWorker;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(null, null, null, this);
    }
}
