package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aclx implements defpackage.aclt {
    public static final defpackage.aclt a = defpackage.aclu.b(java.util.Collections.EMPTY_SET);
    private final java.util.List b;
    private final java.util.List c;

    public aclx(java.util.List list, java.util.List list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.afak, defpackage.afaj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.util.Set a() {
        java.util.List list = this.b;
        int size = list.size();
        java.util.List list2 = this.c;
        java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            java.util.Collection collection = (java.util.Collection) ((defpackage.aclw) list2.get(i)).a();
            size += collection.size();
            arrayList.add(collection);
        }
        java.util.HashSet hashSet = new java.util.HashSet(defpackage.afga.cD(size));
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            java.lang.Object objA = ((defpackage.aclw) list.get(i2)).a();
            objA.getClass();
            hashSet.add(objA);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (java.lang.Object obj : (java.util.Collection) arrayList.get(i3)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return j$.util.DesugarCollections.unmodifiableSet(hashSet);
    }
}
