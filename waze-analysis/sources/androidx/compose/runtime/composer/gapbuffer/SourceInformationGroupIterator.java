package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.tooling.CompositionGroup;
import h.e;
import h.g.b.a.a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SourceInformationGroupIterator implements Iterator<CompositionGroup>, a {
    private final GapGroupSourceInformation group;
    private int index;
    private final int parent;
    private final SourceInformationGroupPath path;
    private final SlotTable table;
    private final int version;

    public SourceInformationGroupIterator(SlotTable slotTable, int i2, GapGroupSourceInformation gapGroupSourceInformation, SourceInformationGroupPath sourceInformationGroupPath) {
        this.table = slotTable;
        this.parent = i2;
        this.group = gapGroupSourceInformation;
        this.path = sourceInformationGroupPath;
        this.version = slotTable.getVersion$runtime();
    }

    public final GapGroupSourceInformation getGroup() {
        return this.group;
    }

    public final int getParent() {
        return this.parent;
    }

    public final SourceInformationGroupPath getPath() {
        return this.path;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> groups = this.group.getGroups();
        return groups != null && this.index < groups.size();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public CompositionGroup next() {
        Object obj;
        ArrayList<Object> groups = this.group.getGroups();
        if (groups != null) {
            int i2 = this.index;
            this.index = i2 + 1;
            obj = groups.get(i2);
        } else {
            obj = null;
        }
        if (obj instanceof GapAnchor) {
            return new SlotTableGroup(this.table, ((GapAnchor) obj).getLocation$runtime(), this.version);
        }
        if (obj instanceof GapGroupSourceInformation) {
            return new SourceInformationSlotTableGroup(this.table, this.parent, (GapGroupSourceInformation) obj, new RelativeGroupPath(this.path, this.index - 1));
        }
        ComposerKt.composeRuntimeError("Unexpected group information structure");
        throw new e();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
