package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import E5.Q;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class l extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f31628b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31628b = qVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        l lVar = new l(this.f31628b, interfaceC3103c);
        lVar.f31627a = obj;
        return lVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        l lVar = (l) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        lVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        int i5 = k.f31626a[((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u) this.f31627a).ordinal()];
        q qVar = this.f31628b;
        if (i5 == 1) {
            qVar.c(C2099b.f31612g);
            qVar.b();
        } else {
            if (i5 != 2) {
                throw new Q((byte) 0, 9);
            }
            qVar.c(C2098a.f31605a);
        }
        return C2515C.f34653a;
    }
}
