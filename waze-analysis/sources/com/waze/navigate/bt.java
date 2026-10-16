package com.waze.navigate;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.navigate.DangerZoneEod;
import com.waze.jni.protos.navigate.DriveTo;
import com.waze.jni.protos.navigate.NearbyStationsResultProto;
import com.waze.jni.protos.navigate.RoutingHeadingData;
import com.waze.jni.protos.navigate.RoutingRequestParams;
import com.waze.jni.protos.navigate.RoutingRequestParamsResult;
import com.waze.main.navigate.EventOnRoute;
import com.waze.main.navigate.LocationData;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.social.EndDriveData;
import l.a.alx;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class bt {
    public static final int $stable = 0;

    public static /* synthetic */ void addDangerZoneStat$default(bt btVar, int i2, int i3, alx alxVar, DriveTo.DangerZoneStatType dangerZoneStatType, h.g.a.l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addDangerZoneStat");
        }
        if ((i4 & 16) != 0) {
            lVar = null;
        }
        btVar.addDangerZoneStat(i2, i3, alxVar, dangerZoneStatType, lVar);
    }

    static final h.ab addDangerZoneStat$lambda$0(bt btVar, int i2, int i3, alx alxVar, DriveTo.DangerZoneStatType dangerZoneStatType) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).addDangerZoneStatNTV(i2, i3, alxVar.getNumber(), dangerZoneStatType.getNumber());
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void convertFavoriteToRecent$default(bt btVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertFavoriteToRecent");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        btVar.convertFavoriteToRecent(str, lVar);
    }

    static final h.ab convertFavoriteToRecent$lambda$0(bt btVar, String str) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).convertFavoriteToRecentNTV(str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void editFavoritesDone$default(bt btVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: editFavoritesDone");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        btVar.editFavoritesDone(lVar);
    }

    static final h.ab editFavoritesDone$lambda$0(bt btVar) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).editFavoritesDoneNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getActiveRouteAlternativeUuid$default(bt btVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getActiveRouteAlternativeUuid");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        btVar.getActiveRouteAlternativeUuid(lVar);
    }

    static final String getActiveRouteAlternativeUuid$lambda$0(bt btVar) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).getActiveRouteAlternativeUuidNTV();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAddressFromMeetingId$default(bt btVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAddressFromMeetingId");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        btVar.getAddressFromMeetingId(str, lVar);
    }

    static final AddressItem getAddressFromMeetingId$lambda$0(bt btVar, String str) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).getAddressFromMeetingIdNTV(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAddressItemAppData$default(bt btVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAddressItemAppData");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        btVar.getAddressItemAppData(str, lVar);
    }

    static final DriveToNativeManager.AddressItemAppData getAddressItemAppData$lambda$0(bt btVar, String str) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).getAddressItemAppDataNTV(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAlertsOnRoute$default(bt btVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAlertsOnRoute");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        btVar.getAlertsOnRoute(lVar);
    }

    static final EventOnRoute[] getAlertsOnRoute$lambda$0(bt btVar) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).getAlertsOnRouteNTV();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getDangerZoneEod$default(bt btVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDangerZoneEod");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        btVar.getDangerZoneEod(lVar);
    }

    static final byte[] getDangerZoneEod$lambda$0(bt btVar) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).getDangerZoneEodNTV();
    }

    static final void getDangerZoneEod$lambda$1(h.g.a.l lVar, byte[] bArr) {
        DangerZoneEod dangerZoneEod = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                dangerZoneEod = (DangerZoneEod) DangerZoneEod.parser().c(bArr);
            } catch (com.google.v.eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(dangerZoneEod);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getEventsOnRoute$default(bt btVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEventsOnRoute");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        btVar.getEventsOnRoute(lVar);
    }

    static final EventOnRoute[] getEventsOnRoute$lambda$0(bt btVar) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).getEventsOnRouteNTV();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getFavorites$default(bt btVar, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFavorites");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        btVar.getFavorites(z, lVar);
    }

    static final AddressItem[] getFavorites$lambda$0(bt btVar, boolean z) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).getFavoritesNTV(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getFriendsDrivingData$default(bt btVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFriendsDrivingData");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        btVar.getFriendsDrivingData(str, lVar);
    }

    static final EndDriveData getFriendsDrivingData$lambda$0(bt btVar, String str) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).getFriendsDrivingDataNTV(str);
    }

    public static /* synthetic */ void getLocationData$default(bt btVar, int i2, int i3, int i4, String str, h.g.a.l lVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLocationData");
        }
        if ((i5 & 16) != 0) {
            lVar = null;
        }
        btVar.getLocationData(i2, i3, i4, str, lVar);
    }

    static final LocationData getLocationData$lambda$0(bt btVar, int i2, int i3, int i4, String str) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).getLocationDataNTV(i2, i3, i4, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getPriceFormats$default(bt btVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPriceFormats");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        btVar.getPriceFormats(str, lVar);
    }

    static final String[] getPriceFormats$lambda$0(bt btVar, String str) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).getPriceFormatsNTV(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getProduct$default(bt btVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProduct");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        btVar.getProduct(i2, lVar);
    }

    static final Product getProduct$lambda$0(bt btVar, int i2) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).getProductNTV(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getProductByVenue$default(bt btVar, VenueData venueData, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProductByVenue");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        btVar.getProductByVenue(venueData, str, lVar);
    }

    static final Product getProductByVenue$lambda$0(bt btVar, VenueData venueData, String str) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).getProductByVenueNTV(venueData != null ? venueData.toByteArray() : null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getRoutingHeadingData$default(bt btVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRoutingHeadingData");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        btVar.getRoutingHeadingData(lVar);
    }

    static final byte[] getRoutingHeadingData$lambda$0(bt btVar) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).getRoutingHeadingDataNTV();
    }

    static final void getRoutingHeadingData$lambda$1(h.g.a.l lVar, byte[] bArr) {
        RoutingHeadingData routingHeadingData = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                routingHeadingData = (RoutingHeadingData) RoutingHeadingData.parser().c(bArr);
            } catch (com.google.v.eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(routingHeadingData);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getRoutingId$default(bt btVar, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRoutingId");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        btVar.getRoutingId(z, lVar);
    }

    static final Integer getRoutingId$lambda$0(bt btVar, boolean z) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return Integer.valueOf(((DriveToNativeManager) btVar).getRoutingIdNTV(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getRoutingLocationInfo$default(bt btVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRoutingLocationInfo");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        btVar.getRoutingLocationInfo(lVar);
    }

    static final byte[] getRoutingLocationInfo$lambda$0(bt btVar) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).getRoutingLocationInfoNTV();
    }

    static final void getRoutingLocationInfo$lambda$1(h.g.a.l lVar, byte[] bArr) {
        i.c.a.a.l lVar2 = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                lVar2 = (i.c.a.a.l) i.c.a.a.l.parser().c(bArr);
            } catch (com.google.v.eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(lVar2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getRoutingRequestParams$default(bt btVar, RoutingRequestParams routingRequestParams, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRoutingRequestParams");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        btVar.getRoutingRequestParams(routingRequestParams, lVar);
    }

    static final byte[] getRoutingRequestParams$lambda$0(bt btVar, RoutingRequestParams routingRequestParams) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).getRoutingRequestParamsNTV(routingRequestParams != null ? routingRequestParams.toByteArray() : null);
    }

    static final void getRoutingRequestParams$lambda$1(h.g.a.l lVar, byte[] bArr) {
        RoutingRequestParamsResult routingRequestParamsResult = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                routingRequestParamsResult = (RoutingRequestParamsResult) RoutingRequestParamsResult.parser().c(bArr);
            } catch (com.google.v.eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(routingRequestParamsResult);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getTopTenFavorites$default(bt btVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTopTenFavorites");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        btVar.getTopTenFavorites(lVar);
    }

    static final AddressItem[] getTopTenFavorites$lambda$0(bt btVar) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).getTopTenFavoritesNTV();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initMeeting$default(bt btVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initMeeting");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        btVar.initMeeting(str, lVar);
    }

    static final h.ab initMeeting$lambda$0(bt btVar, String str) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).initMeetingNTV(str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void isNavigatingToWaypoint$default(bt btVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isNavigatingToWaypoint");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        btVar.isNavigatingToWaypoint(lVar);
    }

    static final Boolean isNavigatingToWaypoint$lambda$0(bt btVar) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return Boolean.valueOf(((DriveToNativeManager) btVar).isNavigatingToWaypointNTV());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void moveFavoriteAddressItem$default(bt btVar, int i2, int i3, h.g.a.l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moveFavoriteAddressItem");
        }
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        btVar.moveFavoriteAddressItem(i2, i3, lVar);
    }

    static final h.ab moveFavoriteAddressItem$lambda$0(bt btVar, int i2, int i3) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).moveFavoriteAddressItemNTV(i2, i3);
        return null;
    }

    static final void nearbyGasStationsFoundJNI$lambda$0(bt btVar, NearbyStationsResultProto nearbyStationsResultProto) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).nearbyGasStationsFound(nearbyStationsResultProto);
    }

    static final void openSearchActivityJNI$lambda$0(bt btVar, String str, boolean z) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).openSearchActivity(str, z);
    }

    static final void openVerifyEventJNI$lambda$0(bt btVar, AddressItem addressItem) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).openVerifyEvent(addressItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void removeEvent$default(bt btVar, String str, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeEvent");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        btVar.removeEvent(str, z, lVar);
    }

    static final h.ab removeEvent$lambda$0(bt btVar, String str, boolean z) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).removeEventNTV(str, z);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void removeEventByLocation$default(bt btVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeEventByLocation");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        btVar.removeEventByLocation(str, lVar);
    }

    static final h.ab removeEventByLocation$lambda$0(bt btVar, String str) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).removeEventByLocationNTV(str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void renameFavorite$default(bt btVar, String str, String str2, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renameFavorite");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        btVar.renameFavorite(str, str2, lVar);
    }

    static final Boolean renameFavorite$lambda$0(bt btVar, String str, String str2) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return Boolean.valueOf(((DriveToNativeManager) btVar).renameFavoriteNTV(str, str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reroute$default(bt btVar, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reroute");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        btVar.reroute(z, lVar);
    }

    static final h.ab reroute$lambda$0(bt btVar, boolean z) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).rerouteNTV(z);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void resumeNavigation$default(bt btVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeNavigation");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        btVar.resumeNavigation(i2, lVar);
    }

    static final h.ab resumeNavigation$lambda$0(bt btVar, int i2) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).resumeNavigationNTV(i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void searchNearbyStations$default(bt btVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchNearbyStations");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        btVar.searchNearbyStations(lVar);
    }

    static final h.ab searchNearbyStations$lambda$0(bt btVar) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).searchNearbyStationsNTV();
        return null;
    }

    static final void searchResultsJNI$lambda$0(bt btVar, String str, AddressItem addressItem) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).searchResults(str, addressItem);
    }

    static final void setCurrentStreetNameJNI$lambda$0(bt btVar, String str, boolean z) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).setCurrentStreetName(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setMeeting$default(bt btVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMeeting");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        btVar.setMeeting(str, lVar);
    }

    static final h.ab setMeeting$lambda$0(bt btVar, String str) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).setMeetingNTV(str);
        return null;
    }

    public static /* synthetic */ void setProductPrices$default(bt btVar, int i2, float[] fArr, int[] iArr, int i3, h.g.a.l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setProductPrices");
        }
        if ((i4 & 16) != 0) {
            lVar = null;
        }
        btVar.setProductPrices(i2, fArr, iArr, i3, lVar);
    }

    static final h.ab setProductPrices$lambda$0(bt btVar, int i2, float[] fArr, int[] iArr, int i3) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).setProductPricesNTV(i2, fArr, iArr, i3);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setSearchMode$default(bt btVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSearchMode");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        btVar.setSearchMode(lVar);
    }

    static final h.ab setSearchMode$lambda$0(bt btVar) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).setSearchModeNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setSkipConfirmWaypoint$default(bt btVar, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSkipConfirmWaypoint");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        btVar.setSkipConfirmWaypoint(z, lVar);
    }

    static final h.ab setSkipConfirmWaypoint$lambda$0(bt btVar, boolean z) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).setSkipConfirmWaypointNTV(z);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setStopPoint$default(bt btVar, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStopPoint");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        btVar.setStopPoint(z, lVar);
    }

    static final h.ab setStopPoint$lambda$0(bt btVar, boolean z) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).setStopPointNTV(z);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showOnMap$default(bt btVar, int i2, int i3, h.g.a.l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showOnMap");
        }
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        btVar.showOnMap(i2, i3, lVar);
    }

    static final h.ab showOnMap$lambda$0(bt btVar, int i2, int i3) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).showOnMapNTV(i2, i3);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showVenueOnMap$default(bt btVar, VenueData venueData, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showVenueOnMap");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        btVar.showVenueOnMap(venueData, lVar);
    }

    static final h.ab showVenueOnMap$lambda$0(bt btVar, VenueData venueData) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).showVenueOnMapNTV(venueData != null ? venueData.toByteArray() : null);
        return null;
    }

    public static /* synthetic */ void storeAddressItem$default(bt btVar, String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4, String str7, String str8, String str9, String str10, boolean z, String str11, h.g.a.l lVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: storeAddressItem");
        }
        btVar.storeAddressItem(str, i2, str2, str3, str4, str5, str6, i3, i4, str7, str8, str9, str10, z, str11, (i5 & 32768) != 0 ? null : lVar);
    }

    static final String storeAddressItem$lambda$0(bt btVar, String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4, String str7, String str8, String str9, String str10, boolean z, String str11) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        return ((DriveToNativeManager) btVar).storeAddressItemNTV(str, i2, str2, str3, str4, str5, str6, i3, i4, str7, str8, str9, str10, z, str11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void unsetMeeting$default(bt btVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unsetMeeting");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        btVar.unsetMeeting(lVar);
    }

    static final h.ab unsetMeeting$lambda$0(bt btVar) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).unsetMeetingNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAddressItemAppData$default(bt btVar, String str, DriveToNativeManager.AddressItemAppData addressItemAppData, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAddressItemAppData");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        btVar.updateAddressItemAppData(str, addressItemAppData, lVar);
    }

    static final h.ab updateAddressItemAppData$lambda$0(bt btVar, String str, DriveToNativeManager.AddressItemAppData addressItemAppData) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).updateAddressItemAppDataNTV(str, addressItemAppData);
        return null;
    }

    static final void updateDangerZoneJNI$lambda$0(bt btVar, int i2, int i3, DriveTo.DangerZoneType dangerZoneType) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).updateDangerZone(i2, i3, dangerZoneType);
    }

    public static /* synthetic */ void updateEventPlace$default(bt btVar, String str, long j2, long j3, String str2, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateEventPlace");
        }
        btVar.updateEventPlace(str, j2, j3, str2, (i2 & 16) != 0 ? null : lVar);
    }

    static final h.ab updateEventPlace$lambda$0(bt btVar, String str, long j2, long j3, String str2) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).updateEventPlaceNTV(str, j2, j3, str2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateEventVenue$default(bt btVar, String str, VenueData venueData, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateEventVenue");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        btVar.updateEventVenue(str, venueData, lVar);
    }

    static final h.ab updateEventVenue$lambda$0(bt btVar, String str, VenueData venueData) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.navigate.DriveToNativeManager");
        ((DriveToNativeManager) btVar).updateEventVenueNTV(str, venueData != null ? venueData.toByteArray() : null);
        return null;
    }

    public void addDangerZoneStat(int i2, int i3, alx alxVar, DriveTo.DangerZoneStatType dangerZoneStatType, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(alxVar, "action");
        h.g.b.x.f(dangerZoneStatType, "statType");
        NativeManager.runNativeTask(new bm(this, i2, i3, alxVar, dangerZoneStatType, 1), lVar != null ? new be(lVar, 5) : null);
    }

    public String[] configGetVehicleTypes() {
        String[] strArrConfigGetVehicleTypesNTV = ((DriveToNativeManager) this).configGetVehicleTypesNTV();
        h.g.b.x.e(strArrConfigGetVehicleTypesNTV, "configGetVehicleTypesNTV(...)");
        return strArrConfigGetVehicleTypesNTV;
    }

    public void convertFavoriteToRecent(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        int i2 = 1;
        NativeManager.runNativeTask(new bd(this, str, i2), lVar != null ? new be(lVar, i2) : null);
    }

    public void editFavoritesDone(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bj(this, 8), lVar != null ? new bn(lVar, 5) : null);
    }

    public void eraseAllAddressItems() {
        ((DriveToNativeManager) this).eraseAllAddressItemsNTV();
    }

    public void getActiveRouteAlternativeUuid(h.g.a.l<? super String, h.ab> lVar) {
        NativeManager.runNativeTask(new bj(this, 9), lVar != null ? new bn(lVar, 12) : null);
    }

    public void getAddressFromMeetingId(String str, h.g.a.l<? super AddressItem, h.ab> lVar) {
        NativeManager.runNativeTask(new bd(this, str, 4), lVar != null ? new be(lVar, 12) : null);
    }

    public void getAddressItemAppData(String str, h.g.a.l<? super DriveToNativeManager.AddressItemAppData, h.ab> lVar) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        int i2 = 0;
        NativeManager.runNativeTask(new bd(this, str, i2), lVar != null ? new be(lVar, i2) : null);
    }

    public void getAlertsOnRoute(h.g.a.l<? super EventOnRoute[], h.ab> lVar) {
        NativeManager.runNativeTask(new bj(this, 10), lVar != null ? new bn(lVar, 17) : null);
    }

    public int getCurrentAlternativeRouteId() {
        return ((DriveToNativeManager) this).getCurrentAlternativeRouteIdNTV();
    }

    public AddressItem getCurrentNavigatingAddressItem() {
        return ((DriveToNativeManager) this).getCurrentNavigatingAddressItemNTV();
    }

    public void getDangerZoneEod(h.g.a.l<? super DangerZoneEod, h.ab> lVar) {
        NativeManager.runNativeTask(new bj(this, 4), new be(lVar, 18));
    }

    public String getDestinationId() {
        return ((DriveToNativeManager) this).getDestinationIdNTV();
    }

    public void getEventsOnRoute(h.g.a.l<? super EventOnRoute[], h.ab> lVar) {
        NativeManager.runNativeTask(new bj(this, 7), lVar != null ? new bn(lVar, 2) : null);
    }

    public void getFavorites(boolean z, h.g.a.l<? super AddressItem[], h.ab> lVar) {
        NativeManager.runNativeTask(new bk(this, z, 3), lVar != null ? new bn(lVar, 11) : null);
    }

    public void getFriendsDrivingData(String str, h.g.a.l<? super EndDriveData, h.ab> lVar) {
        NativeManager.runNativeTask(new bd(this, str, 5), lVar != null ? new be(lVar, 15) : null);
    }

    public void getLocationData(final int i2, final int i3, final int i4, final String str, h.g.a.l<? super LocationData, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.navigate.bq
            @Override // com.waze.hw
            public final Object a() {
                return bt.getLocationData$lambda$0(this.f31133a, i2, i3, i4, str);
            }
        }, lVar != null ? new bn(lVar, 10) : null);
    }

    public AddressItem[] getPlannedDriveEvents() {
        return ((DriveToNativeManager) this).getPlannedDriveEventsNTV();
    }

    public void getPriceFormats(String str, h.g.a.l<? super String[], h.ab> lVar) {
        NativeManager.runNativeTask(new bd(this, str, 7), lVar != null ? new bn(lVar, 4) : null);
    }

    public void getProduct(int i2, h.g.a.l<? super Product, h.ab> lVar) {
        NativeManager.runNativeTask(new bs(this, i2, 1), lVar != null ? new bn(lVar, 14) : null);
    }

    public void getProductByVenue(VenueData venueData, String str, h.g.a.l<? super Product, h.ab> lVar) {
        NativeManager.runNativeTask(new bh(this, venueData, str, 1), lVar != null ? new be(lVar, 8) : null);
    }

    public void getRoutingHeadingData(h.g.a.l<? super RoutingHeadingData, h.ab> lVar) {
        NativeManager.runNativeTask(new bj(this, 0), new be(lVar, 11));
    }

    public void getRoutingId(boolean z, h.g.a.l<? super Integer, h.ab> lVar) {
        NativeManager.runNativeTask(new bk(this, z, 1), lVar != null ? new be(lVar, 9) : null);
    }

    public void getRoutingLocationInfo(h.g.a.l<? super i.c.a.a.l, h.ab> lVar) {
        NativeManager.runNativeTask(new bj(this, 1), new be(lVar, 7));
    }

    public void getRoutingRequestParams(RoutingRequestParams routingRequestParams, h.g.a.l<? super RoutingRequestParamsResult, h.ab> lVar) {
        NativeManager.runNativeTask(new bd(this, routingRequestParams, 3), new be(lVar, 6));
    }

    public void getTopTenFavorites(h.g.a.l<? super AddressItem[], h.ab> lVar) {
        NativeManager.runNativeTask(new bj(this, 5), lVar != null ? new be(lVar, 20) : null);
    }

    public void initMeeting(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bd(this, str, 6), lVar != null ? new be(lVar, 17) : null);
    }

    public boolean isMeetingIdSet(String str) {
        return ((DriveToNativeManager) this).isMeetingIdSetNTV(str);
    }

    public void isNavigatingToWaypoint(h.g.a.l<? super Boolean, h.ab> lVar) {
        NativeManager.runNativeTask(new bj(this, 6), lVar != null ? new bn(lVar, 1) : null);
    }

    public void moveFavoriteAddressItem(int i2, int i3, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bp(this, i2, i3, 1), lVar != null ? new bn(lVar, 3) : null);
    }

    protected final void nearbyGasStationsFoundJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "stationsResult");
        try {
            NativeManager.runMainThreadTask(new ba(this, (NearbyStationsResultProto) NearbyStationsResultProto.parser().c(bArr), 3, null));
        } catch (com.google.v.eu unused) {
        }
    }

    protected final void openSearchActivityJNI(String str, boolean z) {
        NativeManager.runMainThreadTask(new br(this, str, z, 1));
    }

    protected final void openVerifyEventJNI(AddressItem addressItem) {
        NativeManager.runMainThreadTask(new ba(this, addressItem, 2, null));
    }

    public void removeEvent(final String str, final boolean z, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.navigate.bo
            @Override // com.waze.hw
            public final Object a() {
                bt.removeEvent$lambda$0(this.f31126a, str, z);
                return null;
            }
        }, lVar != null ? new bn(lVar, 8) : null);
    }

    public void removeEventByLocation(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bd(this, str, 9), lVar != null ? new bn(lVar, 15) : null);
    }

    public void renameFavorite(String str, String str2, h.g.a.l<? super Boolean, h.ab> lVar) {
        NativeManager.runNativeTask(new bh(this, str, str2, 0), lVar != null ? new be(lVar, 10) : null);
    }

    public void reroute(boolean z, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bk(this, z, 4), lVar != null ? new bn(lVar, 16) : null);
    }

    public void resumeNavigation(int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bs(this, i2, 0), lVar != null ? new bn(lVar, 19) : null);
    }

    public void searchNearbyStations(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bj(this, 2), lVar != null ? new be(lVar, 14) : null);
    }

    protected final void searchResultsJNI(String str, AddressItem addressItem) {
        h.g.b.x.f(addressItem, "ai");
        NativeManager.runMainThreadTask(new bl(this, str, addressItem, 0));
    }

    protected final void setCurrentStreetNameJNI(String str, boolean z) {
        NativeManager.runMainThreadTask(new br(this, str, z, 0));
    }

    public void setMeeting(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        int i2 = 2;
        NativeManager.runNativeTask(new bd(this, str, i2), lVar != null ? new be(lVar, i2) : null);
    }

    public void setProductPrices(int i2, float[] fArr, int[] iArr, int i3, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bm(this, i2, fArr, iArr, i3, 0), lVar != null ? new be(lVar, 19) : null);
    }

    public void setSearchMode(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bj(this, 3), lVar != null ? new be(lVar, 16) : null);
    }

    public void setSkipConfirmWaypoint(boolean z, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bk(this, z, 0), lVar != null ? new be(lVar, 13) : null);
    }

    public void setStopPoint(boolean z, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bk(this, z, 2), lVar != null ? new bn(lVar, 0) : null);
    }

    public void showOnMap(int i2, int i3, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bp(this, i2, i3, 0), lVar != null ? new bn(lVar, 9) : null);
    }

    public void showVenueOnMap(VenueData venueData, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bd(this, venueData, 8), lVar != null ? new bn(lVar, 6) : null);
    }

    public void storeAddressItem(final String str, final int i2, final String str2, final String str3, final String str4, final String str5, final String str6, final int i3, final int i4, final String str7, final String str8, final String str9, final String str10, final boolean z, final String str11, h.g.a.l<? super String, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.navigate.bf
            @Override // com.waze.hw
            public final Object a() {
                return bt.storeAddressItem$lambda$0(this.f31084a, str, i2, str2, str3, str4, str5, str6, i3, i4, str7, str8, str9, str10, z, str11);
            }
        }, lVar != null ? new be(lVar, 3) : null);
    }

    public void unsetMeeting(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bj(this, 11), lVar != null ? new bn(lVar, 18) : null);
    }

    public void updateAddressItemAppData(String str, DriveToNativeManager.AddressItemAppData addressItemAppData, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        NativeManager.runNativeTask(new bh(this, str, addressItemAppData, 2), lVar != null ? new bn(lVar, 7) : null);
    }

    protected final void updateDangerZoneJNI(final int i2, final int i3, int i4) {
        final DriveTo.DangerZoneType dangerZoneTypeForNumber = DriveTo.DangerZoneType.forNumber(i4);
        if (dangerZoneTypeForNumber == null) {
            dangerZoneTypeForNumber = DriveTo.DangerZoneType.UNRECOGNIZED;
        }
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.navigate.bi
            @Override // java.lang.Runnable
            public final void run() {
                bt.updateDangerZoneJNI$lambda$0(this.f31105a, i2, i3, dangerZoneTypeForNumber);
            }
        });
    }

    public void updateEventPlace(final String str, final long j2, final long j3, final String str2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.navigate.bg
            @Override // com.waze.hw
            public final Object a() {
                bt.updateEventPlace$lambda$0(this.f31096a, str, j2, j3, str2);
                return null;
            }
        }, lVar != null ? new be(lVar, 4) : null);
    }

    public void updateEventVenue(String str, VenueData venueData, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bh(this, str, venueData, 3), lVar != null ? new bn(lVar, 13) : null);
    }

    public final void getRoutingLocationInfo() {
        getRoutingLocationInfo$default(this, null, 1, null);
    }

    public final void getRoutingRequestParams(RoutingRequestParams routingRequestParams) {
        getRoutingRequestParams$default(this, routingRequestParams, null, 2, null);
    }

    public final void getDangerZoneEod() {
        getDangerZoneEod$default(this, null, 1, null);
    }

    public final void getRoutingHeadingData() {
        getRoutingHeadingData$default(this, null, 1, null);
    }

    public final void convertFavoriteToRecent(String str) {
        convertFavoriteToRecent$default(this, str, null, 2, null);
    }

    public final void setMeeting(String str) {
        setMeeting$default(this, str, null, 2, null);
    }

    public final void getEventsOnRoute() {
        getEventsOnRoute$default(this, null, 1, null);
    }

    public final void getPriceFormats(String str) {
        getPriceFormats$default(this, str, null, 2, null);
    }

    public final void isNavigatingToWaypoint() {
        isNavigatingToWaypoint$default(this, null, 1, null);
    }

    public final void moveFavoriteAddressItem(int i2, int i3) {
        moveFavoriteAddressItem$default(this, i2, i3, null, 4, null);
    }

    public final void removeEvent(String str, boolean z) {
        removeEvent$default(this, str, z, null, 4, null);
    }

    public final void setStopPoint(boolean z) {
        setStopPoint$default(this, z, null, 2, null);
    }

    public final void editFavoritesDone() {
        editFavoritesDone$default(this, null, 1, null);
    }

    public final void getAddressFromMeetingId(String str) {
        getAddressFromMeetingId$default(this, str, null, 2, null);
    }

    public final void getFavorites(boolean z) {
        getFavorites$default(this, z, null, 2, null);
    }

    public final void getFriendsDrivingData(String str) {
        getFriendsDrivingData$default(this, str, null, 2, null);
    }

    public final void getProduct(int i2) {
        getProduct$default(this, i2, null, 2, null);
    }

    public final void getProductByVenue(VenueData venueData, String str) {
        getProductByVenue$default(this, venueData, str, null, 4, null);
    }

    public final void getRoutingId(boolean z) {
        getRoutingId$default(this, z, null, 2, null);
    }

    public final void getTopTenFavorites() {
        getTopTenFavorites$default(this, null, 1, null);
    }

    public final void initMeeting(String str) {
        initMeeting$default(this, str, null, 2, null);
    }

    public final void renameFavorite(String str, String str2) {
        renameFavorite$default(this, str, str2, null, 4, null);
    }

    public final void reroute(boolean z) {
        reroute$default(this, z, null, 2, null);
    }

    public final void resumeNavigation(int i2) {
        resumeNavigation$default(this, i2, null, 2, null);
    }

    public final void searchNearbyStations() {
        searchNearbyStations$default(this, null, 1, null);
    }

    public final void setSearchMode() {
        setSearchMode$default(this, null, 1, null);
    }

    public final void setSkipConfirmWaypoint(boolean z) {
        setSkipConfirmWaypoint$default(this, z, null, 2, null);
    }

    public final void showOnMap(int i2, int i3) {
        showOnMap$default(this, i2, i3, null, 4, null);
    }

    public final void showVenueOnMap(VenueData venueData) {
        showVenueOnMap$default(this, venueData, null, 2, null);
    }

    public final void updateEventVenue(String str, VenueData venueData) {
        updateEventVenue$default(this, str, venueData, null, 4, null);
    }

    public final void getActiveRouteAlternativeUuid() {
        getActiveRouteAlternativeUuid$default(this, null, 1, null);
    }

    public final void getAlertsOnRoute() {
        getAlertsOnRoute$default(this, null, 1, null);
    }

    public final void removeEventByLocation(String str) {
        removeEventByLocation$default(this, str, null, 2, null);
    }

    public final void unsetMeeting() {
        unsetMeeting$default(this, null, 1, null);
    }

    public final void getAddressItemAppData(String str) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        getAddressItemAppData$default(this, str, null, 2, null);
    }

    public final void updateEventPlace(String str, long j2, long j3, String str2) {
        updateEventPlace$default(this, str, j2, j3, str2, null, 16, null);
    }

    public final void getLocationData(int i2, int i3, int i4, String str) {
        getLocationData$default(this, i2, i3, i4, str, null, 16, null);
    }

    public final void updateAddressItemAppData(String str, DriveToNativeManager.AddressItemAppData addressItemAppData) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        updateAddressItemAppData$default(this, str, addressItemAppData, null, 4, null);
    }

    public final void setProductPrices(int i2, float[] fArr, int[] iArr, int i3) {
        setProductPrices$default(this, i2, fArr, iArr, i3, null, 16, null);
    }

    public final void addDangerZoneStat(int i2, int i3, alx alxVar, DriveTo.DangerZoneStatType dangerZoneStatType) {
        h.g.b.x.f(alxVar, "action");
        h.g.b.x.f(dangerZoneStatType, "statType");
        addDangerZoneStat$default(this, i2, i3, alxVar, dangerZoneStatType, null, 16, null);
    }

    public final void storeAddressItem(String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4, String str7, String str8, String str9, String str10, boolean z, String str11) {
        storeAddressItem$default(this, str, i2, str2, str3, str4, str5, str6, i3, i4, str7, str8, str9, str10, z, str11, null, 32768, null);
    }
}
