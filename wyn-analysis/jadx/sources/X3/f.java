package X3;

import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes.dex */
public final class f extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f16089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f16090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h4.h f16091c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, h4.h hVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f16090b = kVar;
        this.f16091c = hVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new f(this.f16090b, this.f16091c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f16089a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        this.f16089a = 1;
        Object objA = k.a(this.f16090b, this.f16091c, 1, this);
        return objA == aVar ? aVar : objA;
    }
}
