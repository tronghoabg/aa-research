package com.waze.jni.protos;

import com.waze.jni.protos.CopilotMarketplaceCar;
import com.waze.jni.protos.CopilotMarketplaceCarKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CopilotMarketplaceCarKtKt {
    /* renamed from: -initializecopilotMarketplaceCar, reason: not valid java name */
    public static final CopilotMarketplaceCar m25023initializecopilotMarketplaceCar(l<? super CopilotMarketplaceCarKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        CopilotMarketplaceCarKt.Dsl.Companion companion = CopilotMarketplaceCarKt.Dsl.Companion;
        CopilotMarketplaceCar.Builder builderNewBuilder = CopilotMarketplaceCar.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        CopilotMarketplaceCarKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CopilotMarketplaceCar copy(CopilotMarketplaceCar copilotMarketplaceCar, l<? super CopilotMarketplaceCarKt.Dsl, ab> lVar) {
        x.f(copilotMarketplaceCar, "<this>");
        x.f(lVar, "block");
        CopilotMarketplaceCarKt.Dsl.Companion companion = CopilotMarketplaceCarKt.Dsl.Companion;
        CopilotMarketplaceCar.Builder builder = copilotMarketplaceCar.toBuilder();
        x.e(builder, "toBuilder(...)");
        CopilotMarketplaceCarKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Car3DInfo getCar3DInfoOrNull(CopilotMarketplaceCarOrBuilder copilotMarketplaceCarOrBuilder) {
        x.f(copilotMarketplaceCarOrBuilder, "<this>");
        if (copilotMarketplaceCarOrBuilder.hasCar3DInfo()) {
            return copilotMarketplaceCarOrBuilder.getCar3DInfo();
        }
        return null;
    }

    public static /* synthetic */ void getCar3DInfoOrNull$annotations(CopilotMarketplaceCarOrBuilder copilotMarketplaceCarOrBuilder) {
    }
}
