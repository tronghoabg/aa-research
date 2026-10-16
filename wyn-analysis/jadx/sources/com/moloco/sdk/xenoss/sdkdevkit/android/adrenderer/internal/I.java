package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AbstractC2101d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C2098a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C2099b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C2100c;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class I extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f29956b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29956b = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        I i5 = new I(this.f29956b, interfaceC3103c);
        i5.f29955a = obj;
        return i5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        I i5 = (I) create((AbstractC2101d) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        i5.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        AbstractC2101d abstractC2101d = (AbstractC2101d) this.f29955a;
        boolean zA = AbstractC3340k.a(abstractC2101d, C2099b.f31612g);
        J j8 = this.f29956b;
        if (zA) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r) j8.getAdShowListener();
            if (rVar != null) {
                rVar.a(true);
            }
        } else if (!AbstractC3340k.a(abstractC2101d, C2099b.f31613h)) {
            if (AbstractC3340k.a(abstractC2101d, C2099b.f31607b)) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r) j8.getAdShowListener();
                if (rVar2 != null) {
                    rVar2.a(false);
                }
            } else if (AbstractC3340k.a(abstractC2101d, C2098a.f31605a)) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r) j8.getAdShowListener();
                if (rVar3 != null) {
                    rVar3.b();
                }
            } else if (abstractC2101d instanceof C2100c) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r) j8.getAdShowListener();
                if (rVar4 != null) {
                    rVar4.e(((C2100c) abstractC2101d).f31614a);
                }
            } else if (!AbstractC3340k.a(abstractC2101d, C2099b.f31610e) && !AbstractC3340k.a(abstractC2101d, C2099b.f31606a) && !AbstractC3340k.a(abstractC2101d, C2099b.f31608c) && !AbstractC3340k.a(abstractC2101d, C2099b.f31611f) && !AbstractC3340k.a(abstractC2101d, C2099b.f31609d)) {
                throw new E5.Q((byte) 0, 9);
            }
        }
        return C2515C.f34653a;
    }
}
