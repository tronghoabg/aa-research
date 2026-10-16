package com.waze.navigate;

import android.os.Parcel;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class NavResultData {
    public boolean altHasHov;
    public String[] areas;
    public boolean bIsCalculating;
    public boolean bIsOffline;
    public AddressItem destination;
    public String distance;
    public String distanceUnit;
    public int etaSecondsToDestination;
    public int etaSecondsToWaypoint;
    public boolean finalIsParking;
    public String finalTitle;
    public String freeText;
    public String goodMorning;
    public int hovMinPassengers;
    public String hovRequiredPermits;
    public int iRouteLength;
    public int iTimeOut;
    public boolean isInvalidForPrivateVehicle;
    public boolean isViaBorder;
    public boolean isViaFerry;
    public boolean isWaypoint;
    public boolean is_trip_rsp;
    public int nId;
    public String note;
    public int otherRouteDurationSeconds;
    public int otherRouteHovMinPassengers;
    public String otherRouteHovRequiredPermits;
    public int routeId;
    public boolean showRoutes;
    public boolean show_disclaimer;
    public boolean shownAgain;
    public String title;
    public NavigateTollPriceInformation tollInfo;
    public String via;
    public boolean viaDangerZone;
    public String viaToll;
    public int waypointDelay;
    public String waypointDistance;
    public String waypointDistanceUnit;
    public int waypointLength;
    public String waypointTitle;

    public NavResultData copy() {
        NavResultData navResultData = new NavResultData();
        navResultData.etaSecondsToDestination = this.etaSecondsToDestination;
        navResultData.etaSecondsToWaypoint = this.etaSecondsToWaypoint;
        navResultData.note = this.note;
        navResultData.goodMorning = this.goodMorning;
        navResultData.title = this.title;
        navResultData.distance = this.distance;
        navResultData.distanceUnit = this.distanceUnit;
        navResultData.iRouteLength = this.iRouteLength;
        navResultData.via = this.via;
        navResultData.iTimeOut = this.iTimeOut;
        navResultData.show_disclaimer = this.show_disclaimer;
        navResultData.isWaypoint = this.isWaypoint;
        navResultData.waypointDistance = this.waypointDistance;
        navResultData.waypointDistanceUnit = this.waypointDistanceUnit;
        navResultData.waypointLength = this.waypointLength;
        navResultData.waypointTitle = this.waypointTitle;
        navResultData.finalTitle = this.finalTitle;
        navResultData.finalIsParking = this.finalIsParking;
        navResultData.waypointDelay = this.waypointDelay;
        navResultData.is_trip_rsp = this.is_trip_rsp;
        navResultData.nId = this.nId;
        navResultData.shownAgain = this.shownAgain;
        navResultData.viaToll = this.viaToll;
        navResultData.freeText = this.freeText;
        navResultData.bIsOffline = this.bIsOffline;
        navResultData.bIsCalculating = this.bIsCalculating;
        navResultData.viaDangerZone = this.viaDangerZone;
        navResultData.isViaFerry = this.isViaFerry;
        navResultData.isViaBorder = this.isViaBorder;
        navResultData.isInvalidForPrivateVehicle = this.isInvalidForPrivateVehicle;
        navResultData.showRoutes = this.showRoutes;
        navResultData.hovMinPassengers = this.hovMinPassengers;
        navResultData.hovRequiredPermits = this.hovRequiredPermits;
        navResultData.altHasHov = this.altHasHov;
        navResultData.otherRouteDurationSeconds = this.otherRouteDurationSeconds;
        navResultData.otherRouteHovMinPassengers = this.otherRouteHovMinPassengers;
        navResultData.otherRouteHovRequiredPermits = this.otherRouteHovRequiredPermits;
        NavigateTollPriceInformation navigateTollPriceInformation = this.tollInfo;
        navResultData.tollInfo = navigateTollPriceInformation != null ? navigateTollPriceInformation.copy() : null;
        String[] strArr = this.areas;
        navResultData.areas = strArr != null ? (String[]) Arrays.copyOf(strArr, strArr.length) : null;
        if (this.destination != null) {
            Parcel parcelObtain = Parcel.obtain();
            this.destination.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            navResultData.destination = AddressItem.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        } else {
            navResultData.destination = null;
        }
        navResultData.routeId = this.routeId;
        return navResultData;
    }
}
