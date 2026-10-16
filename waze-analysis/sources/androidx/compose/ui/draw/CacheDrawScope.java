package androidx.compose.ui.draw;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.shadow.ShadowContext;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CacheDrawScope implements Density {
    public static final int $stable = 0;
    private BuildDrawCacheParams cacheParams = EmptyBuildDrawCacheParams.INSTANCE;
    private ContentDrawScope contentDrawScope;
    private DrawResult drawResult;
    private a<? extends GraphicsContext> graphicsContextProvider;

    /* renamed from: record-TdoYBX4$default, reason: not valid java name */
    public static /* synthetic */ void m7759recordTdoYBX4$default(CacheDrawScope cacheDrawScope, GraphicsLayer graphicsLayer, Density density, LayoutDirection layoutDirection, long j2, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            density = cacheDrawScope;
        }
        Density density2 = density;
        if ((i2 & 2) != 0) {
            layoutDirection = cacheDrawScope.getLayoutDirection();
        }
        LayoutDirection layoutDirection2 = layoutDirection;
        if ((i2 & 4) != 0) {
            j2 = IntSizeKt.m11350toIntSizeuvyYCjk(cacheDrawScope.m7760getSizeNHjbRc());
        }
        cacheDrawScope.m7761recordTdoYBX4(graphicsLayer, density2, layoutDirection2, j2, lVar);
    }

    public final BuildDrawCacheParams getCacheParams$ui() {
        return this.cacheParams;
    }

    public final ContentDrawScope getContentDrawScope$ui() {
        return this.contentDrawScope;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    public final DrawResult getDrawResult$ui() {
        return this.drawResult;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }

    public final a<GraphicsContext> getGraphicsContextProvider$ui() {
        return this.graphicsContextProvider;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m7760getSizeNHjbRc() {
        return this.cacheParams.mo7758getSizeNHjbRc();
    }

    public final GraphicsLayer obtainGraphicsLayer() {
        a<? extends GraphicsContext> aVar = this.graphicsContextProvider;
        if (aVar == null) {
            x.g();
        }
        return aVar.invoke().createGraphicsLayer();
    }

    public final ShadowContext obtainShadowContext() {
        a<? extends GraphicsContext> aVar = this.graphicsContextProvider;
        if (aVar == null) {
            x.g();
        }
        return aVar.invoke().getShadowContext();
    }

    public final DrawResult onDrawBehind(l<? super DrawScope, ab> lVar) {
        return onDrawWithContent(new AnonymousClass1(lVar));
    }

    public final DrawResult onDrawWithContent(l<? super ContentDrawScope, ab> lVar) {
        DrawResult drawResult = new DrawResult(lVar);
        this.drawResult = drawResult;
        return drawResult;
    }

    /* renamed from: record-TdoYBX4, reason: not valid java name */
    public final void m7761recordTdoYBX4(GraphicsLayer graphicsLayer, Density density, LayoutDirection layoutDirection, long j2, l<? super ContentDrawScope, ab> lVar) {
        ContentDrawScope contentDrawScope = this.contentDrawScope;
        if (contentDrawScope == null) {
            x.g();
        }
        contentDrawScope.mo8752recordJVtK1S4(graphicsLayer, j2, new CacheDrawScope$record$1$1(lVar, contentDrawScope, density, layoutDirection, contentDrawScope.getDrawContext().getDensity(), contentDrawScope.getDrawContext().getLayoutDirection()));
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo2120roundToPxR2X_6o(long j2) {
        return Density.CC.m11128$default$roundToPxR2X_6o(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo2121roundToPx0680j_4(float f2) {
        return Density.CC.m11129$default$roundToPx0680j_4(this, f2);
    }

    public final void setCacheParams$ui(BuildDrawCacheParams buildDrawCacheParams) {
        this.cacheParams = buildDrawCacheParams;
    }

    public final void setContentDrawScope$ui(ContentDrawScope contentDrawScope) {
        this.contentDrawScope = contentDrawScope;
    }

    public final void setDrawResult$ui(DrawResult drawResult) {
        this.drawResult = drawResult;
    }

    public final void setGraphicsContextProvider$ui(a<? extends GraphicsContext> aVar) {
        this.graphicsContextProvider = aVar;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo2122toDpGaN1DYA(long j2) {
        return FontScaling.CC.m11273$default$toDpGaN1DYA(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo2123toDpu2uoSUM(float f2) {
        return Density.CC.m11130$default$toDpu2uoSUM(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo2125toDpSizekrfVVM(long j2) {
        return Density.CC.m11132$default$toDpSizekrfVVM(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo2126toPxR2X_6o(long j2) {
        return Density.CC.m11133$default$toPxR2X_6o(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo2127toPx0680j_4(float f2) {
        return Density.CC.m11134$default$toPx0680j_4(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return Density.CC.$default$toRect(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo2128toSizeXkaWNTQ(long j2) {
        return Density.CC.m11135$default$toSizeXkaWNTQ(this, j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo2129toSp0xMU5do(float f2) {
        return FontScaling.CC.m11274$default$toSp0xMU5do(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo2130toSpkPz2Gy4(float f2) {
        return Density.CC.m11136$default$toSpkPz2Gy4(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo2124toDpu2uoSUM(int i2) {
        return Density.CC.m11131$default$toDpu2uoSUM((Density) this, i2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo2131toSpkPz2Gy4(int i2) {
        return Density.CC.m11137$default$toSpkPz2Gy4((Density) this, i2);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends y implements l<ContentDrawScope, ab> {
        final /* synthetic */ l<DrawScope, ab> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super DrawScope, ab> lVar) {
            super(1);
            this.$block = lVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ContentDrawScope contentDrawScope) {
            this.$block.invoke(contentDrawScope);
            contentDrawScope.drawContent();
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(ContentDrawScope contentDrawScope) {
            invoke2(contentDrawScope);
            return ab.f48028a;
        }
    }
}
