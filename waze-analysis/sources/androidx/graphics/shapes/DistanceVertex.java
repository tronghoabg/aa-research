package androidx.graphics.shapes;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DistanceVertex {
    private final float distance;
    private final ProgressableFeature f1;
    private final ProgressableFeature f2;

    public DistanceVertex(float f2, ProgressableFeature progressableFeature, ProgressableFeature progressableFeature2) {
        x.f(progressableFeature, "f1");
        x.f(progressableFeature2, "f2");
        this.distance = f2;
        this.f1 = progressableFeature;
        this.f2 = progressableFeature2;
    }

    public static /* synthetic */ DistanceVertex copy$default(DistanceVertex distanceVertex, float f2, ProgressableFeature progressableFeature, ProgressableFeature progressableFeature2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = distanceVertex.distance;
        }
        if ((i2 & 2) != 0) {
            progressableFeature = distanceVertex.f1;
        }
        if ((i2 & 4) != 0) {
            progressableFeature2 = distanceVertex.f2;
        }
        return distanceVertex.copy(f2, progressableFeature, progressableFeature2);
    }

    public final float component1() {
        return this.distance;
    }

    public final ProgressableFeature component2() {
        return this.f1;
    }

    public final ProgressableFeature component3() {
        return this.f2;
    }

    public final DistanceVertex copy(float f2, ProgressableFeature progressableFeature, ProgressableFeature progressableFeature2) {
        x.f(progressableFeature, "f1");
        x.f(progressableFeature2, "f2");
        return new DistanceVertex(f2, progressableFeature, progressableFeature2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistanceVertex)) {
            return false;
        }
        DistanceVertex distanceVertex = (DistanceVertex) obj;
        return Float.compare(this.distance, distanceVertex.distance) == 0 && x.n(this.f1, distanceVertex.f1) && x.n(this.f2, distanceVertex.f2);
    }

    public final float getDistance() {
        return this.distance;
    }

    public final ProgressableFeature getF1() {
        return this.f1;
    }

    public final ProgressableFeature getF2() {
        return this.f2;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.distance) * 31) + this.f1.hashCode()) * 31) + this.f2.hashCode();
    }

    public String toString() {
        return "DistanceVertex(distance=" + this.distance + ", f1=" + this.f1 + ", f2=" + this.f2 + ")";
    }
}
