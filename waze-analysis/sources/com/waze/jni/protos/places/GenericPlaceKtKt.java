package com.waze.jni.protos.places;

import com.waze.jni.protos.places.GenericPlace;
import com.waze.jni.protos.places.GenericPlaceKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GenericPlaceKtKt {
    /* renamed from: -initializegenericPlace, reason: not valid java name */
    public static final GenericPlace m27969initializegenericPlace(l<? super GenericPlaceKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        GenericPlaceKt.Dsl.Companion companion = GenericPlaceKt.Dsl.Companion;
        GenericPlace.Builder builderNewBuilder = GenericPlace.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        GenericPlaceKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final GenericPlace copy(GenericPlace genericPlace, l<? super GenericPlaceKt.Dsl, ab> lVar) {
        x.f(genericPlace, "<this>");
        x.f(lVar, "block");
        GenericPlaceKt.Dsl.Companion companion = GenericPlaceKt.Dsl.Companion;
        GenericPlace.Builder builder = genericPlace.toBuilder();
        x.e(builder, "toBuilder(...)");
        GenericPlaceKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EventPlace getEventPlaceOrNull(GenericPlaceOrBuilder genericPlaceOrBuilder) {
        x.f(genericPlaceOrBuilder, "<this>");
        if (genericPlaceOrBuilder.hasEventPlace()) {
            return genericPlaceOrBuilder.getEventPlace();
        }
        return null;
    }

    public static /* synthetic */ void getEventPlaceOrNull$annotations(GenericPlaceOrBuilder genericPlaceOrBuilder) {
    }

    public static final FavoritePlace getFavoritePlaceOrNull(GenericPlaceOrBuilder genericPlaceOrBuilder) {
        x.f(genericPlaceOrBuilder, "<this>");
        if (genericPlaceOrBuilder.hasFavoritePlace()) {
            return genericPlaceOrBuilder.getFavoritePlace();
        }
        return null;
    }

    public static /* synthetic */ void getFavoritePlaceOrNull$annotations(GenericPlaceOrBuilder genericPlaceOrBuilder) {
    }

    public static final RecentPlace getRecentPlaceOrNull(GenericPlaceOrBuilder genericPlaceOrBuilder) {
        x.f(genericPlaceOrBuilder, "<this>");
        if (genericPlaceOrBuilder.hasRecentPlace()) {
            return genericPlaceOrBuilder.getRecentPlace();
        }
        return null;
    }

    public static /* synthetic */ void getRecentPlaceOrNull$annotations(GenericPlaceOrBuilder genericPlaceOrBuilder) {
    }

    public static final Place getWazeAddressOrNull(GenericPlaceOrBuilder genericPlaceOrBuilder) {
        x.f(genericPlaceOrBuilder, "<this>");
        if (genericPlaceOrBuilder.hasWazeAddress()) {
            return genericPlaceOrBuilder.getWazeAddress();
        }
        return null;
    }

    public static /* synthetic */ void getWazeAddressOrNull$annotations(GenericPlaceOrBuilder genericPlaceOrBuilder) {
    }
}
