package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathSegment;
import h.d.b;
import h.g.b.a.a;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PathIterator extends Iterator<PathSegment>, a {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.PathIterator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ int calculateSize$default(PathIterator pathIterator, boolean z, int i2, Object obj) {
            if (obj == null) {
                return pathIterator.calculateSize(1 == ((z ? 1 : 0) | (i2 & 1)));
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateSize");
        }

        public static /* synthetic */ PathSegment.Type next$default(PathIterator pathIterator, float[] fArr, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return pathIterator.next(fArr, i2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class ConicEvaluation {
        private static final /* synthetic */ h.d.a $ENTRIES;
        private static final /* synthetic */ ConicEvaluation[] $VALUES;
        public static final ConicEvaluation AsConic = new ConicEvaluation("AsConic", 0);
        public static final ConicEvaluation AsQuadratics = new ConicEvaluation("AsQuadratics", 1);

        private static final /* synthetic */ ConicEvaluation[] $values() {
            return new ConicEvaluation[]{AsConic, AsQuadratics};
        }

        static {
            ConicEvaluation[] conicEvaluationArr$values = $values();
            $VALUES = conicEvaluationArr$values;
            $ENTRIES = b.a(conicEvaluationArr$values);
        }

        private ConicEvaluation(String str, int i2) {
        }

        public static h.d.a<ConicEvaluation> getEntries() {
            return $ENTRIES;
        }

        public static ConicEvaluation valueOf(String str) {
            return (ConicEvaluation) Enum.valueOf(ConicEvaluation.class, str);
        }

        public static ConicEvaluation[] values() {
            return (ConicEvaluation[]) $VALUES.clone();
        }
    }

    int calculateSize(boolean z);

    ConicEvaluation getConicEvaluation();

    Path getPath();

    float getTolerance();

    @Override // java.util.Iterator
    boolean hasNext();

    PathSegment.Type next(float[] fArr, int i2);

    @Override // java.util.Iterator
    PathSegment next();
}
