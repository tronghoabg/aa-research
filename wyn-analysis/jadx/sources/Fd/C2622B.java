package fd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import x1.C4449b;
import x1.C4452e;

/* renamed from: fd.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2622B extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4452e f35299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f35300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2622B(C4452e c4452e, double d3, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35299b = c4452e;
        this.f35300c = d3;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2622B c2622b = new C2622B(this.f35299b, this.f35300c, interfaceC3103c);
        c2622b.f35298a = obj;
        return c2622b;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2622B c2622b = (C2622B) create((C4449b) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2622b.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        C4449b c4449b = (C4449b) this.f35298a;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        c4449b.c(this.f35299b, new Double(this.f35300c));
        return C2515C.f34653a;
    }
}
