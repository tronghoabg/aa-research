package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import Ef.E;
import Hf.k0;
import Hf.v0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class y extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f32097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.g f32098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tf.l f32099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.g gVar, tf.l lVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32098b = gVar;
        this.f32099c = lVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new y(this.f32098b, this.f32099c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f32097a;
        if (i5 == 0) {
            Fe.e.U(obj);
            v0 unrecoverableError = this.f32098b.getUnrecoverableError();
            x xVar = new x(2, null);
            this.f32097a = 1;
            obj = k0.p(unrecoverableError, xVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj;
        if (gVar != null) {
            this.f32099c.invoke(gVar);
        }
        return C2515C.f34653a;
    }
}
