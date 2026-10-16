package A;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: A.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210c extends AbstractC3471j implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0212e f137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparable f138b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0210c(C0212e c0212e, Comparable comparable, InterfaceC3103c interfaceC3103c) {
        super(1, interfaceC3103c);
        this.f137a = c0212e;
        this.f138b = comparable;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(InterfaceC3103c interfaceC3103c) {
        return new C0210c(this.f137a, this.f138b, interfaceC3103c);
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        C0210c c0210c = (C0210c) create((InterfaceC3103c) obj);
        C2515C c2515c = C2515C.f34653a;
        c0210c.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        C0212e c0212e = this.f137a;
        C0212e.b(c0212e);
        Object objA = C0212e.a(c0212e, this.f138b);
        ((N.Y) c0212e.f143c.f170f).setValue(objA);
        c0212e.f145e.setValue(objA);
        return C2515C.f34653a;
    }
}
