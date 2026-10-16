package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import Ef.E;
import Hf.e0;
import Hf.k0;
import Hf.x0;
import R1.q;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class k extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f32055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f32056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32056b = qVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new k(this.f32056b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        e0 e0Var;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f32055a;
        if (i5 == 0) {
            Fe.e.U(obj);
            q qVar = this.f32056b;
            b7.k kVar = (b7.k) qVar.f10160d;
            if (kVar == null) {
                qVar.f10160d = new b7.k(qVar.f10157a, (Kd.a) qVar.f10159c);
            } else {
                e0 e0VarC = ic.d.c(qVar.f10157a, (Kd.a) kVar.f19396b, null);
                x0 x0Var = (x0) kVar.f19397c;
                x0Var.getClass();
                x0Var.k(null, e0VarC);
            }
            b7.k kVar2 = (b7.k) qVar.f10160d;
            if (kVar2 != null && (e0Var = (e0) kVar2.f19398d) != null) {
                j jVar = new j(qVar, null);
                this.f32055a = 1;
                if (k0.k(e0Var, jVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return C2515C.f34653a;
    }
}
