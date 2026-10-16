package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class ahox<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> iterator;

    public ahox(Iterator<Map.Entry<K, Object>> it) {
        this.iterator = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public Map.Entry<K, Object> next() {
        Map.Entry<K, Object> next = this.iterator.next();
        return next.getValue() instanceof ahoy ? new ahow(next) : next;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.iterator.remove();
    }
}
