package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1998j extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2002l f30198b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1998j(C2002l c2002l, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30198b = c2002l;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1998j(this.f30198b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((C1998j) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
        return kf.a.f39711a;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30197a;
        if (i5 == 0) {
            Fe.e.U(obj);
            C2002l c2002l = this.f30198b;
            Hf.g0 clickthroughEvent = c2002l.f30221i.getClickthroughEvent();
            B3.a aVar2 = new B3.a(c2002l, 4);
            this.f30197a = 1;
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
