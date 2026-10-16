package com.waze.sound;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class fa {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getCustomPromptSet$default(fa faVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCustomPromptSet");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        faVar.getCustomPromptSet(str, lVar);
    }

    static final CustomPromptSet getCustomPromptSet$lambda$0(fa faVar, String str) {
        h.g.b.x.d(faVar, "null cannot be cast to non-null type com.waze.sound.SoundNativeManager");
        return ((SoundNativeManager) faVar).getCustomPromptSetNTV(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getFileForPromptType$default(fa faVar, String str, String str2, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFileForPromptType");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        faVar.getFileForPromptType(str, str2, lVar);
    }

    static final String getFileForPromptType$lambda$0(fa faVar, String str, String str2) {
        h.g.b.x.d(faVar, "null cannot be cast to non-null type com.waze.sound.SoundNativeManager");
        return ((SoundNativeManager) faVar).getFileForPromptTypeNTV(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getPathForPrompt$default(fa faVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPathForPrompt");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        faVar.getPathForPrompt(str, lVar);
    }

    static final String getPathForPrompt$lambda$0(fa faVar, String str) {
        h.g.b.x.d(faVar, "null cannot be cast to non-null type com.waze.sound.SoundNativeManager");
        return ((SoundNativeManager) faVar).getPathForPromptNTV(str);
    }

    static final void onCustomPromptSetsListChangedJNI$lambda$0(fa faVar) {
        h.g.b.x.d(faVar, "null cannot be cast to non-null type com.waze.sound.SoundNativeManager");
        ((SoundNativeManager) faVar).onCustomPromptSetsListChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playTts$default(fa faVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playTts");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        faVar.playTts(str, lVar);
    }

    static final h.ab playTts$lambda$0(fa faVar, String str) {
        h.g.b.x.d(faVar, "null cannot be cast to non-null type com.waze.sound.SoundNativeManager");
        ((SoundNativeManager) faVar).playTtsNTV(str);
        return null;
    }

    public static /* synthetic */ void soundCallback$default(fa faVar, long j2, long j3, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: soundCallback");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        faVar.soundCallback(j2, j3, lVar);
    }

    static final h.ab soundCallback$lambda$0(fa faVar, long j2, long j3) {
        h.g.b.x.d(faVar, "null cannot be cast to non-null type com.waze.sound.SoundNativeManager");
        ((SoundNativeManager) faVar).soundCallbackNTV(j2, j3);
        return null;
    }

    public abstract void PlayFile(String str, long j2, long j3, boolean z, String str2);

    protected final void PlayFileJNI(String str, long j2, long j3, boolean z, String str2) {
        h.g.b.x.f(str, "fileName");
        ((SoundNativeManager) this).PlayFile(str, j2, j3, z, str2);
    }

    public void downloadPromptSet(String str) {
        ((SoundNativeManager) this).downloadPromptSetNTV(str);
    }

    public void finishEditCustomPromptSet(boolean z, String str) {
        ((SoundNativeManager) this).finishEditCustomPromptSetNTV(z, str);
    }

    public void getCustomPromptSet(String str, h.g.a.l<? super CustomPromptSet, h.ab> lVar) {
        NativeManager.runNativeTask(new ex(this, str, 0), lVar != null ? new ew(lVar, 3) : null);
    }

    public CustomPromptSet[] getCustomPrompts() {
        return ((SoundNativeManager) this).getCustomPromptsNTV();
    }

    public String getCustomPromptsTempRecordPath() {
        return ((SoundNativeManager) this).getCustomPromptsTempRecordPathNTV();
    }

    public void getFileForPromptType(final String str, final String str2, h.g.a.l<? super String, h.ab> lVar) {
        h.g.b.x.f(str, "promptType");
        h.g.b.x.f(str2, "voiceId");
        NativeManager.runNativeTask(new com.waze.hw() { // from class: com.waze.sound.ey
            @Override // com.waze.hw
            public final Object a() {
                return fa.getFileForPromptType$lambda$0(this.f39972a, str, str2);
            }
        }, lVar != null ? new ew(lVar, 4) : null);
    }

    public void getPathForPrompt(String str, h.g.a.l<? super String, h.ab> lVar) {
        NativeManager.runNativeTask(new ex(this, str, 1), lVar != null ? new ew(lVar, 2) : null);
    }

    public PromptDefinition[] getPromptDefinitions() {
        return ((SoundNativeManager) this).getPromptDefinitionsNTV();
    }

    public void initNativeLayer() {
        ((SoundNativeManager) this).initNativeLayerNTV();
    }

    public void initiateUploadSequence() {
        ((SoundNativeManager) this).initiateUploadSequenceNTV();
    }

    public abstract boolean isInCall();

    protected final boolean isInCallJNI() {
        return ((SoundNativeManager) this).isInCall();
    }

    public abstract boolean isSelectedVoiceCustomPromptType();

    protected final boolean isSelectedVoiceCustomPromptTypeJNI() {
        return ((SoundNativeManager) this).isSelectedVoiceCustomPromptType();
    }

    public abstract void onCustomPromptSetsListChanged();

    protected final void onCustomPromptSetsListChangedJNI() {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.sound.ez
            @Override // java.lang.Runnable
            public final void run() {
                fa.onCustomPromptSetsListChangedJNI$lambda$0(this.f39975a);
            }
        });
    }

    public void playSoundFile(String str) {
        ((SoundNativeManager) this).playSoundFileNTV(str);
    }

    public void playTts(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ex(this, str, 2), lVar != null ? new ew(lVar, 1) : null);
    }

    public void prepareEditCustomPromptSet(String str) {
        ((SoundNativeManager) this).prepareEditCustomPromptSetNTV(str);
    }

    public void removeSetFromUser(String str) {
        ((SoundNativeManager) this).removeSetFromUserNTV(str);
    }

    public void saveCustomPrompt(String str) {
        ((SoundNativeManager) this).saveCustomPromptNTV(str);
    }

    public boolean shouldMute() {
        return ((SoundNativeManager) this).shouldMuteNTV();
    }

    public void soundCallback(final long j2, final long j3, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new com.waze.hw() { // from class: com.waze.sound.ev
            @Override // com.waze.hw
            public final Object a() {
                fa.soundCallback$lambda$0(this.f39964a, j2, j3);
                return null;
            }
        }, lVar != null ? new ew(lVar, 0) : null);
    }

    public final void getCustomPromptSet(String str) {
        getCustomPromptSet$default(this, str, null, 2, null);
    }

    public final void getPathForPrompt(String str) {
        getPathForPrompt$default(this, str, null, 2, null);
    }

    public final void playTts(String str) {
        playTts$default(this, str, null, 2, null);
    }

    public final void soundCallback(long j2, long j3) {
        soundCallback$default(this, j2, j3, null, 4, null);
    }

    public final void getFileForPromptType(String str, String str2) {
        h.g.b.x.f(str, "promptType");
        h.g.b.x.f(str2, "voiceId");
        getFileForPromptType$default(this, str, str2, null, 4, null);
    }
}
