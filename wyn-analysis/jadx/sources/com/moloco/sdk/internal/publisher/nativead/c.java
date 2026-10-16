package com.moloco.sdk.internal.publisher.nativead;

import Ef.H;
import Ef.H0;
import Ef.S;
import W1.r;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.C1913b;
import com.moloco.sdk.internal.publisher.b0;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC3340k;
import u0.L;
import u0.M0;

/* loaded from: classes4.dex */
public final class c implements NativeAd, b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29115a;

    /* renamed from: b, reason: collision with root package name */
    public final o f29116b;

    /* renamed from: c, reason: collision with root package name */
    public final a f29117c;

    /* renamed from: d, reason: collision with root package name */
    public final u f29118d;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.events.c f29119e;

    /* renamed from: f, reason: collision with root package name */
    public final G0 f29120f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n f29121g;

    /* renamed from: h, reason: collision with root package name */
    public final r f29122h;

    /* renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f29123i;

    /* renamed from: j, reason: collision with root package name */
    public NativeAd.InteractionListener f29124j;
    public final AdFormatType k;

    /* renamed from: l, reason: collision with root package name */
    public final Kd.a f29125l;

    /* renamed from: m, reason: collision with root package name */
    public final com.moloco.sdk.acm.l f29126m;

    /* renamed from: n, reason: collision with root package name */
    public C6.l f29127n;

    /* renamed from: o, reason: collision with root package name */
    public H0 f29128o;

    public c(String adUnitId, o oVar, a aVar, u uVar, com.moloco.sdk.internal.services.events.c cVar, G0 g02, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n nVar, r rVar, com.moloco.sdk.acm.recorder.c cVar2) {
        AbstractC3340k.e(adUnitId, "adUnitId");
        this.f29115a = adUnitId;
        this.f29116b = oVar;
        this.f29117c = aVar;
        this.f29118d = uVar;
        this.f29119e = cVar;
        this.f29120f = g02;
        this.f29121g = nVar;
        this.f29122h = rVar;
        this.f29123i = cVar2;
        this.k = AdFormatType.NATIVE;
        Lf.e eVar = S.f3698a;
        this.f29125l = H.c(Jf.n.f6132a);
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.f28497b;
        this.f29126m = cVar2.c("load_ad_time");
    }

    @Override // com.moloco.sdk.internal.publisher.b0
    public final void a(long j8, long j10) {
        this.f29122h.a(j8, j10);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public final void destroy() {
        H.j(this.f29125l, null);
        a aVar = this.f29117c;
        com.moloco.sdk.internal.publisher.nativead.ui.g gVar = aVar.k;
        if (gVar != null) {
            gVar.f29262a.destroy();
            gVar.removeAllViews();
            L l10 = gVar.f29264c;
            if (l10 != null) {
                M0 m02 = l10.f46181c;
                if (m02 != null) {
                    m02.dispose();
                }
                l10.f46181c = null;
                l10.requestLayout();
            }
            gVar.f29264c = null;
        }
        aVar.k = null;
        this.f29124j = null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public final NativeAd.Assets getAssets() {
        return this.f29117c;
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public final NativeAd.InteractionListener getInteractionListener() {
        return this.f29124j;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @Override // com.moloco.sdk.publisher.NativeAd
    public final void handleGeneralAdClick() {
        NativeAd.InteractionListener interactionListener = this.f29124j;
        if (interactionListener != null) {
            interactionListener.onGeneralClickHandled();
        }
        C6.l lVar = this.f29127n;
        if (lVar != null) {
            com.moloco.sdk.internal.publisher.nativead.model.g gVar = ((com.moloco.sdk.internal.publisher.nativead.model.h) lVar.f1846c).f29189b;
            if (gVar != null) {
                S3.n nVar = (S3.n) lVar.f1849f;
                nVar.getClass();
                for (String str : gVar.f29187b) {
                    LinkedHashSet linkedHashSet = (LinkedHashSet) nVar.f10973d;
                    if (!linkedHashSet.contains(str)) {
                        ((com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n) nVar.f10972c).a(str);
                        linkedHashSet.add(str);
                    }
                }
                ((G0) lVar.f1847d).a(gVar.f29186a);
            }
            ((C1913b) lVar.f1848e).c(MolocoAdKt.createAdInfo$default((String) lVar.f1845b, null, null, 6, null));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // com.moloco.sdk.publisher.NativeAd
    public final void handleImpression() {
        NativeAd.InteractionListener interactionListener = this.f29124j;
        if (interactionListener != null) {
            interactionListener.onImpressionHandled();
        }
        C6.l lVar = this.f29127n;
        if (lVar != null) {
            S3.n nVar = (S3.n) lVar.f1849f;
            ?? r22 = nVar.f10970a;
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n nVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n) nVar.f10972c;
            if (r22 != 0) {
                Iterator it = r22.iterator();
                while (it.hasNext()) {
                    nVar2.a((String) it.next());
                }
            }
            nVar.f10970a = null;
            ?? r42 = nVar.f10971b;
            if (r42 != 0) {
                for (com.moloco.sdk.internal.publisher.nativead.model.f fVar : r42) {
                    String str = fVar.f29185c;
                    if (str != null && fVar.f29183a == 1 && fVar.f29184b == 1) {
                        nVar2.a(str);
                    }
                }
            }
            nVar.f10971b = null;
            ((C1913b) lVar.f1848e).b(MolocoAdKt.createAdInfo$default((String) lVar.f1845b, null, null, 6, null), null);
        }
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final boolean isLoaded() {
        return this.f29117c.f29107h != null;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final synchronized void load(String bidResponseJson, AdLoad.Listener listener) {
        AbstractC3340k.e(bidResponseJson, "bidResponseJson");
        H0 h02 = this.f29128o;
        if (h02 != null && h02.isActive()) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "NativeAdImpl", "load() called while another load operation is in progress. Ignoring this call.", null, false, 12, null);
        } else if (isLoaded()) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "NativeAdImpl", "load() called but ad is already loaded. Ignoring this call.", null, false, 12, null);
        } else {
            this.f29128o = H.D(this.f29125l, null, new b(this, listener, bidResponseJson, null), 3);
        }
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public final void setInteractionListener(NativeAd.InteractionListener interactionListener) {
        this.f29124j = interactionListener;
    }
}
