package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import E5.Q;
import Hf.Z;
import Hf.j0;
import Hf.k0;
import Hf.x0;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import org.json.JSONObject;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2014i extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2021p f30416b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2014i(AbstractC2021p abstractC2021p, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30416b = abstractC2021p;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2014i(this.f30416b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2014i) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30415a;
        AbstractC2021p abstractC2021p = this.f30416b;
        if (i5 == 0) {
            Fe.e.U(obj);
            K8.H h10 = abstractC2021p.f30433g;
            this.f30415a = 1;
            O o7 = (O) h10.f6586e;
            o7.getClass();
            obj = Ef.H.l(new N(h10.f6582a, o7, abstractC2021p.f30427a, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        com.moloco.sdk.internal.A a5 = (com.moloco.sdk.internal.A) obj;
        boolean z2 = a5 instanceof com.moloco.sdk.internal.y;
        if (z2) {
            return a5;
        }
        K8.H h11 = abstractC2021p.f30433g;
        h11.h("mraidbridge.setSupports(false,false,false,false,true)");
        h11.h("mraidbridge.setPlacementType(" + JSONObject.quote(abstractC2021p.f30428b.f30349a) + ')');
        K3.r rVar = abstractC2021p.f30436j;
        h11.h("mraidbridge.setIsViewable(" + ((Boolean) ((x0) rVar.f6516f).getValue()).booleanValue() + ')');
        x0 x0Var = (x0) rVar.f6519i;
        h11.b(((I) x0Var.getValue()).f30356a);
        abstractC2021p.c(G.f30350b);
        C2017l c2017l = new C2017l(abstractC2021p, null);
        Kd.a aVar2 = abstractC2021p.f30434h;
        Ef.H.D(aVar2, null, c2017l, 3);
        k0.u(new Z((j0) abstractC2021p.f30433g.f6585d, new C2018m(abstractC2021p, null), 0), aVar2);
        k0.u(new Z((x0) rVar.f6516f, new C2019n(abstractC2021p, null), 0), aVar2);
        k0.u(new Z(x0Var, new C2020o(abstractC2021p, null), 0), aVar2);
        h11.h("mraidbridge.notifyReadyEvent()");
        if (a5 instanceof com.moloco.sdk.internal.z) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "MraidBaseAd", "Mraid Html data successfully loaded", null, false, 12, null);
            return a5;
        }
        if (!z2) {
            throw new Q((byte) 0, 9);
        }
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidBaseAd", "Mraid Html data load failed.", null, false, 12, null);
        return a5;
    }
}
