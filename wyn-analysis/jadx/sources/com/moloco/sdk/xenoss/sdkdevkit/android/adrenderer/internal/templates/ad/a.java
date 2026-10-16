package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad;

import Fe.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.F;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class a extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30570a;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        a aVar = new a(2, interfaceC3103c);
        aVar.f30570a = obj;
        return aVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((F) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        e.U(obj);
        return Boolean.valueOf(((F) this.f30570a) != null);
    }
}
