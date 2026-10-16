package androidx.car.app.navigation.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class MapController {
    private final androidx.car.app.model.ActionStrip mMapActionStrip;
    private final defpackage.xj mPanModeDelegate;

    public MapController(defpackage.xa xaVar) {
        this.mPanModeDelegate = xaVar.a;
        this.mMapActionStrip = xaVar.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.navigation.model.MapController)) {
            return false;
        }
        androidx.car.app.navigation.model.MapController mapController = (androidx.car.app.navigation.model.MapController) obj;
        return j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mPanModeDelegate == null), java.lang.Boolean.valueOf(mapController.mPanModeDelegate == null)) && j$.util.Objects.equals(this.mMapActionStrip, mapController.mMapActionStrip);
    }

    public androidx.car.app.model.ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public defpackage.xj getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mPanModeDelegate, this.mMapActionStrip);
    }

    private MapController() {
        this.mPanModeDelegate = null;
        this.mMapActionStrip = null;
    }
}
