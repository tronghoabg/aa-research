package defpackage;

import com.google.android.apps.auto.components.apphost.view.widgets.maps.MapViewContainerImpl;
import com.google.android.libraries.maps.LocationSource;

/* loaded from: classes2.dex */
public final class ken implements LocationSource {
    final /* synthetic */ MapViewContainerImpl a;

    public ken(MapViewContainerImpl mapViewContainerImpl) {
        this.a = mapViewContainerImpl;
    }

    @Override // com.google.android.libraries.maps.LocationSource
    public final void activate(LocationSource.OnLocationChangedListener onLocationChangedListener) {
        this.a.d = onLocationChangedListener;
    }

    @Override // com.google.android.libraries.maps.LocationSource
    public final void deactivate() {
        this.a.d = null;
    }
}
