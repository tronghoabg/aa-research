package com.waze.navigate;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.media3.common.C;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.in;
import com.waze.jni.protos.navigate.DriveTo;
import com.waze.jni.protos.navigate.NearbyStationsResultProto;
import com.waze.lm;
import com.waze.main.navigate.EventOnRoute;
import com.waze.main.navigate.LocationData;
import com.waze.navigate.social.EndDriveData;
import com.waze.reports.NearbyGasStationsActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class DriveToNativeManager extends bt implements com.waze.bf, cl, com.waze.fd {
    public static final String EXTRA_DANGER_ZONE_TYPE = "dangerZoneType";
    public static final String EXTRA_LAT = "lat";
    public static final String EXTRA_LON = "lon";
    private static final int PROGRESS_DIALOG_DELAY_MS = 3000;
    List<bc> currentStreetUpdateListeners = new ArrayList();
    private com.waze.ifs.a.f handlers = new com.waze.ifs.a.f();
    public static final int UH_SEARCH_ADD_RESULT = com.waze.utils.o.e(com.waze.utils.f.HANDLER);
    public static final int UH_DANGER_ZONE_FOUND = com.waze.utils.o.e(com.waze.utils.f.HANDLER);

    /* compiled from: WazeSource */
    public class AddressItemAppData {
        public boolean bNearingMinimized;
    }

    private void doNavigate(final AddressItem addressItem, bu buVar, final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        navigateAnalytics(addressItem);
        if (buVar != null) {
            buVar.a();
        }
        NativeManager.Post(new Runnable() { // from class: com.waze.navigate.bb
            @Override // java.lang.Runnable
            public final void run() {
                this.f31073a.lambda$doNavigate$0(addressItem, z, z2, z3, z4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: driveEventNTV, reason: merged with bridge method [inline-methods] */
    public native void lambda$drive$0(String str, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native AddressItem[] getAutoCompleteNTV();

    private native void initNativeLayerNTV();

    private native int isInDangerZoneNTV(int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doNavigate$0(AddressItem addressItem, boolean z, boolean z2, boolean z3, boolean z4) {
        com.waze.shared_infra.i.h.a("navigate event running in thread " + Thread.currentThread().getId());
        com.waze.shared_infra.i.h.a("ai=".concat(String.valueOf(String.valueOf(addressItem))));
        String id = addressItem.getId();
        if (addressItem.getType() != 9) {
            id = addressItem.getId();
        }
        String str = id;
        String routingContext = addressItem.getRoutingContext();
        String title = addressItem.getTitle();
        if (addressItem.getCategory().intValue() == 7) {
            title = addressItem.getSecondaryTitle();
        }
        if (title == null || title.isEmpty()) {
            title = addressItem.getAddress();
        }
        navigateNTV(addressItem.getLongitudeInt(), addressItem.getLatitudeInt(), title, addressItem.getVenueId(), addressItem.getVenueName(), str, addressItem.getCountry(), addressItem.getState(), addressItem.getCity(), addressItem.getStreet(), addressItem.getHouseNumber(), routingContext, z, z2, z3, z4);
    }

    static /* synthetic */ void lambda$getDangerZoneType$0(boolean z, com.waze.jni.a aVar, Integer num) {
        if (num.intValue() == -2 && !z) {
            num = -1;
        }
        aVar.a(DriveTo.DangerZoneType.forNumber(num.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$getDangerZoneType$1(int i2, int i3) {
        return Integer.valueOf(isInDangerZoneNTV(i2, i3));
    }

    static /* synthetic */ h.ab lambda$navigateAnalytics$0(AddressItem addressItem, AddressItem[] addressItemArr) {
        if (addressItemArr != null) {
            for (AddressItem addressItem2 : addressItemArr) {
                if (addressItem2.getId().equals(addressItem.getId())) {
                    com.waze.navigate.location_preview.ba.e().f(com.waze.navigate.b.f.f31066f);
                    return h.ab.f48028a;
                }
            }
        }
        com.waze.navigate.location_preview.ba.e().f(com.waze.navigate.b.f.f31061a);
        return h.ab.f48028a;
    }

    private void navigateAnalytics(AddressItem addressItem) {
        int iIntValue = addressItem.getCategory().intValue();
        if (iIntValue == 1) {
            getTopTenFavorites(new g(addressItem, 4));
        } else if (iIntValue == 2) {
            com.waze.navigate.location_preview.ba.e().f(com.waze.navigate.b.f.f31062b);
        } else {
            if (iIntValue != 3) {
                return;
            }
            com.waze.navigate.location_preview.ba.e().f(com.waze.navigate.b.f.f31065e);
        }
    }

    private native void navigateNTV(int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, boolean z3, boolean z4);

    public void addCurrentStreetUpdateListener(bc bcVar) {
        this.currentStreetUpdateListeners.add(bcVar);
    }

    protected native void addDangerZoneStatNTV(int i2, int i3, int i4, int i5);

    protected native String[] configGetVehicleTypesNTV();

    protected native void convertFavoriteToRecentNTV(String str);

    public void drive(String str, boolean z) {
        NativeManager.runNativeTask(new com.google.firebase.messaging.w(this, str, z, 3));
    }

    protected native void editFavoritesDoneNTV();

    protected native void eraseAllAddressItemsNTV();

    protected native String getActiveRouteAlternativeUuidNTV();

    protected native AddressItem getAddressFromMeetingIdNTV(String str);

    protected native AddressItemAppData getAddressItemAppDataNTV(String str);

    protected native EventOnRoute[] getAlertsOnRouteNTV();

    public void getAutoCompleteData(com.waze.jni.a<AddressItem[]> aVar) {
        NativeManager.runNativeTask(new com.waze.ba(this, 20), aVar);
    }

    protected native int getCurrentAlternativeRouteIdNTV();

    protected native AddressItem getCurrentNavigatingAddressItemNTV();

    protected native byte[] getDangerZoneEodNTV();

    @Override // com.waze.bf
    public void getDangerZoneType(int i2, int i3, final com.waze.jni.a<DriveTo.DangerZoneType> aVar, final boolean z) {
        NativeManager.runNativeTask(new in(this, i2, i3, 1), new com.waze.jni.a() { // from class: com.waze.navigate.az
            @Override // com.waze.jni.a
            public final void a(Object obj) {
                DriveToNativeManager.lambda$getDangerZoneType$0(z, aVar, (Integer) obj);
            }
        });
    }

    protected native String getDestinationIdNTV();

    protected native EventOnRoute[] getEventsOnRouteNTV();

    protected native AddressItem[] getFavoritesNTV(boolean z);

    protected native EndDriveData getFriendsDrivingDataNTV(String str);

    protected native LocationData getLocationDataNTV(int i2, int i3, int i4, String str);

    protected native AddressItem[] getPlannedDriveEventsNTV();

    protected native String[] getPriceFormatsNTV(String str);

    protected native Product getProductByVenueNTV(byte[] bArr, String str);

    protected native Product getProductNTV(int i2);

    protected native byte[] getRoutingHeadingDataNTV();

    protected native int getRoutingIdNTV(boolean z);

    protected native byte[] getRoutingLocationInfoNTV();

    protected native byte[] getRoutingRequestParamsNTV(byte[] bArr);

    protected native AddressItem[] getTopTenFavoritesNTV();

    protected native void initMeetingNTV(String str);

    protected native boolean isMeetingIdSetNTV(String str);

    protected native boolean isNavigatingToWaypointNTV();

    protected native void moveFavoriteAddressItemNTV(int i2, int i3);

    public void navigate(AddressItem addressItem, bu buVar, boolean z, boolean z2, boolean z3, boolean z4) {
        doNavigate(addressItem, buVar, z, z2, z3, z4);
    }

    void nearbyGasStationsFound(NearbyStationsResultProto nearbyStationsResultProto) {
        int i2 = 0;
        if (nearbyStationsResultProto.getStationsCount() == 0) {
            NativeManager.getInstance().closeAndOpenProgressPopup(com.waze.shared_infra.o.b.a().c(R.string.COULD_NOT_FIND_NEARBY_GAS_STATIONS, new Object[0]), R.drawable.popup_x_icon);
            lm.d().c().aG(new ay(i2), C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            return;
        }
        NearbyStation[] nearbyStationArr = new NearbyStation[nearbyStationsResultProto.getStationsCount()];
        while (i2 < nearbyStationsResultProto.getStationsCount()) {
            nearbyStationArr[i2] = new NearbyStation(nearbyStationsResultProto.getStations(i2).getResult(), nearbyStationsResultProto.getStations(i2).getValue(), nearbyStationsResultProto.getStations(i2).getIcon(), nearbyStationsResultProto.getStations(i2).getAddress(), nearbyStationsResultProto.getStations(i2).getIndex());
            i2++;
        }
        com.waze.sharedui.a.e eVarE = lm.d().e();
        int i3 = NearbyGasStationsActivity.f33550f;
        Intent intent = new Intent(eVarE, (Class<?>) NearbyGasStationsActivity.class);
        intent.putParcelableArrayListExtra("GAS_STATIONS", new ArrayList<>(Arrays.asList(nearbyStationArr)));
        eVarE.startActivityForResult(intent, 4000);
    }

    void openSearchActivity(String str, boolean z) {
        com.waze.search.bn bnVar = (com.waze.search.bn) com.waze.web.r.h(com.waze.search.bn.class);
        h.g.b.x.f(str, "searchTerm");
        bnVar.b(str, z, false, null);
    }

    void openVerifyEvent(AddressItem addressItem) {
        if (addressItem == null) {
            com.waze.shared_infra.i.h.c("DTNM: openVerifyEvent: onChangeLocation: received null AI");
            return;
        }
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE != null) {
            com.waze.t.l(new ba(addressItem, eVarE, 0));
        }
    }

    public void removeCurrentStreetUpdateListener(bc bcVar) {
        this.currentStreetUpdateListeners.remove(bcVar);
    }

    protected native void removeEventByLocationNTV(String str);

    protected native void removeEventNTV(String str, boolean z);

    protected native boolean renameFavoriteNTV(String str, String str2);

    protected native void rerouteNTV(boolean z);

    protected native void resumeNavigationNTV(int i2);

    protected native void searchNearbyStationsNTV();

    void searchResults(String str, AddressItem addressItem) {
        Bundle bundle = new Bundle();
        bundle.putString("provider", str);
        bundle.putParcelable("address_item", addressItem);
        this.handlers.d(UH_SEARCH_ADD_RESULT, bundle);
    }

    void setCurrentStreetName(String str, boolean z) {
        Iterator<bc> it = this.currentStreetUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().bC(str, z);
        }
    }

    protected native void setMeetingNTV(String str);

    protected native void setProductPricesNTV(int i2, float[] fArr, int[] iArr, int i3);

    protected native void setSearchModeNTV();

    protected native void setSkipConfirmWaypointNTV(boolean z);

    protected native void setStopPointNTV(boolean z);

    @Override // com.waze.bf
    public void setUpdateHandler(int i2, Handler handler) {
        this.handlers.b(i2, handler);
    }

    protected native void showOnMapNTV(int i2, int i3);

    protected native void showVenueOnMapNTV(byte[] bArr);

    public void start() {
        initNativeLayerNTV();
    }

    public void storeAddressItem(AddressItem addressItem, boolean z, h.g.a.l<String, h.ab> lVar) {
        AddressItem addressItem2;
        String icon;
        String venueContext = addressItem.getVenueContext() != null ? addressItem.getVenueContext() : "";
        if (addressItem.hasIcon()) {
            icon = addressItem.getIcon();
            addressItem2 = addressItem;
        } else {
            addressItem2 = addressItem;
            String str = addressItem2.mPreviewIcon;
            icon = (str == null || str.isEmpty()) ? null : str;
        }
        storeAddressItem(addressItem2.getId(), addressItem2.getCategory().intValue(), addressItem2.getCity(), addressItem2.getStreet(), addressItem2.getHouseNumber(), addressItem2.getState(), addressItem2.getTitle(), addressItem2.getLongitudeInt(), addressItem2.getLatitudeInt(), addressItem2.getVenueId(), venueContext, addressItem2.getRoutingContext(), icon, z, addressItem2.getAddress(), lVar);
    }

    protected native String storeAddressItemNTV(String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4, String str7, String str8, String str9, String str10, boolean z, String str11);

    protected native void unsetMeetingNTV();

    @Override // com.waze.bf
    public void unsetUpdateHandler(int i2, Handler handler) {
        this.handlers.c(i2, handler);
    }

    protected native void updateAddressItemAppDataNTV(String str, AddressItemAppData addressItemAppData);

    void updateDangerZone(int i2, int i3, DriveTo.DangerZoneType dangerZoneType) {
        com.waze.shared_infra.i.h.a(String.format("DriveToNativeManager.updateDangerZone() called for (%d,%d) with type=%d, sending update", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(dangerZoneType.getNumber())));
        Bundle bundle = new Bundle();
        bundle.putInt(EXTRA_LON, i2);
        bundle.putInt(EXTRA_LAT, i3);
        bundle.putInt(EXTRA_DANGER_ZONE_TYPE, dangerZoneType.getNumber());
        this.handlers.d(UH_DANGER_ZONE_FOUND, bundle);
    }

    protected native void updateEventPlaceNTV(String str, long j2, long j3, String str2);

    protected native void updateEventVenueNTV(String str, byte[] bArr);

    public void getDangerZoneType(int i2, int i3, com.waze.jni.a<DriveTo.DangerZoneType> aVar) {
        getDangerZoneType(i2, i3, aVar, false);
    }
}
