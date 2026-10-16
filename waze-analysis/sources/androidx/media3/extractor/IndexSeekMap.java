package androidx.media3.extractor;

import androidx.media3.common.C;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class IndexSeekMap implements SeekMap {
    private long durationUs;
    private final LongArray positions;
    private final LongArray timesUs;

    public IndexSeekMap(long[] jArr, long[] jArr2, long j2) {
        LongArray longArray;
        LongArray longArray2;
        int length = jArr.length;
        int length2 = jArr2.length;
        an.l(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            longArray = new LongArray(length2);
            this.positions = longArray;
            longArray2 = new LongArray(length2);
            this.timesUs = longArray2;
        } else {
            int i2 = length2 + 1;
            longArray = new LongArray(i2);
            this.positions = longArray;
            longArray2 = new LongArray(i2);
            this.timesUs = longArray2;
            longArray.add(0L);
            longArray2.add(0L);
        }
        longArray.addAll(jArr);
        longArray2.addAll(jArr2);
        this.durationUs = j2;
    }

    public void addSeekPoint(long j2, long j3) {
        if (this.timesUs.size() == 0 && j2 > 0) {
            this.positions.add(0L);
            this.timesUs.add(0L);
        }
        this.positions.add(j3);
        this.timesUs.add(j2);
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        if (this.timesUs.size() == 0) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int iBinarySearchFloor = Util.binarySearchFloor(this.timesUs, j2, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs.get(iBinarySearchFloor), this.positions.get(iBinarySearchFloor));
        if (seekPoint.timeUs == j2 || iBinarySearchFloor == this.timesUs.size() - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i2 = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs.get(i2), this.positions.get(i2)));
    }

    public long getTimeUs(long j2) {
        if (this.timesUs.size() == 0) {
            return C.TIME_UNSET;
        }
        return this.timesUs.get(Util.binarySearchFloor(this.positions, j2, true, true));
    }

    @Override // androidx.media3.extractor.SeekMap
    public /* synthetic */ boolean isEstimated() {
        return false;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.timesUs.size() > 0;
    }

    public boolean isTimeUsInIndex(long j2, long j3) {
        if (this.timesUs.size() == 0) {
            return false;
        }
        LongArray longArray = this.timesUs;
        return j2 - longArray.get(longArray.size() + (-1)) < j3;
    }

    public void setDurationUs(long j2) {
        this.durationUs = j2;
    }
}
