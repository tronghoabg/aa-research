package com.waze.favorites;

import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.favorites.Favorites;
import com.waze.jni.protos.favorites.IsHomeWorkSetResult;
import com.waze.jni.protos.places.Place;
import com.waze.navigate.AddressItem;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class o {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addFavorite$default(o oVar, Place place, String str, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFavorite");
        }
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        oVar.addFavorite(place, str, z, lVar);
    }

    static final ab addFavorite$lambda$0(o oVar, Place place, String str, boolean z) {
        x.d(oVar, "null cannot be cast to non-null type com.waze.favorites.FavoritesNativeManager");
        ((FavoritesNativeManager) oVar).addFavoriteNTV(place != null ? place.toByteArray() : null, str, z);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getFavorites$default(o oVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFavorites");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        oVar.getFavorites(lVar);
    }

    static final byte[] getFavorites$lambda$0(o oVar) {
        x.d(oVar, "null cannot be cast to non-null type com.waze.favorites.FavoritesNativeManager");
        return ((FavoritesNativeManager) oVar).getFavoritesNTV();
    }

    static final void getFavorites$lambda$1(h.g.a.l lVar, byte[] bArr) {
        Favorites favorites = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                favorites = (Favorites) Favorites.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(favorites);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getHome$default(o oVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHome");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        oVar.getHome(lVar);
    }

    static final AddressItem getHome$lambda$0(o oVar) {
        x.d(oVar, "null cannot be cast to non-null type com.waze.favorites.FavoritesNativeManager");
        return ((FavoritesNativeManager) oVar).getHomeNTV();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getWork$default(o oVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWork");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        oVar.getWork(lVar);
    }

    static final AddressItem getWork$lambda$0(o oVar) {
        x.d(oVar, "null cannot be cast to non-null type com.waze.favorites.FavoritesNativeManager");
        return ((FavoritesNativeManager) oVar).getWorkNTV();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void isHomeWorkSet$default(o oVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isHomeWorkSet");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        oVar.isHomeWorkSet(lVar);
    }

    static final byte[] isHomeWorkSet$lambda$0(o oVar) {
        x.d(oVar, "null cannot be cast to non-null type com.waze.favorites.FavoritesNativeManager");
        return ((FavoritesNativeManager) oVar).isHomeWorkSetNTV();
    }

    static final void isHomeWorkSet$lambda$1(h.g.a.l lVar, byte[] bArr) {
        IsHomeWorkSetResult isHomeWorkSetResult = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                isHomeWorkSetResult = (IsHomeWorkSetResult) IsHomeWorkSetResult.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(isHomeWorkSetResult);
            }
        }
    }

    public void addFavorite(final Place place, final String str, final boolean z, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.favorites.n
            @Override // com.waze.hw
            public final Object a() {
                o.addFavorite$lambda$0(this.f23812a, place, str, z);
                return null;
            }
        }, lVar != null ? new m(lVar, 3) : null);
    }

    public void getFavorites(h.g.a.l<? super Favorites, ab> lVar) {
        int i2 = 1;
        NativeManager.runNativeTask(new l(this, i2), new m(lVar, i2));
    }

    public void getHome(h.g.a.l<? super AddressItem, ab> lVar) {
        int i2 = 0;
        NativeManager.runNativeTask(new l(this, i2), lVar != null ? new m(lVar, i2) : null);
    }

    public void getWork(h.g.a.l<? super AddressItem, ab> lVar) {
        int i2 = 2;
        NativeManager.runNativeTask(new l(this, i2), lVar != null ? new m(lVar, i2) : null);
    }

    public void isHomeWorkSet(h.g.a.l<? super IsHomeWorkSetResult, ab> lVar) {
        NativeManager.runNativeTask(new l(this, 3), new m(lVar, 4));
    }

    public final void getFavorites() {
        getFavorites$default(this, null, 1, null);
    }

    public final void isHomeWorkSet() {
        isHomeWorkSet$default(this, null, 1, null);
    }

    public final void addFavorite(Place place, String str, boolean z) {
        addFavorite$default(this, place, str, z, null, 8, null);
    }

    public final void getHome() {
        getHome$default(this, null, 1, null);
    }

    public final void getWork() {
        getWork$default(this, null, 1, null);
    }
}
