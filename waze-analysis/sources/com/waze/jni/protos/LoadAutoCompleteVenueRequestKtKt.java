package com.waze.jni.protos;

import com.waze.jni.protos.LoadAutoCompleteVenueRequest;
import com.waze.jni.protos.LoadAutoCompleteVenueRequestKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LoadAutoCompleteVenueRequestKtKt {
    /* renamed from: -initializeloadAutoCompleteVenueRequest, reason: not valid java name */
    public static final LoadAutoCompleteVenueRequest m25219initializeloadAutoCompleteVenueRequest(l<? super LoadAutoCompleteVenueRequestKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        LoadAutoCompleteVenueRequestKt.Dsl.Companion companion = LoadAutoCompleteVenueRequestKt.Dsl.Companion;
        LoadAutoCompleteVenueRequest.Builder builderNewBuilder = LoadAutoCompleteVenueRequest.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        LoadAutoCompleteVenueRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final LoadAutoCompleteVenueRequest copy(LoadAutoCompleteVenueRequest loadAutoCompleteVenueRequest, l<? super LoadAutoCompleteVenueRequestKt.Dsl, ab> lVar) {
        x.f(loadAutoCompleteVenueRequest, "<this>");
        x.f(lVar, "block");
        LoadAutoCompleteVenueRequestKt.Dsl.Companion companion = LoadAutoCompleteVenueRequestKt.Dsl.Companion;
        LoadAutoCompleteVenueRequest.Builder builder = loadAutoCompleteVenueRequest.toBuilder();
        x.e(builder, "toBuilder(...)");
        LoadAutoCompleteVenueRequestKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
