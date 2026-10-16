package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* loaded from: classes5.dex */
public final class f extends com.vungle.ads.internal.task.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f32949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f32950b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f32951c;

    public f(k kVar, h hVar, com.vungle.ads.internal.load.c cVar) {
        this.f32949a = hVar;
        this.f32950b = kVar;
        this.f32951c = cVar;
    }

    @Override // com.vungle.ads.internal.task.j
    public final int a() {
        return this.f32950b.f32961a.f32960a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.f32949a;
        k kVar = this.f32950b;
        d dVar = this.f32951c;
        if (dVar != null) {
            hVar.getClass();
            ((com.vungle.ads.internal.load.c) dVar).a(kVar);
        }
        b bVarA = hVar.a(kVar, dVar);
        while (true) {
            if (bVarA != null) {
                if (!kVar.f32965e.get()) {
                    Integer num = kVar.f32962b.f33117e;
                    if (num != null && num.intValue() < 100) {
                        boolean z2 = u.f33874a;
                        t.a("AssetDownloader", "Partial download asset (percentage=" + num + "), not retrying");
                        break;
                    }
                    if (kVar.f32966f.get() >= kVar.f32964d) {
                        boolean z10 = u.f33874a;
                        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Max retry attempts reached (");
                        sbA.append(kVar.f32964d);
                        sbA.append(')');
                        t.a("AssetDownloader", sbA.toString());
                        break;
                    }
                    if (!a.a(bVarA)) {
                        boolean z11 = u.f33874a;
                        StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("Error reason ");
                        sbA2.append(bVarA.f32942c);
                        sbA2.append(" is not retryable");
                        t.a("AssetDownloader", sbA2.toString());
                        break;
                    }
                    kVar.f32966f.incrementAndGet();
                    kVar.a("Error: " + bVarA.f32941b.getMessage() + ", Code: " + bVarA.f32940a + ", Reason: " + bVarA.f32942c);
                    boolean z12 = u.f33874a;
                    StringBuilder sbA3 = com.iab.omid.library.vungle.internal.l.a("Download failed, retrying immediately. Attempt ");
                    sbA3.append(kVar.f32966f.get());
                    sbA3.append('/');
                    sbA3.append(kVar.f32964d);
                    sbA3.append(". URL: ");
                    sbA3.append(kVar.f32962b.f33114b);
                    sbA3.append(", Error: ");
                    sbA3.append(bVarA.f32941b.getMessage());
                    t.c("AssetDownloader", sbA3.toString());
                    bVarA = hVar.a(kVar, dVar);
                } else {
                    boolean z13 = u.f33874a;
                    t.a("AssetDownloader", "Download cancelled, not retrying");
                    break;
                }
            } else {
                break;
            }
        }
        if (bVarA != null) {
            boolean z14 = u.f33874a;
            StringBuilder sbA4 = com.iab.omid.library.vungle.internal.l.a("Download failed after ");
            sbA4.append(kVar.f32966f.get() + 1);
            sbA4.append(" attempts. URL: ");
            sbA4.append(kVar.f32962b.f33114b);
            sbA4.append(". Retry history: ");
            sbA4.append(kVar.d());
            t.b("AssetDownloader", sbA4.toString());
            if (kVar.f32966f.get() > 0) {
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS;
                s sVar = kVar.f32963c;
                StringBuilder sbA5 = com.iab.omid.library.vungle.internal.l.a("retryCount=");
                sbA5.append(kVar.f32966f.get());
                sbA5.append(" url=");
                sbA5.append(kVar.f32962b.f33114b);
                analyticsClient.c(sDKMetricType, 2L, sVar, sbA5.toString());
            }
            if (dVar != null) {
                ((com.vungle.ads.internal.load.c) dVar).a(bVarA, kVar);
            }
        }
    }
}
