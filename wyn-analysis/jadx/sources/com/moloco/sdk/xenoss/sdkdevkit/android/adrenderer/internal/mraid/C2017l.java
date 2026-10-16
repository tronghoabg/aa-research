package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import E5.Q;
import Hf.k0;
import Hf.v0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2017l extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2021p f30420b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2017l(AbstractC2021p abstractC2021p, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30420b = abstractC2021p;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2017l(this.f30420b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2017l) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30419a;
        AbstractC2021p abstractC2021p = this.f30420b;
        if (i5 == 0) {
            Fe.e.U(obj);
            K8.H h10 = abstractC2021p.f30433g;
            C2016k c2016k = new C2016k(2, null);
            this.f30419a = 1;
            obj = k0.p((v0) h10.f6588g, c2016k, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj;
        if (dVar != null) {
            int i10 = AbstractC2015j.f30417a[abstractC2021p.f30428b.ordinal()];
            if (i10 == 1) {
                abstractC2021p.f30431e.invoke(gc.b.f(dVar));
            } else {
                if (i10 != 2) {
                    throw new Q((byte) 0, 9);
                }
                abstractC2021p.f30431e.invoke(gc.b.c(dVar));
            }
        }
        return C2515C.f34653a;
    }
}
