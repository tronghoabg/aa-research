package com.moloco.sdk.internal.publisher;

import Ef.H0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C1890d;
import com.moloco.sdk.internal.ortb.model.C1906u;
import com.moloco.sdk.internal.ortb.model.C1908w;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdErrorKt;
import com.moloco.sdk.publisher.MolocoAdKt;
import ef.C2515C;
import java.util.Locale;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.internal.publisher.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1932v extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f29344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f29345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29346c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdLoad.Listener f29347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f29348e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1932v(B b5, String str, AdLoad.Listener listener, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29345b = b5;
        this.f29346c = str;
        this.f29347d = listener;
        this.f29348e = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1932v(this.f29345b, this.f29346c, this.f29347d, this.f29348e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1932v) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        C1908w c1908w;
        C1908w c1908w2;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29344a;
        B b5 = this.f29345b;
        if (i5 == 0) {
            Fe.e.U(obj);
            this.f29344a = 1;
            objB = B.b(b5, this.f29346c, this);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            objB = obj;
        }
        String str = (String) objB;
        C2515C c2515c = C2515C.f34653a;
        com.moloco.sdk.acm.l acmLoadTimerEvent = b5.f28904n;
        com.moloco.sdk.acm.recorder.c cVar = b5.f28899h;
        String str2 = b5.f28893b;
        AdFormatType adFormatType = b5.f28897f;
        AdLoad.Listener listener = this.f29347d;
        if (str == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdLoadImpl", "Could not pre-process the bid response. Failing the load() call.", null, false, 12, null);
            if (listener != null) {
                listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(str2, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR));
            }
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            acmLoadTimerEvent.a("result", "failure");
            MolocoAdError.ErrorType errorType = MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
            acmLoadTimerEvent.a("reason", String.valueOf(errorType.getErrorCode()));
            String strName = adFormatType.name();
            Locale locale = Locale.ROOT;
            String lowerCase = strName.toLowerCase(locale);
            AbstractC3340k.d(lowerCase, "toLowerCase(...)");
            acmLoadTimerEvent.a("ad_type", lowerCase);
            cVar.b(acmLoadTimerEvent);
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("load_ad_failed");
            hVar.a("reason", String.valueOf(errorType.getErrorCode()));
            String lowerCase2 = adFormatType.name().toLowerCase(locale);
            AbstractC3340k.d(lowerCase2, "toLowerCase(...)");
            hVar.a("ad_type", lowerCase2);
            cVar.a(hVar);
            return c2515c;
        }
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "AdLoad", "Processed the bidResponse, proceeding with the load() call.", null, false, 12, null);
        tf.a aVar2 = b5.f28900i;
        AbstractC3340k.e(acmLoadTimerEvent, "acmLoadTimerEvent");
        AbstractC3340k.e(adFormatType, "adFormatType");
        C c10 = new C(listener, (com.moloco.sdk.internal.B) com.moloco.sdk.internal.C.f28485a.getValue(), acmLoadTimerEvent, adFormatType, cVar, aVar2);
        C1890d c1890d = null;
        if (AbstractC3340k.a(b5.f28902l, str)) {
            if (b5.k) {
                MolocoAd molocoAdCreateAdInfo$default = MolocoAdKt.createAdInfo$default(str2, null, null, 6, null);
                C1906u c1906uA = B.a(b5, b5.f28903m);
                c10.b(molocoAdCreateAdInfo$default, this.f29348e, (c1906uA == null || (c1908w2 = c1906uA.f28867d) == null) ? null : c1908w2.f28875d);
                C1906u c1906uA2 = B.a(b5, b5.f28903m);
                if (c1906uA2 != null && (c1908w = c1906uA2.f28867d) != null) {
                    c1890d = c1908w.f28875d;
                }
                c10.c(molocoAdCreateAdInfo$default, c1890d);
                return c2515c;
            }
            H0 h02 = b5.f28905o;
            if (h02 != null && h02.isActive()) {
                MolocoLogger.info$default(molocoLogger, "AdLoad", "Already loading ad " + adFormatType + ' ' + str2 + ". Returning", null, false, 12, null);
                return c2515c;
            }
        }
        H0 h03 = b5.f28905o;
        if (h03 != null) {
            h03.cancel(null);
        }
        b5.f28905o = Ef.H.D(b5.f28901j, null, new A(b5, str, this.f29348e, c10, null), 3);
        return c2515c;
    }
}
