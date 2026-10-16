package D6;

import a2.C1323c;
import x6.C4472c;
import x6.InterfaceC4485p;

/* loaded from: classes3.dex */
public final class X0 extends AbstractBinderC0402v0 {
    @Override // D6.InterfaceC0404w0
    public final void zze(K0 k02) {
        C4472c c4472c;
        InterfaceC4485p interfaceC4485p = Z0.d().k;
        if (interfaceC4485p != null) {
            if (k02 == null) {
                c4472c = null;
            } else {
                c4472c = new C4472c(k02.f2338a, k02.f2339b, k02.f2340c, null);
            }
            tc.g gVar = (tc.g) ((C1323c) interfaceC4485p).f17156b;
            if (c4472c != null) {
                gVar.b(Integer.toString(c4472c.f47720a), c4472c.f47721b, c4472c.f47722c);
            } else {
                gVar.a(null);
            }
        }
    }
}
