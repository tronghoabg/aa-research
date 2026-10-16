package od;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class D1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f41537a;

    /* renamed from: b, reason: collision with root package name */
    public final List f41538b;

    /* renamed from: c, reason: collision with root package name */
    public final Collection f41539c;

    /* renamed from: d, reason: collision with root package name */
    public final Collection f41540d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41541e;

    /* renamed from: f, reason: collision with root package name */
    public final G1 f41542f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f41543g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f41544h;

    public D1(List list, Collection collection, Collection collection2, G1 g12, boolean z2, boolean z10, boolean z11, int i5) {
        this.f41538b = list;
        Fe.e.t(collection, "drainedSubstreams");
        this.f41539c = collection;
        this.f41542f = g12;
        this.f41540d = collection2;
        this.f41543g = z2;
        this.f41537a = z10;
        this.f41544h = z11;
        this.f41541e = i5;
        Fe.e.w("passThrough should imply buffer is null", !z10 || list == null);
        Fe.e.w("passThrough should imply winningSubstream != null", (z10 && g12 == null) ? false : true);
        Fe.e.w("passThrough should imply winningSubstream is drained", !z10 || (collection.size() == 1 && collection.contains(g12)) || (collection.size() == 0 && g12.f41565b));
        Fe.e.w("cancelled should imply committed", (z2 && g12 == null) ? false : true);
    }

    public final D1 a(G1 g12) {
        Collection collectionUnmodifiableCollection;
        Fe.e.w("hedging frozen", !this.f41544h);
        Fe.e.w("already committed", this.f41542f == null);
        Collection collection = this.f41540d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(g12);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(g12);
            collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        return new D1(this.f41538b, this.f41539c, collectionUnmodifiableCollection, this.f41542f, this.f41543g, this.f41537a, this.f41544h, this.f41541e + 1);
    }

    public final D1 b(G1 g12) {
        ArrayList arrayList = new ArrayList(this.f41540d);
        arrayList.remove(g12);
        return new D1(this.f41538b, this.f41539c, DesugarCollections.unmodifiableCollection(arrayList), this.f41542f, this.f41543g, this.f41537a, this.f41544h, this.f41541e);
    }

    public final D1 c(G1 g12, G1 g13) {
        ArrayList arrayList = new ArrayList(this.f41540d);
        arrayList.remove(g12);
        arrayList.add(g13);
        return new D1(this.f41538b, this.f41539c, DesugarCollections.unmodifiableCollection(arrayList), this.f41542f, this.f41543g, this.f41537a, this.f41544h, this.f41541e);
    }

    public final D1 d(G1 g12) {
        g12.f41565b = true;
        Collection collection = this.f41539c;
        if (!collection.contains(g12)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.remove(g12);
        return new D1(this.f41538b, DesugarCollections.unmodifiableCollection(arrayList), this.f41540d, this.f41542f, this.f41543g, this.f41537a, this.f41544h, this.f41541e);
    }

    public final D1 e(G1 g12) {
        List list;
        Fe.e.w("Already passThrough", !this.f41537a);
        boolean z2 = g12.f41565b;
        Collection collectionUnmodifiableCollection = this.f41539c;
        if (!z2) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(g12);
            } else {
                ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                arrayList.add(g12);
                collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        G1 g13 = this.f41542f;
        boolean z10 = g13 != null;
        if (z10) {
            Fe.e.w("Another RPC attempt has already committed", g13 == g12);
            list = null;
        } else {
            list = this.f41538b;
        }
        return new D1(list, collection, this.f41540d, this.f41542f, this.f41543g, z10, this.f41544h, this.f41541e);
    }
}
