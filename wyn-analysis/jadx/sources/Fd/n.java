package fd;

import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import ef.C2515C;
import jf.InterfaceC3103c;
import x1.C4452e;

/* loaded from: classes5.dex */
public final class n implements InterfaceC0602l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0602l f35353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4452e f35354c;

    public /* synthetic */ n(InterfaceC0602l interfaceC0602l, C4452e c4452e, int i5) {
        this.f35352a = i5;
        this.f35353b = interfaceC0602l;
        this.f35354c = c4452e;
    }

    @Override // Hf.InterfaceC0602l
    public final Object collect(InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) {
        switch (this.f35352a) {
            case 0:
                Object objCollect = this.f35353b.collect(new m(interfaceC0603m, this.f35354c, 0), interfaceC3103c);
                if (objCollect != kf.a.f39711a) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f35353b.collect(new m(interfaceC0603m, this.f35354c, 1), interfaceC3103c);
                if (objCollect2 != kf.a.f39711a) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f35353b.collect(new m(interfaceC0603m, this.f35354c, 2), interfaceC3103c);
                if (objCollect3 != kf.a.f39711a) {
                    break;
                }
                break;
            default:
                Object objCollect4 = this.f35353b.collect(new m(interfaceC0603m, this.f35354c, 3), interfaceC3103c);
                if (objCollect4 != kf.a.f39711a) {
                    break;
                }
                break;
        }
        return C2515C.f34653a;
    }
}
