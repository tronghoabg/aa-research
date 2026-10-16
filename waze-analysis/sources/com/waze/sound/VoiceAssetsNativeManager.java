package com.waze.sound;

import com.waze.jni.protos.sound.VoiceAssetRequest;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class VoiceAssetsNativeManager extends ib {
    public static final int $stable = 8;
    private final kotlinx.coroutines.af coroutineScope;
    private final com.waze.shared_infra.i.e logger;
    private final ic voiceAssetsUseCase;

    public VoiceAssetsNativeManager(ic icVar, com.waze.shared_infra.i.e eVar, kotlinx.coroutines.ab abVar) {
        h.g.b.x.f(icVar, "voiceAssetsUseCase");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(abVar, "ioDispatcher");
        this.voiceAssetsUseCase = icVar;
        this.logger = eVar;
        this.coroutineScope = kotlinx.coroutines.aj.e(abVar);
    }

    public final native void initNativeLayerNTV();

    public final native void onVoiceAssetRequestCompleteNTV(byte[] bArr);

    @Override // com.waze.sound.ib
    public void playUrl(String str) {
        h.g.b.x.f(str, "url");
        this.logger.a("calling voiceAssetsUseCase.playVoiceAsset");
        this.voiceAssetsUseCase.b(str);
    }

    @Override // com.waze.sound.ib
    public void requestVoiceAsset(VoiceAssetRequest voiceAssetRequest) {
        h.g.b.x.f(voiceAssetRequest, "voiceAssetRequest");
        kotlinx.coroutines.aj.z(this.coroutineScope, null, null, new dz(this, voiceAssetRequest, (h.c.e) null, 5), 3);
    }

    public /* synthetic */ VoiceAssetsNativeManager(ic icVar, com.waze.shared_infra.i.e eVar, kotlinx.coroutines.ab abVar, int i2, h.g.b.o oVar) {
        this(icVar, eVar, (i2 & 4) != 0 ? kotlinx.coroutines.av.b() : abVar);
    }
}
