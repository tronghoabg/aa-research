package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AbstractC2101d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C2099b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C2100c;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2071h extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31379a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VastActivity f31381c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2071h(VastActivity vastActivity, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31381c = vastActivity;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2071h c2071h = new C2071h(this.f31381c, interfaceC3103c);
        c2071h.f31380b = obj;
        return c2071h;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2071h) create((AbstractC2101d) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        AbstractC2101d abstractC2101d;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31379a;
        if (i5 == 0) {
            Fe.e.U(obj);
            AbstractC2101d abstractC2101d2 = (AbstractC2101d) this.f31380b;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastActivity", "VastActivity received event: " + abstractC2101d2, null, false, 12, null);
            Hf.j0 j0Var = VastActivity.f31299e;
            this.f31380b = abstractC2101d2;
            this.f31379a = 1;
            if (j0Var.emit(abstractC2101d2, this) == aVar) {
                return aVar;
            }
            abstractC2101d = abstractC2101d2;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC2101d = (AbstractC2101d) this.f31380b;
            Fe.e.U(obj);
        }
        Hf.j0 j0Var2 = VastActivity.f31299e;
        if ((abstractC2101d instanceof C2100c) || AbstractC3340k.a(abstractC2101d, C2099b.f31609d)) {
            this.f31381c.finish();
        }
        return C2515C.f34653a;
    }
}
