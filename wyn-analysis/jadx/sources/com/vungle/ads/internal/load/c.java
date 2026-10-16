package com.vungle.ads.internal.load;

import com.vungle.ads.AssetRequestError;
import com.vungle.ads.PrivacyIconFallbackError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c implements com.vungle.ads.internal.downloader.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f33041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f33042b;

    public c(g gVar) {
        this.f33042b = gVar;
    }

    public final void a(com.vungle.ads.internal.downloader.k downloadRequest) {
        AbstractC3340k.e(downloadRequest, "downloadRequest");
        boolean z2 = u.f33874a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onStart called: ");
        sbA.append(downloadRequest.a().h());
        t.c("BaseAdLoader", sbA.toString());
        downloadRequest.f();
    }

    public final void a(com.vungle.ads.internal.downloader.c progress, com.vungle.ads.internal.downloader.k downloadRequest) throws Throwable {
        AbstractC3340k.e(progress, "progress");
        AbstractC3340k.e(downloadRequest, "downloadRequest");
        com.vungle.ads.internal.model.b bVarA = downloadRequest.a();
        Integer numE = bVarA.e();
        boolean z2 = u.f33874a;
        t.a("BaseAdLoader", "Download progress: " + progress + " url: " + bVarA.h());
        if (this.f33041a || numE == null || progress.a() < numE.intValue()) {
            return;
        }
        this.f33041a = true;
        if (new zf.g(1, 99, 1).a(numE.intValue())) {
            downloadRequest.h();
        }
        t.c("BaseAdLoader", "Download progress: hit chunk percentage=" + numE + " for url: " + bVarA.h());
        if (bVarA.n()) {
            ((com.vungle.ads.internal.executor.d) this.f33042b.g()).b().execute(new C8.d(2, this.f33042b, bVarA));
        }
    }

    public static final void a(g this$0, com.vungle.ads.internal.model.b adAsset) {
        AbstractC3340k.e(this$0, "this$0");
        AbstractC3340k.e(adAsset, "$adAsset");
        this$0.f33055i.remove(adAsset.h());
        if (this$0.f33055i.isEmpty()) {
            if (this$0.f33061p.get()) {
                g.g(this$0);
            } else {
                this$0.a();
                this$0.a(new AssetRequestError("Failed to download required assets."));
            }
        }
    }

    public final void a(com.vungle.ads.internal.downloader.b bVar, com.vungle.ads.internal.downloader.k downloadRequest) {
        AbstractC3340k.e(downloadRequest, "downloadRequest");
        boolean z2 = u.f33874a;
        t.b("BaseAdLoader", "onError called: " + bVar);
        ((com.vungle.ads.internal.executor.d) this.f33042b.g()).b().execute(new Cb.a(downloadRequest, this.f33042b, this, bVar, 0));
    }

    public static final void a(com.vungle.ads.internal.downloader.k downloadRequest, g this$0, c this$1, com.vungle.ads.internal.downloader.b bVar) {
        AbstractC3340k.e(downloadRequest, "$downloadRequest");
        AbstractC3340k.e(this$0, "this$0");
        AbstractC3340k.e(this$1, "this$1");
        com.vungle.ads.internal.model.b bVarA = downloadRequest.a();
        if (bVarA.m()) {
            File fileA = com.vungle.ads.internal.downloader.i.a(this$0.f().getVmDir());
            if (fileA != null && fileA.exists()) {
                this$1.a(fileA, downloadRequest);
                return;
            }
            new PrivacyIconFallbackError("Failed to inject default privacy icon").setLogEntry$vungle_ads_release(this$0.e()).logErrorNoReturnValue$vungle_ads_release();
        }
        bVarA.a(com.vungle.ads.internal.model.a.DOWNLOAD_FAILED);
        this$0.f33060o.set(false);
        if (bVarA.n()) {
            this$0.f33061p.set(false);
        }
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Failed to download assets ");
        sbA.append(bVarA.h());
        sbA.append(". error: ");
        sbA.append(bVar);
        sbA.append(" errorType=");
        sbA.append(com.vungle.ads.internal.platform.e.a(bVar != null ? bVar.a() : null));
        sbA.append(" proxyEnabled=");
        sbA.append(com.vungle.ads.internal.platform.e.e(this$0.d()));
        sbA.append(" privateDns=");
        sbA.append(com.vungle.ads.internal.platform.e.b(this$0.d()));
        sbA.append(" network=");
        sbA.append(com.vungle.ads.internal.platform.e.a(this$0.d()));
        new AssetRequestError(sbA.toString()).setLogEntry$vungle_ads_release(this$0.e()).logErrorNoReturnValue$vungle_ads_release();
        if (bVarA.n()) {
            this$0.f33055i.remove(downloadRequest.a().h());
            if (this$0.f33055i.isEmpty()) {
                this$0.a();
                this$0.a(new AssetRequestError("Error: Failed to download required assets."));
                return;
            }
        }
        if (this$0.f33054h.decrementAndGet() <= 0) {
            this$0.a(new AssetRequestError("Error: Failed to download assets."));
        }
    }

    public final void a(File file, com.vungle.ads.internal.downloader.k downloadRequest) {
        AbstractC3340k.e(file, "file");
        AbstractC3340k.e(downloadRequest, "downloadRequest");
        ((com.vungle.ads.internal.executor.d) this.f33042b.g()).b().execute(new Cb.a(file, this, downloadRequest, this.f33042b));
    }

    public static final void a(File file, c this$0, com.vungle.ads.internal.downloader.k downloadRequest, g this$1) {
        AbstractC3340k.e(file, "$file");
        AbstractC3340k.e(this$0, "this$0");
        AbstractC3340k.e(downloadRequest, "$downloadRequest");
        AbstractC3340k.e(this$1, "this$1");
        if (!file.exists()) {
            this$0.a(new com.vungle.ads.internal.downloader.b(-1, new IOException("Downloaded file not found!"), 3), downloadRequest);
            return;
        }
        com.vungle.ads.internal.model.b bVarA = downloadRequest.a();
        bVarA.b(file.length());
        bVarA.a(com.vungle.ads.internal.model.a.DOWNLOAD_SUCCESS);
        Integer numE = bVarA.e();
        if (numE == null || numE.intValue() == 0 || numE.intValue() == 100) {
            downloadRequest.h();
        }
        if (bVarA.j()) {
            downloadRequest.i();
            this$1.f33064s.a(Long.valueOf(file.length()));
            AnalyticsClient.INSTANCE.a(this$1.f33064s, this$1.e(), bVarA.h());
        } else if (bVarA.l()) {
            this$1.f33063r.a(Long.valueOf(file.length()));
            AnalyticsClient.INSTANCE.a(this$1.f33063r, this$1.e(), bVarA.h());
        }
        h0 h0VarC = this$1.c();
        if (h0VarC != null) {
            h0VarC.a(file, bVarA.a());
        }
        if (bVarA.j() && !g.a(this$1, bVarA, this$1.c())) {
            this$1.f33060o.set(false);
            if (bVarA.n()) {
                this$1.f33061p.set(false);
            }
        }
        if (bVarA.n()) {
            this$1.f33055i.remove(bVarA.h());
            if (this$1.f33055i.isEmpty()) {
                if (this$1.f33061p.get()) {
                    g.g(this$1);
                } else {
                    this$1.a();
                    this$1.a(new AssetRequestError("Failed to download required assets."));
                    return;
                }
            }
        }
        if (this$1.f33054h.decrementAndGet() <= 0) {
            if (this$1.f33060o.get()) {
                g.a(this$1, this$1.b());
            } else {
                this$1.a(new AssetRequestError("Failed to download assets."));
            }
        }
    }
}
