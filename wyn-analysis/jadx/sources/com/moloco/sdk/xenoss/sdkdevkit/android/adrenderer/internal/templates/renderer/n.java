package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import E5.Q;
import Ef.E;
import Hf.j0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class n extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f30744b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30744b = oVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new n(this.f30744b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((n) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
        return kf.a.f39711a;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30743a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            throw new Q((byte) 0, 8);
        }
        Fe.e.U(obj);
        o oVar = this.f30744b;
        j0 j0Var = oVar.f30746a.f30701d;
        l lVar = new l(oVar, 1);
        this.f30743a = 1;
        j0Var.getClass();
        j0.k(j0Var, lVar, this);
        return aVar;
    }
}
