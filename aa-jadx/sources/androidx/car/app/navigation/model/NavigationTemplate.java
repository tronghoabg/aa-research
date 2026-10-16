package androidx.car.app.navigation.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class NavigationTemplate implements defpackage.wi {
    private final androidx.car.app.model.ActionStrip mActionStrip;
    private final androidx.car.app.model.CarColor mBackgroundColor;
    private final androidx.car.app.navigation.model.TravelEstimate mDestinationTravelEstimate;
    private final androidx.car.app.model.ActionStrip mMapActionStrip;
    private final defpackage.xg mNavigationInfo;
    private final defpackage.xj mPanModeDelegate;
    private final androidx.car.app.model.Toggle mPanModeToggle;

    NavigationTemplate(defpackage.xf xfVar) {
        defpackage.xg xgVar = xfVar.a;
        this.mNavigationInfo = null;
        androidx.car.app.model.CarColor carColor = xfVar.b;
        this.mBackgroundColor = null;
        androidx.car.app.navigation.model.TravelEstimate travelEstimate = xfVar.c;
        this.mDestinationTravelEstimate = null;
        androidx.car.app.model.ActionStrip actionStrip = xfVar.d;
        this.mActionStrip = null;
        androidx.car.app.model.ActionStrip actionStrip2 = xfVar.e;
        this.mMapActionStrip = null;
        androidx.car.app.model.Toggle toggle = xfVar.f;
        this.mPanModeToggle = null;
        defpackage.xj xjVar = xfVar.g;
        this.mPanModeDelegate = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.navigation.model.NavigationTemplate)) {
            return false;
        }
        androidx.car.app.navigation.model.NavigationTemplate navigationTemplate = (androidx.car.app.navigation.model.NavigationTemplate) obj;
        if (j$.util.Objects.equals(this.mNavigationInfo, navigationTemplate.mNavigationInfo) && j$.util.Objects.equals(this.mBackgroundColor, navigationTemplate.mBackgroundColor) && j$.util.Objects.equals(this.mDestinationTravelEstimate, navigationTemplate.mDestinationTravelEstimate) && j$.util.Objects.equals(this.mActionStrip, navigationTemplate.mActionStrip) && j$.util.Objects.equals(this.mMapActionStrip, navigationTemplate.mMapActionStrip) && j$.util.Objects.equals(this.mPanModeToggle, navigationTemplate.mPanModeToggle)) {
            if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mPanModeDelegate == null), java.lang.Boolean.valueOf(navigationTemplate.mPanModeDelegate == null))) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.ActionStrip getActionStrip() {
        androidx.car.app.model.ActionStrip actionStrip = this.mActionStrip;
        actionStrip.getClass();
        return actionStrip;
    }

    public androidx.car.app.model.CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public androidx.car.app.navigation.model.TravelEstimate getDestinationTravelEstimate() {
        return this.mDestinationTravelEstimate;
    }

    public androidx.car.app.model.ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public defpackage.xg getNavigationInfo() {
        return this.mNavigationInfo;
    }

    public defpackage.xj getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    @java.lang.Deprecated
    public androidx.car.app.model.Toggle getPanModeToggle() {
        return this.mPanModeToggle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mNavigationInfo, this.mBackgroundColor, this.mDestinationTravelEstimate, this.mActionStrip, this.mMapActionStrip, this.mPanModeToggle, java.lang.Boolean.valueOf(this.mPanModeDelegate == null));
    }

    public java.lang.String toString() {
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
