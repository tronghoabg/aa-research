package com.moloco.sdk.internal.ilrd;

import Ef.H;
import Va.M6;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import java.text.SimpleDateFormat;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class w extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f28648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C8.i f28649b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f28650c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC3471j f28651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(C8.i iVar, long j8, tf.l lVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28649b = iVar;
        this.f28650c = j8;
        this.f28651d = (AbstractC3471j) lVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [lf.j, tf.l] */
    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new w(this.f28649b, this.f28650c, this.f28651d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [lf.j, tf.l] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f28648a;
        C8.i iVar = this.f28649b;
        if (i5 == 0) {
            Fe.e.U(obj);
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) iVar.f1943f;
            ((com.moloco.sdk.internal.services.k) iVar.f1941d).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j8 = this.f28650c;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdScheduler", M6.t(new StringBuilder("Task "), (String) iVar.f1940c, " scheduled at ", simpleDateFormat.format(new Long(Cf.a.d(j8) + jCurrentTimeMillis))), null, false, 12, null);
            this.f28648a = 1;
            if (H.n(j8, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        H.D((Kd.a) iVar.f1939b, null, new v(iVar, this.f28651d, null), 3);
        return C2515C.f34653a;
    }
}
