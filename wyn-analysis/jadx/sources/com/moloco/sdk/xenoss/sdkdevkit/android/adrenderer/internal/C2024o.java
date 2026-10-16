package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2024o extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2028q f30474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.internal.publisher.i0 f30475c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2024o(C2028q c2028q, com.moloco.sdk.internal.publisher.i0 i0Var, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30474b = c2028q;
        this.f30475c = i0Var;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2024o(this.f30474b, this.f30475c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((C2024o) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
        return kf.a.f39711a;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30473a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Hf.g0 clickthroughEvent = this.f30474b.f30490f.getClickthroughEvent();
            B3.a aVar2 = new B3.a(this.f30475c, 5);
            this.f30473a = 1;
            if (clickthroughEvent.collect(aVar2, this) == aVar) {
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
