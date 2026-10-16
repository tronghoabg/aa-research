package com.waze.sound;

import androidx.media3.exoplayer.offline.Download;
import androidx.media3.exoplayer.offline.DownloadManager;
import androidx.media3.exoplayer.scheduler.Requirements;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class jg implements DownloadManager.Listener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ jl f40300a;

    jg(jl jlVar) {
        this.f40300a = jlVar;
    }

    @Override // androidx.media3.exoplayer.offline.DownloadManager.Listener
    public final /* synthetic */ void onDownloadChanged(DownloadManager downloadManager, Download download, Exception exc) {
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
    public final void onInitialized(DownloadManager downloadManager) {
        h.g.b.x.f(downloadManager, "downloadManager");
        jl jlVar = this.f40300a;
        kotlinx.coroutines.aj.z(jlVar.f40329h, null, null, new jf(jlVar, null), 3);
    }

    @Override // androidx.media3.exoplayer.offline.DownloadManager.Listener
    public final /* synthetic */ void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i2) {
    }

    @Override // androidx.media3.exoplayer.offline.DownloadManager.Listener
    public final /* synthetic */ void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z) {
    }
}
