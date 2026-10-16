package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class PlaceMarker {
    private static final int MAX_LABEL_LENGTH = 3;
    public static final int TYPE_ICON = 0;
    public static final int TYPE_IMAGE = 1;
    private final androidx.car.app.model.CarColor mColor;
    private final androidx.car.app.model.CarIcon mIcon;
    private final int mIconType;
    private final androidx.car.app.model.CarText mLabel;

    public PlaceMarker(defpackage.vj vjVar) {
        androidx.car.app.model.CarIcon carIcon = vjVar.a;
        this.mIcon = null;
        int i = vjVar.d;
        this.mIconType = 0;
        this.mLabel = vjVar.b;
        this.mColor = vjVar.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.PlaceMarker)) {
            return false;
        }
        androidx.car.app.model.PlaceMarker placeMarker = (androidx.car.app.model.PlaceMarker) obj;
        return j$.util.Objects.equals(this.mIcon, placeMarker.mIcon) && j$.util.Objects.equals(this.mLabel, placeMarker.mLabel) && j$.util.Objects.equals(this.mColor, placeMarker.mColor) && this.mIconType == placeMarker.mIconType;
    }

    public androidx.car.app.model.CarColor getColor() {
        return this.mColor;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return this.mIcon;
    }

    public int getIconType() {
        return this.mIconType;
    }

    public androidx.car.app.model.CarText getLabel() {
        return this.mLabel;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mIcon, this.mLabel, this.mColor, java.lang.Integer.valueOf(this.mIconType));
    }

    public java.lang.String toString() {
        java.lang.String shortString;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        androidx.car.app.model.CarIcon carIcon = this.mIcon;
        if (carIcon != null) {
            shortString = carIcon.toString();
        } else {
            androidx.car.app.model.CarText carText = this.mLabel;
            shortString = carText != null ? androidx.car.app.model.CarText.toShortString(carText) : super.toString();
        }
        sb.append(shortString);
        sb.append("]");
        return sb.toString();
    }

    private PlaceMarker() {
        this.mIcon = null;
        this.mIconType = 0;
        this.mLabel = null;
        this.mColor = null;
    }
}
