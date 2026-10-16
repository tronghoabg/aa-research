package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import Ef.E;
import Hf.InterfaceC0592c0;
import Hf.x0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class m extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f30908b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30908b = oVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new m(this.f30908b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30907a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return C2515C.f34653a;
        }
        Fe.e.U(obj);
        o oVar = this.f30908b;
        InterfaceC0592c0 interfaceC0592c0 = oVar.f30914d;
        B3.a aVar2 = new B3.a(oVar, 6);
        this.f30907a = 1;
        ((x0) interfaceC0592c0).collect(aVar2, this);
        return aVar;
    }
}
