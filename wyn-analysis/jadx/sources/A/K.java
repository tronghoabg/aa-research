package A;

import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class K extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f42i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC3343n f43j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(tf.l lVar, int i5) {
        super(1);
        this.f42i = i5;
        switch (i5) {
            case 1:
                this.f43j = (AbstractC3343n) lVar;
                super(1);
                break;
            default:
                this.f43j = (AbstractC3343n) lVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.n, tf.l] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.n, tf.l] */
    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f42i) {
            case 0:
                return this.f43j.invoke(Long.valueOf(((Number) obj).longValue()));
            default:
                X.g gVar = (X.g) this.f43j.invoke((X.k) obj);
                synchronized (X.m.f15718b) {
                    X.m.f15719c = X.m.f15719c.f(gVar.d());
                }
                return gVar;
        }
    }
}
