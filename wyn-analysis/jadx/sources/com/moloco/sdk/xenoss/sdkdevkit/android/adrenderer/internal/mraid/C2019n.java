package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2019n extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f30423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2021p f30424b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2019n(AbstractC2021p abstractC2021p, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30424b = abstractC2021p;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2019n c2019n = new C2019n(this.f30424b, interfaceC3103c);
        c2019n.f30423a = ((Boolean) obj).booleanValue();
        return c2019n;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C2019n c2019n = (C2019n) create(bool, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2019n.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        boolean z2 = this.f30423a;
        this.f30424b.f30433g.h("mraidbridge.setIsViewable(" + z2 + ')');
        return C2515C.f34653a;
    }
}
