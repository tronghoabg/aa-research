package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1996i extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2002l f30195b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1996i(C2002l c2002l, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30195b = c2002l;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1996i(this.f30195b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1996i) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i adShowListener;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.i iVar;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30194a;
        C2002l c2002l = this.f30195b;
        if (i5 == 0) {
            Fe.e.U(obj);
            Hf.v0 unrecoverableError = c2002l.f30221i.getUnrecoverableError();
            C1994h c1994h = new C1994h(2, null);
            this.f30194a = 1;
            obj = Hf.k0.p(unrecoverableError, c1994h, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj;
        if (gVar != null && (adShowListener = c2002l.getAdShowListener()) != null) {
            int i10 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h.f30128a[gVar.ordinal()];
            if (i10 == 1) {
                iVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.i.f30129a;
            } else if (i10 == 2) {
                iVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.i.f30130b;
            } else if (i10 == 3) {
                iVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.i.f30131c;
            } else {
                if (i10 != 4) {
                    throw new E5.Q((byte) 0, 9);
                }
                iVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.i.f30132d;
            }
            adShowListener.e(iVar);
        }
        return C2515C.f34653a;
    }
}
