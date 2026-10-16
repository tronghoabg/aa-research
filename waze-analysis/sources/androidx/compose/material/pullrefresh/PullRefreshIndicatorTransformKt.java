package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PullRefreshIndicatorTransformKt {
    public static final Modifier pullRefreshIndicatorTransform(Modifier modifier, final PullRefreshState pullRefreshState, final boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(modifier, new l() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform$lambda$0((ContentDrawScope) obj);
            }
        }), new l() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform$lambda$1(pullRefreshState, z, (GraphicsLayerScope) obj);
            }
        });
    }

    static final ab pullRefreshIndicatorTransform$lambda$0(ContentDrawScope contentDrawScope) {
        int iM8217getIntersectrtfAjoo = ClipOp.Companion.m8217getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8761clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iM8217getIntersectrtfAjoo);
            contentDrawScope.drawContent();
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            return ab.f48028a;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            throw th;
        }
    }

    static final ab pullRefreshIndicatorTransform$lambda$1(PullRefreshState pullRefreshState, boolean z, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setTranslationY(pullRefreshState.getPosition$material() - Float.intBitsToFloat((int) (graphicsLayerScope.mo8406getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        if (z && !pullRefreshState.getRefreshing$material()) {
            float fTransform = EasingKt.getLinearOutSlowInEasing().transform(pullRefreshState.getPosition$material() / pullRefreshState.getThreshold$material());
            if (fTransform < 0.0f) {
                fTransform = 0.0f;
            }
            if (fTransform > 1.0f) {
                fTransform = 1.0f;
            }
            graphicsLayerScope.setScaleX(fTransform);
            graphicsLayerScope.setScaleY(fTransform);
        }
        return ab.f48028a;
    }
}
