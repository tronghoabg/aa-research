package com.waze.sound;

import j$.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class WazeTtsDownloaderNativeManager extends kj implements kh {
    public static final int $stable = 8;
    private final ConcurrentHashMap<String, CompletableDeferred<Boolean>> completions = new ConcurrentHashMap<>();

    @Override // com.waze.sound.kh
    public Object downloadAudio(String str, h.c.e<? super Boolean> eVar) {
        boolean z;
        ConcurrentHashMap<String, CompletableDeferred<Boolean>> concurrentHashMap = this.completions;
        CompletableDeferred<Boolean> completableDeferredJ = concurrentHashMap.get(str);
        if (completableDeferredJ == null) {
            completableDeferredJ = kotlinx.coroutines.bo.j();
            CompletableDeferred<Boolean> completableDeferredPutIfAbsent = concurrentHashMap.putIfAbsent(str, completableDeferredJ);
            if (completableDeferredPutIfAbsent != null) {
                completableDeferredJ = completableDeferredPutIfAbsent;
            }
            z = true;
        } else {
            z = false;
        }
        CompletableDeferred<Boolean> completableDeferred = completableDeferredJ;
        if (z) {
            kj.downloadIfNeeded$default(this, str, null, 2, null);
        }
        return completableDeferred.c(eVar);
    }

    public final native void downloadIfNeededNTV(String str);

    public final native void initNativeLayerNTV();

    public final void onDownloadDone$third_party_waze_client_android_project_waze_src_main_waze(String str, boolean z) {
        h.g.b.x.f(str, "text");
        CompletableDeferred<Boolean> completableDeferredRemove = this.completions.remove(str);
        if (completableDeferredRemove != null) {
            completableDeferredRemove.a(Boolean.valueOf(z));
        }
    }
}
