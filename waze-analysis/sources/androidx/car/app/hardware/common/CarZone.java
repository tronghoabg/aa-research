package androidx.car.app.hardware.common;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes2.dex */
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

    /* compiled from: WazeSource */
    public final class Builder {
        int mRow = 0;
        int mColumn = 16;

        public CarZone build() {
            return new CarZone(this);
        }

        public Builder setColumn(int i2) {
            this.mColumn = i2;
            return this;
        }

        public Builder setRow(int i2) {
            this.mRow = i2;
            return this;
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CarZoneColumn {
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CarZoneRow {
    }

    CarZone(Builder builder) {
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
        return Objects.equals(Integer.valueOf(this.mColumn), Integer.valueOf(carZone.getColumn())) && Objects.equals(Integer.valueOf(this.mRow), Integer.valueOf(carZone.getRow()));
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
        int i2 = this.mRow;
        String str = "UNKNOWN";
        String str2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "UNKNOWN" : "CAR_ZONE_ROW_EXCLUDE_FIRST" : "CAR_ZONE_ROW_THIRD" : "CAR_ZONE_ROW_SECOND" : "CAR_ZONE_ROW_FIRST" : "CAR_ZONE_ROW_ALL";
        int i3 = this.mColumn;
        if (i3 == 16) {
            str = "CAR_ZONE_COLUMN_ALL";
        } else if (i3 == 32) {
            str = "CAR_ZONE_COLUMN_LEFT";
        } else if (i3 == 48) {
            str = "CAR_ZONE_COLUMN_CENTER";
        } else if (i3 == 64) {
            str = "CAR_ZONE_COLUMN_RIGHT";
        } else if (i3 == 80) {
            str = "CAR_ZONE_COLUMN_DRIVER";
        } else if (i3 == 96) {
            str = "CAR_ZONE_COLUMN_PASSENGER";
        }
        return "[CarZone row value: " + str2 + ", column value: " + str + "]";
    }

    private CarZone() {
        this.mRow = 0;
        this.mColumn = 0;
    }
}
