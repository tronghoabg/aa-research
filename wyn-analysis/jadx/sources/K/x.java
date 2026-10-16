package K;

import A.Z;
import N.C0740o;
import a.AbstractC1304a;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;
import r0.InterfaceC3903h;

/* loaded from: classes.dex */
public final class x extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6302i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6303j;
    public final /* synthetic */ int k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6304l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6305m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f6306n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f6307o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, Object obj2, Object obj3, Object obj4, int i5, int i10, int i11) {
        super(2);
        this.f6302i = i11;
        this.f6304l = obj;
        this.f6305m = obj2;
        this.f6306n = obj3;
        this.f6307o = obj4;
        this.f6303j = i5;
        this.k = i10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6302i) {
            case 0:
                ((Number) obj2).intValue();
                int i5 = this.f6303j | 1;
                V.d dVar = (V.d) this.f6307o;
                L l10 = (L) this.f6305m;
                Fe.c.c((C0680e) this.f6304l, l10, (z) this.f6306n, dVar, (C0740o) obj, i5, this.k);
                break;
            case 1:
                ((Number) obj2).intValue();
                int i10 = this.f6303j | 1;
                h4.h hVar = (h4.h) this.f6304l;
                X3.k kVar = (X3.k) this.f6305m;
                InterfaceC3903h interfaceC3903h = (InterfaceC3903h) this.f6307o;
                AbstractC1304a.d(hVar, kVar, (Z.k) this.f6306n, interfaceC3903h, (C0740o) obj, i10, this.k);
                break;
            default:
                ((Number) obj2).intValue();
                int i11 = this.f6303j | 1;
                V.d dVar2 = (V.d) this.f6307o;
                Z.k kVar2 = (Z.k) this.f6305m;
                Fe.g.c(this.f6304l, kVar2, (Z) this.f6306n, dVar2, (C0740o) obj, i11, this.k);
                break;
        }
        return C2515C.f34653a;
    }
}
