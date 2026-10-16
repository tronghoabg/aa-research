package Hf;

import ef.C2515C;
import jf.InterfaceC3103c;

/* loaded from: classes5.dex */
public final class A implements InterfaceC0602l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f5012b;

    public /* synthetic */ A(v0 v0Var, int i5) {
        this.f5011a = i5;
        this.f5012b = v0Var;
    }

    @Override // Hf.InterfaceC0602l
    public final Object collect(InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) {
        switch (this.f5011a) {
            case 0:
                Object objCollect = this.f5012b.collect(new C0615z(new kotlin.jvm.internal.E(), interfaceC0603m, 1), interfaceC3103c);
                if (objCollect != kf.a.f39711a) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f5012b.collect(new C0596f(interfaceC0603m, 1), interfaceC3103c);
                if (objCollect2 != kf.a.f39711a) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f5012b.collect(new C0596f(interfaceC0603m, 8), interfaceC3103c);
                if (objCollect3 != kf.a.f39711a) {
                    break;
                }
                break;
        }
        return C2515C.f34653a;
    }
}
