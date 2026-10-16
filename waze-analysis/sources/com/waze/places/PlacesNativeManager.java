package com.waze.places;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.places.Place;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.am;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PlacesNativeManager extends ab {
    public static final PlacesNativeManager INSTANCE = new PlacesNativeManager();
    private static final com.waze.native_managers.c<com.waze.av.a.p> fetchReverseGeocodeAddressCallbackHelper = new com.waze.native_managers.c<>();
    private static final bm<h.ab> placesUpdatedEventFlow = bu.c(0, 1, kotlinx.coroutines.a.a.f51272b);
    public static final int $stable = 8;

    private PlacesNativeManager() {
    }

    static final h.ab fetchReverseGeocodeWazeAddressAsync$lambda$0(CompletableDeferred completableDeferred, com.waze.av.a.p pVar) {
        completableDeferred.a(pVar);
        return h.ab.f48028a;
    }

    public final native void eraseAddressItemNTV(String str, int i2, String str2);

    public final native byte[] fetchFavoritesNTV();

    public final native byte[] fetchFutureEventsNTV();

    public final native byte[] fetchRecentsNTV();

    public final am<com.waze.av.a.p> fetchReverseGeocodeWazeAddressAsync(Position.IntPosition intPosition, boolean z) {
        h.g.b.x.f(intPosition, "position");
        final CompletableDeferred completableDeferredJ = bo.j();
        ab.fetchReverseGeocodeWazeAddress$default(this, intPosition.getLongitude(), intPosition.getLatitude(), z, fetchReverseGeocodeAddressCallbackHelper.a(new h.g.a.l() { // from class: com.waze.places.p
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return PlacesNativeManager.fetchReverseGeocodeWazeAddressAsync$lambda$0(completableDeferredJ, (com.waze.av.a.p) obj);
            }
        }), null, 16, null);
        return completableDeferredJ;
    }

    public final native void fetchReverseGeocodeWazeAddressNTV(int i2, int i3, boolean z, int i4);

    public final bm<h.ab> getPlacesUpdatedEventFlow() {
        return placesUpdatedEventFlow;
    }

    public final native void initNativeLayerNTV();

    @Override // com.waze.places.ab
    public void onEventRemoved(EventRemovedCompletion eventRemovedCompletion, boolean z) {
        h.g.b.x.f(eventRemovedCompletion, "completion");
        eventRemovedCompletion.complete(z);
    }

    @Override // com.waze.places.ab
    public void onPlacesUpdated() {
        placesUpdatedEventFlow.c(h.ab.f48028a);
    }

    @Override // com.waze.places.ab
    public void onReverseGeocodeWazeAddressFetched(Place place, int i2) {
        h.g.b.x.f(place, "placeProto");
        if (true != place.hasPosition()) {
            place = null;
        }
        com.waze.av.a.p pVarH = place != null ? com.waze.ab.a.l.h(place) : null;
        h.g.a.l lVarB = fetchReverseGeocodeAddressCallbackHelper.b(i2);
        if (lVarB != null) {
            lVarB.invoke(pVarH);
        }
    }

    public final native void registerPlacesUpdateHookNTV();

    public final native void removeEventNTV(String str, EventRemovedCompletion eventRemovedCompletion);

    public final native boolean removeFavoriteNTV(long j2);

    public final native boolean removeRecentPlaceNTV(long j2);

    public final native byte[] storeFavoritePlaceInRecentsNTV(byte[] bArr);

    public final native byte[] storeFavoritePlaceNTV(byte[] bArr);

    public final native byte[] storeRecentPlaceInRecentsNTV(byte[] bArr);

    public final native boolean updateFavoriteNameNTV(long j2, String str);
}
