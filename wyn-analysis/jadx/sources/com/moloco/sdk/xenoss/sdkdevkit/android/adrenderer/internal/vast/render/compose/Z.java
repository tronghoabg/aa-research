package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class Z extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N.V f31848b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(N.V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31848b = v2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        Z z2 = new Z(this.f31848b, interfaceC3103c);
        z2.f31847a = obj;
        return z2;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        Z z2 = (Z) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        z2.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l) this.f31847a;
        Ff.e eVar = i0.f31893a;
        ((tf.l) this.f31848b.getValue()).invoke(lVar);
        return C2515C.f34653a;
    }
}
