package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class A extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.a f31703b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(tf.a aVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31703b = aVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new A(this.f31703b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31702a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Lf.e eVar = Ef.S.f3698a;
            Ff.e eVar2 = Jf.n.f6132a;
            C2128z c2128z = new C2128z(this.f31703b, null);
            this.f31702a = 1;
            if (Ef.H.P(eVar2, c2128z, this) == aVar) {
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
