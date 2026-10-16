package com.waze.jni.protos;

import com.waze.jni.protos.VenueOrPlace;
import com.waze.jni.protos.VenueOrPlaceKt;
import com.waze.jni.protos.favorites.Favorite;
import com.waze.jni.protos.places.Place;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VenueOrPlaceKtKt {
    /* renamed from: -initializevenueOrPlace, reason: not valid java name */
    public static final VenueOrPlace m25733initializevenueOrPlace(l<? super VenueOrPlaceKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        VenueOrPlaceKt.Dsl.Companion companion = VenueOrPlaceKt.Dsl.Companion;
        VenueOrPlace.Builder builderNewBuilder = VenueOrPlace.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        VenueOrPlaceKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final VenueOrPlace copy(VenueOrPlace venueOrPlace, l<? super VenueOrPlaceKt.Dsl, ab> lVar) {
        x.f(venueOrPlace, "<this>");
        x.f(lVar, "block");
        VenueOrPlaceKt.Dsl.Companion companion = VenueOrPlaceKt.Dsl.Companion;
        VenueOrPlace.Builder builder = venueOrPlace.toBuilder();
        x.e(builder, "toBuilder(...)");
        VenueOrPlaceKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Favorite getFavoriteOrNull(VenueOrPlaceOrBuilder venueOrPlaceOrBuilder) {
        x.f(venueOrPlaceOrBuilder, "<this>");
        if (venueOrPlaceOrBuilder.hasFavorite()) {
            return venueOrPlaceOrBuilder.getFavorite();
        }
        return null;
    }

    public static /* synthetic */ void getFavoriteOrNull$annotations(VenueOrPlaceOrBuilder venueOrPlaceOrBuilder) {
    }

    public static final Place getPlaceOrNull(VenueOrPlaceOrBuilder venueOrPlaceOrBuilder) {
        x.f(venueOrPlaceOrBuilder, "<this>");
        if (venueOrPlaceOrBuilder.hasPlace()) {
            return venueOrPlaceOrBuilder.getPlace();
        }
        return null;
    }

    public static /* synthetic */ void getPlaceOrNull$annotations(VenueOrPlaceOrBuilder venueOrPlaceOrBuilder) {
    }

    public static final VenueData getVenueOrNull(VenueOrPlaceOrBuilder venueOrPlaceOrBuilder) {
        x.f(venueOrPlaceOrBuilder, "<this>");
        if (venueOrPlaceOrBuilder.hasVenue()) {
            return venueOrPlaceOrBuilder.getVenue();
        }
        return null;
    }

    public static /* synthetic */ void getVenueOrNull$annotations(VenueOrPlaceOrBuilder venueOrPlaceOrBuilder) {
    }
}
