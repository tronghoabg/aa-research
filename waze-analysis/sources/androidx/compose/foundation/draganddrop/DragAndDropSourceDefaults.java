package androidx.compose.foundation.draganddrop;

import h.ab;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DragAndDropSourceDefaults {
    public static final int $stable = 0;
    public static final DragAndDropSourceDefaults INSTANCE = new DragAndDropSourceDefaults();
    private static final p<DragAndDropStartDetectorScope, e<? super ab>, Object> DefaultStartDetector = new DragAndDropSourceDefaults$DefaultStartDetector$1(null);

    private DragAndDropSourceDefaults() {
    }

    public final p<DragAndDropStartDetectorScope, e<? super ab>, Object> getDefaultStartDetector() {
        return DefaultStartDetector;
    }
}
