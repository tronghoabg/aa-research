package androidx.compose.material;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface AnchoredDragScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.AnchoredDragScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void dragTo$default(AnchoredDragScope anchoredDragScope, float f2, float f3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
            }
            if ((i2 & 2) != 0) {
                f3 = 0.0f;
            }
            anchoredDragScope.dragTo(f2, f3);
        }
    }

    void dragTo(float f2, float f3);
}
