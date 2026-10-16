package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.Shape;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ShadowContext {
    void clearCache();

    DropShadowPainter createDropShadowPainter(Shape shape, Shadow shadow);

    InnerShadowPainter createInnerShadowPainter(Shape shape, Shadow shadow);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.shadow.ShadowContext$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static DropShadowPainter $default$createDropShadowPainter(ShadowContext shadowContext, Shape shape, Shadow shadow) {
            return new DropShadowPainter(shape, shadow);
        }

        public static InnerShadowPainter $default$createInnerShadowPainter(ShadowContext shadowContext, Shape shape, Shadow shadow) {
            return new InnerShadowPainter(shape, shadow);
        }

        public static void $default$clearCache(ShadowContext shadowContext) {
        }
    }
}
