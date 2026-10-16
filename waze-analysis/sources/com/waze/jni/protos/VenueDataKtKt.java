package com.waze.jni.protos;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.VenueDataKt;
import com.waze.jni.protos.places.Address;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VenueDataKtKt {
    /* renamed from: -initializevenueData, reason: not valid java name */
    public static final VenueData m25706initializevenueData(l<? super VenueDataKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        VenueDataKt.Dsl.Companion companion = VenueDataKt.Dsl.Companion;
        VenueData.Builder builderNewBuilder = VenueData.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        VenueDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final VenueData copy(VenueData venueData, l<? super VenueDataKt.Dsl, ab> lVar) {
        x.f(venueData, "<this>");
        x.f(lVar, "block");
        VenueDataKt.Dsl.Companion companion = VenueDataKt.Dsl.Companion;
        VenueData.Builder builder = venueData.toBuilder();
        x.e(builder, "toBuilder(...)");
        VenueDataKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Address getAddressOrNull(VenueDataOrBuilder venueDataOrBuilder) {
        x.f(venueDataOrBuilder, "<this>");
        if (venueDataOrBuilder.hasAddress()) {
            return venueDataOrBuilder.getAddress();
        }
        return null;
    }

    public static /* synthetic */ void getAddressOrNull$annotations(VenueDataOrBuilder venueDataOrBuilder) {
    }

    public static final EVChargingVenue getEvChargingVenueOrNull(VenueDataOrBuilder venueDataOrBuilder) {
        x.f(venueDataOrBuilder, "<this>");
        if (venueDataOrBuilder.hasEvChargingVenue()) {
            return venueDataOrBuilder.getEvChargingVenue();
        }
        return null;
    }

    public static /* synthetic */ void getEvChargingVenueOrNull$annotations(VenueDataOrBuilder venueDataOrBuilder) {
    }

    public static final Position.IntPosition getPositionOrNull(VenueDataOrBuilder venueDataOrBuilder) {
        x.f(venueDataOrBuilder, "<this>");
        if (venueDataOrBuilder.hasPosition()) {
            return venueDataOrBuilder.getPosition();
        }
        return null;
    }

    public static /* synthetic */ void getPositionOrNull$annotations(VenueDataOrBuilder venueDataOrBuilder) {
    }

    public static final Reporter getReporterOrNull(VenueDataOrBuilder venueDataOrBuilder) {
        x.f(venueDataOrBuilder, "<this>");
        if (venueDataOrBuilder.hasReporter()) {
            return venueDataOrBuilder.getReporter();
        }
        return null;
    }

    public static /* synthetic */ void getReporterOrNull$annotations(VenueDataOrBuilder venueDataOrBuilder) {
    }

    public static final Reporter getUpdaterOrNull(VenueDataOrBuilder venueDataOrBuilder) {
        x.f(venueDataOrBuilder, "<this>");
        if (venueDataOrBuilder.hasUpdater()) {
            return venueDataOrBuilder.getUpdater();
        }
        return null;
    }

    public static /* synthetic */ void getUpdaterOrNull$annotations(VenueDataOrBuilder venueDataOrBuilder) {
    }
}
