package com.moloco.sdk.internal.services.init;

import Ef.E;
import android.content.SharedPreferences;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class h extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.acm.recorder.b f29654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f29655b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f29656c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.moloco.sdk.acm.recorder.b bVar, a aVar, k kVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29654a = bVar;
        this.f29655b = aVar;
        this.f29656c = kVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new h(this.f29654a, this.f29655b, this.f29656c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        h hVar = (h) create((E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        hVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        k kVar = this.f29656c;
        a aVar = this.f29655b;
        kf.a aVar2 = kf.a.f39711a;
        Fe.e.U(obj);
        com.moloco.sdk.acm.recorder.b bVar = this.f29654a;
        com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) bVar;
        com.moloco.sdk.acm.l lVarC = cVar.c("SDKInitCacheClear");
        try {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Clearing cache for cacheKey: " + aVar.a(), null, false, 12, null);
            SharedPreferences.Editor editorEdit = kVar.f29664a.edit();
            AbstractC3340k.b(editorEdit);
            editorEdit.remove(aVar.a());
            if (editorEdit.commit()) {
                MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Successfully cleared cache for cacheKey: " + aVar.a(), null, false, 12, null);
                com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("SDKInitCacheClear");
                hVar.a("Result", "success");
                ((com.moloco.sdk.acm.recorder.c) bVar).a(hVar);
                lVarC.a("Result", "success");
                ((com.moloco.sdk.acm.recorder.c) bVar).b(lVarC);
            } else {
                MolocoLogger.warn$default(molocoLogger, "InitCacheImpl", "Failed to clear cache for cacheKey: " + aVar.a(), null, false, 12, null);
                com.moloco.sdk.acm.h hVar2 = new com.moloco.sdk.acm.h("SDKInitCacheClear");
                hVar2.a("Result", "failure");
                hVar2.a("Reason", "commit_failure");
                ((com.moloco.sdk.acm.recorder.c) bVar).a(hVar2);
                lVarC.a("Result", "failure");
                lVarC.a("Reason", "commit_failure");
                ((com.moloco.sdk.acm.recorder.c) bVar).b(lVarC);
            }
        } catch (Exception e7) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Failed to clear cache for cacheKey: " + aVar.a() + " with exception", e7, false, 8, null);
            com.moloco.sdk.acm.h hVar3 = new com.moloco.sdk.acm.h("SDKInitCacheClear");
            hVar3.a("Result", "failure");
            hVar3.a("Reason", e7.getClass().getSimpleName());
            cVar.a(hVar3);
            lVarC.a("Result", "failure");
            lVarC.a("Reason", e7.getClass().getSimpleName());
            cVar.b(lVarC);
        }
        return C2515C.f34653a;
    }
}
