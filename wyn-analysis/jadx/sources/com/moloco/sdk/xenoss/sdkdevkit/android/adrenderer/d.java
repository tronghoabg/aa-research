package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import Ef.E;
import Hf.k0;
import Hf.v0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class d extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f29878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f29879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29880c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f29881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, long j8, g gVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29879b = eVar;
        this.f29880c = j8;
        this.f29881d = gVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new d(this.f29879b, this.f29880c, this.f29881d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29878a;
        e eVar = this.f29879b;
        if (i5 == 0) {
            Fe.e.U(obj);
            eVar.getAdLoader().a(this.f29880c, this.f29881d);
            v0 v0VarIsLoaded = eVar.isLoaded();
            c cVar = new c(2, null);
            this.f29878a = 1;
            if (k0.p(v0VarIsLoaded, cVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        eVar.b();
        return C2515C.f34653a;
    }
}
