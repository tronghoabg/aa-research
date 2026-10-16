package com.waze.jni.protos.navigate;

import com.google.v.fj;
import com.waze.jni.protos.navigate.RouteAttribute;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface RouteAttributeOrBuilder extends fj {
    RouteAttribute.AttributeCase getAttributeCase();

    RouteAttribute.Beacons getBeacons();

    RouteAttribute.Blocked getBlocked();

    RouteAttribute.BorderCrossing getBorderCrossing();

    RouteAttribute.BypassesRestricted getBypassesRestricted();

    RouteAttribute.DangerZone getDangerZone();

    RouteAttribute.DangerousTurn getDangerousTurn();

    RouteAttribute.ETAFromML getEtaFromML();

    RouteAttribute.Ferry getFerry();

    Hov getHov();

    RouteAttribute.LicensePlateRestriction getLicensePlateRestriction();

    RouteAttribute.PassNeeded getPassNeeded();

    RouteAttribute.PrimaryForAvoiders getPrimaryForAvoiders();

    RouteAttribute.PublicTransportation getPublicTransportation();

    RouteAttribute.RestrictedArea getRestrictedArea();

    RouteAttribute.SchoolArea getSchoolArea();

    RouteAttribute.SteppedOnIT getSteppedOnIT();

    Toll getToll();

    RouteAttribute.TollForAvoiders getTollForAvoiders();

    RouteAttribute.Unnatural getUnnatural();

    RouteAttribute.Unpaved getUnpaved();

    boolean hasBeacons();

    boolean hasBlocked();

    boolean hasBorderCrossing();

    boolean hasBypassesRestricted();

    boolean hasDangerZone();

    boolean hasDangerousTurn();

    boolean hasEtaFromML();

    boolean hasFerry();

    boolean hasHov();

    boolean hasLicensePlateRestriction();

    boolean hasPassNeeded();

    boolean hasPrimaryForAvoiders();

    boolean hasPublicTransportation();

    boolean hasRestrictedArea();

    boolean hasSchoolArea();

    boolean hasSteppedOnIT();

    boolean hasToll();

    boolean hasTollForAvoiders();

    boolean hasUnnatural();

    boolean hasUnpaved();
}
