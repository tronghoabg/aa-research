package com.moloco.sdk.internal.services.init;

import Ef.E;
import android.util.Base64;
import com.moloco.sdk.K0;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class j extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.acm.recorder.b f29660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f29661b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K0 f29662c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f29663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.moloco.sdk.acm.recorder.b bVar, a aVar, K0 k02, k kVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29660a = bVar;
        this.f29661b = aVar;
        this.f29662c = k02;
        this.f29663d = kVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new j(this.f29660a, this.f29661b, this.f29662c, this.f29663d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        jVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        boolean z2;
        a aVar2 = this.f29661b;
        kf.a aVar3 = kf.a.f39711a;
        Fe.e.U(obj);
        com.moloco.sdk.acm.recorder.b bVar = this.f29660a;
        com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) bVar;
        com.moloco.sdk.acm.l lVarC = cVar.c("SDKInitCacheWrite");
        try {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            aVar = aVar2;
            try {
                MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Updating cache for cacheKey: " + aVar.a(), null, false, 12, null);
                String strEncodeToString = Base64.encodeToString(this.f29662c.toByteArray(), 0);
                if (strEncodeToString == null || strEncodeToString.length() == 0) {
                    MolocoLogger.warn$default(molocoLogger, "InitCacheImpl", "Failed to encode SDKInitResponse for cacheKey: " + aVar.a(), null, false, 12, null);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 ? this.f29663d.f29664a.edit().putString(aVar.a(), strEncodeToString).commit() : false) {
                    MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Successfully updated cache for cacheKey: " + aVar.a(), null, false, 12, null);
                    lVarC.a("Result", "success");
                    ((com.moloco.sdk.acm.recorder.c) bVar).b(lVarC);
                    com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("SDKInitCacheWrite");
                    hVar.a("Result", "success");
                    ((com.moloco.sdk.acm.recorder.c) bVar).a(hVar);
                } else {
                    String str = z2 ? "encoding_failure" : "commit_failure";
                    MolocoLogger.warn$default(molocoLogger, "InitCacheImpl", "Failed to update cache for cacheKey: " + aVar.a() + " with error: " + str, null, false, 12, null);
                    lVarC.a("Result", "failure");
                    lVarC.a("Reason", str);
                    ((com.moloco.sdk.acm.recorder.c) bVar).b(lVarC);
                    com.moloco.sdk.acm.h hVar2 = new com.moloco.sdk.acm.h("SDKInitCacheWrite");
                    hVar2.a("Result", "failure");
                    hVar2.a("Reason", str);
                    ((com.moloco.sdk.acm.recorder.c) bVar).a(hVar2);
                }
            } catch (Exception e7) {
                e = e7;
                Exception exc = e;
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Failed to update cache for cacheKey: " + aVar.a() + " with exception", exc, false, 8, null);
                lVarC.a("Result", "failure");
                lVarC.a("Reason", exc.getClass().getSimpleName());
                cVar.b(lVarC);
                com.moloco.sdk.acm.h hVar3 = new com.moloco.sdk.acm.h("SDKInitCacheWrite");
                hVar3.a("Result", "failure");
                hVar3.a("Reason", exc.getClass().getSimpleName());
                cVar.a(hVar3);
                return C2515C.f34653a;
            }
        } catch (Exception e10) {
            e = e10;
            aVar = aVar2;
        }
        return C2515C.f34653a;
    }
}
