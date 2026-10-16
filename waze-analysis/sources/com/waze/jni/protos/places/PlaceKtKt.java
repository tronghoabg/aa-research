package com.waze.jni.protos.places;

import com.google.v.ec;
import com.google.v.o;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.places.Place;
import com.waze.jni.protos.places.PlaceKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PlaceKtKt {
    /* renamed from: -initializeplace, reason: not valid java name */
    public static final Place m28025initializeplace(l<? super PlaceKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PlaceKt.Dsl.Companion companion = PlaceKt.Dsl.Companion;
        Place.Builder builderNewBuilder = Place.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PlaceKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Place copy(Place place, l<? super PlaceKt.Dsl, ab> lVar) {
        x.f(place, "<this>");
        x.f(lVar, "block");
        PlaceKt.Dsl.Companion companion = PlaceKt.Dsl.Companion;
        Place.Builder builder = place.toBuilder();
        x.e(builder, "toBuilder(...)");
        PlaceKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Address getAddressOrNull(PlaceOrBuilder placeOrBuilder) {
        x.f(placeOrBuilder, "<this>");
        if (placeOrBuilder.hasAddress()) {
            return placeOrBuilder.getAddress();
        }
        return null;
    }

    public static /* synthetic */ void getAddressOrNull$annotations(PlaceOrBuilder placeOrBuilder) {
    }

    public static final ec getDbIdOrNull(PlaceOrBuilder placeOrBuilder) {
        x.f(placeOrBuilder, "<this>");
        if (placeOrBuilder.hasDbId()) {
            return placeOrBuilder.getDbId();
        }
        return null;
    }

    public static /* synthetic */ void getDbIdOrNull$annotations(PlaceOrBuilder placeOrBuilder) {
    }

    public static final Position.IntPosition getPositionOrNull(PlaceOrBuilder placeOrBuilder) {
        x.f(placeOrBuilder, "<this>");
        if (placeOrBuilder.hasPosition()) {
            return placeOrBuilder.getPosition();
        }
        return null;
    }

    public static /* synthetic */ void getPositionOrNull$annotations(PlaceOrBuilder placeOrBuilder) {
    }

    public static final o isResidentialOrNull(PlaceOrBuilder placeOrBuilder) {
        x.f(placeOrBuilder, "<this>");
        if (placeOrBuilder.hasIsResidential()) {
            return placeOrBuilder.getIsResidential();
        }
        return null;
    }

    public static /* synthetic */ void isResidentialOrNull$annotations(PlaceOrBuilder placeOrBuilder) {
    }
}
