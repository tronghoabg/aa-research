package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ylh extends java.util.AbstractMap.SimpleEntry {
    final /* synthetic */ defpackage.yli a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylh(defpackage.yli yliVar, java.lang.Object obj, java.lang.Object obj2) {
        super(obj, obj2);
        this.a = yliVar;
    }

    @Override // java.util.AbstractMap.SimpleEntry, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        this.a.put(getKey(), obj);
        return super.setValue(obj);
    }
}
