package androidx.media3.common.util;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CopyOnWriteMultiset<E> implements Iterable<E> {
    private final Object lock = new Object();
    private final Map<E, Integer> elementCounts = new HashMap();
    private Set<E> elementSet = Collections.EMPTY_SET;
    private List<E> elements = Collections.EMPTY_LIST;

    public void add(E e2) {
        synchronized (this.lock) {
            ArrayList arrayList = new ArrayList(this.elements);
            arrayList.add(e2);
            this.elements = DesugarCollections.unmodifiableList(arrayList);
            Integer num = this.elementCounts.get(e2);
            if (num == null) {
                HashSet hashSet = new HashSet(this.elementSet);
                hashSet.add(e2);
                this.elementSet = DesugarCollections.unmodifiableSet(hashSet);
            }
            this.elementCounts.put(e2, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public int count(E e2) {
        int iIntValue;
        synchronized (this.lock) {
            iIntValue = this.elementCounts.containsKey(e2) ? this.elementCounts.get(e2).intValue() : 0;
        }
        return iIntValue;
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.lock) {
            set = this.elementSet;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.lock) {
            it = this.elements.iterator();
        }
        return it;
    }

    public void remove(E e2) {
        synchronized (this.lock) {
            Integer num = this.elementCounts.get(e2);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.elements);
            arrayList.remove(e2);
            this.elements = DesugarCollections.unmodifiableList(arrayList);
            int iIntValue = num.intValue();
            Map<E, Integer> map = this.elementCounts;
            if (iIntValue == 1) {
                map.remove(e2);
                HashSet hashSet = new HashSet(this.elementSet);
                hashSet.remove(e2);
                this.elementSet = DesugarCollections.unmodifiableSet(hashSet);
            } else {
                map.put(e2, Integer.valueOf(num.intValue() - 1));
            }
        }
    }
}
