package defpackage;

import com.google.android.libraries.maps.model.Tile;
import com.google.android.libraries.maps.model.TileProvider;
import com.google.android.libraries.maps.model.internal.ITileProviderDelegate;

/* loaded from: classes3.dex */
public final class vji extends ITileProviderDelegate.Stub {
    final /* synthetic */ TileProvider a;

    public vji(TileProvider tileProvider) {
        this.a = tileProvider;
    }

    @Override // com.google.android.libraries.maps.model.internal.ITileProviderDelegate
    public final Tile getTile(int i, int i2, int i3) {
        return this.a.getTile(i, i2, i3);
    }
}
