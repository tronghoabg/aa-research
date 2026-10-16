package com.moloco.sdk.internal.services.analytics;

import Ef.E;
import Fe.e;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class a extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f29397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f29398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29398b = cVar;
        this.f29399c = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new a(this.f29398b, this.f29399c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29397a;
        c cVar = this.f29398b;
        if (i5 == 0) {
            e.U(obj);
            com.moloco.sdk.internal.services.events.c cVar2 = cVar.f29405b;
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.f32403j;
            String str = cVar.f29406c.f29607a.f29612d;
            this.f29397a = 1;
            obj = cVar2.a(this.f29399c, aVar2, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
        }
        cVar.f29404a.a((String) obj);
        return C2515C.f34653a;
    }
}
