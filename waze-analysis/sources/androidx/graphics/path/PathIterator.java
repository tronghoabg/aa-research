package androidx.graphics.path;

import android.graphics.Path;
import android.os.Build;
import androidx.graphics.path.PathSegment;
import h.d.b;
import h.g.b.a.a;
import h.g.b.o;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PathIterator implements Iterator<PathSegment>, a {
    private final ConicEvaluation conicEvaluation;
    private final PathIteratorImpl implementation;
    private final Path path;
    private final float tolerance;

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

    public PathIterator(Path path, ConicEvaluation conicEvaluation, float f2) {
        x.f(path, "path");
        x.f(conicEvaluation, "conicEvaluation");
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f2;
        this.implementation = Build.VERSION.SDK_INT >= 34 ? new PathIteratorApi34Impl(path, conicEvaluation, f2) : new PathIteratorPreApi34Impl(path, conicEvaluation, f2);
    }

    public static /* synthetic */ PathSegment.Type next$default(PathIterator pathIterator, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return pathIterator.next(fArr, i2);
    }

    public final int calculateSize(boolean z) {
        return this.implementation.calculateSize(z);
    }

    public final ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    public final Path getPath() {
        return this.path;
    }

    public final float getTolerance() {
        return this.tolerance;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.implementation.hasNext();
    }

    public final PathSegment.Type next(float[] fArr) {
        x.f(fArr, "points");
        return next$default(this, fArr, 0, 2, null);
    }

    public final PathSegment.Type peek() {
        return this.implementation.peek();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final PathSegment.Type next(float[] fArr, int i2) {
        x.f(fArr, "points");
        return this.implementation.next(fArr, i2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public PathSegment next() {
        return this.implementation.next();
    }

    public /* synthetic */ PathIterator(Path path, ConicEvaluation conicEvaluation, float f2, int i2, o oVar) {
        this(path, (i2 & 2) != 0 ? ConicEvaluation.AsQuadratics : conicEvaluation, (i2 & 4) != 0 ? 0.25f : f2);
    }
}
