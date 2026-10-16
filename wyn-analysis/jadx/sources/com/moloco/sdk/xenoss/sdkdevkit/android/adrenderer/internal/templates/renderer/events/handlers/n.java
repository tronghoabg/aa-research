package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import Ef.E;
import Hf.j0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class n extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f30705b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l lVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30705b = lVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new n(this.f30705b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30704a;
        if (i5 == 0) {
            Fe.e.U(obj);
            j0 j0Var = this.f30705b.f30700c;
            Boolean bool = Boolean.FALSE;
            this.f30704a = 1;
            if (j0Var.emit(bool, this) == aVar) {
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
