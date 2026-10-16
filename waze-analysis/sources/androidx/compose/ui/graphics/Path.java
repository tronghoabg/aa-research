package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.PathIterator;
import h.d.a;
import h.d.b;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Path {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: combine-xh6zSI8, reason: not valid java name */
        public final Path m8543combinexh6zSI8(int i2, Path path, Path path2) {
            Path Path = AndroidPath_androidKt.Path();
            if (Path.mo8117opN5in7k0(path, path2, i2)) {
                return Path;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class Direction {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction CounterClockwise = new Direction("CounterClockwise", 0);
        public static final Direction Clockwise = new Direction("Clockwise", 1);

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{CounterClockwise, Clockwise};
        }

        static {
            Direction[] directionArr$values = $values();
            $VALUES = directionArr$values;
            $ENTRIES = b.a(directionArr$values);
        }

        private Direction(String str, int i2) {
        }

        public static a<Direction> getEntries() {
            return $ENTRIES;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    void addArc(Rect rect, float f2, float f3);

    void addArcRad(Rect rect, float f2, float f3);

    /* synthetic */ void addOval(Rect rect);

    void addOval(Rect rect, Direction direction);

    /* renamed from: addPath-Uv8p0NA */
    void mo8115addPathUv8p0NA(Path path, long j2);

    /* synthetic */ void addRect(Rect rect);

    void addRect(Rect rect, Direction direction);

    /* synthetic */ void addRoundRect(RoundRect roundRect);

    void addRoundRect(RoundRect roundRect, Direction direction);

    Path and(Path path);

    void arcTo(Rect rect, float f2, float f3, boolean z);

    void arcToRad(Rect rect, float f2, float f3, boolean z);

    void close();

    void cubicTo(float f2, float f3, float f4, float f5, float f6, float f7);

    Rect getBounds();

    /* renamed from: getFillType-Rg-k1Os */
    int mo8116getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    PathIterator iterator();

    PathIterator iterator(PathIterator.ConicEvaluation conicEvaluation, float f2);

    void lineTo(float f2, float f3);

    Path minus(Path path);

    void moveTo(float f2, float f3);

    /* renamed from: op-N5in7k0 */
    boolean mo8117opN5in7k0(Path path, Path path2, int i2);

    Path or(Path path);

    Path plus(Path path);

    void quadraticBezierTo(float f2, float f3, float f4, float f5);

    void quadraticTo(float f2, float f3, float f4, float f5);

    void relativeCubicTo(float f2, float f3, float f4, float f5, float f6, float f7);

    void relativeLineTo(float f2, float f3);

    void relativeMoveTo(float f2, float f3);

    void relativeQuadraticBezierTo(float f2, float f3, float f4, float f5);

    void relativeQuadraticTo(float f2, float f3, float f4, float f5);

    void reset();

    void rewind();

    /* renamed from: setFillType-oQ8Xj4U */
    void mo8118setFillTypeoQ8Xj4U(int i2);

    /* renamed from: transform-58bKbWc */
    void mo8119transform58bKbWc(float[] fArr);

    /* renamed from: translate-k-4lQ0M */
    void mo8120translatek4lQ0M(long j2);

    Path xor(Path path);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.Path$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Path $default$and(Path path, Path path2) {
            Path Path = AndroidPath_androidKt.Path();
            Path.mo8117opN5in7k0(path, path2, PathOperation.Companion.m8565getIntersectb3I0S0c());
            return Path;
        }

        public static void $default$arcToRad(Path path, Rect rect, float f2, float f3, boolean z) {
            path.arcTo(rect, DegreesKt.degrees(f2), DegreesKt.degrees(f3), z);
        }

        public static PathIterator $default$iterator(Path path) {
            return AndroidPathIterator_androidKt.PathIterator$default(path, null, 0.0f, 6, null);
        }

        public static Path $default$minus(Path path, Path path2) {
            Path Path = AndroidPath_androidKt.Path();
            Path.mo8117opN5in7k0(path, path2, PathOperation.Companion.m8564getDifferenceb3I0S0c());
            return Path;
        }

        public static Path $default$plus(Path path, Path path2) {
            Path Path = AndroidPath_androidKt.Path();
            Path.mo8117opN5in7k0(path, path2, PathOperation.Companion.m8567getUnionb3I0S0c());
            return Path;
        }

        public static Path $default$xor(Path path, Path path2) {
            Path Path = AndroidPath_androidKt.Path();
            Path.mo8117opN5in7k0(path, path2, PathOperation.Companion.m8568getXorb3I0S0c());
            return Path;
        }

        public static /* synthetic */ void addOval$default(Path path, Rect rect, Direction direction, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOval");
            }
            if ((i2 & 2) != 0) {
                direction = Direction.CounterClockwise;
            }
            path.addOval(rect, direction);
        }

        /* renamed from: addPath-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ void m8542addPathUv8p0NA$default(Path path, Path path2, long j2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
            }
            if ((i2 & 2) != 0) {
                j2 = Offset.Companion.m7996getZeroF1C5BW0();
            }
            path.mo8115addPathUv8p0NA(path2, j2);
        }

        public static /* synthetic */ void addRect$default(Path path, Rect rect, Direction direction, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
            }
            if ((i2 & 2) != 0) {
                direction = Direction.CounterClockwise;
            }
            path.addRect(rect, direction);
        }

        public static /* synthetic */ void addRoundRect$default(Path path, RoundRect roundRect, Direction direction, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
            }
            if ((i2 & 2) != 0) {
                direction = Direction.CounterClockwise;
            }
            path.addRoundRect(roundRect, direction);
        }

        public static /* synthetic */ PathIterator iterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: iterator");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.25f;
            }
            return path.iterator(conicEvaluation, f2);
        }

        /* renamed from: $default$transform-58bKbWc, reason: not valid java name */
        public static void m8540$default$transform58bKbWc(Path path, float[] fArr) {
        }

        /* renamed from: access$transform-58bKbWc$jd, reason: not valid java name */
        public static /* synthetic */ void m8541access$transform58bKbWc$jd(Path path, float[] fArr) {
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static Path and(Path path, Path path2) {
            return CC.$default$and(path, path2);
        }

        @Deprecated
        public static void arcToRad(Path path, Rect rect, float f2, float f3, boolean z) {
            CC.$default$arcToRad(path, rect, f2, f3, z);
        }

        @Deprecated
        public static PathIterator iterator(Path path) {
            return CC.$default$iterator(path);
        }

        @Deprecated
        public static Path minus(Path path, Path path2) {
            return CC.$default$minus(path, path2);
        }

        @Deprecated
        public static Path or(Path path, Path path2) {
            return path.plus(path2);
        }

        @Deprecated
        public static Path plus(Path path, Path path2) {
            return CC.$default$plus(path, path2);
        }

        @Deprecated
        public static void quadraticTo(Path path, float f2, float f3, float f4, float f5) {
            path.quadraticBezierTo(f2, f3, f4, f5);
        }

        @Deprecated
        public static void relativeQuadraticTo(Path path, float f2, float f3, float f4, float f5) {
            path.relativeQuadraticBezierTo(f2, f3, f4, f5);
        }

        @Deprecated
        public static void rewind(Path path) {
            path.reset();
        }

        @Deprecated
        public static Path xor(Path path, Path path2) {
            return CC.$default$xor(path, path2);
        }

        @Deprecated
        public static PathIterator iterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2) {
            return AndroidPathIterator_androidKt.PathIterator(path, conicEvaluation, f2);
        }

        @Deprecated
        /* renamed from: transform-58bKbWc, reason: not valid java name */
        public static void m8545transform58bKbWc(Path path, float[] fArr) {
        }
    }
}
