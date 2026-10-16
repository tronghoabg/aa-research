package com.waze.sound;

import com.waze.NativeManager;
import com.waze.jni.protos.sound.GuidanceSource;
import com.waze.jni.protos.sound.VoiceAsset;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class kg {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void clearInstructionSegmentToPlayAndThen$default(kg kgVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearInstructionSegmentToPlayAndThen");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        kgVar.clearInstructionSegmentToPlayAndThen(lVar);
    }

    static final h.ab clearInstructionSegmentToPlayAndThen$lambda$0(kg kgVar) {
        h.g.b.x.d(kgVar, "null cannot be cast to non-null type com.waze.sound.VoicesNativeManager");
        ((VoicesNativeManager) kgVar).clearInstructionSegmentToPlayAndThenNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initNativeLayer$default(kg kgVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initNativeLayer");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        kgVar.initNativeLayer(lVar);
    }

    static final h.ab initNativeLayer$lambda$0(kg kgVar) {
        h.g.b.x.d(kgVar, "null cannot be cast to non-null type com.waze.sound.VoicesNativeManager");
        ((VoicesNativeManager) kgVar).initNativeLayerNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setInstructionSegmentToPlayAndThen$default(kg kgVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setInstructionSegmentToPlayAndThen");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        kgVar.setInstructionSegmentToPlayAndThen(i2, lVar);
    }

    static final h.ab setInstructionSegmentToPlayAndThen$lambda$0(kg kgVar, int i2) {
        h.g.b.x.d(kgVar, "null cannot be cast to non-null type com.waze.sound.VoicesNativeManager");
        ((VoicesNativeManager) kgVar).setInstructionSegmentToPlayAndThenNTV(i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTtsId$default(kg kgVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTtsId");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        kgVar.setTtsId(str, lVar);
    }

    static final h.ab setTtsId$lambda$0(kg kgVar, String str) {
        h.g.b.x.d(kgVar, "null cannot be cast to non-null type com.waze.sound.VoicesNativeManager");
        ((VoicesNativeManager) kgVar).setTtsIdNTV(str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setVoiceAsset$default(kg kgVar, VoiceAsset voiceAsset, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setVoiceAsset");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        kgVar.setVoiceAsset(voiceAsset, lVar);
    }

    static final h.ab setVoiceAsset$lambda$0(kg kgVar, VoiceAsset voiceAsset) {
        h.g.b.x.d(kgVar, "null cannot be cast to non-null type com.waze.sound.VoicesNativeManager");
        ((VoicesNativeManager) kgVar).setVoiceAssetNTV(voiceAsset != null ? voiceAsset.toByteArray() : null);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void unsetTts$default(kg kgVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unsetTts");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        kgVar.unsetTts(lVar);
    }

    static final h.ab unsetTts$lambda$0(kg kgVar) {
        h.g.b.x.d(kgVar, "null cannot be cast to non-null type com.waze.sound.VoicesNativeManager");
        ((VoicesNativeManager) kgVar).unsetTtsNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateGuidanceConnectivity$default(kg kgVar, GuidanceSource guidanceSource, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateGuidanceConnectivity");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        kgVar.updateGuidanceConnectivity(guidanceSource, lVar);
    }

    static final h.ab updateGuidanceConnectivity$lambda$0(kg kgVar, GuidanceSource guidanceSource) {
        h.g.b.x.d(kgVar, "null cannot be cast to non-null type com.waze.sound.VoicesNativeManager");
        byte[] byteArray = guidanceSource.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        ((VoicesNativeManager) kgVar).updateGuidanceConnectivityNTV(byteArray);
        return null;
    }

    public void clearInstructionSegmentToPlayAndThen(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hr(this, 2), lVar != null ? new ew(lVar, 13) : null);
    }

    protected final int getNavigationGuidanceModeJNI() {
        return ((VoicesNativeManager) this).getNavigationGuidanceMode$third_party_waze_client_android_project_waze_src_main_waze().getNumber();
    }

    public void initNativeLayer(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hr(this, 3), lVar != null ? new ew(lVar, 14) : null);
    }

    public void setInstructionSegmentToPlayAndThen(final int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new com.waze.hw() { // from class: com.waze.sound.kf
            @Override // com.waze.hw
            public final Object a() {
                kg.setInstructionSegmentToPlayAndThen$lambda$0(this.f40373a, i2);
                return null;
            }
        }, lVar != null ? new ew(lVar, 12) : null);
    }

    public void setTtsId(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, "ttsVoiceId");
        NativeManager.runNativeTask(new ex(this, str, 6), lVar != null ? new ew(lVar, 11) : null);
    }

    public void setVoiceAsset(VoiceAsset voiceAsset, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ex(this, voiceAsset, 7), lVar != null ? new ew(lVar, 15) : null);
    }

    public void unsetTts(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hr(this, 4), lVar != null ? new ew(lVar, 16) : null);
    }

    public void updateGuidanceConnectivity(GuidanceSource guidanceSource, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(guidanceSource, "guidanceSource");
        NativeManager.runNativeTask(new ex(this, guidanceSource, 5), lVar != null ? new ew(lVar, 10) : null);
    }

    public final void setInstructionSegmentToPlayAndThen(int i2) {
        setInstructionSegmentToPlayAndThen$default(this, i2, null, 2, null);
    }

    public final void clearInstructionSegmentToPlayAndThen() {
        clearInstructionSegmentToPlayAndThen$default(this, null, 1, null);
    }

    public final void initNativeLayer() {
        initNativeLayer$default(this, null, 1, null);
    }

    public final void setVoiceAsset(VoiceAsset voiceAsset) {
        setVoiceAsset$default(this, voiceAsset, null, 2, null);
    }

    public final void unsetTts() {
        unsetTts$default(this, null, 1, null);
    }

    public final void setTtsId(String str) {
        h.g.b.x.f(str, "ttsVoiceId");
        setTtsId$default(this, str, null, 2, null);
    }

    public final void updateGuidanceConnectivity(GuidanceSource guidanceSource) {
        h.g.b.x.f(guidanceSource, "guidanceSource");
        updateGuidanceConnectivity$default(this, guidanceSource, null, 2, null);
    }
}
