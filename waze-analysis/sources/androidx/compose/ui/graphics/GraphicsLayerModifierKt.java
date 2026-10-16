package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GraphicsLayerModifierKt {
    private static ReusableGraphicsLayerScope reusableGraphicsLayerScope;

    public static final Modifier graphicsLayer(Modifier modifier, l<? super GraphicsLayerScope, ab> lVar) {
        return modifier.then(new BlockGraphicsLayerElement(lVar));
    }

    /* renamed from: graphicsLayer-2Xn7asI, reason: not valid java name */
    public static final /* synthetic */ Modifier m8391graphicsLayer2Xn7asI(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect) {
        return m8394graphicsLayer56HxDYs$default(modifier, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z, renderEffect, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor(), CompositingStrategy.Companion.m8317getAutoNrFUSI(), BlendMode.Companion.m8168getSrcOver0nO6VwU(), null, null, 524288, null);
    }

    /* renamed from: graphicsLayer-2Xn7asI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m8392graphicsLayer2Xn7asI$default(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect, int i2, Object obj) {
        long jM8671getCenterSzJe1aQ = (i2 & 1024) != 0 ? TransformOrigin.Companion.m8671getCenterSzJe1aQ() : j2;
        Shape rectangleShape = (i2 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        int i3 = i2 & 256;
        int i4 = i2 & 128;
        int i5 = i2 & 64;
        int i6 = i2 & 32;
        int i7 = i2 & 16;
        int i8 = i2 & 8;
        int i9 = i2 & 4;
        int i10 = i2 & 2;
        int i11 = i2 & 1;
        float f12 = (i2 & 512) != 0 ? 8.0f : f11;
        float f13 = i3 != 0 ? 0.0f : f10;
        float f14 = i4 != 0 ? 0.0f : f9;
        float f15 = i5 != 0 ? 0.0f : f8;
        float f16 = i6 != 0 ? 0.0f : f7;
        float f17 = i7 != 0 ? 0.0f : f6;
        float f18 = i8 == 0 ? f5 : 0.0f;
        float f19 = i9 != 0 ? 1.0f : f4;
        return m8391graphicsLayer2Xn7asI(modifier, 1 != i11 ? f2 : 1.0f, i10 != 0 ? 1.0f : f3, f19, f18, f17, f16, f15, f14, f13, f12, jM8671getCenterSzJe1aQ, rectangleShape, ((i2 & 4096) == 0) & z, (i2 & 8192) != 0 ? null : renderEffect);
    }

    /* renamed from: graphicsLayer-56HxDYs, reason: not valid java name */
    public static final Modifier m8393graphicsLayer56HxDYs(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j4, int i2, int i3, ColorFilter colorFilter, LayerOutsets layerOutsets) {
        return modifier.then(new GraphicsLayerElement(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z, renderEffect, j3, j4, i2, i3, colorFilter, layerOutsets, null));
    }

    /* renamed from: graphicsLayer-56HxDYs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m8394graphicsLayer56HxDYs$default(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j4, int i2, int i3, ColorFilter colorFilter, LayerOutsets layerOutsets, int i4, Object obj) {
        float f12;
        float f13;
        Shape shape2;
        boolean z2;
        float f14;
        RenderEffect renderEffect2;
        ColorFilter colorFilter2;
        long j5;
        long j6;
        int i5;
        int i6;
        LayerOutsets layerOutsets2;
        float f15;
        long j7;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        Modifier modifier2;
        long jM8671getCenterSzJe1aQ = (i4 & 1024) != 0 ? TransformOrigin.Companion.m8671getCenterSzJe1aQ() : j2;
        Shape rectangleShape = (i4 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        boolean z3 = ((i4 & 4096) == 0) & z;
        RenderEffect renderEffect3 = (i4 & 8192) != 0 ? null : renderEffect;
        long defaultShadowColor = (i4 & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j3;
        long defaultShadowColor2 = (32768 & i4) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j4;
        int iM8317getAutoNrFUSI = (65536 & i4) != 0 ? CompositingStrategy.Companion.m8317getAutoNrFUSI() : i2;
        int iM8168getSrcOver0nO6VwU = (131072 & i4) != 0 ? BlendMode.Companion.m8168getSrcOver0nO6VwU() : i3;
        ColorFilter colorFilter3 = (262144 & i4) == 0 ? colorFilter : null;
        LayerOutsets zero = (524288 & i4) != 0 ? LayerOutsets.Companion.getZero() : layerOutsets;
        int i7 = i4 & 256;
        long j8 = jM8671getCenterSzJe1aQ;
        int i8 = i4 & 128;
        int i9 = i4 & 64;
        int i10 = i4 & 32;
        int i11 = i4 & 16;
        int i12 = i4 & 8;
        int i13 = i4 & 4;
        int i14 = i4 & 2;
        int i15 = i4 & 1;
        float f21 = (i4 & 512) != 0 ? 8.0f : f11;
        float f22 = i7 != 0 ? 0.0f : f10;
        float f23 = i8 != 0 ? 0.0f : f9;
        float f24 = i9 != 0 ? 0.0f : f8;
        float f25 = i10 != 0 ? 0.0f : f7;
        float f26 = i11 != 0 ? 0.0f : f6;
        float f27 = i12 == 0 ? f5 : 0.0f;
        float f28 = i13 != 0 ? 1.0f : f4;
        float f29 = i14 != 0 ? 1.0f : f3;
        float f30 = f23;
        if (1 == i15) {
            f12 = 1.0f;
            modifier2 = modifier;
            f13 = f24;
            shape2 = rectangleShape;
            z2 = z3;
            f14 = f22;
            renderEffect2 = renderEffect3;
            colorFilter2 = colorFilter3;
            j5 = defaultShadowColor;
            j6 = defaultShadowColor2;
            i5 = iM8317getAutoNrFUSI;
            i6 = iM8168getSrcOver0nO6VwU;
            layerOutsets2 = zero;
            f15 = f21;
            j7 = j8;
            f16 = f25;
            f17 = f26;
            f18 = f28;
            f19 = f29;
            f20 = f27;
        } else {
            f12 = f2;
            f13 = f24;
            shape2 = rectangleShape;
            z2 = z3;
            f14 = f22;
            renderEffect2 = renderEffect3;
            colorFilter2 = colorFilter3;
            j5 = defaultShadowColor;
            j6 = defaultShadowColor2;
            i5 = iM8317getAutoNrFUSI;
            i6 = iM8168getSrcOver0nO6VwU;
            layerOutsets2 = zero;
            f15 = f21;
            j7 = j8;
            f16 = f25;
            f17 = f26;
            f18 = f28;
            f19 = f29;
            f20 = f27;
            modifier2 = modifier;
        }
        return m8393graphicsLayer56HxDYs(modifier2, f12, f19, f18, f20, f17, f16, f13, f30, f14, f15, j7, shape2, z2, renderEffect2, j5, j6, i5, i6, colorFilter2, layerOutsets2);
    }

    /* renamed from: graphicsLayer-Ap8cVGQ, reason: not valid java name */
    public static final /* synthetic */ Modifier m8395graphicsLayerAp8cVGQ(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j4, int i2) {
        return m8394graphicsLayer56HxDYs$default(modifier, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z, renderEffect, j3, j4, i2, BlendMode.Companion.m8168getSrcOver0nO6VwU(), null, null, 524288, null);
    }

    /* renamed from: graphicsLayer-Ap8cVGQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m8396graphicsLayerAp8cVGQ$default(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j4, int i2, int i3, Object obj) {
        float f12;
        long j5;
        Shape shape2;
        boolean z2;
        RenderEffect renderEffect2;
        long j6;
        long j7;
        int i4;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        Modifier modifier2;
        long jM8671getCenterSzJe1aQ = (i3 & 1024) != 0 ? TransformOrigin.Companion.m8671getCenterSzJe1aQ() : j2;
        Shape rectangleShape = (i3 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        boolean z3 = ((i3 & 4096) == 0) & z;
        RenderEffect renderEffect3 = (i3 & 8192) != 0 ? null : renderEffect;
        long defaultShadowColor = (i3 & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j3;
        long defaultShadowColor2 = (32768 & i3) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j4;
        int iM8317getAutoNrFUSI = (65536 & i3) != 0 ? CompositingStrategy.Companion.m8317getAutoNrFUSI() : i2;
        int i5 = i3 & 256;
        int i6 = i3 & 128;
        int i7 = i3 & 64;
        int i8 = i3 & 32;
        int i9 = i3 & 16;
        int i10 = i3 & 8;
        int i11 = i3 & 4;
        int i12 = i3 & 2;
        int i13 = i3 & 1;
        float f22 = (i3 & 512) != 0 ? 8.0f : f11;
        float f23 = i5 != 0 ? 0.0f : f10;
        float f24 = i6 != 0 ? 0.0f : f9;
        float f25 = i7 != 0 ? 0.0f : f8;
        float f26 = i8 != 0 ? 0.0f : f7;
        float f27 = i9 != 0 ? 0.0f : f6;
        float f28 = i10 == 0 ? f5 : 0.0f;
        float f29 = i11 != 0 ? 1.0f : f4;
        float f30 = i12 != 0 ? 1.0f : f3;
        if (1 == i13) {
            f12 = 1.0f;
            modifier2 = modifier;
            j5 = jM8671getCenterSzJe1aQ;
            shape2 = rectangleShape;
            z2 = z3;
            renderEffect2 = renderEffect3;
            j6 = defaultShadowColor;
            j7 = defaultShadowColor2;
            i4 = iM8317getAutoNrFUSI;
            f13 = f22;
            f14 = f23;
            f15 = f24;
            f16 = f25;
            f17 = f26;
            f18 = f27;
            f19 = f29;
            f20 = f30;
            f21 = f28;
        } else {
            f12 = f2;
            j5 = jM8671getCenterSzJe1aQ;
            shape2 = rectangleShape;
            z2 = z3;
            renderEffect2 = renderEffect3;
            j6 = defaultShadowColor;
            j7 = defaultShadowColor2;
            i4 = iM8317getAutoNrFUSI;
            f13 = f22;
            f14 = f23;
            f15 = f24;
            f16 = f25;
            f17 = f26;
            f18 = f27;
            f19 = f29;
            f20 = f30;
            f21 = f28;
            modifier2 = modifier;
        }
        return m8395graphicsLayerAp8cVGQ(modifier2, f12, f20, f19, f21, f18, f17, f16, f15, f14, f13, j5, shape2, z2, renderEffect2, j6, j7, i4);
    }

    /* renamed from: graphicsLayer-_6ThJ44, reason: not valid java name */
    public static final /* synthetic */ Modifier m8397graphicsLayer_6ThJ44(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j4, int i2, int i3, ColorFilter colorFilter) {
        return modifier.then(new GraphicsLayerElement(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z, renderEffect, j3, j4, i2, i3, colorFilter, LayerOutsets.Companion.getZero(), null));
    }

    /* renamed from: graphicsLayer-_6ThJ44$default, reason: not valid java name */
    public static /* synthetic */ Modifier m8398graphicsLayer_6ThJ44$default(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j4, int i2, int i3, ColorFilter colorFilter, int i4, Object obj) {
        long jM8671getCenterSzJe1aQ = (i4 & 1024) != 0 ? TransformOrigin.Companion.m8671getCenterSzJe1aQ() : j2;
        Shape rectangleShape = (i4 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        boolean z2 = ((i4 & 4096) == 0) & z;
        RenderEffect renderEffect2 = (i4 & 8192) != 0 ? null : renderEffect;
        long defaultShadowColor = (i4 & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j3;
        long defaultShadowColor2 = (32768 & i4) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j4;
        int iM8317getAutoNrFUSI = (65536 & i4) != 0 ? CompositingStrategy.Companion.m8317getAutoNrFUSI() : i2;
        int iM8168getSrcOver0nO6VwU = (131072 & i4) != 0 ? BlendMode.Companion.m8168getSrcOver0nO6VwU() : i3;
        int i5 = i4 & 256;
        int i6 = i4 & 128;
        int i7 = i4 & 64;
        int i8 = i4 & 32;
        int i9 = i4 & 16;
        int i10 = i4 & 8;
        int i11 = i4 & 4;
        int i12 = i4 & 2;
        int i13 = i4 & 1;
        float f12 = (i4 & 512) != 0 ? 8.0f : f11;
        float f13 = i5 != 0 ? 0.0f : f10;
        float f14 = i6 != 0 ? 0.0f : f9;
        float f15 = i7 != 0 ? 0.0f : f8;
        float f16 = i8 != 0 ? 0.0f : f7;
        float f17 = i9 != 0 ? 0.0f : f6;
        float f18 = i10 == 0 ? f5 : 0.0f;
        float f19 = i11 != 0 ? 1.0f : f4;
        return m8397graphicsLayer_6ThJ44(modifier, 1 != i13 ? f2 : 1.0f, i12 != 0 ? 1.0f : f3, f19, f18, f17, f16, f15, f14, f13, f12, jM8671getCenterSzJe1aQ, rectangleShape, z2, renderEffect2, defaultShadowColor, defaultShadowColor2, iM8317getAutoNrFUSI, iM8168getSrcOver0nO6VwU, (i4 & 262144) != 0 ? null : colorFilter);
    }

    /* renamed from: graphicsLayer-pANQ8Wg, reason: not valid java name */
    public static final /* synthetic */ Modifier m8399graphicsLayerpANQ8Wg(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j4) {
        return m8394graphicsLayer56HxDYs$default(modifier, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z, renderEffect, j3, j4, CompositingStrategy.Companion.m8317getAutoNrFUSI(), BlendMode.Companion.m8168getSrcOver0nO6VwU(), null, null, 524288, null);
    }

    /* renamed from: graphicsLayer-pANQ8Wg$default, reason: not valid java name */
    public static /* synthetic */ Modifier m8400graphicsLayerpANQ8Wg$default(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j4, int i2, Object obj) {
        float f12;
        long j5;
        Shape shape2;
        boolean z2;
        RenderEffect renderEffect2;
        long j6;
        long j7;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        Modifier modifier2;
        long jM8671getCenterSzJe1aQ = (i2 & 1024) != 0 ? TransformOrigin.Companion.m8671getCenterSzJe1aQ() : j2;
        Shape rectangleShape = (i2 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        boolean z3 = ((i2 & 4096) == 0) & z;
        RenderEffect renderEffect3 = (i2 & 8192) != 0 ? null : renderEffect;
        long defaultShadowColor = (i2 & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j3;
        long defaultShadowColor2 = (32768 & i2) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j4;
        int i3 = i2 & 256;
        int i4 = i2 & 128;
        int i5 = i2 & 64;
        int i6 = i2 & 32;
        int i7 = i2 & 16;
        int i8 = i2 & 8;
        int i9 = i2 & 4;
        int i10 = i2 & 2;
        int i11 = i2 & 1;
        float f22 = (i2 & 512) != 0 ? 8.0f : f11;
        float f23 = i3 != 0 ? 0.0f : f10;
        float f24 = i4 != 0 ? 0.0f : f9;
        float f25 = i5 != 0 ? 0.0f : f8;
        float f26 = i6 != 0 ? 0.0f : f7;
        float f27 = i7 != 0 ? 0.0f : f6;
        float f28 = i8 == 0 ? f5 : 0.0f;
        float f29 = i9 != 0 ? 1.0f : f4;
        float f30 = i10 != 0 ? 1.0f : f3;
        if (1 == i11) {
            f12 = 1.0f;
            modifier2 = modifier;
            j5 = jM8671getCenterSzJe1aQ;
            shape2 = rectangleShape;
            z2 = z3;
            renderEffect2 = renderEffect3;
            j6 = defaultShadowColor;
            j7 = defaultShadowColor2;
            f13 = f22;
            f14 = f23;
            f15 = f24;
            f16 = f25;
            f17 = f26;
            f18 = f27;
            f19 = f29;
            f20 = f30;
            f21 = f28;
        } else {
            f12 = f2;
            j5 = jM8671getCenterSzJe1aQ;
            shape2 = rectangleShape;
            z2 = z3;
            renderEffect2 = renderEffect3;
            j6 = defaultShadowColor;
            j7 = defaultShadowColor2;
            f13 = f22;
            f14 = f23;
            f15 = f24;
            f16 = f25;
            f17 = f26;
            f18 = f27;
            f19 = f29;
            f20 = f30;
            f21 = f28;
            modifier2 = modifier;
        }
        return m8399graphicsLayerpANQ8Wg(modifier2, f12, f20, f19, f21, f18, f17, f16, f15, f14, f13, j5, shape2, z2, renderEffect2, j6, j7);
    }

    /* renamed from: graphicsLayer-sKFY_QE, reason: not valid java name */
    public static final /* synthetic */ Modifier m8401graphicsLayersKFY_QE(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z) {
        return m8394graphicsLayer56HxDYs$default(modifier, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z, null, 0L, 0L, 0, BlendMode.Companion.m8168getSrcOver0nO6VwU(), null, null, 638976, null);
    }

    /* renamed from: graphicsLayer-sKFY_QE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m8402graphicsLayersKFY_QE$default(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, int i2, Object obj) {
        long jM8671getCenterSzJe1aQ = (i2 & 1024) != 0 ? TransformOrigin.Companion.m8671getCenterSzJe1aQ() : j2;
        Shape rectangleShape = (i2 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        int i3 = i2 & 256;
        int i4 = i2 & 128;
        int i5 = i2 & 64;
        int i6 = i2 & 32;
        int i7 = i2 & 16;
        int i8 = i2 & 8;
        int i9 = i2 & 4;
        int i10 = i2 & 2;
        int i11 = i2 & 1;
        float f12 = (i2 & 512) != 0 ? 8.0f : f11;
        float f13 = i3 != 0 ? 0.0f : f10;
        float f14 = i4 != 0 ? 0.0f : f9;
        float f15 = i5 != 0 ? 0.0f : f8;
        float f16 = i6 != 0 ? 0.0f : f7;
        float f17 = i7 != 0 ? 0.0f : f6;
        float f18 = i8 == 0 ? f5 : 0.0f;
        float f19 = i9 != 0 ? 1.0f : f4;
        return m8401graphicsLayersKFY_QE(modifier, 1 != i11 ? f2 : 1.0f, i10 != 0 ? 1.0f : f3, f19, f18, f17, f16, f15, f14, f13, f12, jM8671getCenterSzJe1aQ, rectangleShape, ((i2 & 4096) == 0) & z);
    }

    public static final Modifier toolingGraphicsLayer(Modifier modifier) {
        return InspectableValueKt.isDebugInspectorInfoEnabled() ? modifier.then(m8394graphicsLayer56HxDYs$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, null, 1048575, null)) : modifier;
    }
}
