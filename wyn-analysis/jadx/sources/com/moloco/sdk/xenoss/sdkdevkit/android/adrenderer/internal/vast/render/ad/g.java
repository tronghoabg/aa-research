package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import E5.Q;
import Va.Y7;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.E;
import ef.C2515C;
import java.util.List;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class g extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f31619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f31620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q qVar, z zVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31619b = qVar;
        this.f31620c = zVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        g gVar = new g(this.f31619b, this.f31620c, interfaceC3103c);
        gVar.f31618a = obj;
        return gVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        g gVar = (g) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        gVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e) this.f31618a;
        boolean z2 = eVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d;
        q qVar = this.f31619b;
        if (z2) {
            Y7 y72 = qVar.f31642b;
            if (y72 != null) {
                E e7 = E.f31461j;
                List list = (List) y72.f13868b;
                if (list != null) {
                    G.g((L0) y72.f13869c, list, e7, 12);
                }
            }
            qVar.c(new C2100c(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d) eVar).f31675a));
        } else if (eVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a) {
            qVar.c(C2098a.f31605a);
        } else if (eVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c) {
            Y7 y73 = qVar.f31642b;
            if (y73 != null) {
                y73.b();
            }
            qVar.c(C2099b.f31606a);
        } else {
            if (!(eVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b)) {
                throw new Q((byte) 0, 9);
            }
            this.f31620c.f31664a.destroy();
        }
        return C2515C.f34653a;
    }
}
