package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1988e extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30083a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b7.k f30085c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1988e(b7.k kVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30085c = kVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C1988e c1988e = new C1988e(this.f30085c, interfaceC3103c);
        c1988e.f30084b = obj;
        return c1988e;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1988e) create((Gf.t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30083a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Gf.t tVar = (Gf.t) this.f30084b;
            Hf.x0 x0Var = (Hf.x0) this.f30085c.f19397c;
            C1986d c1986d = new C1986d(tVar, null);
            this.f30083a = 1;
            if (Hf.k0.k(x0Var, c1986d, this) == aVar) {
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
