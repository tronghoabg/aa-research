package Y3;

import Hf.C0596f;
import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import Hf.x0;
import jf.InterfaceC3103c;

/* loaded from: classes.dex */
public final class l implements InterfaceC0602l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f16649b;

    public /* synthetic */ l(x0 x0Var, int i5) {
        this.f16648a = i5;
        this.f16649b = x0Var;
    }

    @Override // Hf.InterfaceC0602l
    public final Object collect(InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) throws Throwable {
        switch (this.f16648a) {
            case 0:
                this.f16649b.collect(new C0596f(interfaceC0603m, 2), interfaceC3103c);
                break;
            case 1:
                this.f16649b.collect(new C0596f(interfaceC0603m, 3), interfaceC3103c);
                break;
            case 2:
                this.f16649b.collect(new C0596f(interfaceC0603m, 7), interfaceC3103c);
                break;
            default:
                this.f16649b.collect(new C0596f(interfaceC0603m, 9), interfaceC3103c);
                break;
        }
        return kf.a.f39711a;
    }
}
