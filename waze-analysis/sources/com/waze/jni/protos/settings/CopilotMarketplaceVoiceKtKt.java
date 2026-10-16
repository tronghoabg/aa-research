package com.waze.jni.protos.settings;

import com.waze.jni.protos.settings.CopilotMarketplaceVoice;
import com.waze.jni.protos.settings.CopilotMarketplaceVoiceKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CopilotMarketplaceVoiceKtKt {
    /* renamed from: -initializecopilotMarketplaceVoice, reason: not valid java name */
    public static final CopilotMarketplaceVoice m28286initializecopilotMarketplaceVoice(l<? super CopilotMarketplaceVoiceKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        CopilotMarketplaceVoiceKt.Dsl.Companion companion = CopilotMarketplaceVoiceKt.Dsl.Companion;
        CopilotMarketplaceVoice.Builder builderNewBuilder = CopilotMarketplaceVoice.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        CopilotMarketplaceVoiceKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CopilotMarketplaceVoice copy(CopilotMarketplaceVoice copilotMarketplaceVoice, l<? super CopilotMarketplaceVoiceKt.Dsl, ab> lVar) {
        x.f(copilotMarketplaceVoice, "<this>");
        x.f(lVar, "block");
        CopilotMarketplaceVoiceKt.Dsl.Companion companion = CopilotMarketplaceVoiceKt.Dsl.Companion;
        CopilotMarketplaceVoice.Builder builder = copilotMarketplaceVoice.toBuilder();
        x.e(builder, "toBuilder(...)");
        CopilotMarketplaceVoiceKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
