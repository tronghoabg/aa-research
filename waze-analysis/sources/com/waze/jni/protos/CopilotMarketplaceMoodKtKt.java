package com.waze.jni.protos;

import com.waze.jni.protos.CopilotMarketplaceMood;
import com.waze.jni.protos.CopilotMarketplaceMoodKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CopilotMarketplaceMoodKtKt {
    /* renamed from: -initializecopilotMarketplaceMood, reason: not valid java name */
    public static final CopilotMarketplaceMood m25034initializecopilotMarketplaceMood(l<? super CopilotMarketplaceMoodKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        CopilotMarketplaceMoodKt.Dsl.Companion companion = CopilotMarketplaceMoodKt.Dsl.Companion;
        CopilotMarketplaceMood.Builder builderNewBuilder = CopilotMarketplaceMood.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        CopilotMarketplaceMoodKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CopilotMarketplaceMood copy(CopilotMarketplaceMood copilotMarketplaceMood, l<? super CopilotMarketplaceMoodKt.Dsl, ab> lVar) {
        x.f(copilotMarketplaceMood, "<this>");
        x.f(lVar, "block");
        CopilotMarketplaceMoodKt.Dsl.Companion companion = CopilotMarketplaceMoodKt.Dsl.Companion;
        CopilotMarketplaceMood.Builder builder = copilotMarketplaceMood.toBuilder();
        x.e(builder, "toBuilder(...)");
        CopilotMarketplaceMoodKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
