package A;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class J extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f38i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f39j;
    public final /* synthetic */ L k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0217j f40l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ tf.l f41m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(kotlin.jvm.internal.G g9, float f10, L l10, C0217j c0217j, tf.l lVar) {
        super(1);
        this.f38i = g9;
        this.f39j = f10;
        this.k = l10;
        this.f40l = c0217j;
        this.f41m = lVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Object obj2 = this.f38i.f39740a;
        AbstractC3340k.b(obj2);
        AbstractC0226t.g((C0215h) obj2, jLongValue, this.f39j, this.k, this.f40l, this.f41m);
        return C2515C.f34653a;
    }
}
