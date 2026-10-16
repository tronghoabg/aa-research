package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerKt;
import h.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LinkAnchorKt {
    private static final LinkAnchor NullAnchor = new LinkAnchor(-1);
    private static final LinkAnchor LazyAnchor = new LinkAnchor(0);

    public static final AnchorHandle anchorHandle(SlotTableAddressSpace slotTableAddressSpace, long j2) {
        return new AnchorHandle(anchorHandle$anchorOf(slotTableAddressSpace, GroupHandleKt.getGroup(j2)), anchorHandle$anchorOf(slotTableAddressSpace, GroupHandleKt.getContext(j2)));
    }

    private static final LinkAnchor anchorHandle$anchorOf(SlotTableAddressSpace slotTableAddressSpace, int i2) {
        return i2 != -1 ? i2 != 0 ? slotTableAddressSpace.anchorOfAddress(i2) : LazyAnchor : NullAnchor;
    }

    public static final LinkAnchor asLinkAnchor(Anchor anchor) {
        LinkAnchor linkAnchor = anchor instanceof LinkAnchor ? (LinkAnchor) anchor : null;
        if (linkAnchor != null) {
            return linkAnchor;
        }
        ComposerKt.composeRuntimeError("Inconsistent composition");
        throw new e();
    }

    public static final LinkAnchor getLazyAnchor() {
        return LazyAnchor;
    }

    public static final LinkAnchor getNullAnchor() {
        return NullAnchor;
    }

    public static final boolean ownsHandle(SlotTableAddressSpace slotTableAddressSpace, AnchorHandle anchorHandle) {
        return anchorHandle.ownedBy$runtime(slotTableAddressSpace);
    }
}
