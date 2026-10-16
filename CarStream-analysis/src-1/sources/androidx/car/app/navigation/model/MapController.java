package androidx.car.app.navigation.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.constraints.ActionsConstraints;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes.dex */
public final class MapController {
    private final ActionStrip mMapActionStrip;
    private final PanModeDelegate mPanModeDelegate;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        ActionStrip mMapActionStrip;
        PanModeDelegate mPanModeDelegate;

        public MapController build() {
            return new MapController(this);
        }

        public Builder setMapActionStrip(ActionStrip actionStrip) {
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_MAP;
            Objects.requireNonNull(actionStrip);
            actionsConstraints.validateOrThrow(actionStrip.getActions());
            this.mMapActionStrip = actionStrip;
            return this;
        }

        public Builder setPanModeListener(PanModeListener panModeListener) {
            Objects.requireNonNull(panModeListener);
            this.mPanModeDelegate = PanModeDelegateImpl.create(panModeListener);
            return this;
        }
    }

    public MapController(Builder builder) {
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
        return Boolean.valueOf(this.mPanModeDelegate == null).equals(Boolean.valueOf(mapController.mPanModeDelegate == null)) && Objects.equals(this.mMapActionStrip, mapController.mMapActionStrip);
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
