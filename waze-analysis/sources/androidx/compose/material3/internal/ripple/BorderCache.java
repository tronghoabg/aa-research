package androidx.compose.material3.internal.ripple;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.CompositingStrategy;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import h.ab;
import h.g.a.a;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class BorderCache {
    private Path borderPath;

    /* renamed from: drawBorderCache-95KtPRI, reason: not valid java name */
    public final void m6391drawBorderCache95KtPRI(DrawScope drawScope, long j2, a<GraphicsLayer> aVar, final l<? super DrawScope, ab> lVar) {
        GraphicsLayer graphicsLayerInvoke = aVar.invoke();
        graphicsLayerInvoke.m8936setCompositingStrategyWpw9cng(CompositingStrategy.Companion.m8921getOffscreenke2Ky5w());
        drawScope.mo8752recordJVtK1S4(graphicsLayerInvoke, j2, new l<DrawScope, ab>() { // from class: androidx.compose.material3.internal.ripple.BorderCache$drawBorderCache$1
            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ ab invoke(DrawScope drawScope2) {
                invoke2(drawScope2);
                return ab.f48028a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope2) {
                lVar.invoke(drawScope2);
            }
        });
        GraphicsLayerKt.drawLayer(drawScope, graphicsLayerInvoke);
    }

    public final Path obtainPath() {
        Path path = this.borderPath;
        if (path != null) {
            return path;
        }
        Path Path = AndroidPath_androidKt.Path();
        this.borderPath = Path;
        return Path;
    }
}
