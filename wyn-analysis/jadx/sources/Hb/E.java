package hb;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class E extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f36244b;

    public /* synthetic */ E(H h10, int i5) {
        this.f36243a = i5;
        this.f36244b = h10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f36243a) {
            case 0:
                this.f36244b.clear();
                break;
            default:
                this.f36244b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        G gA;
        Object obj2;
        Object value;
        switch (this.f36243a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                H h10 = this.f36244b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                G g9 = null;
                if (key != null) {
                    try {
                        gA = h10.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    gA = null;
                }
                if (gA != null && ((obj2 = gA.f36257h) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    g9 = gA;
                }
                return g9 != null;
            default:
                return this.f36244b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f36243a) {
            case 0:
                return new D(this.f36244b, 0);
            default:
                return new D(this.f36244b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        G gA;
        Object obj2;
        Object value;
        switch (this.f36243a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    H h10 = this.f36244b;
                    Object key = entry.getKey();
                    G g9 = null;
                    if (key != null) {
                        try {
                            gA = h10.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                    } else {
                        gA = null;
                    }
                    if (gA != null && ((obj2 = gA.f36257h) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        g9 = gA;
                    }
                    if (g9 != null) {
                        h10.d(g9, true);
                        break;
                    }
                }
                break;
            default:
                H h11 = this.f36244b;
                G gA2 = null;
                if (obj != null) {
                    try {
                        gA2 = h11.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (gA2 != null) {
                    h11.d(gA2, true);
                }
                if (gA2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f36243a) {
        }
        return this.f36244b.f36263d;
    }
}
