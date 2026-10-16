package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import Hf.C0605o;
import N.C0718d;
import N.V;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class r extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f30969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V f30970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(V v2, V v10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30969b = v2;
        this.f30970c = v10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new r(this.f30969b, this.f30970c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30968a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Hf.F f10 = new Hf.F(new C0605o(C0718d.N(new C2054o(this.f30969b, 0)), 3), 0);
            C2055p c2055p = new C2055p(this.f30970c, 0);
            this.f30968a = 1;
            if (f10.collect(c2055p, this) == aVar) {
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
