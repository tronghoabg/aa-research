package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import E5.Q;
import Ef.E;
import Hf.C0615z;
import Hf.j0;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class h extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f30723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.f f30724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, com.bumptech.glide.f fVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30723b = iVar;
        this.f30724c = fVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new h(this.f30723b, this.f30724c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30722a;
        try {
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Fe.e.U(obj);
                throw new Q((byte) 0, 8);
            }
            Fe.e.U(obj);
            i iVar = this.f30723b;
            j0 j0Var = iVar.f30725a.f30701d;
            C0615z c0615z = new C0615z(7, iVar, this.f30724c);
            this.f30722a = 1;
            j0Var.getClass();
            j0.k(j0Var, c0615z, this);
            return aVar;
        } catch (Exception e7) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Error collecting playlist item displaying events", e7, false, 8, null);
            return C2515C.f34653a;
        }
    }
}
