package com.waze.sound;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class kj {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void downloadIfNeeded$default(kj kjVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadIfNeeded");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        kjVar.downloadIfNeeded(str, lVar);
    }

    static final h.ab downloadIfNeeded$lambda$0(kj kjVar, String str) {
        h.g.b.x.d(kjVar, "null cannot be cast to non-null type com.waze.sound.WazeTtsDownloaderNativeManager");
        ((WazeTtsDownloaderNativeManager) kjVar).downloadIfNeededNTV(str);
        return null;
    }

    static final void onDownloadDoneJNI$lambda$0(kj kjVar, String str, boolean z) {
        h.g.b.x.d(kjVar, "null cannot be cast to non-null type com.waze.sound.WazeTtsDownloaderNativeManager");
        ((WazeTtsDownloaderNativeManager) kjVar).onDownloadDone$third_party_waze_client_android_project_waze_src_main_waze(str, z);
    }

    public void downloadIfNeeded(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, "text");
        NativeManager.runNativeTask(new ex(this, str, 8), lVar != null ? new ew(lVar, 17) : null);
    }

    protected final void onDownloadDoneJNI(String str, boolean z) {
        h.g.b.x.f(str, "text");
        NativeManager.runMainThreadTask(new ki(this, str, z, 0));
    }

    public final void downloadIfNeeded(String str) {
        h.g.b.x.f(str, "text");
        downloadIfNeeded$default(this, str, null, 2, null);
    }
}
