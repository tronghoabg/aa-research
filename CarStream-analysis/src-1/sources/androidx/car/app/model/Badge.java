package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public class Badge {
    private final CarColor mBackgroundColor;
    private final boolean mHasDot;
    private final CarIcon mIcon;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        CarColor mBackgroundColor;
        boolean mHasDot;
        CarIcon mIcon;

        public Badge build() {
            boolean z = this.mHasDot;
            if (!z && this.mIcon == null) {
                throw new IllegalStateException("A badge must have a dot or an icon set");
            }
            if (z || this.mBackgroundColor == null) {
                return new Badge(this);
            }
            throw new IllegalStateException("The dot must be enabled to set the background color.");
        }

        public Builder setBackgroundColor(CarColor carColor) {
            this.mBackgroundColor = carColor;
            return this;
        }

        public Builder setHasDot(boolean z) {
            this.mHasDot = z;
            return this;
        }

        public Builder setIcon(CarIcon carIcon) {
            this.mIcon = carIcon;
            return this;
        }
    }

    public Badge(Builder builder) {
        this.mHasDot = builder.mHasDot;
        this.mBackgroundColor = builder.mBackgroundColor;
        this.mIcon = builder.mIcon;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return this.mHasDot == badge.mHasDot && Objects.equals(this.mBackgroundColor, badge.mBackgroundColor) && Objects.equals(this.mIcon, badge.mIcon);
    }

    public CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public boolean hasDot() {
        return this.mHasDot;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mHasDot), this.mBackgroundColor, this.mIcon);
    }

    public String toString() {
        return "[hasDot: " + this.mHasDot + ", backgroundColor: " + this.mBackgroundColor + ", icon: " + this.mIcon + "]";
    }

    private Badge() {
        this.mHasDot = false;
        this.mBackgroundColor = null;
        this.mIcon = null;
    }
}
