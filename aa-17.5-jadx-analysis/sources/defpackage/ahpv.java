package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class ahpv implements Iterator {
    private Iterator<Map.Entry> lazyOverflowIterator;
    private boolean nextCalledBeforeRemove;
    private int pos;
    final /* synthetic */ ahpx this$0;

    private ahpv(ahpx ahpxVar) {
        this.this$0 = ahpxVar;
        this.pos = -1;
    }

    private Iterator<Map.Entry> getOverflowIterator() {
        Iterator<Map.Entry> it = this.lazyOverflowIterator;
        if (it != null) {
            return it;
        }
        Iterator<Map.Entry> it2 = this.this$0.overflowEntries.entrySet().iterator();
        this.lazyOverflowIterator = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.pos + 1 < this.this$0.entryList.size() || getOverflowIterator().hasNext();
    }

    @Override // java.util.Iterator
    public Map.Entry next() {
        this.nextCalledBeforeRemove = true;
        int i = this.pos + 1;
        this.pos = i;
        return i < this.this$0.entryList.size() ? (Map.Entry) this.this$0.entryList.get(this.pos) : getOverflowIterator().next();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.nextCalledBeforeRemove) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.nextCalledBeforeRemove = false;
        this.this$0.checkMutable();
        if (this.pos >= this.this$0.entryList.size()) {
            getOverflowIterator().remove();
            return;
        }
        ahpx ahpxVar = this.this$0;
        int i = this.pos;
        this.pos = i - 1;
        ahpxVar.removeArrayEntryAt(i);
    }

    public /* synthetic */ ahpv(ahpx ahpxVar, ahpq ahpqVar) {
        this(ahpxVar);
    }
}
