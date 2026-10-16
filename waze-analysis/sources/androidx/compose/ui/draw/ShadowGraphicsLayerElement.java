package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ShadowGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    public static final int $stable = 0;
    private final long ambientColor;
    private final boolean clip;
    private final float elevation;
    private final Shape shape;
    private final long spotColor;

    private ShadowGraphicsLayerElement(float f2, Shape shape, boolean z, long j2, long j3) {
        this.elevation = f2;
        this.shape = shape;
        this.clip = z;
        this.ambientColor = j2;
        this.spotColor = j3;
    }

    /* renamed from: copy-gNMxBKI$default, reason: not valid java name */
    public static /* synthetic */ ShadowGraphicsLayerElement m7814copygNMxBKI$default(ShadowGraphicsLayerElement shadowGraphicsLayerElement, float f2, Shape shape, boolean z, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = shadowGraphicsLayerElement.elevation;
        }
        if ((i2 & 2) != 0) {
            shape = shadowGraphicsLayerElement.shape;
        }
        if ((i2 & 4) != 0) {
            z = shadowGraphicsLayerElement.clip;
        }
        if ((i2 & 8) != 0) {
            j2 = shadowGraphicsLayerElement.ambientColor;
        }
        if ((i2 & 16) != 0) {
            j3 = shadowGraphicsLayerElement.spotColor;
        }
        long j4 = j3;
        boolean z2 = z;
        return shadowGraphicsLayerElement.m7818copygNMxBKI(f2, shape, z2, j2, j4);
    }

    private final l<GraphicsLayerScope, ab> createBlock() {
        return new AnonymousClass1();
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m7815component1D9Ej5fM() {
        return this.elevation;
    }

    public final Shape component2() {
        return this.shape;
    }

    public final boolean component3() {
        return this.clip;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m7816component40d7_KjU() {
        return this.ambientColor;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m7817component50d7_KjU() {
        return this.spotColor;
    }

    /* renamed from: copy-gNMxBKI, reason: not valid java name */
    public final ShadowGraphicsLayerElement m7818copygNMxBKI(float f2, Shape shape, boolean z, long j2, long j3) {
        return new ShadowGraphicsLayerElement(f2, shape, z, j2, j3, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BlockGraphicsLayerModifier create() {
        return new BlockGraphicsLayerModifier(createBlock());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return Dp.m11169equalsimpl0(this.elevation, shadowGraphicsLayerElement.elevation) && x.n(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && Color.m8229equalsimpl0(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && Color.m8229equalsimpl0(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    /* renamed from: getAmbientColor-0d7_KjU, reason: not valid java name */
    public final long m7819getAmbientColor0d7_KjU() {
        return this.ambientColor;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m7820getElevationD9Ej5fM() {
        return this.elevation;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSpotColor-0d7_KjU, reason: not valid java name */
    public final long m7821getSpotColor0d7_KjU() {
        return this.spotColor;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iM11170hashCodeimpl = (Dp.m11170hashCodeimpl(this.elevation) * 31) + this.shape.hashCode();
        long j2 = this.spotColor;
        return (((((iM11170hashCodeimpl * 31) + ShadowGraphicsLayerElement$$ExternalSyntheticBackport0.m(this.clip)) * 31) + Color.m8235hashCodeimpl(this.ambientColor)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("shadow");
        inspectorInfo.getProperties().set("elevation", Dp.m11162boximpl(this.elevation));
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.clip));
        inspectorInfo.getProperties().set("ambientColor", Color.m8218boximpl(this.ambientColor));
        inspectorInfo.getProperties().set("spotColor", Color.m8218boximpl(this.spotColor));
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) Dp.m11175toStringimpl(this.elevation)) + ", shape=" + this.shape + ", clip=" + this.clip + ", ambientColor=" + ((Object) Color.m8236toStringimpl(this.ambientColor)) + ", spotColor=" + ((Object) Color.m8236toStringimpl(this.spotColor)) + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        blockGraphicsLayerModifier.setLayerBlock(createBlock());
        blockGraphicsLayerModifier.invalidateLayerBlock();
    }

    public /* synthetic */ ShadowGraphicsLayerElement(float f2, Shape shape, boolean z, long j2, long j3, o oVar) {
        this(f2, shape, z, j2, j3);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.draw.ShadowGraphicsLayerElement$createBlock$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<GraphicsLayerScope, ab> {
        AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
            graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo2127toPx0680j_4(ShadowGraphicsLayerElement.this.m7820getElevationD9Ej5fM()));
            graphicsLayerScope.setShape(ShadowGraphicsLayerElement.this.getShape());
            graphicsLayerScope.setClip(ShadowGraphicsLayerElement.this.getClip());
            graphicsLayerScope.mo8409setAmbientShadowColor8_81llA(ShadowGraphicsLayerElement.this.m7819getAmbientColor0d7_KjU());
            graphicsLayerScope.mo8412setSpotShadowColor8_81llA(ShadowGraphicsLayerElement.this.m7821getSpotColor0d7_KjU());
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(GraphicsLayerScope graphicsLayerScope) {
            invoke2(graphicsLayerScope);
            return ab.f48028a;
        }
    }
}
