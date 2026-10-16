package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AbstractC2101d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C2099b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C2100c;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2059b extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31332a;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2059b c2059b = new C2059b(2, interfaceC3103c);
        c2059b.f31332a = obj;
        return c2059b;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2059b) create((AbstractC2101d) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        AbstractC2101d abstractC2101d = (AbstractC2101d) this.f31332a;
        Hf.j0 j0Var = VastActivity.f31299e;
        return Boolean.valueOf((abstractC2101d instanceof C2100c) || AbstractC3340k.a(abstractC2101d, C2099b.f31609d));
    }
}
