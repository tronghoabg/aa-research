package androidx.media3.common.util;

import androidx.media3.common.C;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ConstantRateTimestampIterator implements TimestampIterator {
    private final long endPositionUs;
    private final float frameRate;
    private int framesAdded;
    private final double framesDurationUs;
    private final long startPositionUs;
    private final int totalNumberOfFramesToAdd;

    public ConstantRateTimestampIterator(long j2, long j3, float f2) {
        boolean z = false;
        an.l(j3 > 0);
        an.l(f2 > 0.0f);
        if (j2 >= 0 && j2 < j3) {
            z = true;
        }
        an.l(z);
        this.startPositionUs = j2;
        this.endPositionUs = j3;
        this.frameRate = f2;
        this.totalNumberOfFramesToAdd = Math.max(Math.round(((j3 - j2) / 1000000.0f) * f2), 1);
        this.framesDurationUs = 1000000.0f / f2;
    }

    private long getTimestampUsAfter(int i2) {
        long jRound = this.startPositionUs + Math.round(this.framesDurationUs * i2);
        an.u(jRound >= 0);
        return jRound;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public ConstantRateTimestampIterator copyOf() {
        return new ConstantRateTimestampIterator(this.startPositionUs, this.endPositionUs, this.frameRate);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long getLastTimestampUs() {
        int i2 = this.totalNumberOfFramesToAdd;
        return i2 == 0 ? C.TIME_UNSET : getTimestampUsAfter(i2 - 1);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public boolean hasNext() {
        return this.framesAdded < this.totalNumberOfFramesToAdd;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long next() {
        an.u(hasNext());
        int i2 = this.framesAdded;
        this.framesAdded = i2 + 1;
        return getTimestampUsAfter(i2);
    }

    public ConstantRateTimestampIterator(long j2, float f2) {
        this(0L, j2, f2);
    }
}
