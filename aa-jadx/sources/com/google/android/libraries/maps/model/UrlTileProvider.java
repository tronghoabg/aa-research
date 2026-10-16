package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UrlTileProvider implements com.google.android.libraries.maps.model.TileProvider {
    private final int a;
    private final int b;

    public UrlTileProvider(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.google.android.libraries.maps.model.TileProvider
    public final com.google.android.libraries.maps.model.Tile getTile(int i, int i2, int i3) {
        java.net.URL tileUrl = getTileUrl(i, i2, i3);
        if (tileUrl == null) {
            return NO_TILE;
        }
        try {
            java.io.InputStream inputStreamOpenStream = tileUrl.openStream();
            try {
                int i4 = this.a;
                int i5 = this.b;
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int i6 = inputStreamOpenStream.read(bArr);
                    if (i6 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i6);
                    return null;
                }
                com.google.android.libraries.maps.model.Tile tile = new com.google.android.libraries.maps.model.Tile(i4, i5, byteArrayOutputStream.toByteArray());
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
                return tile;
            } catch (java.lang.Throwable th) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public abstract java.net.URL getTileUrl(int i, int i2, int i3);
}
