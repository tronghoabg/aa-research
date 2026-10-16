package androidx.compose.animation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SkipToLookaheadSizeElement extends ModifierNodeElement<SkipToLookaheadSizeNode> {
    public static final int $stable = 0;
    private final a<Boolean> isEnabled;
    private final ScaleToBoundsImpl scaleToBounds;

    public /* synthetic */ SkipToLookaheadSizeElement(ScaleToBoundsImpl scaleToBoundsImpl, a aVar, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : scaleToBoundsImpl, (i2 & 2) != 0 ? SkipToLookaheadSizeNodeKt.DefaultEnabled : aVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SkipToLookaheadSizeNode create() {
        return new SkipToLookaheadSizeNode(this.scaleToBounds, this.isEnabled);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof SkipToLookaheadSizeElement)) {
            return false;
        }
        SkipToLookaheadSizeElement skipToLookaheadSizeElement = (SkipToLookaheadSizeElement) obj;
        return skipToLookaheadSizeElement.isEnabled == this.isEnabled && x.n(skipToLookaheadSizeElement.scaleToBounds, this.scaleToBounds);
    }

    public final ScaleToBoundsImpl getScaleToBounds() {
        return this.scaleToBounds;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = this.isEnabled.hashCode() * 31;
        ScaleToBoundsImpl scaleToBoundsImpl = this.scaleToBounds;
        return iHashCode + (scaleToBoundsImpl != null ? scaleToBoundsImpl.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("skipToLookahead");
        inspectorInfo.getProperties().set("scaleToBounds", this.scaleToBounds);
        inspectorInfo.getProperties().set("isEnabled", this.isEnabled);
    }

    public final a<Boolean> isEnabled() {
        return this.isEnabled;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SkipToLookaheadSizeNode skipToLookaheadSizeNode) {
        skipToLookaheadSizeNode.setScaleToBounds(this.scaleToBounds);
        skipToLookaheadSizeNode.setEnabled(this.isEnabled);
    }

    public SkipToLookaheadSizeElement(ScaleToBoundsImpl scaleToBoundsImpl, a<Boolean> aVar) {
        this.scaleToBounds = scaleToBoundsImpl;
        this.isEnabled = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkipToLookaheadSizeElement() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
