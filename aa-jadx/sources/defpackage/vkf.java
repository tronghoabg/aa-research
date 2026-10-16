package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vkf extends com.google.android.libraries.maps.model.internal.ITileProviderDelegate.Stub {
    final /* synthetic */ com.google.android.libraries.maps.model.TileProvider a;

    public vkf(com.google.android.libraries.maps.model.TileProvider tileProvider) {
        this.a = tileProvider;
    }

    @Override // com.google.android.libraries.maps.model.internal.ITileProviderDelegate
    public final com.google.android.libraries.maps.model.Tile getTile(int i, int i2, int i3) {
        return this.a.getTile(i, i2, i3);
    }
}
