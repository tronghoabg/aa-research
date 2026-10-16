package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public interface TileProvider {
    public static final com.google.android.libraries.maps.model.Tile NO_TILE = new com.google.android.libraries.maps.model.Tile(-1, -1, null);

    com.google.android.libraries.maps.model.Tile getTile(int i, int i2, int i3);
}
