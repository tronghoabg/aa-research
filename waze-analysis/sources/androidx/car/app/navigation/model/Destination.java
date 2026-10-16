package androidx.car.app.navigation.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.constraints.CarIconConstraints;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class Destination {
    private final CarText mAddress;
    private final CarIcon mImage;
    private final CarText mName;

    /* compiled from: WazeSource */
    public final class Builder {
        CarText mAddress;
        CarIcon mImage;
        CarText mName;

        public Destination build() {
            CarText carText;
            CarText carText2 = this.mName;
            if ((carText2 == null || carText2.isEmpty()) && ((carText = this.mAddress) == null || carText.isEmpty())) {
                throw new IllegalStateException("Both name and address cannot be null or empty");
            }
            return new Destination(this);
        }

        public Builder setAddress(CharSequence charSequence) {
            this.mAddress = CarText.create((CharSequence) Objects.requireNonNull(charSequence));
            return this;
        }

        public Builder setImage(CarIcon carIcon) {
            CarIconConstraints.DEFAULT.validateOrThrow((CarIcon) Objects.requireNonNull(carIcon));
            this.mImage = carIcon;
            return this;
        }

        public Builder setName(CharSequence charSequence) {
            this.mName = CarText.create((CharSequence) Objects.requireNonNull(charSequence));
            return this;
        }
    }

    Destination(Builder builder) {
        this.mName = builder.mName;
        this.mAddress = builder.mAddress;
        this.mImage = builder.mImage;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Destination)) {
            return false;
        }
        Destination destination = (Destination) obj;
        return Objects.equals(this.mName, destination.mName) && Objects.equals(this.mAddress, destination.mAddress) && Objects.equals(this.mImage, destination.mImage);
    }

    public CarText getAddress() {
        return this.mAddress;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public CarText getName() {
        return this.mName;
    }

    public int hashCode() {
        return Objects.hash(this.mName, this.mAddress, this.mImage);
    }

    public String toString() {
        return "[name: " + CarText.toShortString(this.mName) + ", address: " + CarText.toShortString(this.mAddress) + ", image: " + this.mImage + "]";
    }

    private Destination() {
        this.mName = null;
        this.mAddress = null;
        this.mImage = null;
    }
}
