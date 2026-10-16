package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class n extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f32259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f32260b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32260b = oVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        n nVar = new n(this.f32260b, interfaceC3103c);
        nVar.f32259a = obj;
        return nVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) create((a) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        nVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        this.f32260b.f32264d.j((a) this.f32259a);
        return C2515C.f34653a;
    }
}
