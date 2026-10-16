package androidx.car.app.hardware.common;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class CarZone {
    public static final int CAR_ZONE_COLUMN_ALL = 16;
    public static final int CAR_ZONE_COLUMN_CENTER = 48;
    public static final int CAR_ZONE_COLUMN_DRIVER = 80;
    public static final int CAR_ZONE_COLUMN_LEFT = 32;
    public static final int CAR_ZONE_COLUMN_PASSENGER = 96;
    public static final int CAR_ZONE_COLUMN_RIGHT = 64;
    public static final androidx.car.app.hardware.common.CarZone CAR_ZONE_GLOBAL = new androidx.car.app.hardware.common.CarZone(new defpackage.ry());
    public static final int CAR_ZONE_ROW_ALL = 0;
    public static final int CAR_ZONE_ROW_EXCLUDE_FIRST = 4;
    public static final int CAR_ZONE_ROW_FIRST = 1;
    public static final int CAR_ZONE_ROW_SECOND = 2;
    public static final int CAR_ZONE_ROW_THIRD = 3;
    private final int mColumn;
    private final int mRow;

    public CarZone(defpackage.ry ryVar) {
        int i = ryVar.a;
        this.mRow = 0;
        int i2 = ryVar.b;
        this.mColumn = 16;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.hardware.common.CarZone)) {
            return false;
        }
        androidx.car.app.hardware.common.CarZone carZone = (androidx.car.app.hardware.common.CarZone) obj;
        return j$.util.Objects.equals(java.lang.Integer.valueOf(this.mColumn), java.lang.Integer.valueOf(carZone.getColumn())) && j$.util.Objects.equals(java.lang.Integer.valueOf(this.mRow), java.lang.Integer.valueOf(carZone.getRow()));
    }

    public int getColumn() {
        return this.mColumn;
    }

    public int getRow() {
        return this.mRow;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.mRow), java.lang.Integer.valueOf(this.mColumn));
    }

    public java.lang.String toString() {
        java.lang.String str;
        int i = this.mRow;
        java.lang.String str2 = "UNKNOWN";
        if (i == 0) {
            str = "CAR_ZONE_ROW_ALL";
        } else if (i == 1) {
            str = "CAR_ZONE_ROW_FIRST";
        } else if (i == 2) {
            str = "CAR_ZONE_ROW_SECOND";
        } else if (i != 3) {
            str = i != 4 ? "UNKNOWN" : "CAR_ZONE_ROW_EXCLUDE_FIRST";
        } else {
            str = "CAR_ZONE_ROW_THIRD";
        }
        int i2 = this.mColumn;
        if (i2 == 16) {
            str2 = "CAR_ZONE_COLUMN_ALL";
        } else if (i2 == 32) {
            str2 = "CAR_ZONE_COLUMN_LEFT";
        } else if (i2 == 48) {
            str2 = "CAR_ZONE_COLUMN_CENTER";
        } else if (i2 == 64) {
            str2 = "CAR_ZONE_COLUMN_RIGHT";
        } else if (i2 == 80) {
            str2 = "CAR_ZONE_COLUMN_DRIVER";
        } else if (i2 == 96) {
            str2 = "CAR_ZONE_COLUMN_PASSENGER";
        }
        return defpackage.a.bB(str2, str, "[CarZone row value: ", ", column value: ", "]");
    }

    private CarZone() {
        this.mRow = 0;
        this.mColumn = 0;
    }
}
