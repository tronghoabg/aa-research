package e.a.d;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class in {

    /* renamed from: a, reason: collision with root package name */
    final boolean f47163a;

    /* renamed from: b, reason: collision with root package name */
    final List f47164b;

    /* renamed from: c, reason: collision with root package name */
    final Collection f47165c;

    /* renamed from: d, reason: collision with root package name */
    final Collection f47166d;

    /* renamed from: e, reason: collision with root package name */
    final int f47167e;

    /* renamed from: f, reason: collision with root package name */
    final iw f47168f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f47169g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f47170h;

    in(List list, Collection collection, Collection collection2, iw iwVar, boolean z, boolean z2, boolean z3, int i2) {
        this.f47164b = list;
        com.google.d.b.an.C(collection, "drainedSubstreams");
        this.f47165c = collection;
        this.f47168f = iwVar;
        this.f47166d = collection2;
        this.f47169g = z;
        this.f47163a = z2;
        this.f47170h = z3;
        this.f47167e = i2;
        com.google.d.b.an.v(!z2 || list == null, "passThrough should imply buffer is null");
        com.google.d.b.an.v((z2 && iwVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        com.google.d.b.an.v(!z2 || (collection.size() == 1 && collection.contains(iwVar)) || (collection.size() == 0 && iwVar.f47187b), "passThrough should imply winningSubstream is drained");
        com.google.d.b.an.v((z && iwVar == null) ? false : true, "cancelled should imply committed");
    }

    final in a(iw iwVar) {
        Collection collectionUnmodifiableCollection;
        boolean z = this.f47170h;
        com.google.d.b.an.v(!z, "hedging frozen");
        iw iwVar2 = this.f47168f;
        com.google.d.b.an.v(iwVar2 == null, "already committed");
        Collection collection = this.f47166d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(iwVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(iwVar);
            collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        return new in(this.f47164b, this.f47165c, collectionUnmodifiableCollection, iwVar2, this.f47169g, this.f47163a, z, this.f47167e + 1);
    }

    final in b() {
        return this.f47170h ? this : new in(this.f47164b, this.f47165c, this.f47166d, this.f47168f, this.f47169g, this.f47163a, true, this.f47167e);
    }

    final in c(iw iwVar) {
        com.google.d.b.an.v(!this.f47163a, "Already passThrough");
        boolean z = iwVar.f47187b;
        Collection collectionUnmodifiableCollection = this.f47165c;
        if (!z) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(iwVar);
            } else {
                ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                arrayList.add(iwVar);
                collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        iw iwVar2 = this.f47168f;
        boolean z2 = iwVar2 != null;
        List list = this.f47164b;
        if (z2) {
            com.google.d.b.an.v(iwVar2 == iwVar, "Another RPC attempt has already committed");
            list = null;
        }
        return new in(list, collection, this.f47166d, iwVar2, this.f47169g, z2, this.f47170h, this.f47167e);
    }
}
