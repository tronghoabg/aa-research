package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.F;
import ef.C2515C;
import ef.C2527k;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30614a;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        b bVar = new b(2, interfaceC3103c);
        bVar.f30614a = obj;
        return bVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((C2527k) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        C2527k c2527k = (C2527k) this.f30614a;
        return Boolean.valueOf(((Boolean) c2527k.f34671a).booleanValue() || ((F) c2527k.f34672b) != null);
    }
}
