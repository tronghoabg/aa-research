package androidx.transition;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class VelocityTracker1D {
    private static final int ASSUME_POINTER_MOVE_STOPPED_MILLIS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final int HORIZON_MILLIS = 100;
    private float[] mDataSamples = new float[20];
    private int mIndex = 0;
    private long[] mTimeSamples;

    VelocityTracker1D() {
        long[] jArr = new long[20];
        this.mTimeSamples = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private float kineticEnergyToVelocity(float f2) {
        double dSignum = Math.signum(f2);
        float fAbs = Math.abs(f2);
        return (float) (dSignum * Math.sqrt(fAbs + fAbs));
    }

    public void addDataPoint(long j2, float f2) {
        int i2 = (this.mIndex + 1) % 20;
        this.mIndex = i2;
        this.mTimeSamples[i2] = j2;
        this.mDataSamples[i2] = f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0042 A[EDGE_INSN: B:46:0x0042->B:20:0x0042 BREAK  A[LOOP:0: B:8:0x0016->B:19:0x0040], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    float calculateVelocity() {
        /*
            Method dump skipped, instructions count: 177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.VelocityTracker1D.calculateVelocity():float");
    }

    public void resetTracking() {
        this.mIndex = 0;
        Arrays.fill(this.mTimeSamples, Long.MIN_VALUE);
        Arrays.fill(this.mDataSamples, 0.0f);
    }
}
