package androidx.car.app.navigation.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class RoutingInfo implements defpackage.xg {
    private final androidx.car.app.model.Distance mCurrentDistance;
    private final androidx.car.app.navigation.model.Step mCurrentStep;
    private final boolean mIsLoading;
    private final androidx.car.app.model.CarIcon mJunctionImage;
    private final androidx.car.app.navigation.model.Step mNextStep;

    RoutingInfo(defpackage.xo xoVar) {
        java.lang.Object obj = xoVar.b;
        this.mCurrentStep = null;
        java.lang.Object obj2 = xoVar.c;
        this.mCurrentDistance = null;
        java.lang.Object obj3 = xoVar.d;
        this.mNextStep = null;
        java.lang.Object obj4 = xoVar.e;
        this.mJunctionImage = null;
        boolean z = xoVar.a;
        this.mIsLoading = false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.navigation.model.RoutingInfo)) {
            return false;
        }
        androidx.car.app.navigation.model.RoutingInfo routingInfo = (androidx.car.app.navigation.model.RoutingInfo) obj;
        return this.mIsLoading == routingInfo.mIsLoading && j$.util.Objects.equals(this.mCurrentStep, routingInfo.mCurrentStep) && j$.util.Objects.equals(this.mCurrentDistance, routingInfo.mCurrentDistance) && j$.util.Objects.equals(this.mNextStep, routingInfo.mNextStep) && j$.util.Objects.equals(this.mJunctionImage, routingInfo.mJunctionImage);
    }

    public androidx.car.app.model.Distance getCurrentDistance() {
        return this.mCurrentDistance;
    }

    public androidx.car.app.navigation.model.Step getCurrentStep() {
        return this.mCurrentStep;
    }

    public androidx.car.app.model.CarIcon getJunctionImage() {
        return this.mJunctionImage;
    }

    public androidx.car.app.navigation.model.Step getNextStep() {
        return this.mNextStep;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mCurrentStep, this.mCurrentDistance, this.mNextStep, this.mJunctionImage, java.lang.Boolean.valueOf(this.mIsLoading));
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        return "RoutingInfo";
    }

    private RoutingInfo() {
        this.mCurrentStep = null;
        this.mCurrentDistance = null;
        this.mNextStep = null;
        this.mJunctionImage = null;
        this.mIsLoading = false;
    }
}
