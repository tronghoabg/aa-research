package androidx.compose.ui.graphics;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PathHitTesterKt {
    private static final Path EmptyPath = AndroidPath_androidKt.Path();

    public static final PathHitTester PathHitTester(Path path, float f2) {
        PathHitTester pathHitTester = new PathHitTester();
        pathHitTester.updatePath(path, f2);
        return pathHitTester;
    }

    public static /* synthetic */ PathHitTester PathHitTester$default(Path path, float f2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = 0.5f;
        }
        return PathHitTester(path, f2);
    }
}
