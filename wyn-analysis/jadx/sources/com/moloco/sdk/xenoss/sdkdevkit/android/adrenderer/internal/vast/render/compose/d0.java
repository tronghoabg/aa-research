package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class d0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o f31871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z f31872b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o oVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z zVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31871a = oVar;
        this.f31872b = zVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new d0(this.f31871a, this.f31872b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        d0Var.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        Ff.e eVar = i0.f31893a;
        boolean zBooleanValue = ((Boolean) this.f31872b.f32100a).booleanValue();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o oVar = this.f31871a;
        if (zBooleanValue) {
            oVar.f32263c.b(Boolean.TRUE);
        } else {
            oVar.f32263c.b(Boolean.FALSE);
        }
        return C2515C.f34653a;
    }
}
