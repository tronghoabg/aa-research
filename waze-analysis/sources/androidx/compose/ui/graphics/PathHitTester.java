package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PathHitTester {
    public static final int $stable = 8;
    private Path path = PathHitTesterKt.EmptyPath;
    private float tolerance = 0.5f;
    private Rect bounds = Rect.Companion.getZero();
    private final IntervalTree<PathSegment> intervals = new IntervalTree<>();
    private final float[] curves = new float[20];
    private final float[] roots = new float[2];

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void updatePath$default(PathHitTester pathHitTester, Path path, float f2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = 0.5f;
        }
        pathHitTester.updatePath(path, f2);
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m8556containsk4lQ0M(long j2) {
        int i2;
        int iLineWinding;
        if (!this.path.isEmpty() && this.bounds.m8006containsk4lQ0M(j2)) {
            long j3 = j2 >> 32;
            long j4 = j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            float[] fArr = this.curves;
            float[] fArr2 = this.roots;
            IntervalTree<PathSegment> intervalTree = this.intervals;
            float fIntBitsToFloat = Float.intBitsToFloat((int) j3);
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) j4);
            IntervalTree<PathSegment>.Node node = intervalTree.root;
            if (node != intervalTree.terminator) {
                ArrayList<IntervalTree<PathSegment>.Node> arrayList = intervalTree.stack;
                arrayList.add(node);
                i2 = 0;
                while (arrayList.size() > 0) {
                    IntervalTree<PathSegment>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                    if (nodeRemove.overlaps(fIntBitsToFloat2, fIntBitsToFloat2)) {
                        PathSegment data = nodeRemove.getData();
                        if (data == null) {
                            x.g();
                        }
                        PathSegment pathSegment = data;
                        float[] points = pathSegment.getPoints();
                        PathSegment.Type type = pathSegment.getType();
                        PathSegment.Type type2 = PathSegment.Type.Move;
                        int iOrdinal = type.ordinal();
                        if (iOrdinal == 1) {
                            iLineWinding = BezierKt.lineWinding(points, fIntBitsToFloat, fIntBitsToFloat2);
                        } else if (iOrdinal == 2) {
                            iLineWinding = BezierKt.quadraticWinding(points, fIntBitsToFloat, fIntBitsToFloat2, fArr, fArr2);
                        } else if (iOrdinal == 4) {
                            iLineWinding = BezierKt.cubicWinding(points, fIntBitsToFloat, fIntBitsToFloat2, fArr, fArr2);
                        }
                        i2 += iLineWinding;
                    }
                    if (nodeRemove.getLeft() != intervalTree.terminator && nodeRemove.getLeft().getMax() >= fIntBitsToFloat2) {
                        arrayList.add(nodeRemove.getLeft());
                    }
                    if (nodeRemove.getRight() != intervalTree.terminator && nodeRemove.getRight().getMin() <= fIntBitsToFloat2) {
                        arrayList.add(nodeRemove.getRight());
                    }
                }
                arrayList.clear();
            } else {
                i2 = 0;
            }
            if (PathFillType.m8550equalsimpl0(this.path.mo8116getFillTypeRgk1Os(), PathFillType.Companion.m8554getEvenOddRgk1Os())) {
                i2 &= 1;
            }
            if (i2 != 0) {
                return true;
            }
        }
        return false;
    }

    public final void updatePath(Path path, float f2) {
        this.path = path;
        this.tolerance = f2;
        this.bounds = path.getBounds();
        this.intervals.clear();
        PathIterator it = path.iterator(PathIterator.ConicEvaluation.AsQuadratics, f2);
        while (it.hasNext()) {
            PathSegment next = it.next();
            PathSegment.Type type = next.getType();
            PathSegment.Type type2 = PathSegment.Type.Move;
            int iOrdinal = type.ordinal();
            if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 4) {
                long jComputeVerticalBounds$default = BezierKt.computeVerticalBounds$default(next, this.curves, 0, 4, null);
                this.intervals.addInterval(Float.intBitsToFloat((int) (jComputeVerticalBounds$default >> 32)), Float.intBitsToFloat((int) (jComputeVerticalBounds$default & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), next);
            } else if (iOrdinal == 6) {
                return;
            }
        }
    }
}
