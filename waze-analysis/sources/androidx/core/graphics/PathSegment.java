package androidx.core.graphics;

import android.graphics.PointF;
import androidx.core.util.Preconditions;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PathSegment {
    private final PointF mEnd;
    private final float mEndFraction;
    private final PointF mStart;
    private final float mStartFraction;

    public PathSegment(PointF pointF, float f2, PointF pointF2, float f3) {
        Preconditions.checkNotNull(pointF, "start == null");
        this.mStart = pointF;
        this.mStartFraction = f2;
        Preconditions.checkNotNull(pointF2, "end == null");
        this.mEnd = pointF2;
        this.mEndFraction = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathSegment)) {
            return false;
        }
        PathSegment pathSegment = (PathSegment) obj;
        return Float.compare(this.mStartFraction, pathSegment.mStartFraction) == 0 && Float.compare(this.mEndFraction, pathSegment.mEndFraction) == 0 && this.mStart.equals(pathSegment.mStart) && this.mEnd.equals(pathSegment.mEnd);
    }

    public PointF getEnd() {
        return this.mEnd;
    }

    public float getEndFraction() {
        return this.mEndFraction;
    }

    public PointF getStart() {
        return this.mStart;
    }

    public float getStartFraction() {
        return this.mStartFraction;
    }

    public int hashCode() {
        int iHashCode = this.mStart.hashCode() * 31;
        float f2 = this.mStartFraction;
        int iFloatToIntBits = (((iHashCode + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + this.mEnd.hashCode()) * 31;
        float f3 = this.mEndFraction;
        return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }

    public String toString() {
        return "PathSegment{start=" + this.mStart + ", startFraction=" + this.mStartFraction + ", end=" + this.mEnd + ", endFraction=" + this.mEndFraction + '}';
    }
}
