package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import Hf.j0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class q extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public C f30437a;

    /* renamed from: b, reason: collision with root package name */
    public int f30438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.internal.A f30439c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ K8.H f30440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.moloco.sdk.internal.A a5, K8.H h10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30439c = a5;
        this.f30440d = h10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new q(this.f30439c, this.f30440d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        C c10;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30438b;
        K8.H h10 = this.f30440d;
        if (i5 == 0) {
            Fe.e.U(obj);
            C c11 = (C) ((com.moloco.sdk.internal.z) this.f30439c).f29794a;
            j0 j0Var = (j0) h10.f6584c;
            this.f30437a = c11;
            this.f30438b = 1;
            if (j0Var.emit(c11, this) == aVar) {
                return aVar;
            }
            c10 = c11;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10 = this.f30437a;
            Fe.e.U(obj);
        }
        h10.getClass();
        h10.h("mraidbridge.nativeCallComplete(" + JSONObject.quote(c10.f30339a) + ')');
        return C2515C.f34653a;
    }
}
