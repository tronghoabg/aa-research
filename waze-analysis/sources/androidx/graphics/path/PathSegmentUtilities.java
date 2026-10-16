package androidx.graphics.path;

import android.graphics.PointF;
import androidx.graphics.path.PathSegment;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PathSegmentUtilities {
    private static final PathSegment DoneSegment = new PathSegment(PathSegment.Type.Done, new PointF[0], 0.0f);
    private static final PathSegment CloseSegment = new PathSegment(PathSegment.Type.Close, new PointF[0], 0.0f);

    public static final PathSegment getCloseSegment() {
        return CloseSegment;
    }

    public static final PathSegment getDoneSegment() {
        return DoneSegment;
    }
}
