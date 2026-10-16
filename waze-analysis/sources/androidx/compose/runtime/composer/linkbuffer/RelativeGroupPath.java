package androidx.compose.runtime.composer.linkbuffer;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class RelativeGroupPath extends SourceInformationGroupPath {
    private final int index;
    private final SourceInformationGroupPath parent;

    public RelativeGroupPath(SourceInformationGroupPath sourceInformationGroupPath, int i2) {
        super(null);
        this.parent = sourceInformationGroupPath;
        this.index = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RelativeGroupPath)) {
            return false;
        }
        RelativeGroupPath relativeGroupPath = (RelativeGroupPath) obj;
        return x.n(relativeGroupPath.parent, this.parent) && relativeGroupPath.index == this.index;
    }

    @Override // androidx.compose.runtime.composer.linkbuffer.SourceInformationGroupPath
    public Object getIdentity(SlotTableAddressSpace slotTableAddressSpace) {
        return new SourceInformationSlotTableGroupIdentity(this.parent.getIdentity(slotTableAddressSpace), this.index);
    }

    public final int getIndex() {
        return this.index;
    }

    public final SourceInformationGroupPath getParent() {
        return this.parent;
    }

    public int hashCode() {
        return (this.index * 31) + this.parent.hashCode();
    }
}
