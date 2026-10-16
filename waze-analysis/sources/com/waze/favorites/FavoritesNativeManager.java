package com.waze.favorites;

import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class FavoritesNativeManager extends o {
    public static final int $stable = 0;

    public final native void addFavoriteNTV(byte[] bArr, String str, boolean z);

    public final native byte[] getFavoritesNTV();

    public final native AddressItem getHomeNTV();

    public final native AddressItem getWorkNTV();

    public final native void initNativeLayerNTV();

    public final native byte[] isHomeWorkSetNTV();
}
