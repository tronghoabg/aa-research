package t0;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import r0.InterfaceC3909n;
import u0.InterfaceC4193p0;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4053a extends AbstractC3343n implements tf.p {

    /* renamed from: j, reason: collision with root package name */
    public static final C4053a f45447j = new C4053a(2, 0);
    public static final C4053a k = new C4053a(2, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C4053a f45448l = new C4053a(2, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C4053a f45449m = new C4053a(2, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final C4053a f45450n = new C4053a(2, 4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f45451i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4053a(int i5, int i10) {
        super(i5);
        this.f45451i = i10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f45451i) {
            case 0:
                InterfaceC4055c interfaceC4055c = (InterfaceC4055c) obj;
                L0.b it = (L0.b) obj2;
                AbstractC3340k.e(interfaceC4055c, "$this$null");
                AbstractC3340k.e(it, "it");
                ((t) interfaceC4055c).B(it);
                break;
            case 1:
                InterfaceC4055c interfaceC4055c2 = (InterfaceC4055c) obj;
                L0.i it2 = (L0.i) obj2;
                AbstractC3340k.e(interfaceC4055c2, "$this$null");
                AbstractC3340k.e(it2, "it");
                t tVar = (t) interfaceC4055c2;
                if (tVar.f45525p != it2) {
                    tVar.f45525p = it2;
                    tVar.z(false);
                    t tVarJ = tVar.j();
                    if (tVarJ != null) {
                        tVarJ.o();
                    }
                    tVar.p();
                }
                break;
            case 2:
                InterfaceC4055c interfaceC4055c3 = (InterfaceC4055c) obj;
                InterfaceC3909n it3 = (InterfaceC3909n) obj2;
                AbstractC3340k.e(interfaceC4055c3, "$this$null");
                AbstractC3340k.e(it3, "it");
                ((t) interfaceC4055c3).C(it3);
                break;
            case 3:
                InterfaceC4055c interfaceC4055c4 = (InterfaceC4055c) obj;
                Z.k it4 = (Z.k) obj2;
                AbstractC3340k.e(interfaceC4055c4, "$this$null");
                AbstractC3340k.e(it4, "it");
                ((t) interfaceC4055c4).D(it4);
                break;
            default:
                InterfaceC4055c interfaceC4055c5 = (InterfaceC4055c) obj;
                InterfaceC4193p0 it5 = (InterfaceC4193p0) obj2;
                AbstractC3340k.e(interfaceC4055c5, "$this$null");
                AbstractC3340k.e(it5, "it");
                ((t) interfaceC4055c5).f45526q = it5;
                break;
        }
        return C2515C.f34653a;
    }
}
