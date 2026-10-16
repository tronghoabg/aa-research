package Hf;

import If.AbstractC0622c;
import ef.C2515C;
import jf.InterfaceC3103c;

/* renamed from: Hf.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0601k implements InterfaceC0602l {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0602l f5153a;

    public C0601k(InterfaceC0602l interfaceC0602l) {
        this.f5153a = interfaceC0602l;
    }

    @Override // Hf.InterfaceC0602l
    public final Object collect(InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) {
        kotlin.jvm.internal.G g9 = new kotlin.jvm.internal.G();
        g9.f39740a = AbstractC0622c.f5464b;
        Object objCollect = this.f5153a.collect(new C0600j(this, g9, interfaceC0603m, 0), interfaceC3103c);
        return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
    }
}
