package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2118o extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h f31914b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2118o(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h hVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31914b = hVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2118o(this.f31914b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2118o) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31913a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Lf.e eVar = Ef.S.f3698a;
            Ff.e eVar2 = Jf.n.f6132a;
            C2117n c2117n = new C2117n(this.f31914b, null);
            this.f31913a = 1;
            if (Ef.H.P(eVar2, c2117n, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return C2515C.f34653a;
    }
}
