package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import defpackage.rb;
import defpackage.wt;
import defpackage.xc;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class MapController {
    private final ActionStrip mMapActionStrip;
    private final xc mPanModeDelegate;

    public MapController(wt wtVar) {
        this.mPanModeDelegate = wtVar.a;
        this.mMapActionStrip = wtVar.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapController)) {
            return false;
        }
        MapController mapController = (MapController) obj;
        return Objects.equals(Boolean.valueOf(this.mPanModeDelegate == null), Boolean.valueOf(mapController.mPanModeDelegate == null)) && Objects.equals(this.mMapActionStrip, mapController.mMapActionStrip);
    }

    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public xc getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    public int hashCode() {
        return Objects.hash(this.mPanModeDelegate, this.mMapActionStrip);
    }

    private MapController() {
        this.mPanModeDelegate = null;
        this.mMapActionStrip = null;
    }
}
