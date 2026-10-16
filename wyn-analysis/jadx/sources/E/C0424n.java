package E;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import r0.InterfaceC3908m;
import t0.C4070r;

/* renamed from: E.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424n extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r0.t f2756i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3908m f2757j;
    public final /* synthetic */ C4070r k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2758l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2759m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z.d f2760n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0424n(r0.t tVar, InterfaceC3908m interfaceC3908m, C4070r c4070r, int i5, int i10, Z.d dVar) {
        super(1);
        this.f2756i = tVar;
        this.f2757j = interfaceC3908m;
        this.k = c4070r;
        this.f2758l = i5;
        this.f2759m = i10;
        this.f2760n = dVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        r0.s layout = (r0.s) obj;
        AbstractC3340k.e(layout, "$this$layout");
        L0.i iVar = this.k.f45488a.f45525p;
        AbstractC0426p.b(layout, this.f2756i, this.f2757j, iVar, this.f2758l, this.f2759m, this.f2760n);
        return C2515C.f34653a;
    }
}
