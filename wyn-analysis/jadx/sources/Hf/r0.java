package Hf;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class r0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f5187a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ If.E f5189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(If.E e7, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f5189c = e7;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        r0 r0Var = new r0(this.f5189c, interfaceC3103c);
        r0Var.f5188b = obj;
        return r0Var;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((r0) create((InterfaceC0603m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
        return kf.a.f39711a;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f5187a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            throw new E5.Q((byte) 0, 8);
        }
        Fe.e.U(obj);
        C0615z c0615z = new C0615z(new kotlin.jvm.internal.C(), (InterfaceC0603m) this.f5188b, 5);
        this.f5187a = 1;
        this.f5189c.collect(c0615z, this);
        return aVar;
    }
}
