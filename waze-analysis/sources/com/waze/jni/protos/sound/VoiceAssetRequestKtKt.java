package com.waze.jni.protos.sound;

import com.waze.jni.protos.sound.VoiceAssetRequest;
import com.waze.jni.protos.sound.VoiceAssetRequestKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VoiceAssetRequestKtKt {
    /* renamed from: -initializevoiceAssetRequest, reason: not valid java name */
    public static final VoiceAssetRequest m28410initializevoiceAssetRequest(l<? super VoiceAssetRequestKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        VoiceAssetRequestKt.Dsl.Companion companion = VoiceAssetRequestKt.Dsl.Companion;
        VoiceAssetRequest.Builder builderNewBuilder = VoiceAssetRequest.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        VoiceAssetRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final VoiceAssetRequest copy(VoiceAssetRequest voiceAssetRequest, l<? super VoiceAssetRequestKt.Dsl, ab> lVar) {
        x.f(voiceAssetRequest, "<this>");
        x.f(lVar, "block");
        VoiceAssetRequestKt.Dsl.Companion companion = VoiceAssetRequestKt.Dsl.Companion;
        VoiceAssetRequest.Builder builder = voiceAssetRequest.toBuilder();
        x.e(builder, "toBuilder(...)");
        VoiceAssetRequestKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
