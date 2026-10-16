package com.waze.jni.protos;

import com.waze.jni.protos.EVChargingVenue;
import com.waze.jni.protos.EVChargingVenueKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EVChargingVenueKtKt {
    /* renamed from: -initializeeVChargingVenue, reason: not valid java name */
    public static final EVChargingVenue m25079initializeeVChargingVenue(l<? super EVChargingVenueKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        EVChargingVenueKt.Dsl.Companion companion = EVChargingVenueKt.Dsl.Companion;
        EVChargingVenue.Builder builderNewBuilder = EVChargingVenue.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        EVChargingVenueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EVChargingVenue.EVConnector copy(EVChargingVenue.EVConnector eVConnector, l<? super EVChargingVenueKt.EVConnectorKt.Dsl, ab> lVar) {
        x.f(eVConnector, "<this>");
        x.f(lVar, "block");
        EVChargingVenueKt.EVConnectorKt.Dsl.Companion companion = EVChargingVenueKt.EVConnectorKt.Dsl.Companion;
        EVChargingVenue.EVConnector.Builder builder = eVConnector.toBuilder();
        x.e(builder, "toBuilder(...)");
        EVChargingVenueKt.EVConnectorKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EVChargingVenue.EVConnector getEvConnectorOrNull(EVChargingVenue.EVConnectorOverviewOrBuilder eVConnectorOverviewOrBuilder) {
        x.f(eVConnectorOverviewOrBuilder, "<this>");
        if (eVConnectorOverviewOrBuilder.hasEvConnector()) {
            return eVConnectorOverviewOrBuilder.getEvConnector();
        }
        return null;
    }

    public static /* synthetic */ void getEvConnectorOrNull$annotations(EVChargingVenue.EVConnectorOverviewOrBuilder eVConnectorOverviewOrBuilder) {
    }

    public static final EVChargingVenue.EVConnectorOverview copy(EVChargingVenue.EVConnectorOverview eVConnectorOverview, l<? super EVChargingVenueKt.EVConnectorOverviewKt.Dsl, ab> lVar) {
        x.f(eVConnectorOverview, "<this>");
        x.f(lVar, "block");
        EVChargingVenueKt.EVConnectorOverviewKt.Dsl.Companion companion = EVChargingVenueKt.EVConnectorOverviewKt.Dsl.Companion;
        EVChargingVenue.EVConnectorOverview.Builder builder = eVConnectorOverview.toBuilder();
        x.e(builder, "toBuilder(...)");
        EVChargingVenueKt.EVConnectorOverviewKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EVChargingVenue copy(EVChargingVenue eVChargingVenue, l<? super EVChargingVenueKt.Dsl, ab> lVar) {
        x.f(eVChargingVenue, "<this>");
        x.f(lVar, "block");
        EVChargingVenueKt.Dsl.Companion companion = EVChargingVenueKt.Dsl.Companion;
        EVChargingVenue.Builder builder = eVChargingVenue.toBuilder();
        x.e(builder, "toBuilder(...)");
        EVChargingVenueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
