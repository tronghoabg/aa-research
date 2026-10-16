package B;

import E.AbstractC0426p;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import r0.InterfaceC3908m;
import t0.C4070r;

/* loaded from: classes.dex */
public final class D extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1359i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1360j;
    public final /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1361l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1362m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1363n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1364o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Kd.a aVar, N.V v2, G.e eVar, N.V v10, N.V v11, D.i iVar) {
        super(1);
        this.f1360j = aVar;
        this.k = v2;
        this.f1363n = eVar;
        this.f1361l = v10;
        this.f1362m = v11;
        this.f1364o = iVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        C2515C c2515c = C2515C.f34653a;
        Object obj2 = this.f1364o;
        Object obj3 = this.f1363n;
        Object obj4 = this.f1362m;
        Object obj5 = this.f1361l;
        Object obj6 = this.k;
        Object obj7 = this.f1360j;
        boolean z2 = true;
        switch (this.f1359i) {
            case 0:
                c0.r it = (c0.r) obj;
                AbstractC3340k.e(it, "it");
                N.V v2 = (N.V) obj6;
                v2.setValue(Boolean.valueOf(it.b()));
                Kd.a aVar = (Kd.a) obj7;
                D.i iVar = (D.i) obj2;
                N.V v10 = (N.V) obj4;
                if (((Boolean) v2.getValue()).booleanValue()) {
                    Ef.F f10 = Ef.F.f3663a;
                    Ef.H.D(aVar, null, new A((G.e) obj3, (N.V) obj5, null), 1);
                    Ef.H.D(aVar, null, new B(iVar, v10, null), 3);
                } else {
                    Ef.H.D(aVar, null, new C(iVar, v10, null), 3);
                }
                return c2515c;
            default:
                r0.s layout = (r0.s) obj;
                AbstractC3340k.e(layout, "$this$layout");
                r0.t[] tVarArr = (r0.t[]) obj7;
                int length = tVarArr.length;
                int i5 = 0;
                int i10 = 0;
                while (i5 < length) {
                    int i11 = i5;
                    r0.t tVar = tVarArr[i11];
                    int i12 = i10 + 1;
                    if (tVar == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    }
                    AbstractC0426p.b(layout, tVar, (InterfaceC3908m) ((P.a) obj6).get(i10), ((C4070r) obj5).f45488a.f45525p, ((kotlin.jvm.internal.E) obj4).f39738a, ((kotlin.jvm.internal.E) obj3).f39738a, (Z.d) obj2);
                    i5 = i11 + 1;
                    i10 = i12;
                    z2 = z2;
                }
                return c2515c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(r0.t[] tVarArr, P.a aVar, C4070r c4070r, kotlin.jvm.internal.E e7, kotlin.jvm.internal.E e10, Z.d dVar) {
        super(1);
        this.f1360j = tVarArr;
        this.k = aVar;
        this.f1361l = c4070r;
        this.f1362m = e7;
        this.f1363n = e10;
        this.f1364o = dVar;
    }
}
