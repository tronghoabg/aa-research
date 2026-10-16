package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CacheDrawScopeDragShadowCallback {
    public static final int $stable = 8;
    private GraphicsLayer graphicsLayer;

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab cachePicture$lambda$0$0$0(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab cachePicture$lambda$0$1(CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback, ContentDrawScope contentDrawScope) {
        GraphicsLayer graphicsLayer = cacheDrawScopeDragShadowCallback.graphicsLayer;
        x.c(graphicsLayer);
        GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer);
        return ab.f48028a;
    }

    public final DrawResult cachePicture(CacheDrawScope cacheDrawScope) {
        GraphicsLayer graphicsLayerObtainGraphicsLayer = cacheDrawScope.obtainGraphicsLayer();
        CacheDrawScope.m7759recordTdoYBX4$default(cacheDrawScope, graphicsLayerObtainGraphicsLayer, null, null, 0L, new l() { // from class: androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CacheDrawScopeDragShadowCallback.cachePicture$lambda$0$0$0((ContentDrawScope) obj);
            }
        }, 7, null);
        this.graphicsLayer = graphicsLayerObtainGraphicsLayer;
        return cacheDrawScope.onDrawWithContent(new l() { // from class: androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CacheDrawScopeDragShadowCallback.cachePicture$lambda$0$1(this.f$0, (ContentDrawScope) obj);
            }
        });
    }

    public final void drawDragShadow(DrawScope drawScope) {
        GraphicsLayer graphicsLayer = this.graphicsLayer;
        if (graphicsLayer == null) {
            throw new IllegalArgumentException("No cached drag shadow. Check if the drag source node was rendered first");
        }
        GraphicsLayerKt.drawLayer(drawScope, graphicsLayer);
    }
}
