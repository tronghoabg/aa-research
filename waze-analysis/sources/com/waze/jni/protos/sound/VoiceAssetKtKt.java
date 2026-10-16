package com.waze.jni.protos.sound;

import com.waze.jni.protos.sound.VoiceAsset;
import com.waze.jni.protos.sound.VoiceAssetKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VoiceAssetKtKt {
    /* renamed from: -initializevoiceAsset, reason: not valid java name */
    public static final VoiceAsset m28400initializevoiceAsset(l<? super VoiceAssetKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        VoiceAssetKt.Dsl.Companion companion = VoiceAssetKt.Dsl.Companion;
        VoiceAsset.Builder builderNewBuilder = VoiceAsset.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        VoiceAssetKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final VoiceAsset copy(VoiceAsset voiceAsset, l<? super VoiceAssetKt.Dsl, ab> lVar) {
        x.f(voiceAsset, "<this>");
        x.f(lVar, "block");
        VoiceAssetKt.Dsl.Companion companion = VoiceAssetKt.Dsl.Companion;
        VoiceAsset.Builder builder = voiceAsset.toBuilder();
        x.e(builder, "toBuilder(...)");
        VoiceAssetKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
