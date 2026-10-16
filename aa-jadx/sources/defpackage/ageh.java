package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ageh {
    public static final void collectPackageFragmentsOptimizedIfPossible(defpackage.aged agedVar, defpackage.ahof ahofVar, java.util.Collection<defpackage.agec> collection) {
        agedVar.getClass();
        ahofVar.getClass();
        collection.getClass();
        if (agedVar instanceof defpackage.agei) {
            ((defpackage.agei) agedVar).collectPackageFragments(ahofVar, collection);
        } else {
            collection.addAll(agedVar.getPackageFragments(ahofVar));
        }
    }

    public static final boolean isEmpty(defpackage.aged agedVar, defpackage.ahof ahofVar) {
        agedVar.getClass();
        ahofVar.getClass();
        return agedVar instanceof defpackage.agei ? ((defpackage.agei) agedVar).isEmpty(ahofVar) : packageFragments(agedVar, ahofVar).isEmpty();
    }

    public static final java.util.List<defpackage.agec> packageFragments(defpackage.aged agedVar, defpackage.ahof ahofVar) {
        agedVar.getClass();
        ahofVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        collectPackageFragmentsOptimizedIfPossible(agedVar, ahofVar, arrayList);
        return arrayList;
    }
}
