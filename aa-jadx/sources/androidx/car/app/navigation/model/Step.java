package androidx.car.app.navigation.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Step {
    private final androidx.car.app.model.CarText mCue;
    private final java.util.List<androidx.car.app.navigation.model.Lane> mLanes;
    private final androidx.car.app.model.CarIcon mLanesImage;
    private final androidx.car.app.navigation.model.Maneuver mManeuver;
    private final androidx.car.app.model.CarText mRoad;

    public Step(androidx.car.app.navigation.model.Maneuver maneuver, java.util.List<androidx.car.app.navigation.model.Lane> list, androidx.car.app.model.CarIcon carIcon, androidx.car.app.model.CarText carText, androidx.car.app.model.CarText carText2) {
        this.mManeuver = maneuver;
        this.mLanes = defpackage.tq.b(list);
        defpackage.wo.b.a(carIcon);
        this.mLanesImage = carIcon;
        this.mCue = carText;
        this.mRoad = carText2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.navigation.model.Step)) {
            return false;
        }
        androidx.car.app.navigation.model.Step step = (androidx.car.app.navigation.model.Step) obj;
        return j$.util.Objects.equals(this.mManeuver, step.mManeuver) && j$.util.Objects.equals(this.mLanes, step.mLanes) && j$.util.Objects.equals(this.mLanesImage, step.mLanesImage) && j$.util.Objects.equals(this.mCue, step.mCue) && j$.util.Objects.equals(this.mRoad, step.mRoad);
    }

    public androidx.car.app.model.CarText getCue() {
        return this.mCue;
    }

    public java.util.List<androidx.car.app.navigation.model.Lane> getLanes() {
        return defpackage.tq.a(this.mLanes);
    }

    public androidx.car.app.model.CarIcon getLanesImage() {
        return this.mLanesImage;
    }

    public androidx.car.app.navigation.model.Maneuver getManeuver() {
        return this.mManeuver;
    }

    public androidx.car.app.model.CarText getRoad() {
        return this.mRoad;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mManeuver, this.mLanes, this.mLanesImage, this.mCue, this.mRoad);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[maneuver: ");
        sb.append(this.mManeuver);
        sb.append(", lane count: ");
        java.util.List<androidx.car.app.navigation.model.Lane> list = this.mLanes;
        sb.append(list != null ? list.size() : 0);
        sb.append(", lanes image: ");
        sb.append(this.mLanesImage);
        sb.append(", cue: ");
        sb.append(androidx.car.app.model.CarText.toShortString(this.mCue));
        sb.append(", road: ");
        sb.append(androidx.car.app.model.CarText.toShortString(this.mRoad));
        sb.append("]");
        return sb.toString();
    }

    private Step() {
        this.mManeuver = null;
        this.mLanes = java.util.Collections.EMPTY_LIST;
        this.mLanesImage = null;
        this.mCue = null;
        this.mRoad = null;
    }
}
