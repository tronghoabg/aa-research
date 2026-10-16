package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class x extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f32096a;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        x xVar = new x(2, interfaceC3103c);
        xVar.f32096a = obj;
        return xVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        return Boolean.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.f32096a) != null);
    }
}
