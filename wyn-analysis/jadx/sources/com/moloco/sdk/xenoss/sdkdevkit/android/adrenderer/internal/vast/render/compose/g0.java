package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class g0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o f31882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f31883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o oVar, boolean z2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31882b = oVar;
        this.f31883c = z2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new g0(this.f31882b, this.f31883c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31881a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Ff.e eVar = i0.f31893a;
            f0 f0Var = new f0(this.f31882b, this.f31883c, null);
            this.f31881a = 1;
            if (Ef.H.P(eVar, f0Var, this) == aVar) {
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
