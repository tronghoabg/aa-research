package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import Hf.j0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class b0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o f31855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f31856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z f31857c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z f31858d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o oVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z zVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z zVar2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31855a = oVar;
        this.f31856b = str;
        this.f31857c = zVar;
        this.f31858d = zVar2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new b0(this.f31855a, this.f31856b, this.f31857c, this.f31858d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        b0Var.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o oVar = this.f31855a;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j jVar = oVar.f32261a;
        String str = this.f31856b;
        jVar.f32242m = str;
        E5.I i5 = jVar.f32245p;
        if (i5 != null) {
            jVar.a(i5, str);
        }
        jVar.f32247r = false;
        jVar.f32250u = 0L;
        long jLongValue = ((Number) this.f31857c.f32100a).longValue();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j jVar2 = oVar.f32261a;
        jVar2.f32250u = jLongValue;
        E5.I i10 = jVar2.f32245p;
        if (i10 != null) {
            int iL0 = i10.l0();
            i10.Q0();
            i10.E0(jLongValue, iL0, false);
        }
        Ff.e eVar = i0.f31893a;
        boolean zBooleanValue = ((Boolean) this.f31858d.f32100a).booleanValue();
        j0 j0Var = oVar.f32263c;
        if (zBooleanValue) {
            j0Var.b(Boolean.TRUE);
        } else {
            j0Var.b(Boolean.FALSE);
        }
        return C2515C.f34653a;
    }
}
