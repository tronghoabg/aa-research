package androidx.lifecycle;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class K extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f18598a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tf.p f18600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(tf.p pVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f18600c = pVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        K k = new K(this.f18600c, interfaceC3103c);
        k.f18599b = obj;
        return k;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f18598a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Ef.E e7 = (Ef.E) this.f18599b;
            this.f18598a = 1;
            if (this.f18600c.invoke(e7, this) == aVar) {
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
