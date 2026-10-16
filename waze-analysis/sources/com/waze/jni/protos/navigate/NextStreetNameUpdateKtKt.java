package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.NextStreetNameUpdate;
import com.waze.jni.protos.navigate.NextStreetNameUpdateKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NextStreetNameUpdateKtKt {
    /* renamed from: -initializenextStreetNameUpdate, reason: not valid java name */
    public static final NextStreetNameUpdate m27429initializenextStreetNameUpdate(l<? super NextStreetNameUpdateKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NextStreetNameUpdateKt.Dsl.Companion companion = NextStreetNameUpdateKt.Dsl.Companion;
        NextStreetNameUpdate.Builder builderNewBuilder = NextStreetNameUpdate.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NextStreetNameUpdateKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NextStreetNameUpdate copy(NextStreetNameUpdate nextStreetNameUpdate, l<? super NextStreetNameUpdateKt.Dsl, ab> lVar) {
        x.f(nextStreetNameUpdate, "<this>");
        x.f(lVar, "block");
        NextStreetNameUpdateKt.Dsl.Companion companion = NextStreetNameUpdateKt.Dsl.Companion;
        NextStreetNameUpdate.Builder builder = nextStreetNameUpdate.toBuilder();
        x.e(builder, "toBuilder(...)");
        NextStreetNameUpdateKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationRoadSign getRoadSignOrNull(NextStreetNameUpdateOrBuilder nextStreetNameUpdateOrBuilder) {
        x.f(nextStreetNameUpdateOrBuilder, "<this>");
        if (nextStreetNameUpdateOrBuilder.hasRoadSign()) {
            return nextStreetNameUpdateOrBuilder.getRoadSign();
        }
        return null;
    }

    public static /* synthetic */ void getRoadSignOrNull$annotations(NextStreetNameUpdateOrBuilder nextStreetNameUpdateOrBuilder) {
    }
}
