package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vke implements com.google.android.libraries.maps.model.TileProvider {
    final /* synthetic */ com.google.android.libraries.maps.model.TileOverlayOptions a;
    private final com.google.android.libraries.maps.model.internal.ITileProviderDelegate b;

    public vke(com.google.android.libraries.maps.model.TileOverlayOptions tileOverlayOptions) {
        this.a = tileOverlayOptions;
        this.b = tileOverlayOptions.a;
    }

    @Override // com.google.android.libraries.maps.model.TileProvider
    public final com.google.android.libraries.maps.model.Tile getTile(int i, int i2, int i3) {
        try {
            return this.b.getTile(i, i2, i3);
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }
}
