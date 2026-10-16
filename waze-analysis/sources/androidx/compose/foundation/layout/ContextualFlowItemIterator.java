package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import h.a.i;
import h.g.a.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ContextualFlowItemIterator implements Iterator<Measurable>, h.g.b.a.a {
    public static final int $stable = 8;
    private final List<Measurable> _list = new ArrayList();
    private final p<Integer, FlowLineInfo, List<Measurable>> getMeasurables;
    private final int itemCount;
    private int itemIndex;
    private int listIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public ContextualFlowItemIterator(int i2, p<? super Integer, ? super FlowLineInfo, ? extends List<? extends Measurable>> pVar) {
        this.itemCount = i2;
        this.getMeasurables = pVar;
    }

    public static /* synthetic */ Measurable getNext$foundation_layout$default(ContextualFlowItemIterator contextualFlowItemIterator, FlowLineInfo flowLineInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            flowLineInfo = new FlowLineInfo(0, 0, 0.0f, 0.0f, 15, null);
        }
        return contextualFlowItemIterator.getNext$foundation_layout(flowLineInfo);
    }

    public final List<Measurable> getList() {
        return this._list;
    }

    public final Measurable getNext$foundation_layout(FlowLineInfo flowLineInfo) {
        if (this.listIndex < getList().size()) {
            Measurable measurable = getList().get(this.listIndex);
            this.listIndex++;
            return measurable;
        }
        int i2 = this.itemIndex;
        if (i2 >= this.itemCount) {
            throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.itemIndex);
        }
        List<Measurable> listInvoke = this.getMeasurables.invoke(Integer.valueOf(i2), flowLineInfo);
        this.itemIndex++;
        if (listInvoke.isEmpty()) {
            return next();
        }
        Measurable measurable2 = (Measurable) i.P(listInvoke);
        this._list.addAll(listInvoke);
        this.listIndex++;
        return measurable2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.listIndex < getList().size() || this.itemIndex < this.itemCount;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Measurable next() {
        return getNext$foundation_layout$default(this, null, 1, null);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
