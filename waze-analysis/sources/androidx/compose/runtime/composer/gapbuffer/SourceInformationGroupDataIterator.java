package androidx.compose.runtime.composer.gapbuffer;

import h.g.b.a.a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SourceInformationGroupDataIterator implements Iterable<Object>, Iterator<Object>, a {
    private final int base;
    private final int end;
    private final BitVector filter;
    private int index;
    private final int start;
    private final SlotTable table;

    public SourceInformationGroupDataIterator(SlotTable slotTable, int i2, GapGroupSourceInformation gapGroupSourceInformation) {
        this.table = slotTable;
        int i3 = slotTable.getGroups()[(i2 * 5) + 4];
        this.base = i3;
        this.start = gapGroupSourceInformation.getDataStartOffset();
        int dataEndOffset = gapGroupSourceInformation.getDataEndOffset();
        if (dataEndOffset <= 0) {
            int i4 = i2 + 1;
            dataEndOffset = (i4 < slotTable.getGroupsSize() ? slotTable.getGroups()[(i4 * 5) + 4] : slotTable.getSlotsSize()) - i3;
        }
        this.end = dataEndOffset;
        BitVector bitVector = new BitVector();
        ArrayList<Object> groups = gapGroupSourceInformation.getGroups();
        if (groups != null) {
            ArrayList<Object> arrayList = groups;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = arrayList.get(i5);
                if (obj instanceof GapGroupSourceInformation) {
                    GapGroupSourceInformation gapGroupSourceInformation2 = (GapGroupSourceInformation) obj;
                    bitVector.setRange(gapGroupSourceInformation2.getDataStartOffset(), gapGroupSourceInformation2.getDataEndOffset());
                }
            }
        }
        this.filter = bitVector;
        this.index = bitVector.nextClear(this.start);
    }

    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i2 = this.index;
        Object obj = null;
        if (i2 >= 0 && i2 < this.end) {
            SlotTable slotTable = this.table;
            int i3 = this.base;
            Object[] objArrM7429getSlots = slotTable.m7429getSlots();
            int i4 = this.index;
            obj = objArrM7429getSlots[i3 + i4];
            i2 = i4;
        }
        this.index = this.filter.nextClear(i2 + 1);
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
