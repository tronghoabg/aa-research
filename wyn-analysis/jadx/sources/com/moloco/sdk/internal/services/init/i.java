package com.moloco.sdk.internal.services.init;

import Ef.E;
import android.content.SharedPreferences;
import android.util.Base64;
import com.moloco.sdk.K0;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class i extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.acm.recorder.c f29657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f29658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f29659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.moloco.sdk.acm.recorder.c cVar, a aVar, k kVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29657a = cVar;
        this.f29658b = aVar;
        this.f29659c = kVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new i(this.f29657a, this.f29658b, this.f29659c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        k kVar = this.f29659c;
        a aVar = this.f29658b;
        kf.a aVar2 = kf.a.f39711a;
        Fe.e.U(obj);
        com.moloco.sdk.acm.recorder.c cVar = this.f29657a;
        com.moloco.sdk.acm.l lVarC = cVar.c("SDKInitCacheRead");
        try {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Reading cache for cacheKey: " + aVar.a(), null, false, 12, null);
            SharedPreferences sharedPreferences = kVar.f29664a;
            k.a(kVar, aVar, sharedPreferences);
            String string = sharedPreferences.getString(aVar.a(), null);
            K0 k0O = string != null ? K0.o(Base64.decode(string, 0)) : null;
            if (k0O != null) {
                MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Successfully read cache for cacheKey: " + aVar.a(), null, false, 12, null);
                lVarC.a("Result", "success");
                cVar.b(lVarC);
                com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("SDKInitCacheRead");
                hVar.a("Result", "success");
                cVar.a(hVar);
                return k0O;
            }
            MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Failed to read from cache (cache_miss) for cacheKey: " + aVar.a(), null, false, 12, null);
            lVarC.a("Result", "failure");
            lVarC.a("Reason", "cache_miss");
            cVar.b(lVarC);
            com.moloco.sdk.acm.h hVar2 = new com.moloco.sdk.acm.h("SDKInitCacheRead");
            hVar2.a("Result", "failure");
            hVar2.a("Reason", "cache_miss");
            cVar.a(hVar2);
            return k0O;
        } catch (Exception e7) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Failed to read cache for cacheKey: " + aVar.a() + " with exception", e7, false, 8, null);
            lVarC.a("Result", "failure");
            lVarC.a("Reason", e7.getClass().getSimpleName());
            cVar.b(lVarC);
            com.moloco.sdk.acm.h hVar3 = new com.moloco.sdk.acm.h("SDKInitCacheRead");
            hVar3.a("Result", "failure");
            hVar3.a("Reason", e7.getClass().getSimpleName());
            cVar.a(hVar3);
            return null;
        }
    }
}
