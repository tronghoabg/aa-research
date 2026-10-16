package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import Af.q;
import Ef.E;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.I;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2102b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class g extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public i f31678a;

    /* renamed from: b, reason: collision with root package name */
    public int f31679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f31680c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31680c = iVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new g(this.f31680c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31679b;
        if (i5 == 0) {
            Fe.e.U(obj);
            i iVar2 = this.f31680c;
            C2102b c2102b = iVar2.f31684a;
            I i10 = c2102b.f31665a;
            q qVar = new q(iVar2, 23);
            f fVar = new f(iVar2, 0);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar = iVar2.f31689f;
            this.f31678a = iVar2;
            this.f31679b = 1;
            Object objE = xg.g.e(i10, iVar2.f31685b, iVar2.f31686c, iVar2.f31687d, c2102b.f31666b, c2102b.f31667c, qVar, fVar, iVar2.f31688e, kVar, this);
            if (objE == aVar) {
                return aVar;
            }
            iVar = iVar2;
            obj = objE;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = this.f31678a;
            Fe.e.U(obj);
        }
        t tVar = (t) obj;
        iVar.f31696n = tVar;
        iVar.f31697o.j(tVar != null ? tVar.f32081a : null);
        return C2515C.f34653a;
    }
}
