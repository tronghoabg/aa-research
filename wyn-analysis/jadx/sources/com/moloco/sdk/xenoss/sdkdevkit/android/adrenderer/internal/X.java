package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.lifecycle.AbstractC1451o;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import p7.AbstractC3772b;

/* loaded from: classes4.dex */
public final class X extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30044a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1451o f30046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(AbstractC1451o abstractC1451o, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30046c = abstractC1451o;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        X x5 = new X(this.f30046c, interfaceC3103c);
        x5.f30045b = obj;
        return x5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((X) create((Gf.t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30044a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Gf.t tVar = (Gf.t) this.f30045b;
            V v2 = new V(tVar, 0);
            AbstractC1451o abstractC1451o = this.f30046c;
            abstractC1451o.a(v2);
            Bf.g gVar = new Bf.g(7, abstractC1451o, v2);
            this.f30044a = 1;
            if (AbstractC3772b.f(tVar, gVar, this) == aVar) {
                return aVar;
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
