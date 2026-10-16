package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import A.C0212e;
import Ef.E;
import N.V;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class i extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f31009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0212e f31010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V f31011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C0212e c0212e, V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31010b = c0212e;
        this.f31011c = v2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new i(this.f31010b, this.f31011c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31009a;
        if (i5 == 0) {
            Fe.e.U(obj);
            if (!((Boolean) this.f31011c.getValue()).booleanValue()) {
                this.f31009a = 1;
                if (this.f31010b.f(this) == aVar) {
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
