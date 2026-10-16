package androidx.graphics.path;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class PathIteratorImpl {
    private static final Companion Companion = new Companion(null);
    private final PathIterator.ConicEvaluation conicEvaluation;
    private final Path path;
    private final float[] pointsData;
    private final float tolerance;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        if (o.m("dalvik", System.getProperty("java.vm.name"), true)) {
            System.loadLibrary("androidx.graphics.path");
        }
    }

    public PathIteratorImpl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2) {
        x.f(path, "path");
        x.f(conicEvaluation, "conicEvaluation");
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f2;
        this.pointsData = new float[8];
    }

    private final PointF[] floatsToPoints(float[] fArr, PathSegment.Type type) {
        PathSegment.Type type2 = PathSegment.Type.Move;
        int iOrdinal = type.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? (iOrdinal == 2 || iOrdinal == 3) ? new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5])} : iOrdinal != 4 ? new PointF[0] : new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5]), new PointF(fArr[6], fArr[7])} : new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3])} : new PointF[]{new PointF(fArr[0], fArr[1])};
    }

    public static /* synthetic */ PathSegment.Type next$default(PathIteratorImpl pathIteratorImpl, float[] fArr, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return pathIteratorImpl.next(fArr, i2);
    }

    public abstract int calculateSize(boolean z);

    public final PathIterator.ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    public final Path getPath() {
        return this.path;
    }

    public final float getTolerance() {
        return this.tolerance;
    }

    public abstract boolean hasNext();

    public abstract PathSegment.Type next(float[] fArr, int i2);

    public final PathSegment next() {
        PathSegment.Type next = next(this.pointsData, 0);
        if (next == PathSegment.Type.Done) {
            return PathSegmentUtilities.getDoneSegment();
        }
        if (next == PathSegment.Type.Close) {
            return PathSegmentUtilities.getCloseSegment();
        }
        return new PathSegment(next, floatsToPoints(this.pointsData, next), next == PathSegment.Type.Conic ? this.pointsData[6] : 0.0f);
    }

    public abstract PathSegment.Type peek();

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    public /* synthetic */ PathIteratorImpl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2, int i2, h.g.b.o oVar) {
        this(path, (i2 & 2) != 0 ? PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i2 & 4) != 0 ? 0.25f : f2);
    }
}
