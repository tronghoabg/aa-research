package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import Hf.C0594d0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2056v extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2138x f31087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y2.B f31088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2056v(C2138x c2138x, Y2.B b5, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31087b = c2138x;
        this.f31088c = b5;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2056v(this.f31087b, this.f31088c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((C2056v) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
        return kf.a.f39711a;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31086a;
        if (i5 == 0) {
            Fe.e.U(obj);
            C0594d0 c0594d0 = this.f31087b.f32350h.f30680d;
            C2031s c2031s = new C2031s(this.f31088c, 2);
            this.f31086a = 1;
            if (c0594d0.f5118a.collect(c2031s, this) == aVar) {
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
