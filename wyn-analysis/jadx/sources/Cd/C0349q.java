package Cd;

import ef.C2515C;
import io.ktor.utils.io.InterfaceC2886t;
import java.util.concurrent.CancellationException;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: Cd.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0349q extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f2158a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2159b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2160c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Gd.a f2161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0349q(Object obj, Gd.a aVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f2160c = obj;
        this.f2161d = aVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C0349q c0349q = new C0349q(this.f2160c, this.f2161d, interfaceC3103c);
        c0349q.f2159b = obj;
        return c0349q;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0349q) create((io.ktor.utils.io.b0) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f2158a;
        Gd.a aVar2 = this.f2161d;
        try {
            if (i5 == 0) {
                Fe.e.U(obj);
                io.ktor.utils.io.b0 b0Var = (io.ktor.utils.io.b0) this.f2159b;
                InterfaceC2886t interfaceC2886t = (InterfaceC2886t) this.f2160c;
                io.ktor.utils.io.J j8 = b0Var.f37387a;
                this.f2158a = 1;
                obj = io.ktor.utils.io.N.e(interfaceC2886t, j8, Long.MAX_VALUE, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Fe.e.U(obj);
            }
            ((Number) obj).longValue();
            return C2515C.f34653a;
        } catch (CancellationException e7) {
            Ef.H.j(aVar2, e7);
            throw e7;
        } catch (Throwable th) {
            Ef.H.j(aVar2, Ef.H.a("Receive failed", th));
            throw th;
        }
    }
}
