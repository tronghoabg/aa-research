package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import Ef.E;
import Hf.C0588a0;
import Hf.k0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.K;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class e extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f30534b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30534b = gVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new e(this.f30534b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30533a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        i iVar = this.f30534b.f30541d;
        C0588a0 c0588a0 = new C0588a0(iVar.f30553e, iVar.f30557i, new K(3, null, 1));
        d dVar = new d(2, null);
        this.f30533a = 1;
        Object objP = k0.p(c0588a0, dVar, this);
        return objP == aVar ? aVar : objP;
    }
}
