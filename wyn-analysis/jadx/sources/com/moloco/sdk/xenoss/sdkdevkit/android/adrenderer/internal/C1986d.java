package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1986d extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30076a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Gf.t f30078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1986d(Gf.t tVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30078c = tVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C1986d c1986d = new C1986d(this.f30078c, interfaceC3103c);
        c1986d.f30077b = obj;
        return c1986d;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((C1986d) create((Hf.v0) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
        return kf.a.f39711a;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30076a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Hf.v0 v0Var = (Hf.v0) this.f30077b;
            B3.a aVar2 = new B3.a(this.f30078c, 3);
            this.f30076a = 1;
            if (v0Var.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        throw new E5.Q((byte) 0, 8);
    }
}
