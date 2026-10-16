package com.waze.sound.b;

import com.waze.sound.TtsNativeManager;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final TtsNativeManager f39493a;

    public a(TtsNativeManager ttsNativeManager) {
        x.f(ttsNativeManager, "ttsNativeManager");
        this.f39493a = ttsNativeManager;
    }

    public final Object a(String str, h.c.e eVar) {
        TtsNativeManager ttsNativeManager = this.f39493a;
        CompletableDeferred completableDeferredJ = bo.j();
        ttsNativeManager.getTTSKeyTranslation(str, new com.waze.r.d(completableDeferredJ, 17));
        return completableDeferredJ.c(eVar);
    }
}
