package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class X extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N.V f31840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N.V f31841c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o f31842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N.V f31843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ N.V f31844f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(N.V v2, N.V v10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o oVar, N.V v11, N.V v12, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31840b = v2;
        this.f31841c = v10;
        this.f31842d = oVar;
        this.f31843e = v11;
        this.f31844f = v12;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        N.V v2 = this.f31843e;
        N.V v10 = this.f31844f;
        X x5 = new X(this.f31840b, this.f31841c, this.f31842d, v2, v10, interfaceC3103c);
        x5.f31839a = obj;
        return x5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        X x5 = (X) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        x5.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.f31839a;
        Ff.e eVar = i0.f31893a;
        ((tf.l) this.f31843e.getValue()).invoke(Boolean.valueOf(aVar2.f32208a));
        this.f31840b.setValue(Boolean.valueOf(aVar2.f32208a));
        boolean z2 = aVar2.f32210c;
        this.f31841c.setValue(Boolean.valueOf(z2));
        ((tf.l) this.f31844f.getValue()).invoke(Boolean.valueOf(aVar2.f32209b));
        s6.C c10 = this.f31842d.f32261a.f32241l;
        if (c10 != null) {
            c10.setKeepScreenOn(z2);
        }
        return C2515C.f34653a;
    }
}
