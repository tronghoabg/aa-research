package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.shadow.DropShadowPainter;
import androidx.compose.ui.graphics.shadow.InnerShadowPainter;
import androidx.compose.ui.graphics.shadow.PlatformShadowContext;
import androidx.compose.ui.graphics.shadow.ShadowContext;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface GraphicsContext {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.GraphicsContext$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static ShadowContext $default$getShadowContext(GraphicsContext graphicsContext) {
            return new PlatformShadowContext() { // from class: androidx.compose.ui.graphics.GraphicsContext$shadowContext$1
                @Override // androidx.compose.ui.graphics.shadow.ShadowContext
                public /* synthetic */ DropShadowPainter createDropShadowPainter(Shape shape, androidx.compose.ui.graphics.shadow.Shadow shadow) {
                    return ShadowContext.CC.$default$createDropShadowPainter(this, shape, shadow);
                }

                @Override // androidx.compose.ui.graphics.shadow.ShadowContext
                public /* synthetic */ InnerShadowPainter createInnerShadowPainter(Shape shape, androidx.compose.ui.graphics.shadow.Shadow shadow) {
                    return ShadowContext.CC.$default$createInnerShadowPainter(this, shape, shadow);
                }

                @Override // androidx.compose.ui.graphics.shadow.ShadowContext
                public /* synthetic */ void clearCache() {
                }
            };
        }
    }

    GraphicsLayer createGraphicsLayer();

    ShadowContext getShadowContext();

    void releaseGraphicsLayer(GraphicsLayer graphicsLayer);
}
