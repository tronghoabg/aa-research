package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class e extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31615a;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        e eVar = new e(2, interfaceC3103c);
        eVar.f31615a = obj;
        return eVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        e eVar = (e) create((D) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        eVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        D d3 = (D) this.f31615a;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j jVar = d3 instanceof z ? ((z) d3).f31664a : d3 instanceof A ? ((A) d3).f31602a : null;
        C2515C c2515c = C2515C.f34653a;
        if (jVar == null) {
            return c2515c;
        }
        jVar.reset();
        return c2515c;
    }
}
