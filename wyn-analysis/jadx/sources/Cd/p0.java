package Cd;

import Ef.I0;
import ef.C2515C;
import java.util.Map;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public final class p0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f2154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f2155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fd.c f2156c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I0 f2157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Long l10, Fd.c cVar, I0 i02, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f2155b = l10;
        this.f2156c = cVar;
        this.f2157d = i02;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new p0(this.f2155b, this.f2156c, this.f2157d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f2154a;
        if (i5 == 0) {
            Fe.e.U(obj);
            long jLongValue = this.f2155b.longValue();
            this.f2154a = 1;
            if (Ef.H.m(jLongValue, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        Fd.c request = this.f2156c;
        AbstractC3340k.e(request, "request");
        Jd.B b5 = request.f4045a;
        b5.a();
        StringBuilder sb2 = new StringBuilder(256);
        AbstractC4345a.g(b5, sb2);
        String string = sb2.toString();
        AbstractC3340k.d(string, "toString(...)");
        m0 m0Var = m0.f2138a;
        Map map = (Map) request.f4050f.d(zd.g.f48487a);
        n0 n0Var = (n0) (map != null ? map.get(m0Var) : null);
        c0 c0Var = new c0(string, n0Var != null ? n0Var.f2142a : null, null);
        vg.b bVar = q0.f2162a;
        AbstractC3340k.e(bVar, "<this>");
        if (bVar.e()) {
            bVar.s("Request timeout: " + b5);
        }
        String message = c0Var.getMessage();
        AbstractC3340k.b(message);
        Ef.H.k(this.f2157d, message, c0Var);
        return C2515C.f34653a;
    }
}
