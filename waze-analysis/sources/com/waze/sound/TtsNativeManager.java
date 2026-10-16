package com.waze.sound;

import com.waze.jni.protos.sound.TtsVoice;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class TtsNativeManager extends hs {
    public static final int $stable = 8;
    private final kotlinx.coroutines.af coroutineScope;
    private final com.waze.shared_infra.i.e logger;
    private final em soundConfig;
    private final fm soundPlayer;
    private final ik voiceFilesDataSource;
    private final iv voiceFilesProvider;
    private final com.waze.sound.f.j voiceStatsSender;

    public TtsNativeManager(ik ikVar, iv ivVar, fm fmVar, com.waze.shared_infra.i.e eVar, com.waze.sound.f.j jVar, em emVar, kotlinx.coroutines.ab abVar) {
        h.g.b.x.f(ikVar, "voiceFilesDataSource");
        h.g.b.x.f(ivVar, "voiceFilesProvider");
        h.g.b.x.f(fmVar, "soundPlayer");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(jVar, "voiceStatsSender");
        h.g.b.x.f(emVar, "soundConfig");
        h.g.b.x.f(abVar, "ioDispatcher");
        this.voiceFilesDataSource = ikVar;
        this.voiceFilesProvider = ivVar;
        this.soundPlayer = fmVar;
        this.logger = eVar;
        this.voiceStatsSender = jVar;
        this.soundConfig = emVar;
        this.coroutineScope = kotlinx.coroutines.aj.e(abVar);
    }

    @Override // com.waze.sound.hs
    public boolean cacheExists(String str) {
        h.g.b.x.f(str, "cacheKey");
        return this.voiceFilesProvider.g(str);
    }

    @Override // com.waze.sound.hs
    public void downloadTtsFromVoiceServer(String str, TtsVoice ttsVoice, String str2) {
        h.g.b.x.f(str, "text");
        h.g.b.x.f(ttsVoice, "ttsVoice");
        h.g.b.x.f(str2, "cacheKey");
        String voiceId = ttsVoice.getVoiceId();
        if (voiceId == null || voiceId.length() == 0) {
            this.logger.b(f.a(str, "Can't download free text `", "` since selected voice is empty"));
            return;
        }
        this.logger.a("Attempting to download TTS text " + str + ". TTS Request ID " + str2);
        kotlinx.coroutines.aj.z(this.coroutineScope, null, null, new ef(this, ttsVoice, str, str2, (h.c.e) null, 2), 3);
    }

    public final native byte[] getSelectedTtsVoiceNTV();

    public final native String getTTSKeyTranslationNTV(String str);

    public final native void initNativeLayerNTV();

    public final native void onCacheReadyNTV();

    public final native void onTtsDownloadCompleteNTV(String str, boolean z);

    @Override // com.waze.sound.hs
    public void play(String str, boolean z) {
        h.g.b.x.f(str, "cacheKey");
        this.logger.a("Playing TTS for cache key `" + str + "`, ignoreMute: " + z);
        kotlinx.coroutines.aj.z(this.coroutineScope, null, null, new hp(this, str, z, null), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TtsNativeManager(ik ikVar, iv ivVar, fm fmVar, com.waze.shared_infra.i.e eVar, com.waze.sound.f.j jVar, em emVar, kotlinx.coroutines.ab abVar, int i2, h.g.b.o oVar) {
        if ((i2 & 8) != 0) {
            eVar = com.waze.shared_infra.i.a.d("TtsNativeManager");
            h.g.b.x.e(eVar, "create(...)");
        }
        this(ikVar, ivVar, fmVar, eVar, jVar, emVar, (i2 & 64) != 0 ? kotlinx.coroutines.av.b() : abVar);
    }
}
