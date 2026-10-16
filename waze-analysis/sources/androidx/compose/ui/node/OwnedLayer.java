package androidx.compose.ui.node;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import h.ab;
import h.g.a.a;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface OwnedLayer {
    void destroy();

    void drawLayer(Canvas canvas, GraphicsLayer graphicsLayer);

    float getFrameRate();

    /* renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    float[] mo10124getUnderlyingMatrixsQKQjiQ();

    void invalidate();

    /* renamed from: inverseTransform-58bKbWc, reason: not valid java name */
    void mo10125inverseTransform58bKbWc(float[] fArr);

    boolean isFrameRateFromParent();

    /* renamed from: isInLayer-k-4lQ0M, reason: not valid java name */
    boolean mo10126isInLayerk4lQ0M(long j2);

    void mapBounds(MutableRect mutableRect, boolean z);

    /* renamed from: mapOffset-8S9VItk, reason: not valid java name */
    long mo10127mapOffset8S9VItk(long j2, boolean z);

    /* renamed from: move--gyyYBs, reason: not valid java name */
    void mo10128movegyyYBs(long j2);

    /* renamed from: resize-ozmzZPI, reason: not valid java name */
    void mo10129resizeozmzZPI(long j2);

    void reuseLayer(p<? super Canvas, ? super GraphicsLayer, ab> pVar, a<ab> aVar);

    void setFrameRate(float f2);

    void setFrameRateFromParent(boolean z);

    /* renamed from: transform-58bKbWc, reason: not valid java name */
    void mo10130transform58bKbWc(float[] fArr);

    void updateDisplayList();

    void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope);
}
