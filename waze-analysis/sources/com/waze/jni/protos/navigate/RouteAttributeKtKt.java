package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.RouteAttribute;
import com.waze.jni.protos.navigate.RouteAttributeKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RouteAttributeKtKt {
    /* renamed from: -initializerouteAttribute, reason: not valid java name */
    public static final RouteAttribute m27569initializerouteAttribute(l<? super RouteAttributeKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RouteAttributeKt.Dsl.Companion companion = RouteAttributeKt.Dsl.Companion;
        RouteAttribute.Builder builderNewBuilder = RouteAttribute.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RouteAttributeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.Beacons copy(RouteAttribute.Beacons beacons, l<? super RouteAttributeKt.BeaconsKt.Dsl, ab> lVar) {
        x.f(beacons, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.BeaconsKt.Dsl.Companion companion = RouteAttributeKt.BeaconsKt.Dsl.Companion;
        RouteAttribute.Beacons.Builder builder = beacons.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.BeaconsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.Beacons getBeaconsOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasBeacons()) {
            return routeAttributeOrBuilder.getBeacons();
        }
        return null;
    }

    public static /* synthetic */ void getBeaconsOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.Blocked getBlockedOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasBlocked()) {
            return routeAttributeOrBuilder.getBlocked();
        }
        return null;
    }

    public static /* synthetic */ void getBlockedOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.BorderCrossing getBorderCrossingOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasBorderCrossing()) {
            return routeAttributeOrBuilder.getBorderCrossing();
        }
        return null;
    }

    public static /* synthetic */ void getBorderCrossingOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.BypassesRestricted getBypassesRestrictedOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasBypassesRestricted()) {
            return routeAttributeOrBuilder.getBypassesRestricted();
        }
        return null;
    }

    public static /* synthetic */ void getBypassesRestrictedOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.DangerZone getDangerZoneOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasDangerZone()) {
            return routeAttributeOrBuilder.getDangerZone();
        }
        return null;
    }

    public static /* synthetic */ void getDangerZoneOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.DangerousTurn getDangerousTurnOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasDangerousTurn()) {
            return routeAttributeOrBuilder.getDangerousTurn();
        }
        return null;
    }

    public static /* synthetic */ void getDangerousTurnOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.ETAFromML getEtaFromMLOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasEtaFromML()) {
            return routeAttributeOrBuilder.getEtaFromML();
        }
        return null;
    }

    public static /* synthetic */ void getEtaFromMLOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.Ferry getFerryOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasFerry()) {
            return routeAttributeOrBuilder.getFerry();
        }
        return null;
    }

    public static /* synthetic */ void getFerryOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final Hov getHovOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasHov()) {
            return routeAttributeOrBuilder.getHov();
        }
        return null;
    }

    public static /* synthetic */ void getHovOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.LicensePlateRestriction getLicensePlateRestrictionOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasLicensePlateRestriction()) {
            return routeAttributeOrBuilder.getLicensePlateRestriction();
        }
        return null;
    }

    public static /* synthetic */ void getLicensePlateRestrictionOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.PassNeeded getPassNeededOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasPassNeeded()) {
            return routeAttributeOrBuilder.getPassNeeded();
        }
        return null;
    }

    public static /* synthetic */ void getPassNeededOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.PrimaryForAvoiders getPrimaryForAvoidersOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasPrimaryForAvoiders()) {
            return routeAttributeOrBuilder.getPrimaryForAvoiders();
        }
        return null;
    }

    public static /* synthetic */ void getPrimaryForAvoidersOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.PublicTransportation getPublicTransportationOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasPublicTransportation()) {
            return routeAttributeOrBuilder.getPublicTransportation();
        }
        return null;
    }

    public static /* synthetic */ void getPublicTransportationOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.RestrictedArea getRestrictedAreaOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasRestrictedArea()) {
            return routeAttributeOrBuilder.getRestrictedArea();
        }
        return null;
    }

    public static /* synthetic */ void getRestrictedAreaOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.SchoolArea getSchoolAreaOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasSchoolArea()) {
            return routeAttributeOrBuilder.getSchoolArea();
        }
        return null;
    }

    public static /* synthetic */ void getSchoolAreaOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.SteppedOnIT getSteppedOnITOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasSteppedOnIT()) {
            return routeAttributeOrBuilder.getSteppedOnIT();
        }
        return null;
    }

    public static /* synthetic */ void getSteppedOnITOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.TollForAvoiders getTollForAvoidersOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasTollForAvoiders()) {
            return routeAttributeOrBuilder.getTollForAvoiders();
        }
        return null;
    }

    public static /* synthetic */ void getTollForAvoidersOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final Toll getTollOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasToll()) {
            return routeAttributeOrBuilder.getToll();
        }
        return null;
    }

    public static /* synthetic */ void getTollOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.Unnatural getUnnaturalOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasUnnatural()) {
            return routeAttributeOrBuilder.getUnnatural();
        }
        return null;
    }

    public static /* synthetic */ void getUnnaturalOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.Unpaved getUnpavedOrNull(RouteAttributeOrBuilder routeAttributeOrBuilder) {
        x.f(routeAttributeOrBuilder, "<this>");
        if (routeAttributeOrBuilder.hasUnpaved()) {
            return routeAttributeOrBuilder.getUnpaved();
        }
        return null;
    }

    public static /* synthetic */ void getUnpavedOrNull$annotations(RouteAttributeOrBuilder routeAttributeOrBuilder) {
    }

    public static final RouteAttribute.Blocked copy(RouteAttribute.Blocked blocked, l<? super RouteAttributeKt.BlockedKt.Dsl, ab> lVar) {
        x.f(blocked, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.BlockedKt.Dsl.Companion companion = RouteAttributeKt.BlockedKt.Dsl.Companion;
        RouteAttribute.Blocked.Builder builder = blocked.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.BlockedKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.BorderCrossing copy(RouteAttribute.BorderCrossing borderCrossing, l<? super RouteAttributeKt.BorderCrossingKt.Dsl, ab> lVar) {
        x.f(borderCrossing, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.BorderCrossingKt.Dsl.Companion companion = RouteAttributeKt.BorderCrossingKt.Dsl.Companion;
        RouteAttribute.BorderCrossing.Builder builder = borderCrossing.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.BorderCrossingKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.BypassesRestricted copy(RouteAttribute.BypassesRestricted bypassesRestricted, l<? super RouteAttributeKt.BypassesRestrictedKt.Dsl, ab> lVar) {
        x.f(bypassesRestricted, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.BypassesRestrictedKt.Dsl.Companion companion = RouteAttributeKt.BypassesRestrictedKt.Dsl.Companion;
        RouteAttribute.BypassesRestricted.Builder builder = bypassesRestricted.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.BypassesRestrictedKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.DangerZone copy(RouteAttribute.DangerZone dangerZone, l<? super RouteAttributeKt.DangerZoneKt.Dsl, ab> lVar) {
        x.f(dangerZone, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.DangerZoneKt.Dsl.Companion companion = RouteAttributeKt.DangerZoneKt.Dsl.Companion;
        RouteAttribute.DangerZone.Builder builder = dangerZone.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.DangerZoneKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.DangerousTurn copy(RouteAttribute.DangerousTurn dangerousTurn, l<? super RouteAttributeKt.DangerousTurnKt.Dsl, ab> lVar) {
        x.f(dangerousTurn, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.DangerousTurnKt.Dsl.Companion companion = RouteAttributeKt.DangerousTurnKt.Dsl.Companion;
        RouteAttribute.DangerousTurn.Builder builder = dangerousTurn.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.DangerousTurnKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.ETAFromML copy(RouteAttribute.ETAFromML eTAFromML, l<? super RouteAttributeKt.ETAFromMLKt.Dsl, ab> lVar) {
        x.f(eTAFromML, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.ETAFromMLKt.Dsl.Companion companion = RouteAttributeKt.ETAFromMLKt.Dsl.Companion;
        RouteAttribute.ETAFromML.Builder builder = eTAFromML.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.ETAFromMLKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.Ferry copy(RouteAttribute.Ferry ferry, l<? super RouteAttributeKt.FerryKt.Dsl, ab> lVar) {
        x.f(ferry, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.FerryKt.Dsl.Companion companion = RouteAttributeKt.FerryKt.Dsl.Companion;
        RouteAttribute.Ferry.Builder builder = ferry.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.FerryKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.LicensePlateRestriction copy(RouteAttribute.LicensePlateRestriction licensePlateRestriction, l<? super RouteAttributeKt.LicensePlateRestrictionKt.Dsl, ab> lVar) {
        x.f(licensePlateRestriction, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.LicensePlateRestrictionKt.Dsl.Companion companion = RouteAttributeKt.LicensePlateRestrictionKt.Dsl.Companion;
        RouteAttribute.LicensePlateRestriction.Builder builder = licensePlateRestriction.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.LicensePlateRestrictionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.PassNeeded copy(RouteAttribute.PassNeeded passNeeded, l<? super RouteAttributeKt.PassNeededKt.Dsl, ab> lVar) {
        x.f(passNeeded, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.PassNeededKt.Dsl.Companion companion = RouteAttributeKt.PassNeededKt.Dsl.Companion;
        RouteAttribute.PassNeeded.Builder builder = passNeeded.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.PassNeededKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.PrimaryForAvoiders copy(RouteAttribute.PrimaryForAvoiders primaryForAvoiders, l<? super RouteAttributeKt.PrimaryForAvoidersKt.Dsl, ab> lVar) {
        x.f(primaryForAvoiders, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.PrimaryForAvoidersKt.Dsl.Companion companion = RouteAttributeKt.PrimaryForAvoidersKt.Dsl.Companion;
        RouteAttribute.PrimaryForAvoiders.Builder builder = primaryForAvoiders.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.PrimaryForAvoidersKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.PublicTransportation copy(RouteAttribute.PublicTransportation publicTransportation, l<? super RouteAttributeKt.PublicTransportationKt.Dsl, ab> lVar) {
        x.f(publicTransportation, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.PublicTransportationKt.Dsl.Companion companion = RouteAttributeKt.PublicTransportationKt.Dsl.Companion;
        RouteAttribute.PublicTransportation.Builder builder = publicTransportation.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.PublicTransportationKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.RestrictedArea copy(RouteAttribute.RestrictedArea restrictedArea, l<? super RouteAttributeKt.RestrictedAreaKt.Dsl, ab> lVar) {
        x.f(restrictedArea, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.RestrictedAreaKt.Dsl.Companion companion = RouteAttributeKt.RestrictedAreaKt.Dsl.Companion;
        RouteAttribute.RestrictedArea.Builder builder = restrictedArea.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.RestrictedAreaKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.SchoolArea copy(RouteAttribute.SchoolArea schoolArea, l<? super RouteAttributeKt.SchoolAreaKt.Dsl, ab> lVar) {
        x.f(schoolArea, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.SchoolAreaKt.Dsl.Companion companion = RouteAttributeKt.SchoolAreaKt.Dsl.Companion;
        RouteAttribute.SchoolArea.Builder builder = schoolArea.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.SchoolAreaKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.SteppedOnIT copy(RouteAttribute.SteppedOnIT steppedOnIT, l<? super RouteAttributeKt.SteppedOnITKt.Dsl, ab> lVar) {
        x.f(steppedOnIT, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.SteppedOnITKt.Dsl.Companion companion = RouteAttributeKt.SteppedOnITKt.Dsl.Companion;
        RouteAttribute.SteppedOnIT.Builder builder = steppedOnIT.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.SteppedOnITKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.TollForAvoiders copy(RouteAttribute.TollForAvoiders tollForAvoiders, l<? super RouteAttributeKt.TollForAvoidersKt.Dsl, ab> lVar) {
        x.f(tollForAvoiders, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.TollForAvoidersKt.Dsl.Companion companion = RouteAttributeKt.TollForAvoidersKt.Dsl.Companion;
        RouteAttribute.TollForAvoiders.Builder builder = tollForAvoiders.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.TollForAvoidersKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.Unnatural copy(RouteAttribute.Unnatural unnatural, l<? super RouteAttributeKt.UnnaturalKt.Dsl, ab> lVar) {
        x.f(unnatural, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.UnnaturalKt.Dsl.Companion companion = RouteAttributeKt.UnnaturalKt.Dsl.Companion;
        RouteAttribute.Unnatural.Builder builder = unnatural.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.UnnaturalKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute.Unpaved copy(RouteAttribute.Unpaved unpaved, l<? super RouteAttributeKt.UnpavedKt.Dsl, ab> lVar) {
        x.f(unpaved, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.UnpavedKt.Dsl.Companion companion = RouteAttributeKt.UnpavedKt.Dsl.Companion;
        RouteAttribute.Unpaved.Builder builder = unpaved.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.UnpavedKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteAttribute copy(RouteAttribute routeAttribute, l<? super RouteAttributeKt.Dsl, ab> lVar) {
        x.f(routeAttribute, "<this>");
        x.f(lVar, "block");
        RouteAttributeKt.Dsl.Companion companion = RouteAttributeKt.Dsl.Companion;
        RouteAttribute.Builder builder = routeAttribute.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteAttributeKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
