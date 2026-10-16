package androidx.compose.foundation.lazy.layout;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Averages {
    public static final int $stable = 8;
    private long applyTimeNanos;
    private long compositionTimeNanos;
    private long measureTimeNanos;
    private int nestedPrefetchCount = -1;
    private long pauseTimeNanos;
    private long resumeTimeNanos;

    private final int calculateAverageCount(int i2, int i3) {
        return i3 == -1 ? i2 : ((i3 * 3) + i2) / 4;
    }

    private final long calculateAverageTime(long j2, long j3) {
        return j3 == 0 ? j2 : ((j3 / 4) * 3) + (j2 / 4);
    }

    public final void clearMeasureTime() {
        this.measureTimeNanos = 0L;
    }

    public final long getApplyTimeNanos() {
        return this.applyTimeNanos;
    }

    public final long getCompositionTimeNanos() {
        return this.compositionTimeNanos;
    }

    public final long getMeasureTimeNanos() {
        return this.measureTimeNanos;
    }

    public final int getNestedPrefetchCount() {
        return this.nestedPrefetchCount;
    }

    public final long getPauseTimeNanos() {
        return this.pauseTimeNanos;
    }

    public final long getResumeTimeNanos() {
        return this.resumeTimeNanos;
    }

    public final void saveApplyTimeNanos(long j2) {
        this.applyTimeNanos = calculateAverageTime(j2, this.applyTimeNanos);
    }

    public final void saveCompositionTimeNanos(long j2) {
        this.compositionTimeNanos = calculateAverageTime(j2, this.compositionTimeNanos);
    }

    public final void saveMeasureTimeNanos(long j2) {
        this.measureTimeNanos = calculateAverageTime(j2, this.measureTimeNanos);
    }

    public final void saveNestedPrefetchCount(int i2) {
        this.nestedPrefetchCount = calculateAverageCount(i2, this.nestedPrefetchCount);
    }

    public final void savePauseTimeNanos(long j2) {
        this.pauseTimeNanos = calculateAverageTime(j2, this.pauseTimeNanos);
    }

    public final void saveResumeTimeNanos(long j2) {
        this.resumeTimeNanos = calculateAverageTime(j2, this.resumeTimeNanos);
    }

    public final void setApplyTimeNanos(long j2) {
        this.applyTimeNanos = j2;
    }

    public final void setCompositionTimeNanos(long j2) {
        this.compositionTimeNanos = j2;
    }

    public final void setMeasureTimeNanos(long j2) {
        this.measureTimeNanos = j2;
    }

    public final void setNestedPrefetchCount(int i2) {
        this.nestedPrefetchCount = i2;
    }

    public final void setPauseTimeNanos(long j2) {
        this.pauseTimeNanos = j2;
    }

    public final void setResumeTimeNanos(long j2) {
        this.resumeTimeNanos = j2;
    }
}
