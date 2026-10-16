package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2020o extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2021p f30426b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2020o(AbstractC2021p abstractC2021p, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30426b = abstractC2021p;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2020o c2020o = new C2020o(this.f30426b, interfaceC3103c);
        c2020o.f30425a = obj;
        return c2020o;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2020o c2020o = (C2020o) create((I) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2020o.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        this.f30426b.f30433g.b(((I) this.f30425a).f30356a);
        return C2515C.f34653a;
    }
}
