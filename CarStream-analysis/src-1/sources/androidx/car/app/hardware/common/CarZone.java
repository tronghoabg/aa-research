package androidx.car.app.hardware.common;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes.dex */
public final class CarZone {
    public static final int CAR_ZONE_COLUMN_ALL = 16;
    public static final int CAR_ZONE_COLUMN_CENTER = 48;
    public static final int CAR_ZONE_COLUMN_DRIVER = 80;
    public static final int CAR_ZONE_COLUMN_LEFT = 32;
    public static final int CAR_ZONE_COLUMN_PASSENGER = 96;
    public static final int CAR_ZONE_COLUMN_RIGHT = 64;
    public static final CarZone CAR_ZONE_GLOBAL = new Builder().build();
    public static final int CAR_ZONE_ROW_ALL = 0;
    public static final int CAR_ZONE_ROW_EXCLUDE_FIRST = 4;
    public static final int CAR_ZONE_ROW_FIRST = 1;
    public static final int CAR_ZONE_ROW_SECOND = 2;
    public static final int CAR_ZONE_ROW_THIRD = 3;
    private final int mColumn;
    private final int mRow;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        int mRow = 0;
        int mColumn = 16;

        public CarZone build() {
            return new CarZone(this);
        }

        public Builder setColumn(int i) {
            this.mColumn = i;
            return this;
        }

        public Builder setRow(int i) {
            this.mRow = i;
            return this;
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CarZoneColumn {
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CarZoneRow {
    }

    public CarZone(Builder builder) {
        this.mRow = builder.mRow;
        this.mColumn = builder.mColumn;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarZone)) {
            return false;
        }
        CarZone carZone = (CarZone) obj;
        return Integer.valueOf(this.mColumn).equals(Integer.valueOf(carZone.getColumn())) && Integer.valueOf(this.mRow).equals(Integer.valueOf(carZone.getRow()));
    }

    public int getColumn() {
        return this.mColumn;
    }

    public int getRow() {
        return this.mRow;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mRow), Integer.valueOf(this.mColumn));
    }

    public String toString() {
        int i = this.mRow;
        String str = "UNKNOWN";
        String str2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "CAR_ZONE_ROW_EXCLUDE_FIRST" : "CAR_ZONE_ROW_THIRD" : "CAR_ZONE_ROW_SECOND" : "CAR_ZONE_ROW_FIRST" : "CAR_ZONE_ROW_ALL";
        int i2 = this.mColumn;
        if (i2 == 16) {
            str = "CAR_ZONE_COLUMN_ALL";
        } else if (i2 == 32) {
            str = "CAR_ZONE_COLUMN_LEFT";
        } else if (i2 == 48) {
            str = "CAR_ZONE_COLUMN_CENTER";
        } else if (i2 == 64) {
            str = "CAR_ZONE_COLUMN_RIGHT";
        } else if (i2 == 80) {
            str = "CAR_ZONE_COLUMN_DRIVER";
        } else if (i2 == 96) {
            str = "CAR_ZONE_COLUMN_PASSENGER";
        }
        return "[CarZone row value: " + str2 + ", column value: " + str + "]";
    }

    private CarZone() {
        this.mRow = 0;
        this.mColumn = 0;
    }
}
