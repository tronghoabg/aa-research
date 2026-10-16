package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad;

import Ef.E;
import Fe.e;
import Hf.k0;
import Hf.v0;
import Hf.x0;
import Y2.B;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.F;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f30572b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f30573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, B b5, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30572b = cVar;
        this.f30573c = b5;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new b(this.f30572b, this.f30573c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30571a;
        if (i5 == 0) {
            e.U(obj);
            c cVar = this.f30572b;
            x0 x0Var = cVar.f30579f;
            Boolean bool = Boolean.TRUE;
            x0Var.getClass();
            x0Var.k(null, bool);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebviewAd", "Ad show called, isAdDisplaying: " + ((Boolean) cVar.f30579f.getValue()).booleanValue(), null, false, 12, null);
            v0 unrecoverableError = cVar.f30576c.getUnrecoverableError();
            a aVar2 = new a(2, null);
            this.f30571a = 1;
            obj = k0.p(unrecoverableError, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
        }
        F f10 = (F) obj;
        if (f10 != null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "WebviewAd", "Ad show error: " + f10, null, false, 12, null);
            this.f30573c.e(f10);
        }
        return C2515C.f34653a;
    }
}
