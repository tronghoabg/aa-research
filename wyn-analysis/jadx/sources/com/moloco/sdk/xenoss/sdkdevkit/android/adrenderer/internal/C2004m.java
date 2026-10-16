package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2004m extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30227a;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2004m c2004m = new C2004m(2, interfaceC3103c);
        c2004m.f30227a = obj;
        return c2004m;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2004m) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        return Boolean.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.f30227a) != null);
    }
}
