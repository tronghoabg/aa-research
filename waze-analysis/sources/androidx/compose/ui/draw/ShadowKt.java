package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ShadowKt {
    public static final Modifier dropShadow(Modifier modifier, Shape shape, Shadow shadow) {
        return modifier.then(new SimpleDropShadowElement(shape, shadow));
    }

    public static final Modifier innerShadow(Modifier modifier, Shape shape, Shadow shadow) {
        return modifier.then(new SimpleInnerShadowElement(shape, shadow));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetShadow(ShadowScope shadowScope) {
        shadowScope.setRadius(0.0f);
        shadowScope.setSpread(0.0f);
        shadowScope.mo7744setOffsetk4lQ0M(Offset.Companion.m7996getZeroF1C5BW0());
        shadowScope.mo7743setColor8_81llA(Color.Companion.m8254getBlack0d7_KjU());
        shadowScope.setBrush(null);
        shadowScope.setAlpha(1.0f);
        shadowScope.mo7742setBlendModes9anfk8(BlendMode.Companion.m8168getSrcOver0nO6VwU());
    }

    /* renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m7822shadows4CzXII(Modifier modifier, float f2, Shape shape, boolean z, long j2, long j3) {
        return (Dp.m11163compareTo0680j_4(f2, 0.0f) > 0 || z) ? modifier.then(new ShadowGraphicsLayerElement(f2, shape, z, j2, j3, null)) : modifier;
    }

    /* renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7823shadows4CzXII$default(Modifier modifier, float f2, Shape shape, boolean z, long j2, long j3, int i2, Object obj) {
        return m7822shadows4CzXII(modifier, f2, (i2 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i2 & 4) != 0 ? Dp.m11163compareTo0680j_4(f2, 0.0f) > 0 : z, (i2 & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j2, (i2 & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j3);
    }

    /* renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m7824shadowziNgDLE(Modifier modifier, float f2, Shape shape, boolean z) {
        return m7822shadows4CzXII(modifier, f2, shape, z, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7825shadowziNgDLE$default(Modifier modifier, float f2, Shape shape, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i2 & 4) != 0) {
            z = Dp.m11163compareTo0680j_4(f2, 0.0f) > 0;
        }
        return m7824shadowziNgDLE(modifier, f2, shape, z);
    }

    public static final Modifier dropShadow(Modifier modifier, Shape shape, l<? super DropShadowScope, ab> lVar) {
        return modifier.then(new BlockDropShadowElement(shape, lVar));
    }

    public static final Modifier innerShadow(Modifier modifier, Shape shape, l<? super InnerShadowScope, ab> lVar) {
        return modifier.then(new BlockInnerShadowElement(shape, lVar));
    }
}
