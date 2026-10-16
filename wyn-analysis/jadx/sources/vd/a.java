package Vd;

import Ef.E;
import ef.C2515C;
import io.ktor.utils.io.InterfaceC2886t;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes5.dex */
public final class a extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f14882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2886t f14883b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC2886t interfaceC2886t, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f14883b = interfaceC2886t;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new a(this.f14883b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f14882a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        this.f14882a = 1;
        Object objG = this.f14883b.g(1, this);
        return objG == aVar ? aVar : objG;
    }
}
