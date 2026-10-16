package androidx.core.graphics;

import android.graphics.Path;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PathKt {
    public static final Path and(Path path, Path path2) {
        x.f(path, "<this>");
        x.f(path2, TtmlNode.TAG_P);
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    public static final Iterable<PathSegment> flatten(Path path, float f2) {
        x.f(path, "<this>");
        Collection<PathSegment> collectionFlatten = PathUtils.flatten(path, f2);
        x.e(collectionFlatten, "flatten(...)");
        return collectionFlatten;
    }

    public static /* synthetic */ Iterable flatten$default(Path path, float f2, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            f2 = 0.5f;
        }
        return flatten(path, f2);
    }

    public static final Path minus(Path path, Path path2) {
        x.f(path, "<this>");
        x.f(path2, TtmlNode.TAG_P);
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    public static final Path or(Path path, Path path2) {
        x.f(path, "<this>");
        x.f(path2, TtmlNode.TAG_P);
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    public static final Path plus(Path path, Path path2) {
        x.f(path, "<this>");
        x.f(path2, TtmlNode.TAG_P);
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    public static final Path xor(Path path, Path path2) {
        x.f(path, "<this>");
        x.f(path2, TtmlNode.TAG_P);
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}
