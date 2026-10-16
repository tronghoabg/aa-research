package androidx.compose.runtime.composer.gapbuffer;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnchoredGroupPath extends SourceInformationGroupPath {
    private final int group;

    public AnchoredGroupPath(int i2) {
        super(null);
        this.group = i2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AnchoredGroupPath) && ((AnchoredGroupPath) obj).group == this.group;
    }

    public final int getGroup() {
        return this.group;
    }

    @Override // androidx.compose.runtime.composer.gapbuffer.SourceInformationGroupPath
    public Object getIdentity(SlotTable slotTable) {
        return slotTable.anchor(this.group);
    }

    public int hashCode() {
        return this.group * 31;
    }
}
