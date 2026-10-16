package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahnr {
    public static final java.util.List<defpackage.ahnf> toExpandedRecordsList(java.util.List<defpackage.ahnf> list) {
        list.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.ensureCapacity(list.size());
        for (defpackage.ahnf ahnfVar : list) {
            int range = ahnfVar.getRange();
            for (int i = 0; i < range; i++) {
                arrayList.add(ahnfVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
