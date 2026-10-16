package fd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import x1.C4449b;
import x1.C4452e;

/* loaded from: classes5.dex */
public final class z extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4452e f35402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f35403c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C4452e c4452e, boolean z2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35402b = c4452e;
        this.f35403c = z2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        z zVar = new z(this.f35402b, this.f35403c, interfaceC3103c);
        zVar.f35401a = obj;
        return zVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) create((C4449b) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        zVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        C4449b c4449b = (C4449b) this.f35401a;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        c4449b.c(this.f35402b, Boolean.valueOf(this.f35403c));
        return C2515C.f34653a;
    }
}
