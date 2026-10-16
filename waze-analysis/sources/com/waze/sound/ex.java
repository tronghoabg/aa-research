package com.waze.sound;

import com.waze.jni.protos.sound.GuidanceSource;
import com.waze.jni.protos.sound.VoiceAsset;
import com.waze.jni.protos.sound.VoiceAssetResult;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ex implements com.waze.hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f39969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39970b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f39971c;

    public /* synthetic */ ex(Object obj, com.google.v.du duVar, int i2) {
        this.f39971c = i2;
        this.f39970b = obj;
        this.f39969a = duVar;
    }

    @Override // com.waze.hw
    public final Object a() {
        switch (this.f39971c) {
            case 0:
                return fa.getCustomPromptSet$lambda$0((fa) this.f39969a, (String) this.f39970b);
            case 1:
                return fa.getPathForPrompt$lambda$0((fa) this.f39969a, (String) this.f39970b);
            case 2:
                fa.playTts$lambda$0((fa) this.f39969a, (String) this.f39970b);
                return null;
            case 3:
                return hs.getTTSKeyTranslation$lambda$0((hs) this.f39969a, (String) this.f39970b);
            case 4:
                ib.onVoiceAssetRequestComplete$lambda$0((ib) this.f39970b, (VoiceAssetResult) this.f39969a);
                return null;
            case 5:
                kg.updateGuidanceConnectivity$lambda$0((kg) this.f39970b, (GuidanceSource) this.f39969a);
                return null;
            case 6:
                kg.setTtsId$lambda$0((kg) this.f39969a, (String) this.f39970b);
                return null;
            case 7:
                kg.setVoiceAsset$lambda$0((kg) this.f39970b, (VoiceAsset) this.f39969a);
                return null;
            case 8:
                kj.downloadIfNeeded$lambda$0((kj) this.f39969a, (String) this.f39970b);
                return null;
            default:
                return ks.getTranslationActual$lambda$0((ks) this.f39969a, (String) this.f39970b);
        }
    }

    public /* synthetic */ ex(Object obj, String str, int i2) {
        this.f39971c = i2;
        this.f39969a = obj;
        this.f39970b = str;
    }
}
