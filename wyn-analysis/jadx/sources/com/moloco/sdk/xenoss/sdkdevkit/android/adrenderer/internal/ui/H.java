package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import Hf.C0596f;
import Hf.f0;
import N.C0718d;
import N.V;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class H extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f30807b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V f30808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(V v2, V v10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30807b = v2;
        this.f30808c = v10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new H(this.f30807b, this.f30808c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30806a;
        C2515C c2515c = C2515C.f34653a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return c2515c;
        }
        Fe.e.U(obj);
        f0 f0VarN = C0718d.N(new C2054o(this.f30807b, 1));
        C2055p c2055p = new C2055p(this.f30808c, 1);
        this.f30806a = 1;
        Object objCollect = f0VarN.collect(new C0596f(c2055p, 6), this);
        if (objCollect != aVar) {
            objCollect = c2515c;
        }
        return objCollect == aVar ? aVar : c2515c;
    }
}
