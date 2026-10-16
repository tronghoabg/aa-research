package com.moloco.sdk.internal.publisher.nativead;

import Ef.E;
import com.moloco.sdk.internal.B;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C1906u;
import com.moloco.sdk.internal.publisher.C;
import com.moloco.sdk.internal.s;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import ef.C2515C;
import ef.C2530n;
import ff.w;
import java.util.Locale;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import tf.p;
import u0.L;

/* loaded from: classes4.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public C f29110a;

    /* renamed from: b, reason: collision with root package name */
    public int f29111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f29112c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdLoad.Listener f29113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f29114e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AdLoad.Listener listener, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29112c = cVar;
        this.f29113d = listener;
        this.f29114e = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new b(this.f29112c, this.f29113d, this.f29114e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        Object objG;
        C c10;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29111b;
        c cVar = this.f29112c;
        AdFormatType adFormatType = cVar.k;
        com.moloco.sdk.acm.recorder.c cVar2 = cVar.f29123i;
        if (i5 == 0) {
            Fe.e.U(obj);
            com.moloco.sdk.acm.l acmLoadTimerEvent = cVar.f29126m;
            AbstractC3340k.e(acmLoadTimerEvent, "acmLoadTimerEvent");
            AbstractC3340k.e(adFormatType, "adFormatType");
            C c11 = new C(this.f29113d, (B) com.moloco.sdk.internal.C.f28485a.getValue(), acmLoadTimerEvent, adFormatType, cVar2, null);
            o oVar = cVar.f29116b;
            this.f29110a = c11;
            this.f29111b = 1;
            objG = oVar.g(this.f29114e, acmLoadTimerEvent, c11, this);
            if (objG == aVar) {
                return aVar;
            }
            c10 = c11;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10 = this.f29110a;
            Fe.e.U(obj);
            objG = ((C2530n) obj).f34674a;
        }
        Throwable thA = C2530n.a(objG);
        C2515C c2515c = C2515C.f34653a;
        if (thA != null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "NativeAdImpl", "Failed to load native ad.", thA, false, 8, null);
            return c2515c;
        }
        d dVar = (d) objG;
        com.moloco.sdk.internal.publisher.nativead.model.l lVar = (com.moloco.sdk.internal.publisher.nativead.model.l) dVar.f29131c.f29200d.get(2);
        boolean z2 = (lVar != null ? lVar.f29195b : null) != null;
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = dVar.f29131c;
        boolean z10 = nVar.b(1) != null;
        String str = cVar.f29115a;
        C1906u c1906u = dVar.f29129a;
        if (z2) {
            try {
                int i10 = L.f46134j;
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.error$default(molocoLogger, "NativeAdImpl", "Compose dependency not available for native video ad", null, false, 12, null);
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("native_ad_compose_not_available");
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
                AbstractC3340k.d(lowerCase, "toLowerCase(...)");
                hVar.a("ad_type", lowerCase);
                cVar2.a(hVar);
                if (!z10) {
                    c10.a(s.a(str, MolocoAdError.ErrorType.AD_LOAD_FAILED, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.f30121f, w.f35433a), c1906u.f28867d.f28875d);
                    return c2515c;
                }
                MolocoLogger.warn$default(molocoLogger, "NativeAdImpl", "Compose not available, native video ad will fall back to image view", null, false, 12, null);
            }
        }
        cVar.f29127n = new C6.l(cVar.f29115a, dVar.f29129a, dVar.f29130b, cVar.f29118d, cVar.f29119e, cVar.k, cVar.f29121g, cVar.f29120f, cVar2);
        a aVar2 = cVar.f29117c;
        aVar2.f29107h = nVar;
        aVar2.f29106g = new S8.d(0, cVar, c.class, "handleGeneralAdClick", "handleGeneralAdClick()V", 0, 5);
        c10.c(MolocoAdKt.createAdInfo$default(str, new Float(c1906u.f28865b), null, 4, null), c1906u.f28867d.f28875d);
        return c2515c;
    }
}
