package androidx.camera.video.internal.config;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CaptureEncodeRates {
    private final int captureRate;
    private final int encodeRate;

    public CaptureEncodeRates(int i2, int i3) {
        this.captureRate = i2;
        this.encodeRate = i3;
    }

    public static /* synthetic */ CaptureEncodeRates copy$default(CaptureEncodeRates captureEncodeRates, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = captureEncodeRates.captureRate;
        }
        if ((i4 & 2) != 0) {
            i3 = captureEncodeRates.encodeRate;
        }
        return captureEncodeRates.copy(i2, i3);
    }

    public final int component1() {
        return this.captureRate;
    }

    public final int component2() {
        return this.encodeRate;
    }

    public final CaptureEncodeRates copy(int i2, int i3) {
        return new CaptureEncodeRates(i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptureEncodeRates)) {
            return false;
        }
        CaptureEncodeRates captureEncodeRates = (CaptureEncodeRates) obj;
        return this.captureRate == captureEncodeRates.captureRate && this.encodeRate == captureEncodeRates.encodeRate;
    }

    public final int getCaptureRate() {
        return this.captureRate;
    }

    public final int getEncodeRate() {
        return this.encodeRate;
    }

    public int hashCode() {
        return (this.captureRate * 31) + this.encodeRate;
    }

    public String toString() {
        return "CaptureEncodeRates(captureRate=" + this.captureRate + ", encodeRate=" + this.encodeRate + ")";
    }
}
