package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import Ef.E;
import Hf.j0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class d extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f30676b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30676b = eVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new d(this.f30676b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30675a;
        C2515C c2515c = C2515C.f34653a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return c2515c;
        }
        Fe.e.U(obj);
        j0 j0Var = this.f30676b.f30679c;
        this.f30675a = 1;
        return j0Var.emit(c2515c, this) == aVar ? aVar : c2515c;
    }
}
