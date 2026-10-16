package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0;
import ef.C2515C;
import java.util.List;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2112i extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c f31892a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2112i(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c cVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31892a = cVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2112i(this.f31892a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2112i c2112i = (C2112i) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2112i.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c cVar = this.f31892a;
        C6.l lVar = cVar.f31973e;
        List list = (List) lVar.f1846c;
        if (list != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G.g((L0) lVar.f1849f, list, null, 14);
            lVar.f1846c = null;
        }
        Ef.H.D(cVar.f31971c, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b(cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a.f31963a, null), 3);
        return C2515C.f34653a;
    }
}
