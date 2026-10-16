package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.constraints.CarColorConstraints;
import androidx.car.app.model.constraints.CarIconConstraints;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class PlaceMarker {
    private static final int MAX_LABEL_LENGTH = 3;
    public static final int TYPE_ICON = 0;
    public static final int TYPE_IMAGE = 1;
    private final CarColor mColor;
    private final CarIcon mIcon;
    private final int mIconType;
    private final CarText mLabel;

    /* compiled from: WazeSource */
    public final class Builder {
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
            CarColorConstraints.UNCONSTRAINED.validateOrThrow((CarColor) Objects.requireNonNull(carColor));
            this.mColor = carColor;
            return this;
        }

        public Builder setIcon(CarIcon carIcon, int i2) {
            CarIconConstraints.DEFAULT.validateOrThrow((CarIcon) Objects.requireNonNull(carIcon));
            this.mIcon = carIcon;
            this.mIconType = i2;
            return this;
        }

        public Builder setLabel(CharSequence charSequence) {
            if (((CharSequence) Objects.requireNonNull(charSequence)).length() > 3) {
                throw new IllegalArgumentException("Marker label cannot contain more than 3 characters");
            }
            this.mLabel = CarText.create(charSequence);
            return this;
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MarkerIconType {
    }

    PlaceMarker(Builder builder) {
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
