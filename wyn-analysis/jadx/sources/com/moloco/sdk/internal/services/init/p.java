package com.moloco.sdk.internal.services.init;

import Ef.E;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MediationInfo;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class p extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f29675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f29676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29677c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MediationInfo f29678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.acm.recorder.b f29679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, String str, MediationInfo mediationInfo, com.moloco.sdk.acm.recorder.b bVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29676b = sVar;
        this.f29677c = str;
        this.f29678d = mediationInfo;
        this.f29679e = bVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new p(this.f29676b, this.f29677c, this.f29678d, this.f29679e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29675a;
        if (i5 == 0) {
            Fe.e.U(obj);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitService", "Async fetching init response", null, false, 12, null);
            this.f29675a = 1;
            if (this.f29676b.a(this.f29677c, this.f29678d, this.f29679e, true, this) == aVar) {
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
