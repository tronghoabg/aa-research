package androidx.graphics.path;

import android.graphics.Path;
import androidx.graphics.path.PathIterator;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PathUtilities {
    public static final PathIterator iterator(Path path) {
        x.f(path, "<this>");
        return new PathIterator(path, null, 0.0f, 6, null);
    }

    public static /* synthetic */ PathIterator iterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = 0.25f;
        }
        return iterator(path, conicEvaluation, f2);
    }

    public static final PathIterator iterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2) {
        x.f(path, "<this>");
        x.f(conicEvaluation, "conicEvaluation");
        return new PathIterator(path, conicEvaluation, f2);
    }
}
