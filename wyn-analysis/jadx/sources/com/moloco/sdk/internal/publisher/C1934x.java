package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.ortb.model.C1906u;
import com.moloco.sdk.internal.ortb.model.C1908w;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdKt;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.internal.publisher.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1934x extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f29353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f29354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1906u f29355c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1934x(B b5, C c10, C1906u c1906u, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29353a = b5;
        this.f29354b = c10;
        this.f29355c = c1906u;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1934x(this.f29353a, this.f29354b, this.f29355c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C1934x c1934x = (C1934x) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c1934x.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        C1908w c1908w;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        B b5 = this.f29353a;
        b5.k = true;
        C1906u c1906u = this.f29355c;
        MolocoAd molocoAdCreateAdInfo = MolocoAdKt.createAdInfo(b5.f28893b, new Float(c1906u.f28865b), c1906u.f28868e);
        C1906u c1906uA = B.a(b5, b5.f28903m);
        this.f29354b.c(molocoAdCreateAdInfo, (c1906uA == null || (c1908w = c1906uA.f28867d) == null) ? null : c1908w.f28875d);
        return C2515C.f34653a;
    }
}
