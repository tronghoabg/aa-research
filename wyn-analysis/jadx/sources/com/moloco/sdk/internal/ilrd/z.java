package com.moloco.sdk.internal.ilrd;

import Ef.F;
import Ef.H;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.C3109i;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class z extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f28657b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a5, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28657b = a5;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        z zVar = new z(this.f28657b, interfaceC3103c);
        zVar.f28656a = obj;
        return zVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) create((t) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        zVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        t ilrdData = (t) this.f28656a;
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdService", "Revenue event: " + ilrdData, null, false, 12, null);
        m mVar = this.f28657b.f28535b;
        AbstractC3340k.e(ilrdData, "ilrdData");
        H.C(mVar.f28581a, C3109i.f38759a, F.f3663a, new C1884c(mVar, ilrdData, null));
        return C2515C.f34653a;
    }
}
