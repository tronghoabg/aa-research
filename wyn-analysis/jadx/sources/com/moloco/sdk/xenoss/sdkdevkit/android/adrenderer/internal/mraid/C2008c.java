package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import Hf.j0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AbstractC2101d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C2098a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C2099b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C2100c;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2008c extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30391a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MraidActivity f30393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2008c(MraidActivity mraidActivity, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30393c = mraidActivity;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2008c c2008c = new C2008c(this.f30393c, interfaceC3103c);
        c2008c.f30392b = obj;
        return c2008c;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2008c) create((AbstractC2101d) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        AbstractC2101d abstractC2101d;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30391a;
        if (i5 == 0) {
            Fe.e.U(obj);
            AbstractC2101d abstractC2101d2 = (AbstractC2101d) this.f30392b;
            j0 j0Var = MraidActivity.f30371h;
            this.f30392b = abstractC2101d2;
            this.f30391a = 1;
            if (j0Var.emit(abstractC2101d2, this) == aVar) {
                return aVar;
            }
            abstractC2101d = abstractC2101d2;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC2101d = (AbstractC2101d) this.f30392b;
            Fe.e.U(obj);
        }
        if (abstractC2101d instanceof C2098a) {
            AbstractC2012g.f30409i.invoke();
        } else {
            j0 j0Var2 = MraidActivity.f30371h;
            boolean z2 = abstractC2101d instanceof C2100c;
            MraidActivity mraidActivity = this.f30393c;
            if (z2) {
                mraidActivity.finish();
            } else if (AbstractC3340k.a(abstractC2101d, C2099b.f31609d)) {
                mraidActivity.f30376f = true;
                mraidActivity.finish();
            }
        }
        return C2515C.f34653a;
    }
}
