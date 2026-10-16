package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MagnifierElement extends ModifierNodeElement<MagnifierNode> {
    public static final int $stable = 0;
    private final boolean clippingEnabled;
    private final float cornerRadius;
    private final float elevation;
    private final l<Density, Offset> magnifierCenter;
    private final l<DpSize, ab> onSizeChanged;
    private final PlatformMagnifierFactory platformMagnifierFactory;
    private final long size;
    private final l<Density, Offset> sourceCenter;
    private final boolean useTextDefault;
    private final float zoom;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MagnifierElement(l lVar, l lVar2, l lVar3, float f2, boolean z, long j2, float f3, float f4, boolean z2, PlatformMagnifierFactory platformMagnifierFactory, int i2, o oVar) {
        long jM11271getUnspecifiedMYxV2XQ = (i2 & 32) != 0 ? DpSize.Companion.m11271getUnspecifiedMYxV2XQ() : j2;
        float fM11184getUnspecifiedD9Ej5fM = (i2 & 64) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f3;
        float fM11184getUnspecifiedD9Ej5fM2 = (i2 & 128) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f4;
        int i3 = i2 & 8;
        int i4 = i2 & 4;
        int i5 = i2 & 2;
        boolean z3 = ((i2 & 16) == 0) & z;
        this(lVar, i5 == 0 ? lVar2 : null, i4 != 0 ? null : lVar3, i3 != 0 ? Float.NaN : f2, z3, jM11271getUnspecifiedMYxV2XQ, fM11184getUnspecifiedD9Ej5fM, fM11184getUnspecifiedD9Ej5fM2, (!((i2 & 256) == 0)) | z2, platformMagnifierFactory, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MagnifierNode create() {
        return new MagnifierNode(this.sourceCenter, this.magnifierCenter, this.onSizeChanged, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.platformMagnifierFactory, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.sourceCenter == magnifierElement.sourceCenter && this.magnifierCenter == magnifierElement.magnifierCenter && this.zoom == magnifierElement.zoom && this.useTextDefault == magnifierElement.useTextDefault && DpSize.m11259equalsimpl0(this.size, magnifierElement.size) && Dp.m11169equalsimpl0(this.cornerRadius, magnifierElement.cornerRadius) && Dp.m11169equalsimpl0(this.elevation, magnifierElement.elevation) && this.clippingEnabled == magnifierElement.clippingEnabled && this.onSizeChanged == magnifierElement.onSizeChanged && x.n(this.platformMagnifierFactory, magnifierElement.platformMagnifierFactory);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = this.sourceCenter.hashCode() * 31;
        l<Density, Offset> lVar = this.magnifierCenter;
        int iHashCode2 = (((((((((((((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + Float.floatToIntBits(this.zoom)) * 31) + MagnifierElement$$ExternalSyntheticBackport0.m(this.useTextDefault)) * 31) + DpSize.m11264hashCodeimpl(this.size)) * 31) + Dp.m11170hashCodeimpl(this.cornerRadius)) * 31) + Dp.m11170hashCodeimpl(this.elevation)) * 31) + MagnifierElement$$ExternalSyntheticBackport0.m(this.clippingEnabled)) * 31;
        l<DpSize, ab> lVar2 = this.onSizeChanged;
        return ((iHashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31) + this.platformMagnifierFactory.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("magnifier");
        inspectorInfo.getProperties().set("sourceCenter", this.sourceCenter);
        inspectorInfo.getProperties().set("magnifierCenter", this.magnifierCenter);
        inspectorInfo.getProperties().set("zoom", Float.valueOf(this.zoom));
        inspectorInfo.getProperties().set("size", DpSize.m11250boximpl(this.size));
        inspectorInfo.getProperties().set("cornerRadius", Dp.m11162boximpl(this.cornerRadius));
        inspectorInfo.getProperties().set("elevation", Dp.m11162boximpl(this.elevation));
        inspectorInfo.getProperties().set("clippingEnabled", Boolean.valueOf(this.clippingEnabled));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(MagnifierNode magnifierNode) {
        magnifierNode.m2046update5F03MCQ(this.sourceCenter, this.magnifierCenter, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.onSizeChanged, this.platformMagnifierFactory);
    }

    public /* synthetic */ MagnifierElement(l lVar, l lVar2, l lVar3, float f2, boolean z, long j2, float f3, float f4, boolean z2, PlatformMagnifierFactory platformMagnifierFactory, o oVar) {
        this(lVar, lVar2, lVar3, f2, z, j2, f3, f4, z2, platformMagnifierFactory);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MagnifierElement(l<? super Density, Offset> lVar, l<? super Density, Offset> lVar2, l<? super DpSize, ab> lVar3, float f2, boolean z, long j2, float f3, float f4, boolean z2, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = lVar;
        this.magnifierCenter = lVar2;
        this.onSizeChanged = lVar3;
        this.zoom = f2;
        this.useTextDefault = z;
        this.size = j2;
        this.cornerRadius = f3;
        this.elevation = f4;
        this.clippingEnabled = z2;
        this.platformMagnifierFactory = platformMagnifierFactory;
    }
}
