package com.waze.jni.protos.location;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.location.ProviderPosition;
import com.waze.jni.protos.location.ProviderPositionKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ProviderPositionKtKt {
    /* renamed from: -initializeproviderPosition, reason: not valid java name */
    public static final ProviderPosition m26362initializeproviderPosition(l<? super ProviderPositionKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ProviderPositionKt.Dsl.Companion companion = ProviderPositionKt.Dsl.Companion;
        ProviderPosition.Builder builderNewBuilder = ProviderPosition.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ProviderPositionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ProviderPosition copy(ProviderPosition providerPosition, l<? super ProviderPositionKt.Dsl, ab> lVar) {
        x.f(providerPosition, "<this>");
        x.f(lVar, "block");
        ProviderPositionKt.Dsl.Companion companion = ProviderPositionKt.Dsl.Companion;
        ProviderPosition.Builder builder = providerPosition.toBuilder();
        x.e(builder, "toBuilder(...)");
        ProviderPositionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MatchedPositionProto getMatcherInfoOrNull(ProviderPositionOrBuilder providerPositionOrBuilder) {
        x.f(providerPositionOrBuilder, "<this>");
        if (providerPositionOrBuilder.hasMatcherInfo()) {
            return providerPositionOrBuilder.getMatcherInfo();
        }
        return null;
    }

    public static /* synthetic */ void getMatcherInfoOrNull$annotations(ProviderPositionOrBuilder providerPositionOrBuilder) {
    }

    public static final Position.IntPosition getPositionOrNull(ProviderPositionOrBuilder providerPositionOrBuilder) {
        x.f(providerPositionOrBuilder, "<this>");
        if (providerPositionOrBuilder.hasPosition()) {
            return providerPositionOrBuilder.getPosition();
        }
        return null;
    }

    public static /* synthetic */ void getPositionOrNull$annotations(ProviderPositionOrBuilder providerPositionOrBuilder) {
    }
}
