package androidx.datastore.preferences.protobuf;

import com.google.protobuf.F1;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import x.C4410c;
import x.C4412e;

/* loaded from: classes.dex */
public class i0 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f18226b;

    public /* synthetic */ i0(int i5, Map map) {
        this.f18225a = i5;
        this.f18226b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f18225a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((d0) this.f18226b).g((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((F1) this.f18226b).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f18225a) {
            case 0:
                ((d0) this.f18226b).clear();
                break;
            case 1:
                ((F1) this.f18226b).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f18225a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((d0) this.f18226b).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((F1) this.f18226b).get(entry2.getKey());
                Object value2 = entry2.getValue();
                return obj3 == value2 || (obj3 != null && obj3.equals(value2));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f18225a) {
            case 0:
                return new h0((d0) this.f18226b, 0);
            case 1:
                return new h0((F1) this.f18226b, 1);
            default:
                return new C4410c((C4412e) this.f18226b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f18225a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((d0) this.f18226b).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((F1) this.f18226b).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f18225a) {
            case 0:
                return ((d0) this.f18226b).size();
            case 1:
                return ((F1) this.f18226b).size();
            default:
                return ((C4412e) this.f18226b).f47563c;
        }
    }
}
