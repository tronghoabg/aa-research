package com.waze.sound;

import androidx.media3.exoplayer.offline.Download;
import androidx.media3.exoplayer.offline.DownloadManager;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.scheduler.Requirements;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class jc implements DownloadManager.Listener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f40282a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jl f40283b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f40284c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f40285d;

    jc(String str, jl jlVar, h.g.a.l lVar, h.g.a.l lVar2) {
        this.f40282a = str;
        this.f40283b = jlVar;
        this.f40284c = lVar;
        this.f40285d = lVar2;
    }

    @Override // androidx.media3.exoplayer.offline.DownloadManager.Listener
    public final void onDownloadChanged(DownloadManager downloadManager, Download download, Exception exc) {
        h.g.b.x.f(downloadManager, "downloadManager");
        h.g.b.x.f(download, "download");
        if (h.g.b.x.n(download.request.id, this.f40282a)) {
            int i2 = download.state;
            if (i2 == 0) {
                downloadManager.resumeDownloads();
                return;
            }
            if (i2 == 3) {
                com.waze.shared_infra.i.e eVar = this.f40283b.f40324c;
                DownloadRequest downloadRequest = download.request;
                eVar.a("Finished download for id " + downloadRequest.id + " key " + downloadRequest.customCacheKey + " url " + downloadRequest.uri);
                this.f40284c.invoke(download);
                return;
            }
            if (i2 != 4) {
                return;
            }
            com.waze.shared_infra.i.e eVar2 = this.f40283b.f40324c;
            DownloadRequest downloadRequest2 = download.request;
            eVar2.b("Failed downloading id " + downloadRequest2.id + " key " + downloadRequest2.customCacheKey + " url " + downloadRequest2.uri + ". Reason: " + download.failureReason);
            this.f40285d.invoke(download);
        }
    }

    @Override // androidx.media3.exoplayer.offline.DownloadManager.Listener
    public final /* synthetic */ void onDownloadRemoved(DownloadManager downloadManager, Download download) {
    }

    @Override // androidx.media3.exoplayer.offline.DownloadManager.Listener
    public final /* synthetic */ void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z) {
    }

    @Override // androidx.media3.exoplayer.offline.DownloadManager.Listener
    public final /* synthetic */ void onIdle(DownloadManager downloadManager) {
    }

    @Override // androidx.media3.exoplayer.offline.DownloadManager.Listener
    public final /* synthetic */ void onInitialized(DownloadManager downloadManager) {
    }

    @Override // androidx.media3.exoplayer.offline.DownloadManager.Listener
    public final /* synthetic */ void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i2) {
    }

    @Override // androidx.media3.exoplayer.offline.DownloadManager.Listener
    public final /* synthetic */ void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z) {
    }
}
