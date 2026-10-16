package androidx.compose.animation;

import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LayerRenderer {
    public static final LayerRendererComparator LayerRendererComparator = LayerRendererComparator.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class LayerRendererComparator implements Comparator<LayerRenderer> {
        static final /* synthetic */ LayerRendererComparator $$INSTANCE = new LayerRendererComparator();

        private LayerRendererComparator() {
        }

        private final float comparator(LayerRenderer layerRenderer) {
            if (layerRenderer.getZIndex() == 0.0f && (layerRenderer instanceof SharedElementEntry) && ((SharedElementEntry) layerRenderer).getParentState() == null) {
                return -1.0f;
            }
            return layerRenderer.getZIndex();
        }

        @Override // java.util.Comparator
        public int compare(LayerRenderer layerRenderer, LayerRenderer layerRenderer2) {
            return Float.compare(comparator(layerRenderer), comparator(layerRenderer2));
        }
    }

    void drawInOverlay(DrawScope drawScope, GraphicsContext graphicsContext);

    SharedElementEntry getParentState();

    float getZIndex();
}
