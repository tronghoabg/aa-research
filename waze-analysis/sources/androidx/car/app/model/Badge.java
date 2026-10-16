package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(8)
/* loaded from: classes2.dex */
public class Badge {
    private final CarColor mDotColor;
    private final boolean mHasDot;
    private final CarIcon mIcon;
    private final CarColor mIconBackgroundColor;

    /* compiled from: WazeSource */
    public final class Builder {
        CarColor mDotColor;
        boolean mHasDot;
        CarIcon mIcon;
        CarColor mIconBackgroundColor;

        public Badge build() {
            boolean z = this.mHasDot;
            if (!z && this.mIcon == null) {
                throw new IllegalStateException("A badge must have a dot or an icon set");
            }
            if (!z && this.mDotColor != null) {
                throw new IllegalStateException("The dot must be enabled to set the dot color.");
            }
            if (this.mIcon != null || this.mIconBackgroundColor == null) {
                return new Badge(this);
            }
            throw new IllegalStateException("The icon must be set to set the icon background color.");
        }

        @Deprecated
        public Builder setBackgroundColor(CarColor carColor) {
            this.mDotColor = carColor;
            return this;
        }

        public Builder setDotColor(CarColor carColor) {
            this.mDotColor = carColor;
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

        public Builder setIconBackgroundColor(CarColor carColor) {
            this.mIconBackgroundColor = carColor;
            return this;
        }
    }

    Badge(Builder builder) {
        this.mHasDot = builder.mHasDot;
        this.mDotColor = builder.mDotColor;
        this.mIcon = builder.mIcon;
        this.mIconBackgroundColor = builder.mIconBackgroundColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return this.mHasDot == badge.mHasDot && Objects.equals(this.mDotColor, badge.mDotColor) && Objects.equals(this.mIcon, badge.mIcon) && Objects.equals(this.mIconBackgroundColor, badge.mIconBackgroundColor);
    }

    @Deprecated
    public CarColor getBackgroundColor() {
        return this.mDotColor;
    }

    public CarColor getDotColor() {
        return this.mDotColor;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public CarColor getIconBackgroundColor() {
        return this.mIconBackgroundColor;
    }

    public boolean hasDot() {
        return this.mHasDot;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mHasDot), this.mDotColor, this.mIcon, this.mIconBackgroundColor);
    }

    public String toString() {
        return "[hasDot: " + this.mHasDot + ", dotColor: " + this.mDotColor + ", icon: " + this.mIcon + ", iconBackgroundColor: " + this.mIconBackgroundColor + "]";
    }

    private Badge() {
        this.mHasDot = false;
        this.mDotColor = null;
        this.mIcon = null;
        this.mIconBackgroundColor = null;
    }
}
