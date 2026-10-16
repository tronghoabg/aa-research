package com.waze.jni.protos.settings;

import com.waze.jni.protos.settings.VoiceData;
import com.waze.jni.protos.settings.VoiceDataKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VoiceDataKtKt {
    /* renamed from: -initializevoiceData, reason: not valid java name */
    public static final VoiceData m28353initializevoiceData(l<? super VoiceDataKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        VoiceDataKt.Dsl.Companion companion = VoiceDataKt.Dsl.Companion;
        VoiceData.Builder builderNewBuilder = VoiceData.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        VoiceDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final VoiceData copy(VoiceData voiceData, l<? super VoiceDataKt.Dsl, ab> lVar) {
        x.f(voiceData, "<this>");
        x.f(lVar, "block");
        VoiceDataKt.Dsl.Companion companion = VoiceDataKt.Dsl.Companion;
        VoiceData.Builder builder = voiceData.toBuilder();
        x.e(builder, "toBuilder(...)");
        VoiceDataKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
