package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class l extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f28578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f28579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f28580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, m mVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28579b = rVar;
        this.f28580c = mVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new l(this.f28579b, this.f28580c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f28578a;
        if (i5 == 0) {
            Fe.e.U(obj);
            r rVar = this.f28579b;
            String strB = Xf.c.f16251d.b(q.Companion.serializer(), new q(rVar.c(), rVar.b(), rVar.f28641f, rVar.f28639d));
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Storing current session: ".concat(strB), null, false, 12, null);
            m mVar = this.f28580c;
            this.f28578a = 1;
            if (mVar.f28591l.a("ilrd_session_store", strB, this) == aVar) {
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
