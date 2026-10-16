package N;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class s0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f7921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.l f7922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(tf.l lVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f7922b = lVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new s0(this.f7922b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f7921a;
        if (i5 == 0) {
            Fe.e.U(obj);
            this.f7921a = 1;
            if (Ef.H.m(16L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return this.f7922b.invoke(new Long(System.nanoTime()));
    }
}
