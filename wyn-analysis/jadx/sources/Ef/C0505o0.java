package Ef;

import ef.C2515C;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Ef.o0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0505o0 extends z0 implements InterfaceC0515v {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3758c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0505o0(InterfaceC0501m0 interfaceC0501m0) {
        super(true);
        boolean z2 = true;
        G(interfaceC0501m0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z0.f3794b;
        InterfaceC0508q interfaceC0508q = (InterfaceC0508q) atomicReferenceFieldUpdater.get(this);
        r rVar = interfaceC0508q instanceof r ? (r) interfaceC0508q : null;
        if (rVar == null) {
            z2 = false;
            break;
        }
        z0 z0VarH = rVar.h();
        while (!z0VarH.A()) {
            InterfaceC0508q interfaceC0508q2 = (InterfaceC0508q) atomicReferenceFieldUpdater.get(z0VarH);
            r rVar2 = interfaceC0508q2 instanceof r ? (r) interfaceC0508q2 : null;
            if (rVar2 == null) {
                z2 = false;
                break;
            }
            z0VarH = rVar2.h();
        }
        this.f3758c = z2;
    }

    @Override // Ef.z0
    public final boolean A() {
        return this.f3758c;
    }

    @Override // Ef.z0
    public final boolean C() {
        return true;
    }

    public final boolean Y() {
        return K(C2515C.f34653a);
    }
}
