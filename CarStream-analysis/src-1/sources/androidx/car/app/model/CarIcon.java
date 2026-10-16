package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.CarColorConstraints;
import androidx.car.app.model.constraints.CarIconConstraints;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class CarIcon {
    public static final int TYPE_ALERT = 4;
    public static final int TYPE_APP_ICON = 5;
    public static final int TYPE_BACK = 3;
    public static final int TYPE_COMPOSE_MESSAGE = 8;
    public static final int TYPE_CUSTOM = 1;
    public static final int TYPE_ERROR = 6;
    public static final int TYPE_PAN = 7;
    private static final int TYPE_RESOURCE = 2;
    private static final int TYPE_URI = 4;
    private final IconCompat mIcon;
    private final CarColor mTint;
    private final int mType;
    public static final CarIcon APP_ICON = forStandardType(5);
    public static final CarIcon BACK = forStandardType(3);
    public static final CarIcon ALERT = forStandardType(4);
    public static final CarIcon ERROR = forStandardType(6);

    @RequiresCarApi(2)
    public static final CarIcon PAN = forStandardType(7);

    @RequiresCarApi(7)
    public static final CarIcon COMPOSE_MESSAGE = forStandardType(8);

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CarIconType {
    }

    public CarIcon(IconCompat iconCompat, CarColor carColor, int i) {
        this.mType = i;
        this.mIcon = iconCompat;
        this.mTint = carColor;
    }

    private static CarIcon forStandardType(int i) {
        return forStandardType(i, CarColor.DEFAULT);
    }

    private boolean iconCompatEquals(IconCompat iconCompat) {
        int type;
        IconCompat iconCompat2 = this.mIcon;
        if (iconCompat2 == null) {
            return iconCompat == null;
        }
        if (iconCompat == null || (type = iconCompat2.getType()) != iconCompat.getType()) {
            return false;
        }
        if (type == 2) {
            return Objects.equals(this.mIcon.getResPackage(), iconCompat.getResPackage()) && this.mIcon.getResId() == iconCompat.getResId();
        }
        if (type == 4) {
            return Objects.equals(this.mIcon.getUri(), iconCompat.getUri());
        }
        return true;
    }

    private Object iconCompatHash() {
        IconCompat iconCompat = this.mIcon;
        if (iconCompat == null) {
            return null;
        }
        int type = iconCompat.getType();
        if (type != 2) {
            return type == 4 ? this.mIcon.getUri() : Integer.valueOf(type);
        }
        return this.mIcon.getResPackage() + this.mIcon.getResId();
    }

    private static String typeToString(int i) {
        switch (i) {
            case 1:
                return "CUSTOM";
            case 2:
            default:
                return "<unknown>";
            case 3:
                return "BACK";
            case 4:
                return "ALERT";
            case 5:
                return "APP";
            case 6:
                return "ERROR";
            case 7:
                return "PAN";
            case 8:
                return "COMPOSE_MESSAGE";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarIcon)) {
            return false;
        }
        CarIcon carIcon = (CarIcon) obj;
        return this.mType == carIcon.mType && Objects.equals(this.mTint, carIcon.mTint) && iconCompatEquals(carIcon.mIcon);
    }

    public IconCompat getIcon() {
        return this.mIcon;
    }

    public CarColor getTint() {
        return this.mTint;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mType), this.mTint, iconCompatHash());
    }

    public String toString() {
        return "[type: " + typeToString(this.mType) + ", tint: " + this.mTint + "]";
    }

    private static CarIcon forStandardType(int i, CarColor carColor) {
        return new CarIcon(null, carColor, i);
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        private final IconCompat mIcon;
        private CarColor mTint;
        private final int mType;

        public Builder(IconCompat iconCompat) {
            CarIconConstraints carIconConstraints = CarIconConstraints.UNCONSTRAINED;
            Objects.requireNonNull(iconCompat);
            carIconConstraints.checkSupportedIcon(iconCompat);
            this.mType = 1;
            this.mIcon = iconCompat;
            this.mTint = null;
        }

        public CarIcon build() {
            return new CarIcon(this.mIcon, this.mTint, this.mType);
        }

        public Builder setTint(CarColor carColor) {
            CarColorConstraints carColorConstraints = CarColorConstraints.UNCONSTRAINED;
            Objects.requireNonNull(carColor);
            carColorConstraints.validateOrThrow(carColor);
            this.mTint = carColor;
            return this;
        }

        public Builder(CarIcon carIcon) {
            Objects.requireNonNull(carIcon);
            this.mType = carIcon.getType();
            this.mIcon = carIcon.getIcon();
            this.mTint = carIcon.getTint();
        }
    }

    private CarIcon() {
        this.mType = 1;
        this.mIcon = null;
        this.mTint = null;
    }
}
