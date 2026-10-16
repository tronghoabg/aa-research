package com.waze.sound;

import com.waze.NativeManager;
import com.waze.jni.protos.sound.VoiceAssetRequest;
import com.waze.jni.protos.sound.VoiceAssetResult;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class ib {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onVoiceAssetRequestComplete$default(ib ibVar, VoiceAssetResult voiceAssetResult, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onVoiceAssetRequestComplete");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        ibVar.onVoiceAssetRequestComplete(voiceAssetResult, lVar);
    }

    static final h.ab onVoiceAssetRequestComplete$lambda$0(ib ibVar, VoiceAssetResult voiceAssetResult) {
        h.g.b.x.d(ibVar, "null cannot be cast to non-null type com.waze.sound.VoiceAssetsNativeManager");
        byte[] byteArray = voiceAssetResult.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        ((VoiceAssetsNativeManager) ibVar).onVoiceAssetRequestCompleteNTV(byteArray);
        return null;
    }

    static final void playUrlJNI$lambda$0(ib ibVar, String str) {
        h.g.b.x.d(ibVar, "null cannot be cast to non-null type com.waze.sound.VoiceAssetsNativeManager");
        ((VoiceAssetsNativeManager) ibVar).playUrl(str);
    }

    static final void requestVoiceAssetJNI$lambda$0(ib ibVar, VoiceAssetRequest voiceAssetRequest) {
        h.g.b.x.d(ibVar, "null cannot be cast to non-null type com.waze.sound.VoiceAssetsNativeManager");
        h.g.b.x.c(voiceAssetRequest);
        ((VoiceAssetsNativeManager) ibVar).requestVoiceAsset(voiceAssetRequest);
    }

    public void onVoiceAssetRequestComplete(VoiceAssetResult voiceAssetResult, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(voiceAssetResult, "voiceAssetResult");
        NativeManager.runNativeTask(new ex(this, voiceAssetResult, 4), lVar != null ? new ew(lVar, 9) : null);
    }

    public abstract void playUrl(String str);

    protected final void playUrlJNI(String str) {
        h.g.b.x.f(str, "url");
        NativeManager.runMainThreadTask(new ia(this, str, 0));
    }

    public abstract void requestVoiceAsset(VoiceAssetRequest voiceAssetRequest);

    protected final void requestVoiceAssetJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "voiceAssetRequest");
        try {
            NativeManager.runMainThreadTask(new ia(this, (VoiceAssetRequest) VoiceAssetRequest.parser().c(bArr), 1));
        } catch (com.google.v.eu unused) {
        }
    }

    public final void onVoiceAssetRequestComplete(VoiceAssetResult voiceAssetResult) {
        h.g.b.x.f(voiceAssetResult, "voiceAssetResult");
        onVoiceAssetRequestComplete$default(this, voiceAssetResult, null, 2, null);
    }
}
