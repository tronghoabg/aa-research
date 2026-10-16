package ea;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import x1.C4449b;
import x1.C4452e;

/* renamed from: ea.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2478B extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f34443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34444b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2478B(String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f34444b = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2478B c2478b = new C2478B(this.f34444b, interfaceC3103c);
        c2478b.f34443a = obj;
        return c2478b;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2478B c2478b = (C2478B) create((C4449b) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2478b.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        C4449b c4449b = (C4449b) this.f34443a;
        C4452e c4452e = z.f34590a;
        c4449b.c(z.f34590a, this.f34444b);
        return C2515C.f34653a;
    }
}
