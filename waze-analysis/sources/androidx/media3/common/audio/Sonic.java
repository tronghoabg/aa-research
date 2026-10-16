package androidx.media3.common.audio;

import androidx.camera.video.AudioStats;
import com.google.d.b.an;
import j$.util.Objects;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class Sonic {
    private static final int AMDF_FREQUENCY = 4000;
    private static final int MAXIMUM_PITCH = 400;
    private static final int MINIMUM_PITCH = 65;
    private static final float MINIMUM_SLOWDOWN_RATE = 0.99999f;
    private static final float MINIMUM_SPEEDUP_RATE = 1.00001f;
    private double accumulatedSpeedAdjustmentError;
    private final int channelCount;
    private final SonicImpl<?> impl;
    private int inputFrameCount;
    private final int inputSampleRateHz;
    private final int maxPeriod;
    private final int maxRequiredFrameCount;
    private final int minPeriod;
    private int newRatePosition;
    private int oldRatePosition;
    private int outputFrameCount;
    private final float pitch;
    private int pitchFrameCount;
    private int prevPeriod;
    private final float rate;
    private int remainingInputToCopyFrameCount;
    private final float speed;

    /* compiled from: WazeSource */
    interface SonicImpl<T> {
        int bytesPerSample();

        void copyBufferToInputBuffer(ByteBuffer byteBuffer, int i2);

        void copyOutputToByteBuffer(ByteBuffer byteBuffer, int i2);

        void downSampleInput(int i2, int i3);

        void ensureAdditionalFramesInInputBuffer(int i2);

        void ensureAdditionalFramesInOutputBuffer(int i2);

        void ensureAdditionalFramesInPitchBuffer(int i2);

        int findPitchPeriodInRangeWithDownsampleBuffer(int i2, int i3, int i4);

        int findPitchPeriodInRangeWithInputBuffer(int i2, int i3, int i4);

        void flush();

        T getInputBuffer();

        T getOutputBuffer();

        T getPitchBuffer();

        void interpolateFrame(int i2, long j2, long j3);

        boolean isPreviousPeriodBetter();

        void overlapAdd(int i2, int i3, int i4, int i5, int i6);

        void updatePreviousMinDiff();

        void zeroInputBuffer(int i2, int i3);
    }

    public Sonic(int i2, int i3, float f2, float f3, int i4, boolean z) {
        this.inputSampleRateHz = i2;
        this.channelCount = i3;
        this.speed = f2;
        this.pitch = f3;
        this.rate = i2 / i4;
        this.minPeriod = i2 / 400;
        int i5 = i2 / 65;
        this.maxPeriod = i5;
        this.maxRequiredFrameCount = i5 + i5;
        this.impl = z ? new SonicFloatImpl(this) : new SonicShortImpl(this);
    }

    private void adjustRate(float f2, int i2) {
        int i3;
        long j2;
        long j3;
        if (this.outputFrameCount == i2) {
            return;
        }
        int i4 = this.inputSampleRateHz;
        long j4 = (long) (i4 / f2);
        long j5 = i4;
        while (j4 != 0 && j5 != 0 && j4 % 2 == 0 && j5 % 2 == 0) {
            j4 /= 2;
            j5 /= 2;
        }
        moveNewSamplesToPitchBuffer(i2);
        int i5 = 0;
        while (true) {
            int i6 = this.pitchFrameCount - 1;
            if (i5 >= i6) {
                removePitchFrames(i6);
                return;
            }
            while (true) {
                i3 = this.oldRatePosition + 1;
                j2 = i3;
                long j6 = j2 * j4;
                j3 = this.newRatePosition;
                if (j6 <= j3 * j5) {
                    break;
                }
                this.impl.ensureAdditionalFramesInOutputBuffer(1);
                this.impl.interpolateFrame(i5, j5, j4);
                this.newRatePosition++;
                this.outputFrameCount++;
            }
            this.oldRatePosition = i3;
            if (j2 == j5) {
                this.oldRatePosition = 0;
                an.u(j3 == j4);
                this.newRatePosition = 0;
            }
            i5++;
        }
    }

    static long calculateAccumulatedTruncationErrorForResampling(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, 20, RoundingMode.HALF_EVEN);
        BigDecimal bigDecimalDivide2 = bigDecimal2.divide(bigDecimal3, 20, RoundingMode.HALF_EVEN);
        return bigDecimalDivide.multiply(bigDecimalDivide2.subtract(bigDecimalDivide2.setScale(0, RoundingMode.FLOOR))).setScale(0, RoundingMode.FLOOR).longValueExact();
    }

    private void changeSpeed(double d2) {
        int iSkipPitchPeriod;
        int i2 = this.inputFrameCount;
        if (i2 >= this.maxRequiredFrameCount) {
            int i3 = 0;
            do {
                if (this.remainingInputToCopyFrameCount > 0) {
                    iSkipPitchPeriod = copyInputToOutput(i3);
                } else {
                    int iFindPitchPeriod = findPitchPeriod(i3);
                    iSkipPitchPeriod = d2 > 1.0d ? iFindPitchPeriod + skipPitchPeriod(i3, d2, iFindPitchPeriod) : insertPitchPeriod(i3, d2, iFindPitchPeriod);
                }
                i3 += iSkipPitchPeriod;
            } while (this.maxRequiredFrameCount + i3 <= i2);
            removeProcessedInputFrames(i3);
        }
    }

    private int copyInputToOutput(int i2) {
        int iMin = Math.min(this.maxRequiredFrameCount, this.remainingInputToCopyFrameCount);
        copyToOutput(i2, iMin);
        this.remainingInputToCopyFrameCount -= iMin;
        return iMin;
    }

    private void copyToOutput(int i2, int i3) {
        this.impl.ensureAdditionalFramesInOutputBuffer(i3);
        SonicImpl<?> sonicImpl = this.impl;
        Object inputBuffer = sonicImpl.getInputBuffer();
        Object outputBuffer = sonicImpl.getOutputBuffer();
        int i4 = this.outputFrameCount;
        int i5 = this.channelCount;
        System.arraycopy(inputBuffer, i2 * i5, outputBuffer, i4 * i5, i3 * i5);
        this.outputFrameCount += i3;
    }

    private int findPitchPeriod(int i2) {
        int iFindPitchPeriodInRangeWithDownsampleBuffer;
        int i3 = this.inputSampleRateHz;
        int i4 = i3 > 4000 ? i3 / 4000 : 1;
        if (this.channelCount == 1 && i4 == 1) {
            iFindPitchPeriodInRangeWithDownsampleBuffer = this.impl.findPitchPeriodInRangeWithInputBuffer(i2, this.minPeriod, this.maxPeriod);
        } else {
            this.impl.downSampleInput(i2, i4);
            int iFindPitchPeriodInRangeWithDownsampleBuffer2 = this.impl.findPitchPeriodInRangeWithDownsampleBuffer(0, this.minPeriod / i4, this.maxPeriod / i4);
            if (i4 != 1) {
                int i5 = iFindPitchPeriodInRangeWithDownsampleBuffer2 * i4;
                int i6 = i4 * 4;
                int i7 = this.minPeriod;
                int i8 = this.maxPeriod;
                int i9 = this.channelCount;
                int i10 = i5 + i6;
                if (i10 <= i8) {
                    i8 = i10;
                }
                int i11 = i5 - i6;
                if (i11 >= i7) {
                    i7 = i11;
                }
                SonicImpl<?> sonicImpl = this.impl;
                if (i9 == 1) {
                    iFindPitchPeriodInRangeWithDownsampleBuffer = sonicImpl.findPitchPeriodInRangeWithInputBuffer(i2, i7, i8);
                } else {
                    sonicImpl.downSampleInput(i2, 1);
                    iFindPitchPeriodInRangeWithDownsampleBuffer = this.impl.findPitchPeriodInRangeWithDownsampleBuffer(0, i7, i8);
                }
            } else {
                iFindPitchPeriodInRangeWithDownsampleBuffer = iFindPitchPeriodInRangeWithDownsampleBuffer2;
            }
        }
        int i12 = this.impl.isPreviousPeriodBetter() ? this.prevPeriod : iFindPitchPeriodInRangeWithDownsampleBuffer;
        this.impl.updatePreviousMinDiff();
        this.prevPeriod = iFindPitchPeriodInRangeWithDownsampleBuffer;
        return i12;
    }

    public static long getExpectedFrameCountAfterProcessorApplied(int i2, int i3, float f2, float f3, long j2) {
        float f4 = (i2 / i3) * f3;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f4));
        double d2 = f2 / f3;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2);
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            bigDecimalValueOf = bigDecimalValueOf.divide(BigDecimal.valueOf(d2), RoundingMode.HALF_EVEN);
        }
        return f4 == 1.0f ? bigDecimalValueOf.longValueExact() : bigDecimalValueOf.divide(bigDecimal, RoundingMode.HALF_EVEN).longValueExact() - calculateAccumulatedTruncationErrorForResampling(bigDecimalValueOf, BigDecimal.valueOf(i2), bigDecimal);
    }

    static long getExpectedInputFrameCountForOutputFrameCount(int i2, int i3, float f2, float f3, long j2) {
        long frameCountBeforeResamplingForOutputCount = getFrameCountBeforeResamplingForOutputCount(BigDecimal.valueOf(i2), new BigDecimal(String.valueOf((i2 / i3) * f3)), BigDecimal.valueOf(j2));
        double d2 = f2 / f3;
        return (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) ? BigDecimal.valueOf(frameCountBeforeResamplingForOutputCount).multiply(BigDecimal.valueOf(d2)).setScale(0, RoundingMode.FLOOR).longValueExact() : frameCountBeforeResamplingForOutputCount;
    }

    private static long getFrameCountBeforeResamplingForOutputCount(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        return bigDecimal.multiply(bigDecimal3).divide(bigDecimal.divide(bigDecimal2, 0, RoundingMode.FLOOR), 0, RoundingMode.FLOOR).longValueExact();
    }

    private int insertPitchPeriod(int i2, double d2, int i3) {
        int i4;
        double d3 = i3;
        double d4 = 1.0d - d2;
        double d5 = this.accumulatedSpeedAdjustmentError;
        if (d2 < 0.5d) {
            double d6 = ((d3 * d2) / d4) + d5;
            int iRound = (int) Math.round(d6);
            this.accumulatedSpeedAdjustmentError = d6 - iRound;
            i4 = iRound;
        } else {
            double d7 = ((d3 * ((d2 + d2) - 1.0d)) / d4) + d5;
            int iRound2 = (int) Math.round(d7);
            this.remainingInputToCopyFrameCount = iRound2;
            this.accumulatedSpeedAdjustmentError = d7 - iRound2;
            i4 = i3;
        }
        int i5 = i3 + i4;
        this.impl.ensureAdditionalFramesInOutputBuffer(i5);
        SonicImpl<?> sonicImpl = this.impl;
        int i6 = this.channelCount * i2;
        Object inputBuffer = sonicImpl.getInputBuffer();
        Object outputBuffer = sonicImpl.getOutputBuffer();
        int i7 = this.outputFrameCount;
        int i8 = this.channelCount;
        System.arraycopy(inputBuffer, i6, outputBuffer, i7 * i8, i8 * i3);
        this.impl.overlapAdd(i4, this.channelCount, this.outputFrameCount + i3, i2 + i3, i2);
        this.outputFrameCount += i5;
        return i4;
    }

    private void moveNewSamplesToPitchBuffer(int i2) {
        int i3 = this.outputFrameCount - i2;
        this.impl.ensureAdditionalFramesInPitchBuffer(i3);
        SonicImpl<?> sonicImpl = this.impl;
        Object outputBuffer = sonicImpl.getOutputBuffer();
        Object pitchBuffer = sonicImpl.getPitchBuffer();
        int i4 = this.pitchFrameCount;
        int i5 = this.channelCount;
        System.arraycopy(outputBuffer, i5 * i2, pitchBuffer, i4 * i5, i3 * i5);
        this.outputFrameCount = i2;
        this.pitchFrameCount += i3;
    }

    private void processStreamInput() {
        double d2 = this.speed / this.pitch;
        int i2 = this.outputFrameCount;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            changeSpeed(d2);
        } else {
            copyToOutput(0, this.inputFrameCount);
            this.inputFrameCount = 0;
        }
        float f2 = this.rate * this.pitch;
        if (f2 != 1.0f) {
            adjustRate(f2, i2);
        }
    }

    private void removePitchFrames(int i2) {
        if (i2 == 0) {
            return;
        }
        SonicImpl<?> sonicImpl = this.impl;
        System.arraycopy(sonicImpl.getPitchBuffer(), this.channelCount * i2, sonicImpl.getPitchBuffer(), 0, (this.pitchFrameCount - i2) * this.channelCount);
        this.pitchFrameCount -= i2;
    }

    private void removeProcessedInputFrames(int i2) {
        int i3 = this.inputFrameCount - i2;
        SonicImpl<?> sonicImpl = this.impl;
        Object inputBuffer = sonicImpl.getInputBuffer();
        int i4 = this.channelCount;
        System.arraycopy(inputBuffer, i2 * i4, sonicImpl.getInputBuffer(), 0, i3 * i4);
        this.inputFrameCount = i3;
    }

    private int skipPitchPeriod(int i2, double d2, int i3) {
        int i4;
        double d3 = i3;
        double d4 = (-1.0d) + d2;
        double d5 = this.accumulatedSpeedAdjustmentError;
        if (d2 >= 2.0d) {
            double d6 = (d3 / d4) + d5;
            int iRound = (int) Math.round(d6);
            this.accumulatedSpeedAdjustmentError = d6 - iRound;
            i4 = iRound;
        } else {
            double d7 = ((d3 * (2.0d - d2)) / d4) + d5;
            int iRound2 = (int) Math.round(d7);
            this.remainingInputToCopyFrameCount = iRound2;
            this.accumulatedSpeedAdjustmentError = d7 - iRound2;
            i4 = i3;
        }
        this.impl.ensureAdditionalFramesInOutputBuffer(i4);
        this.impl.overlapAdd(i4, this.channelCount, this.outputFrameCount, i2, i2 + i3);
        this.outputFrameCount += i4;
        return i4;
    }

    public void flush() {
        this.inputFrameCount = 0;
        this.outputFrameCount = 0;
        this.pitchFrameCount = 0;
        this.oldRatePosition = 0;
        this.newRatePosition = 0;
        this.remainingInputToCopyFrameCount = 0;
        this.prevPeriod = 0;
        this.accumulatedSpeedAdjustmentError = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.impl.flush();
    }

    public void getOutput(ByteBuffer byteBuffer) {
        an.u(this.outputFrameCount >= 0);
        int iMin = Math.min(byteBuffer.remaining() / (this.channelCount * this.impl.bytesPerSample()), this.outputFrameCount);
        this.impl.copyOutputToByteBuffer(byteBuffer, iMin);
        this.outputFrameCount -= iMin;
        int i2 = this.channelCount;
        SonicImpl<?> sonicImpl = this.impl;
        System.arraycopy(sonicImpl.getOutputBuffer(), iMin * i2, sonicImpl.getOutputBuffer(), 0, this.outputFrameCount * i2);
    }

    public int getOutputSize() {
        an.u(this.outputFrameCount >= 0);
        return this.outputFrameCount * this.channelCount * this.impl.bytesPerSample();
    }

    public int getPendingInputBytes() {
        return this.inputFrameCount * this.channelCount * this.impl.bytesPerSample();
    }

    public void queueEndOfStream() {
        int i2 = this.inputFrameCount;
        int i3 = this.remainingInputToCopyFrameCount;
        int i4 = this.outputFrameCount;
        float f2 = this.speed;
        float f3 = this.pitch;
        int i5 = i4 + ((int) (((((((i2 - i3) / (f2 / f3)) + i3) + this.accumulatedSpeedAdjustmentError) + this.pitchFrameCount) / (this.rate * f3)) + 0.5d));
        this.accumulatedSpeedAdjustmentError = AudioStats.AUDIO_AMPLITUDE_NONE;
        int i6 = this.maxRequiredFrameCount;
        this.impl.ensureAdditionalFramesInInputBuffer(i6 + i6 + i2);
        int i7 = i2 * this.channelCount;
        int i8 = this.maxRequiredFrameCount;
        this.impl.zeroInputBuffer(i7, i8 + i8);
        int i9 = this.maxRequiredFrameCount;
        this.inputFrameCount += i9 + i9;
        processStreamInput();
        if (this.outputFrameCount > i5) {
            this.outputFrameCount = Math.max(i5, 0);
        }
        this.inputFrameCount = 0;
        this.remainingInputToCopyFrameCount = 0;
        this.pitchFrameCount = 0;
    }

    public void queueInput(ByteBuffer byteBuffer) {
        SonicImpl<?> sonicImpl = this.impl;
        int iRemaining = byteBuffer.remaining();
        int iBytesPerSample = iRemaining / (this.channelCount * sonicImpl.bytesPerSample());
        this.impl.ensureAdditionalFramesInInputBuffer(iBytesPerSample);
        this.impl.copyBufferToInputBuffer(byteBuffer, iRemaining);
        this.inputFrameCount += iBytesPerSample;
        processStreamInput();
    }

    /* compiled from: WazeSource */
    final class SonicFloatImpl implements SonicImpl<float[]> {
        private final float[] downSampleBuffer;
        private float[] inputBuffer;
        private double maxDiff;
        private double minDiff;
        private float[] outputBuffer;
        private float[] pitchBuffer;
        private double prevMinDiff;
        final /* synthetic */ Sonic this$0;

        SonicFloatImpl(Sonic sonic) {
            Objects.requireNonNull(sonic);
            this.this$0 = sonic;
            this.downSampleBuffer = new float[sonic.maxRequiredFrameCount];
            this.inputBuffer = new float[sonic.maxRequiredFrameCount * sonic.channelCount];
            this.outputBuffer = new float[sonic.maxRequiredFrameCount * sonic.channelCount];
            this.pitchBuffer = new float[sonic.maxRequiredFrameCount * sonic.channelCount];
        }

        private float[] ensureSpaceForAdditionalFrames(float[] fArr, int i2, int i3) {
            int length = fArr.length / this.this$0.channelCount;
            return i2 + i3 <= length ? fArr : Arrays.copyOf(fArr, (((length * 3) / 2) + i3) * this.this$0.channelCount);
        }

        private int findPitchPeriodInRange(float[] fArr, int i2, int i3, int i4) {
            int i5 = this.this$0.channelCount * i2;
            int i6 = 255;
            int i7 = 0;
            double d2 = AudioStats.AUDIO_AMPLITUDE_NONE;
            double d3 = 1.0d;
            int i8 = i3;
            while (true) {
                double d4 = i6;
                double d5 = i7;
                if (i8 > i4) {
                    this.minDiff = d3 / d5;
                    this.maxDiff = d2 / d4;
                    return i7;
                }
                int i9 = 0;
                double dAbs = AudioStats.AUDIO_AMPLITUDE_NONE;
                while (i9 < i8) {
                    dAbs += Math.abs(fArr[i5 + i9] - fArr[(i5 + i8) + i9]);
                    i9++;
                    i5 = i5;
                }
                int i10 = i5;
                double d6 = d5 * dAbs;
                double d7 = i8;
                double d8 = d3 * d7;
                if (d6 < d8) {
                    d3 = dAbs;
                }
                if (d6 < d8) {
                    i7 = i8;
                }
                double d9 = d4 * dAbs;
                double d10 = d7 * d2;
                if (d9 > d10) {
                    d2 = dAbs;
                }
                if (d9 > d10) {
                    i6 = i8;
                }
                i8++;
                i5 = i10;
            }
        }

        private float interpolate(float[] fArr, int i2, long j2, long j3) {
            Sonic sonic = this.this$0;
            float f2 = fArr[i2];
            int i3 = i2 + sonic.channelCount;
            Sonic sonic2 = this.this$0;
            float f3 = fArr[i3];
            long j4 = sonic2.newRatePosition;
            long j5 = (this.this$0.oldRatePosition + 1) * j3;
            long j6 = j5 - (j4 * j2);
            return ((j6 * f2) + ((r6 - j6) * f3)) / (j5 - (this.this$0.oldRatePosition * j3));
        }

        private void overlapAdd(int i2, int i3, float[] fArr, int i4, float[] fArr2, int i5, float[] fArr3, int i6) {
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = (i5 * i3) + i7;
                int i9 = (i6 * i3) + i7;
                int i10 = (i4 * i3) + i7;
                for (int i11 = 0; i11 < i2; i11++) {
                    fArr[i10] = ((fArr2[i8] * (i2 - i11)) + (fArr3[i9] * i11)) / i2;
                    i10 += i3;
                    i8 += i3;
                    i9 += i3;
                }
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int bytesPerSample() {
            return 4;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void copyBufferToInputBuffer(ByteBuffer byteBuffer, int i2) {
            Sonic sonic = this.this$0;
            byteBuffer.asFloatBuffer().get(this.inputBuffer, sonic.inputFrameCount * sonic.channelCount, i2 / 4);
            byteBuffer.position(byteBuffer.position() + i2);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void copyOutputToByteBuffer(ByteBuffer byteBuffer, int i2) {
            byteBuffer.asFloatBuffer().put(this.outputBuffer, 0, this.this$0.channelCount * i2);
            byteBuffer.position(byteBuffer.position() + (i2 * 4 * this.this$0.channelCount));
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void downSampleInput(int i2, int i3) {
            int i4 = this.this$0.maxRequiredFrameCount / i3;
            int i5 = this.this$0.channelCount * i3;
            int i6 = i2 * this.this$0.channelCount;
            for (int i7 = 0; i7 < i4; i7++) {
                double d2 = AudioStats.AUDIO_AMPLITUDE_NONE;
                for (int i8 = 0; i8 < i5; i8++) {
                    d2 += this.inputBuffer[(i7 * i5) + i6 + i8];
                }
                this.downSampleBuffer[i7] = (float) (d2 / i5);
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInInputBuffer(int i2) {
            this.inputBuffer = ensureSpaceForAdditionalFrames(this.inputBuffer, this.this$0.inputFrameCount, i2);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInOutputBuffer(int i2) {
            this.outputBuffer = ensureSpaceForAdditionalFrames(this.outputBuffer, this.this$0.outputFrameCount, i2);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInPitchBuffer(int i2) {
            this.pitchBuffer = ensureSpaceForAdditionalFrames(this.pitchBuffer, this.this$0.pitchFrameCount, i2);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int findPitchPeriodInRangeWithDownsampleBuffer(int i2, int i3, int i4) {
            return findPitchPeriodInRange(this.downSampleBuffer, i2, i3, i4);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int findPitchPeriodInRangeWithInputBuffer(int i2, int i3, int i4) {
            return findPitchPeriodInRange(this.inputBuffer, i2, i3, i4);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void flush() {
            this.prevMinDiff = AudioStats.AUDIO_AMPLITUDE_NONE;
            this.minDiff = AudioStats.AUDIO_AMPLITUDE_NONE;
            this.maxDiff = AudioStats.AUDIO_AMPLITUDE_NONE;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void interpolateFrame(int i2, long j2, long j3) {
            for (int i3 = 0; i3 < this.this$0.channelCount; i3++) {
                float[] fArr = this.outputBuffer;
                Sonic sonic = this.this$0;
                fArr[(sonic.outputFrameCount * sonic.channelCount) + i3] = interpolate(this.pitchBuffer, (this.this$0.channelCount * i2) + i3, j2, j3);
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public boolean isPreviousPeriodBetter() {
            if (this.minDiff == AudioStats.AUDIO_AMPLITUDE_NONE || this.this$0.prevPeriod == 0) {
                return false;
            }
            double d2 = this.maxDiff;
            double d3 = this.minDiff;
            return d2 <= d3 * 3.0d && d3 + d3 > this.prevMinDiff * 3.0d;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void updatePreviousMinDiff() {
            this.prevMinDiff = this.minDiff;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void zeroInputBuffer(int i2, int i3) {
            for (int i4 = 0; i4 < this.this$0.channelCount * i3; i4++) {
                this.inputBuffer[i2 + i4] = 0.0f;
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public float[] getInputBuffer() {
            return this.inputBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public float[] getOutputBuffer() {
            return this.outputBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public float[] getPitchBuffer() {
            return this.pitchBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void overlapAdd(int i2, int i3, int i4, int i5, int i6) {
            float[] fArr = this.outputBuffer;
            float[] fArr2 = this.inputBuffer;
            overlapAdd(i2, i3, fArr, i4, fArr2, i5, fArr2, i6);
        }
    }

    /* compiled from: WazeSource */
    final class SonicShortImpl implements SonicImpl<short[]> {
        private final short[] downSampleBuffer;
        private short[] inputBuffer;
        private int maxDiff;
        private int minDiff;
        private short[] outputBuffer;
        private short[] pitchBuffer;
        private int prevMinDiff;
        final /* synthetic */ Sonic this$0;

        SonicShortImpl(Sonic sonic) {
            Objects.requireNonNull(sonic);
            this.this$0 = sonic;
            this.downSampleBuffer = new short[sonic.maxRequiredFrameCount];
            this.inputBuffer = new short[sonic.maxRequiredFrameCount * sonic.channelCount];
            this.outputBuffer = new short[sonic.maxRequiredFrameCount * sonic.channelCount];
            this.pitchBuffer = new short[sonic.maxRequiredFrameCount * sonic.channelCount];
        }

        private short[] ensureSpaceForAdditionalFrames(short[] sArr, int i2, int i3) {
            int length = sArr.length / this.this$0.channelCount;
            return i2 + i3 <= length ? sArr : Arrays.copyOf(sArr, (((length * 3) / 2) + i3) * this.this$0.channelCount);
        }

        private int findPitchPeriodInRange(short[] sArr, int i2, int i3, int i4) {
            int i5 = i2 * this.this$0.channelCount;
            int i6 = 1;
            int i7 = 255;
            int i8 = 0;
            int i9 = 0;
            while (i3 <= i4) {
                int iAbs = 0;
                for (int i10 = 0; i10 < i3; i10++) {
                    iAbs += Math.abs(sArr[i5 + i10] - sArr[(i5 + i3) + i10]);
                }
                int i11 = iAbs * i8;
                int i12 = i6 * i3;
                if (i11 < i12) {
                    i6 = iAbs;
                }
                if (i11 < i12) {
                    i8 = i3;
                }
                int i13 = iAbs * i7;
                int i14 = i9 * i3;
                if (i13 > i14) {
                    i9 = iAbs;
                }
                if (i13 > i14) {
                    i7 = i3;
                }
                i3++;
            }
            this.minDiff = i6 / i8;
            this.maxDiff = i9 / i7;
            return i8;
        }

        private short interpolate(short[] sArr, int i2, long j2, long j3) {
            Sonic sonic = this.this$0;
            short s = sArr[i2];
            int i3 = i2 + sonic.channelCount;
            Sonic sonic2 = this.this$0;
            short s2 = sArr[i3];
            long j4 = sonic2.newRatePosition;
            long j5 = (this.this$0.oldRatePosition + 1) * j3;
            long j6 = j5 - (this.this$0.oldRatePosition * j3);
            long j7 = j5 - (j4 * j2);
            return (short) (((j7 * s) + ((j6 - j7) * s2)) / j6);
        }

        private void overlapAdd(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = (i5 * i3) + i7;
                int i9 = (i6 * i3) + i7;
                int i10 = (i4 * i3) + i7;
                for (int i11 = 0; i11 < i2; i11++) {
                    sArr[i10] = (short) (((sArr2[i8] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                    i10 += i3;
                    i8 += i3;
                    i9 += i3;
                }
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int bytesPerSample() {
            return 2;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void copyBufferToInputBuffer(ByteBuffer byteBuffer, int i2) {
            Sonic sonic = this.this$0;
            byteBuffer.asShortBuffer().get(this.inputBuffer, sonic.inputFrameCount * sonic.channelCount, i2 / 2);
            byteBuffer.position(byteBuffer.position() + i2);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void copyOutputToByteBuffer(ByteBuffer byteBuffer, int i2) {
            byteBuffer.asShortBuffer().put(this.outputBuffer, 0, this.this$0.channelCount * i2);
            byteBuffer.position(byteBuffer.position() + ((i2 + i2) * this.this$0.channelCount));
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void downSampleInput(int i2, int i3) {
            Sonic sonic = this.this$0;
            short[] sArr = this.inputBuffer;
            int i4 = sonic.maxRequiredFrameCount / i3;
            int i5 = this.this$0.channelCount * i3;
            int i6 = i2 * this.this$0.channelCount;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = 0;
                for (int i9 = 0; i9 < i5; i9++) {
                    i8 += sArr[(i7 * i5) + i6 + i9];
                }
                this.downSampleBuffer[i7] = (short) (i8 / i5);
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInInputBuffer(int i2) {
            this.inputBuffer = ensureSpaceForAdditionalFrames(this.inputBuffer, this.this$0.inputFrameCount, i2);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInOutputBuffer(int i2) {
            this.outputBuffer = ensureSpaceForAdditionalFrames(this.outputBuffer, this.this$0.outputFrameCount, i2);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInPitchBuffer(int i2) {
            this.pitchBuffer = ensureSpaceForAdditionalFrames(this.pitchBuffer, this.this$0.pitchFrameCount, i2);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int findPitchPeriodInRangeWithDownsampleBuffer(int i2, int i3, int i4) {
            return findPitchPeriodInRange(this.downSampleBuffer, i2, i3, i4);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int findPitchPeriodInRangeWithInputBuffer(int i2, int i3, int i4) {
            return findPitchPeriodInRange(this.inputBuffer, i2, i3, i4);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void flush() {
            this.prevMinDiff = 0;
            this.minDiff = 0;
            this.maxDiff = 0;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void interpolateFrame(int i2, long j2, long j3) {
            for (int i3 = 0; i3 < this.this$0.channelCount; i3++) {
                short[] sArr = this.outputBuffer;
                Sonic sonic = this.this$0;
                sArr[(sonic.outputFrameCount * sonic.channelCount) + i3] = interpolate(this.pitchBuffer, (this.this$0.channelCount * i2) + i3, j2, j3);
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public boolean isPreviousPeriodBetter() {
            if (this.minDiff == 0 || this.this$0.prevPeriod == 0) {
                return false;
            }
            int i2 = this.maxDiff;
            int i3 = this.minDiff;
            return i2 <= i3 * 3 && i3 + i3 > this.prevMinDiff * 3;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void updatePreviousMinDiff() {
            this.prevMinDiff = this.minDiff;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void zeroInputBuffer(int i2, int i3) {
            for (int i4 = 0; i4 < this.this$0.channelCount * i3; i4++) {
                this.inputBuffer[i2 + i4] = 0;
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public short[] getInputBuffer() {
            return this.inputBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public short[] getOutputBuffer() {
            return this.outputBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public short[] getPitchBuffer() {
            return this.pitchBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void overlapAdd(int i2, int i3, int i4, int i5, int i6) {
            short[] sArr = this.outputBuffer;
            short[] sArr2 = this.inputBuffer;
            overlapAdd(i2, i3, sArr, i4, sArr2, i5, sArr2, i6);
        }
    }
}
