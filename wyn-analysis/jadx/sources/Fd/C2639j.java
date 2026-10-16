package fd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import x1.C4449b;
import x1.C4452e;

/* renamed from: fd.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2639j extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4452e f35341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f35342c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2639j(C4452e c4452e, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35341b = c4452e;
        this.f35342c = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2639j c2639j = new C2639j(this.f35341b, this.f35342c, interfaceC3103c);
        c2639j.f35340a = obj;
        return c2639j;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2639j c2639j = (C2639j) create((C4449b) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2639j.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        C4449b c4449b = (C4449b) this.f35340a;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        c4449b.c(this.f35341b, this.f35342c);
        return C2515C.f34653a;
    }
}
