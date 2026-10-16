package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import E5.Q;
import Va.Y7;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class j extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f31625b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31625b = qVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        j jVar = new j(this.f31625b, interfaceC3103c);
        jVar.f31624a = obj;
        return jVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        jVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        int i5 = i.f31623a[((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a) this.f31624a).ordinal()];
        q qVar = this.f31625b;
        if (i5 == 1) {
            qVar.c(C2098a.f31605a);
        } else {
            if (i5 != 2) {
                throw new Q((byte) 0, 9);
            }
            Y7 y72 = qVar.f31642b;
            if (y72 != null) {
                y72.b();
            }
            qVar.c(C2099b.f31608c);
        }
        return C2515C.f34653a;
    }
}
