package Cd;

import ef.C2515C;
import java.util.List;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class y0 extends AbstractC3471j implements tf.r {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Fd.c f2191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2192b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(String str, InterfaceC3103c interfaceC3103c) {
        super(4, interfaceC3103c);
        this.f2192b = str;
    }

    @Override // tf.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        y0 y0Var = new y0(this.f2192b, (InterfaceC3103c) obj4);
        y0Var.f2191a = (Fd.c) obj2;
        C2515C c2515c = C2515C.f34653a;
        y0Var.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        Fd.c cVar = this.f2191a;
        z0.f2195a.s("Adding User-Agent header: agent for " + cVar.f4045a);
        List list = Jd.p.f6064a;
        cVar.f4047c.z("User-Agent", this.f2192b.toString());
        return C2515C.f34653a;
    }
}
