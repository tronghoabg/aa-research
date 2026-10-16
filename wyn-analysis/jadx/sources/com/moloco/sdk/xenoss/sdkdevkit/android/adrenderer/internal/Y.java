package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import Hf.InterfaceC0603m;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class Y extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30047a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30048b;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        Y y10 = new Y(2, interfaceC3103c);
        y10.f30048b = obj;
        return y10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((InterfaceC0603m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30047a;
        if (i5 == 0) {
            Fe.e.U(obj);
            InterfaceC0603m interfaceC0603m = (InterfaceC0603m) this.f30048b;
            this.f30047a = 1;
            if (interfaceC0603m.emit(null, this) == aVar) {
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
