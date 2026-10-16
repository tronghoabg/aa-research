package com.moloco.sdk.internal.publisher;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class S extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f28938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Hf.j0 f28939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V f28940c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(Hf.j0 j0Var, V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28939b = j0Var;
        this.f28940c = v2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new S(this.f28939b, this.f28940c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((S) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
        return kf.a.f39711a;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f28938a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            throw new E5.Q((byte) 0, 8);
        }
        Fe.e.U(obj);
        B3.a aVar2 = new B3.a(this.f28940c, 2);
        this.f28938a = 1;
        this.f28939b.collect(aVar2, this);
        return aVar;
    }
}
