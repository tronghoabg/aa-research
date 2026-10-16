package androidx.car.app.navigation.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.constraints.ActionsConstraints;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public final class MapController {
    private final ActionStrip mMapActionStrip;
    private final PanModeDelegate mPanModeDelegate;

    /* compiled from: WazeSource */
    public final class Builder {
        ActionStrip mMapActionStrip;
        PanModeDelegate mPanModeDelegate;

        public MapController build() {
            return new MapController(this);
        }

        public Builder setMapActionStrip(ActionStrip actionStrip) {
            ActionsConstraints.ACTIONS_CONSTRAINTS_MAP.validateOrThrow(((ActionStrip) Objects.requireNonNull(actionStrip)).getActions());
            this.mMapActionStrip = actionStrip;
            return this;
        }

        public Builder setPanModeListener(PanModeListener panModeListener) {
            Objects.requireNonNull(panModeListener);
            this.mPanModeDelegate = PanModeDelegateImpl.create(panModeListener);
            return this;
        }
    }

    MapController(Builder builder) {
        this.mPanModeDelegate = builder.mPanModeDelegate;
        this.mMapActionStrip = builder.mMapActionStrip;
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

    public PanModeDelegate getPanModeDelegate() {
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
