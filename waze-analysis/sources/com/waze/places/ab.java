package com.waze.places;

import androidx.autofill.HintConstants;
import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.places.GenericPlace;
import com.waze.jni.protos.places.GenericPlaces;
import com.waze.jni.protos.places.Place;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public abstract class ab {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void eraseAddressItem$default(ab abVar, String str, int i2, String str2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: eraseAddressItem");
        }
        if ((i3 & 8) != 0) {
            lVar = null;
        }
        abVar.eraseAddressItem(str, i2, str2, lVar);
    }

    static final h.ab eraseAddressItem$lambda$0(ab abVar, String str, int i2, String str2) {
        h.g.b.x.d(abVar, "null cannot be cast to non-null type com.waze.places.PlacesNativeManager");
        ((PlacesNativeManager) abVar).eraseAddressItemNTV(str, i2, str2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchFavorites$default(ab abVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchFavorites");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        abVar.fetchFavorites(lVar);
    }

    static final byte[] fetchFavorites$lambda$0(ab abVar) {
        h.g.b.x.d(abVar, "null cannot be cast to non-null type com.waze.places.PlacesNativeManager");
        return ((PlacesNativeManager) abVar).fetchFavoritesNTV();
    }

    static final void fetchFavorites$lambda$1(h.g.a.l lVar, byte[] bArr) {
        GenericPlaces genericPlaces = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                genericPlaces = (GenericPlaces) GenericPlaces.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(genericPlaces);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchFutureEvents$default(ab abVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchFutureEvents");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        abVar.fetchFutureEvents(lVar);
    }

    static final byte[] fetchFutureEvents$lambda$0(ab abVar) {
        h.g.b.x.d(abVar, "null cannot be cast to non-null type com.waze.places.PlacesNativeManager");
        return ((PlacesNativeManager) abVar).fetchFutureEventsNTV();
    }

    static final void fetchFutureEvents$lambda$1(h.g.a.l lVar, byte[] bArr) {
        GenericPlaces genericPlaces = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                genericPlaces = (GenericPlaces) GenericPlaces.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(genericPlaces);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchRecents$default(ab abVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchRecents");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        abVar.fetchRecents(lVar);
    }

    static final byte[] fetchRecents$lambda$0(ab abVar) {
        h.g.b.x.d(abVar, "null cannot be cast to non-null type com.waze.places.PlacesNativeManager");
        return ((PlacesNativeManager) abVar).fetchRecentsNTV();
    }

    static final void fetchRecents$lambda$1(h.g.a.l lVar, byte[] bArr) {
        GenericPlaces genericPlaces = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                genericPlaces = (GenericPlaces) GenericPlaces.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(genericPlaces);
            }
        }
    }

    public static /* synthetic */ void fetchReverseGeocodeWazeAddress$default(ab abVar, int i2, int i3, boolean z, int i4, h.g.a.l lVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchReverseGeocodeWazeAddress");
        }
        if ((i5 & 16) != 0) {
            lVar = null;
        }
        abVar.fetchReverseGeocodeWazeAddress(i2, i3, z, i4, lVar);
    }

    static final h.ab fetchReverseGeocodeWazeAddress$lambda$0(ab abVar, int i2, int i3, boolean z, int i4) {
        h.g.b.x.d(abVar, "null cannot be cast to non-null type com.waze.places.PlacesNativeManager");
        ((PlacesNativeManager) abVar).fetchReverseGeocodeWazeAddressNTV(i2, i3, z, i4);
        return null;
    }

    static final void onEventRemovedJNI$lambda$0(ab abVar, EventRemovedCompletion eventRemovedCompletion, boolean z) {
        h.g.b.x.d(abVar, "null cannot be cast to non-null type com.waze.places.PlacesNativeManager");
        ((PlacesNativeManager) abVar).onEventRemoved(eventRemovedCompletion, z);
    }

    static final void onPlacesUpdatedJNI$lambda$0(ab abVar) {
        h.g.b.x.d(abVar, "null cannot be cast to non-null type com.waze.places.PlacesNativeManager");
        ((PlacesNativeManager) abVar).onPlacesUpdated();
    }

    static final void onReverseGeocodeWazeAddressFetchedJNI$lambda$0(ab abVar, Place place, int i2) {
        h.g.b.x.d(abVar, "null cannot be cast to non-null type com.waze.places.PlacesNativeManager");
        h.g.b.x.c(place);
        ((PlacesNativeManager) abVar).onReverseGeocodeWazeAddressFetched(place, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void registerPlacesUpdateHook$default(ab abVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerPlacesUpdateHook");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        abVar.registerPlacesUpdateHook(lVar);
    }

    static final h.ab registerPlacesUpdateHook$lambda$0(ab abVar) {
        h.g.b.x.d(abVar, "null cannot be cast to non-null type com.waze.places.PlacesNativeManager");
        ((PlacesNativeManager) abVar).registerPlacesUpdateHookNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void removeEvent$default(ab abVar, String str, EventRemovedCompletion eventRemovedCompletion, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeEvent");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        abVar.removeEvent(str, eventRemovedCompletion, lVar);
    }

    static final h.ab removeEvent$lambda$0(ab abVar, String str, EventRemovedCompletion eventRemovedCompletion) {
        h.g.b.x.d(abVar, "null cannot be cast to non-null type com.waze.places.PlacesNativeManager");
        ((PlacesNativeManager) abVar).removeEventNTV(str, eventRemovedCompletion);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void removeFavorite$default(ab abVar, long j2, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeFavorite");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        abVar.removeFavorite(j2, lVar);
    }

    static final Boolean removeFavorite$lambda$0(ab abVar, long j2) {
        h.g.b.x.d(abVar, "null cannot be cast to non-null type com.waze.places.PlacesNativeManager");
        return Boolean.valueOf(((PlacesNativeManager) abVar).removeFavoriteNTV(j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void removeRecentPlace$default(ab abVar, long j2, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeRecentPlace");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        abVar.removeRecentPlace(j2, lVar);
    }

    static final Boolean removeRecentPlace$lambda$0(ab abVar, long j2) {
        h.g.b.x.d(abVar, "null cannot be cast to non-null type com.waze.places.PlacesNativeManager");
        return Boolean.valueOf(((PlacesNativeManager) abVar).removeRecentPlaceNTV(j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void storeFavoritePlace$default(ab abVar, GenericPlace genericPlace, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: storeFavoritePlace");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        abVar.storeFavoritePlace(genericPlace, lVar);
    }

    static final byte[] storeFavoritePlace$lambda$0(ab abVar, GenericPlace genericPlace) {
        h.g.b.x.d(abVar, "null cannot be cast to non-null type com.waze.places.PlacesNativeManager");
        return ((PlacesNativeManager) abVar).storeFavoritePlaceNTV(genericPlace != null ? genericPlace.toByteArray() : null);
    }

    static final void storeFavoritePlace$lambda$1(h.g.a.l lVar, byte[] bArr) {
        GenericPlace genericPlace = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                genericPlace = (GenericPlace) GenericPlace.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(genericPlace);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void storeFavoritePlaceInRecents$default(ab abVar, GenericPlace genericPlace, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: storeFavoritePlaceInRecents");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        abVar.storeFavoritePlaceInRecents(genericPlace, lVar);
    }

    static final byte[] storeFavoritePlaceInRecents$lambda$0(ab abVar, GenericPlace genericPlace) {
        h.g.b.x.d(abVar, "null cannot be cast to non-null type com.waze.places.PlacesNativeManager");
        return ((PlacesNativeManager) abVar).storeFavoritePlaceInRecentsNTV(genericPlace != null ? genericPlace.toByteArray() : null);
    }

    static final void storeFavoritePlaceInRecents$lambda$1(h.g.a.l lVar, byte[] bArr) {
        GenericPlace genericPlace = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                genericPlace = (GenericPlace) GenericPlace.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(genericPlace);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void storeRecentPlaceInRecents$default(ab abVar, GenericPlace genericPlace, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: storeRecentPlaceInRecents");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        abVar.storeRecentPlaceInRecents(genericPlace, lVar);
    }

    static final byte[] storeRecentPlaceInRecents$lambda$0(ab abVar, GenericPlace genericPlace) {
        h.g.b.x.d(abVar, "null cannot be cast to non-null type com.waze.places.PlacesNativeManager");
        return ((PlacesNativeManager) abVar).storeRecentPlaceInRecentsNTV(genericPlace != null ? genericPlace.toByteArray() : null);
    }

    static final void storeRecentPlaceInRecents$lambda$1(h.g.a.l lVar, byte[] bArr) {
        GenericPlace genericPlace = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                genericPlace = (GenericPlace) GenericPlace.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(genericPlace);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateFavoriteName$default(ab abVar, long j2, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateFavoriteName");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        abVar.updateFavoriteName(j2, str, lVar);
    }

    static final Boolean updateFavoriteName$lambda$0(ab abVar, long j2, String str) {
        h.g.b.x.d(abVar, "null cannot be cast to non-null type com.waze.places.PlacesNativeManager");
        return Boolean.valueOf(((PlacesNativeManager) abVar).updateFavoriteNameNTV(j2, str));
    }

    public void eraseAddressItem(final String str, final int i2, final String str2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.places.u
            @Override // com.waze.hw
            public final Object a() {
                ab.eraseAddressItem$lambda$0(this.f33143a, str, i2, str2);
                return null;
            }
        }, lVar != null ? new s(lVar, 5) : null);
    }

    public void fetchFavorites(h.g.a.l<? super GenericPlaces, h.ab> lVar) {
        NativeManager.runNativeTask(new aa(this, 1), new s(lVar, 3));
    }

    public void fetchFutureEvents(h.g.a.l<? super GenericPlaces, h.ab> lVar) {
        NativeManager.runNativeTask(new aa(this, 0), new s(lVar, 11));
    }

    public void fetchRecents(h.g.a.l<? super GenericPlaces, h.ab> lVar) {
        NativeManager.runNativeTask(new aa(this, 3), new s(lVar, 13));
    }

    public void fetchReverseGeocodeWazeAddress(final int i2, final int i3, final boolean z, final int i4, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.places.z
            @Override // com.waze.hw
            public final Object a() {
                ab.fetchReverseGeocodeWazeAddress$lambda$0(this.f33157a, i2, i3, z, i4);
                return null;
            }
        }, lVar != null ? new s(lVar, 10) : null);
    }

    public abstract void onEventRemoved(EventRemovedCompletion eventRemovedCompletion, boolean z);

    protected final void onEventRemovedJNI(final EventRemovedCompletion eventRemovedCompletion, final boolean z) {
        h.g.b.x.f(eventRemovedCompletion, "completion");
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.places.v
            @Override // java.lang.Runnable
            public final void run() {
                ab.onEventRemovedJNI$lambda$0(this.f33147a, eventRemovedCompletion, z);
            }
        });
    }

    public abstract void onPlacesUpdated();

    protected final void onPlacesUpdatedJNI() {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.places.x
            @Override // java.lang.Runnable
            public final void run() {
                ab.onPlacesUpdatedJNI$lambda$0(this.f33153a);
            }
        });
    }

    public abstract void onReverseGeocodeWazeAddressFetched(Place place, int i2);

    protected final void onReverseGeocodeWazeAddressFetchedJNI(byte[] bArr, final int i2) {
        h.g.b.x.f(bArr, "placeProto");
        try {
            final Place place = (Place) Place.parser().c(bArr);
            NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.places.y
                @Override // java.lang.Runnable
                public final void run() {
                    ab.onReverseGeocodeWazeAddressFetchedJNI$lambda$0(this.f33154a, place, i2);
                }
            });
        } catch (eu unused) {
        }
    }

    public void registerPlacesUpdateHook(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new aa(this, 2), lVar != null ? new s(lVar, 12) : null);
    }

    public void removeEvent(final String str, final EventRemovedCompletion eventRemovedCompletion, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(eventRemovedCompletion, "completion");
        NativeManager.runNativeTask(new hw() { // from class: com.waze.places.t
            @Override // com.waze.hw
            public final Object a() {
                ab.removeEvent$lambda$0(this.f33140a, str, eventRemovedCompletion);
                return null;
            }
        }, lVar != null ? new s(lVar, 4) : null);
    }

    public void removeFavorite(long j2, h.g.a.l<? super Boolean, h.ab> lVar) {
        NativeManager.runNativeTask(new w(this, j2, 1), lVar != null ? new s(lVar, 2) : null);
    }

    public void removeRecentPlace(long j2, h.g.a.l<? super Boolean, h.ab> lVar) {
        NativeManager.runNativeTask(new w(this, j2, 0), lVar != null ? new s(lVar, 8) : null);
    }

    public void storeFavoritePlace(GenericPlace genericPlace, h.g.a.l<? super GenericPlace, h.ab> lVar) {
        NativeManager.runNativeTask(new q(this, genericPlace, 2), new s(lVar, 7));
    }

    public void storeFavoritePlaceInRecents(GenericPlace genericPlace, h.g.a.l<? super GenericPlace, h.ab> lVar) {
        NativeManager.runNativeTask(new q(this, genericPlace, 3), new s(lVar, 9));
    }

    public void storeRecentPlaceInRecents(GenericPlace genericPlace, h.g.a.l<? super GenericPlace, h.ab> lVar) {
        NativeManager.runNativeTask(new q(this, genericPlace, 0), new s(lVar, 6));
    }

    public void updateFavoriteName(final long j2, final String str, h.g.a.l<? super Boolean, h.ab> lVar) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        NativeManager.runNativeTask(new hw() { // from class: com.waze.places.r
            @Override // com.waze.hw
            public final Object a() {
                return ab.updateFavoriteName$lambda$0(this.f33135a, j2, str);
            }
        }, lVar != null ? new s(lVar, 0) : null);
    }

    public final void fetchFavorites() {
        fetchFavorites$default(this, null, 1, null);
    }

    public final void storeFavoritePlace(GenericPlace genericPlace) {
        storeFavoritePlace$default(this, genericPlace, null, 2, null);
    }

    public final void storeRecentPlaceInRecents(GenericPlace genericPlace) {
        storeRecentPlaceInRecents$default(this, genericPlace, null, 2, null);
    }

    public final void fetchFutureEvents() {
        fetchFutureEvents$default(this, null, 1, null);
    }

    public final void fetchRecents() {
        fetchRecents$default(this, null, 1, null);
    }

    public final void storeFavoritePlaceInRecents(GenericPlace genericPlace) {
        storeFavoritePlaceInRecents$default(this, genericPlace, null, 2, null);
    }

    public final void eraseAddressItem(String str, int i2, String str2) {
        eraseAddressItem$default(this, str, i2, str2, null, 8, null);
    }

    public final void removeFavorite(long j2) {
        removeFavorite$default(this, j2, null, 2, null);
    }

    public final void registerPlacesUpdateHook() {
        registerPlacesUpdateHook$default(this, null, 1, null);
    }

    public final void removeRecentPlace(long j2) {
        removeRecentPlace$default(this, j2, null, 2, null);
    }

    public final void removeEvent(String str, EventRemovedCompletion eventRemovedCompletion) {
        h.g.b.x.f(eventRemovedCompletion, "completion");
        removeEvent$default(this, str, eventRemovedCompletion, null, 4, null);
    }

    public final void updateFavoriteName(long j2, String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        updateFavoriteName$default(this, j2, str, null, 4, null);
    }

    public final void fetchReverseGeocodeWazeAddress(int i2, int i3, boolean z, int i4) {
        fetchReverseGeocodeWazeAddress$default(this, i2, i3, z, i4, null, 16, null);
    }
}
