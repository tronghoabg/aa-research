package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.composer.gapbuffer.BitVector;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SourceInformationGroupDataIterator implements Iterable<Object>, Iterator<Object>, h.g.b.a.a {
    private final int base;
    private final int end;
    private final BitVector filter;
    private int index;
    private final int start;
    private final SlotTable table;

    public SourceInformationGroupDataIterator(SlotTable slotTable, int i2, LinkGroupSourceInformation linkGroupSourceInformation) {
        this.table = slotTable;
        int i3 = i2 + 5;
        this.base = slotTable.getAddressSpace().getGroups()[i3] >> 4;
        this.start = linkGroupSourceInformation.getDataStartOffset();
        int dataEndOffset = linkGroupSourceInformation.getDataEndOffset();
        if (dataEndOffset <= 0) {
            SlotTableAddressSpace addressSpace = slotTable.getAddressSpace();
            int i4 = addressSpace.getGroups()[i3];
            if (i4 == -1) {
                dataEndOffset = 0;
            } else {
                dataEndOffset = (i4 & 15) + 1;
                if (dataEndOffset > 15) {
                    dataEndOffset = addressSpace.getLargeSizes().get(i4 >> 4);
                }
            }
        }
        this.end = dataEndOffset;
        BitVector bitVector = new BitVector();
        ArrayList<Object> groups = linkGroupSourceInformation.getGroups();
        if (groups != null) {
            ArrayList<Object> arrayList = groups;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = arrayList.get(i5);
                if (obj instanceof LinkGroupSourceInformation) {
                    LinkGroupSourceInformation linkGroupSourceInformation2 = (LinkGroupSourceInformation) obj;
                    bitVector.setRange(linkGroupSourceInformation2.getDataStartOffset(), linkGroupSourceInformation2.getDataEndOffset());
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
            Object[] slots = this.table.getAddressSpace().getSlots();
            int i3 = this.base;
            int i4 = this.index;
            obj = slots[i3 + i4];
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
