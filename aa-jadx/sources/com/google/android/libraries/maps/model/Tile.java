package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public final class Tile extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.Tile> CREATOR = new com.google.android.libraries.maps.model.TileCreator();
    public final byte[] data;
    public final int height;
    public final int width;

    public Tile(int i, int i2, byte[] bArr) {
        this.width = i;
        this.height = i2;
        this.data = bArr;
    }

    public boolean equalsNoTile() {
        com.google.android.libraries.maps.model.Tile tile = com.google.android.libraries.maps.model.TileProvider.NO_TILE;
        return this.width == tile.width && this.height == tile.height && this.data == tile.data;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 2, this.width);
        defpackage.sqs.v(parcel, 3, this.height);
        defpackage.sqs.z(parcel, 4, this.data);
        defpackage.sqs.q(parcel, iP);
    }
}
