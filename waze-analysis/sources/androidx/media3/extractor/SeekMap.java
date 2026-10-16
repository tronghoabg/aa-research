package androidx.media3.extractor;

import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface SeekMap {

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.extractor.SeekMap$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isEstimated(SeekMap seekMap) {
            return false;
        }
    }

    long getDurationUs();

    SeekPoints getSeekPoints(long j2);

    boolean isEstimated();

    boolean isSeekable();

    /* compiled from: WazeSource */
    public final class SeekPoints {
        public final SeekPoint first;
        public final SeekPoint second;

        public SeekPoints(SeekPoint seekPoint, SeekPoint seekPoint2) {
            an.B(seekPoint);
            this.first = seekPoint;
            an.B(seekPoint2);
            this.second = seekPoint2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                SeekPoints seekPoints = (SeekPoints) obj;
                if (this.first.equals(seekPoints.first) && this.second.equals(seekPoints.second)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.first.hashCode() * 31) + this.second.hashCode();
        }

        public String toString() {
            SeekPoint seekPoint = this.first;
            SeekPoint seekPoint2 = this.second;
            return "[" + String.valueOf(seekPoint) + (seekPoint.equals(seekPoint2) ? "" : ", ".concat(String.valueOf(String.valueOf(this.second)))) + "]";
        }

        public SeekPoints(SeekPoint seekPoint) {
            this(seekPoint, seekPoint);
        }
    }

    /* compiled from: WazeSource */
    public class Unseekable implements SeekMap {
        private final long durationUs;
        private final SeekPoints startSeekPoints;

        public Unseekable(long j2, long j3) {
            this.durationUs = j2;
            this.startSeekPoints = new SeekPoints(j3 == 0 ? SeekPoint.START : new SeekPoint(0L, j3));
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // androidx.media3.extractor.SeekMap
        public SeekPoints getSeekPoints(long j2) {
            return this.startSeekPoints;
        }

        @Override // androidx.media3.extractor.SeekMap
        public /* synthetic */ boolean isEstimated() {
            return false;
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return false;
        }

        public Unseekable(long j2) {
            this(j2, 0L);
        }
    }
}
