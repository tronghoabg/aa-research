package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class Y extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N.V f31846b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(N.V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31846b = v2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        Y y10 = new Y(this.f31846b, interfaceC3103c);
        y10.f31845a = obj;
        return y10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        Y y10 = (Y) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        y10.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p pVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p) this.f31845a;
        Ff.e eVar = i0.f31893a;
        ((tf.l) this.f31846b.getValue()).invoke(pVar);
        return C2515C.f34653a;
    }
}
