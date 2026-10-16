package com.waze.jni.protos;

import com.waze.jni.protos.LoadAutoCompleteVenueResponse;
import com.waze.jni.protos.LoadAutoCompleteVenueResponseKt;
import com.waze.jni.protos.places.Place;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LoadAutoCompleteVenueResponseKtKt {
    /* renamed from: -initializeloadAutoCompleteVenueResponse, reason: not valid java name */
    public static final LoadAutoCompleteVenueResponse m25224initializeloadAutoCompleteVenueResponse(l<? super LoadAutoCompleteVenueResponseKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        LoadAutoCompleteVenueResponseKt.Dsl.Companion companion = LoadAutoCompleteVenueResponseKt.Dsl.Companion;
        LoadAutoCompleteVenueResponse.Builder builderNewBuilder = LoadAutoCompleteVenueResponse.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        LoadAutoCompleteVenueResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final LoadAutoCompleteVenueResponse copy(LoadAutoCompleteVenueResponse loadAutoCompleteVenueResponse, l<? super LoadAutoCompleteVenueResponseKt.Dsl, ab> lVar) {
        x.f(loadAutoCompleteVenueResponse, "<this>");
        x.f(lVar, "block");
        LoadAutoCompleteVenueResponseKt.Dsl.Companion companion = LoadAutoCompleteVenueResponseKt.Dsl.Companion;
        LoadAutoCompleteVenueResponse.Builder builder = loadAutoCompleteVenueResponse.toBuilder();
        x.e(builder, "toBuilder(...)");
        LoadAutoCompleteVenueResponseKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Place getPlaceOrNull(LoadAutoCompleteVenueResponseOrBuilder loadAutoCompleteVenueResponseOrBuilder) {
        x.f(loadAutoCompleteVenueResponseOrBuilder, "<this>");
        if (loadAutoCompleteVenueResponseOrBuilder.hasPlace()) {
            return loadAutoCompleteVenueResponseOrBuilder.getPlace();
        }
        return null;
    }

    public static /* synthetic */ void getPlaceOrNull$annotations(LoadAutoCompleteVenueResponseOrBuilder loadAutoCompleteVenueResponseOrBuilder) {
    }
}
