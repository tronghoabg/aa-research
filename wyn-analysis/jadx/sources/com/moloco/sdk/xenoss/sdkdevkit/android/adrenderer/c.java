package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class c extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f29877a;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        c cVar = new c(2, interfaceC3103c);
        cVar.f29877a = ((Boolean) obj).booleanValue();
        return cVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((c) create(bool, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        return Boolean.valueOf(this.f29877a);
    }
}
