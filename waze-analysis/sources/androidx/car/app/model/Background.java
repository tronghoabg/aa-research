package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.CarColorConstraints;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(9)
/* loaded from: classes2.dex */
public final class Background {
    public static final Background TRANSPARENT;
    private final CarColor mColor;
    private final CarIcon mImage;

    /* compiled from: WazeSource */
    public final class Builder {
        private CarColor mColor;
        private CarIcon mImage;

        public Builder(Background background) {
            this.mImage = ((Background) Objects.requireNonNull(background)).getImage();
        }

        public Background build() {
            if ((this.mImage == null) != (this.mColor == null)) {
                return new Background(this);
            }
            throw new IllegalStateException("Background must have exactly one property set: either Image or Color.");
        }

        public Builder setColor(CarColor carColor) {
            CarColorConstraints.UNCONSTRAINED.validateOrThrow(carColor);
            this.mColor = (CarColor) Objects.requireNonNull(carColor);
            return this;
        }

        public Builder setImage(CarIcon carIcon) {
            Objects.requireNonNull(carIcon);
            if (carIcon.getType() != 1) {
                throw new IllegalArgumentException("Only custom images are supported for background");
            }
            this.mImage = carIcon;
            return this;
        }
    }

    static {
        Builder builder = new Builder();
        builder.setColor(CarColor.createCustom(0, 0));
        TRANSPARENT = builder.build();
    }

    Background(Builder builder) {
        this.mColor = builder.mColor;
        this.mImage = builder.mImage;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Background)) {
            return false;
        }
        Background background = (Background) obj;
        return Objects.equals(this.mImage, background.mImage) && Objects.equals(this.mColor, background.mColor);
    }

    public CarColor getColor() {
        return this.mColor;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public int hashCode() {
        return Objects.hashCode(this.mImage);
    }

    public String toString() {
        return "Background [image: " + this.mImage + ", color: " + this.mColor + "]";
    }

    private Background() {
        this.mColor = null;
        this.mImage = null;
    }
}
