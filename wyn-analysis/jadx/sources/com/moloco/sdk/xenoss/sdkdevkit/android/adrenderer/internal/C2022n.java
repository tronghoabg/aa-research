package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2022n extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2028q f30467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.internal.publisher.i0 f30468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2022n(C2028q c2028q, com.moloco.sdk.internal.publisher.i0 i0Var, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30467b = c2028q;
        this.f30468c = i0Var;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2022n(this.f30467b, this.f30468c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2022n) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j jVar;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30466a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Hf.v0 unrecoverableError = this.f30467b.f30490f.getUnrecoverableError();
            C2004m c2004m = new C2004m(2, null);
            this.f30466a = 1;
            obj = Hf.k0.p(unrecoverableError, c2004m, this);
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
        if (gVar != null) {
            com.moloco.sdk.internal.publisher.i0 i0Var = this.f30468c;
            int i10 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h.f30128a[gVar.ordinal()];
            if (i10 == 1) {
                jVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j.f30134a;
            } else if (i10 == 2) {
                jVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j.f30135b;
            } else if (i10 == 3) {
                jVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j.f30136c;
            } else {
                if (i10 != 4) {
                    throw new E5.Q((byte) 0, 9);
                }
                jVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j.f30137d;
            }
            i0Var.e(jVar);
        }
        return C2515C.f34653a;
    }
}
