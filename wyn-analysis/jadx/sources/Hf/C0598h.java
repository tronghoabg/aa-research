package Hf;

import ef.C2515C;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import lf.AbstractC3471j;

/* renamed from: Hf.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0598h extends If.g {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC3471j f5127d;

    /* JADX WARN: Multi-variable type inference failed */
    public C0598h(tf.p pVar, InterfaceC3108h interfaceC3108h, int i5, Gf.a aVar) {
        super(interfaceC3108h, i5, aVar);
        this.f5127d = (AbstractC3471j) pVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lf.j, tf.p] */
    @Override // If.g
    public Object d(Gf.t tVar, InterfaceC3103c interfaceC3103c) {
        Object objInvoke = this.f5127d.invoke(tVar, interfaceC3103c);
        return objInvoke == kf.a.f39711a ? objInvoke : C2515C.f34653a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [lf.j, tf.p] */
    @Override // If.g
    public If.g e(InterfaceC3108h interfaceC3108h, int i5, Gf.a aVar) {
        return new C0598h(this.f5127d, interfaceC3108h, i5, aVar);
    }

    @Override // If.g
    public final String toString() {
        return "block[" + this.f5127d + "] -> " + super.toString();
    }
}
