package Hf;

import ef.C2515C;
import jf.InterfaceC3103c;

/* renamed from: Hf.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0597g implements InterfaceC0593d {

    /* renamed from: a, reason: collision with root package name */
    public final C0605o f5126a;

    public C0597g(C0605o c0605o) {
        this.f5126a = c0605o;
    }

    @Override // Hf.InterfaceC0602l
    public final Object collect(InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) throws Throwable {
        Object objCollect = this.f5126a.collect(new C0596f(interfaceC0603m, 0), interfaceC3103c);
        return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
    }
}
