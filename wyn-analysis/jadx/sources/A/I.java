package A;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class I extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f32i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f33j;
    public final /* synthetic */ L k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0221n f34l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0217j f35m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f36n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0208a f37o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(kotlin.jvm.internal.G g9, Object obj, L l10, AbstractC0221n abstractC0221n, C0217j c0217j, float f10, C0208a c0208a) {
        super(1);
        this.f32i = g9;
        this.f33j = obj;
        this.k = l10;
        this.f34l = abstractC0221n;
        this.f35m = c0217j;
        this.f36n = f10;
        this.f37o = c0208a;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        L l10 = this.k;
        S3.e eVar = l10.f45b;
        H h10 = new H(this.f35m, 0);
        C0215h c0215h = new C0215h(this.f33j, eVar, this.f34l, jLongValue, l10.f47d, jLongValue, h10);
        AbstractC0226t.g(c0215h, jLongValue, this.f36n, this.k, this.f35m, this.f37o);
        this.f32i.f39740a = c0215h;
        return C2515C.f34653a;
    }
}
