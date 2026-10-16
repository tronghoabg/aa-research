package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class WrapContentElement extends ModifierNodeElement<WrapContentNode> {
    public static final Companion Companion = new Companion(null);
    private final Object align;
    private final p<IntSize, LayoutDirection, IntOffset> alignmentCallback;
    private final Direction direction;
    private final String inspectorName;
    private final boolean unbounded;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(Direction direction, boolean z, p<? super IntSize, ? super LayoutDirection, IntOffset> pVar, Object obj, String str) {
        this.direction = direction;
        this.unbounded = z;
        this.alignmentCallback = pVar;
        this.align = obj;
        this.inspectorName = str;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public WrapContentNode create() {
        return new WrapContentNode(this.direction, this.unbounded, this.alignmentCallback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.direction == wrapContentElement.direction && this.unbounded == wrapContentElement.unbounded && x.n(this.align, wrapContentElement.align);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.direction.hashCode() * 31) + WrapContentElement$$ExternalSyntheticBackport0.m(this.unbounded)) * 31) + this.align.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.getProperties().set("align", this.align);
        inspectorInfo.getProperties().set("unbounded", Boolean.valueOf(this.unbounded));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(WrapContentNode wrapContentNode) {
        wrapContentNode.setDirection(this.direction);
        wrapContentNode.setUnbounded(this.unbounded);
        wrapContentNode.setAlignmentCallback(this.alignmentCallback);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final WrapContentElement height(final Alignment.Vertical vertical, boolean z) {
            return new WrapContentElement(Direction.Vertical, z, new p() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    Alignment.Vertical vertical2 = vertical;
                    IntSize intSize = (IntSize) obj;
                    return IntOffset.m11287boximpl(vertical2.align(0, (int) (intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                }
            }, vertical, "wrapContentHeight");
        }

        public final WrapContentElement size(final Alignment alignment, boolean z) {
            return new WrapContentElement(Direction.Both, z, new p() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return IntOffset.m11287boximpl(alignment.mo7648alignKFBX0sM(IntSize.Companion.m11344getZeroYbymL2g(), ((IntSize) obj).m11343unboximpl(), (LayoutDirection) obj2));
                }
            }, alignment, "wrapContentSize");
        }

        public final WrapContentElement width(final Alignment.Horizontal horizontal, boolean z) {
            return new WrapContentElement(Direction.Horizontal, z, new p() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    Alignment.Horizontal horizontal2 = horizontal;
                    IntSize intSize = (IntSize) obj;
                    LayoutDirection layoutDirection = (LayoutDirection) obj2;
                    return IntOffset.m11287boximpl(horizontal2.align(0, (int) (intSize.m11343unboximpl() >> 32), layoutDirection) << 32);
                }
            }, horizontal, "wrapContentWidth");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
