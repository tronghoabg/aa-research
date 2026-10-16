package androidx.compose.ui.graphics;

import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CanvasHolder {
    public static final int $stable = 8;
    private final AndroidCanvas androidCanvas = new AndroidCanvas();

    public final void drawInto(android.graphics.Canvas canvas, l<? super Canvas, ab> lVar) {
        android.graphics.Canvas internalCanvas = getAndroidCanvas().getInternalCanvas();
        getAndroidCanvas().setInternalCanvas(canvas);
        lVar.invoke(getAndroidCanvas());
        getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    public final AndroidCanvas getAndroidCanvas() {
        return this.androidCanvas;
    }

    public static /* synthetic */ void getAndroidCanvas$annotations() {
    }
}
