package androidx.compose.ui.graphics;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PathMeasure {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.PathMeasure$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ boolean getSegment$default(PathMeasure pathMeasure, float f2, float f3, Path path, boolean z, int i2, Object obj) {
            if (obj == null) {
                return pathMeasure.getSegment(f2, f3, path, z | (!((i2 & 8) == 0)));
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
    }

    float getLength();

    /* renamed from: getPosition-tuRUvjQ */
    long mo8123getPositiontuRUvjQ(float f2);

    boolean getSegment(float f2, float f3, Path path, boolean z);

    /* renamed from: getTangent-tuRUvjQ */
    long mo8124getTangenttuRUvjQ(float f2);

    void setPath(Path path, boolean z);
}
