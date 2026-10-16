package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PathBuilder {
    public static final int $stable = 8;
    private final ArrayList<PathNode> _nodes = new ArrayList<>(32);

    public final PathBuilder arcTo(float f2, float f3, float f4, boolean z, boolean z2, float f5, float f6) {
        this._nodes.add(new PathNode.ArcTo(f2, f3, f4, z, z2, f5, f6));
        return this;
    }

    public final PathBuilder arcToRelative(float f2, float f3, float f4, boolean z, boolean z2, float f5, float f6) {
        this._nodes.add(new PathNode.RelativeArcTo(f2, f3, f4, z, z2, f5, f6));
        return this;
    }

    public final PathBuilder close() {
        this._nodes.add(PathNode.Close.INSTANCE);
        return this;
    }

    public final PathBuilder curveTo(float f2, float f3, float f4, float f5, float f6, float f7) {
        this._nodes.add(new PathNode.CurveTo(f2, f3, f4, f5, f6, f7));
        return this;
    }

    public final PathBuilder curveToRelative(float f2, float f3, float f4, float f5, float f6, float f7) {
        this._nodes.add(new PathNode.RelativeCurveTo(f2, f3, f4, f5, f6, f7));
        return this;
    }

    public final List<PathNode> getNodes() {
        return this._nodes;
    }

    public final PathBuilder horizontalLineTo(float f2) {
        this._nodes.add(new PathNode.HorizontalTo(f2));
        return this;
    }

    public final PathBuilder horizontalLineToRelative(float f2) {
        this._nodes.add(new PathNode.RelativeHorizontalTo(f2));
        return this;
    }

    public final PathBuilder lineTo(float f2, float f3) {
        this._nodes.add(new PathNode.LineTo(f2, f3));
        return this;
    }

    public final PathBuilder lineToRelative(float f2, float f3) {
        this._nodes.add(new PathNode.RelativeLineTo(f2, f3));
        return this;
    }

    public final PathBuilder moveTo(float f2, float f3) {
        this._nodes.add(new PathNode.MoveTo(f2, f3));
        return this;
    }

    public final PathBuilder moveToRelative(float f2, float f3) {
        this._nodes.add(new PathNode.RelativeMoveTo(f2, f3));
        return this;
    }

    public final PathBuilder quadTo(float f2, float f3, float f4, float f5) {
        this._nodes.add(new PathNode.QuadTo(f2, f3, f4, f5));
        return this;
    }

    public final PathBuilder quadToRelative(float f2, float f3, float f4, float f5) {
        this._nodes.add(new PathNode.RelativeQuadTo(f2, f3, f4, f5));
        return this;
    }

    public final PathBuilder reflectiveCurveTo(float f2, float f3, float f4, float f5) {
        this._nodes.add(new PathNode.ReflectiveCurveTo(f2, f3, f4, f5));
        return this;
    }

    public final PathBuilder reflectiveCurveToRelative(float f2, float f3, float f4, float f5) {
        this._nodes.add(new PathNode.RelativeReflectiveCurveTo(f2, f3, f4, f5));
        return this;
    }

    public final PathBuilder reflectiveQuadTo(float f2, float f3) {
        this._nodes.add(new PathNode.ReflectiveQuadTo(f2, f3));
        return this;
    }

    public final PathBuilder reflectiveQuadToRelative(float f2, float f3) {
        this._nodes.add(new PathNode.RelativeReflectiveQuadTo(f2, f3));
        return this;
    }

    public final PathBuilder verticalLineTo(float f2) {
        this._nodes.add(new PathNode.VerticalTo(f2));
        return this;
    }

    public final PathBuilder verticalLineToRelative(float f2) {
        this._nodes.add(new PathNode.RelativeVerticalTo(f2));
        return this;
    }
}
