package N;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class D0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f7674a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tf.p f7676c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V f7677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(tf.p pVar, V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f7676c = pVar;
        this.f7677d = v2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        D0 d02 = new D0(this.f7676c, this.f7677d, interfaceC3103c);
        d02.f7675b = obj;
        return d02;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((D0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f7674a;
        if (i5 == 0) {
            Fe.e.U(obj);
            C0721e0 c0721e0 = new C0721e0(this.f7677d, ((Ef.E) this.f7675b).getCoroutineContext());
            this.f7674a = 1;
            if (this.f7676c.invoke(c0721e0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return C2515C.f34653a;
    }
}
