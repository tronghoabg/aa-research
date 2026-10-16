package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.CurrentStreetNameUpdate;
import com.waze.jni.protos.navigate.CurrentStreetNameUpdateKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CurrentStreetNameUpdateKtKt {
    /* renamed from: -initializecurrentStreetNameUpdate, reason: not valid java name */
    public static final CurrentStreetNameUpdate m27156initializecurrentStreetNameUpdate(l<? super CurrentStreetNameUpdateKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        CurrentStreetNameUpdateKt.Dsl.Companion companion = CurrentStreetNameUpdateKt.Dsl.Companion;
        CurrentStreetNameUpdate.Builder builderNewBuilder = CurrentStreetNameUpdate.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        CurrentStreetNameUpdateKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CurrentStreetNameUpdate copy(CurrentStreetNameUpdate currentStreetNameUpdate, l<? super CurrentStreetNameUpdateKt.Dsl, ab> lVar) {
        x.f(currentStreetNameUpdate, "<this>");
        x.f(lVar, "block");
        CurrentStreetNameUpdateKt.Dsl.Companion companion = CurrentStreetNameUpdateKt.Dsl.Companion;
        CurrentStreetNameUpdate.Builder builder = currentStreetNameUpdate.toBuilder();
        x.e(builder, "toBuilder(...)");
        CurrentStreetNameUpdateKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationRoadSign getRoadSignOrNull(CurrentStreetNameUpdateOrBuilder currentStreetNameUpdateOrBuilder) {
        x.f(currentStreetNameUpdateOrBuilder, "<this>");
        if (currentStreetNameUpdateOrBuilder.hasRoadSign()) {
            return currentStreetNameUpdateOrBuilder.getRoadSign();
        }
        return null;
    }

    public static /* synthetic */ void getRoadSignOrNull$annotations(CurrentStreetNameUpdateOrBuilder currentStreetNameUpdateOrBuilder) {
    }
}
