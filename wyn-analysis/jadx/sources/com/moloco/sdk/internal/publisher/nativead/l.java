package com.moloco.sdk.internal.publisher.nativead;

import Ef.E;
import com.moloco.sdk.internal.ortb.model.C1906u;
import com.moloco.sdk.internal.publisher.C;
import com.moloco.sdk.publisher.MolocoAdKt;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class l extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f29165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f29166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1906u f29167c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f29168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C c10, o oVar, C1906u c1906u, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29165a = c10;
        this.f29166b = oVar;
        this.f29167c = c1906u;
        this.f29168d = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new l(this.f29165a, this.f29166b, this.f29167c, this.f29168d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        l lVar = (l) create((E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        lVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        String str = this.f29166b.f29206b;
        C1906u c1906u = this.f29167c;
        this.f29165a.b(MolocoAdKt.createAdInfo(str, new Float(c1906u.f28865b), c1906u.f28868e), this.f29168d, c1906u.f28867d.f28875d);
        return C2515C.f34653a;
    }
}
