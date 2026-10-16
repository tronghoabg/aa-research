package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* loaded from: classes2.dex */
public final class fpi extends afda {
    public Object a;
    public /* synthetic */ Object b;
    final /* synthetic */ ConstraintTrackingWorker c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpi(ConstraintTrackingWorker constraintTrackingWorker, afck afckVar) {
        super(afckVar);
        this.c = constraintTrackingWorker;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.i(this);
    }
}
