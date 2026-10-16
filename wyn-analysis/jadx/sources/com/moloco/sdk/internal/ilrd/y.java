package com.moloco.sdk.internal.ilrd;

import E5.Q;
import Hf.Z;
import Hf.k0;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import ef.C2529m;
import ef.C2530n;
import java.util.List;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class y extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f28655a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a5, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28655a = a5;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new y(this.f28655a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        yVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        A a5 = this.f28655a;
        for (u uVar : (List) a5.f28536c.getValue()) {
            E e7 = (E) uVar.getState().getValue();
            if (e7 instanceof B) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdService", "Failed to subscribe to " + uVar.a() + " ILRD: " + ((B) e7).f28539a, null, false, 12, null);
            } else if (e7 instanceof D) {
                Object objB = uVar.b();
                Throwable thA = C2530n.a(objB);
                if (thA != null) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdService", "Failed to subscribe to " + uVar.a() + " ILRD: " + thA, null, false, 12, null);
                }
                if (!(objB instanceof C2529m)) {
                    a5.f28537d.add(uVar);
                    k0.u(new Z(uVar.c(), new z(a5, null), 0), a5.f28534a);
                }
            } else if (!(e7 instanceof C)) {
                throw new Q((byte) 0, 9);
            }
        }
        return C2515C.f34653a;
    }
}
