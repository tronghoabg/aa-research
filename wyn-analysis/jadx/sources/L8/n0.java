package l8;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class n0 extends q0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f40146c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set f40147d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Set set, Set set2, int i5) {
        super(1);
        this.f40145b = i5;
        this.f40146c = set;
        this.f40147d = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f40145b) {
            case 0:
                return this.f40146c.contains(obj) || this.f40147d.contains(obj);
            default:
                return ((AbstractC3414P) this.f40146c).contains(obj) && ((AbstractC3414P) this.f40147d).contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f40145b) {
            case 1:
                return ((AbstractC3414P) this.f40146c).containsAll(collection) && ((AbstractC3414P) this.f40147d).containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f40145b) {
            case 0:
                return this.f40146c.isEmpty() && this.f40147d.isEmpty();
            default:
                return Collections.disjoint((AbstractC3414P) this.f40147d, (AbstractC3414P) this.f40146c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f40145b) {
            case 0:
                return new m0(this);
            default:
                return new C3416S(this);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f40145b) {
            case 0:
                Set set = this.f40146c;
                int size = set.size();
                Iterator it = this.f40147d.iterator();
                while (it.hasNext()) {
                    if (!set.contains(it.next())) {
                        size++;
                    }
                }
                return size;
            default:
                Iterator it2 = ((AbstractC3414P) this.f40146c).iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    if (((AbstractC3414P) this.f40147d).contains(it2.next())) {
                        i5++;
                    }
                }
                return i5;
        }
    }
}
