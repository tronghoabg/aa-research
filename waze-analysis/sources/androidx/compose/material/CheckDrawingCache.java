package androidx.compose.material;

import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CheckDrawingCache {
    private final Path checkPath;
    private final PathMeasure pathMeasure;
    private final Path pathToDraw;

    public /* synthetic */ CheckDrawingCache(Path path, PathMeasure pathMeasure, Path path2, int i2, o oVar) {
        this((i2 & 1) != 0 ? AndroidPath_androidKt.Path() : path, (i2 & 2) != 0 ? AndroidPathMeasure_androidKt.PathMeasure() : pathMeasure, (i2 & 4) != 0 ? AndroidPath_androidKt.Path() : path2);
    }

    public final Path getCheckPath() {
        return this.checkPath;
    }

    public final PathMeasure getPathMeasure() {
        return this.pathMeasure;
    }

    public final Path getPathToDraw() {
        return this.pathToDraw;
    }

    public CheckDrawingCache(Path path, PathMeasure pathMeasure, Path path2) {
        this.checkPath = path;
        this.pathMeasure = pathMeasure;
        this.pathToDraw = path2;
    }

    public CheckDrawingCache() {
        this(null, null, null, 7, null);
    }
}
