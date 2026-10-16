package androidx.car.app.model;

import androidx.core.graphics.drawable.IconCompat;
import defpackage.rb;
import defpackage.tj;
import defpackage.tk;
import j$.util.Objects;

@rb
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
    private final CarIconStyle mStyle;

    @Deprecated
    private final CarColor mTint;
    private final int mType;
    public static final CarIcon APP_ICON = forStandardType(5);
    public static final CarIcon BACK = forStandardType(3);
    public static final CarIcon ALERT = forStandardType(4);
    public static final CarIcon ERROR = forStandardType(6);
    public static final CarIcon PAN = forStandardType(7);
    public static final CarIcon COMPOSE_MESSAGE = forStandardType(8);
    public static final CarIcon MEDIA_PLAYBACK = forStandardType(9);

    public CarIcon(tj tjVar) {
        int i = tjVar.a;
        this.mType = 1;
        this.mIcon = (IconCompat) tjVar.b;
        CarIconStyle carIconStyle = (CarIconStyle) tjVar.c;
        this.mStyle = carIconStyle;
        this.mTint = carIconStyle != null ? carIconStyle.getTint() : null;
    }

    private static CarIcon forStandardType(int i) {
        return new CarIcon(null, CarColor.DEFAULT, i);
    }

    private boolean iconCompatEquals(IconCompat iconCompat) {
        int iB;
        IconCompat iconCompat2 = this.mIcon;
        if (iconCompat2 == null) {
            return iconCompat == null;
        }
        if (iconCompat == null || (iB = iconCompat2.b()) != iconCompat.b()) {
            return false;
        }
        if (iB == 2) {
            return Objects.equals(this.mIcon.o(), iconCompat.o()) && this.mIcon.a() == iconCompat.a();
        }
        if (iB == 4) {
            return Objects.equals(this.mIcon.f(), iconCompat.f());
        }
        return true;
    }

    private Object iconCompatHash() {
        IconCompat iconCompat = this.mIcon;
        if (iconCompat == null) {
            return null;
        }
        int iB = iconCompat.b();
        if (iB != 2) {
            return iB == 4 ? this.mIcon.f() : Integer.valueOf(iB);
        }
        return this.mIcon.o() + this.mIcon.a();
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
        return this.mType == carIcon.mType && Objects.equals(this.mTint, carIcon.mTint) && iconCompatEquals(carIcon.mIcon) && Objects.equals(this.mStyle, carIcon.mStyle);
    }

    public IconCompat getIcon() {
        return this.mIcon;
    }

    public CarIconStyle getStyle() {
        CarIconStyle carIconStyle = this.mStyle;
        if (carIconStyle != null) {
            return carIconStyle;
        }
        CarColor carColor = this.mTint;
        if (carColor == null) {
            return null;
        }
        tk tkVar = new tk();
        tkVar.b(carColor);
        return tkVar.a();
    }

    @Deprecated
    public CarColor getTint() {
        CarIconStyle carIconStyle = this.mStyle;
        return carIconStyle == null ? this.mTint : carIconStyle.getTint();
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mType), this.mTint, iconCompatHash(), this.mStyle);
    }

    public String toString() {
        return "[type: " + typeToString(this.mType) + ", tint: " + this.mTint + ", style: " + this.mStyle + "]";
    }

    private CarIcon() {
        this.mType = 1;
        this.mIcon = null;
        this.mTint = null;
        this.mStyle = null;
    }

    public CarIcon(IconCompat iconCompat, CarColor carColor, int i) {
        CarIconStyle carIconStyleA;
        this.mType = i;
        this.mIcon = iconCompat;
        this.mTint = carColor;
        if (carColor != null) {
            tk tkVar = new tk();
            tkVar.b(carColor);
            carIconStyleA = tkVar.a();
        } else {
            carIconStyleA = null;
        }
        this.mStyle = carIconStyleA;
    }
}
