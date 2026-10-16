package androidx.car.app.hardware.common;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class CarValue<T> {
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_UNAVAILABLE = 3;
    public static final int STATUS_UNIMPLEMENTED = 2;
    public static final int STATUS_UNKNOWN = 0;
    private final java.util.List<androidx.car.app.hardware.common.CarZone> mCarZones;
    private final int mStatus;
    private final long mTimestampMillis;
    private final T mValue;
    public static final androidx.car.app.hardware.common.CarValue<java.lang.Integer> UNIMPLEMENTED_INTEGER = unimplemented();
    public static final androidx.car.app.hardware.common.CarValue<java.lang.Integer> UNKNOWN_INTEGER = unknown();
    public static final androidx.car.app.hardware.common.CarValue<java.lang.Boolean> UNKNOWN_BOOLEAN = unknown();
    public static final androidx.car.app.hardware.common.CarValue<java.lang.Float> UNKNOWN_FLOAT = unknown();
    public static final androidx.car.app.hardware.common.CarValue<java.lang.String> UNKNOWN_STRING = unknown();
    public static final androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Float>> UNIMPLEMENTED_FLOAT_LIST = unimplemented();
    public static final androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Float>> UNKNOWN_FLOAT_LIST = unknown();
    public static final androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Integer>> UNKNOWN_INTEGER_LIST = unknown();
    public static final androidx.car.app.hardware.common.CarValue<java.lang.Integer[]> UNKNOWN_INTEGER_ARRAY = unknown();

    private CarValue() {
        this.mValue = null;
        this.mTimestampMillis = 0L;
        this.mStatus = 0;
        this.mCarZones = java.util.Collections.EMPTY_LIST;
    }

    private static <T> androidx.car.app.hardware.common.CarValue<T> unimplemented() {
        return new androidx.car.app.hardware.common.CarValue<>(null, 0L, 2);
    }

    private static <T> androidx.car.app.hardware.common.CarValue<T> unknown() {
        return new androidx.car.app.hardware.common.CarValue<>(null, 0L, 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.hardware.common.CarValue)) {
            return false;
        }
        androidx.car.app.hardware.common.CarValue carValue = (androidx.car.app.hardware.common.CarValue) obj;
        return j$.util.Objects.equals(this.mValue, carValue.mValue) && this.mTimestampMillis == carValue.mTimestampMillis && this.mStatus == carValue.mStatus && j$.util.Objects.equals(this.mCarZones, carValue.mCarZones);
    }

    public java.util.List<androidx.car.app.hardware.common.CarZone> getCarZones() {
        return this.mStatus == 2 ? java.util.Collections.EMPTY_LIST : this.mCarZones;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public long getTimestampMillis() {
        return this.mTimestampMillis;
    }

    public T getValue() {
        return this.mValue;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mValue, java.lang.Long.valueOf(this.mTimestampMillis), java.lang.Integer.valueOf(this.mStatus), this.mCarZones);
    }

    public java.lang.String toString() {
        return "[value: " + this.mValue + ", timestamp: " + this.mTimestampMillis + ", Status: " + this.mStatus + ", CarZones: " + this.mCarZones + "]";
    }

    public CarValue(T t, long j, int i, java.util.List<androidx.car.app.hardware.common.CarZone> list) {
        this.mValue = t;
        this.mTimestampMillis = j;
        this.mStatus = i;
        this.mCarZones = list;
    }

    public CarValue(T t, long j, int i) {
        this.mValue = t;
        this.mTimestampMillis = j;
        this.mStatus = i;
        this.mCarZones = java.util.Collections.singletonList(androidx.car.app.hardware.common.CarZone.CAR_ZONE_GLOBAL);
    }
}
