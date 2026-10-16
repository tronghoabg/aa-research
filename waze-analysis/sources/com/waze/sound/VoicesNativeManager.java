package com.waze.sound;

import com.waze.jni.protos.sound.GuidanceMode;
import com.waze.jni.protos.sound.GuidanceSource;
import com.waze.jni.protos.sound.VoiceAsset;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class VoicesNativeManager extends kg {
    public static final int $stable = 8;
    private final bs guidanceModeRepository;

    public VoicesNativeManager(bs bsVar) {
        h.g.b.x.f(bsVar, "guidanceModeRepository");
        this.guidanceModeRepository = bsVar;
    }

    public final native void clearInstructionSegmentToPlayAndThenNTV();

    public final bs getGuidanceModeRepository() {
        return this.guidanceModeRepository;
    }

    public final GuidanceMode.Type getNavigationGuidanceMode$third_party_waze_client_android_project_waze_src_main_waze() {
        bp bpVar = (bp) this.guidanceModeRepository.b().d();
        bp bpVar2 = bp.f39554a;
        bv bvVar = bv.f39577a;
        com.waze.copilot.data.ah ahVar = com.waze.copilot.data.ah.f22965a;
        int iOrdinal = bpVar.ordinal();
        if (iOrdinal == 0) {
            return GuidanceMode.Type.FULL;
        }
        if (iOrdinal == 1) {
            return GuidanceMode.Type.BRIEF;
        }
        if (iOrdinal == 2) {
            return GuidanceMode.Type.SMART;
        }
        if (iOrdinal == 3) {
            return GuidanceMode.Type.ALERTS;
        }
        if (iOrdinal == 4) {
            return GuidanceMode.Type.OFF;
        }
        throw new h.i();
    }

    public final native void initNativeLayerNTV();

    public void setGuidanceConnectivity(bv bvVar) {
        GuidanceSource.Type type;
        h.g.b.x.f(bvVar, "guidanceSource");
        bp bpVar = bp.f39554a;
        bv bvVar2 = bv.f39577a;
        com.waze.copilot.data.ah ahVar = com.waze.copilot.data.ah.f22965a;
        int iOrdinal = bvVar.ordinal();
        if (iOrdinal == 0) {
            type = GuidanceSource.Type.OFFLINE;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            type = GuidanceSource.Type.ONLINE;
        }
        GuidanceSource.Builder builderNewBuilder = GuidanceSource.newBuilder();
        builderNewBuilder.setType(type);
        GuidanceSource guidanceSourceBuild = builderNewBuilder.build();
        h.g.b.x.e(guidanceSourceBuild, "build(...)");
        kg.updateGuidanceConnectivity$default(this, guidanceSourceBuild, null, 2, null);
    }

    public final native void setInstructionSegmentToPlayAndThenNTV(int i2);

    public native void setTtsIdNTV(String str);

    public final void setVoiceAsset(com.waze.copilot.data.ag agVar) {
        VoiceAsset.Type type;
        h.g.b.x.f(agVar, "voiceAsset");
        com.waze.copilot.data.ah ahVarD = agVar.d();
        bp bpVar = bp.f39554a;
        bv bvVar = bv.f39577a;
        com.waze.copilot.data.ah ahVar = com.waze.copilot.data.ah.f22965a;
        int iOrdinal = ahVarD.ordinal();
        if (iOrdinal == 0) {
            type = VoiceAsset.Type.TTS;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            type = VoiceAsset.Type.PROMPT;
        }
        VoiceAsset.Builder builderNewBuilder = VoiceAsset.newBuilder();
        builderNewBuilder.setType(type);
        builderNewBuilder.setVersion(agVar.a());
        builderNewBuilder.setLanguage(agVar.g());
        builderNewBuilder.setId(agVar.f());
        builderNewBuilder.setLocale(agVar.h());
        kg.setVoiceAsset$default(this, builderNewBuilder.build(), null, 2, null);
    }

    public final native void setVoiceAssetNTV(byte[] bArr);

    public final native void unsetTtsNTV();

    public final native void updateGuidanceConnectivityNTV(byte[] bArr);
}
