package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class C extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f29899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f29900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f29901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(long j8, H h10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29900b = j8;
        this.f29901c = h10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C(this.f29900b, this.f29901c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29899a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        B b5 = new B(this.f29901c, null);
        this.f29899a = 1;
        Object objQ = Ef.H.Q(Ef.H.M(this.f29900b), b5, this);
        return objQ == aVar ? aVar : objQ;
    }
}
