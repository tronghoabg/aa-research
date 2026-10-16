package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adze {
    final boolean a;
    final java.util.List b;
    final java.util.Collection c;
    final java.util.Collection d;
    final int e;
    final defpackage.adzg f;
    final boolean g;
    final boolean h;

    public adze(java.util.List list, java.util.Collection collection, java.util.Collection collection2, defpackage.adzg adzgVar, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        collection.getClass();
        this.c = collection;
        this.f = adzgVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        defpackage.ysr.bk(!z2 || list == null, "passThrough should imply buffer is null");
        defpackage.ysr.bk((z2 && adzgVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        defpackage.ysr.bk(!z2 || (collection.size() == 1 && collection.contains(adzgVar)) || (collection.size() == 0 && adzgVar.b), "passThrough should imply winningSubstream is drained");
        defpackage.ysr.bk((z && adzgVar == null) ? false : true, "cancelled should imply committed");
    }

    final defpackage.adze a(defpackage.adzg adzgVar) {
        java.util.Collection collectionUnmodifiableCollection;
        boolean z = this.h;
        defpackage.ysr.bk(!z, "hedging frozen");
        defpackage.adzg adzgVar2 = this.f;
        defpackage.ysr.bk(adzgVar2 == null, "already committed");
        java.util.Collection collection = this.d;
        if (collection == null) {
            collectionUnmodifiableCollection = java.util.Collections.singleton(adzgVar);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(collection);
            arrayList.add(adzgVar);
            collectionUnmodifiableCollection = j$.util.DesugarCollections.unmodifiableCollection(arrayList);
        }
        return new defpackage.adze(this.b, this.c, collectionUnmodifiableCollection, adzgVar2, this.g, this.a, z, this.e + 1);
    }

    final defpackage.adze b() {
        return this.h ? this : new defpackage.adze(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }

    final defpackage.adze c(defpackage.adzg adzgVar) {
        defpackage.ysr.bk(!this.a, "Already passThrough");
        boolean z = adzgVar.b;
        java.util.Collection collectionUnmodifiableCollection = this.c;
        if (!z) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = java.util.Collections.singletonList(adzgVar);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(collectionUnmodifiableCollection);
                arrayList.add(adzgVar);
                collectionUnmodifiableCollection = j$.util.DesugarCollections.unmodifiableCollection(arrayList);
            }
        }
        java.util.Collection collection = collectionUnmodifiableCollection;
        defpackage.adzg adzgVar2 = this.f;
        boolean z2 = adzgVar2 != null;
        java.util.List list = this.b;
        if (z2) {
            defpackage.ysr.bk(adzgVar2 == adzgVar, "Another RPC attempt has already committed");
            list = null;
        }
        return new defpackage.adze(list, collection, this.d, adzgVar2, this.g, z2, this.h, this.e);
    }
}
