package Vd;

import Ef.E;
import ef.C2515C;
import io.ktor.utils.io.S;
import java.io.EOFException;
import java.io.IOException;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes5.dex */
public final class c extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f14888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14889b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, int i5, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f14888a = dVar;
        this.f14889b = i5;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new c(this.f14888a, this.f14889b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) throws IOException {
        c cVar = (c) create((E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        cVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws IOException {
        d dVar;
        Pf.b bVar;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        long j8 = 0;
        while (true) {
            dVar = this.f14888a;
            long jC = Fe.b.C(dVar.f14892d);
            long j10 = this.f14889b;
            bVar = dVar.f14890b;
            if (jC >= j10 || j8 < 0) {
                break;
            }
            try {
                j8 = bVar.j(dVar.f14892d, Long.MAX_VALUE);
            } catch (EOFException unused) {
                j8 = -1;
            }
        }
        if (j8 == -1) {
            bVar.close();
            dVar.f14893e.Y();
            dVar.f14891c = new S(null);
        }
        return C2515C.f34653a;
    }
}
