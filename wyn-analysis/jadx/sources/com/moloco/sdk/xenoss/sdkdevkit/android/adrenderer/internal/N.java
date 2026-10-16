package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class N extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f29996a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f29997b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Gf.t f29998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Gf.t tVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29998c = tVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        N n10 = new N(this.f29998c, interfaceC3103c);
        n10.f29997b = ((Boolean) obj).booleanValue();
        return n10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((N) create(bool, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29996a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Boolean boolValueOf = Boolean.valueOf(this.f29997b);
            this.f29996a = 1;
            if (((Gf.s) this.f29998c).f4839d.i(boolValueOf, this) == aVar) {
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
