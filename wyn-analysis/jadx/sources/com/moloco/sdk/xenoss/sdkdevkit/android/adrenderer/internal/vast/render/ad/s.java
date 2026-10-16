package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import Ef.E;
import Hf.k0;
import Hf.x0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class s extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f31654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f31655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x0 x0Var, x0 x0Var2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31654b = x0Var;
        this.f31655c = x0Var2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new s(this.f31654b, this.f31655c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31653a;
        if (i5 == 0) {
            Fe.e.U(obj);
            r rVar = new r(this.f31655c, null);
            this.f31653a = 1;
            if (k0.k(this.f31654b, rVar, this) == aVar) {
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
