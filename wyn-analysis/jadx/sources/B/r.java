package B;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.KProperty;
import x0.AbstractC4436f;
import x0.AbstractC4444n;
import x0.AbstractC4446p;
import x0.C4431a;
import x0.C4435e;
import x0.C4437g;

/* loaded from: classes.dex */
public final class r extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1465i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1466j;
    public final /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1467l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1468m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C4435e c4435e, String str, boolean z2, tf.a aVar) {
        super(1);
        this.k = c4435e;
        this.f1467l = str;
        this.f1466j = z2;
        this.f1468m = aVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        Object obj2 = this.k;
        Object obj3 = this.f1468m;
        Object obj4 = this.f1467l;
        boolean z2 = this.f1466j;
        switch (this.f1465i) {
            case 0:
                C4437g semantics = (C4437g) obj;
                AbstractC3340k.e(semantics, "$this$semantics");
                C4435e c4435e = (C4435e) obj2;
                if (c4435e != null) {
                    AbstractC4446p.b(semantics, c4435e.f47578a);
                }
                A0.p pVar = new A0.p((tf.a) obj3, 2);
                KProperty[] kPropertyArr = AbstractC4446p.f47639a;
                semantics.d(AbstractC4436f.f47580b, new C4431a((String) obj4, pVar));
                C2515C c2515c = C2515C.f34653a;
                if (!z2) {
                    semantics.d(AbstractC4444n.f47624i, c2515c);
                }
                return c2515c;
            default:
                N.C DisposableEffect = (N.C) obj;
                AbstractC3340k.e(DisposableEffect, "$this$DisposableEffect");
                if (!z2) {
                    Kd.a aVar = (Kd.a) obj2;
                    Ef.H.D(aVar, null, new C0332x((D.i) obj3, (N.V) obj4, null), 3);
                }
                return new y();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z2, Kd.a aVar, N.V v2, D.i iVar) {
        super(1);
        this.f1466j = z2;
        this.k = aVar;
        this.f1467l = v2;
        this.f1468m = iVar;
    }
}
