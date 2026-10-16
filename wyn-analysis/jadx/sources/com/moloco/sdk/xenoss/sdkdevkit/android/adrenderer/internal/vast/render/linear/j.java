package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import Hf.x0;
import R1.q;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2103c;
import ef.C2515C;
import ef.C2537u;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class j extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int f32053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f32054b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32054b = qVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        j jVar = new j(this.f32054b, interfaceC3103c);
        jVar.f32053a = ((C2537u) obj).f34686a;
        return jVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        int i5 = ((C2537u) obj).f34686a;
        j jVar = new j(this.f32054b, (InterfaceC3103c) obj2);
        jVar.f32053a = i5;
        C2515C c2515c = C2515C.f34653a;
        jVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        int i5 = this.f32053a;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        q qVar = this.f32054b;
        qVar.getClass();
        MolocoLogger.info$default(molocoLogger, "LinearGoNextActionImpl", "Updating countdown to " + ((Object) String.valueOf(i5 & 4294967295L)), null, false, 12, null);
        qVar.f10157a = i5;
        StringBuilder sb2 = new StringBuilder("Propagating state: ");
        Object dVar = C2103c.f31671a;
        sb2.append(i5 == 0 ? dVar : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d(i5));
        MolocoLogger.info$default(molocoLogger, "LinearGoNextActionImpl", sb2.toString(), null, false, 12, null);
        if (i5 != 0) {
            dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d(i5);
        }
        x0 x0Var = (x0) qVar.f10162f;
        x0Var.getClass();
        x0Var.k(null, dVar);
        return C2515C.f34653a;
    }
}
