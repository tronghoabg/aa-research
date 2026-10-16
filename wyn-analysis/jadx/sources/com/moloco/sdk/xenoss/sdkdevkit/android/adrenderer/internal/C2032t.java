package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2032t extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2138x f30567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y2.B f30568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2032t(C2138x c2138x, Y2.B b5, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30567b = c2138x;
        this.f30568c = b5;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2032t(this.f30567b, this.f30568c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C2032t) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
        return kf.a.f39711a;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30566a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            throw new E5.Q((byte) 0, 8);
        }
        Fe.e.U(obj);
        Hf.j0 j0Var = this.f30567b.f32348f.f30674d;
        C2031s c2031s = new C2031s(this.f30568c, 0);
        this.f30566a = 1;
        j0Var.getClass();
        Hf.j0.k(j0Var, c2031s, this);
        return aVar;
    }
}
