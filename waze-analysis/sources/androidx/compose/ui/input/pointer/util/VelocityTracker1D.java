package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.internal.InlineClassHelperKt;
import h.a.c;
import h.d.a;
import h.d.b;
import h.g.b.o;
import h.i;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VelocityTracker1D {
    public static final int $stable = 8;
    private int index;
    private final boolean isDataDifferential;
    private final int minSampleSize;
    private final float[] reusableDataPointsArray;
    private final float[] reusableTimeArray;
    private final float[] reusableVelocityCoefficients;
    private final DataPointAtTime[] samples;
    private final Strategy strategy;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class Strategy {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Strategy[] $VALUES;
        public static final Strategy Lsq2 = new Strategy("Lsq2", 0);
        public static final Strategy Impulse = new Strategy("Impulse", 1);

        private static final /* synthetic */ Strategy[] $values() {
            return new Strategy[]{Lsq2, Impulse};
        }

        static {
            Strategy[] strategyArr$values = $values();
            $VALUES = strategyArr$values;
            $ENTRIES = b.a(strategyArr$values);
        }

        private Strategy(String str, int i2) {
        }

        public static a<Strategy> getEntries() {
            return $ENTRIES;
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) $VALUES.clone();
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[Strategy.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Strategy.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VelocityTracker1D(boolean z, Strategy strategy) {
        int i2;
        this.isDataDifferential = z;
        this.strategy = strategy;
        if (z && strategy.equals(Strategy.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        Strategy strategy2 = Strategy.Lsq2;
        int iOrdinal = strategy.ordinal();
        if (iOrdinal == 0) {
            i2 = 3;
        } else {
            if (iOrdinal != 1) {
                throw new i();
            }
            i2 = 2;
        }
        this.minSampleSize = i2;
        this.samples = new DataPointAtTime[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
    }

    private final float calculateLeastSquaresVelocity(float[] fArr, float[] fArr2, int i2) {
        try {
            float[] fArr3 = this.reusableVelocityCoefficients;
            VelocityTrackerKt.polyFitLeastSquares(fArr2, fArr, i2, 2, fArr3);
            return fArr3[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void addDataPoint(long j2, float f2) {
        int i2 = (this.index + 1) % 20;
        this.index = i2;
        VelocityTrackerKt.set(this.samples, i2, j2, f2);
    }

    public final float calculateVelocity() {
        float[] fArr;
        float[] fArr2;
        float fCalculateLeastSquaresVelocity;
        DataPointAtTime[] dataPointAtTimeArr = this.samples;
        int i2 = this.index;
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i2];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i3 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            fArr = this.reusableTimeArray;
            fArr2 = this.reusableDataPointsArray;
            DataPointAtTime dataPointAtTime3 = this.samples[i2];
            if (dataPointAtTime3 == null) {
                break;
            }
            long time = dataPointAtTime.getTime() - dataPointAtTime3.getTime();
            float fAbs = Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
            DataPointAtTime dataPointAtTime4 = (this.strategy == Strategy.Lsq2 || this.isDataDifferential) ? dataPointAtTime3 : dataPointAtTime;
            float f2 = time;
            if (f2 > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr2[i3] = dataPointAtTime3.getDataPoint();
            fArr[i3] = -f2;
            if (i2 == 0) {
                i2 = 20;
            }
            i3++;
            if (i3 >= 20) {
                break;
            }
            i2--;
            dataPointAtTime2 = dataPointAtTime4;
        }
        if (i3 < this.minSampleSize) {
            return 0.0f;
        }
        Strategy strategy = this.strategy;
        Strategy strategy2 = Strategy.Lsq2;
        int iOrdinal = strategy.ordinal();
        if (iOrdinal == 0) {
            fCalculateLeastSquaresVelocity = calculateLeastSquaresVelocity(fArr2, fArr, i3);
        } else {
            if (iOrdinal != 1) {
                throw new i();
            }
            fCalculateLeastSquaresVelocity = VelocityTrackerKt.calculateImpulseVelocity(fArr2, fArr, i3, this.isDataDifferential);
        }
        return fCalculateLeastSquaresVelocity * 1000.0f;
    }

    public final boolean isDataDifferential() {
        return this.isDataDifferential;
    }

    public final void resetTracking() {
        DataPointAtTime[] dataPointAtTimeArr = this.samples;
        c.j(dataPointAtTimeArr, null, 0, dataPointAtTimeArr.length);
        this.index = 0;
    }

    public VelocityTracker1D(boolean z) {
        this(z, Strategy.Impulse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VelocityTracker1D() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ VelocityTracker1D(boolean z, Strategy strategy, int i2, o oVar) {
        this(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), (i2 & 2) != 0 ? Strategy.Lsq2 : strategy);
    }

    public final float calculateVelocity(float f2) {
        if (f2 <= 0.0f) {
            InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=" + f2);
        }
        float fCalculateVelocity = calculateVelocity();
        if (fCalculateVelocity == 0.0f || Float.isNaN(fCalculateVelocity)) {
            return 0.0f;
        }
        return fCalculateVelocity > 0.0f ? n.f(fCalculateVelocity, f2) : n.e(fCalculateVelocity, -f2);
    }
}
