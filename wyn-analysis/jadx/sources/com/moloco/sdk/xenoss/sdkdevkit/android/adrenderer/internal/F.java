package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class F extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f29929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f29930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f29931c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H f29932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(long j8, z0 z0Var, H h10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29930b = j8;
        this.f29931c = z0Var;
        this.f29932d = h10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new F(this.f29930b, this.f29931c, this.f29932d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29929a;
        z0 z0Var = this.f29931c;
        if (i5 == 0) {
            Fe.e.U(obj);
            E e7 = new E(z0Var, this.f29932d, null);
            this.f29929a = 1;
            obj = Ef.H.S(this.f29930b, e7, this);
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
