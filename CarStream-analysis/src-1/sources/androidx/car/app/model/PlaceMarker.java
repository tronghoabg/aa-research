package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.constraints.CarColorConstraints;
import androidx.car.app.model.constraints.CarIconConstraints;
import defpackage.ad;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class PlaceMarker {
    private static final int MAX_LABEL_LENGTH = 3;
    public static final int TYPE_ICON = 0;
    public static final int TYPE_IMAGE = 1;
    private final CarColor mColor;
    private final CarIcon mIcon;
    private final int mIconType;
    private final CarText mLabel;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        CarColor mColor;
        CarIcon mIcon;
        int mIconType = 0;
        CarText mLabel;

        public PlaceMarker build() {
            if (this.mColor == null || this.mIcon == null || this.mIconType != 1) {
                return new PlaceMarker(this);
            }
            throw new IllegalStateException("Color cannot be set for icon set with TYPE_IMAGE");
        }

        public Builder setColor(CarColor carColor) {
            CarColorConstraints carColorConstraints = CarColorConstraints.UNCONSTRAINED;
            Objects.requireNonNull(carColor);
            carColorConstraints.validateOrThrow(carColor);
            this.mColor = carColor;
            return this;
        }

        public Builder setIcon(CarIcon carIcon, int i) {
            CarIconConstraints carIconConstraints = CarIconConstraints.DEFAULT;
            Objects.requireNonNull(carIcon);
            carIconConstraints.validateOrThrow(carIcon);
            this.mIcon = carIcon;
            this.mIconType = i;
            return this;
        }

        public Builder setLabel(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            if (charSequence.length() > 3) {
                throw new IllegalArgumentException("Marker label cannot contain more than 3 characters");
            }
            this.mLabel = CarText.create(charSequence);
            return this;
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MarkerIconType {
    }

    public PlaceMarker(Builder builder) {
        this.mIcon = builder.mIcon;
        this.mIconType = builder.mIconType;
        this.mLabel = builder.mLabel;
        this.mColor = builder.mColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceMarker)) {
            return false;
        }
        PlaceMarker placeMarker = (PlaceMarker) obj;
        return Objects.equals(this.mIcon, placeMarker.mIcon) && Objects.equals(this.mLabel, placeMarker.mLabel) && Objects.equals(this.mColor, placeMarker.mColor) && this.mIconType == placeMarker.mIconType;
    }

    public CarColor getColor() {
        return this.mColor;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public int getIconType() {
        return this.mIconType;
    }

    public CarText getLabel() {
        return this.mLabel;
    }

    public int hashCode() {
        return Objects.hash(this.mIcon, this.mLabel, this.mColor, Integer.valueOf(this.mIconType));
    }

    public String toString() {
        String shortString;
        StringBuilder sb = new StringBuilder("[");
        CarIcon carIcon = this.mIcon;
        if (carIcon != null) {
            shortString = carIcon.toString();
        } else {
            CarText carText = this.mLabel;
            shortString = carText != null ? CarText.toShortString(carText) : super.toString();
        }
        return ad.e(sb, shortString, "]");
    }

    private PlaceMarker() {
        this.mIcon = null;
        this.mIconType = 0;
        this.mLabel = null;
        this.mColor = null;
    }
}
