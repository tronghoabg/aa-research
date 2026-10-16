package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aglj extends defpackage.aglf implements defpackage.ahag {
    private final java.lang.Object[] values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aglj(defpackage.ahoj ahojVar, java.lang.Object[] objArr) {
        super(ahojVar, null);
        objArr.getClass();
        this.values = objArr;
    }

    public java.util.List<defpackage.aglf> getElements() {
        java.lang.Object[] objArr = this.values;
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            defpackage.agle agleVar = defpackage.aglf.Factory;
            obj.getClass();
            arrayList.add(agleVar.create(obj, null));
        }
        return arrayList;
    }
}
