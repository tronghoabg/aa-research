package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import E5.Q;
import Hf.x0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class r extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31650a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f31652c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x0 x0Var, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31652c = x0Var;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        r rVar = new r(this.f31652c, interfaceC3103c);
        rVar.f31651b = obj;
        return rVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((D) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31650a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            throw new Q((byte) 0, 8);
        }
        Fe.e.U(obj);
        D d3 = (D) this.f31651b;
        boolean z2 = d3 instanceof B;
        x0 x0Var = this.f31652c;
        if (!z2) {
            x0Var.j(null);
            return C2515C.f34653a;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h hVar = ((B) d3).f31603a;
        B3.a aVar2 = new B3.a(x0Var, 7);
        this.f31650a = 1;
        hVar.f32048w.collect(aVar2, this);
        return aVar;
    }
}
