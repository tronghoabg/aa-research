package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class v extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f28645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C8.i f28646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3471j f28647c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(C8.i iVar, tf.l lVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28646b = iVar;
        this.f28647c = (AbstractC3471j) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lf.j, tf.l] */
    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new v(this.f28646b, this.f28647c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [lf.j, tf.l] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f28645a;
        if (i5 == 0) {
            Fe.e.U(obj);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdScheduler", wg.b.c(new StringBuilder("Task "), (String) this.f28646b.f1940c, " invoked"), null, false, 12, null);
            this.f28645a = 1;
            if (this.f28647c.invoke(this) == aVar) {
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
