package J9;

import A.e0;
import df.InterfaceC2432a;
import java.util.Arrays;
import java.util.Iterator;
import md.AbstractC3536d;
import md.C3535c;
import md.C3539g;
import md.b0;

/* loaded from: classes4.dex */
public final class W implements A9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5903a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2432a f5904b;

    /* renamed from: c, reason: collision with root package name */
    public final A9.b f5905c;

    public W(InterfaceC2432a interfaceC2432a, L9.g gVar) {
        this.f5904b = interfaceC2432a;
        this.f5905c = gVar;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        A9.b bVar = this.f5905c;
        InterfaceC2432a interfaceC2432a = this.f5904b;
        switch (this.f5903a) {
            case 0:
                I i5 = (I) interfaceC2432a.get();
                ((L9.g) bVar).getClass();
                return new V(i5, new M9.a());
            default:
                AbstractC3536d c3539g = (AbstractC3536d) ((K9.a) interfaceC2432a).get();
                Iterator it = Arrays.asList(new ud.g((b0) ((A9.c) bVar).get())).iterator();
                while (it.hasNext()) {
                    c3539g = new C3539g(c3539g, (ud.g) it.next());
                }
                return new ta.p(c3539g, C3535c.f40619i.c(ud.e.f46784c, ud.b.f46773a));
        }
    }

    public W(e0 e0Var, K9.a aVar, A9.c cVar) {
        this.f5904b = aVar;
        this.f5905c = cVar;
    }
}
