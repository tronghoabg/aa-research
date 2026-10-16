package com.waze.jni.protos.settings;

import com.waze.jni.protos.settings.VoiceDataList;
import com.waze.jni.protos.settings.VoiceDataListKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VoiceDataListKtKt {
    /* renamed from: -initializevoiceDataList, reason: not valid java name */
    public static final VoiceDataList m28361initializevoiceDataList(l<? super VoiceDataListKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        VoiceDataListKt.Dsl.Companion companion = VoiceDataListKt.Dsl.Companion;
        VoiceDataList.Builder builderNewBuilder = VoiceDataList.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        VoiceDataListKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final VoiceDataList copy(VoiceDataList voiceDataList, l<? super VoiceDataListKt.Dsl, ab> lVar) {
        x.f(voiceDataList, "<this>");
        x.f(lVar, "block");
        VoiceDataListKt.Dsl.Companion companion = VoiceDataListKt.Dsl.Companion;
        VoiceDataList.Builder builder = voiceDataList.toBuilder();
        x.e(builder, "toBuilder(...)");
        VoiceDataListKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
