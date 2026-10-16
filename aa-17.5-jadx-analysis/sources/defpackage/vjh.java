package defpackage;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.Tile;
import com.google.android.libraries.maps.model.TileOverlayOptions;
import com.google.android.libraries.maps.model.TileProvider;
import com.google.android.libraries.maps.model.internal.ITileProviderDelegate;

/* loaded from: classes3.dex */
public final class vjh implements TileProvider {
    final /* synthetic */ TileOverlayOptions a;
    private final ITileProviderDelegate b;

    public vjh(TileOverlayOptions tileOverlayOptions) {
        this.a = tileOverlayOptions;
        this.b = tileOverlayOptions.a;
    }

    @Override // com.google.android.libraries.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        try {
            return this.b.getTile(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
