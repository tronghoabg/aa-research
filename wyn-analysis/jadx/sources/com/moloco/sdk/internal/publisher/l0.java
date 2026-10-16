package com.moloco.sdk.internal.publisher;

import Ef.C0507p0;
import android.content.Context;
import com.moloco.sdk.internal.ortb.model.C1903q;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;
import vf.AbstractC4345a;

/* loaded from: classes4.dex */
public final class l0 implements FullscreenAd, b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29057a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.u f29058b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.events.c f29059c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29060d;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n f29061e;

    /* renamed from: f, reason: collision with root package name */
    public final G0 f29062f;

    /* renamed from: g, reason: collision with root package name */
    public final tf.l f29063g;

    /* renamed from: h, reason: collision with root package name */
    public final C8.i f29064h;

    /* renamed from: i, reason: collision with root package name */
    public final AdFormatType f29065i;

    /* renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v f29066j;
    public final W1.r k;

    /* renamed from: l, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f29067l;

    /* renamed from: m, reason: collision with root package name */
    public final Kd.a f29068m;

    /* renamed from: n, reason: collision with root package name */
    public final com.moloco.sdk.acm.l f29069n;

    /* renamed from: o, reason: collision with root package name */
    public com.moloco.sdk.acm.l f29070o;

    /* renamed from: p, reason: collision with root package name */
    public final B f29071p;

    /* renamed from: q, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k f29072q;

    /* renamed from: r, reason: collision with root package name */
    public C1903q f29073r;

    /* renamed from: s, reason: collision with root package name */
    public Ff.d f29074s;

    /* renamed from: t, reason: collision with root package name */
    public Af.q f29075t;

    public l0(Context context, com.moloco.sdk.internal.services.u uVar, com.moloco.sdk.internal.services.events.c cVar, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n nVar, G0 g02, tf.l lVar, C8.i iVar, AdFormatType adFormatType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar, W1.r rVar, com.moloco.sdk.acm.recorder.c cVar2) {
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(adFormatType, "adFormatType");
        this.f29057a = context;
        this.f29058b = uVar;
        this.f29059c = cVar;
        this.f29060d = adUnitId;
        this.f29061e = nVar;
        this.f29062f = g02;
        this.f29063g = lVar;
        this.f29064h = iVar;
        this.f29065i = adFormatType;
        this.f29066j = vVar;
        this.k = rVar;
        this.f29067l = cVar2;
        Lf.e eVar = Ef.S.f3698a;
        Kd.a aVarC = Ef.H.c(Jf.n.f6132a);
        this.f29068m = aVarC;
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.f28497b;
        com.moloco.sdk.acm.l lVarC = cVar2.c("ad_create_to_load_ms");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
        lVarC.a("ad_type", lowerCase);
        this.f29069n = lVarC;
        this.f29071p = AbstractC4345a.c(aVarC, new Af.r(this, 17), adUnitId, new C0507p0(1, this, l0.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0, 2), adFormatType, (com.moloco.sdk.internal.services.l) com.moloco.sdk.service_locator.a.f29830a.getValue(), cVar2, new d0(this, 0));
        this.f29072q = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k) lVar.invoke(null);
    }

    @Override // com.moloco.sdk.internal.publisher.b0
    public final void a(long j8, long j10) {
        this.k.a(j8, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.moloco.sdk.internal.r r5) {
        /*
            r4 = this;
            C8.i r0 = r4.f29064h
            java.lang.Object r1 = r0.f1942e
            Ef.H0 r1 = (Ef.H0) r1
            r2 = 0
            if (r1 == 0) goto Lc
            r1.cancel(r2)
        Lc:
            r0.f1942e = r2
            java.lang.Object r1 = r0.f1939b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o) r1
            if (r1 == 0) goto L28
            Hf.v0 r1 = r1.l()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = 1
            if (r1 != r3) goto L28
            goto L29
        L28:
            r3 = 0
        L29:
            java.lang.Object r1 = r0.f1939b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o) r1
            if (r1 == 0) goto L32
            r1.destroy()
        L32:
            r0.f1939b = r2
            java.lang.Object r1 = r0.f1943f
            X2.j r1 = (X2.j) r1
            r0.f1943f = r2
            if (r5 == 0) goto L41
            if (r1 == 0) goto L41
            r1.R(r5)
        L41:
            if (r3 == 0) goto L4f
            if (r1 == 0) goto L4f
            java.lang.String r5 = r4.f29060d
            r3 = 6
            com.moloco.sdk.publisher.MolocoAd r5 = com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(r5, r2, r2, r3, r2)
            r1.W(r5)
        L4f:
            r0.f1940c = r2
            r0.f1941d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.l0.b(com.moloco.sdk.internal.r):void");
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l c() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o) this.f29064h.f1939b;
        if (oVar != null) {
            return oVar.getCreativeType();
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public final void destroy() {
        Ef.H.j(this.f29068m, null);
        b(null);
        this.f29074s = null;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final boolean isLoaded() {
        return this.f29071p.k;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final void load(String bidResponseJson, AdLoad.Listener listener) {
        AbstractC3340k.e(bidResponseJson, "bidResponseJson");
        com.moloco.sdk.acm.recorder.c cVar = this.f29067l;
        cVar.b(this.f29069n);
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.f28497b;
        this.f29070o = cVar.c("load_to_show_time");
        Ef.H.D(this.f29068m, null, new h0(this, bidResponseJson, listener, null), 3);
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public final void show(AdShowListener adShowListener) {
        String strName;
        com.moloco.sdk.acm.l lVar = this.f29070o;
        com.moloco.sdk.acm.recorder.c cVar = this.f29067l;
        AdFormatType adFormatType = this.f29065i;
        if (lVar != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVarC = c();
            if (lVarC == null || (strName = lVarC.name()) == null) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.f32379a;
                strName = "UNKNOWN";
            }
            String lowerCase = strName.toLowerCase(Locale.ROOT);
            AbstractC3340k.d(lowerCase, "toLowerCase(...)");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            String lowerCase2 = adFormatType.name().toLowerCase(Locale.ROOT);
            AbstractC3340k.d(lowerCase2, "toLowerCase(...)");
            lVar.a("ad_type", lowerCase2);
            lVar.a("creative_type", lowerCase);
            cVar.b(lVar);
        }
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("show_ad_attempted");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        String lowerCase3 = adFormatType.name().toLowerCase(Locale.ROOT);
        AbstractC3340k.d(lowerCase3, "toLowerCase(...)");
        hVar.a("ad_type", lowerCase3);
        cVar.a(hVar);
        Ef.H.D(this.f29068m, null, new k0(adShowListener, this, null), 3);
    }
}
