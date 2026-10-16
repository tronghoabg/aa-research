package org.apache.tika.fork;

/* loaded from: classes5.dex */
class TimeoutLimits {
    private final long parseTimeoutMS;
    private final long pulseMS;
    private final long waitTimeoutMS;

    public TimeoutLimits(long j8, long j10, long j11) {
        this.pulseMS = j8;
        this.parseTimeoutMS = j10;
        this.waitTimeoutMS = j11;
    }

    public long getParseTimeoutMS() {
        return this.parseTimeoutMS;
    }

    public long getPulseMS() {
        return this.pulseMS;
    }

    public long getWaitTimeoutMS() {
        return this.waitTimeoutMS;
    }
}
