package androidx.car.app.navigation.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.Template;
import androidx.car.app.model.Toggle;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.CarColorConstraints;
import defpackage.m0;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class NavigationTemplate implements Template {
    private final ActionStrip mActionStrip;
    private final CarColor mBackgroundColor;
    private final TravelEstimate mDestinationTravelEstimate;
    private final ActionStrip mMapActionStrip;
    private final NavigationInfo mNavigationInfo;
    private final PanModeDelegate mPanModeDelegate;
    private final Toggle mPanModeToggle;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        ActionStrip mActionStrip;
        CarColor mBackgroundColor;
        TravelEstimate mDestinationTravelEstimate;
        ActionStrip mMapActionStrip;
        NavigationInfo mNavigationInfo;
        PanModeDelegate mPanModeDelegate;
        Toggle mPanModeToggle;

        public NavigationTemplate build() {
            if (this.mActionStrip != null) {
                return new NavigationTemplate(this);
            }
            throw new IllegalStateException("Action strip for this template must be set");
        }

        public Builder setActionStrip(ActionStrip actionStrip) {
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_NAVIGATION;
            Objects.requireNonNull(actionStrip);
            actionsConstraints.validateOrThrow(actionStrip.getActions());
            this.mActionStrip = actionStrip;
            return this;
        }

        public Builder setBackgroundColor(CarColor carColor) {
            CarColorConstraints carColorConstraints = CarColorConstraints.UNCONSTRAINED;
            Objects.requireNonNull(carColor);
            carColorConstraints.validateOrThrow(carColor);
            this.mBackgroundColor = carColor;
            return this;
        }

        public Builder setDestinationTravelEstimate(TravelEstimate travelEstimate) {
            Objects.requireNonNull(travelEstimate);
            if (travelEstimate.getRemainingTimeSeconds() < 0 && travelEstimate.getRemainingTimeSeconds() != -1) {
                throw new IllegalArgumentException("The destination travel estimate's remaining time must be greater or equal to zero");
            }
            this.mDestinationTravelEstimate = travelEstimate;
            return this;
        }

        @RequiresCarApi(2)
        public Builder setMapActionStrip(ActionStrip actionStrip) {
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_MAP;
            Objects.requireNonNull(actionStrip);
            actionsConstraints.validateOrThrow(actionStrip.getActions());
            this.mMapActionStrip = actionStrip;
            return this;
        }

        public Builder setNavigationInfo(NavigationInfo navigationInfo) {
            Objects.requireNonNull(navigationInfo);
            this.mNavigationInfo = navigationInfo;
            return this;
        }

        @RequiresCarApi(2)
        public Builder setPanModeListener(PanModeListener panModeListener) {
            Objects.requireNonNull(panModeListener);
            this.mPanModeToggle = new Toggle.Builder(new m0(panModeListener, 5)).build();
            this.mPanModeDelegate = PanModeDelegateImpl.create(panModeListener);
            return this;
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public interface NavigationInfo {
    }

    public NavigationTemplate(Builder builder) {
        this.mNavigationInfo = builder.mNavigationInfo;
        this.mBackgroundColor = builder.mBackgroundColor;
        this.mDestinationTravelEstimate = builder.mDestinationTravelEstimate;
        this.mActionStrip = builder.mActionStrip;
        this.mMapActionStrip = builder.mMapActionStrip;
        this.mPanModeToggle = builder.mPanModeToggle;
        this.mPanModeDelegate = builder.mPanModeDelegate;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationTemplate)) {
            return false;
        }
        NavigationTemplate navigationTemplate = (NavigationTemplate) obj;
        if (Objects.equals(this.mNavigationInfo, navigationTemplate.mNavigationInfo) && Objects.equals(this.mBackgroundColor, navigationTemplate.mBackgroundColor) && Objects.equals(this.mDestinationTravelEstimate, navigationTemplate.mDestinationTravelEstimate) && Objects.equals(this.mActionStrip, navigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, navigationTemplate.mMapActionStrip) && Objects.equals(this.mPanModeToggle, navigationTemplate.mPanModeToggle)) {
            if (Boolean.valueOf(this.mPanModeDelegate == null).equals(Boolean.valueOf(navigationTemplate.mPanModeDelegate == null))) {
                return true;
            }
        }
        return false;
    }

    public ActionStrip getActionStrip() {
        ActionStrip actionStrip = this.mActionStrip;
        Objects.requireNonNull(actionStrip);
        return actionStrip;
    }

    public CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public TravelEstimate getDestinationTravelEstimate() {
        return this.mDestinationTravelEstimate;
    }

    @RequiresCarApi(2)
    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public NavigationInfo getNavigationInfo() {
        return this.mNavigationInfo;
    }

    @RequiresCarApi(2)
    public PanModeDelegate getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    @RequiresCarApi(2)
    @Deprecated
    public Toggle getPanModeToggle() {
        return this.mPanModeToggle;
    }

    public int hashCode() {
        return Objects.hash(this.mNavigationInfo, this.mBackgroundColor, this.mDestinationTravelEstimate, this.mActionStrip, this.mMapActionStrip, this.mPanModeToggle, Boolean.valueOf(this.mPanModeDelegate == null));
    }

    public String toString() {
        return "NavigationTemplate";
    }

    private NavigationTemplate() {
        this.mNavigationInfo = null;
        this.mBackgroundColor = null;
        this.mDestinationTravelEstimate = null;
        this.mActionStrip = null;
        this.mMapActionStrip = null;
        this.mPanModeToggle = null;
        this.mPanModeDelegate = null;
    }
}
