package Hf;

import jf.InterfaceC3103c;
import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public final class e0 implements v0, InterfaceC0593d, If.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0592c0 f5122a;

    public e0(InterfaceC0592c0 interfaceC0592c0) {
        this.f5122a = interfaceC0592c0;
    }

    @Override // If.w
    public final InterfaceC0602l a(InterfaceC3108h interfaceC3108h, int i5, Gf.a aVar) {
        return (((i5 < 0 || i5 >= 2) && i5 != -2) || aVar != Gf.a.f4781b) ? k0.t(this, interfaceC3108h, i5, aVar) : this;
    }

    @Override // Hf.InterfaceC0602l
    public final Object collect(InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) throws Throwable {
        ((x0) this.f5122a).collect(interfaceC0603m, interfaceC3103c);
        return kf.a.f39711a;
    }

    @Override // Hf.v0
    public final Object getValue() {
        return ((x0) this.f5122a).getValue();
    }
}
