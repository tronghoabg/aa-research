package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class c0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o f31863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f31864c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z f31865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z f31866e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o oVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z zVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z zVar2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31863b = oVar;
        this.f31864c = str;
        this.f31865d = zVar;
        this.f31866e = zVar2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new c0(this.f31863b, this.f31864c, this.f31865d, this.f31866e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31862a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Ff.e eVar = i0.f31893a;
            b0 b0Var = new b0(this.f31863b, this.f31864c, this.f31865d, this.f31866e, null);
            this.f31862a = 1;
            if (Ef.H.P(eVar, b0Var, this) == aVar) {
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
