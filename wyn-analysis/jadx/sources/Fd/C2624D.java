package fd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import x1.C4449b;
import x1.C4452e;

/* renamed from: fd.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2624D extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4452e f35306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f35307c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2624D(C4452e c4452e, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35306b = c4452e;
        this.f35307c = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2624D c2624d = new C2624D(this.f35306b, this.f35307c, interfaceC3103c);
        c2624d.f35305a = obj;
        return c2624d;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2624D c2624d = (C2624D) create((C4449b) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2624d.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        C4449b c4449b = (C4449b) this.f35305a;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        c4449b.c(this.f35306b, new Long(this.f35307c));
        return C2515C.f34653a;
    }
}
