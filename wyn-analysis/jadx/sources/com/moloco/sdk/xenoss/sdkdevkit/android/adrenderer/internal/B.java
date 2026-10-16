package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.ortb.model.C1906u;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class B extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f29895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f29896b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(H h10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29896b = h10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new B(this.f29896b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29895a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        H h10 = this.f29896b;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E e7 = h10.f29946c;
        C1906u c1906u = h10.f29944a;
        String str = c1906u.f28864a;
        String str2 = c1906u.f28867d.f28873b;
        if (str2 == null) {
            str2 = "UNKNOWN_MTID";
        }
        this.f29895a = 1;
        Object objI = e7.i(str, str2, false, this);
        return objI == aVar ? aVar : objI;
    }
}
