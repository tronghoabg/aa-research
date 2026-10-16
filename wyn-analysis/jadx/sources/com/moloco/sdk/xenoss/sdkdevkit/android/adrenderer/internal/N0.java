package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class N0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f29999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q0 f30000b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(Q0 q02, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30000b = q02;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new N0(this.f30000b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((N0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.i, tf.l] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29999a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        ?? r42 = this.f30000b.f30027d;
        this.f29999a = 1;
        Object objInvoke = r42.invoke(this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
