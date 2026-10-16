package androidx.lifecycle;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class L extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Nf.a f18601a;

    /* renamed from: b, reason: collision with root package name */
    public G1.c f18602b;

    /* renamed from: c, reason: collision with root package name */
    public int f18603c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Nf.d f18604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ G1.c f18605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Nf.d dVar, G1.c cVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f18604d = dVar;
        this.f18605e = cVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new L(this.f18604d, this.f18605e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [Nf.a] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Nf.d dVar;
        G1.c cVar;
        Nf.a aVar;
        Throwable th;
        kf.a aVar2 = kf.a.f39711a;
        int i5 = this.f18603c;
        try {
            if (i5 == 0) {
                Fe.e.U(obj);
                dVar = this.f18604d;
                this.f18601a = dVar;
                cVar = this.f18605e;
                this.f18602b = cVar;
                this.f18603c = 1;
                if (dVar.b(this) != aVar2) {
                }
                return aVar2;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.f18601a;
                try {
                    Fe.e.U(obj);
                    aVar.a(null);
                    return C2515C.f34653a;
                } catch (Throwable th2) {
                    th = th2;
                    aVar.a(null);
                    throw th;
                }
            }
            cVar = this.f18602b;
            Nf.a aVar3 = this.f18601a;
            Fe.e.U(obj);
            dVar = aVar3;
            K k = new K(cVar, null);
            this.f18601a = dVar;
            this.f18602b = null;
            this.f18603c = 2;
            if (Ef.H.l(k, this) != aVar2) {
                aVar = dVar;
                aVar.a(null);
                return C2515C.f34653a;
            }
            return aVar2;
        } catch (Throwable th3) {
            aVar = dVar;
            th = th3;
            aVar.a(null);
            throw th;
        }
    }
}
