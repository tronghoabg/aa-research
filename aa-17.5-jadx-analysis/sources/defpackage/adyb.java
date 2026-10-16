package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class adyb {
    final boolean a;
    final List b;
    final Collection c;
    final Collection d;
    final int e;
    final adye f;
    final boolean g;
    final boolean h;

    public adyb(List list, Collection collection, Collection collection2, adye adyeVar, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        collection.getClass();
        this.c = collection;
        this.f = adyeVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        woy.aa(!z2 || list == null, "passThrough should imply buffer is null");
        woy.aa((z2 && adyeVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        woy.aa(!z2 || (collection.size() == 1 && collection.contains(adyeVar)) || (collection.size() == 0 && adyeVar.b), "passThrough should imply winningSubstream is drained");
        woy.aa((z && adyeVar == null) ? false : true, "cancelled should imply committed");
    }

    final adyb a(adye adyeVar) {
        Collection collectionUnmodifiableCollection;
        boolean z = this.h;
        woy.aa(!z, "hedging frozen");
        adye adyeVar2 = this.f;
        woy.aa(adyeVar2 == null, "already committed");
        Collection collection = this.d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(adyeVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(adyeVar);
            collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        return new adyb(this.b, this.c, collectionUnmodifiableCollection, adyeVar2, this.g, this.a, z, this.e + 1);
    }

    final adyb b() {
        return this.h ? this : new adyb(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }

    final adyb c(adye adyeVar) {
        woy.aa(!this.a, "Already passThrough");
        boolean z = adyeVar.b;
        Collection collectionUnmodifiableCollection = this.c;
        if (!z) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(adyeVar);
            } else {
                ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                arrayList.add(adyeVar);
                collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        adye adyeVar2 = this.f;
        boolean z2 = adyeVar2 != null;
        List list = this.b;
        if (z2) {
            woy.aa(adyeVar2 == adyeVar, "Another RPC attempt has already committed");
            list = null;
        }
        return new adyb(list, collection, this.d, adyeVar2, this.g, z2, this.h, this.e);
    }
}
