package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2016k extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30418a;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2016k c2016k = new C2016k(2, interfaceC3103c);
        c2016k.f30418a = obj;
        return c2016k;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2016k) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        return Boolean.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) this.f30418a) != null);
    }
}
