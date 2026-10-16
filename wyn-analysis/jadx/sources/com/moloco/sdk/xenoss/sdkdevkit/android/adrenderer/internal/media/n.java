package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import Hf.InterfaceC0603m;
import com.moloco.sdk.internal.A;
import com.moloco.sdk.internal.y;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class n extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f30307a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(A a5, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30307a = a5;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new n(this.f30307a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) create((InterfaceC0603m) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        nVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        ((y) this.f30307a).getClass();
        return C2515C.f34653a;
    }
}
