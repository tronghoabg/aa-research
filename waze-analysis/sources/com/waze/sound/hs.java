package com.waze.sound;

import com.waze.NativeManager;
import com.waze.jni.protos.sound.TtsVoice;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class hs {
    public static final int $stable = 0;

    static final void downloadTtsFromVoiceServerJNI$lambda$0(hs hsVar, String str, TtsVoice ttsVoice, String str2) {
        h.g.b.x.d(hsVar, "null cannot be cast to non-null type com.waze.sound.TtsNativeManager");
        h.g.b.x.c(ttsVoice);
        ((TtsNativeManager) hsVar).downloadTtsFromVoiceServer(str, ttsVoice, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getSelectedTtsVoice$default(hs hsVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSelectedTtsVoice");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        hsVar.getSelectedTtsVoice(lVar);
    }

    static final byte[] getSelectedTtsVoice$lambda$0(hs hsVar) {
        h.g.b.x.d(hsVar, "null cannot be cast to non-null type com.waze.sound.TtsNativeManager");
        return ((TtsNativeManager) hsVar).getSelectedTtsVoiceNTV();
    }

    static final void getSelectedTtsVoice$lambda$1(h.g.a.l lVar, byte[] bArr) {
        TtsVoice ttsVoice = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                ttsVoice = (TtsVoice) TtsVoice.parser().c(bArr);
            } catch (com.google.v.eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(ttsVoice);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getTTSKeyTranslation$default(hs hsVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTTSKeyTranslation");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        hsVar.getTTSKeyTranslation(str, lVar);
    }

    static final String getTTSKeyTranslation$lambda$0(hs hsVar, String str) {
        h.g.b.x.d(hsVar, "null cannot be cast to non-null type com.waze.sound.TtsNativeManager");
        return ((TtsNativeManager) hsVar).getTTSKeyTranslationNTV(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onCacheReady$default(hs hsVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCacheReady");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        hsVar.onCacheReady(lVar);
    }

    static final h.ab onCacheReady$lambda$0(hs hsVar) {
        h.g.b.x.d(hsVar, "null cannot be cast to non-null type com.waze.sound.TtsNativeManager");
        ((TtsNativeManager) hsVar).onCacheReadyNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onTtsDownloadComplete$default(hs hsVar, String str, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTtsDownloadComplete");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        hsVar.onTtsDownloadComplete(str, z, lVar);
    }

    static final h.ab onTtsDownloadComplete$lambda$0(hs hsVar, String str, boolean z) {
        h.g.b.x.d(hsVar, "null cannot be cast to non-null type com.waze.sound.TtsNativeManager");
        ((TtsNativeManager) hsVar).onTtsDownloadCompleteNTV(str, z);
        return null;
    }

    static final void playJNI$lambda$0(hs hsVar, String str, boolean z) {
        h.g.b.x.d(hsVar, "null cannot be cast to non-null type com.waze.sound.TtsNativeManager");
        ((TtsNativeManager) hsVar).play(str, z);
    }

    public abstract boolean cacheExists(String str);

    protected final boolean cacheExistsJNI(String str) {
        h.g.b.x.f(str, "cacheKey");
        return ((TtsNativeManager) this).cacheExists(str);
    }

    public abstract void downloadTtsFromVoiceServer(String str, TtsVoice ttsVoice, String str2);

    protected final void downloadTtsFromVoiceServerJNI(final String str, byte[] bArr, final String str2) {
        h.g.b.x.f(str, "text");
        h.g.b.x.f(bArr, "ttsVoice");
        h.g.b.x.f(str2, "cacheKey");
        try {
            final TtsVoice ttsVoice = (TtsVoice) TtsVoice.parser().c(bArr);
            NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.sound.hq
                @Override // java.lang.Runnable
                public final void run() {
                    hs.downloadTtsFromVoiceServerJNI$lambda$0(this.f40173a, str, ttsVoice, str2);
                }
            });
        } catch (com.google.v.eu unused) {
        }
    }

    public void getSelectedTtsVoice(h.g.a.l<? super TtsVoice, h.ab> lVar) {
        NativeManager.runNativeTask(new hr(this, 0), new ew(lVar, 8));
    }

    public void getTTSKeyTranslation(String str, h.g.a.l<? super String, h.ab> lVar) {
        h.g.b.x.f(str, "key");
        NativeManager.runNativeTask(new ex(this, str, 3), lVar != null ? new ew(lVar, 5) : null);
    }

    public void initNativeLayer() {
        ((TtsNativeManager) this).initNativeLayerNTV();
    }

    public void onCacheReady(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hr(this, 1), lVar != null ? new ew(lVar, 6) : null);
    }

    public void onTtsDownloadComplete(String str, boolean z, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, "ttsRequestId");
        NativeManager.runNativeTask(new kl(this, str, z, 1), lVar != null ? new ew(lVar, 7) : null);
    }

    public abstract void play(String str, boolean z);

    protected final void playJNI(String str, boolean z) {
        h.g.b.x.f(str, "cacheKey");
        NativeManager.runMainThreadTask(new ki(this, str, z, 1));
    }

    public final void getSelectedTtsVoice() {
        getSelectedTtsVoice$default(this, null, 1, null);
    }

    public final void onCacheReady() {
        onCacheReady$default(this, null, 1, null);
    }

    public final void getTTSKeyTranslation(String str) {
        h.g.b.x.f(str, "key");
        getTTSKeyTranslation$default(this, str, null, 2, null);
    }

    public final void onTtsDownloadComplete(String str, boolean z) {
        h.g.b.x.f(str, "ttsRequestId");
        onTtsDownloadComplete$default(this, str, z, null, 4, null);
    }
}
