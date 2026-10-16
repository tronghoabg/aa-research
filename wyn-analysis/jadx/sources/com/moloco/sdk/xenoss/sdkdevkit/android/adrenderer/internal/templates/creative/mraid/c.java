package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

import ac.C1346a;
import com.bumptech.glide.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.I;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class c extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f30608b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30608b = fVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        c cVar = new c(this.f30608b, interfaceC3103c);
        cVar.f30607a = obj;
        return cVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((I) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        cVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        ((C1346a) this.f30608b.f24234e).H(((I) this.f30607a).f30356a);
        return C2515C.f34653a;
    }
}
