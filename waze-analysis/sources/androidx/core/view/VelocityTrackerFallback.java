package androidx.core.view;

import android.view.MotionEvent;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
class VelocityTrackerFallback {
    private static final long ASSUME_POINTER_STOPPED_MS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final long RANGE_MS = 100;
    private final float[] mMovements = new float[20];
    private final long[] mEventTimes = new long[20];
    private float mLastComputedVelocity = 0.0f;
    private int mDataPointsBufferSize = 0;
    private int mDataPointsBufferLastUsedIndex = 0;

    VelocityTrackerFallback() {
    }

    private void clear() {
        this.mDataPointsBufferSize = 0;
        this.mLastComputedVelocity = 0.0f;
    }

    private float getCurrentVelocity() {
        int i2;
        long[] jArr;
        long j2;
        int i3;
        int i4 = this.mDataPointsBufferSize;
        if (i4 >= 2) {
            int i5 = this.mDataPointsBufferLastUsedIndex;
            long j3 = this.mEventTimes[i5];
            int i6 = (i5 + 20) - (i4 - 1);
            while (true) {
                i2 = i6 % 20;
                jArr = this.mEventTimes;
                j2 = jArr[i2];
                long j4 = j3 - j2;
                i3 = this.mDataPointsBufferSize;
                if (j4 <= RANGE_MS) {
                    break;
                }
                i6 = i2 + 1;
                this.mDataPointsBufferSize = i3 - 1;
            }
            if (i3 >= 2) {
                if (i3 != 2) {
                    float fAbs = 0.0f;
                    int i7 = 0;
                    for (int i8 = 0; i8 < this.mDataPointsBufferSize - 1; i8++) {
                        int i9 = i8 + i2;
                        long[] jArr2 = this.mEventTimes;
                        int i10 = i9 % 20;
                        int i11 = (i9 + 1) % 20;
                        if (jArr2[i11] != jArr2[i10]) {
                            i7++;
                            float fKineticEnergyToVelocity = kineticEnergyToVelocity(fAbs);
                            float f2 = this.mMovements[i11] / (this.mEventTimes[i11] - r7);
                            fAbs += (f2 - fKineticEnergyToVelocity) * Math.abs(f2);
                            if (i7 == 1) {
                                fAbs *= 0.5f;
                            }
                        }
                    }
                    return kineticEnergyToVelocity(fAbs);
                }
                int i12 = (i2 + 1) % 20;
                if (j2 != jArr[i12]) {
                    return this.mMovements[i12] / (r2 - j2);
                }
            }
        }
        return 0.0f;
    }

    private static float kineticEnergyToVelocity(float f2) {
        float fAbs = Math.abs(f2);
        return (f2 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(fAbs + fAbs));
    }

    void addMovement(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.mDataPointsBufferSize != 0 && eventTime - this.mEventTimes[this.mDataPointsBufferLastUsedIndex] > ASSUME_POINTER_STOPPED_MS) {
            clear();
        }
        int i2 = (this.mDataPointsBufferLastUsedIndex + 1) % 20;
        this.mDataPointsBufferLastUsedIndex = i2;
        int i3 = this.mDataPointsBufferSize;
        if (i3 != 20) {
            this.mDataPointsBufferSize = i3 + 1;
        }
        this.mMovements[i2] = motionEvent.getAxisValue(26);
        this.mEventTimes[this.mDataPointsBufferLastUsedIndex] = eventTime;
    }

    void computeCurrentVelocity(int i2, float f2) {
        float currentVelocity = getCurrentVelocity() * i2;
        this.mLastComputedVelocity = currentVelocity;
        if (currentVelocity < (-Math.abs(f2))) {
            this.mLastComputedVelocity = -Math.abs(f2);
        } else if (this.mLastComputedVelocity > Math.abs(f2)) {
            this.mLastComputedVelocity = Math.abs(f2);
        }
    }

    float getAxisVelocity(int i2) {
        if (i2 != 26) {
            return 0.0f;
        }
        return this.mLastComputedVelocity;
    }

    void computeCurrentVelocity(int i2) {
        computeCurrentVelocity(i2, Float.MAX_VALUE);
    }
}
