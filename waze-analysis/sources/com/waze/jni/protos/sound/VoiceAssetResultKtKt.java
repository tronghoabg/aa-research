package com.waze.jni.protos.sound;

import com.waze.jni.protos.sound.VoiceAssetResult;
import com.waze.jni.protos.sound.VoiceAssetResultKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VoiceAssetResultKtKt {
    /* renamed from: -initializevoiceAssetResult, reason: not valid java name */
    public static final VoiceAssetResult m28432initializevoiceAssetResult(l<? super VoiceAssetResultKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        VoiceAssetResultKt.Dsl.Companion companion = VoiceAssetResultKt.Dsl.Companion;
        VoiceAssetResult.Builder builderNewBuilder = VoiceAssetResult.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        VoiceAssetResultKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final VoiceAssetResult.Failure copy(VoiceAssetResult.Failure failure, l<? super VoiceAssetResultKt.FailureKt.Dsl, ab> lVar) {
        x.f(failure, "<this>");
        x.f(lVar, "block");
        VoiceAssetResultKt.FailureKt.Dsl.Companion companion = VoiceAssetResultKt.FailureKt.Dsl.Companion;
        VoiceAssetResult.Failure.Builder builder = failure.toBuilder();
        x.e(builder, "toBuilder(...)");
        VoiceAssetResultKt.FailureKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final VoiceAssetResult.Failure getFailureOrNull(VoiceAssetResultOrBuilder voiceAssetResultOrBuilder) {
        x.f(voiceAssetResultOrBuilder, "<this>");
        if (voiceAssetResultOrBuilder.hasFailure()) {
            return voiceAssetResultOrBuilder.getFailure();
        }
        return null;
    }

    public static /* synthetic */ void getFailureOrNull$annotations(VoiceAssetResultOrBuilder voiceAssetResultOrBuilder) {
    }

    public static final VoiceAssetResult.Success getSuccessOrNull(VoiceAssetResultOrBuilder voiceAssetResultOrBuilder) {
        x.f(voiceAssetResultOrBuilder, "<this>");
        if (voiceAssetResultOrBuilder.hasSuccess()) {
            return voiceAssetResultOrBuilder.getSuccess();
        }
        return null;
    }

    public static /* synthetic */ void getSuccessOrNull$annotations(VoiceAssetResultOrBuilder voiceAssetResultOrBuilder) {
    }

    public static final VoiceAssetResult.Success copy(VoiceAssetResult.Success success, l<? super VoiceAssetResultKt.SuccessKt.Dsl, ab> lVar) {
        x.f(success, "<this>");
        x.f(lVar, "block");
        VoiceAssetResultKt.SuccessKt.Dsl.Companion companion = VoiceAssetResultKt.SuccessKt.Dsl.Companion;
        VoiceAssetResult.Success.Builder builder = success.toBuilder();
        x.e(builder, "toBuilder(...)");
        VoiceAssetResultKt.SuccessKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final VoiceAssetResult copy(VoiceAssetResult voiceAssetResult, l<? super VoiceAssetResultKt.Dsl, ab> lVar) {
        x.f(voiceAssetResult, "<this>");
        x.f(lVar, "block");
        VoiceAssetResultKt.Dsl.Companion companion = VoiceAssetResultKt.Dsl.Companion;
        VoiceAssetResult.Builder builder = voiceAssetResult.toBuilder();
        x.e(builder, "toBuilder(...)");
        VoiceAssetResultKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
