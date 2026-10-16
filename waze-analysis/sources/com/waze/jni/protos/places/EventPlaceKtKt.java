package com.waze.jni.protos.places;

import com.waze.jni.protos.places.EventPlace;
import com.waze.jni.protos.places.EventPlaceKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EventPlaceKtKt {
    /* renamed from: -initializeeventPlace, reason: not valid java name */
    public static final EventPlace m27934initializeeventPlace(l<? super EventPlaceKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        EventPlaceKt.Dsl.Companion companion = EventPlaceKt.Dsl.Companion;
        EventPlace.Builder builderNewBuilder = EventPlace.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        EventPlaceKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EventPlace copy(EventPlace eventPlace, l<? super EventPlaceKt.Dsl, ab> lVar) {
        x.f(eventPlace, "<this>");
        x.f(lVar, "block");
        EventPlaceKt.Dsl.Companion companion = EventPlaceKt.Dsl.Companion;
        EventPlace.Builder builder = eventPlace.toBuilder();
        x.e(builder, "toBuilder(...)");
        EventPlaceKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Place getOriginPlaceOrNull(EventPlaceOrBuilder eventPlaceOrBuilder) {
        x.f(eventPlaceOrBuilder, "<this>");
        if (eventPlaceOrBuilder.hasOriginPlace()) {
            return eventPlaceOrBuilder.getOriginPlace();
        }
        return null;
    }

    public static /* synthetic */ void getOriginPlaceOrNull$annotations(EventPlaceOrBuilder eventPlaceOrBuilder) {
    }
}
