package Mf;

import Ef.A;
import Ef.C0502n;
import Ef.C0517x;
import Ef.E;
import Ef.N;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes5.dex */
public final class a extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f7638b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f7638b = bVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new a(this.f7638b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws N {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f7637a;
        C2515C c2515c = C2515C.f34653a;
        b bVar = this.f7638b;
        C0502n c0502n = bVar.f7639g;
        try {
            if (i5 == 0) {
                Fe.e.U(obj);
                this.f7637a = 1;
                obj = h.f7650f.get(bVar) instanceof f ? bVar.c(this) : bVar.d(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Fe.e.U(obj);
            }
            A a5 = (A) c0502n.f3755e.get(A.f3655a);
            if (a5 != null) {
                c0502n.C(a5, obj);
                return c2515c;
            }
            c0502n.resumeWith(obj);
            return c2515c;
        } catch (Throwable th) {
            A a10 = (A) c0502n.f3755e.get(A.f3655a);
            if (a10 != null) {
                InterfaceC3103c interfaceC3103c = c0502n.f3754d;
                Jf.f fVar = interfaceC3103c instanceof Jf.f ? (Jf.f) interfaceC3103c : null;
                c0502n.B(new C0517x(false, th), (fVar != null ? fVar.f6109d : null) == a10 ? 4 : c0502n.f3694c, null);
            } else {
                c0502n.resumeWith(Fe.e.z(th));
            }
            return c2515c;
        }
    }
}
