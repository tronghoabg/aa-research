package N;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: N.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0735l0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f7803a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0741o0 f7805c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f7806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0735l0(C0741o0 c0741o0, Q q4, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f7805c = c0741o0;
        this.f7806d = q4;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C0735l0 c0735l0 = new C0735l0(this.f7805c, this.f7806d, interfaceC3103c);
        c0735l0.f7804b = obj;
        return c0735l0;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0735l0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f7803a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return C2515C.f34653a;
        }
        Fe.e.U(obj);
        Ef.E e7 = (Ef.E) this.f7804b;
        this.f7803a = 1;
        this.f7805c.invoke(e7, this.f7806d, this);
        return aVar;
    }
}
