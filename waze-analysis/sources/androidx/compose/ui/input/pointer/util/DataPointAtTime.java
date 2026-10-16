package androidx.compose.ui.input.pointer.util;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DataPointAtTime {
    public static final int $stable = 8;
    private float dataPoint;
    private long time;

    public DataPointAtTime(long j2, float f2) {
        this.time = j2;
        this.dataPoint = f2;
    }

    public static /* synthetic */ DataPointAtTime copy$default(DataPointAtTime dataPointAtTime, long j2, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = dataPointAtTime.time;
        }
        if ((i2 & 2) != 0) {
            f2 = dataPointAtTime.dataPoint;
        }
        return dataPointAtTime.copy(j2, f2);
    }

    public final long component1() {
        return this.time;
    }

    public final float component2() {
        return this.dataPoint;
    }

    public final DataPointAtTime copy(long j2, float f2) {
        return new DataPointAtTime(j2, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPointAtTime)) {
            return false;
        }
        DataPointAtTime dataPointAtTime = (DataPointAtTime) obj;
        return this.time == dataPointAtTime.time && Float.compare(this.dataPoint, dataPointAtTime.dataPoint) == 0;
    }

    public final float getDataPoint() {
        return this.dataPoint;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (DataPointAtTime$$ExternalSyntheticBackport0.m(this.time) * 31) + Float.floatToIntBits(this.dataPoint);
    }

    public final void setDataPoint(float f2) {
        this.dataPoint = f2;
    }

    public final void setTime(long j2) {
        this.time = j2;
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.time + ", dataPoint=" + this.dataPoint + ')';
    }
}
