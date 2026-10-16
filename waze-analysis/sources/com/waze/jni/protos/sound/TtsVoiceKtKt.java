package com.waze.jni.protos.sound;

import com.waze.jni.protos.sound.TtsVoice;
import com.waze.jni.protos.sound.TtsVoiceKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TtsVoiceKtKt {
    /* renamed from: -initializettsVoice, reason: not valid java name */
    public static final TtsVoice m28384initializettsVoice(l<? super TtsVoiceKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        TtsVoiceKt.Dsl.Companion companion = TtsVoiceKt.Dsl.Companion;
        TtsVoice.Builder builderNewBuilder = TtsVoice.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        TtsVoiceKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TtsVoice copy(TtsVoice ttsVoice, l<? super TtsVoiceKt.Dsl, ab> lVar) {
        x.f(ttsVoice, "<this>");
        x.f(lVar, "block");
        TtsVoiceKt.Dsl.Companion companion = TtsVoiceKt.Dsl.Companion;
        TtsVoice.Builder builder = ttsVoice.toBuilder();
        x.e(builder, "toBuilder(...)");
        TtsVoiceKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
