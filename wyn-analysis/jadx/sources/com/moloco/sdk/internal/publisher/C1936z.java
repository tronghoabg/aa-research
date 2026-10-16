package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.ortb.model.C1906u;
import com.moloco.sdk.internal.ortb.model.C1908w;
import com.moloco.sdk.publisher.MolocoAdError;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.internal.publisher.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1936z extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f29359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f29360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a f29361c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1936z(B b5, C c10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29359a = b5;
        this.f29360b = c10;
        this.f29361c = aVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1936z(this.f29359a, this.f29360b, this.f29361c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C1936z c1936z = (C1936z) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c1936z.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        C1908w c1908w;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        B b5 = this.f29359a;
        b5.k = false;
        com.moloco.sdk.internal.r rVarA = com.moloco.sdk.internal.s.a(b5.f28893b, MolocoAdError.ErrorType.AD_LOAD_TIMEOUT_ERROR, this.f29361c, ff.w.f35433a);
        C1906u c1906uA = B.a(b5, b5.f28903m);
        this.f29360b.a(rVarA, (c1906uA == null || (c1908w = c1906uA.f28867d) == null) ? null : c1908w.f28875d);
        return C2515C.f34653a;
    }
}
