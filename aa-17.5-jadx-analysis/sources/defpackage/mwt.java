package defpackage;

import android.view.VelocityTracker;

/* loaded from: classes2.dex */
final class mwt extends afda {
    float a;
    /* synthetic */ Object b;
    final /* synthetic */ mwu c;
    int d;
    VelocityTracker e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwt(mwu mwuVar, afck afckVar) {
        super(afckVar);
        this.c = mwuVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}
