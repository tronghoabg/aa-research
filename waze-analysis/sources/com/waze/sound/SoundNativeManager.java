package com.waze.sound;

import android.content.Context;
import android.media.AudioManager;
import androidx.core.content.ContextCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class SoundNativeManager extends fa {
    private final kotlinx.coroutines.b.bm<h.ab> _customPromptsListChanged;
    private final Context applicationContext;
    private final fm soundPlayer;
    private final hx ttsStatsSender;
    private final com.waze.sound.a.c voiceRepository;
    public static final eu Companion = new eu(0);
    public static final int $stable = 8;

    public SoundNativeManager(Context context, fm fmVar, hx hxVar, com.waze.sound.a.c cVar) {
        h.g.b.x.f(context, "applicationContext");
        h.g.b.x.f(fmVar, "soundPlayer");
        h.g.b.x.f(hxVar, "ttsStatsSender");
        h.g.b.x.f(cVar, "voiceRepository");
        this.applicationContext = context;
        this.soundPlayer = fmVar;
        this.ttsStatsSender = hxVar;
        this.voiceRepository = cVar;
        this._customPromptsListChanged = kotlinx.coroutines.b.bu.e(1, 0, null, 6);
    }

    static final h.ab PlayFile$lambda$0(long j2, SoundNativeManager soundNativeManager, long j3) {
        if (j2 != 0) {
            fa.soundCallback$default(soundNativeManager, j2, j3, null, 4, null);
        }
        return h.ab.f48028a;
    }

    public static final SoundNativeManager getInstance() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.a.a aVar = Companion;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(SoundNativeManager.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(SoundNativeManager.class);
        }
        return (SoundNativeManager) bVarC.a(mVar, null, null);
    }

    @Override // com.waze.sound.fa
    public void PlayFile(String str, final long j2, final long j3, boolean z, String str2) {
        h.g.b.x.f(str, "fileName");
        if (h.n.o.l(str, ".mp3", false)) {
            this.ttsStatsSender.c(str);
        }
        com.waze.sharedui.e.e.i(this.soundPlayer, str, str2, z, false, new h.g.a.a() { // from class: com.waze.sound.et
            @Override // h.g.a.a
            public final Object invoke() {
                return SoundNativeManager.PlayFile$lambda$0(j2, this, j3);
            }
        }, 8);
    }

    public final native void downloadPromptSetNTV(String str);

    public final native void finishEditCustomPromptSetNTV(boolean z, String str);

    public final native CustomPromptSet getCustomPromptSetNTV(String str);

    public final kotlinx.coroutines.b.bq<h.ab> getCustomPromptsListChanged() {
        return kotlinx.coroutines.b.ai.S(this._customPromptsListChanged);
    }

    public final native CustomPromptSet[] getCustomPromptsNTV();

    public final native String getCustomPromptsTempRecordPathNTV();

    public final native String getFileForPromptTypeNTV(String str, String str2);

    public native String getPathForPromptNTV(String str);

    public final native PromptDefinition[] getPromptDefinitionsNTV();

    public final native void initNativeLayerNTV();

    public final native void initiateUploadSequenceNTV();

    @Override // com.waze.sound.fa
    public boolean isInCall() {
        AudioManager audioManager = (AudioManager) ContextCompat.getSystemService(this.applicationContext, AudioManager.class);
        return audioManager != null && com.waze.sharedui.api.c.c(audioManager);
    }

    @Override // com.waze.sound.fa
    public boolean isSelectedVoiceCustomPromptType() {
        return this.voiceRepository.h();
    }

    @Override // com.waze.sound.fa
    public void onCustomPromptSetsListChanged() {
        this._customPromptsListChanged.c(h.ab.f48028a);
    }

    public final native void playSoundFileNTV(String str);

    public final native void playTtsNTV(String str);

    public final native void prepareEditCustomPromptSetNTV(String str);

    public final native void removeSetFromUserNTV(String str);

    public final native void saveCustomPromptNTV(String str);

    public final native boolean shouldMuteNTV();

    public final native void soundCallbackNTV(long j2, long j3);
}
