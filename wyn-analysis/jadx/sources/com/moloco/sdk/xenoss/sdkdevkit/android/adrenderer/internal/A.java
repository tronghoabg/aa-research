package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class A extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f29888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f29889b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f29890c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H f29891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(long j8, z0 z0Var, H h10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29889b = j8;
        this.f29890c = z0Var;
        this.f29891d = h10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new A(this.f29889b, this.f29890c, this.f29891d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29888a;
        z0 z0Var = this.f29890c;
        if (i5 == 0) {
            Fe.e.U(obj);
            C2140z c2140z = new C2140z(z0Var, this.f29891d, null);
            this.f29888a = 1;
            obj = Ef.H.S(this.f29889b, c2140z, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        z0 z0Var2 = (z0) obj;
        return z0Var2 == null ? z0Var : z0Var2;
    }
}
