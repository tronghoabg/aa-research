package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class Tile extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new TileCreator();
    public final byte[] data;
    public final int height;
    public final int width;

    public Tile(int i, int i2, byte[] bArr) {
        this.width = i;
        this.height = i2;
        this.data = bArr;
    }

    public boolean equalsNoTile() {
        Tile tile = TileProvider.NO_TILE;
        return this.width == tile.width && this.height == tile.height && this.data == tile.data;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 2, this.width);
        spu.r(parcel, 3, this.height);
        spu.v(parcel, 4, this.data);
        spu.m(parcel, iL);
    }
}
