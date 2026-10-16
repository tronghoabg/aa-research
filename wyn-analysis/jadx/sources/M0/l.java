package M0;

import N.C0740o;
import a.AbstractC1304a;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;
import tf.p;

/* loaded from: classes.dex */
public final class l extends AbstractC3343n implements p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tf.l f7276i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z.k f7277j;
    public final /* synthetic */ m k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7278l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f7279m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(tf.l lVar, Z.k kVar, m mVar, int i5, int i10) {
        super(2);
        this.f7276i = lVar;
        this.f7277j = kVar;
        this.k = mVar;
        this.f7278l = i5;
        this.f7279m = i10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i5 = this.f7278l | 1;
        tf.l lVar = this.f7276i;
        AbstractC1304a.c(lVar, this.f7277j, this.k, (C0740o) obj, i5, this.f7279m);
        return C2515C.f34653a;
    }
}
