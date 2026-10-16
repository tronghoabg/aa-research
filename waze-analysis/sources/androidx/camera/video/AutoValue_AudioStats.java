package androidx.camera.video;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class AutoValue_AudioStats extends AudioStats {
    private final double audioAmplitudeInternal;
    private final long audioBytesRecorded;
    private final int audioState;
    private final Throwable errorCause;

    AutoValue_AudioStats(int i2, double d2, long j2, Throwable th) {
        this.audioState = i2;
        this.audioAmplitudeInternal = d2;
        this.audioBytesRecorded = j2;
        this.errorCause = th;
    }

    public boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioStats) {
            AudioStats audioStats = (AudioStats) obj;
            if (this.audioState == audioStats.getAudioState() && Double.doubleToLongBits(this.audioAmplitudeInternal) == Double.doubleToLongBits(audioStats.getAudioAmplitudeInternal()) && this.audioBytesRecorded == audioStats.getAudioBytesRecorded() && ((th = this.errorCause) != null ? th.equals(audioStats.getErrorCause()) : audioStats.getErrorCause() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.AudioStats
    double getAudioAmplitudeInternal() {
        return this.audioAmplitudeInternal;
    }

    @Override // androidx.camera.video.AudioStats
    public long getAudioBytesRecorded() {
        return this.audioBytesRecorded;
    }

    @Override // androidx.camera.video.AudioStats
    public int getAudioState() {
        return this.audioState;
    }

    @Override // androidx.camera.video.AudioStats
    public Throwable getErrorCause() {
        return this.errorCause;
    }

    public int hashCode() {
        long jDoubleToLongBits = (Double.doubleToLongBits(this.audioAmplitudeInternal) >>> 32) ^ Double.doubleToLongBits(this.audioAmplitudeInternal);
        Throwable th = this.errorCause;
        int iHashCode = th == null ? 0 : th.hashCode();
        int i2 = this.audioState;
        long j2 = this.audioBytesRecorded;
        return ((((((int) jDoubleToLongBits) ^ ((i2 ^ 1000003) * 1000003)) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ iHashCode;
    }

    public String toString() {
        return "AudioStats{audioState=" + this.audioState + ", audioAmplitudeInternal=" + this.audioAmplitudeInternal + ", audioBytesRecorded=" + this.audioBytesRecorded + ", errorCause=" + this.errorCause + "}";
    }
}
