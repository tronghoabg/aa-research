package androidx.car.app.model;

import androidx.camera.core.CameraInfo;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.CarColorConstraints;
import androidx.car.app.model.constraints.CarIconConstraints;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class CarIcon {
    public static final int TYPE_ALERT = 4;
    public static final int TYPE_APP_ICON = 5;
    public static final int TYPE_BACK = 3;
    public static final int TYPE_COMPOSE_MESSAGE = 8;
    public static final int TYPE_CUSTOM = 1;
    public static final int TYPE_ERROR = 6;
    public static final int TYPE_MEDIA_PLAYBACK = 9;
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

    @RequiresCarApi(8)
    public static final CarIcon MEDIA_PLAYBACK = forStandardType(9);

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CarIconType {
    }

    private CarIcon() {
        this.mType = 1;
        this.mIcon = null;
        this.mTint = null;
    }

    private static CarIcon forStandardType(int i2) {
        return forStandardType(i2, CarColor.DEFAULT);
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

    private static String typeToString(int i2) {
        switch (i2) {
            case 1:
                return "CUSTOM";
            case 2:
            default:
                return CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
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
            case 9:
                return "MEDIA_PLAYBACK";
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

    private static CarIcon forStandardType(int i2, CarColor carColor) {
        return new CarIcon(null, carColor, i2);
    }

    CarIcon(IconCompat iconCompat, CarColor carColor, int i2) {
        this.mType = i2;
        this.mIcon = iconCompat;
        this.mTint = carColor;
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private final IconCompat mIcon;
        private CarColor mTint;
        private final int mType;

        public Builder(CarIcon carIcon) {
            Objects.requireNonNull(carIcon);
            this.mType = carIcon.getType();
            this.mIcon = carIcon.getIcon();
            this.mTint = carIcon.getTint();
        }

        public CarIcon build() {
            return new CarIcon(this.mIcon, this.mTint, this.mType);
        }

        public Builder setTint(CarColor carColor) {
            CarColorConstraints.UNCONSTRAINED.validateOrThrow((CarColor) Objects.requireNonNull(carColor));
            this.mTint = carColor;
            return this;
        }

        public Builder(IconCompat iconCompat) {
            CarIconConstraints.UNCONSTRAINED.checkSupportedIcon((IconCompat) Objects.requireNonNull(iconCompat));
            this.mType = 1;
            this.mIcon = iconCompat;
            this.mTint = null;
        }
    }
}
